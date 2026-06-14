package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, String> f102708a = new ConcurrentHashMap();

    public final boolean a(@Nullable URL url, @Nullable URL url2) {
        String str;
        if (url == null) {
            str = "originURL is null.";
        } else if (url2 == null) {
            str = "newURL is null.";
        } else {
            String protocol = url.getProtocol();
            if (TextUtils.isEmpty(protocol)) {
                str = "originURL protocol is empty.";
            } else {
                if (protocol.equalsIgnoreCase(url2.getProtocol())) {
                    String host = url.getHost();
                    String host2 = url2.getHost();
                    if (!host.equalsIgnoreCase("www.".concat(String.valueOf(host2))) && !host2.equalsIgnoreCase("www.".concat(host))) {
                        return false;
                    }
                    sg.bigo.ads.common.t.a.a(0, "HostCache", "cache host, originHost=" + host + ", newHost=" + host2);
                    this.f102708a.put(host, host2);
                    return true;
                }
                str = "protocol is not equal.";
            }
        }
        sg.bigo.ads.common.t.a.a(0, "HostCache", str);
        return false;
    }
}
