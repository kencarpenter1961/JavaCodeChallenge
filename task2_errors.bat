echo off

echo.
echo.
echo Verify that the an error is returned for a invalid compensation request, invalid employee id
echo.
curl -H "Accept: application/json" -H "X-HTTP-Method-Override: PUT" -H "Content-Type: application/json" -X POST ^
-d "{\"employeeId\":\"16a596ae-ed\",\"salary\":\"8000\",\"effectiveDate\":\"01/01/2020\"}"  ^
http://localhost:8080/employee/compensation/

echo.
echo.
echo Verify that the an error is returned for a invalid compensation request, invalid salary
echo.
curl -H "Accept: application/json" -H "X-HTTP-Method-Override: PUT" -H "Content-Type: application/json" -X POST ^
-d "{\"employeeId\":\"16a596ae-edd3-4847-99fe-c4518e82c86f\",\"salary\":\"abc\",\"effectiveDate\":\"01/01/2020\"}"  ^
http://localhost:8080/employee/compensation/

echo.
echo.
echo Verify that an error is returned for an employee who does not have a Compensation Structure 
echo.
curl -g http://localhost:8080/employee/compensation/b7839309-3348-463b-a7e3-5de1c168beb3

echo.
echo.
pause