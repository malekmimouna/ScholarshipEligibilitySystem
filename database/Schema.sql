-- Create database
CREATE DATABASE IF NOT EXISTS scholarship_db;

-- Use the created database
USE scholarship_db;

-- Table for storing student information
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,       -- Student ID (Primary Key)
    name VARCHAR(100) NOT NULL,               -- Student's full name
    age INT NOT NULL,                         -- Student's age
    sex VARCHAR(10) NOT NULL,                 -- Student's sex (e.g., Male, Female)
    address VARCHAR(255) NOT NULL,            -- Student's address
    gpa DECIMAL(3, 2) NOT NULL,               -- Student's GPA (out of 4.0)
    family_income INT NOT NULL                -- Family income (used for scholarship eligibility)
);

-- Table for storing scholarship information
CREATE TABLE IF NOT EXISTS scholarships (
    id INT AUTO_INCREMENT PRIMARY KEY,       -- Scholarship ID (Primary Key)
    name VARCHAR(100) NOT NULL,               -- Scholarship name
    description TEXT NOT NULL,                -- Scholarship description
    maxAmount INT NOT NULL,                   -- Maximum amount of the scholarship
    totalAmount INT NOT NULL,                 -- Total number of scholarships available
    minGpa DECIMAL(3, 2) NOT NULL,            -- Minimum GPA required to apply
    maxIncome INT NOT NULL                    -- Maximum income threshold
