package q0;

import android.util.Log;
import d0.x;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class f implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f98610a = new HashSet();

    @Override // d0.x
    public void a(String str) {
        b(str, null);
    }

    @Override // d0.x
    public void b(String str, Throwable th2) {
        Set set = f98610a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void c(String str, Throwable th2) {
        if (d0.e.f68328a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // d0.x
    public void debug(String str) {
        c(str, null);
    }

    @Override // d0.x
    public void error(String str, Throwable th2) {
        if (d0.e.f68328a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
