package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4122w4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hh.x f39829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hh.z f39830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4122w4(hh.x xVar, hh.z zVar, Continuation continuation) {
        super(2, continuation);
        this.f39829b = xVar;
        this.f39830c = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4122w4(this.f39829b, this.f39830c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4122w4(this.f39829b, this.f39830c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39828a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        hh.e eVarA = this.f39829b.a(this.f39830c);
        Intrinsics.checkNotNullExpressionValue(eVarA, "newCall(...)");
        this.f39828a = 1;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
        eVar.I();
        eVar.v(new C3638cl(eVarA));
        eVarA.m(new C3664dl(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(this);
        }
        return objC == objG ? objG : objC;
    }
}
