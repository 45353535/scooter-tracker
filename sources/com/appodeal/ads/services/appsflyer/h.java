package com.appodeal.ads.services.appsflyer;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppsflyerService f14592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ServiceOptions.Appsflyer f14593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AppsflyerService f14595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14596v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AppsflyerService appsflyerService, Continuation continuation) {
        super(continuation);
        this.f14595u = appsflyerService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14594t = obj;
        this.f14596v |= Integer.MIN_VALUE;
        Object objC = this.f14595u.mo4428initializegIAlus(null, this);
        return objC == pf.b.g() ? objC : Result.a(objC);
    }
}
