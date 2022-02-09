package fox.marcelo.maratonajava.javacore.Kenumeracao.domain;

public enum ClientType {

    // Todos os atributos criados na Enumeração são constantes.
    // Com a Enumeração é posspivel forçar o tipo de dado. Ou é PESSOA_FISICA ou PESSOA_JURIDICA.

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    // Atribuindo valor para as Enumerações.
    private int value;
    private String reportName;

    // Para esse tipo de atribuição é necessário a criação do construtor que será chamado pela Enumeração.
    ClientType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    // Método que retorna a Enumeração de acorodo com o atributo de reportName.
    public static ClientType clientTypeReportName (String reportName) {
        for (ClientType clientType : values()) {
            if (clientType.getReportName().equals(reportName)){
                return clientType;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getReportName() {
        return reportName;
    }
}
