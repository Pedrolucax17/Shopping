import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limitCard = sc.nextDouble();

        CreditCard creditCard = new CreditCard(limitCard);

        int continueOrno = 1;

        while(continueOrno != 0){
            System.out.println("Digite a descrição da compra");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.println("Digite o valor da compra:");
            double priceProduct = sc.nextDouble();

            Shopping shopping = new Shopping(nameProduct, priceProduct);

           boolean purchaseMade = creditCard.addShopping(shopping);;



            if(purchaseMade){
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair e 1 para continuar comprando");
                continueOrno = sc.nextInt();
            }else{
                System.out.println("Saldo insuficiente");
                continueOrno = 0;
            }

        }

        System.out.println("**********************************************************");

        System.out.println("Compras realizadas: ");

        Collections.sort(creditCard.getShoppings());

        for(Shopping c : creditCard.getShoppings()){
            System.out.println(c.getNameProduct() + " - " + c.getPrice());
        }

        System.out.println("**********************************************************");

        System.out.println("Saldo disponível = " + creditCard.getBalance());
    }
}