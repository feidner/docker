#!/usr/bin/env bash
echo "apache"
/usr/sbin/apache2ctl start
status=$?
if [ $status -ne 0 ]; then
  echo "Failed to start my_first_process: $status"
  exit $status
fi

echo "tomcat"
/usr/local/tomcat/bin/startup.sh

echo "spring"
java -jar spring.jar

