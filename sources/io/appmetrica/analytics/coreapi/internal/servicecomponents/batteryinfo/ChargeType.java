package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* JADX INFO: loaded from: classes12.dex */
public enum ChargeType {
    UNKNOWN(-1),
    NONE(0),
    USB(1),
    WIRELESS(2),
    AC(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f75206a;

    ChargeType(int i10) {
        this.f75206a = i10;
    }

    public static ChargeType fromId(Integer num) {
        if (num != null) {
            for (ChargeType chargeType : values()) {
                if (chargeType.getId() == num.intValue()) {
                    return chargeType;
                }
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return this.f75206a;
    }
}
