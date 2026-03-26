# 🚀 AdManagerSystem

A Java console-based application for managing advertisements, advertisers, and products.
This project demonstrates Object-Oriented Programming (OOP) concepts through a real-world advertising system.

---

## ✨ Features

* 📢 Manage **advertisers (carriers)**
* 🧩 Manage **advertisement types**

  * Internet
  * Media (TV/Radio)
  * Printed press
* 📝 Create and store advertisements
* 🔍 View and filter advertisements
* 💰 Calculate:

  * Total cost per advertiser
  * Total cost per product
  * Cost for all products
* 📊 Count advertisements per product

---

## 🧠 Technologies

* Java
* Object-Oriented Programming (OOP)
* ArrayList (in-memory data storage)
* Console-based interface

---

## 🏗️ Project Structure

```
mainApp.java                → Main application (menu & logic)

AdType.java                → Base class for ad types
internet.java              → Internet ad type
media.java                 → Media ad type
printed.java               → Printed ad type

advertisement.java         → Base class for advertisements
advertisement_internet.java
advertisement_media.java
advertisement_printed.java

ads_list.java              → Advertisement management
ad_type_list.java          → Ad type management
product_list.java          → Product management
advertizer_list.java       → Advertiser management
```

---

## ▶️ How to Run

### 🔹 Option 1: Terminal

Compile:

```bash
javac *.java
```

Run:

```bash
java mainApp
```

---

### 🔹 Option 2: VS Code (Recommended for beginners)

1. Open the project folder in **Visual Studio Code**
2. Install **Java Extension Pack** (if not installed)
3. Open `mainApp.java`
4. Click **▶ Run** (top right)

The program will run in the built-in terminal.

---

## 🧾 Example Menu

```
1. Add new advertisment carrier
2. Add new advertisment type
3. Add new advertisment
4. Show advertisments
5. Show specific carrier advertisments
6. Calculate specific carrier advertisment cost
7. Show number of advertisments per product
8. Calculate specific product advertising cost
9. Show advertisment cost per product
10. End program
```

---

## ⚙️ Notes

* All data is stored in memory (no database)
* Input must follow the expected format
* Designed as a **learning project for OOP**

---

## 📈 Future Improvements

* ✅ Input validation
* 🔄 Replace strings with enums
* 🗄️ Add database support
* 🖥️ Build GUI (JavaFX / Swing)
* 🧪 Add unit tests

---

## 👨‍💻 Author

Spyrou Agamemnon-Ioannis

---

## 📄 License

This project is for educational purposes.
