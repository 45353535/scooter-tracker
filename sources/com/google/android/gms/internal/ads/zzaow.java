package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaow implements zzaon {
    private final zzapq zza;
    private String zzb;
    private zzagh zzc;
    private zzaov zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzape zzg = new zzape(32, 128);
    private final zzape zzh = new zzape(33, 128);
    private final zzape zzi = new zzape(34, 128);
    private final zzape zzj = new zzape(39, 128);
    private final zzape zzk = new zzape(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaow(zzapq zzapqVar, String str) {
        this.zza = zzapqVar;
    }

    private final void zzf(long j10, int i10, int i11, long j11) {
        this.zzd.zzb(j10, i10, i11, j11, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i11);
            this.zzh.zzc(i11);
            this.zzi.zzc(i11);
        }
        this.zzj.zzc(i11);
        this.zzk.zzc(i11);
    }

    private final void zzg(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zzd(bArr, i10, i11);
            this.zzh.zzd(bArr, i10, i11);
            this.zzi.zzd(bArr, i10, i11);
        }
        this.zzj.zzd(bArr, i10, i11);
        this.zzk.zzd(bArr, i10, i11);
    }

    private final void zzh(long j10, int i10, int i11, long j11) {
        this.zzd.zzd(j10, i10, this.zze);
        if (!this.zze) {
            zzape zzapeVar = this.zzg;
            zzapeVar.zze(i11);
            zzape zzapeVar2 = this.zzh;
            zzapeVar2.zze(i11);
            zzape zzapeVar3 = this.zzi;
            zzapeVar3.zze(i11);
            if (zzapeVar.zzb() && zzapeVar2.zzb() && zzapeVar3.zzb()) {
                String str = this.zzb;
                int i12 = zzapeVar.zzb;
                byte[] bArr = new byte[zzapeVar2.zzb + i12 + zzapeVar3.zzb];
                System.arraycopy(zzapeVar.zza, 0, bArr, 0, i12);
                System.arraycopy(zzapeVar2.zza, 0, bArr, zzapeVar.zzb, zzapeVar2.zzb);
                System.arraycopy(zzapeVar3.zza, 0, bArr, zzapeVar.zzb + zzapeVar2.zzb, zzapeVar3.zzb);
                String strZzb = null;
                zzgg zzggVarZzg = zzgm.zzg(zzapeVar2.zza, 3, zzapeVar2.zzb, null);
                zzgb zzgbVar = zzggVarZzg.zzb;
                if (zzgbVar != null) {
                    int i13 = zzgbVar.zzf;
                    int[] iArr = zzgbVar.zze;
                    int i14 = zzgbVar.zzd;
                    strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, i14, iArr, i13);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(strZzb);
                zztVar.zzt(zzggVarZzg.zze);
                zztVar.zzu(zzggVarZzg.zzf);
                zztVar.zzv(zzggVarZzg.zzg);
                zztVar.zzw(zzggVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzggVarZzg.zzk);
                zzhVar.zzb(zzggVarZzg.zzl);
                zzhVar.zzc(zzggVarZzg.zzm);
                zzhVar.zze(zzggVarZzg.zzc + 8);
                zzhVar.zzf(zzggVarZzg.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzggVarZzg.zzi);
                zztVar.zzo(zzggVarZzg.zzj);
                zztVar.zzD(zzggVarZzg.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzvVarZzM = zztVar.zzM();
                this.zzc.zzz(zzvVarZzM);
                int i15 = zzvVarZzM.zzq;
                zzgrc.zzi(i15 != -1);
                this.zza.zzb(i15);
                this.zze = true;
            }
        }
        zzape zzapeVar4 = this.zzj;
        if (zzapeVar4.zze(i11)) {
            int iZza = zzgm.zza(zzapeVar4.zza, zzapeVar4.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar4.zza, iZza);
            zzerVar.zzk(5);
            this.zza.zzc(j11, zzerVar);
        }
        zzape zzapeVar5 = this.zzk;
        if (zzapeVar5.zze(i11)) {
            int iZza2 = zzgm.zza(zzapeVar5.zza, zzapeVar5.zzb);
            zzer zzerVar2 = this.zzn;
            zzerVar2.zzb(zzapeVar5.zza, iZza2);
            zzerVar2.zzk(5);
            this.zza.zzc(j11, zzerVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaov zzaovVar = this.zzd;
        if (zzaovVar != null) {
            zzaovVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzb = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzc = zzaghVarZzu;
        this.zzd = new zzaov(zzaghVarZzu);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzm = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r18) {
        /*
            r17 = this;
            r0 = r17
            r7 = 3
            com.google.android.gms.internal.ads.zzagh r1 = r0.zzc
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfj.zza
        La:
            int r1 = r18.zzd()
            if (r1 <= 0) goto L78
            int r1 = r18.zzg()
            int r8 = r18.zze()
            byte[] r9 = r18.zzi()
            long r2 = r0.zzl
            int r4 = r18.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.zzl = r2
            com.google.android.gms.internal.ads.zzagh r2 = r0.zzc
            int r3 = r18.zzd()
            r10 = r18
            r2.zzc(r10, r3)
        L31:
            if (r1 >= r8) goto La
            boolean[] r2 = r0.zzf
            int r2 = com.google.android.gms.internal.ads.zzgm.zzi(r9, r1, r8, r2)
            if (r2 == r8) goto L75
            int r3 = r2 + 3
            r3 = r9[r3]
            r3 = r3 & 126(0x7e, float:1.77E-43)
            if (r2 <= 0) goto L4d
            int r4 = r2 + (-1)
            r5 = r9[r4]
            if (r5 != 0) goto L4d
            r2 = 4
            r12 = r2
            r11 = r4
            goto L4f
        L4d:
            r11 = r2
            r12 = r7
        L4f:
            int r2 = r11 - r1
            if (r2 <= 0) goto L56
            r0.zzg(r9, r1, r11)
        L56:
            r1 = r3
            int r3 = r8 - r11
            long r4 = r0.zzl
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L61
            int r2 = -r2
            goto L62
        L61:
            r2 = 0
        L62:
            int r13 = r1 >> 1
            r15 = r4
            r4 = r2
            r1 = r15
            long r5 = r0.zzm
            r0.zzh(r1, r3, r4, r5)
            long r5 = r0.zzm
            r4 = r13
            r0.zzf(r1, r3, r4, r5)
            int r1 = r11 + r12
            goto L31
        L75:
            r0.zzg(r9, r1, r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        this.zzc.getClass();
        String str = zzfj.zza;
        if (z10) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
