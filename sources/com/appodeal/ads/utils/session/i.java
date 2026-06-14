package com.appodeal.ads.utils.session;

import com.appodeal.ads.storage.e0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f15079r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f15079r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f15079r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f15079r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        pf.b.g();
        kotlin.d.b(obj);
        e0 e0Var = this.f15079r.f15103e.f15063a.f15129a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter("", "sessionsInfoJsonString");
        e0Var.f14800a.l("");
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f15079r.f15107i.getValue();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, f.b((f) value, null, null, CollectionsKt.emptyList(), 3)));
        return Unit.f93236a;
    }
}
