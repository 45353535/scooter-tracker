package f2;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f71928a = new WeakHashMap();

    public static synchronized e a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f71928a.entrySet().iterator();
        while (it.hasNext()) {
            e eVar = (e) ((Map.Entry) it.next()).getKey();
            if (eVar.H().equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    public static synchronized void b(e eVar) {
        if (eVar == null) {
            return;
        }
        f71928a.put(eVar, Boolean.TRUE);
    }
}
