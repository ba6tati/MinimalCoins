# MinimalCoins
A Java program that takes a user input in USD and represents the price using the minimum number of coins possible.

## Features

- Takes user input for the amount in USD.
- Validates the input to ensure it is a positive numeric value.
- Calculates the minimum number of coins (quarters, dimes, nickels, half dollars and pennies) required to represent the amount.
- Provides a clear and user-friendly output.

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A text editor or an Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

### Installing

1. **Clone the repository:**

    ```bash
    git clone https://github.com/ba6tati/MinimalCoins.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd MinimalCoins/src
    ```

3. **Compile the Java program:**

    ```bash
    javac Main.java
    ```

4. **Run the Java program:**

    ```bash
    java Main
    ```

## Usage

1. Run the program.
2. When prompted, enter the amount in USD.
3. The program will output the amount entered and the minimum number of each coin needed to make that amount.

## Example

```plaintext
Enter the amount in USD: 
5.98
The 5.98 USD can be represented like that:
Pennies (100): 5
Half dollars (50): 1
Quarters (25): 1
Dimes (10): 2
The amount left is 0.03 USD.
