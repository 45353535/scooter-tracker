package com.appodeal.consent.form;

import android.content.Context;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.consent.ConsentInformation;
import com.appodeal.consent.ConsentManagerError;
import eg.x1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConsentInformation f15463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f15464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.consent.cache.i f15465u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ConsentInformation consentInformation, Context context, com.appodeal.consent.cache.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15463s = consentInformation;
        this.f15464t = context;
        this.f15465u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f15463s, this.f15464t, this.f15465u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15462r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            t tVar = new t(this.f15463s, this.f15464t, this.f15465u, null);
            this.f15462r = 1;
            obj = x1.e(20000L, tVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        Result result = (Result) obj;
        return Result.a(result != null ? result.l() : ResultExtKt.asFailure(new ConsentManagerError.TimeoutError("[ConsentForm] - loading timeout: 20000")));
    }
}
