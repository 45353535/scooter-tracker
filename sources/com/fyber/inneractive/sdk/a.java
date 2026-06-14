package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends com.fyber.inneractive.sdk.dv.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.interstitial.a f20109j;

    public a(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f20109j = null;
    }

    public abstract void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity);

    public final void g() {
        try {
            new w(u.EVENT_READY_ON_CLIENT, this.f21035a, (i) this.f21036b).a((String) null);
        } catch (Exception unused) {
        }
    }
}
