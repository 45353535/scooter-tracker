package com.appodeal.ads.revenue;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/revenue/RevenuePlatform;", "", "stringValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "APPODEAL", "APPLOVIN_MAX", "LEVEL_PLAY", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RevenuePlatform {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevenuePlatform[] $VALUES;
    private final String stringValue;
    public static final RevenuePlatform APPODEAL = new RevenuePlatform("APPODEAL", 0, "Appodeal");
    public static final RevenuePlatform APPLOVIN_MAX = new RevenuePlatform("APPLOVIN_MAX", 1, "AppLovinMax");
    public static final RevenuePlatform LEVEL_PLAY = new RevenuePlatform("LEVEL_PLAY", 2, "LevelPlay");

    private static final /* synthetic */ RevenuePlatform[] $values() {
        return new RevenuePlatform[]{APPODEAL, APPLOVIN_MAX, LEVEL_PLAY};
    }

    static {
        RevenuePlatform[] revenuePlatformArr$values = $values();
        $VALUES = revenuePlatformArr$values;
        $ENTRIES = a.a(revenuePlatformArr$values);
    }

    private RevenuePlatform(String str, int i10, String str2) {
        this.stringValue = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RevenuePlatform valueOf(String str) {
        return (RevenuePlatform) Enum.valueOf(RevenuePlatform.class, str);
    }

    public static RevenuePlatform[] values() {
        return (RevenuePlatform[]) $VALUES.clone();
    }

    public final String getStringValue() {
        return this.stringValue;
    }
}
