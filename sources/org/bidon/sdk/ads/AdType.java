package org.bidon.sdk.ads;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/ads/AdType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Banner", "Interstitial", "Rewarded", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdType[] $VALUES;
    public static final AdType Banner = new AdType("Banner", 0, "banner");
    public static final AdType Interstitial = new AdType("Interstitial", 1, "interstitial");
    public static final AdType Rewarded = new AdType("Rewarded", 2, "rewarded");

    @NotNull
    private final String code;

    private static final /* synthetic */ AdType[] $values() {
        return new AdType[]{Banner, Interstitial, Rewarded};
    }

    static {
        AdType[] adTypeArr$values = $values();
        $VALUES = adTypeArr$values;
        $ENTRIES = a.a(adTypeArr$values);
    }

    private AdType(String str, int i10, String str2) {
        this.code = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) $VALUES.clone();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
