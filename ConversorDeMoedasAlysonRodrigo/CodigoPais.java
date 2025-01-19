package ConversorDeMoedasAlysonRodrigo;

public class CodigoPais {
    private String codPais;

    public String converterCodPais (int pais) {

        switch (pais) {
            case 1:
                codPais = "BRL";
                break;
            case 2:
                codPais = "TWD";
                break;
            case 3:
                codPais = "ARS";
                break;
            case 4:
                codPais = "CAD";
                break;
            case 5:
                codPais = "CLP";
                break;
            case 6:
                codPais = "CNY";
                break;
            case 7:
                codPais = "COP";
                break;
            case 8:
                codPais = "CUP";
                break;
            case 9:
                codPais = "USD";
                break;

        }
        return codPais;
    }
}
