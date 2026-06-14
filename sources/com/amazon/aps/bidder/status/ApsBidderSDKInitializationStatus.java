package com.amazon.aps.bidder.status;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/bidder/status/ApsBidderSDKInitializationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsBidderSDKInitializationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApsBidderSDKInitializationStatus[] $VALUES;
    public static final ApsBidderSDKInitializationStatus SUCCESS = new ApsBidderSDKInitializationStatus("SUCCESS", 0);
    public static final ApsBidderSDKInitializationStatus FAILURE = new ApsBidderSDKInitializationStatus("FAILURE", 1);

    private static final /* synthetic */ ApsBidderSDKInitializationStatus[] $values() {
        return new ApsBidderSDKInitializationStatus[]{SUCCESS, FAILURE};
    }

    static {
        ApsBidderSDKInitializationStatus[] apsBidderSDKInitializationStatusArr$values = $values();
        $VALUES = apsBidderSDKInitializationStatusArr$values;
        $ENTRIES = a.a(apsBidderSDKInitializationStatusArr$values);
    }

    private ApsBidderSDKInitializationStatus(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ApsBidderSDKInitializationStatus valueOf(String str) {
        return (ApsBidderSDKInitializationStatus) Enum.valueOf(ApsBidderSDKInitializationStatus.class, str);
    }

    public static ApsBidderSDKInitializationStatus[] values() {
        return (ApsBidderSDKInitializationStatus[]) $VALUES.clone();
    }
}
