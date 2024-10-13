package com.voltz.patinhascompany.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String formatarData(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
}
