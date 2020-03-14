

set FILE=4_GET_Lennon_comp
curl -g http://localhost:8080/employee/compensation/16a596ae-edd3-4847-99fe-c4518e82c86f  > %FILE%.txt

type %FILE%.txt
pause
