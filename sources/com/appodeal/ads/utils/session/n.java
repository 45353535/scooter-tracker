package com.appodeal.ads.utils.session;

import eg.e0;
import eg.o0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f15095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f15096s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f15096s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f15096s, continuation);
        nVar.f15095r = ((Number) obj).intValue();
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        n nVar = new n(this.f15096s, (Continuation) obj2);
        nVar.f15095r = iIntValue;
        return nVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        f fVar;
        List sessions;
        Unit unit;
        pf.b.g();
        kotlin.d.b(obj);
        int i10 = this.f15095r;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f15096s.f15107i.getValue();
        q qVar = this.f15096s;
        do {
            value = mutableStateFlow.getValue();
            fVar = (f) value;
            sessions = CollectionsKt.take(fVar.f15075c, i10);
            d0 d0Var = qVar.f15103e;
            d0Var.getClass();
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            eg.i.d(kotlinx.coroutines.i.a(o0.b().plus(new e0("ApdSessionsInteractor"))), null, null, new c0(d0Var, sessions, null), 3, null);
            unit = Unit.f93236a;
        } while (!mutableStateFlow.b(value, f.b(fVar, null, null, sessions, 3)));
        return unit;
    }
}
