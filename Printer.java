public class Printer {
    private int tonerLevel = 0;
    private int numberOfPage = 0;
    private boolean isDuplex;

    public void fillToner(int amount){
        if (this.tonerLevel == 0) {
            if (amount > 100) {
                System.out.println("current toner leve is " + this.tonerLevel );
                System.out.println("You are trying to add : " + amount);
                this.tonerLevel = 100;
                System.out.println("You trying to over fill the toner. it is set to defaut : " + this.tonerLevel);
            } else {
                System.out.println("current toner leve is " + this.tonerLevel );
                System.out.println("You are trying to add : " + amount);
                System.out.println("The toner is filled to " + amount);
                this.tonerLevel = amount;
            }
        } else {
            if (this.tonerLevel + amount > 100) {
                System.out.println("current toner leve is " + this.tonerLevel );
                System.out.println("You are trying to add : " + amount);
                this.tonerLevel = 100;
                System.out.println("You trying to over fill the toner. it is set to defaut : " + this.tonerLevel);
            } else {
                System.out.println("current toner leve is " + this.tonerLevel );
                System.out.println("You are trying to add : " + amount);
                this.tonerLevel += amount;
                System.out.println("The toner is filled to   " + this.tonerLevel);
            }
        }
    }

    public void printPage(int number, boolean duplux){

        if (duplux) {
            System.out.println("Printing in duplux mode");
            System.out.println("You have just printed " + number/2 + " pages");
            this.numberOfPage += (number/2); 
            System.out.println("the total number of pages the printer has printed so far is " + this.numberOfPage);
        } else {
            System.out.println("You have just printed " + number + " pages");
            this.numberOfPage += number; 
            System.out.println("the total number of pages the printer has printed so far is " + this.numberOfPage);
        }
    }


}
