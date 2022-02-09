package fox.marcelo.maratonajava.javacore.Kenumeracao.domain;

public enum PayType {

    // Sobrescrita de método em Enumeração
        DEBITO {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.1;
            }
        },
        CREDITO {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.05;
            }
        };

    public abstract double calculateDiscount(double value);
}