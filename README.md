# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Description
This project is a simple REST API built using Spring Boot that simulates a WhatsApp chatbot backend. It receives messages and returns predefined responses.

## 🚀 Features
- Accepts POST requests at `/webhook`
- Takes JSON input
- Returns predefined replies
- Logs incoming messages

## 🛠 Tech Stack
- Java
- Spring Boot
- Maven

## 🔗 API Endpoint
POST /webhook

### Sample Request:
{
  "message": "hi"
}

### Sample Response:
{
  "reply": "Hello"
}

## ▶️ How to Run
1. Clone the repository
2. Open in VS Code
3. Run:
   mvnw.cmd spring-boot:run
4. Test using Postman

## 📸 Demo
![WhatsApp Image 2026-03-31 at 12 44 24 PM](https://github.com/user-attachments/assets/b28d730f-2f84-4e1e-8e3b-333700f73cb7)


![WhatsApp Image 2026-03-31 at 12 41 23 PM](https://github.com/user-attachments/assets/32f7400d-450a-455f-b167-63ac5430b4a0)
