echo off


echo.
echo.
echo Verify that the application returns an employee
echo.
curl -g localhost:8080/employee/16a596ae-edd3-4847-99fe-c4518e82c86f

echo.
echo.
echo Verify that the Reporting Structure is returned for a valid employee
echo.
curl -g localhost:8080/employee/reportingstructure/16a596ae-edd3-4847-99fe-c4518e82c86f

echo.
echo.
echo Verify that the an error is returned for a invalid employee
echo.
curl -g localhost:8080/employee/reportingstructure/16a596ae






echo.
echo.
pause