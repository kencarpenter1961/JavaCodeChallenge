

set FILE=3_GET_Paul_reporting
curl -g localhost:8080/employee/reportingstructure/b7839309-3348-463b-a7e3-5de1c168beb3 > %FILE%.txt
type %FILE%.txt
pause