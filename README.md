# 🧪 AlMosafer Automation Testing Suite 🌐

Welcome to the **AlMosafer Test Automation Suite**! 🎉  
This project was developed as part of a **QA Automation Internship**, aiming to showcase real-world testing skills using **Java, Selenium, and TestNG**. The website under test is [https://www.almosafer.com](https://www.almosafer.com), a popular travel booking platform in the Middle East.

The goal of this suite is to **automatically verify important UI and functionality aspects** of the site, such as language settings, currency, date fields, and hotel search flows. This helps ensure that key user experiences remain consistent and bug-free – especially across English and Arabic versions of the site.

---

## 📝 Project Description

This testing project simulates a **real user journey** through Almosafer's travel site. It focuses on **UI verification**, **functionality validation**, and **language adaptability**. The test cases are carefully designed to cover:

- **Website configuration defaults** (e.g., English language, SAR currency)
- **Date field accuracy** (e.g., departure is tomorrow, return is day after)
- **Multilingual support**, switching randomly between Arabic and English
- **Hotel search automation**, including dynamic selection of cities based on language
- **Presence of critical UI elements**, like the Qitaf loyalty program logo and customer support number

It uses Selenium WebDriver to interact with the browser and TestNG for structured test execution and assertions.

---

## 🚀 Features Covered

Here's a breakdown of each automated test case:

| ✅ Test Case Description | 🔍 Purpose |
|--------------------------|------------|
| Check default language is **English** | Ensures proper site initialization 🌍 |
| Validate default currency is **SAR** | Checks user-localized financial display 💵 |
| Confirm displayed **customer service number** | Verifies support accessibility 📞 |
| Ensure **Qitaf logo** appears | Confirms brand integration 🔖 |
| Confirm **Hotels tab** is NOT selected | Validates default search category selection 🛏️ |
| Check **departure date** is set to tomorrow | Dynamic calendar validation 📅 |
| Check **return date** is day after tomorrow | Ensures logical booking flow 🔁 |
| **Randomly switch language** and validate | Tests multilingual site adaptability 🔄 |
| Perform full **hotel search** with random inputs | Validates complete search functionality 🔍 |

---

## 🧰 Tech Stack

- 👨‍💻 **Language**: Java
- 🌐 **Automation Tool**: Selenium WebDriver
- 🧪 **Testing Framework**: TestNG
- 🛠️ **Build Tool**: Maven (optional)
- 🧠 **Logic Tools**: Java’s LocalDate, Random, Conditional branching
- 🌍 **Browsers Tested**: Google Chrome (via ChromeDriver)

---

## 📂 Project Structure
