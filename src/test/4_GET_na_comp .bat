

set FILE=4_GET_na_comp
curl -g http://localhost:8080/employee/compensation/16a596ae-edd3  > %FILE%.txt

type %FILE%.txt
pause
