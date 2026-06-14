package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgj;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzfla implements zzfkz {
    private final ConcurrentHashMap zza;
    private final zzflg zzb;
    private final zzflc zzc = new zzflc();

    public zzfla(zzflg zzflgVar) {
        this.zza = new ConcurrentHashMap(zzflgVar.zzd);
        this.zzb = zzflgVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzflg> creator = zzflg.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhl)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zzflg zzflgVar = this.zzb;
            sb2.append(zzflgVar.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzg());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzflj) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfky) entry.getValue()).zzc(); i11++) {
                    sb2.append("[O]");
                }
                for (int iZzc = ((zzfky) entry.getValue()).zzc(); iZzc < zzflgVar.zzd; iZzc++) {
                    sb2.append("[ ]");
                }
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append(((zzfky) entry.getValue()).zzg());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            while (i10 < zzflgVar.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    @Nullable
    public final synchronized zzfli zza(zzflj zzfljVar) {
        zzfli zzfliVarZzb;
        try {
            zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
            if (zzfkyVar != null) {
                zzfliVarZzb = zzfkyVar.zzb();
                if (zzfliVarZzb == null) {
                    this.zzc.zzb();
                }
                zzflw zzflwVarZzh = zzfkyVar.zzh();
                if (zzfliVarZzb != null) {
                    zzbgj.zzb.zzc zzcVarZzs = zzbgj.zzb.zzs();
                    zzbgj.zzb.zza.C0338zza c0338zzaZzs = zzbgj.zzb.zza.zzs();
                    c0338zzaZzs.zzc(zzbgj.zzb.zzd.IN_MEMORY);
                    zzbgj.zzb.zze.zza zzaVarZzq = zzbgj.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzflwVarZzh.zza);
                    zzaVarZzq.zzg(zzflwVarZzh.zzb);
                    c0338zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c0338zzaZzs);
                    zzfliVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfliVarZzb = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzfliVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzb(zzflj zzfljVar, zzfli zzfliVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfky zzfkyVar = (zzfky) concurrentHashMap.get(zzfljVar);
            zzfliVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzfkyVar == null) {
                zzflg zzflgVar = this.zzb;
                zzfky zzfkyVar2 = new zzfky(zzflgVar.zzd, zzflgVar.zze * 1000);
                if (concurrentHashMap.size() == zzflgVar.zzc) {
                    int i10 = zzflgVar.zzg;
                    int i11 = i10 - 1;
                    zzflj zzfljVar2 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfky) entry.getValue()).zzd();
                                zzfljVar2 = (zzflj) entry.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfky) entry2.getValue()).zze();
                                zzfljVar2 = (zzflj) entry2.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i11 == 2) {
                        int iZzf = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfky) entry3.getValue()).zzf();
                                zzfljVar2 = (zzflj) entry3.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfljVar, zzfkyVar2);
                this.zzc.zzc();
                zzfkyVar = zzfkyVar2;
            }
            zZza = zzfkyVar.zza(zzfliVar);
            zzflc zzflcVar = this.zzc;
            zzflcVar.zze();
            zzflb zzflbVarZzf = zzflcVar.zzf();
            zzflw zzflwVarZzh = zzfkyVar.zzh();
            zzbgj.zzb.zzc zzcVarZzs = zzbgj.zzb.zzs();
            zzbgj.zzb.zza.C0338zza c0338zzaZzs = zzbgj.zzb.zza.zzs();
            c0338zzaZzs.zzc(zzbgj.zzb.zzd.IN_MEMORY);
            zzbgj.zzb.zzg.zza zzaVarZzs = zzbgj.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzflbVarZzf.zza);
            zzaVarZzs.zzg(zzflbVarZzf.zzb);
            zzaVarZzs.zzk(zzflwVarZzh.zzb);
            c0338zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0338zzaZzs);
            zzfliVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th2) {
            throw th2;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzc(zzflj zzfljVar) {
        zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
        if (zzfkyVar == null) {
            return true;
        }
        return zzfkyVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    @Deprecated
    public final zzflj zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzflg zzflgVar = this.zzb;
        return new zzflk(zzmVar, str, new zzbzx(zzflgVar.zza).zza().zzj, zzflgVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final zzflg zze() {
        return this.zzb;
    }
}
