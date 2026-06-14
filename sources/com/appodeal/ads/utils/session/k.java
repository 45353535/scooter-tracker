package com.appodeal.ads.utils.session;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f15087t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f15087t = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f15087t, continuation);
        kVar.f15086s = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k kVar = new k(this.f15087t, (Continuation) obj2);
        kVar.f15086s = (CoroutineScope) obj;
        return kVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15085r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f15086s;
            q qVar = this.f15087t;
            MutableStateFlow mutableStateFlow = qVar.f15108j;
            j jVar = new j(coroutineScope, qVar, null);
            this.f15085r = 1;
            if (hg.i.l(mutableStateFlow, jVar, this) == objG) {
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
