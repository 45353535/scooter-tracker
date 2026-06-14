package net.pubnative.lite.sdk.viewability;

import android.app.Application;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.pubnativenet.Omid;
import com.iab.omid.library.pubnativenet.adsession.AdEvents;
import com.iab.omid.library.pubnativenet.adsession.AdSession;
import com.iab.omid.library.pubnativenet.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubnativenet.adsession.AdSessionContext;
import com.iab.omid.library.pubnativenet.adsession.CreativeType;
import com.iab.omid.library.pubnativenet.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.pubnativenet.adsession.ImpressionType;
import com.iab.omid.library.pubnativenet.adsession.Owner;
import com.iab.omid.library.pubnativenet.adsession.Partner;
import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import com.iab.omid.library.pubnativenet.adsession.media.InteractionType;
import com.iab.omid.library.pubnativenet.adsession.media.MediaEvents;
import com.iab.omid.library.pubnativenet.adsession.media.Position;
import com.iab.omid.library.pubnativenet.adsession.media.VastProperties;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.viewability.baseom.BaseVerificationScriptResource;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;
import net.pubnative.lite.sdk.viewability.baseom.MediaEventType;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidViewabilityManager extends BaseViewabilityManager {
    private static final String TAG = "HyBidViewabilityManager";
    private static String VIEWABILITY_JS_SERVICE_CONTENT = null;
    private static final String VIEWABILITY_PARTNER_NAME = "Pubnativenet";
    private String contentUrl;
    private String customReferenceData;
    private Partner mPubNativePartner;
    private boolean mShouldMeasureViewability;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.viewability.HyBidViewabilityManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType;

        static {
            int[] iArr = new int[MediaEventType.values().length];
            $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType = iArr;
            try {
                iArr[MediaEventType.FIRST_QUARTILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.MIDPOINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.THIRD_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.BUFFER_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.BUFFER_FINISH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.SKIPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[MediaEventType.CLICK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public HyBidViewabilityManager(Application application) {
        super(application);
        this.mPubNativePartner = null;
        this.mShouldMeasureViewability = true;
        this.customReferenceData = "";
        this.contentUrl = "";
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void activateOmId(Application application) {
        Omid.activate(application);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void addFriendlyObstruction(Object obj, View view, Enum r42, String str) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).addFriendlyObstruction(view, r42 == BaseFriendlyObstructionPurpose.VIDEO_CONTROLS ? FriendlyObstructionPurpose.VIDEO_CONTROLS : FriendlyObstructionPurpose.OTHER, str);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createAdEvents(Object obj) {
        return (T) AdEvents.createAdEvents((AdSession) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createAdSession(T t10, T t11) {
        return (T) AdSession.createAdSession((AdSessionConfiguration) t10, (AdSessionContext) t11);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createHtmlAdSessionContext(WebView webView) {
        return (T) AdSessionContext.createHtmlAdSessionContext((Partner) getPartner(), webView, this.contentUrl, this.customReferenceData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createMediaEvents(T t10) {
        return (T) MediaEvents.createMediaEvents((AdSession) t10);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createNativeAdSessionContext(List<BaseVerificationScriptResource> list) {
        ArrayList arrayList = new ArrayList();
        for (BaseVerificationScriptResource baseVerificationScriptResource : list) {
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(baseVerificationScriptResource.getVendorKey(), baseVerificationScriptResource.getResourceUrl(), baseVerificationScriptResource.getVerificationParameters()));
        }
        return (T) AdSessionContext.createNativeAdSessionContext((Partner) createPartner(), getServiceJS(), arrayList, this.customReferenceData, this.contentUrl);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.iab.omid.library.pubnativenet.adsession.Partner] */
    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createPartner() {
        ?? r02 = (T) Partner.createPartner(getPartnerName(), getSdkVersion());
        this.mPubNativePartner = r02;
        return r02;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createVastPropertiesForNonSkippableMedia() {
        return (T) VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T createVastPropertiesForSkippableMedia(Integer num) {
        return (T) VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : -1.0f, false, Position.STANDALONE);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void fireEventProperties(Object obj, Object obj2) {
        if ((obj instanceof AdEvents) && (obj2 instanceof VastProperties)) {
            ((AdEvents) obj).loaded((VastProperties) obj2);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void fireImpression(Object obj) {
        if (obj instanceof AdEvents) {
            ((AdEvents) obj).impressionOccurred();
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void fireLoaded(Object obj) {
        if (obj instanceof AdEvents) {
            ((AdEvents) obj).loaded();
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void fireMediaEventStart(Object obj, float f10, float f11) {
        if (obj instanceof MediaEvents) {
            ((MediaEvents) obj).start(f10, f11);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void fireMediaEventVolumeChange(Object obj, float f10) {
        if (obj instanceof MediaEvents) {
            ((MediaEvents) obj).volumeChange(f10);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void fireMediaEvents(Enum r22, Object obj) {
        if (obj instanceof MediaEvents) {
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$viewability$baseom$MediaEventType[((MediaEventType) r22).ordinal()]) {
                case 1:
                    ((MediaEvents) obj).firstQuartile();
                    break;
                case 2:
                    ((MediaEvents) obj).midpoint();
                    break;
                case 3:
                    ((MediaEvents) obj).thirdQuartile();
                    break;
                case 4:
                    ((MediaEvents) obj).complete();
                    break;
                case 5:
                    ((MediaEvents) obj).pause();
                    break;
                case 6:
                    ((MediaEvents) obj).resume();
                    break;
                case 7:
                    ((MediaEvents) obj).bufferStart();
                    break;
                case 8:
                    ((MediaEvents) obj).bufferFinish();
                    break;
                case 9:
                    ((MediaEvents) obj).skipped();
                    break;
                case 10:
                    ((MediaEvents) obj).adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T getNativeAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        return (T) AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T getOwner(boolean z10) {
        return z10 ? (T) Owner.JAVASCRIPT : (T) Owner.NATIVE;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T getPartner() {
        return (T) this.mPubNativePartner;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public String getPartnerName() {
        return "Pubnativenet";
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public String getPartnerVersion() {
        return Omid.getVersion();
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public String getSdkVersion() {
        return "3.7.1";
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public String getServiceJS() {
        if (TextUtils.isEmpty(VIEWABILITY_JS_SERVICE_CONTENT)) {
            VIEWABILITY_JS_SERVICE_CONTENT = new String(Base64.decode(Assets.omsdkjs, 0));
        }
        return VIEWABILITY_JS_SERVICE_CONTENT;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public String getTag() {
        return TAG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public <T> T getWebAdSessionConfiguration(boolean z10, T t10) {
        Owner owner = (Owner) t10;
        return (T) AdSessionConfiguration.createAdSessionConfiguration(z10 ? CreativeType.DEFINED_BY_JAVASCRIPT : CreativeType.HTML_DISPLAY, z10 ? ImpressionType.DEFINED_BY_JAVASCRIPT : ImpressionType.BEGIN_TO_RENDER, owner, z10 ? owner : Owner.NONE, false);
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public boolean isOmActive() {
        return Omid.isActive();
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public boolean isViewabilityMeasurementActivated() {
        return Omid.isActive() && this.mShouldMeasureViewability;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public boolean isViewabilityMeasurementEnabled() {
        return this.mShouldMeasureViewability;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void registerAdView(Object obj, View view) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).registerAdView(view);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void setViewabilityMeasurementEnabled(boolean z10) {
        this.mShouldMeasureViewability = z10;
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void startAdSession(Object obj) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).start();
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager
    public void stopAdSession(Object obj) {
        if (obj instanceof AdSession) {
            ((AdSession) obj).finish();
        }
    }
}
