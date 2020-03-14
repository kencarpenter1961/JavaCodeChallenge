

set FILE=2_GET_ken
curl -g localhost:8080/employee/65f580d0-eb54-45f6-afe0-5b1e1249caab > %FILE%.txt
type %FILE%.txt
pause