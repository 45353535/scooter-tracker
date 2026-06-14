package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4024s6 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4074u6 f39505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024s6(C4074u6 c4074u6, Continuation continuation) {
        super(1, continuation);
        this.f39505b = c4074u6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C4024s6(this.f39505b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4024s6(this.f39505b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39504a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C4074u6 c4074u6 = this.f39505b;
                this.f39504a = 1;
                if (C4074u6.a(c4074u6, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
        } catch (Exception e10) {
            e10.toString();
        }
        return Unit.f93236a;
    }
}
