package n0;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class b implements f {
    @Override // n0.f
    public d a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
