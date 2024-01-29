# testsmartjob_java
api restfull springboot

se debe usar postman aca el archivo con la configuracion

[{
	"info": {
		"_postman_id": "65d74e32-e372-4f12-b6ae-8125b012f5cb",
		"name": "http://localhost:8080/api/v1/usuarios",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json",
		"_exporter_id": "22694216"
	},
	"item": [
		{
			"name": "1",
			"request": {
				"method": "GET",
				"header": [],
				"url": "localhost:8080/api/v1/usuarios"
			},
			"response": []
		},
		{
			"name": "New Request",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"name\":\"smith\",\r\n    \"email\":\"Smith@gmail.com\",\r\n    \"password\":\"123456\",\r\n    \"token\" : \"dhvhd2\"\r\n} ",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "localhost:8080/api/v1/usuarios"
			},
			"response": []
		},
		{
			"name": "New Request",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"name\": \"miguel Angel\",\r\n    \"email\": \"mzmprog@gmail.com\",\r\n    \"password\": \"123456\"\r\n}"
				},
				"url": "localhost:8080/api/v1/usuarios/1"
			},
			"response": []
		},
		{
			"name": "New Request",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": "localhost:8080/api/v1/usuarios"
			},
			"response": []
		}
	]
}]
