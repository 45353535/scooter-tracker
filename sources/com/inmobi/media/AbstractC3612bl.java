package com.inmobi.media;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.inmobi.media.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3612bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f38288a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f38289b = Charset.forName("UTF-8");

    public static String a(InputStreamReader inputStreamReader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = stringWriter.toString();
                    inputStreamReader.close();
                    return string;
                }
                stringWriter.write(cArr, 0, i10);
            }
        } catch (Throwable th2) {
            inputStreamReader.close();
            throw th2;
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
