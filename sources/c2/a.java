package c2;

import android.text.TextUtils;
import com.explorestack.iab.mraid.d;
import com.explorestack.iab.mraid.q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f6500a = new CopyOnWriteArrayList();

    private static b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f6500a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
        throw null;
    }

    public static String b() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = f6500a.iterator();
        if (!it.hasNext()) {
            return sb2.toString();
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
        sb2.append("<script type='application/javascript'>");
        throw null;
    }

    public static void c(q qVar, String str) {
        d.a("JsBridgeHandler", "handleJsCommand - %s", str);
        try {
            a(str);
        } catch (Throwable th2) {
            d.b("JsBridgeHandler", th2);
        }
    }

    public static boolean d(String str) {
        a(str);
        return false;
    }
}
