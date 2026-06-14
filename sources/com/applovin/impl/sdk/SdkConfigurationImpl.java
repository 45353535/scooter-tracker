package com.applovin.impl.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f10483b;

    public SdkConfigurationImpl(k kVar) {
        this.f10482a = kVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f10482a.n0().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f10482a.a(x4.V6);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        String str = (String) this.f10482a.a(x4.V6);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.f10482a.a(x4.W6);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    @Nullable
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f10483b;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.f10482a.s0().c();
    }

    public void setEnabledAmazonAdUnitIds(@Nullable List<String> list) {
        this.f10483b = list;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + '}';
    }
}
