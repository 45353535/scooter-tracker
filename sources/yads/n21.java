package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class n21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v21 f113701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h72 f113702b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n21(Context context) {
        j72 j72VarA = j72.f112253c.a(context);
        this(j72VarA.a(), j72VarA.b());
    }

    public final void a(Set set, m31 m31Var) {
        if (set.isEmpty()) {
            m31Var.a(MapsKt.emptyMap());
        } else {
            new j21(this.f113701a, set, m31Var, new Handler(Looper.getMainLooper()), new AtomicInteger(set.size()), new vq1()).a();
        }
    }

    public n21(v21 v21Var, h72 h72Var) {
        this.f113701a = v21Var;
        this.f113702b = h72Var;
    }
}
