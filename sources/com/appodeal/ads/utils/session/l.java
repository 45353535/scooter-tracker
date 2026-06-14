package com.appodeal.ads.utils.session;

import eg.k0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f15089s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f15089s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f15089s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f15089s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15088r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            long jA = this.f15089s.f15099a.a();
            this.f15088r = 1;
            if (k0.a(jA, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        this.f15089s.f15105g.setValue(h.f15077c);
        return Unit.f93236a;
    }
}
