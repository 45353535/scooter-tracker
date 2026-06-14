package com.mobilefuse.sdk.internal.mute;

import com.ironsource.C4240b4;
import com.mobilefuse.sdk.AdInstanceInfo;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.config.Observer;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/internal/mute/MutableAdController;", "Lcom/mobilefuse/sdk/internal/mute/MutableAd;", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "(Lcom/mobilefuse/sdk/config/ObservableConfig;Lcom/mobilefuse/sdk/AdInstanceInfo;)V", "muteChangedListener", "Lcom/mobilefuse/sdk/MuteChangedListener;", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "getObservableConfig", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "init", "", "isMuted", "", "onConfigPropertyChanged", C4240b4.i.W, "Lcom/mobilefuse/sdk/config/ObservableConfigKey;", "value", "", "onMuted", "muted", "comesFromVideoUI", "setMuted", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MutableAdController implements MutableAd {
    private final AdInstanceInfo adInstanceInfo;

    @Nullable
    private MuteChangedListener muteChangedListener;

    @NotNull
    private final ObservableConfig observableConfig;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObservableConfigKey.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ObservableConfigKey.MUTED.ordinal()] = 1;
            iArr[ObservableConfigKey.MUTED_FROM_VIDEO_UI.ordinal()] = 2;
        }
    }

    public MutableAdController(@NotNull ObservableConfig observableConfig, @NotNull AdInstanceInfo adInstanceInfo) {
        Intrinsics.checkNotNullParameter(observableConfig, "observableConfig");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        this.observableConfig = observableConfig;
        this.adInstanceInfo = adInstanceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfigPropertyChanged(ObservableConfigKey key, Object value) {
        if (this.observableConfig.getBooleanValue(ObservableConfigKey.MUTE_ENABLED)) {
            if (!(value instanceof Boolean)) {
                value = null;
            }
            Boolean bool = (Boolean) value;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            int i10 = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
            if (i10 == 1) {
                onMuted(zBooleanValue, false);
            } else {
                if (i10 != 2) {
                    return;
                }
                onMuted(zBooleanValue, true);
            }
        }
    }

    private final void onMuted(boolean muted, boolean comesFromVideoUI) {
        MuteChangedListener muteChangedListener = getMuteChangedListener();
        if (muteChangedListener != null) {
            muteChangedListener.onMutedChanged(muted);
        }
        this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createMutedAdAction(muted, this.adInstanceInfo, comesFromVideoUI));
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.muteChangedListener;
    }

    @NotNull
    public final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public final void init() throws Throwable {
        ObservableConfig observableConfig = this.observableConfig;
        observableConfig.setValue(ObservableConfigKey.MUTE_ENABLED, Boolean.TRUE);
        final MutableAdController$init$1$1 mutableAdController$init$1$1 = new MutableAdController$init$1$1(this);
        observableConfig.registerObserver(new Observer() { // from class: com.mobilefuse.sdk.internal.mute.MutableAdController$sam$com_mobilefuse_sdk_config_Observer$0
            @Override // com.mobilefuse.sdk.config.Observer
            public final /* synthetic */ void onChanged(ObservableConfigKey observableConfigKey, Object obj) {
                Intrinsics.checkNotNullExpressionValue(mutableAdController$init$1$1.invoke(observableConfigKey, obj), "invoke(...)");
            }
        });
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        try {
            return this.observableConfig.getBooleanValue(ObservableConfigKey.MUTED);
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
            return false;
        }
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.muteChangedListener = muteChangedListener;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(boolean muted) throws Throwable {
        try {
            this.observableConfig.setValue(ObservableConfigKey.PUBLISHER_MUTED, Boolean.valueOf(muted));
            this.observableConfig.setValue(ObservableConfigKey.AWAITING_MUTED, Boolean.valueOf(muted));
            this.observableConfig.setValue(ObservableConfigKey.MUTED, Boolean.valueOf(muted));
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
        }
    }
}
