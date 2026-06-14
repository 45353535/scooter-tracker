package org.bidon.sdk.ads.banner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerFormat;", "", "<init>", "(Ljava/lang/String;I)V", "Banner", "LeaderBoard", "MRec", "Adaptive", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BannerFormat[] $VALUES;
    public static final BannerFormat Banner = new BannerFormat("Banner", 0);
    public static final BannerFormat LeaderBoard = new BannerFormat("LeaderBoard", 1);
    public static final BannerFormat MRec = new BannerFormat("MRec", 2);
    public static final BannerFormat Adaptive = new BannerFormat("Adaptive", 3);

    private static final /* synthetic */ BannerFormat[] $values() {
        return new BannerFormat[]{Banner, LeaderBoard, MRec, Adaptive};
    }

    static {
        BannerFormat[] bannerFormatArr$values = $values();
        $VALUES = bannerFormatArr$values;
        $ENTRIES = qf.a.a(bannerFormatArr$values);
    }

    private BannerFormat(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BannerFormat valueOf(String str) {
        return (BannerFormat) Enum.valueOf(BannerFormat.class, str);
    }

    public static BannerFormat[] values() {
        return (BannerFormat[]) $VALUES.clone();
    }
}
