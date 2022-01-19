#!/bin/bash
echo "\nStarting the application on http://[vm-ip]:8000"
pwd
echo "After pw"
cd /home/user1/school/College-ERP-master
echo "After change dir"
python3 manage.py runserver 0:8000

