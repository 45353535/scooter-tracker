package x;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import c0.q;
import x.e;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f {
    public static final e a(Context context, e.a aVar, q qVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !c0.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (qVar != null && qVar.getLevel() <= 5) {
                qVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new c();
        }
        try {
            return new g(connectivityManager, aVar);
        } catch (Exception e10) {
            if (qVar != null) {
                c0.g.a(qVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new c();
        }
    }
}
