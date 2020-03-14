

set FILE=1_POST_ken

curl -i ^
-H "Accept: application/json" ^
-H "X-HTTP-Method-Override: PUT" ^
-H "Content-Type: application/json" ^
-X POST ^
-d "{\"firstName\":\"ken\",\"lastName\":\"carpenter\",\"position\":\"pos\",\"department\":\"dept\"}" ^
http://localhost:8080/employee  > %FILE%.txt

type %FILE%.txt
pause



