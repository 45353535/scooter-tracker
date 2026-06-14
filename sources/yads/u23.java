package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class u23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f116470b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f116471a;

    public u23(Handler handler) {
        this.f116471a = handler;
    }

    public final t23 a(int i10, Object obj) {
        t23 t23VarA = a();
        t23VarA.f116042a = this.f116471a.obtainMessage(i10, obj);
        return t23VarA;
    }

    public static t23 a() {
        t23 t23Var;
        ArrayList arrayList = f116470b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    t23Var = new t23();
                } else {
                    t23Var = (t23) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t23Var;
    }
}
