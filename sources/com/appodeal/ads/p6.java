package com.appodeal.ads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class p6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h8 f14272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f14273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(h8 h8Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f14272s = h8Var;
        this.f14273t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p6(this.f14272s, this.f14273t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p6(this.f14272s, this.f14273t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f14271r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            h8 h8Var = this.f14272s;
            this.f14271r = 1;
            objA = com.appodeal.ads.networking.v.a(h8Var, com.appodeal.ads.networking.processors.c.f14154b, this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objA = ((Result) obj).l();
        }
        Function1 function1 = this.f14273t;
        if (Result.j(objA)) {
            function1.invoke((JSONObject) objA);
        }
        return Unit.f93236a;
    }
}
