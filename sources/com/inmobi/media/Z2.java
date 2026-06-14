package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Z2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f38090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f38091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(W2 w22, AdConfig.ImaiConfig imaiConfig, Continuation continuation) {
        super(2, continuation);
        this.f38090b = w22;
        this.f38091c = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z2(this.f38090b, this.f38091c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z2(this.f38090b, this.f38091c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38089a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            W2 w22 = this.f38090b;
            int maxEventBatch = this.f38091c.getMaxEventBatch();
            int pingInterval = this.f38091c.getPingInterval();
            this.f38089a = 1;
            obj = w22.a(maxEventBatch, pingInterval, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.inmobi.ads.core.Click>");
        return kotlin.jvm.internal.b1.c(obj);
    }
}
