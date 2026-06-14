package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Xk extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38010a;

    public Xk(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Xk(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Xk((Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38010a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            String strB = Ji.b();
            if (strB == null) {
                return Unit.f93236a;
            }
            if (!Intrinsics.areEqual(strB, Ji.f37159c)) {
                C3774i4 c3774i4 = Y3.f38021a;
                this.f38010a = 1;
                Object objA = C3729g9.a(((C3569a4) Y3.f38021a.f38740b.f38791b.getValue()).f38146a, "config_db", null, this, 6);
                if (objA != pf.b.g()) {
                    objA = Unit.f93236a;
                }
                if (objA != pf.b.g()) {
                    objA = Unit.f93236a;
                }
                if (objA != pf.b.g()) {
                    objA = Unit.f93236a;
                }
                if (objA == objG) {
                    return objG;
                }
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
