package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhql extends zzibr implements zzidd {
    private static final zzhql zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzicd zzb = zzibr.zzbM();

    static {
        zzhql zzhqlVar = new zzhql();
        zzc = zzhqlVar;
        zzibr.zzbu(zzhql.class, zzhqlVar);
    }

    private zzhql() {
    }

    public static zzhql zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzhql) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public static zzhql zzg(InputStream inputStream, zzibb zzibbVar) throws IOException {
        return (zzhql) zzibr.zzbX(zzc, inputStream, zzibbVar);
    }

    public static zzhqi zzh() {
        return (zzhqi) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhqk zzd(int i10) {
        return (zzhqk) this.zzb.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhqk.class});
        }
        if (iOrdinal == 3) {
            return new zzhql();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqi(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar != null) {
            return zzidkVar;
        }
        synchronized (zzhql.class) {
            try {
                zzibmVar = zzd;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzc);
                    zzd = zzibmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzibmVar;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zza = i10;
    }

    final /* synthetic */ void zzj(zzhqk zzhqkVar) {
        zzhqkVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzhqkVar);
    }
}
