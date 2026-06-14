package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.vi;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f63960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f63961b;

    public a(Ad ad2, AdEventListener adEventListener) {
        this.f63961b = ad2;
        this.f63960a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        a0.a(this.f63961b.context, this.f63960a, ad2, false);
        String errorMessage = ad2 != null ? ad2.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        } else if (errorMessage.contains("204")) {
            errorMessage = "NO FILL";
        }
        Context context = this.f63961b.context;
        StringBuilder sb2 = new StringBuilder("Failed to load ");
        sb2.append(ad2 != null ? vi.a(ad2) : "");
        sb2.append(" ad: ");
        sb2.append(errorMessage);
        vi.a(6, context, sb2.toString());
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        this.f63961b.lastLoadTime = Long.valueOf(System.currentTimeMillis());
        a0.b(this.f63961b.context, this.f63960a, ad2, false);
        ConsentData consentData = ad2.getConsentData();
        if (consentData != null) {
            ((h6) this.f63961b.consentManager.a()).a(consentData.f(), consentData.e(), consentData.a(), false, true);
        }
        vi.a(4, this.f63961b.context, "Loaded " + vi.a(ad2) + " ad with creative ID - " + ad2.getAdId());
    }
}
