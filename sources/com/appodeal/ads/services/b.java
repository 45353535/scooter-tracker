package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.service.Service;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Service f14640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f14642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14643u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f14642t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14641s = obj;
        this.f14643u |= Integer.MIN_VALUE;
        Object objMo4432preInitialize0E7RQCE = this.f14642t.mo4432preInitialize0E7RQCE(null, null, this);
        return objMo4432preInitialize0E7RQCE == pf.b.g() ? objMo4432preInitialize0E7RQCE : Result.a(objMo4432preInitialize0E7RQCE);
    }
}
