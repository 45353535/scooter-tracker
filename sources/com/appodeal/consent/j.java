package com.appodeal.consent;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f15475s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Continuation continuation) {
        super(2, continuation);
        this.f15475s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f15475s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.f15475s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15474r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ConsentManager consentManager = ConsentManager.INSTANCE;
            com.appodeal.consent.revoke.c cVarAccess$getRevokeConsent = ConsentManager.access$getRevokeConsent(consentManager);
            Context context = this.f15475s;
            com.appodeal.consent.cache.i iVarAccess$getPrivacyPreferences = ConsentManager.access$getPrivacyPreferences(consentManager);
            ConsentInformation consentInformation$consent_release = consentManager.getConsentInformation$consent_release();
            this.f15474r = 1;
            if (cVarAccess$getRevokeConsent.a(context, iVarAccess$getPrivacyPreferences, consentInformation$consent_release, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((Result) obj).l();
        }
        ConsentManager.INSTANCE.setConsentInformation$consent_release(null);
        return Unit.f93236a;
    }
}
