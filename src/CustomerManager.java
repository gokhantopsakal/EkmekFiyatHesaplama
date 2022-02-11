import java.util.Scanner;

public class CustomerManager
{
    BaseShopCalculatorManager baseShopCalculatorManager;
    Scanner scanner =new Scanner(System.in);
    void doTheShopping()
    {
        System.out.println("--------------\n-> Ekmek Hesaplaması \n---------------");
        System.out.println("Kaç Ekmek Alacaksınız");
        int x = scanner.nextInt();
        System.out.println("Ekmek Fiyatı: "+baseShopCalculatorManager.breadBuy(x)/x +"TL");
        System.out.println("Almı olduğunuz +"+ x +"ekmek için ödenyeceğiniz Fiyat");
        System.out.println(baseShopCalculatorManager.breadBuy(x)+" TL");
        System.out.println("----------------------------");
    }
}
