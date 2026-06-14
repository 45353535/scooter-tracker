package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends InputStream implements AutoCloseable {
    InputStream qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    HttpURLConnection f16702ud;

    public wd(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.qdl = inputStream;
        this.f16702ud = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            inputStream.close();
            this.qdl = null;
        }
        HttpURLConnection httpURLConnection = this.f16702ud;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f16702ud = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.skip(j10);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}
