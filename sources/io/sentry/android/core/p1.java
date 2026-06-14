package io.sentry.android.core;

import android.content.Context;
import io.sentry.i8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f82694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f82695b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final io.sentry.util.a f82696c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.g1 g1VarD = f82696c.d();
        try {
            if (f82694a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f82694a = strC;
                        if (g1VarD != null) {
                            g1VarD.close();
                        }
                        return strC;
                    }
                    f82694a = b(file);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str = f82694a;
            if (g1VarD != null) {
                g1VarD.close();
            }
            return str;
        } catch (Throwable th3) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    static String b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f82695b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static String c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = i8.a();
            fileOutputStream.write(strA.getBytes(f82695b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
