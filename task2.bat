echo off


echo.
echo.
echo Verify that the application returns an employee
echo.
curl -g http://localhost:8080/employee/16a596ae-edd3-4847-99fe-c4518e82c86f

echo.
echo.
echo Verify that the Compensation Structure is created for an employee
echo.
curl -H "Accept: application/json" -H "X-HTTP-Method-Override: PUT" -H "Content-Type: application/json" -X POST ^
-d "{\"employeeId\":\"16a596ae-edd3-4847-99fe-c4518e82c86f\",\"salary\":\"8000\",\"effectiveDate\":\"01/01/2020\"}"  ^
http://localhost:8080/employee/compensation/

echo.
echo.
echo Verify that the Compensation Structure is returnd for that employee
echo.
curl -g http://localhost:8080/employee/compensation/16a596ae-edd3-4847-99fe-c4518e82c86f

echo.
echo.
pause