package com.appodeal.ads.services;

import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f14705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f14706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InAppPurchaseValidateCallback f14707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Function0 f14708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f14710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14711x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f14710w = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14709v = obj;
        this.f14711x |= Integer.MIN_VALUE;
        return this.f14710w.a(null, null, null, this);
    }
}
