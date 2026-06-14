package com.bytedance.adsdk.ud.mml;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements mml, AutoCloseable {
    private final HttpURLConnection qdl;

    public qdl(HttpURLConnection httpURLConnection) {
        this.qdl = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.qdl.disconnect();
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public String lnr() {
        return this.qdl.getContentType();
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public String mml() {
        try {
            if (qdl()) {
                return null;
            }
            return "Unable to fetch " + this.qdl.getURL() + ". Failed with " + this.qdl.getResponseCode() + IOUtils.LINE_SEPARATOR_UNIX + qdl(this.qdl);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public boolean qdl() {
        try {
            return this.qdl.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public InputStream ud() throws IOException {
        return this.qdl.getInputStream();
    }

    private String qdl(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
