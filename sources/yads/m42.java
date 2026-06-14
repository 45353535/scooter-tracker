package yads;

import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ti0 f113317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f113318b = new ConcurrentHashMap();

    public m42(Context context) {
        this.f113317a = we3.b(context.getApplicationContext());
    }

    public final void a(String str, ne3 ne3Var, String str2) {
        if (this.f113317a == null) {
            ne3Var.b();
            a();
            return;
        }
        Uri uri = Uri.parse(str);
        v31 v31Var = y31.f118068c;
        wi0 wi0Var = new wi0(str2, uri, null, nk2.f113952f, null, null, null);
        this.f113318b.put(str2, ne3Var);
        xk3 xk3Var = new xk3(str2, ne3Var);
        ti0 ti0Var = this.f113317a;
        ti0Var.getClass();
        ti0Var.f116252b.add(xk3Var);
        ti0 ti0Var2 = this.f113317a;
        ti0Var2.f116253c++;
        ti0Var2.f116251a.obtainMessage(6, 0, 0, wi0Var).sendToTarget();
        ti0 ti0Var3 = this.f113317a;
        if (ti0Var3.f116254d) {
            ti0Var3.f116254d = false;
            ti0Var3.f116253c++;
            ti0Var3.f116251a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zA = ti0Var3.a();
            Iterator it = ti0Var3.f116252b.iterator();
            while (it.hasNext()) {
                ((ri0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = ti0Var3.f116252b.iterator();
                while (it2.hasNext()) {
                    ((ri0) it2.next()).getClass();
                }
            }
        }
    }

    public final void a() {
        Iterator it = this.f113318b.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            ti0 ti0Var = this.f113317a;
            if (ti0Var != null) {
                ti0Var.f116253c++;
                ti0Var.f116251a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.f113318b.clear();
    }
}
