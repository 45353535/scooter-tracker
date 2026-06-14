package com.appodeal.consent.form;

import com.appodeal.consent.ConsentManager;
import com.appodeal.consent.ConsentStatus;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f15417s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f15416r = z10;
        this.f15417s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f15416r, this.f15417s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f15416r, this.f15417s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b("[ConsentForm] - onConsentFormDismissed called with result: " + this.f15416r, null);
        WeakReference weakReference = ConsentActivity.f15405b;
        b.c(null);
        ConsentManager.INSTANCE.setConsentInformation$consent_release(new com.appodeal.consent.f(ConsentStatus.Obtained));
        r.e(this.f15417s);
        return Unit.f93236a;
    }
}
