package com.appodeal.ads.regulator;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f14405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f14406t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f14405s = yVar;
        this.f14406t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f14405s, this.f14406t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f14405s, this.f14406t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14404r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f14405s.f14416f;
            g gVar = this.f14406t;
            this.f14404r = 1;
            if (mutableSharedFlow.emit(gVar, this) == objG) {
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
