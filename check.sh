#!/bin/sh

#cd /var/jenkins/workspace/Build_Web_App_1/College-ERP-master
#pip3 install -r requirements.txt

a= pgrep -f '/usr/bin/python3 manage.py runserver 0:8000'
echo $a
$b=0
$c=$a+$b

if [ "$c" = "0" ]
then
   echo "Not Running"
else
   echo "Running"
fi
