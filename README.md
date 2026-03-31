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
(Add your screenshots here if needed)
