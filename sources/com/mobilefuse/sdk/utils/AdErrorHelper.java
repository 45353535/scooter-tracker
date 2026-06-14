package com.mobilefuse.sdk.utils;

import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/utils/AdErrorHelper;", "", "()V", y.f66058y, "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AdErrorHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/utils/AdErrorHelper$Companion;", "", "()V", TelemetryAdLifecycleEvent.AD_ERROR, "", "adError", "Lcom/mobilefuse/sdk/AdError;", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "onAdRenderingError", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public final void onAdError(@NotNull AdError adError, @Nullable ObservableConfig observableConfig) throws Throwable {
            Intrinsics.checkNotNullParameter(adError, "adError");
            if (observableConfig == null) {
                return;
            }
            try {
                Object value = observableConfig.getValue(ObservableConfigKey.AD_ERROR_CALLBACK);
                if (!(value instanceof AdErrorCallback)) {
                    value = null;
                }
                AdErrorCallback adErrorCallback = (AdErrorCallback) value;
                if (adErrorCallback == null) {
                    return;
                }
                adErrorCallback.onError(adError, observableConfig);
            } catch (Exception unused) {
            }
        }

        public final void onAdRenderingError(@Nullable ObservableConfig observableConfig) throws Throwable {
            try {
                onAdError(AdError.AD_RUNTIME_ERROR, observableConfig);
            } catch (Exception unused) {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void onAdError(@NotNull AdError adError, @Nullable ObservableConfig observableConfig) throws Throwable {
        INSTANCE.onAdError(adError, observableConfig);
    }

    public static final void onAdRenderingError(@Nullable ObservableConfig observableConfig) throws Throwable {
        INSTANCE.onAdRenderingError(observableConfig);
    }
}
