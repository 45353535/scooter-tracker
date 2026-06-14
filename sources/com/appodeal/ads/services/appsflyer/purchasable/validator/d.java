package com.appodeal.ads.services.appsflyer.purchasable.validator;

import com.appodeal.ads.inapp.InAppPurchase;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f14615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InAppPurchase f14616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14617t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f14618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14619v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(continuation);
        this.f14618u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14617t = obj;
        this.f14619v |= Integer.MIN_VALUE;
        return this.f14618u.validatePurchase(null, this);
    }
}
