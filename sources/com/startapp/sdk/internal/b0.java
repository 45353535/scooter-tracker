package com.startapp.sdk.internal;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f64303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.adinformation.a f64304b;

    public b0(com.startapp.sdk.adsbase.adinformation.a aVar, q qVar) {
        this.f64304b = aVar;
        this.f64303a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f64303a;
        com.startapp.sdk.adsbase.adinformation.a aVar = this.f64304b;
        qVar.a(aVar.f63979e, aVar.f63980f);
    }
}
