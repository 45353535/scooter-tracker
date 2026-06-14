package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fn implements du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f110801b;

    public fn(Context context, t9 t9Var) {
        this.f110800a = context;
        this.f110801b = t9Var;
    }

    @Override // yads.du
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public void c() {
        b();
        getClass().toString();
        boolean z10 = lb1.f113032a;
    }
}
