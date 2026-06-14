package n0;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f95017b;

    public a(HttpURLConnection httpURLConnection) {
        this.f95017b = httpURLConnection;
    }

    private String c(HttpURLConnection httpURLConnection) {
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

    @Override // n0.d
    public String I() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f95017b.getURL() + ". Failed with " + this.f95017b.getResponseCode() + IOUtils.LINE_SEPARATOR_UNIX + c(this.f95017b);
        } catch (IOException e10) {
            q0.g.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // n0.d
    public String Y() {
        return this.f95017b.getContentType();
    }

    @Override // n0.d
    public InputStream Z() {
        return this.f95017b.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f95017b.disconnect();
    }

    @Override // n0.d
    public boolean isSuccessful() {
        try {
            return this.f95017b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
