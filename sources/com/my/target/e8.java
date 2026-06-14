package com.my.target;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8 f59594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f59595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59596c = true;

    public e8(l8 l8Var, Context context) {
        this.f59594a = l8Var;
        this.f59595b = context;
    }

    public static e8 a(l8 l8Var, Context context) {
        return new e8(l8Var, context);
    }

    public void a(boolean z10) {
        this.f59596c = z10;
    }

    public q8 a(s5 s5Var) {
        return q8.a(s5Var, this.f59594a, this.f59595b);
    }

    public y a() {
        return w5.a(this.f59596c, this.f59595b);
    }
}
