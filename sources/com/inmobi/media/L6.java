package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class L6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6 f37268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(M6 m62, Continuation continuation) {
        super(2, continuation);
        this.f37268a = m62;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L6(this.f37268a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new L6(this.f37268a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        M6 m62 = this.f37268a;
        Hc hc2 = m62.f37344f;
        InMobiAdRequestStatus status = m62.f37343e;
        hc2.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        hc2.onAdLoadFailed(status);
        return Unit.f93236a;
    }
}
