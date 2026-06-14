package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class fm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib3 f110795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm3 f110796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final em3 f110797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gm3 f110798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f110799e;

    public /* synthetic */ fm3(Context context, ib3 ib3Var) {
        this(context, ib3Var, new dm3(ib3Var), new em3(), new gm3());
    }

    public fm3(Context context, ib3 ib3Var, dm3 dm3Var, em3 em3Var, gm3 gm3Var) {
        this.f110795a = ib3Var;
        this.f110796b = dm3Var;
        this.f110797c = em3Var;
        this.f110798d = gm3Var;
        this.f110799e = context.getApplicationContext();
    }
}
