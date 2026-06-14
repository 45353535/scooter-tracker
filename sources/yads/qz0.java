package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qz0 extends fn implements e4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9 f115231c;

    public qz0(Context context, t9 t9Var) {
        this(context, t9Var, new x9());
    }

    @Override // yads.fn
    public final synchronized void b() {
        this.f115231c.a(null);
    }

    public qz0(Context context, t9 t9Var, x9 x9Var) {
        super(context, t9Var);
        this.f115231c = x9Var;
        x9Var.a(this);
    }
}
