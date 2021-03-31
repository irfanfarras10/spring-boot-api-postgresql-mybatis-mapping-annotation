# Example REST API Spring Boot + PostgreSQL + MyBatis + Swagger
**Swagger URL : localhost:8080/swagger-ui.html**
 **Endpoint URL :**
 - GET : localhost:8080/employees (Mendapatkan semu data employee)
 - GET : localhost:8080/employee/{id} (Mencari data employee berdasarkan id)
 - POST : localhost:8080/employee/insert (Memasukkan data employee) (body format = "application/json")
- DELETE : localhost:8080/employee/{id}/delete (Menghapus data employee berdasarkan id)
- PUT : localhost:8080/employee/{id}/update (Mengupdate data employee berdasarkan id) (body format = "application/json")
> Sebelum dijalankan, silahkan sesuaikan konfigurasi database di dalam application.properties
