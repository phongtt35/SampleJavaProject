### Khung project mẫu, gồm:
- view: Chứa giao diện hiển thị
- service: Xử lý logic
- repository: Xử lý dữ liệu và kết nối đến CSDL
- model: Các class mô hình dữ liệu
- entity: Các class ánh xạ tương ứng với thực thể trong CSDL

### Lập trình qua Interface:
- View <-> IService
- Service <-> IRepository

### Sử dụng ORM:
- ProductRepository - Hibernate
- CategoryRepository - JPA

Migrator: Tạo CSDL với dữ liệu mẫu
