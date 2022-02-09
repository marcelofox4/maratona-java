package fox.marcelo.maratonajava.javacore.Kenumeracao.test;

import fox.marcelo.maratonajava.javacore.Kenumeracao.domain.Client;
import fox.marcelo.maratonajava.javacore.Kenumeracao.domain.ClientType;
import fox.marcelo.maratonajava.javacore.Kenumeracao.domain.PayType;


public class TestClient01 {
    public static void main(String[] args) {
        Client client1 = new Client("Marcelo", ClientType.PESSOA_FISICA, PayType.DEBITO);
        Client client2 = new Client("Marcelo Store", ClientType.PESSOA_JURIDICA, PayType.CREDITO);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(PayType.DEBITO.calculateDiscount(100));
        System.out.println(PayType.CREDITO.calculateDiscount(100));

        ClientType clientType = ClientType.clientTypeReportName("Pessoa Física");
        System.out.println(clientType);
    }
}
