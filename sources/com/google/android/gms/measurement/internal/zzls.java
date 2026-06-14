package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
public enum zzls {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    zzls(int i10) {
        this.zzg = i10;
    }

    public static zzls zzb(int i10) {
        for (zzls zzlsVar : values()) {
            if (zzlsVar.zzg == i10) {
                return zzlsVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
