package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W5 f37049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(W5 w52, long j10, Continuation continuation) {
        super(2, continuation);
        this.f37049b = w52;
        this.f37050c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new I4(this.f37049b, this.f37050c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I4(this.f37049b, this.f37050c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37048a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            K4 k42 = K4.f37202a;
            W5 w52 = this.f37049b;
            int maxAdRecords = K4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f37050c;
            this.f37048a = 1;
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            C4 c42 = (C4) K4.f37203b.getValue();
            C3729g9 c3729g9 = c42.f36655a;
            B4 b42 = new B4(c42, w52, j10, maxAdRecords, null);
            c3729g9.getClass();
            Object objA = c3729g9.a(new C3703f9(c3729g9, b42, null), this);
            if (objA != pf.b.g()) {
                objA = Unit.f93236a;
            }
            if (objA != pf.b.g()) {
                objA = Unit.f93236a;
            }
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
