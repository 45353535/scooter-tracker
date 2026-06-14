package org.bidon.sdk.stats.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/stats/models/BidType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "RTB", "CPM", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BidType[] $VALUES;

    @NotNull
    private final String code;
    public static final BidType RTB = new BidType("RTB", 0, "RTB");
    public static final BidType CPM = new BidType("CPM", 1, "CPM");

    private static final /* synthetic */ BidType[] $values() {
        return new BidType[]{RTB, CPM};
    }

    static {
        BidType[] bidTypeArr$values = $values();
        $VALUES = bidTypeArr$values;
        $ENTRIES = a.a(bidTypeArr$values);
    }

    private BidType(String str, int i10, String str2) {
        this.code = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BidType valueOf(String str) {
        return (BidType) Enum.valueOf(BidType.class, str);
    }

    public static BidType[] values() {
        return (BidType[]) $VALUES.clone();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
