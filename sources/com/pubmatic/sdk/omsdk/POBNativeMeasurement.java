package com.pubmatic.sdk.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.Omid;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSession;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.CreativeType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;
import com.iab.omid.library.pubmatic.adsession.Partner;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class POBNativeMeasurement extends POBMeasurement implements POBNativeMeasurementProvider {

    @NonNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    class a implements POBMeasurementProvider.POBScriptListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f62681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f62682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ POBNativeMeasurementProvider.POBOmidSessionListener f62683c;

        a(List list, View view, POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            this.f62681a = list;
            this.f62682b = view;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onFailedToReceiveMeasurementScript(int i10) {
            POBLog.error(POBOMSDKUtil.TAG, "Failed to fetch OMID JS script.", new Object[0]);
            throw null;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onMeasurementScriptReceived(String str) {
            final POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener = null;
            AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Pubmatic", "4.10.0"), str, this.f62681a, null, "");
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            POBNativeMeasurement.this.adSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
            POBNativeMeasurement.this.adSession.registerAdView(this.f62682b);
            POBNativeMeasurement pOBNativeMeasurement = POBNativeMeasurement.this;
            pOBNativeMeasurement.adEvents = AdEvents.createAdEvents(pOBNativeMeasurement.adSession);
            POBNativeMeasurement.this.handler.post(new Runnable(pOBOmidSessionListener) { // from class: com.pubmatic.sdk.omsdk.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62693b.a(null);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            AdSession adSession = POBNativeMeasurement.this.adSession;
            if (adSession != null) {
                adSession.start();
                POBLog.debug(POBOMSDKUtil.TAG, "Ad session started", new Object[0]);
                pOBOmidSessionListener.onOmidSessionInitialized();
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62685a;

        static {
            int[] iArr = new int[POBNativeMeasurementProvider.POBNativeAdEventType.values().length];
            f62685a = iArr;
            try {
                iArr[POBNativeMeasurementProvider.POBNativeAdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62685a[POBNativeMeasurementProvider.POBNativeAdEventType.IMPRESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider
    public void signalAdEvent(@NonNull POBNativeMeasurementProvider.POBNativeAdEventType pOBNativeAdEventType) {
        if (this.adEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBNativeAdEventType.name());
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", pOBNativeAdEventType.name());
            int i10 = b.f62685a[pOBNativeAdEventType.ordinal()];
            if (i10 == 1) {
                this.adEvents.loaded();
            } else if (i10 != 2) {
                POBLog.warn(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBNativeAdEventType.name());
            } else {
                this.adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBNativeAdEventType.name());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider
    public void startAdSession(@NonNull View view, @Nullable List<? extends POBVerificationScriptResource> list, @NonNull POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
        try {
            List<VerificationScriptResource> verificationScriptResourceList = POBOMSDKUtil.getVerificationScriptResourceList(list);
            if (verificationScriptResourceList.isEmpty()) {
                POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", "Verification list is empty");
                pOBOmidSessionListener.onOmidSessionInitializationFailed();
            } else {
                Context applicationContext = view.getContext().getApplicationContext();
                if (!Omid.isActive()) {
                    Omid.activate(applicationContext);
                }
                omidJsServiceScript(applicationContext, new a(verificationScriptResourceList, view, pOBOmidSessionListener));
            }
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", e10.getMessage());
        }
    }
}
