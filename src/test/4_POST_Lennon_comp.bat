

set FILE=4_POST_Lennon_comp


curl -i ^
-H "Accept: application/json" ^
-H "X-HTTP-Method-Override: PUT" ^
-H "Content-Type: application/json" ^
-X POST ^
-d "{\"employeeId\":\"16a596ae-edd3-4847-99fe-c4518e82c86f\",\"salary\":\"8000\",\"effectiveDate\":\"01/01/2020\"}"  ^
http://localhost:8080/employee/compensation/  > %FILE%.txt

type %FILE%.txt
pause
