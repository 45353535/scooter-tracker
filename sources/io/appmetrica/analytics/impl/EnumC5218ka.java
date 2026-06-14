package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC5218ka {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77603a;

    EnumC5218ka(int i10) {
        this.f77603a = i10;
    }

    public static EnumC5218ka a(Integer num) {
        if (num != null) {
            for (EnumC5218ka enumC5218ka : values()) {
                if (enumC5218ka.f77603a == num.intValue()) {
                    return enumC5218ka;
                }
            }
        }
        return UNKNOWN;
    }
}
