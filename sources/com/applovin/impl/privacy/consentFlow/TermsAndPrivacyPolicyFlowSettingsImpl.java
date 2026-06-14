package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* JADX INFO: loaded from: classes6.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f10191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f10192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f10193e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z10, boolean z11, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f10189a = z10;
        this.f10190b = z11;
        this.f10191c = consentFlowUserGeography;
        this.f10192d = uri;
        this.f10193e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f10191c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    @Nullable
    public Uri getPrivacyPolicyUri() {
        return this.f10192d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    @Nullable
    public Uri getTermsOfServiceUri() {
        return this.f10193e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f10189a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        o.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f10191c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z10) {
        o.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z10);
        this.f10189a = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        o.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f10192d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z10) {
        o.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z10);
        this.f10190b = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        o.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f10193e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f10190b;
    }

    @NonNull
    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f10189a + ", privacyPolicyUri=" + this.f10192d + ", termsOfServiceUri=" + this.f10193e + '}';
    }
}
