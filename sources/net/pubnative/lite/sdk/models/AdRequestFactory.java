package net.pubnative.lite.sdk.models;

/* JADX INFO: loaded from: classes3.dex */
public interface AdRequestFactory {

    public interface Callback {
        void onRequestCreated(AdRequest adRequest);
    }

    AdRequest buildRequest(String str, String str2, AdSize adSize, String str3, boolean z10, IntegrationType integrationType, String str4, Integer num, boolean z11);

    void createAdRequest(String str, String str2, AdSize adSize, boolean z10, boolean z11, Callback callback);

    void setAdFormat(String str);

    void setIntegrationType(IntegrationType integrationType);

    void setMediationVendor(String str);
}
