package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbgj;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeid implements zzfnv {
    private final zzehr zza;
    private final zzehv zzb;

    zzeid(zzehr zzehrVar, zzehv zzehvVar) {
        this.zza = zzehrVar;
        this.zzb = zzehvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            if (zzfno.RENDERER == zzfnoVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfno.PRELOADED_LOADER == zzfnoVar || zzfno.SERVER_TRANSACTION == zzfnoVar) {
                zzehr zzehrVar = this.zza;
                zzehrVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzehv zzehvVar = this.zzb;
                final long jZzb = zzehrVar.zzb();
                zzehvVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehu
                    @Override // com.google.android.gms.internal.ads.zzfmu
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzehvVar.zzf()) {
                            return null;
                        }
                        long j10 = jZzb;
                        zzbgj.zzaf.zza.C0337zza c0337zzaZzz = zzbgj.zzaf.zza.zzz();
                        c0337zzaZzz.zzad(j10);
                        byte[] bArrZzaN = c0337zzaZzz.zzbu().zzaN();
                        zzeic.zzf(sQLiteDatabase, false, false);
                        zzeic.zze(sQLiteDatabase, j10, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
            zzehr zzehrVar = this.zza;
            if (zzehrVar.zzh() != 0) {
                zzehrVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzehrVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
            zzehr zzehrVar = this.zza;
            if (zzehrVar.zzh() != 0) {
                zzehrVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzehrVar.zzh());
            }
        }
    }
}
