package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3904na extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3929oa f39087a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3904na(ViewTreeObserverOnGlobalLayoutListenerC3929oa viewTreeObserverOnGlobalLayoutListenerC3929oa, Continuation continuation) {
        super(2, continuation);
        this.f39087a = viewTreeObserverOnGlobalLayoutListenerC3929oa;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3904na(this.f39087a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3904na(this.f39087a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        eg.p pVar = this.f39087a.f39181e;
        Unit unit = Unit.f93236a;
        pVar.s(unit);
        return unit;
    }
}
