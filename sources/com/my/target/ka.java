package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.bc;

/* JADX INFO: loaded from: classes11.dex */
public class ka extends n1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public za f60006f;

    public ka(w2 w2Var, ab abVar, long j10, za zaVar) {
        super(w2Var, abVar, j10);
        this.f60006f = zaVar;
    }

    @Override // com.my.target.cb
    public void a(View view) {
    }

    @Override // com.my.target.cb
    public void b() {
        super.b();
        this.f60006f = null;
    }

    @Override // com.my.target.cb
    public void c() {
        this.f60172e = 0L;
    }

    public static ka a(w2 w2Var, ab abVar, long j10, za zaVar) {
        return new ka(w2Var, abVar, j10, zaVar);
    }

    public final void c(Context context) {
        bb.a(this.f59393a, 1, context);
    }

    @Override // com.my.target.cb
    public void a(boolean z10, float f10, View view) {
        if (a(z10)) {
            a(view.getContext());
        }
    }

    public final void b(Context context) {
        String strD = kb.d(context);
        if (strD != null) {
            bb.a(this.f60006f, strD, 1, context);
        }
    }

    public final void a(Context context) {
        b(context);
        c(context);
        bc.a aVarA = a();
        if (aVarA != null) {
            aVarA.a();
        }
        gb.b("ViewabilityTracker: ShowStatTracker", "Show tracked, kill self");
        b();
    }
}
