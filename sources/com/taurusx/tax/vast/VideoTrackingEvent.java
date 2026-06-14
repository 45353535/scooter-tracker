package com.taurusx.tax.vast;

import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/taurusx/tax/vast/VideoTrackingEvent;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toFloat", "", "START", "FIRST_QUARTILE", "MIDPOINT", "THIRD_QUARTILE", "COMPLETE", "COMPANION_AD_VIEW", "COMPANION_AD_CLICK", "UNKNOWN", y.f66058y, "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum VideoTrackingEvent {
    START("start"),
    FIRST_QUARTILE("firstQuartile"),
    MIDPOINT("midpoint"),
    THIRD_QUARTILE("thirdQuartile"),
    COMPLETE("complete"),
    COMPANION_AD_VIEW("companionAdView"),
    COMPANION_AD_CLICK("companionAdClick"),
    UNKNOWN("");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final String f67054z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taurusx/tax/vast/VideoTrackingEvent$Companion;", "", "()V", "fromString", "Lcom/taurusx/tax/vast/VideoTrackingEvent;", "name", "", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VideoTrackingEvent fromString(@Nullable String name) {
            VideoTrackingEvent videoTrackingEvent;
            VideoTrackingEvent[] videoTrackingEventArrValuesCustom = VideoTrackingEvent.valuesCustom();
            int length = videoTrackingEventArrValuesCustom.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    videoTrackingEvent = null;
                    break;
                }
                videoTrackingEvent = videoTrackingEventArrValuesCustom[i10];
                if (StringsKt.N(videoTrackingEvent.getF67054z(), name, true)) {
                    break;
                }
                i10++;
            }
            return videoTrackingEvent == null ? VideoTrackingEvent.UNKNOWN : videoTrackingEvent;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTrackingEvent.valuesCustom().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    VideoTrackingEvent(String str) {
        this.f67054z = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static VideoTrackingEvent[] valuesCustom() {
        VideoTrackingEvent[] videoTrackingEventArrValuesCustom = values();
        return (VideoTrackingEvent[]) Arrays.copyOf(videoTrackingEventArrValuesCustom, videoTrackingEventArrValuesCustom.length);
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final String getF67054z() {
        return this.f67054z;
    }

    public final float toFloat() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return 0.25f;
        }
        if (iOrdinal == 2) {
            return 0.5f;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 0.0f : 1.0f;
        }
        return 0.75f;
    }
}
