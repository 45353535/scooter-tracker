package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwf extends zzyp {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzwd zze;

    @Nullable
    private zzwc zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzwf(zzwm zzwmVar, boolean z10) {
        boolean z11;
        super(zzwmVar);
        if (z10) {
            zzwmVar.zzI();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzwmVar.zzH();
        this.zze = zzwd.zzp(zzwmVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzwd.zzc)) ? obj : this.zze.zzs();
    }

    private final boolean zzL(long j10) {
        zzwc zzwcVar = this.zzf;
        int iZze = this.zze.zze(zzwcVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzwd zzwdVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzwdVar.zzd(iZze, zzbdVar, false);
        long j11 = zzbdVar.zzd;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zzwcVar.zzo(j10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvj, com.google.android.gms.internal.ads.zzwm
    public final void zzA(zzak zzakVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzyl(this.zze.zzb, zzakVar));
        } else {
            this.zze = zzwd.zzp(zzakVar);
        }
        ((zzyp) this).zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzyp) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzyp, com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzwc zzG(zzwk zzwkVar, zzaan zzaanVar, long j10) {
        zzwc zzwcVar = new zzwc(zzwkVar, zzaanVar, j10);
        zzwcVar.zzr(((zzyp) this).zza);
        if (this.zzh) {
            zzwcVar.zzt(zzwkVar.zza(zzK(zzwkVar.zza)));
            return zzwcVar;
        }
        this.zzf = zzwcVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzyp) this).zza);
        }
        return zzwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp, com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzwc) zzwiVar).zzu();
        if (zzwiVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzbf r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzwd r0 = r11.zze
            com.google.android.gms.internal.ads.zzwd r12 = r0.zzr(r12)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzwc r12 = r11.zzf
            if (r12 == 0) goto L97
            long r2 = r12.zzq()
            r11.zzL(r2)
            goto L97
        L1a:
            boolean r0 = r12.zzg()
            if (r0 == 0) goto L36
            boolean r0 = r11.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzwd r0 = r11.zze
            com.google.android.gms.internal.ads.zzwd r12 = r0.zzr(r12)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbe.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzwd.zzc
            com.google.android.gms.internal.ads.zzwd r12 = com.google.android.gms.internal.ads.zzwd.zzq(r12, r0, r2)
        L33:
            r11.zze = r12
            goto L97
        L36:
            com.google.android.gms.internal.ads.zzbe r3 = r11.zzc
            r0 = 0
            r4 = 0
            r12.zzb(r0, r3, r4)
            java.lang.Object r8 = r3.zzb
            com.google.android.gms.internal.ads.zzwc r2 = r11.zzf
            if (r2 == 0) goto L5d
            long r6 = r2.zza()
            com.google.android.gms.internal.ads.zzwd r9 = r11.zze
            com.google.android.gms.internal.ads.zzbd r10 = r11.zzd
            com.google.android.gms.internal.ads.zzwk r2 = r2.zza
            java.lang.Object r2 = r2.zza
            r9.zzo(r2, r10)
            com.google.android.gms.internal.ads.zzwd r2 = r11.zze
            r2.zzb(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r6 = r4
        L5e:
            com.google.android.gms.internal.ads.zzbd r4 = r11.zzd
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.zzm(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.zzi
            if (r12 == 0) goto L7b
            com.google.android.gms.internal.ads.zzwd r12 = r11.zze
            com.google.android.gms.internal.ads.zzwd r12 = r12.zzr(r2)
            goto L7f
        L7b:
            com.google.android.gms.internal.ads.zzwd r12 = com.google.android.gms.internal.ads.zzwd.zzq(r2, r8, r0)
        L7f:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzwc r12 = r11.zzf
            if (r12 == 0) goto L97
            boolean r0 = r11.zzL(r3)
            if (r0 == 0) goto L97
            com.google.android.gms.internal.ads.zzwk r12 = r12.zza
            java.lang.Object r0 = r12.zza
            java.lang.Object r0 = r11.zzK(r0)
            com.google.android.gms.internal.ads.zzwk r1 = r12.zza(r0)
        L97:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzwd r12 = r11.zze
            r11.zze(r12)
            if (r1 == 0) goto Lab
            com.google.android.gms.internal.ads.zzwc r12 = r11.zzf
            r12.getClass()
            r12.zzt(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.zzE(com.google.android.gms.internal.ads.zzbf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    @Nullable
    protected final zzwk zzF(zzwk zzwkVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzwkVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzwd.zzc;
        }
        return zzwkVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbf zzz() {
        return this.zze;
    }
}
