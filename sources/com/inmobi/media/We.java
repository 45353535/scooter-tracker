package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class We extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3632cf f37950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public We(C3632cf c3632cf, Continuation continuation) {
        super(2, continuation);
        this.f37950c = c3632cf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        We we2 = new We(this.f37950c, continuation);
        we2.f37949b = obj;
        return we2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        We we2 = new We(this.f37950c, (Continuation) obj2);
        we2.f37949b = (Xf) obj;
        return we2.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37948a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Xf xf2 = (Xf) this.f37949b;
            C3632cf c3632cf = this.f37950c;
            this.f37948a = 1;
            Object objA = c3632cf.f38121b.a(xf2, this);
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
