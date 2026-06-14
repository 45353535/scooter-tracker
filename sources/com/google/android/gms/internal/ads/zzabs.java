package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzabs {
    final /* synthetic */ zzabt zza;
    private zzv zzb;

    /* synthetic */ zzabs(zzabt zzabtVar, byte[] bArr) {
        Objects.requireNonNull(zzabtVar);
        this.zza = zzabtVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzt(zzbvVar.zzb);
        zztVar.zzu(zzbvVar.zzc);
        zztVar.zzm(MimeTypes.VIDEO_RAW);
        this.zzb = zztVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzabt zzabtVar = this.zza;
            if (zzabtVar.zzA() != null) {
                zzabtVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzM = this.zzb;
        if (zzvVarZzM == null) {
            zzvVarZzM = new zzt().zzM();
        }
        zzv zzvVar = zzvVarZzM;
        zzabt zzabtVar2 = this.zza;
        zzabtVar2.zzD().zzcS(j11, j10, zzvVar, null);
        ((zzadp) zzabtVar2.zzz().remove()).zza(j10);
    }
}
