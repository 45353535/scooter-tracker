package org.bidon.sdk.databinders.user;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/databinders/user/TrackingAuthorizationStatus;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Restricted", "Denied", "Authorized", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrackingAuthorizationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrackingAuthorizationStatus[] $VALUES;

    @NotNull
    private final String code;
    public static final TrackingAuthorizationStatus Restricted = new TrackingAuthorizationStatus("Restricted", 0, "RESTRICTED");
    public static final TrackingAuthorizationStatus Denied = new TrackingAuthorizationStatus("Denied", 1, "DENIED");
    public static final TrackingAuthorizationStatus Authorized = new TrackingAuthorizationStatus("Authorized", 2, "AUTHORIZED");

    private static final /* synthetic */ TrackingAuthorizationStatus[] $values() {
        return new TrackingAuthorizationStatus[]{Restricted, Denied, Authorized};
    }

    static {
        TrackingAuthorizationStatus[] trackingAuthorizationStatusArr$values = $values();
        $VALUES = trackingAuthorizationStatusArr$values;
        $ENTRIES = a.a(trackingAuthorizationStatusArr$values);
    }

    private TrackingAuthorizationStatus(String str, int i10, String str2) {
        this.code = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TrackingAuthorizationStatus valueOf(String str) {
        return (TrackingAuthorizationStatus) Enum.valueOf(TrackingAuthorizationStatus.class, str);
    }

    public static TrackingAuthorizationStatus[] values() {
        return (TrackingAuthorizationStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
