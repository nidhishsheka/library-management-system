# Library Management System (Java)

# Description
This is a simple Library Management System implemented in Java.  
It allows users to:
- Add new books (title, author, ISBN)
- Issue and return books
- Track availability of books
- Run unit tests with JUnit 5

---

# Setup
1. Clone this repository:
   ```bash
   git clone https://github.com/nidhishsheka/library-management-system.git
   cd library-management-system
   
2. Make sure Java is installed

   Check your version:
   ```bash
   java -version

 You should have Java 8 or later.

3. Compile the project:
   ```bash
   javac *.java


# Usage

Run the program:
      ```bash
      
      java Main



Expected output:

      true
      false
      true

This shows:

The book is initially available (true)

After issuing, it becomes unavailable (false)

After returning, it becomes available again (true)


# Running Tests
    
    mvn test

OR

Open LibraryTest.java in your IDE (IntelliJ, Eclipse, or VS Code)
and run the JUnit tests.


# Project Structure

    .
    ├── Issueable.java        # Interface for issue/return/availability
    ├── A_book.java           # Base book class
    ├── Lib_book.java         # Library book implementing Issueable
    ├── Library.java          # Library management system
    ├── Main.java             # Demo program
    ├── LibraryTest.java      # Unit tests (JUnit 5)
    └── README.md             # Project documentation

# Author

nidhishsheka

