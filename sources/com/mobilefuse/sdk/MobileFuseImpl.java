package com.mobilefuse.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.identity.IdentifierUpdateSignal;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class MobileFuseImpl {
    static final String SDK_NAME = "MobileFuse Ads";
    MobileFusePrivacyPreferences privacyPreferences = new MobileFusePrivacyPreferences.Builder().build();

    @NonNull
    final List<SdkInitListener> awaitingInitListeners = new ArrayList();

    @NonNull
    private SdkInitState sdkInitState = SdkInitState.NOT_INITIALIZED;

    @NonNull
    final TelemetryAgent telemetryAgent = new TelemetryAgent(MobileFuse.class);

    public enum SdkInitState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    MobileFuseImpl() throws Throwable {
    }

    public static /* synthetic */ Unit a(MobileFuseImpl mobileFuseImpl, Either either) {
        mobileFuseImpl.getClass();
        try {
            EidService.getService().handleSdkStateChanged(IdentifierUpdateSignal.SDK_INIT);
            mobileFuseImpl.onSdkInitComplete(either instanceof SuccessResult);
        } catch (Throwable th2) {
            StabilityHelper.logException(mobileFuseImpl, th2);
        }
        return Unit.f93236a;
    }

    void destroy() {
        this.sdkInitState = SdkInitState.NOT_INITIALIZED;
    }

    @Nullable
    String getDisableReason() {
        return MobileFuseServices.getSdkDisableReason();
    }

    @NonNull
    public MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    public String getSdkVersion() {
        return "1.9.3";
    }

    public void initSdk(@Nullable SdkInitListener sdkInitListener) throws Throwable {
        MobileFuseAssetManager.INSTANCE.requestAssetsManifest();
        if (this.sdkInitState == SdkInitState.INITIALIZED) {
            logDebug("The MobileFuse SDK has been already initialized. Calling the \"onInitSuccess\" callback.");
            if (sdkInitListener != null) {
                sdkInitListener.onInitSuccess();
                return;
            }
            return;
        }
        if (sdkInitListener != null) {
            this.awaitingInitListeners.add(sdkInitListener);
        }
        SdkInitState sdkInitState = this.sdkInitState;
        SdkInitState sdkInitState2 = SdkInitState.INITIALIZING;
        if (sdkInitState == sdkInitState2) {
            logDebug("The MobileFuse SDK has been already requested to initialize. The callback will be called after completed sdk initialization.");
        } else {
            this.sdkInitState = sdkInitState2;
            MobileFuseServices.initAllServices(new Function1() { // from class: com.mobilefuse.sdk.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MobileFuseImpl.a(this.f53432b, (Either) obj);
                }
            });
        }
    }

    boolean isEnabled() {
        return MobileFuseServices.getSdkEnabled();
    }

    public void logDebug(String str) {
        Log.d("MobileFuse SDK", str);
    }

    public void logError(String str) {
        Log.e("MobileFuse SDK", str);
    }

    void onSdkInitComplete(boolean z10) throws Throwable {
        this.sdkInitState = SdkInitState.INITIALIZED;
        for (SdkInitListener sdkInitListener : this.awaitingInitListeners) {
            if (sdkInitListener != null) {
                if (z10) {
                    sdkInitListener.onInitSuccess();
                } else {
                    sdkInitListener.onInitError();
                }
            }
        }
        this.awaitingInitListeners.clear();
    }

    public void setPrivacyPreferences(@NonNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        if (mobileFusePrivacyPreferences == null) {
            return;
        }
        if (this.privacyPreferences.equals(mobileFusePrivacyPreferences)) {
            MobileFuse.logDebug("setPrivacyPreferences: Success, already up to date (current preferences match new values). [prefs: " + this.privacyPreferences + C4240b4.j.f42674e);
            return;
        }
        this.privacyPreferences = mobileFusePrivacyPreferences;
        MobileFuse.logDebug("Changed privacy preferences to: " + this.privacyPreferences);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_DNT, Boolean.valueOf(mobileFusePrivacyPreferences.isDoNotTrack()), true));
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_SUBJECT_TO_COPPA, Boolean.valueOf(mobileFusePrivacyPreferences.isSubjectToCoppa()), true));
            if (mobileFusePrivacyPreferences.getUsPrivacyConsentString() != null) {
                arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_US_PRIVACY_STRING, mobileFusePrivacyPreferences.getUsPrivacyConsentString(), true));
            }
            if (mobileFusePrivacyPreferences.getGppConsentString() != null) {
                arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.PRIVACY_PREFERENCES_GPP_CONTENT_STRING, mobileFusePrivacyPreferences.getGppConsentString(), true));
            }
            this.telemetryAgent.onAction(TelemetryActionFactory.createInfoAction(this, TelemetryActionSdkEvents.SDK_SET_PRIVACY_PREFERENCES.updateExtraMessageField(this.privacyPreferences.getHumanReadableNonEmptyValues()), arrayList));
        } catch (Throwable unused) {
        }
        try {
            EidService.getService().handleSdkStateChanged(IdentifierUpdateSignal.PRIVACY_PREFS_CHANGED);
        } catch (Throwable unused2) {
        }
    }

    public void logError(String str, Throwable th2) {
        Log.e("MobileFuse SDK", str, th2);
    }
}
