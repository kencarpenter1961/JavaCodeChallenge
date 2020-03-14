

set FILE=2_GET_Lennon
curl -g localhost:8080/employee/16a596ae-edd3-4847-99fe-c4518e82c86f > %FILE%.txt
type %FILE%.txt
pause