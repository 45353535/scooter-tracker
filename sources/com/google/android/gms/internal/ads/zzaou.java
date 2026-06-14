package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaou implements zzaon {
    private final zzapq zza;
    private long zzf;
    private String zzh;
    private zzagh zzi;
    private zzaot zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzape zzc = new zzape(7, 128);
    private final zzape zzd = new zzape(8, 128);
    private final zzape zze = new zzape(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaou(zzapq zzapqVar, boolean z10, boolean z11, String str) {
        this.zza = zzapqVar;
    }

    private final void zzf(long j10, int i10, long j11) {
        if (!this.zzk) {
            this.zzc.zzc(i10);
            this.zzd.zzc(i10);
        }
        this.zze.zzc(i10);
        this.zzj.zzd(j10, i10, j11, this.zzm);
    }

    private final void zzg(byte[] bArr, int i10, int i11) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i10, i11);
            this.zzd.zzd(bArr, i10, i11);
        }
        this.zze.zzd(bArr, i10, i11);
    }

    private final void zzh(long j10, int i10, int i11, long j11) {
        if (!this.zzk) {
            zzape zzapeVar = this.zzc;
            zzapeVar.zze(i11);
            zzape zzapeVar2 = this.zzd;
            zzapeVar2.zze(i11);
            if (this.zzk) {
                if (zzapeVar.zzb()) {
                    zzgl zzglVarZze = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                    this.zza.zzb(zzglVarZze.zzm);
                    this.zzj.zza(zzglVarZze);
                    zzapeVar.zza();
                } else if (zzapeVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb));
                    zzapeVar2.zza();
                }
            } else if (zzapeVar.zzb() && zzapeVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzapeVar.zza, zzapeVar.zzb));
                arrayList.add(Arrays.copyOf(zzapeVar2.zza, zzapeVar2.zzb));
                zzgl zzglVarZze2 = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                zzgk zzgkVarZzh = zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb);
                String strZza = zzdo.zza(zzglVarZze2.zza, zzglVarZze2.zzb, zzglVarZze2.zzc);
                zzagh zzaghVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(strZza);
                zztVar.zzt(zzglVarZze2.zze);
                zztVar.zzu(zzglVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzglVarZze2.zzj);
                zzhVar.zzb(zzglVarZze2.zzk);
                zzhVar.zzc(zzglVarZze2.zzl);
                zzhVar.zze(zzglVarZze2.zzh + 8);
                zzhVar.zzf(zzglVarZze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzglVarZze2.zzg);
                zztVar.zzp(arrayList);
                int i12 = zzglVarZze2.zzm;
                zztVar.zzo(i12);
                zzaghVar.zzz(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i12);
                this.zzj.zza(zzglVarZze2);
                this.zzj.zzb(zzgkVarZzh);
                zzapeVar.zza();
                zzapeVar2.zza();
            }
        }
        zzape zzapeVar3 = this.zze;
        if (zzapeVar3.zze(i11)) {
            int iZza = zzgm.zza(zzapeVar3.zza, zzapeVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar3.zza, iZza);
            zzerVar.zzh(4);
            this.zza.zzc(j11, zzerVar);
        }
        if (this.zzj.zze(j10, i10, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaot zzaotVar = this.zzj;
        if (zzaotVar != null) {
            zzaotVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzi = zzaghVarZzu;
        this.zzj = new zzaot(zzaghVarZzu, false, false);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
        int i11 = i10 & 2;
        this.zzm = (i11 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r16) {
        /*
            r15 = this;
            r7 = 3
            com.google.android.gms.internal.ads.zzagh r1 = r15.zzi
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfj.zza
            int r1 = r16.zzg()
            int r8 = r16.zze()
            byte[] r9 = r16.zzi()
            long r2 = r15.zzf
            int r4 = r16.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r15.zzf = r2
            com.google.android.gms.internal.ads.zzagh r2 = r15.zzi
            int r3 = r16.zzd()
            r4 = r16
            r2.zzc(r4, r3)
        L29:
            boolean[] r2 = r15.zzg
            int r2 = com.google.android.gms.internal.ads.zzgm.zzi(r9, r1, r8, r2)
            if (r2 == r8) goto L6a
            int r3 = r2 + 3
            r3 = r9[r3]
            r10 = r3 & 31
            if (r2 <= 0) goto L43
            int r3 = r2 + (-1)
            r4 = r9[r3]
            if (r4 != 0) goto L43
            r2 = 4
            r12 = r2
            r11 = r3
            goto L45
        L43:
            r11 = r2
            r12 = r7
        L45:
            int r2 = r11 - r1
            if (r2 <= 0) goto L4c
            r15.zzg(r9, r1, r11)
        L4c:
            int r3 = r8 - r11
            long r4 = r15.zzf
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L57
            int r1 = -r2
        L55:
            r13 = r4
            goto L59
        L57:
            r1 = 0
            goto L55
        L59:
            long r5 = r15.zzl
            r0 = r15
            r4 = r1
            r1 = r13
            r0.zzh(r1, r3, r4, r5)
            long r4 = r15.zzl
            r3 = r10
            r0.zzf(r1, r3, r4)
            int r1 = r11 + r12
            goto L29
        L6a:
            r15.zzg(r9, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaou.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z10) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
