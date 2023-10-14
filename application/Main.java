package application;

import entities.Carro;
import entities.Moto;

public class Main {
    public static void main(String[] args) {

        // Baseado no modelo mais atual de HB20
        // Com 4 rodas valendo 85.590 do ano de compra sendo 2018 e o ano atual 2023 com 4 portas
        Carro HB20 = new Carro(4,85.590,2018,2023,4);

        // Baseado no modelo de moto mais atual de uma XJ6
        // Com 2 rodas , valendo 35.490 reais , do ano de 2015 e possuindo 600 cilindradas
        Moto XJ6 = new Moto(2,35.490,2015,2023,600);

        System.out.print(HB20);
        System.out.println("=======================");
        System.out.print(XJ6);

        System.out.println("=======================");
        System.out.print("Valor de venda do HB20: "+HB20.valorVenda());
        System.out.print("\nValor de venda da XJ6: "+XJ6.valorVenda());

    }
}