package s9;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface g extends n9.h {

    public interface a {
        g createDataSource();
    }

    void a(y yVar);

    long b(k kVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();
}
