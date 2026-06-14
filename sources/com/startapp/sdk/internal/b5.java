package com.startapp.sdk.internal;

import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes11.dex */
public final class b5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64308a;

    public b5(Context context) {
        this.f64308a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(PreferenceManager.getDefaultSharedPreferences(this.f64308a));
    }
}
