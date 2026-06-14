package com.mobilefuse.sdk;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.LoadableAdListener;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.controllers.ParsedPlacementId;
import com.mobilefuse.sdk.controllers.PlacementKt;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.state.AdState;
import com.mobilefuse.sdk.state.Stateful;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.utils.AdErrorCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u0018X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseBaseAd;", "T", "Lcom/mobilefuse/sdk/LoadableAdListener;", "Lcom/mobilefuse/sdk/state/Stateful;", "Lcom/mobilefuse/sdk/state/AdState;", "placement", "", "adType", "(Ljava/lang/String;Ljava/lang/String;)V", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "getAdInstanceInfo", "()Lcom/mobilefuse/sdk/AdInstanceInfo;", "forcedTestMode", "", "getForcedTestMode", "()Z", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener", "()Lcom/mobilefuse/sdk/LoadableAdListener;", "setListener", "(Lcom/mobilefuse/sdk/LoadableAdListener;)V", "Lcom/mobilefuse/sdk/LoadableAdListener;", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "getObservableConfig", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "placementId", "getPlacementId", "()Ljava/lang/String;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public abstract class MobileFuseBaseAd<T extends LoadableAdListener> extends Stateful<AdState> {

    @NotNull
    private final AdInstanceInfo adInstanceInfo;
    private final boolean forcedTestMode;

    @Nullable
    private T listener;

    @NotNull
    private final ObservableConfig observableConfig;

    @NotNull
    private final String placementId;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdState.NOT_FILLED.ordinal()] = 1;
            iArr[AdState.LOADED.ordinal()] = 2;
            iArr[AdState.RTB_EXPIRED.ordinal()] = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseBaseAd(@NotNull String placement, @NotNull String adType) throws Throwable {
        super(AdState.IDLE);
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adType, "adType");
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        ParsedPlacementId placementId = PlacementKt.parsePlacementId(placement);
        String placemenId = placementId.getPlacemenId();
        this.placementId = placemenId;
        this.forcedTestMode = placementId.isTestMode();
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType, placemenId);
        this.adInstanceInfo = adInstanceInfo;
        adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction(adInstanceInfo, null));
        observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, adInstanceInfo);
        observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, new AdErrorCallback() { // from class: com.mobilefuse.sdk.MobileFuseBaseAd.1
            @Override // com.mobilefuse.sdk.utils.AdErrorCallback
            public void onError(@NotNull AdError adError, @NotNull ObservableConfig observableConfig2) {
                Intrinsics.checkNotNullParameter(adError, "adError");
                Intrinsics.checkNotNullParameter(observableConfig2, "observableConfig");
                try {
                    MobileFuse.logDebug("Ad Error: " + adError);
                    LoadableAdListener listener = MobileFuseBaseAd.this.getListener();
                    if (listener != null) {
                        listener.onAdError(adError);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        });
        setOnStateChanged(new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseBaseAd.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LoadableAdListener listener;
                int i10 = WhenMappings.$EnumSwitchMapping$0[MobileFuseBaseAd.this.getState().ordinal()];
                if (i10 == 1) {
                    LoadableAdListener listener2 = MobileFuseBaseAd.this.getListener();
                    if (listener2 != null) {
                        listener2.onAdNotFilled();
                        return;
                    }
                    return;
                }
                if (i10 != 2) {
                    if (i10 == 3 && (listener = MobileFuseBaseAd.this.getListener()) != null) {
                        listener.onAdExpired();
                        return;
                    }
                    return;
                }
                LoadableAdListener listener3 = MobileFuseBaseAd.this.getListener();
                if (listener3 != null) {
                    listener3.onAdLoaded();
                }
            }
        });
    }

    @NotNull
    protected final AdInstanceInfo getAdInstanceInfo() {
        return this.adInstanceInfo;
    }

    protected final boolean getForcedTestMode() {
        return this.forcedTestMode;
    }

    @Nullable
    public final T getListener() {
        return this.listener;
    }

    @NotNull
    protected final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final void setListener(@Nullable T t10) {
        this.listener = t10;
    }
}
