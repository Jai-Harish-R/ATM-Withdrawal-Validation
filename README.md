# ATM Transaction System

## Description

The ATM Transaction System is a simple Java console application that simulates a basic ATM withdrawal process. The application validates the user's PIN, ensures that all PIN digits are unique, checks the available account balance, and processes the withdrawal request accordingly.

## Features

- Accepts account number input.
- Validates a 4-digit ATM PIN.
- Ensures the PIN contains four unique digits.
- Checks available account balance.
- Allows cash withdrawal if sufficient balance exists.
- Displays transaction success or rejection messages.

## Technologies Used

- Java
- Scanner Class
- Arrays
- Loops
- Conditional Statements (`if-else`)

## Validation Rules

| Validation | Requirement |
|------------|-------------|
| PIN Length | Exactly 4 digits |
| PIN Digits | All digits must be unique |
| Balance Check | Withdrawal amount must not exceed available balance |

## How It Works

1. Enter the account number.
2. Enter a 4-digit ATM PIN.
3. The application verifies that:
   - The PIN contains exactly four digits.
   - All digits in the PIN are unique.
4. Enter the withdrawal amount.
5. If the account has sufficient balance, the transaction is successful.
6. Otherwise, the transaction is rejected.

## Sample Output

### Successful Transaction

```text
Enter the account Number : 12345678
Enter the 4 digit Pin : 1234
Enter the amount to be withdraw : 500

Transaction Success
```

### Invalid PIN

```text
Enter the account Number : 12345678
Enter the 4 digit Pin : 1111

PIN should contain unique digits.
Transaction Rejected
```

### Insufficient Balance

```text
Enter the account Number : 12345678
Enter the 4 digit Pin : 1234
Enter the amount to be withdraw : 1500

Insufficient Balance
Transaction Rejected
```

## Project Structure

```text
ATM-Transaction-System/
│
├── Atm.java
├── README.md
└── LICENSE
```

## Future Improvements

- Store multiple customer accounts.
- Authenticate account number and PIN using a database.
- Support deposit and balance inquiry.
- Display remaining account balance after withdrawal.
- Maintain transaction history.

## Author

**Jai Harish**