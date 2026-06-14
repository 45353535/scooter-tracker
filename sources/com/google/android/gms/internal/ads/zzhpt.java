package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public enum zzhpt implements zzibv {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzhpt(int i10) {
        this.zzh = i10;
    }

    public static zzhpt zzb(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
