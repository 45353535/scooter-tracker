package com.appodeal.consent;

import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.networking.v;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConsentUpdateRequestParameters f15472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ConsentInfoUpdateCallback f15473t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ConsentUpdateRequestParameters consentUpdateRequestParameters, ConsentInfoUpdateCallback consentInfoUpdateCallback, Continuation continuation) {
        super(2, continuation);
        this.f15472s = consentUpdateRequestParameters;
        this.f15473t = consentInfoUpdateCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f15472s, this.f15473t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f15472s, this.f15473t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f15471r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ConsentManager consentManager = ConsentManager.INSTANCE;
            v vVarAccess$getLoadConsentInfo = ConsentManager.access$getLoadConsentInfo(consentManager);
            ConsentUpdateRequestParameters consentUpdateRequestParameters = this.f15472s;
            com.appodeal.consent.cache.i iVarAccess$getPrivacyPreferences = ConsentManager.access$getPrivacyPreferences(consentManager);
            this.f15471r = 1;
            objA = vVarAccess$getLoadConsentInfo.a(consentUpdateRequestParameters, iVarAccess$getPrivacyPreferences, this);
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
        ConsentInfoUpdateCallback consentInfoUpdateCallback = this.f15473t;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            Intrinsics.checkNotNullParameter(thG, "<this>");
            thG.printStackTrace();
            consentInfoUpdateCallback.onFailed(thG instanceof ConsentManagerError ? (ConsentManagerError) thG : new ConsentManagerError.InternalError(thG.getMessage(), thG));
        }
        ConsentInfoUpdateCallback consentInfoUpdateCallback2 = this.f15473t;
        if (Result.j(objA)) {
            ConsentManager.INSTANCE.setConsentInformation$consent_release((ConsentInformation) objA);
            consentInfoUpdateCallback2.onUpdated();
        }
        return Unit.f93236a;
    }
}
