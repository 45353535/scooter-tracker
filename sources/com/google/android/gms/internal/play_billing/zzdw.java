package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdw extends zzfu implements zzhc {
    private static final zzdw zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzdw zzdwVar = new zzdw();
        zzb = zzdwVar;
        zzfu.zzB(zzdw.class, zzdwVar);
    }

    private zzdw() {
    }

    public static zzdw zzc(byte[] bArr) throws zzgc {
        return (zzdw) zzfu.zzt(zzb, bArr);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzfu.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzdw();
        }
        zzdz zzdzVar = null;
        if (i11 == 4) {
            return new zzdv(zzdzVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String zze() {
        return this.zzf;
    }
}
