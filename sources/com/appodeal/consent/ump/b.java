package com.appodeal.consent.ump;

import com.appodeal.ads.ext.ResultExtKt;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f15561b;

    public b(g gVar, kotlinx.coroutines.e eVar) {
        this.f15560a = gVar;
        this.f15561b = eVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f15560a.f15572c = consentForm;
        com.appodeal.consent.logger.a.b("[UMP] UmpConsentForm - OnConsentFormLoadSuccessListener", null);
        kotlinx.coroutines.e eVar = this.f15561b;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(Result.a(ResultExtKt.asSuccess(Unit.f93236a))));
    }
}
