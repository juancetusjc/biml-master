# biml-master
Master del CRUD, repositorio principal para almacenar información del maestros
Service List:
curl http://localhost:8080/v1/list
Service Create:

curl -d '{"id":"001", "name":"Rol"}' -H "Content-Type: application/json" -X POST http://localhost:8080/create