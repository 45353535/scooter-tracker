package net.pubnative.lite.sdk.viewability.baseom;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import java.util.List;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseViewabilityManager {
    private Object mPartner = null;
    private boolean mShouldMeasureViewability = true;

    public BaseViewabilityManager(final Application application) {
        final String tag = getTag() != null ? getTag() : BaseViewabilityManager.class.getSimpleName();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fh.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseViewabilityManager.a(this.f72035b, application, tag);
            }
        });
    }

    public static /* synthetic */ void a(BaseViewabilityManager baseViewabilityManager, Application application, String str) {
        baseViewabilityManager.getClass();
        try {
            if (!baseViewabilityManager.isOmActive()) {
                baseViewabilityManager.activateOmId(application);
            }
        } catch (IllegalArgumentException unused) {
            Logger.e(str, "Could not initialise Omid");
        }
        if (baseViewabilityManager.isOmActive() && baseViewabilityManager.mPartner == null) {
            try {
                baseViewabilityManager.mPartner = baseViewabilityManager.createPartner();
            } catch (IllegalArgumentException unused2) {
                Logger.e(str, "Could not initialise Omid");
            }
        }
    }

    public abstract void activateOmId(Application application);

    public abstract void addFriendlyObstruction(Object obj, View view, Enum r32, String str);

    public abstract <T> T createAdEvents(Object obj);

    public abstract <T> T createAdSession(T t10, T t11);

    public abstract <T> T createHtmlAdSessionContext(WebView webView);

    public abstract <T> T createMediaEvents(T t10);

    public abstract <T> T createNativeAdSessionContext(List<BaseVerificationScriptResource> list);

    public abstract <T> T createPartner();

    public abstract <T> T createVastPropertiesForNonSkippableMedia();

    public abstract <T> T createVastPropertiesForSkippableMedia(Integer num);

    public abstract void fireEventProperties(Object obj, Object obj2);

    public abstract void fireImpression(Object obj);

    public abstract void fireLoaded(Object obj);

    public abstract void fireMediaEventStart(Object obj, float f10, float f11);

    public abstract void fireMediaEventVolumeChange(Object obj, float f10);

    public abstract void fireMediaEvents(Enum r12, Object obj);

    public abstract <T> T getNativeAdSessionConfiguration();

    public abstract <T> T getOwner(boolean z10);

    public abstract <T> T getPartner();

    public abstract String getPartnerName();

    public abstract String getPartnerVersion();

    public abstract String getSdkVersion();

    public abstract String getServiceJS();

    public abstract String getTag();

    public abstract <T> T getWebAdSessionConfiguration(boolean z10, T t10);

    public abstract boolean isOmActive();

    public boolean isViewabilityMeasurementActivated() {
        return isOmActive() && this.mShouldMeasureViewability;
    }

    public boolean isViewabilityMeasurementEnabled() {
        return this.mShouldMeasureViewability;
    }

    public abstract void registerAdView(Object obj, View view);

    public void setViewabilityMeasurementEnabled(boolean z10) {
        this.mShouldMeasureViewability = z10;
    }

    public abstract void startAdSession(Object obj);

    public abstract void stopAdSession(Object obj);
}
