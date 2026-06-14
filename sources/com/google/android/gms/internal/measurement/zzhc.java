package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhc extends zzmf implements zznn {
    private static final zzhc zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzhc zzhcVar = new zzhc();
        zzk = zzhcVar;
        zzmf.zzcp(zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzhc();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhb(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }
}
