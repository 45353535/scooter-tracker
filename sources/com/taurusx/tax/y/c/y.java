package com.taurusx.tax.y.c;

import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f67623z = "LogJsonRequest";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w f67622w = null;

    public interface w {

        public enum z {
            GET,
            POST
        }

        Map<String, String> c();

        int o();

        z w();

        byte[] y();

        String z();

        void z(HttpURLConnection httpURLConnection, boolean z10);
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.z zVarW = y.this.f67622w.w();
            if (zVarW == w.z.GET) {
                y.this.z();
            } else if (zVarW == w.z.POST) {
                y.this.w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        try {
            try {
                String strZ = this.f67622w.z();
                Log.d("LogJsonRequest", "doPost requestUrl is " + strZ);
                byte[] bArrY = this.f67622w.y();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strZ).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(this.f67622w.o() * 1000);
                httpURLConnection.setReadTimeout(this.f67622w.o() * 1000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Map<String, String> mapC = this.f67622w.c();
                if (mapC != null && !mapC.isEmpty()) {
                    for (String str : mapC.keySet()) {
                        httpURLConnection.setRequestProperty(str, mapC.get(str));
                    }
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                String requestProperty = httpURLConnection.getRequestProperty("Content-Encoding");
                if (TextUtils.isEmpty(requestProperty) || !"gzip".equals(requestProperty)) {
                    outputStream.write(bArrY);
                } else {
                    outputStream.write(z(bArrY));
                }
                outputStream.flush();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 400) {
                    y(httpURLConnection);
                } else {
                    w(httpURLConnection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Error | Exception unused) {
            y((HttpURLConnection) null);
        }
    }

    public static InputStream z(HttpURLConnection httpURLConnection) {
        String contentEncoding;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return (inputStream == null || (contentEncoding = httpURLConnection.getContentEncoding()) == null || !TextUtils.equals(contentEncoding, "gzip")) ? inputStream : new GZIPInputStream(inputStream);
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void y() {
        com.taurusx.tax.g.r0.c.y().execute(new z());
    }

    private void y(HttpURLConnection httpURLConnection) {
        this.f67622w.z(httpURLConnection, false);
    }

    public void z(w wVar) {
        this.f67622w = wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        try {
            String strZ = this.f67622w.z();
            Log.d("LogJsonRequest", "doGet requestUrl is " + strZ);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strZ).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(this.f67622w.o() * 1000);
            httpURLConnection.setReadTimeout(this.f67622w.o() * 1000);
            Map<String, String> mapC = this.f67622w.c();
            if (mapC != null && !mapC.isEmpty()) {
                for (String str : mapC.keySet()) {
                    httpURLConnection.setRequestProperty(str, mapC.get(str));
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 400) {
                w(httpURLConnection);
            } else {
                y(httpURLConnection);
            }
        } catch (Error e10) {
            e = e10;
            e.printStackTrace();
            y((HttpURLConnection) null);
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            y((HttpURLConnection) null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private byte[] z(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private void w(HttpURLConnection httpURLConnection) {
        this.f67622w.z(httpURLConnection, true);
    }
}
