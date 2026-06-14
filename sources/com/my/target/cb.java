package com.my.target;

import android.view.View;
import com.my.target.bc;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab f59393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f59394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59395c = false;

    public cb(w2 w2Var, ab abVar) {
        this.f59394b = w2Var;
        this.f59393a = abVar;
    }

    public final bc.a a() {
        if (this.f59395c) {
            return null;
        }
        return this.f59394b.a();
    }

    public abstract void a(View view);

    public abstract void a(boolean z10, float f10, View view);

    public void b() {
        if (this.f59395c) {
            return;
        }
        this.f59394b.a(this);
        this.f59395c = true;
        gb.b("ViewabilityTracker: StatTracker", "i'm killed");
    }

    public abstract void c();
}
