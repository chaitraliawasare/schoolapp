#!/bin/bash
echo "\nSetting Up Python-Django Project."
echo ""
echo "Pre-requisites:"
echo "\t1. Internet access to Github domain.\n\t2. apt or yum commands working properly.\n\t3. Unzip tool for linux."
echo "\nFetching E-Commerce Project From Github...\n"
wget https://github.com/samarth-p/College-ERP/archive/refs/heads/master.zip
echo "\nUnzipping the downloaded file..."
unzip master.zip
echo "\nChanging Directory..."
cd College-ERP-master
echo "\nInstalling pip3..."
sudo yum install python3-pip -y
echo "\nInstalling project dependencies..."
pip3 install -r requirements.txt
