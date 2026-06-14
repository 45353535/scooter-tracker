package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public enum zzbch implements zzibv {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private final int zzh;

    zzbch(int i10) {
        this.zzh = i10;
    }

    public static zzbch zzb(int i10) {
        if (i10 == 0) {
            return UNSUPPORTED;
        }
        if (i10 == 2) {
            return ARM7;
        }
        if (i10 == 999) {
            return UNKNOWN;
        }
        if (i10 == 4) {
            return X86;
        }
        if (i10 == 5) {
            return ARM64;
        }
        if (i10 == 6) {
            return X86_64;
        }
        if (i10 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static zzibx zzc() {
        return zzbcg.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    public final int zza() {
        return this.zzh;
    }
}
