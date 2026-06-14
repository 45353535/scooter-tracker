package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public enum N8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76159a;

    N8(int i10) {
        this.f76159a = i10;
    }

    public static N8 a(Integer num) {
        if (num != null) {
            for (N8 n82 : values()) {
                if (n82.f76159a == num.intValue()) {
                    return n82;
                }
            }
        }
        return NONE;
    }
}
