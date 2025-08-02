class BankAccount {
    private boolean isOpened;
    private int balance;

    void open() throws BankAccountActionInvalidException {
        synchronized (this) {
            if (!isOpened) {
                this.isOpened = true;
            } else {
                throw new BankAccountActionInvalidException("Account already open");
            }
        }
    }

    void close() throws BankAccountActionInvalidException {
        synchronized (this) {
            if (isOpened) {
                this.isOpened = false;
                this.balance = 0;
            } else {
                throw new BankAccountActionInvalidException("Account not open");
            }
        }
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (isOpened) {
            return balance;
        } else {
            throw new BankAccountActionInvalidException("Account closed");
        }
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (isOpened) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
            }
        } else  {
            throw new BankAccountActionInvalidException("Account closed");
        }
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
           if (!isOpened) {
                throw new BankAccountActionInvalidException("Account closed");
            } else if (amount > balance) {
                throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
            } else if (amount < 0) {
                throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
            } else if (isOpened && amount <= balance ) {
                balance -= amount;
            } 
    }


}