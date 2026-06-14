package com.appodeal.ads.nativead.downloader;

import android.content.Context;
import android.os.Environment;
import com.amazon.device.ads.DtbConstants;
import com.appodeal.ads.utils.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    public static final File a(Context context) {
        File externalFilesDir;
        if (!Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted") || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return null;
        }
        File file = new File(externalFilesDir.getPath() + "/native_cache/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final InputStream b(String str) throws IOException {
        if (StringsKt.a0(str, "http://", false, 2, null) || StringsKt.a0(str, DtbConstants.HTTPS, false, 2, null)) {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(20000);
            uRLConnectionOpenConnection.setReadTimeout(20000);
            uRLConnectionOpenConnection.connect();
            return uRLConnectionOpenConnection.getInputStream();
        }
        throw new IllegalArgumentException(("Url " + str + " is not valid").toString());
    }

    public static final void c(OutputStream outputStream, String url) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream inputStreamB = b(url);
        if (inputStreamB == null) {
            return;
        }
        try {
            try {
                uf.b.b(inputStreamB, outputStream, 0, 2, null);
                uf.c.a(outputStream, null);
                uf.c.a(inputStreamB, null);
            } finally {
            }
        } finally {
        }
    }

    public static final String d(String str) {
        byte[] bArrDigest;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            bArrDigest = messageDigest.digest();
        } catch (Exception e10) {
            Log.log(e10);
            bArrDigest = null;
        }
        String string = new BigInteger(bArrDigest).abs().toString(36);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
