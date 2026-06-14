package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhu extends zzmf implements zznn {
    private static final zzhu zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        zzhu zzhuVar = new zzhu();
        zzf = zzhuVar;
        zzmf.zzcp(zzhu.class, zzhuVar);
    }

    private zzhu() {
    }

    public static zzht zza() {
        return (zzht) zzf.zzck();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void zzc(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzhu();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzht(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
