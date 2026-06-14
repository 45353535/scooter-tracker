package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3628cb extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3654db f38335a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3628cb(C3654db c3654db, Continuation continuation) {
        super(2, continuation);
        this.f38335a = c3654db;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3628cb(this.f38335a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3628cb(this.f38335a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3654db c3654db = this.f38335a;
        Hc hc2 = c3654db.f38439f;
        InMobiAdRequestStatus status = c3654db.f38438e;
        hc2.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        hc2.onAdLoadFailed(status);
        return Unit.f93236a;
    }
}
