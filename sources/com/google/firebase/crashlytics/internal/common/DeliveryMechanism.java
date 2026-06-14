package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes9.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32075b;

    DeliveryMechanism(int i10) {
        this.f32075b = i10;
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f32075b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f32075b);
    }
}
