package br.com.caletti.cnaber.core.utils;

public class FebrabanUtils {

    private static FebrabanUtils instance;

    private FebrabanUtils() {
    }

    public static FebrabanUtils getInstance() {
        if (instance == null) {
            instance = new FebrabanUtils();
        }
        return instance;
    }

    public Integer getModulo11(String numero) {
        int soma = 0;
        int peso = 2;
        int base = 9;

        for (int i = numero.length() - 1; i >= 0; i--) {
            int digito = Integer.valueOf(numero.substring(i, i + 1));

            soma += (digito * peso);

            if (peso < base) {
                peso++;
            } else {
                peso = 2;
            }
        }

        int dv = (soma % 11);

        if (dv == 0 || dv == 1) {
            dv = 0;
        } else if (dv == 10) {
            dv = 1;
        } else {
            dv = 11 - dv;
        }

        return dv;
    }

}
