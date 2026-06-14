package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3975q6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4074u6 f39349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3975q6(C4074u6 c4074u6, long j10, Continuation continuation) {
        super(2, continuation);
        this.f39349b = c4074u6;
        this.f39350c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3975q6(this.f39349b, this.f39350c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3975q6(this.f39349b, this.f39350c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39348a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f39349b.f39640c;
            Pl pl = new Pl(this.f39350c);
            this.f39348a = 1;
            if (mutableSharedFlow.emit(pl, this) == objG) {
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
