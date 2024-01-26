# Employee Salary Analysis

This Java application reads employee data from a CSV file, performs salary analysis, and displays results based on user input.

## Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/employee-salary-analysis.git
   cd employee-salary-analysis
   ```

2. **Build and Run:**
    - Use an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse to open and build the project. Alternatively, you can use command-line tools to compile and run the Java program.
    - Make sure you have Java installed on your machine.

3. **Run the Application:**
    - Execute the `Program` class, which contains the main method.
    - Enter the full file path when prompted.
    - Follow the instructions to input salary, a letter, and observe the results.

## Usage

- The application reads employee data from a CSV file. Ensure that your CSV file follows the format: `Name,Email,Salary`.
- You will be prompted to enter the full file path and the salary threshold for filtering employees.
- Additionally, you can input a letter to filter employees whose names start with that letter.

## Features

- Salary Analysis: Displays the email addresses of employees with salaries greater than or equal to the specified threshold.
- Letter Filter: Shows the total salary of employees whose names start with a given letter.

## Examples

1. **Salary Analysis:**
   ```
   Enter full file path: path/to/employee_data.csv
   Enter the salary: 3000.00
   ```

2. **Letter Filter:**
   ```
   Type one letter: M
   ```

## Error Handling

- The application handles IOExceptions that may occur during file reading.
- If no employees are found for a specific letter filter, a corresponding message will be displayed.

