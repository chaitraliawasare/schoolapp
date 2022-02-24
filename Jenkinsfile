pipeline{
    agent {label 'Slave-1'}
    // environment {
    //     PATH = "$PATH:/usr/share/maven/bin"
    // }
    stages{
      stage('GetCode'){
            steps{
                echo 'Pulling... ' + env.GIT_BRANCH
                git 'https://github.com/chaitraliawasare/schoolapp.git'
            }
         }    
        stage('SonarQube analysis') {
            //def scannerHome = tool 'SonarScanner 4.0';
            steps{
                //withSonarQubeEnv('sonarqube-8.9.3') { 
            // If you have configured more than one global server connection, you can specify its name
                //sh "${scannerHome}/bin/sonar-scanner"
                // sh "cd /home/jenkins/workspace/School_App"
                //dir("/home/jenkins/workspace/School_App"){
                    //sh "sonar-scanner -X"
                    //sh "cd /home/jenkins/workspace/School_App"
                   
                    sh "pwd"
                    //sh "sonar-scanner -X"
                    //sh "~/sonar-scanner-4.6.2.2472-linux/bin/sonar-scanner -X"
                    sh "/var/jenkins/sonar-scanner-4.6.2.2472-linux/bin/sonar-scanner -X"
                //}
                
                //}
            }
        }

        stage('Build DB_OBJs'){
                    steps{
                        script{
                            def remote = [:]
                             remote.name = 'Slave-1'
                            remote.host = '172.168.1.150'
                            remote.user = 'liquibase'
                            remote.password = 'liquibase'
                             remote.allowAnyHosts = true
                             sshCommand remote: remote, command: "rm -rf schoolapp/"   
                             sshCommand remote: remote, command: "git clone https://github.com/chaitraliawasare/schoolapp.git"
                             sshPut remote: remote, from: '/home/liquibase/schoolapp/dbchangelog.sql', into: '/home/liquibase'
                        }
                    }    
             }
      stage('Liquibase'){
                    steps{
                      script{
                          def remote = [:]
                          remote.name = 'Slave-1'
                          remote.host = '172.168.1.150'
                          remote.user = 'liquibase'
                          remote.password = 'liquibase'
                          remote.allowAnyHosts = true
                          //stage('Remote SSH') {
                            sshCommand remote: remote, command: "liquibase update"
                            //sshCommand remote: remote, command: "for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done"
                         // }
                    }
             }
        }
        stage('Create Image'){
            steps{
                sh 'pwd'
                sh 'docker build -t school_app .' 
            }
            
        }
        /*stage("Get Image vulnerability") {
            steps {
                getImageVulnsFromQualys imageIds: 'school_app', useGlobalConfig: true
            }
        }*/
        stage('Push into Artifactory'){
             steps{
              sh 'docker login -u admin -p Poctcs123 65.1.196.36:8082'
              sh 'docker tag school_app:latest 65.1.196.36:8082/python_school_app/python_school_app:v1.0'
              sh 'docker push 65.1.196.36:8082/python_school_app/python_school_app:v1.0'
              //sh 'docker run -d -p 8081:8080 java_emp_mgmt_jenkins_jfrog:latest'
             }
        }
        // stage('Remove Image from Local Machine'){
        //     steps{
        //         sh 'docker rmi java_emp_mgmt_jenkins_jfrog:latest'
        //         sh 'docker rmi 3.108.194.9:8082/jenkins_java_project/java_emp_mgmt_jenkins_jfrog:v1.0'
               
        //     }
        // }
       
    }
}
