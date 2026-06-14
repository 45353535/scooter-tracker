package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class J4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f37098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(long j10, Continuation continuation) {
        super(2, continuation);
        this.f37098b = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new J4(this.f37098b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new J4(this.f37098b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37097a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4 c42 = (C4) K4.f37203b.getValue();
            int maxAdRecords = K4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f37098b;
            this.f37097a = 1;
            if (c42.a(maxAdRecords, j10, this) == objG) {
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
