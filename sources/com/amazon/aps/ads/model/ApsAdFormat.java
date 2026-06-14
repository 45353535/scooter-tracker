package com.amazon.aps.ads.model;

import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.l;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/amazon/aps/ads/model/ApsAdFormat;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "MREC", l.f44064d, "BANNER_SMART", "INTERSTITIAL", "REWARDED_VIDEO", "INSTREAM_VIDEO", C4240b4.f42493v, "", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsAdFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApsAdFormat[] $VALUES;
    public static final ApsAdFormat BANNER = new ApsAdFormat("BANNER", 0);
    public static final ApsAdFormat MREC = new ApsAdFormat("MREC", 1);
    public static final ApsAdFormat LEADERBOARD = new ApsAdFormat(l.f44064d, 2);
    public static final ApsAdFormat BANNER_SMART = new ApsAdFormat("BANNER_SMART", 3);
    public static final ApsAdFormat INTERSTITIAL = new ApsAdFormat("INTERSTITIAL", 4);
    public static final ApsAdFormat REWARDED_VIDEO = new ApsAdFormat("REWARDED_VIDEO", 5);
    public static final ApsAdFormat INSTREAM_VIDEO = new ApsAdFormat("INSTREAM_VIDEO", 6);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            try {
                iArr[ApsAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApsAdFormat.BANNER_SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApsAdFormat.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApsAdFormat.LEADERBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ApsAdFormat[] $values() {
        return new ApsAdFormat[]{BANNER, MREC, LEADERBOARD, BANNER_SMART, INTERSTITIAL, REWARDED_VIDEO, INSTREAM_VIDEO};
    }

    static {
        ApsAdFormat[] apsAdFormatArr$values = $values();
        $VALUES = apsAdFormatArr$values;
        $ENTRIES = a.a(apsAdFormatArr$values);
    }

    private ApsAdFormat(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ApsAdFormat valueOf(String str) {
        return (ApsAdFormat) Enum.valueOf(ApsAdFormat.class, str);
    }

    public static ApsAdFormat[] values() {
        return (ApsAdFormat[]) $VALUES.clone();
    }

    public final boolean isBanner() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
    }
}
