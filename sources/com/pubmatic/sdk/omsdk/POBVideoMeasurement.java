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
import com.iab.omid.library.pubmatic.adsession.ErrorType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;
import com.iab.omid.library.pubmatic.adsession.Partner;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.iab.omid.library.pubmatic.adsession.media.InteractionType;
import com.iab.omid.library.pubmatic.adsession.media.MediaEvents;
import com.iab.omid.library.pubmatic.adsession.media.PlayerState;
import com.iab.omid.library.pubmatic.adsession.media.Position;
import com.iab.omid.library.pubmatic.adsession.media.VastProperties;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class POBVideoMeasurement extends POBMeasurement implements POBVideoMeasurementProvider {

    @NonNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @Nullable
    private MediaEvents mediaEvents;

    class a implements POBMeasurementProvider.POBScriptListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f62686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f62687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ POBVideoMeasurementProvider.POBOmidSessionListener f62688c;

        a(List list, View view, POBVideoMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            this.f62686a = list;
            this.f62687b = view;
            this.f62688c = pOBOmidSessionListener;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onFailedToReceiveMeasurementScript(int i10) {
            POBLog.error(POBOMSDKUtil.TAG, "Failed to fetch OMID JS script.", new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onMeasurementScriptReceived(String str) {
            AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Pubmatic", "4.10.0"), str, this.f62686a, null, "");
            Owner owner = Owner.NATIVE;
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.ONE_PIXEL, owner, owner, false);
            POBVideoMeasurement.this.adSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
            POBVideoMeasurement pOBVideoMeasurement = POBVideoMeasurement.this;
            pOBVideoMeasurement.adEvents = AdEvents.createAdEvents(pOBVideoMeasurement.adSession);
            POBVideoMeasurement pOBVideoMeasurement2 = POBVideoMeasurement.this;
            pOBVideoMeasurement2.mediaEvents = MediaEvents.createMediaEvents(pOBVideoMeasurement2.adSession);
            POBVideoMeasurement.this.setTrackView(this.f62687b);
            Handler handler = POBVideoMeasurement.this.handler;
            final POBVideoMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener = this.f62688c;
            handler.post(new Runnable() { // from class: com.pubmatic.sdk.omsdk.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62694b.a(pOBOmidSessionListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(POBVideoMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            AdSession adSession = POBVideoMeasurement.this.adSession;
            if (adSession != null) {
                adSession.start();
                pOBOmidSessionListener.onOmidSessionInitialized();
                POBLog.debug(POBOMSDKUtil.TAG, "Ad session started", new Object[0]);
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f62691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f62692c;

        static {
            int[] iArr = new int[POBVideoMeasurementProvider.POBVideoAdErrorType.values().length];
            f62692c = iArr;
            try {
                iArr[POBVideoMeasurementProvider.POBVideoAdErrorType.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62692c[POBVideoMeasurementProvider.POBVideoAdErrorType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[POBVideoMeasurementProvider.POBVideoPlayerState.values().length];
            f62691b = iArr2;
            try {
                iArr2[POBVideoMeasurementProvider.POBVideoPlayerState.FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62691b[POBVideoMeasurementProvider.POBVideoPlayerState.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62691b[POBVideoMeasurementProvider.POBVideoPlayerState.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62691b[POBVideoMeasurementProvider.POBVideoPlayerState.MINIMIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62691b[POBVideoMeasurementProvider.POBVideoPlayerState.NORMAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[POBDataType$POBVideoAdEventType.values().length];
            f62690a = iArr3;
            try {
                iArr3[POBDataType$POBVideoAdEventType.FIRST_QUARTILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.MID_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.THIRD_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.SKIPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.MUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.UNMUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.CLICKED.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.PAUSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.RESUME.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f62690a[POBDataType$POBVideoAdEventType.ICON_CLICKED.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.pubmatic.sdk.omsdk.POBMeasurement, com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    public void finishAdSession() {
        super.finishAdSession();
        this.adEvents = null;
        this.mediaEvents = null;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void impressionOccurred() {
        if (this.adEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", "IMPRESSION");
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", "IMPRESSION");
            this.adEvents.impressionOccurred();
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s Exception : %s", "IMPRESSION", e10.getMessage());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void loaded(boolean z10, float f10) {
        if (this.adEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", "LOADED");
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", "LOADED");
            this.adEvents.loaded(z10 ? VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s Exception : %s", "LOADED", e10.getMessage());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void signalAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
        if (this.mediaEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBDataType$POBVideoAdEventType.name());
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", pOBDataType$POBVideoAdEventType.name());
            switch (b.f62690a[pOBDataType$POBVideoAdEventType.ordinal()]) {
                case 1:
                    this.mediaEvents.firstQuartile();
                    break;
                case 2:
                    this.mediaEvents.midpoint();
                    break;
                case 3:
                    this.mediaEvents.thirdQuartile();
                    break;
                case 4:
                    this.mediaEvents.complete();
                    break;
                case 5:
                    this.mediaEvents.skipped();
                    break;
                case 6:
                    this.mediaEvents.volumeChange(0.0f);
                    break;
                case 7:
                    this.mediaEvents.volumeChange(1.0f);
                    break;
                case 8:
                    this.mediaEvents.adUserInteraction(InteractionType.CLICK);
                    break;
                case 9:
                    this.mediaEvents.pause();
                    break;
                case 10:
                    this.mediaEvents.resume();
                    break;
                case 11:
                    this.mediaEvents.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
                    break;
            }
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s Exception : %s", pOBDataType$POBVideoAdEventType.name(), e10.getMessage());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void signalError(@NonNull POBVideoMeasurementProvider.POBVideoAdErrorType pOBVideoAdErrorType, @NonNull String str) {
        if (this.adSession == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal error : %s", pOBVideoAdErrorType.name());
            return;
        }
        int i10 = b.f62692c[pOBVideoAdErrorType.ordinal()];
        if (i10 == 1) {
            this.adSession.error(ErrorType.GENERIC, str);
        } else {
            if (i10 != 2) {
                return;
            }
            this.adSession.error(ErrorType.VIDEO, str);
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void signalPlayerStateChange(@NonNull POBVideoMeasurementProvider.POBVideoPlayerState pOBVideoPlayerState) {
        if (this.mediaEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal player state event : %s", pOBVideoPlayerState.name());
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", pOBVideoPlayerState.name());
            int i10 = b.f62691b[pOBVideoPlayerState.ordinal()];
            if (i10 == 1) {
                this.mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
                return;
            }
            if (i10 == 2) {
                this.mediaEvents.playerStateChange(PlayerState.COLLAPSED);
                return;
            }
            if (i10 == 3) {
                this.mediaEvents.playerStateChange(PlayerState.EXPANDED);
            } else if (i10 == 4) {
                this.mediaEvents.playerStateChange(PlayerState.MINIMIZED);
            } else {
                if (i10 != 5) {
                    return;
                }
                this.mediaEvents.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal player state event : %s Exception : %s", pOBVideoPlayerState.name(), e10.getMessage());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void start(float f10, float f11) {
        if (this.mediaEvents == null) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", "START");
            return;
        }
        try {
            POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", "START");
            this.mediaEvents.start(f10, f11);
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s Exception : %s", "START", e10.getMessage());
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider
    public void startAdSession(@NonNull View view, @Nullable List<POBVerificationScriptResource> list, @NonNull POBVideoMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
        try {
            List<VerificationScriptResource> verificationScriptResourceList = POBOMSDKUtil.getVerificationScriptResourceList(list);
            if (verificationScriptResourceList.isEmpty()) {
                POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", "Verification list is empty");
                return;
            }
            Context applicationContext = view.getContext().getApplicationContext();
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            omidJsServiceScript(applicationContext, new a(verificationScriptResourceList, view, pOBOmidSessionListener));
        } catch (Exception e10) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", e10.getMessage());
        }
    }
}
