package com.voltz.patinhascompany.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    // Método para formatar uma data específica
    public static String formatarData(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    // Método para obter a data atual formatada
    public static String obterDataAtual() {
        return formatarData(new Date());
    }
}
