package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class r5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f65186b;

    public r5(com.startapp.sdk.components.a aVar, Context context) {
        this.f65186b = aVar;
        this.f65185a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f65185a;
        com.startapp.sdk.components.a aVar = this.f65186b;
        return new gi(context, aVar.F, aVar.D, new q5());
    }
}
