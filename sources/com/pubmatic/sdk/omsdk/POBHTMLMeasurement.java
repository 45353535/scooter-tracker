package com.pubmatic.sdk.omsdk;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.Omid;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSession;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.CreativeType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;
import com.iab.omid.library.pubmatic.adsession.Partner;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class POBHTMLMeasurement extends POBMeasurement implements POBHTMLMeasurementProvider {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62680a;

        static {
            int[] iArr = new int[POBHTMLMeasurementProvider.POBHTMLAdEventType.values().length];
            f62680a = iArr;
            try {
                iArr[POBHTMLMeasurementProvider.POBHTMLAdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62680a[POBHTMLMeasurementProvider.POBHTMLAdEventType.IMPRESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider
    public void signalAdEvent(@NonNull POBHTMLMeasurementProvider.POBHTMLAdEventType pOBHTMLAdEventType) {
        if (this.adEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBHTMLAdEventType.name());
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", pOBHTMLAdEventType.name());
            int i10 = a.f62680a[pOBHTMLAdEventType.ordinal()];
            if (i10 == 1) {
                this.adEvents.loaded();
            } else {
                if (i10 != 2) {
                    return;
                }
                this.adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBHTMLAdEventType.name());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider
    public void startAdSession(@NonNull WebView webView) {
        try {
            Context applicationContext = webView.getContext().getApplicationContext();
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Pubmatic", "4.10.0"), webView, null, ""));
            this.adSession = adSessionCreateAdSession;
            adSessionCreateAdSession.registerAdView(webView);
            this.adEvents = AdEvents.createAdEvents(this.adSession);
            this.adSession.start();
            POBLog.debug(POBOMSDKUtil.TAG, "Ad session started", new Object[0]);
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", e10.getMessage());
        }
    }
}
