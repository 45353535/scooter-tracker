package com.appodeal.ads.regulator;

import android.content.Context;
import com.appodeal.consent.ConsentForm;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f14388s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, Continuation continuation) {
        super(2, continuation);
        this.f14388s = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f14388s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t(this.f14388s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f14387r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            y yVar = this.f14388s;
            com.appodeal.ads.regulator.usecases.d dVar = yVar.f14413c;
            Context applicationContext = yVar.f14411a.f13206a.getApplicationContext();
            this.f14387r = 1;
            objA = dVar.a(applicationContext, this);
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
        y yVar2 = this.f14388s;
        if (Result.j(objA)) {
            yVar2.b(new d((ConsentForm) objA));
        }
        y yVar3 = this.f14388s;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            yVar3.b(new c(thG));
        }
        return Unit.f93236a;
    }
}
