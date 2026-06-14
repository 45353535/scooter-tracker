package com.appodeal.ads.revenue;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/revenue/RevenuePrecision;", "", "precisionName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPrecisionName", "()Ljava/lang/String;", "Exact", "Estimated", "Undefined", "PublisherDefined", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RevenuePrecision {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevenuePrecision[] $VALUES;
    private final String precisionName;
    public static final RevenuePrecision Exact = new RevenuePrecision("Exact", 0, "exact");
    public static final RevenuePrecision Estimated = new RevenuePrecision("Estimated", 1, "estimated");
    public static final RevenuePrecision Undefined = new RevenuePrecision("Undefined", 2, "undefined");
    public static final RevenuePrecision PublisherDefined = new RevenuePrecision("PublisherDefined", 3, "publisher_defined");

    private static final /* synthetic */ RevenuePrecision[] $values() {
        return new RevenuePrecision[]{Exact, Estimated, Undefined, PublisherDefined};
    }

    static {
        RevenuePrecision[] revenuePrecisionArr$values = $values();
        $VALUES = revenuePrecisionArr$values;
        $ENTRIES = a.a(revenuePrecisionArr$values);
    }

    private RevenuePrecision(String str, int i10, String str2) {
        this.precisionName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RevenuePrecision valueOf(String str) {
        return (RevenuePrecision) Enum.valueOf(RevenuePrecision.class, str);
    }

    public static RevenuePrecision[] values() {
        return (RevenuePrecision[]) $VALUES.clone();
    }

    public final String getPrecisionName() {
        return this.precisionName;
    }
}
