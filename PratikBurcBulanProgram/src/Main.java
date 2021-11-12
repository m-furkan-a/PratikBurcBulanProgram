import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int day,month;
	    String burclar = "";
        boolean IsError = false;

	    System.out.print("Doğduğunuz Gün : ");
	    day = input.nextInt();
        System.out.print("Doğduğunuz Ay : ");
	    month = input.nextInt();

	    if (month==1)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "oğlak";
                } else {
                    burclar = "kova";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==2)
        {
            if (day >= 1 && day <=28) {
                if (day <= 21) {
                    burclar = "kova";
                } else {
                    burclar = "balık";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==3)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "balık";
                } else {
                    burclar = "koç";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==4)
        {
            if (day >= 1 && day <=30) {
                if (day <= 21) {
                    burclar = "koç";
                } else {
                    burclar = "boğa";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==5)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "boğa";
                } else {
                    burclar = "ikizler";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==6)
        {
            if (day >= 1 && day <=30) {
                if (day <= 21) {
                    burclar = "ikizler";
                } else {
                    burclar = "yengeç";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==7)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "yengeç";
                } else {
                    burclar = "aslan";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==8)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "aslan";
                } else {
                    burclar = "başak";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==9)
        {
            if (day >= 1 && day <=30) {
                if (day <= 21) {
                    burclar = "başak";
                } else {
                    burclar = "terazi";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==10)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "terazi";
                } else {
                    burclar = "akrep";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==11)
        {
            if (day >= 1 && day <=30) {
                if (day <= 21) {
                    burclar = "akrep";
                } else {
                    burclar = "yay";
                }
            }
            else {
                IsError = true;
            }
        }
        if (month==12)
        {
            if (day >= 1 && day <=31) {
                if (day <= 21) {
                    burclar = "yay";
                } else {
                    burclar = "oğlak";
                }
            }
            else {
                IsError = true;
            }
        }

        if (month<1 || month>12)
            IsError=true;

        if (IsError==true){
            System.out.print("Hatalı Giriş.Tekrar Dene...");
        }
        else{
            System.out.print("Burcunuz : " + burclar);
        }

    }
}
