package io.bidmachine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
class b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b5 f80001c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f80002a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f80003b = new HashMap();

    b5() {
    }

    public static b5 b() {
        b5 b5Var;
        b5 b5Var2 = f80001c;
        if (b5Var2 != null) {
            return b5Var2;
        }
        synchronized (b5.class) {
            try {
                b5Var = f80001c;
                if (b5Var == null) {
                    b5Var = new b5();
                    f80001c = b5Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b5Var;
    }

    public void a(String str, io.bidmachine.core.b bVar) {
        synchronized (this.f80002a) {
            this.f80003b.put(str, bVar);
        }
    }

    public io.bidmachine.core.b c(String str) {
        io.bidmachine.core.b bVar;
        synchronized (this.f80002a) {
            bVar = (io.bidmachine.core.b) this.f80003b.remove(str);
        }
        return bVar;
    }
}
