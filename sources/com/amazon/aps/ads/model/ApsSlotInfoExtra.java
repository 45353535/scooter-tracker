package com.amazon.aps.ads.model;

import com.amazon.device.ads.DtbLog;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.taurusx.tax.w.s.w;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import qf.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/amazon/aps/ads/model/ApsSlotInfoExtra;", "Ljava/io/Serializable;", "<init>", "()V", "videoStartDelay", "Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoStartDelayOption;", "getVideoStartDelay", "()Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoStartDelayOption;", "setVideoStartDelay", "(Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoStartDelayOption;)V", "videoPlcmt", "Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlcmtOption;", "getVideoPlcmt", "()Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlcmtOption;", "setVideoPlcmt", "(Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlcmtOption;)V", "videoPlacement", "Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlacementOption;", "getVideoPlacement", "()Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlacementOption;", "setVideoPlacement", "(Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlacementOption;)V", POBCTAOverlayData.KEY_CTA_POS, "Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$PosOption;", "getPos", "()Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$PosOption;", "setPos", "(Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$PosOption;)V", "getVideoSlotExtraJSON", "Lorg/json/JSONObject;", "PosOption", "VideoStartDelayOption", "VideoPlcmtOption", "VideoPlacementOption", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsSlotInfoExtra implements Serializable {

    @NotNull
    private VideoStartDelayOption videoStartDelay = VideoStartDelayOption.NO_VALUE;

    @NotNull
    private VideoPlcmtOption videoPlcmt = VideoPlcmtOption.NO_VALUE;

    @NotNull
    private VideoPlacementOption videoPlacement = VideoPlacementOption.NO_VALUE;

    @NotNull
    private PosOption pos = PosOption.NO_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$PosOption;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_VALUE", "UNKNOWN", "ABOVE_THE_FOLD", "BELOW_THE_FOLD", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PosOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PosOption[] $VALUES;
        private final int value;
        public static final PosOption NO_VALUE = new PosOption("NO_VALUE", 0, -1);
        public static final PosOption UNKNOWN = new PosOption("UNKNOWN", 1, 0);
        public static final PosOption ABOVE_THE_FOLD = new PosOption("ABOVE_THE_FOLD", 2, 1);
        public static final PosOption BELOW_THE_FOLD = new PosOption("BELOW_THE_FOLD", 3, 3);

        private static final /* synthetic */ PosOption[] $values() {
            return new PosOption[]{NO_VALUE, UNKNOWN, ABOVE_THE_FOLD, BELOW_THE_FOLD};
        }

        static {
            PosOption[] posOptionArr$values = $values();
            $VALUES = posOptionArr$values;
            $ENTRIES = a.a(posOptionArr$values);
        }

        private PosOption(String str, int i10, int i11) {
            this.value = i11;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PosOption valueOf(String str) {
            return (PosOption) Enum.valueOf(PosOption.class, str);
        }

        public static PosOption[] values() {
            return (PosOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlacementOption;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_VALUE", "INSTREAM", "IN_BANNER", "IN_ARTICLE", "IN_FEED", "INTERSTITIAL", "SLIDER", "FLOATING", w.f67531f, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlacementOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VideoPlacementOption[] $VALUES;
        private final int value;
        public static final VideoPlacementOption NO_VALUE = new VideoPlacementOption("NO_VALUE", 0, -1);
        public static final VideoPlacementOption INSTREAM = new VideoPlacementOption("INSTREAM", 1, 1);
        public static final VideoPlacementOption IN_BANNER = new VideoPlacementOption("IN_BANNER", 2, 2);
        public static final VideoPlacementOption IN_ARTICLE = new VideoPlacementOption("IN_ARTICLE", 3, 3);
        public static final VideoPlacementOption IN_FEED = new VideoPlacementOption("IN_FEED", 4, 4);
        public static final VideoPlacementOption INTERSTITIAL = new VideoPlacementOption("INTERSTITIAL", 5, 5);
        public static final VideoPlacementOption SLIDER = new VideoPlacementOption("SLIDER", 6, 5);
        public static final VideoPlacementOption FLOATING = new VideoPlacementOption("FLOATING", 7, 5);
        public static final VideoPlacementOption REWARDED = new VideoPlacementOption(w.f67531f, 8, 501);

        private static final /* synthetic */ VideoPlacementOption[] $values() {
            return new VideoPlacementOption[]{NO_VALUE, INSTREAM, IN_BANNER, IN_ARTICLE, IN_FEED, INTERSTITIAL, SLIDER, FLOATING, REWARDED};
        }

        static {
            VideoPlacementOption[] videoPlacementOptionArr$values = $values();
            $VALUES = videoPlacementOptionArr$values;
            $ENTRIES = a.a(videoPlacementOptionArr$values);
        }

        private VideoPlacementOption(String str, int i10, int i11) {
            this.value = i11;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static VideoPlacementOption valueOf(String str) {
            return (VideoPlacementOption) Enum.valueOf(VideoPlacementOption.class, str);
        }

        public static VideoPlacementOption[] values() {
            return (VideoPlacementOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoPlcmtOption;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_VALUE", "INSTREAM", "ACCOMPANYING_CONTENT", "INTERSTITIAL", "NO_CONTENT", "STANDALONE", w.f67531f, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlcmtOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VideoPlcmtOption[] $VALUES;
        private final int value;
        public static final VideoPlcmtOption NO_VALUE = new VideoPlcmtOption("NO_VALUE", 0, -1);
        public static final VideoPlcmtOption INSTREAM = new VideoPlcmtOption("INSTREAM", 1, 1);
        public static final VideoPlcmtOption ACCOMPANYING_CONTENT = new VideoPlcmtOption("ACCOMPANYING_CONTENT", 2, 2);
        public static final VideoPlcmtOption INTERSTITIAL = new VideoPlcmtOption("INTERSTITIAL", 3, 3);
        public static final VideoPlcmtOption NO_CONTENT = new VideoPlcmtOption("NO_CONTENT", 4, 4);
        public static final VideoPlcmtOption STANDALONE = new VideoPlcmtOption("STANDALONE", 5, 4);
        public static final VideoPlcmtOption REWARDED = new VideoPlcmtOption(w.f67531f, 6, 501);

        private static final /* synthetic */ VideoPlcmtOption[] $values() {
            return new VideoPlcmtOption[]{NO_VALUE, INSTREAM, ACCOMPANYING_CONTENT, INTERSTITIAL, NO_CONTENT, STANDALONE, REWARDED};
        }

        static {
            VideoPlcmtOption[] videoPlcmtOptionArr$values = $values();
            $VALUES = videoPlcmtOptionArr$values;
            $ENTRIES = a.a(videoPlcmtOptionArr$values);
        }

        private VideoPlcmtOption(String str, int i10, int i11) {
            this.value = i11;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static VideoPlcmtOption valueOf(String str) {
            return (VideoPlcmtOption) Enum.valueOf(VideoPlcmtOption.class, str);
        }

        public static VideoPlcmtOption[] values() {
            return (VideoPlcmtOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/aps/ads/model/ApsSlotInfoExtra$VideoStartDelayOption;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_VALUE", "POST_ROLL", "MID_ROLL", "PRE_ROLL", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoStartDelayOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VideoStartDelayOption[] $VALUES;
        private final int value;
        public static final VideoStartDelayOption NO_VALUE = new VideoStartDelayOption("NO_VALUE", 0, -3);
        public static final VideoStartDelayOption POST_ROLL = new VideoStartDelayOption("POST_ROLL", 1, -2);
        public static final VideoStartDelayOption MID_ROLL = new VideoStartDelayOption("MID_ROLL", 2, -1);
        public static final VideoStartDelayOption PRE_ROLL = new VideoStartDelayOption("PRE_ROLL", 3, 0);

        private static final /* synthetic */ VideoStartDelayOption[] $values() {
            return new VideoStartDelayOption[]{NO_VALUE, POST_ROLL, MID_ROLL, PRE_ROLL};
        }

        static {
            VideoStartDelayOption[] videoStartDelayOptionArr$values = $values();
            $VALUES = videoStartDelayOptionArr$values;
            $ENTRIES = a.a(videoStartDelayOptionArr$values);
        }

        private VideoStartDelayOption(String str, int i10, int i11) {
            this.value = i11;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static VideoStartDelayOption valueOf(String str) {
            return (VideoStartDelayOption) Enum.valueOf(VideoStartDelayOption.class, str);
        }

        public static VideoStartDelayOption[] values() {
            return (VideoStartDelayOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @NotNull
    public final PosOption getPos() {
        return this.pos;
    }

    @NotNull
    public final VideoPlacementOption getVideoPlacement() {
        return this.videoPlacement;
    }

    @NotNull
    public final VideoPlcmtOption getVideoPlcmt() {
        return this.videoPlcmt;
    }

    @Nullable
    public final JSONObject getVideoSlotExtraJSON() {
        try {
            JSONObject jSONObject = new JSONObject();
            VideoStartDelayOption videoStartDelayOption = this.videoStartDelay;
            if (videoStartDelayOption != VideoStartDelayOption.NO_VALUE) {
                jSONObject.put("startdelay", videoStartDelayOption.getValue());
            }
            VideoPlcmtOption videoPlcmtOption = this.videoPlcmt;
            if (videoPlcmtOption != VideoPlcmtOption.NO_VALUE) {
                jSONObject.put("plcmt", videoPlcmtOption.getValue());
            }
            VideoPlacementOption videoPlacementOption = this.videoPlacement;
            if (videoPlacementOption != VideoPlacementOption.NO_VALUE) {
                jSONObject.put("placement", videoPlacementOption.getValue());
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            DtbLog.warn("APSSlotInfoExtra", "Error constructing extra slot info json");
            return null;
        }
    }

    @NotNull
    public final VideoStartDelayOption getVideoStartDelay() {
        return this.videoStartDelay;
    }

    public final void setPos(@NotNull PosOption posOption) {
        Intrinsics.checkNotNullParameter(posOption, "<set-?>");
        this.pos = posOption;
    }

    public final void setVideoPlacement(@NotNull VideoPlacementOption videoPlacementOption) {
        Intrinsics.checkNotNullParameter(videoPlacementOption, "<set-?>");
        this.videoPlacement = videoPlacementOption;
    }

    public final void setVideoPlcmt(@NotNull VideoPlcmtOption videoPlcmtOption) {
        Intrinsics.checkNotNullParameter(videoPlcmtOption, "<set-?>");
        this.videoPlcmt = videoPlcmtOption;
    }

    public final void setVideoStartDelay(@NotNull VideoStartDelayOption videoStartDelayOption) {
        Intrinsics.checkNotNullParameter(videoStartDelayOption, "<set-?>");
        this.videoStartDelay = videoStartDelayOption;
    }
}
