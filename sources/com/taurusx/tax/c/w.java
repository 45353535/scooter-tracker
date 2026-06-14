package com.taurusx.tax.c;

import android.text.TextUtils;
import com.taurusx.tax.g.a;
import com.taurusx.tax.g.n;
import com.taurusx.tax.log.LogUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f65966w = "JsonRequest";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y f65967z = null;

    /* JADX INFO: renamed from: com.taurusx.tax.c.w$w, reason: collision with other inner class name */
    public static class C0792w extends Exception {
        public C0792w() {
        }

        public C0792w(String str) {
            super(str);
        }

        public C0792w(String str, Throwable th2) {
            super(str, th2);
        }

        public C0792w(Throwable th2) {
            super(th2);
        }
    }

    public interface y {

        public enum z {
            GET,
            POST
        }

        Map<String, String> c();

        int o();

        int s();

        z w();

        String y();

        String z();

        void z(int i10, byte[] bArr, Map<String, List<String>> map, String str);
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ int f65970z;

        public z(int i10) {
            this.f65970z = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (w.this.f65967z != null) {
                y.z zVarW = w.this.f65967z.w();
                if (zVarW == y.z.GET) {
                    w.this.z(this.f65970z);
                } else if (zVarW == y.z.POST) {
                    w.this.w(this.f65970z);
                } else {
                    LogUtil.v("taurusx", "miss request method");
                }
            }
        }
    }

    public static String z(int i10, String str) {
        return i10 == 200 ? "SUCCESS" : (i10 == 400 || i10 == 400) ? "HTTP_400_ERROR" : i10 == 403 ? "HTTP_403_ERROR" : i10 == 404 ? "HTTP_404_ERROR" : i10 == 500 ? "HTTP_500_ERROR" : (i10 == 502 || i10 == 503 || i10 == 504) ? "HTTP_502_ERROR" : str;
    }

    public void y(int i10) {
        LogUtil.v("taurusx", "start request in thread pool");
        z zVar = new z(i10);
        if (i10 == 1) {
            com.taurusx.tax.g.r0.c.z().execute(zVar);
        } else {
            com.taurusx.tax.g.r0.c.w().execute(zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r19) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.c.w.w(int):void");
    }

    public void z(y yVar) {
        this.f65967z = yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(int r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.c.w.z(int):void");
    }

    public static String z(byte[] bArr, int i10) {
        try {
            return new String(z(z(new ByteArrayInputStream(bArr), n.R, (String) null, i10)), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }

    public static InputStream z(InputStream inputStream, String str, String str2, int i10) throws Exception {
        String strA;
        String strN;
        if (inputStream != null) {
            if (n.R.equalsIgnoreCase(str)) {
                if (i10 == 1) {
                    strA = a.z();
                    strN = a.w();
                } else if (i10 == 2) {
                    strA = a.a();
                    strN = a.n();
                } else {
                    strA = "";
                    strN = "";
                }
                InputStream inputStreamZ = com.taurusx.tax.g.z.z(inputStream, strA, strN);
                if (inputStreamZ != null) {
                    try {
                        return new GZIPInputStream(inputStreamZ);
                    } catch (Exception e10) {
                        throw new C0792w("GZIP_IO_EXCEPTION", e10);
                    }
                }
                throw new C0792w("AES_DECRYPT_ERROR");
            }
            if ("gzip".equalsIgnoreCase(str)) {
                try {
                    return new GZIPInputStream(inputStream);
                } catch (Exception e11) {
                    throw new C0792w("GZIP_IO_EXCEPTION", e11);
                }
            }
            if ("gzip".equalsIgnoreCase(str2)) {
                try {
                    return new GZIPInputStream(inputStream);
                } catch (Exception e12) {
                    throw new C0792w("GZIP_IO_EXCEPTION", e12);
                }
            }
        }
        return inputStream;
    }

    public static String z(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        Iterator it = Arrays.asList("X-Ssp-Ce", "x-ssp-ce").iterator();
        while (it.hasNext()) {
            String headerField = httpURLConnection.getHeaderField((String) it.next());
            if (!TextUtils.isEmpty(headerField)) {
                return headerField;
            }
        }
        return null;
    }

    public static InputStream w(HttpURLConnection httpURLConnection, int i10) throws Exception {
        if (httpURLConnection != null) {
            return z(httpURLConnection.getInputStream(), z(httpURLConnection), httpURLConnection.getContentEncoding(), i10);
        }
        throw new C0792w("EMPTY_CONNECTION");
    }

    public static byte[] z(HttpURLConnection httpURLConnection, int i10) throws Exception {
        return z(w(httpURLConnection, i10));
    }

    public static byte[] z(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    inputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Exception e10) {
            LogUtil.v(f65966w, "decode response error : " + e10);
            if (!(e10 instanceof TimeoutException)) {
                if (e10 instanceof ZipException) {
                    throw new C0792w("ZIP_EXCEPTION", e10);
                }
                throw new C0792w("IO_EXCEPTION", e10);
            }
            throw new C0792w("READ_TIMEOUT", e10);
        }
    }

    private void z(int i10, byte[] bArr, Map<String, List<String>> map, String str) {
        this.f65967z.z(i10, bArr, map, str);
    }
}
