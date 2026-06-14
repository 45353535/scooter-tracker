package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class zzcwf implements zzens {
    protected final zzfjc zza;
    protected final zzfir zzb;
    private final zzdce zzc;
    private final zzdcr zzd;

    @Nullable
    private final zzfgg zze;
    private final zzday zzf;
    private final zzdfw zzg;
    private final zzdcv zzh;
    private final zzdjb zzi;
    private final zzczz zzj;
    private final zzdzc zzk;

    protected zzcwf(zzcwe zzcweVar) {
        this.zza = zzcweVar.zza();
        this.zzb = zzcweVar.zzb();
        this.zzc = zzcweVar.zzc();
        this.zzd = zzcweVar.zzd();
        this.zze = zzcweVar.zze();
        this.zzf = zzcweVar.zzf();
        this.zzg = zzcweVar.zzg();
        this.zzh = zzcweVar.zzh();
        this.zzi = zzcweVar.zzi();
        this.zzj = zzcweVar.zzj();
        this.zzk = zzcweVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzdce zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzday zzn() {
        return this.zzf;
    }

    public final zzczz zzo() {
        return this.zzj;
    }

    @Nullable
    public final zzfgg zzp() {
        return this.zze;
    }

    public final zzdev zzq() {
        return this.zzg.zzn();
    }

    public final zzfjc zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        zzdzc zzdzcVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzdzcVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziQ)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzgwu zzgwuVarListIterator = ((zzguf) list).listIterator(0);
        while (zzgwuVarListIterator.hasNext()) {
            zzdzd zzdzdVar = (zzdzd) zzgwuVarListIterator.next();
            int[] iArr = zzdzdVar.zzb;
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 1) {
                    zzdzcVar.zza(zzdzdVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
                i10++;
            }
        }
    }
}
