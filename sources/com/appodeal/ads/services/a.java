package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.service.Service;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Service f14517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f14519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14520u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(continuation);
        this.f14519t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14518s = obj;
        this.f14520u |= Integer.MIN_VALUE;
        Object objMo4431initialize0E7RQCE = this.f14519t.mo4431initialize0E7RQCE(null, null, this);
        return objMo4431initialize0E7RQCE == pf.b.g() ? objMo4431initialize0E7RQCE : Result.a(objMo4431initialize0E7RQCE);
    }
}
