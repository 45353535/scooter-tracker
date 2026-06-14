package com.appodeal.consent.form;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f15424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f15425u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f15423s = str;
        this.f15424t = str2;
        this.f15425u = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f15423s, this.f15424t, this.f15425u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15422r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.appodeal.consent.logger.a.b("[ConsentForm] - onUpdateConsent called with tcf: " + this.f15423s + " and consent: " + this.f15424t, null);
            com.appodeal.consent.cache.i iVar = this.f15425u.f15450a;
            String str = this.f15423s;
            String str2 = this.f15424t;
            this.f15422r = 1;
            if (iVar.d(str, str2, this) == objG) {
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
