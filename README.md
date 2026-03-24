# 💸 Expense Manager (Full Stack Web App)

A full-stack expense management application that allows users to track, manage, and visualize their daily expenses with secure authentication.

---

## 🚀 Live Demo

🌐 Frontend: https://your-netlify-link  
⚙️ Backend API: https://your-railway-link  

---

## ✨ Features

- 🔐 User Authentication (Signup/Login with encrypted passwords)
- 📊 Track personal expenses (Add, Delete, View)
- 👤 User-specific data isolation (each user sees only their data)
- 📈 Category-wise expense visualization using charts
- 💡 Real-time total expense calculation
- 📱 Responsive and clean UI design

---

## 🛠️ Tech Stack

**Frontend**
- HTML
- CSS
- JavaScript
- Chart.js

**Backend**
- Java
- Spring Boot
- REST APIs

**Database**
- MySQL

**Deployment**
- Railway (Backend)
- Netlify (Frontend)

---


---

## ⚙️ API Endpoints

### Auth
- `POST /auth/signup`
- `POST /auth/login`

### Expenses
- `POST /expenses/{userId}` → Add expense
- `GET /expenses/{userId}` → Get user expenses
- `DELETE /expenses/{id}` → Delete expense
- `GET /expenses/total/{userId}` → Total expenses

---

## 🔐 Authentication Logic

- Passwords are encrypted using Spring Security (BCrypt)
- Login validates user credentials securely
- User ID is stored in browser (localStorage) for session tracking

---

## 📊 Data Visualization

- Implemented using Chart.js
- Displays category-wise spending distribution
- Updates dynamically with user data

---

## 🚀 Future Improvements

- Budget tracking & alerts
- Monthly/weekly analytics dashboard
-Exports pdfs monthly
- AI-based expense categorization

---

## 👩‍💻 Author

**N.Abhigna Reddy**  
GitHub: https://github.com/AbhignaReddy10 

---

## ⭐ If you like this project, give it a star!
