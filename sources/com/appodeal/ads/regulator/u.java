package com.appodeal.ads.regulator;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f14390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f14391t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f14390s = yVar;
        this.f14391t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f14390s, this.f14391t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.f14390s, this.f14391t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f14389r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.appodeal.ads.regulator.usecases.h hVar = this.f14390s.f14412b;
            e eVar = this.f14391t;
            String str = eVar.f14353a;
            boolean z10 = eVar.f14354b;
            String str2 = eVar.f14355c;
            String str3 = eVar.f14356d;
            this.f14389r = 1;
            uVar = this;
            objA = hVar.a(str, z10, str2, str3, uVar);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objA = ((Result) obj).l();
            uVar = this;
        }
        y yVar = uVar.f14390s;
        if (Result.j(objA)) {
            yVar.b(f.f14357a);
        }
        y yVar2 = uVar.f14390s;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            yVar2.b(new c(thG));
        }
        return Unit.f93236a;
    }
}
