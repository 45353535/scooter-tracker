package com.appodeal.ads;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class t6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m8 f14863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f14864t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(m8 m8Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f14863s = m8Var;
        this.f14864t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t6(this.f14863s, this.f14864t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t6(this.f14863s, this.f14864t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f14862r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            m8 m8Var = this.f14863s;
            this.f14862r = 1;
            objA = com.appodeal.ads.networking.v.a(m8Var, com.appodeal.ads.networking.processors.c.f14154b, this);
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
        Function1 function1 = this.f14864t;
        if (Result.j(objA)) {
            function1.invoke((JSONObject) objA);
        }
        return Unit.f93236a;
    }
}
