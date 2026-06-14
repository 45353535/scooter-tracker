package com.appodeal.consent.ump;

import com.google.android.ump.ConsentInformation;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements ConsentInformation.OnConsentInfoUpdateSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of.e f15577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsentInformation f15578b;

    public i(of.e eVar, ConsentInformation consentInformation) {
        this.f15577a = eVar;
        this.f15578b = consentInformation;
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public final void onConsentInfoUpdateSuccess() {
        com.appodeal.consent.logger.a.b("[UMP] OnConsentInfoUpdateSuccessListener", null);
        of.e eVar = this.f15577a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(this.f15578b));
    }
}
