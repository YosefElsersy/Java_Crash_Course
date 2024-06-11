public class Bank {
    
    public static void print(Object message){
        System.out.println(message);
    }

    public class Account{
        private int accountNo;
        private String name;
        private double amount;

        public void insert(int a , String n, double amt){
            this.amount = amt;
            this.name = n;
            this.accountNo = a;
        }
        
        public void deposit( double amt){
            this.amount += amt;
            print(amt + " Deposited");
        }

        public void withDraw(double amt){
            if (amount <= amt) {
                print("Insufficient Balance");
            }else{
                this.amount -= amt;
                print(amt + " Withdrawn");
            }
            
        }
        public void checkBalance(){
            print("Balance = " + this.amount);
        }
        public String toString(){
            return "Account {" + " , Account Number = " + accountNo + "Account Name = " + name + ", Balance = "+ amount +  "}";
        }
    }
    public static void main(String[] args){
        Bank bank = new Bank();
        Bank.Account a1 = bank.new Account();
        Bank.Account a2 = bank.new Account();

        print("========================================\n");

        a1.insert(58567842,"Yosef Elsersy",3000);
        a1.deposit(1500);
        a1.withDraw(5000);
        a1.checkBalance();
        print(a1.toString());

        print("========================================\n");

        a2.insert(5685878,"Ali Adam", 2000);
        a2.deposit(500);
        a2.withDraw(1500);
        a2.checkBalance();
        print(a2.toString());

        print("========================================\n");
        a2.insert(66528466, "Mostafa Kamel", 600);
        a2.deposit(800);
        a2.withDraw(200);
        a2.checkBalance();
        print(a2.toString());
        print("========================================\n");
    }
}
