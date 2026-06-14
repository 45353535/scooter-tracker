package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes11.dex */
public abstract class eb {
    public static Object a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th2) {
            gb.a("SystemUtils: exception when access to application info with key - " + str + ", " + th2.getMessage());
            return null;
        }
    }

    public static String b(Throwable th2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                try {
                    th2.printStackTrace(printStream);
                    String string = byteArrayOutputStream.toString();
                    printStream.close();
                    byteArrayOutputStream.close();
                    return string;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th3) {
            gb.a(th3.toString());
            return "cannot get stacktrace";
        }
    }

    public static String a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            gb.a("SystemUtils: value in system properties is null for " + str);
        } catch (Throwable th2) {
            gb.a("SystemUtils: error occurred when getting value for property - " + str + ", " + th2.getMessage());
        }
        return null;
    }

    public static String a(Throwable th2) {
        return "message=" + th2.getMessage() + "\nexception=" + b(th2);
    }
}
