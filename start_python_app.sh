#!/bin/bash
cd /var/jenkins/workspace/Web_App_1/College-ERP-master
pip3 install -r requirements.txt
python3 manage.py runserver 0:8000 &
sleep 30
