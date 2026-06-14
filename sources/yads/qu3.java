package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class qu3 implements wt3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static qu3 f115168f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f115169a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hu3 f115170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht3 f115171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cu3 f115172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ut3 f115173e;

    public qu3(hu3 hu3Var, ht3 ht3Var) {
        this.f115170b = hu3Var;
        this.f115171c = ht3Var;
    }

    @Override // yads.wt3
    public final void a(boolean z10) {
        if (!z10) {
            k63.f112606g.getClass();
            Handler handler = k63.f112608i;
            if (handler != null) {
                handler.removeCallbacks(k63.f112610k);
                k63.f112608i = null;
                return;
            }
            return;
        }
        k63.f112606g.getClass();
        if (k63.f112608i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            k63.f112608i = handler2;
            handler2.post(k63.f112609j);
            k63.f112608i.postDelayed(k63.f112610k, 200L);
        }
    }

    public static qu3 a() {
        if (f115168f == null) {
            f115168f = new qu3(new hu3(), new ht3());
        }
        return f115168f;
    }
}
