package com.amazon.aps.ads.util;

import androidx.annotation.VisibleForTesting;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.util.ApsMraidHandler;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBMRAIDCloseButtonListener;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/aps/ads/util/ApsMraidHandler;", "Lcom/amazon/device/ads/DTBAdMRAIDController;", "apsAdView", "Lcom/amazon/aps/ads/ApsAdView;", "<init>", "(Lcom/amazon/aps/ads/ApsAdView;)V", "mraidListener", "Lcom/amazon/aps/ads/util/ApsMraidCloseButtonListener;", "setCloseButtonListener", "", "apsMraidListener", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@VisibleForTesting
public abstract class ApsMraidHandler extends DTBAdMRAIDController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String MRAID_CLOSE = DTBAdMRAIDController.MRAID_CLOSE;

    @Nullable
    private ApsMraidCloseButtonListener mraidListener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/aps/ads/util/ApsMraidHandler$Companion;", "", "<init>", "()V", "MRAID_CLOSE", "", "getMRAID_CLOSE", "()Ljava/lang/String;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getMRAID_CLOSE() {
            return ApsMraidHandler.MRAID_CLOSE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMraidHandler(@NotNull ApsAdView apsAdView) {
        super(apsAdView);
        Intrinsics.checkNotNullParameter(apsAdView, "apsAdView");
        super.setCustomButtonListener(new DTBMRAIDCloseButtonListener() { // from class: v0.a
            @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
            public final void useCustomButtonUpdated() {
                ApsMraidHandler._init_$lambda$0(this.f105673b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ApsMraidHandler apsMraidHandler) {
        ApsMraidCloseButtonListener apsMraidCloseButtonListener = apsMraidHandler.mraidListener;
        if (apsMraidCloseButtonListener != null) {
            apsMraidCloseButtonListener.useCustomButtonUpdated();
        }
    }

    public final void setCloseButtonListener(@NotNull ApsMraidCloseButtonListener apsMraidListener) {
        Intrinsics.checkNotNullParameter(apsMraidListener, "apsMraidListener");
        this.mraidListener = apsMraidListener;
    }
}
