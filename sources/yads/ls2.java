package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ls2 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CopyOnWriteArrayList f113208f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f113209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f113210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gs1 f113211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f113212e;

    public ls2(Context context, pr3 pr3Var, CoroutineScope coroutineScope, gs1 gs1Var) {
        this.f113209b = pr3Var;
        this.f113210c = coroutineScope;
        this.f113211d = gs1Var;
        this.f113212e = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs2 rs2Var = new rs2(this.f113212e, this.f113209b, this.f113210c, new v5(), null, null, 2097136);
        f113208f.add(rs2Var);
        eg.i.d(this.f113210c, null, null, new ks2(rs2Var, this, null), 3, null);
    }
}
