package fox.marcelo.maratonajava.javacore.Kenumeracao.domain;

public class Client {

    private String name;
    private ClientType clientType;
    private PayType payType;

    public Client(String name, ClientType clientType, PayType payType) {
        this.name = name;
        this.clientType = clientType;
        this.payType = payType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getReportName() +
                ", clientTypeInt=" + clientType.getValue() +
                ", payType=" + payType +
                '}';
    }
}
