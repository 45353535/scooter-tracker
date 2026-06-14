package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f23930b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f23931c = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f23932a = new z0();

    public static c1 a(HttpURLConnection httpURLConnection, ByteBuffer byteBuffer) throws IOException {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String strTrim;
        String strTrim2;
        httpURLConnection.connect();
        for (int i10 = 0; i10 < 20; i10++) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300 || responseCode >= 400) {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArrArray = byteBuffer.array();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i11 = inputStream.read(bArrArray);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArrArray, 0, i11);
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable unused3) {
                    inputStream = null;
                }
                com.fyber.inneractive.sdk.util.v.b((Closeable) inputStream);
                httpURLConnection.disconnect();
                String contentType = httpURLConnection.getContentType();
                if (TextUtils.isEmpty(contentType)) {
                    strTrim = "";
                    strTrim2 = strTrim;
                } else {
                    String[] strArrSplit = contentType.split(";");
                    strTrim = strArrSplit.length > 0 ? strArrSplit[0].trim() : "";
                    strTrim2 = strArrSplit.length > 1 ? strArrSplit[1].trim() : "";
                }
                HashMap map = new HashMap();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                    for (String str : headerFields.keySet()) {
                        List<String> list = headerFields.get(str);
                        if (list != null && list.size() > 0) {
                            map.put(str, list.get(0));
                        }
                    }
                }
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    return null;
                }
                return new c1(byteArrayOutputStream == null ? f23930b : byteArrayOutputStream.toByteArray(), map, strTrim, strTrim2, responseCode, responseMessage);
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                return null;
            }
            httpURLConnection.disconnect();
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            httpURLConnection.connect();
        }
        return null;
    }

    public static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
