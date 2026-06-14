package com.taurusx.tax.y.s;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class y {
    public static byte[] z(String str, String str2) {
        if (str != null && str.length() != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(str.getBytes(str2));
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
