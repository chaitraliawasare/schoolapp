#!/bin/bash
echo "\nStarting the application on http://[vm-ip]:8000"
cd College-ERP-master
python3 manage.py runserver 0:8000

