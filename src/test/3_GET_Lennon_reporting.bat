

set FILE=3_GET_Lennon_reporting
curl -g localhost:8080/employee/reportingstructure/16a596ae-edd3-4847-99fe-c4518e82c86f > %FILE%.txt
type %FILE%.txt
pause
