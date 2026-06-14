package c9;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f6600a = new WeakHashMap();

    public static synchronized g a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f6600a.entrySet().iterator();
        while (it.hasNext()) {
            g gVar = (g) ((Map.Entry) it.next()).getKey();
            if (gVar.H().equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public static synchronized void b(g gVar) {
        if (gVar == null) {
            return;
        }
        f6600a.put(gVar, Boolean.TRUE);
    }
}
