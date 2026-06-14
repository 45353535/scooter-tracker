package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzffq implements zzfgj {
    private final zzfgj zza;
    private final zzfgj zzb;
    private final zzflv zzc;
    private final String zzd;
    private zzdam zze;
    private final Executor zzf;

    public zzffq(zzfgj zzfgjVar, zzfgj zzfgjVar2, zzflv zzflvVar, String str, Executor executor) {
        this.zza = zzfgjVar;
        this.zzb = zzfgjVar2;
        this.zzc = zzflvVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfli zzfliVar, zzfgk zzfgkVar) {
        zzdam zzdamVar = zzfliVar.zza;
        this.zze = zzdamVar;
        if (zzfliVar.zzc != null) {
            if (zzdamVar.zzc() != null) {
                zzfliVar.zzc.zzp().zzu(zzfliVar.zza.zzc());
            }
            return zzgzo.zza(zzfliVar.zzc);
        }
        zzdamVar.zza().zzh(zzfliVar.zzb);
        return ((zzfga) this.zza).zzb(zzfgkVar, null, zzfliVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zze;
    }

    public final synchronized ListenableFuture zzb(final zzfgk zzfgkVar, final zzfgi zzfgiVar, zzdam zzdamVar) {
        zzdal zzdalVarZza = zzfgiVar.zza(zzfgkVar.zzb);
        zzdalVarZza.zzi(new zzffr(this.zzd));
        final zzdam zzdamVar2 = (zzdam) zzdalVarZza.zzh();
        zzdamVar2.zzb();
        zzdamVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzdamVar2.zzb().zzd;
        if (zzmVar.zzs != null || zzmVar.zzx != null) {
            this.zze = zzdamVar2;
            return ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar2);
        }
        zzfjk zzfjkVarZzb = zzdamVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzfjkVarZzb.zzd;
        String str = zzfjkVarZzb.zzg;
        com.google.android.gms.ads.internal.client.zzx zzxVar = zzfjkVarZzb.zzk;
        Executor executor = this.zzf;
        final zzffp zzffpVar = new zzffp(zzfgiVar, zzfgkVar, zzmVar2, str, executor, zzxVar, null);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(((zzffw) this.zzb).zza(zzfgkVar, zzfgiVar, zzdamVar2)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffo
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzfgkVar, zzffpVar, zzfgiVar, zzdamVar2, (zzffv) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfgk zzfgkVar, zzffp zzffpVar, zzfgi zzfgiVar, zzdam zzdamVar, zzffv zzffvVar) {
        if (zzffvVar != null) {
            zzffp zzffpVar2 = new zzffp(zzffpVar.zza, zzffpVar.zzb, zzffpVar.zzc, zzffpVar.zzd, zzffpVar.zze, zzffpVar.zzf, zzffvVar.zza);
            zzfli zzfliVar = zzffvVar.zzc;
            if (zzfliVar != null) {
                this.zze = null;
                this.zzc.zza(zzffpVar2);
                return zzg(zzfliVar, zzfgkVar);
            }
            zzflv zzflvVar = this.zzc;
            ListenableFuture listenableFutureZzb = zzflvVar.zzb(zzffpVar2);
            if (listenableFutureZzb != null) {
                this.zze = null;
                return zzgzo.zzj(listenableFutureZzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffn
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zzf((zzflr) obj);
                    }
                }, this.zzf);
            }
            zzflvVar.zza(zzffpVar2);
            zzfgkVar = new zzfgk(zzfgkVar.zzb, zzffvVar.zzb);
        }
        ListenableFuture listenableFutureZzb2 = ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        this.zze = zzdamVar;
        return listenableFutureZzb2;
    }

    final /* synthetic */ ListenableFuture zzf(zzflr zzflrVar) throws zzecr {
        zzfli zzfliVar;
        zzflt zzfltVar;
        if (zzflrVar == null || (zzfliVar = zzflrVar.zza) == null || (zzfltVar = zzflrVar.zzb) == null) {
            throw new zzecr(1, "Empty prefetch");
        }
        zzbgj.zzb.zzc zzcVarZzs = zzbgj.zzb.zzs();
        zzbgj.zzb.zza.C0338zza c0338zzaZzs = zzbgj.zzb.zza.zzs();
        c0338zzaZzs.zzc(zzbgj.zzb.zzd.IN_MEMORY);
        c0338zzaZzs.zzg(zzbgj.zzb.zze.zzs());
        zzcVarZzs.zzh(c0338zzaZzs);
        zzfliVar.zza.zza().zzd().zzl(zzcVarZzs.zzbu());
        return zzg(zzfliVar, ((zzffp) zzfltVar).zzb);
    }
}
