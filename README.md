
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

```
📦 src
 ┣ 📂 Tests
 ┃ ┣ 📜 AlMosaferTest.java    # Main test suite with all TestNG test methods
 ┃ ┗ 📜 TestData.java         # Class containing reusable test data & randomization logic
```

- `AlMosaferTest.java` – Contains organized test methods using TestNG annotations like `@Test`, `@BeforeMethod`, `@AfterMethod`.
- `TestData.java` – Stores reusable language options, city names, expected values, and logic to select random elements.

---

## 🔧 How to Run the Tests

1. **Clone the repo**:
   ```bash
   git clone https://github.com/your-username/almosafer-test-suite.git
   cd almosafer-test-suite
   ```

2. **Open in your IDE** (e.g., IntelliJ IDEA or Eclipse)

3. **Ensure Java, TestNG, and Selenium are set up**

4. **Update ChromeDriver path** if needed

5. **Run Tests**:
   - Right-click `AlMosaferTest.java` → Run as TestNG Suite
   - Or use Maven:
     ```bash
     mvn test
     ```

---

## 💡 Design Highlights

- 🧠 **Smart Date Handling**: Uses `LocalDate.now().plusDays(1)` and `plusDays(2)` to always get valid dynamic dates.
- 🔁 **Randomization**: Language and hotel city are chosen randomly for every run to simulate diverse user scenarios.
- 🔍 **Language Sensitivity**: The script adapts hotel search input based on the current language (e.g., “Dubai” in English vs. “دبي” in Arabic).
- 📏 **Assertions**: All validations use `Assert.assertEquals` or `Assert.assertTrue` from TestNG.
- ♻️ **Reusable Data**: Centralized constants in `TestData.java` reduce redundancy and make the suite easier to maintain.

---

## 📸 Screenshots (Optional Enhancement)

You can enhance test reports by integrating:
- **Screenshot capture on failure** using Selenium's `TakesScreenshot` interface
- **Allure Reports** for beautiful test visualization and logs

---

## 🤝 Contributions

Want to improve the project or add more test cases?

- Fork it 🍴  
- Create your branch 🛠️  
- Push your code 🚀  
- Submit a pull request ✅

---

## 📜 License

This project is licensed under the MIT License – feel free to use, share, and contribute!

---

## 📬 Contact

👤 **Author**: Malek Arafeh  
📧 Email: [malekarafeh2@gmail.com](mailto:malekarafeh2@gmail.com)  
🌐 LinkedIn: [linkedin.com/in/malekarafeh](https://www.linkedin.com/in/malekarafeh)

---

## 🌟 Show Your Support

If you found this project helpful, don’t forget to ⭐ the repo!

Thanks for visiting – happy testing! 🎯🧪🚀
