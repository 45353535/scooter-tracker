package z8;

import android.text.TextUtils;
import com.ironsource.sdk.controller.f;
import io.bidmachine.iab.mraid.a0;
import io.bidmachine.iab.mraid.i;
import io.bidmachine.iab.mraid.r;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f119184a = new CopyOnWriteArrayList();

    private static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (a aVar : f119184a) {
            if (aVar.a(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static boolean b(a aVar) {
        List list = f119184a;
        return !list.contains(aVar) && list.add(aVar);
    }

    public static void c(a0 a0Var, String str) {
        Map mapQ;
        i.c("JsBridgeHandler", "handleJsCommand - %s", str);
        try {
            a aVarA = a(str);
            if (aVarA != null && (mapQ = r.q(str, aVarA.c())) != null) {
                String str2 = (String) mapQ.get(f.b.f45113g);
                if (str2 == null) {
                    i.h("JsBridgeHandler", "handleJsCommand not found", new Object[0]);
                } else {
                    aVarA.b(a0Var, str2, mapQ);
                }
            }
        } catch (Throwable th2) {
            i.e("JsBridgeHandler", th2);
        }
    }

    public static boolean d(String str) {
        return a(str) != null;
    }

    public static String e() {
        StringBuilder sb2 = new StringBuilder();
        for (a aVar : f119184a) {
            sb2.append("<script type='application/javascript'>");
            sb2.append(aVar.getJs());
            sb2.append("</script>");
        }
        return sb2.toString();
    }
}
