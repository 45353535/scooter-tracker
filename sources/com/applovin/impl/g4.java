package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes6.dex */
public class g4 extends f4 {
    public g4(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.f4
    protected AdSessionContext a(WebView webView) {
        try {
            return this.f8832a.getOpenMeasurementVerificationScriptResources().size() > 0 ? AdSessionContext.createNativeAdSessionContext(this.f8833b.e0().b(), this.f8833b.e0().a(), this.f8832a.getOpenMeasurementVerificationScriptResources(), this.f8832a.getOpenMeasurementContentUrl(), this.f8832a.getOpenMeasurementCustomReferenceData()) : AdSessionContext.createHtmlAdSessionContext(this.f8833b.e0().b(), webView, this.f8832a.getOpenMeasurementContentUrl(), this.f8832a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8834c.a(this.f8835d, "Failed to create ad session context", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f8834c.a(this.f8835d, "Failed to create ad session configuration", th2);
            return null;
        }
    }
}
