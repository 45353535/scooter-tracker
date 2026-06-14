package com.appodeal.ads.services.adjust;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.service.InitializationMode;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AdjustService f14542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ServiceOptions.Adjust f14543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f14544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InitializationMode f14545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AdjustService f14547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14548x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AdjustService adjustService, Continuation continuation) {
        super(continuation);
        this.f14547w = adjustService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14546v = obj;
        this.f14548x |= Integer.MIN_VALUE;
        Object objC = this.f14547w.mo4428initializegIAlus(null, this);
        return objC == pf.b.g() ? objC : Result.a(objC);
    }
}
