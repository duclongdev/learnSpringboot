### Họ và tên: Nguyễn Đức Long

### MSSV: 20521566

#### 1. Tạo một Config Server sử dụng git remote, gồm 3 file:

- link: https://github.com/duclongdev/config-repositories

#### 2 Tạo Eureka để làm máy chủ quản lý các service, Port là 8761

- url: http://localhost:8761/

#### 3. Tạo Currency Exchange Server dùng để lấy tỉ giá tiền tệ, Port 8000

- Thêm dữ liệu:
  |id | currency_from | currency_to | conversion_multiple | port|
  |----|---------------|-------------|---------------------|------
  |1 | USD | VND | 23300 | 0|
  |2 | EUR | VND | 23800 | 0|
- url: http://localhost:8765/api/currencyExchange/USD
- Kết quả:

```json
23300
```

- Tạo một instance với port là 8001
- Đăng ký cả 2 instance với Eureka Server

#### 4. Tạo Currency Calculation Service thực hiện tính toán, Port là 8100

- uri: http://localhost:8765/api/calculated/from/USD/to/VND/amount/10
| from | to  | amount |
  | ---- | --- | ------ |
  | USD  | VND | 10     |
- Kết quả:

```json
{
  "conversionMultiple": 23300,
  "quantity": 10,
  "totalCalculatedAmount": 233000,
  "port": "8100"
}
```
- Tạo một instance với port là 8101, đăng ký cả 2 với **Eureka Server**
#### 5. Tạo gateway với port là 8765, đăng ký tới Eureka
- Cài đặt Currency Exchange Service vào gateway

