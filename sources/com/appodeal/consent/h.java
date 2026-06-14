package com.appodeal.consent;

import android.content.Context;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.form.v;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f15468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ OnConsentFormLoadFailureListener f15469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ OnConsentFormLoadSuccessListener f15470u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, OnConsentFormLoadFailureListener onConsentFormLoadFailureListener, OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, Continuation continuation) {
        super(2, continuation);
        this.f15468s = context;
        this.f15469t = onConsentFormLoadFailureListener;
        this.f15470u = onConsentFormLoadSuccessListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f15468s, this.f15469t, this.f15470u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f15467r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ConsentManager consentManager = ConsentManager.INSTANCE;
            v vVarAccess$getGetConsentForm = ConsentManager.access$getGetConsentForm(consentManager);
            Context context = this.f15468s;
            com.appodeal.consent.cache.i iVarAccess$getPrivacyPreferences = ConsentManager.access$getPrivacyPreferences(consentManager);
            ConsentInformation consentInformation$consent_release = consentManager.getConsentInformation$consent_release();
            this.f15467r = 1;
            objA = vVarAccess$getGetConsentForm.a(context, iVarAccess$getPrivacyPreferences, consentInformation$consent_release, this);
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
        OnConsentFormLoadFailureListener onConsentFormLoadFailureListener = this.f15469t;
        Throwable thG = Result.g(objA);
        if (thG != null) {
            Intrinsics.checkNotNullParameter(thG, "<this>");
            thG.printStackTrace();
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(thG instanceof ConsentManagerError ? (ConsentManagerError) thG : new ConsentManagerError.InternalError(thG.getMessage(), thG));
        }
        OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = this.f15470u;
        if (Result.j(objA)) {
            onConsentFormLoadSuccessListener.onConsentFormLoadSuccess((ConsentForm) objA);
        }
        return Unit.f93236a;
    }
}
