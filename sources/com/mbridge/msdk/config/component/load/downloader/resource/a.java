package com.mbridge.msdk.config.component.load.downloader.resource;

import com.mbridge.msdk.config.component.load.downloader.resource.stream.b;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f47094a;

    private a() {
    }

    public static a a() {
        if (f47094a == null) {
            synchronized (a.class) {
                try {
                    if (f47094a == null) {
                        f47094a = new a();
                    }
                } finally {
                }
            }
        }
        return f47094a;
    }

    public com.mbridge.msdk.config.component.load.downloader.resource.stream.a b(File file) throws IOException {
        if (file == null) {
            throw new IOException("file is null");
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        return new b(file);
    }

    public long c(File file) {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            try {
                return file.length();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }

    public String a(String str) {
        try {
            URL url = new URL(str);
            String str2 = url.getProtocol() + "://" + url.getHost() + url.getPath();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str2.getBytes("UTF-8"));
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }
}
