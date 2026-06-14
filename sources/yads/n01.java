package yads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class n01 extends FilterInputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f113670a;

    public n01(HttpURLConnection httpURLConnection) {
        super(o01.a(httpURLConnection));
        this.f113670a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f113670a.disconnect();
    }
}
