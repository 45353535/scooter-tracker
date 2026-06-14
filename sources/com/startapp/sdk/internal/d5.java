package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class d5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64406a;

    public d5(Context context) {
        this.f64406a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f64406a.getSharedPreferences("com.startapp.sdk.extras", 0), new c5(this));
    }
}
