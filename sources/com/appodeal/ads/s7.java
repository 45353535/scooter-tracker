package com.appodeal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7 extends uc {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f14458r;

    public s7(tc tcVar, AdNetwork adNetwork, x2 x2Var) {
        super(tcVar, adNetwork, x2Var, 5000);
    }

    @Override // com.appodeal.ads.uc
    public final void o() {
        super.o();
        this.f14458r = null;
    }

    public abstract int r(Activity activity);

    public abstract int s(Activity activity);
}
