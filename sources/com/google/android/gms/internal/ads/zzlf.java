package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;

    @Nullable
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;

    @Nullable
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i10, boolean z10, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j10, boolean z11, boolean z12, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, @Nullable zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        int i11 = 0;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j10;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zzmdVarZza = zzmd.zza(zzaakVar);
        this.zzG = zzmdVarZza;
        this.zzH = new zzlc(zzmdVarZza);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzmmVarZzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z13 = false;
        for (int i12 = 2; i11 < i12; i12 = 2) {
            zzmlVarArr[i11].zzc(i11, zzpqVar, zzdnVar);
            this.zzc[i11] = zzmlVarArr[i11].zzb();
            this.zzc[i11].zzv(zzmmVarZzg);
            zzml zzmlVar = zzmlVarArr2[i11];
            if (zzmlVar != null) {
                zzmlVar.zzc(i11, zzpqVar, zzdnVar);
                z13 = true;
            }
            this.zzb[i11] = new zzmp(zzmlVarArr[i11], zzmlVarArr2[i11], i11);
            i11++;
        }
        this.zzy = z13;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzdxVarZzd = zzdnVar.zzd(looper, null);
        this.zzx = zzdxVarZzd;
        this.zzs = new zzlq(zzmxVar, zzdxVarZzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzdxVarZzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper looperZza = zzmeVar2.zza();
        this.zzk = looperZza;
        zzdx zzdxVarZzd2 = zzdnVar.zzd(looperZza, this);
        this.zzi = zzdxVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdxVarZzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ void zzcS(long j11, long j12, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j11, j12, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i10) {
        zzlq zzlqVar = this.zzs;
        zziw zziwVarZza = zziw.zza(iOException, i10);
        zzln zzlnVarZzm = zzlqVar.zzm();
        if (zzlnVarZzm != null) {
            zziwVarZza = zziwVarZza.zzd(zzlnVarZzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zziwVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zziwVarZza);
    }

    private final void zzB(int i10) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i10) {
            if (i10 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i10);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f10) throws zziw {
        this.zzac = f10;
        float fZza = f10 * this.zzz.zza();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzL(fZza);
            i10++;
        }
    }

    private final void zzE(boolean z10, int i10, boolean z11, int i11) throws zziw {
        this.zzH.zza(z11 ? 1 : 0);
        zzG(z10, i10, i11);
    }

    private final void zzF() throws zziw {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z10, int i10, int i11) throws zziw {
        zzH(z10, this.zzz.zzc(z10, this.zzG.zze), i10, i11);
    }

    private final void zzH(boolean z10, int i10, int i11, int i12) throws zziw {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.zzC;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zzl == z11 && zzmdVar.zzn == i11 && zzmdVar.zzm == i12) {
            return;
        }
        this.zzG = zzmdVar.zzi(z11, i12, i11);
        zzaC(false, false);
        zzlq zzlqVar = this.zzs;
        for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z13 = this.zzG.zzp;
            zzlqVar.zzf(this.zzT);
            return;
        }
        int i13 = this.zzG.zze;
        if (i13 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i13 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z10) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, jZzT, zzmdVar.zzc, zzmdVar.zzd, z10, 5);
        }
    }

    private final void zzJ() throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        if (zzlnVarZzm == null) {
            return;
        }
        zzaak zzaakVarZzr = zzlnVarZzm.zzr();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            if (zzaakVarZzr.zza(i10)) {
                zzmpVarArr[i10].zzv();
            }
            i10++;
        }
    }

    private final void zzK() throws zziw {
        this.zzo.zzb();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzw();
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i10, z10);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j10) {
        int i10 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j11 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j10;
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i10 = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j10) {
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                jMin = Math.min(jMin, zzfj.zzp(zzmpVarArr[i10].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if ((zzlqVar.zzm() != null ? zzlqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfj.zzq(jMin) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j10 + jMin);
    }

    private final void zzR(zzle zzleVar) throws Throwable {
        long jLongValue;
        long j10;
        zzwk zzwkVarZzy;
        boolean z10;
        boolean z11;
        long j11;
        long j12;
        zzmd zzmdVar;
        zzwk zzwkVar;
        zzbf zzbfVar;
        long j13;
        long j14;
        long j15;
        long jZzk;
        zzmd zzmdVar2;
        int i10;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzleVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar2 = this.zzG.zza;
        int i11 = this.zzO;
        boolean z12 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaD = zzaD(zzbfVar2, zzleVar, true, i11, z12, zzbeVar, zzbdVar);
        long jMax = -9223372036854775807L;
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzwk zzwkVar2 = (zzwk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z10 = !this.zzG.zza.zzg();
            zzwkVarZzy = zzwkVar2;
            j10 = -9223372036854775807L;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j16 = zzleVar.zzc;
            if (j16 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = -9223372036854775807L;
                jMax = jLongValue;
            }
            zzwkVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
            if (zzwkVarZzy.zzb()) {
                this.zzG.zza.zzo(zzwkVarZzy.zza, zzbdVar);
                int i12 = zzwkVarZzy.zzb;
                if (zzbdVar.zzd(i12) == zzwkVarZzy.zzc) {
                    zzbdVar.zzj();
                }
                long j17 = zzbdVar.zzg.zza(i12).zza;
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j16 != -9223372036854775807L) {
                z10 = false;
            }
            z10 = true;
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzleVar;
            } else {
                if (pairZzaD != null) {
                    if (zzwkVarZzy.equals(this.zzG.zzb)) {
                        zzln zzlnVarZzm = this.zzs.zzm();
                        if (zzlnVarZzm == null || !zzlnVarZzm.zze || jLongValue == 0) {
                            jZzk = jLongValue;
                        } else {
                            zzwi zzwiVar = zzlnVarZzm.zza;
                            long j18 = zzbeVar.zzm;
                            if (this.zzC && j18 != j10) {
                                Double d10 = this.zzB.zzc;
                            }
                            jZzk = zzwiVar.zzk(jLongValue, this.zzA);
                        }
                        long j19 = jZzk;
                        if (zzfj.zzp(jZzk) == zzfj.zzp(this.zzG.zzs) && ((i10 = (zzmdVar2 = this.zzG).zze) == 2 || i10 == 3)) {
                            jLongValue = zzmdVar2.zzs;
                        } else {
                            j12 = j19;
                        }
                    } else {
                        j12 = jLongValue;
                    }
                    if (this.zzC) {
                        zzmp[] zzmpVarArr = this.zzb;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 2) {
                                break;
                            }
                            zzmp zzmpVar = zzmpVarArr[i13];
                            if (zzmpVar.zzM() && zzmpVar.zze() == 2) {
                                this.zzD = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    long jZzS = zzS(zzwkVarZzy, j12, this.zzG.zze == 4);
                    z11 = (jLongValue != jZzS) | z10;
                    try {
                        zzmdVar = this.zzG;
                        zzwkVar = zzwkVarZzy;
                        try {
                            zzbfVar = zzmdVar.zza;
                            j13 = jMax;
                        } catch (Throwable th2) {
                            th = th2;
                            zzwkVarZzy = zzwkVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        zzag(zzbfVar, zzwkVar, zzbfVar, zzmdVar.zzb, j13, true);
                        zzwkVarZzy = zzwkVar;
                        j14 = j13;
                        j15 = jZzS;
                        this.zzG = zzao(zzwkVarZzy, j15, j14, j15, z11, 2);
                    } catch (Throwable th4) {
                        th = th4;
                        zzwkVarZzy = zzwkVar;
                        jMax = j13;
                        j11 = jZzS;
                        this.zzG = zzao(zzwkVarZzy, j11, jMax, j11, z11, 2);
                        throw th;
                    }
                }
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            }
            z11 = z10;
            j14 = jMax;
            j15 = jLongValue;
            this.zzG = zzao(zzwkVarZzy, j15, j14, j15, z11, 2);
        } catch (Throwable th5) {
            th = th5;
            z11 = z10;
            j11 = jLongValue;
        }
    }

    private final long zzS(zzwk zzwkVar, long j10, boolean z10) throws zziw {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j10, zzlqVar.zzm() != zzlqVar.zzn(), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzT(com.google.android.gms.internal.ads.zzwk r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzT(com.google.android.gms.internal.ads.zzwk, long, boolean, boolean):long");
    }

    private final void zzU(long j10, boolean z10) throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        long jZza = j10 + (zzlnVarZzm == null ? 1000000000000L : zzlnVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmpVarArr[i10].zzE(zzlnVarZzm, this.zzT, z10);
        }
        for (zzln zzlnVarZzm2 = r0.zzm(); zzlnVarZzm2 != null; zzlnVarZzm2 = zzlnVarZzm2.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zziw {
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzz(this.zzC ? this.zzB : null);
            i10++;
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzX(z10 || !this.zzQ, false, true, false);
        this.zzH.zza(z11 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[PHI: r2 r7 r9
  0x009d: PHI (r2v2 com.google.android.gms.internal.ads.zzwk) = (r2v1 com.google.android.gms.internal.ads.zzwk), (r2v11 com.google.android.gms.internal.ads.zzwk) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v12 com.google.android.gms.internal.ads.zzbf)
  (r3v12 com.google.android.gms.internal.ads.zzbf)
 binds: [B:34:0x00aa, B:36:0x00ae, B:38:0x00bf, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j10 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzwkVarZzy.zzb()) {
            zzbfVar.zzo(zzwkVarZzy.zza, zzbdVar);
            if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zzwkVarZzy, Long.valueOf(j10));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z10 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z10, boolean z11) {
        this.zzL = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    @Nullable
    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z10, int i10, boolean z11, zzbe zzbeVar, zzbd zzbdVar) {
        Pair pairZzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        boolean zZzg = zzbfVar3.zzg();
        zzbf zzbfVar4 = zzbfVar3;
        if (true == zZzg) {
            zzbfVar4 = zzbfVar;
        }
        try {
            pairZzm = zzbfVar4.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
            zzbfVar2 = zzbfVar4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar2)) {
            return pairZzm;
        }
        if (zzbfVar.zze(pairZzm.first) != -1) {
            return (zzbfVar2.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzleVar.zzc) : pairZzm;
        }
        int iZzr = zzr(zzbeVar, zzbdVar, i10, z11, pairZzm.first, zzbfVar2, zzbfVar);
        if (iZzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaE(zzmh zzmhVar) throws zziw {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private static final boolean zzaF(@Nullable zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzyc zzycVar = zzycVarArr[i10];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zziw {
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzmpVarArr[i10].zzd();
            zzmpVarArr[i10].zzA(this.zzo);
            zzN(i10, false);
            this.zzR -= iZzd;
            i10++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzmp zzmpVar = zzmpVarArr[i10];
                int iZzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.ads.zzlf] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.zzlf] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final void zzad() throws zziw {
        int i10;
        int i11;
        ?? r62;
        boolean z10;
        zziu zziuVar = this.zzo;
        float f10 = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z11 = true;
        while (zzlnVarZzm != null && zzlnVarZzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzaakVarZzk = zzlnVarZzm.zzk(f10, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzlnVarZzm == zzlqVar.zzm() ? zzaakVarZzk : zzaakVar;
            zzaak zzaakVarZzr = zzlnVarZzm.zzr();
            boolean z12 = false;
            if (zzaakVarZzr != null) {
                zzaac[] zzaacVarArr = zzaakVarZzk.zzc;
                if (zzaakVarZzr.zzc.length == zzaacVarArr.length) {
                    for (int i12 = 0; i12 < zzaacVarArr.length; i12++) {
                        if (zzaakVarZzk.zzb(zzaakVarZzr, i12)) {
                        }
                    }
                    if (zzlnVarZzm != zzlnVarZzn) {
                        z12 = true;
                    }
                    z11 &= z12;
                    zzlnVarZzm = zzlnVarZzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            if (z11) {
                zzln zzlnVarZzm2 = zzlqVar.zzm();
                int iZzs = zzlqVar.zzs(zzlnVarZzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long jZzm = zzlnVarZzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                if (zzmdVar2.zze == 4 || jZzm == zzmdVar2.zzs) {
                    z10 = false;
                } else {
                    z10 = false;
                    z12 = true;
                }
                zzmd zzmdVar3 = this.zzG;
                boolean z13 = z10;
                i10 = 4;
                i11 = 2;
                ?? r63 = this;
                r63.zzG = zzao(zzmdVar3.zzb, jZzm, zzmdVar3.zzc, zzmdVar3.zzd, z12, 5);
                if (z12) {
                    r63.zzU(jZzm, true);
                }
                r63.zzab();
                boolean[] zArr2 = new boolean[2];
                for (?? r82 = z13; r82 < 2; r82++) {
                    int iZzd = zzmpVarArr[r82].zzd();
                    zArr2[r82] = zzmpVarArr[r82].zzM();
                    zziu zziuVar2 = zziuVar;
                    zzmpVarArr[r82].zzD(zzlnVarZzm2.zzc[r82], zziuVar2, r63.zzT, zArr[r82]);
                    if (iZzd - zzmpVarArr[r82].zzd() > 0) {
                        r63.zzN(r82, z13);
                    }
                    r63.zzR -= iZzd - zzmpVarArr[r82].zzd();
                    zziuVar = zziuVar2;
                }
                r63.zzaq(zArr2, r63.zzT);
                zzlnVarZzm2.zzh = true;
                r62 = r63;
            } else {
                zzlf zzlfVar = this;
                i10 = 4;
                i11 = 2;
                zzlqVar.zzs(zzlnVarZzm);
                r62 = zzlfVar;
                if (zzlnVarZzm.zze) {
                    long jMax = Math.max(zzlnVarZzm.zzg.zzb, zzlfVar.zzT - zzlnVarZzm.zza());
                    if (zzlfVar.zzy && zzlfVar.zzaz() && zzlqVar.zzo() == zzlnVarZzm) {
                        zzlfVar.zzab();
                    }
                    zzlnVarZzm.zzl(zzaakVarZzk, jMax, false);
                    r62 = zzlfVar;
                }
            }
            r62.zzas(true);
            if (r62.zzG.zze != i10) {
                r62.zzam();
                r62.zzL();
                r62.zzi.zzh(i11);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzlnVarZzm = this.zzs.zzm();
        long j10 = zzlnVarZzm.zzg.zze;
        if (zzlnVarZzm.zze) {
            return j10 == -9223372036854775807L || this.zzG.zzs < j10 || !zzax();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041c  */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r36, boolean r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j10, boolean z10) throws zziw {
        if (!zzP(zzbfVar, zzwkVar)) {
            zzav zzavVar = zzwkVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j10 != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj, j10));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z10) {
            zzipVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long jZza = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i10 = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzmpVarArr[i10].zzp(zzlnVar)) {
                    long jZzf = zzmpVarArr[i10].zzf(zzlnVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i10++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzlnVarZzl = zzlqVar.zzl();
        if (zzlnVarZzl != null) {
            if (!zzlnVarZzl.zzd || zzlnVarZzl.zze) {
                zzwi zzwiVar = zzlnVarZzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzlnVarZzl.zzg.zza, zzlnVarZzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzlnVarZzl.zzd) {
                        zzlnVarZzl.zzt(this, zzlnVarZzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzlnVarZzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzlnVarZzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzlnVarZzm = this.zzs.zzm();
        boolean z10 = false;
        if (zzlnVarZzm != null && zzlnVarZzm.zzg.zzi && this.zzJ) {
            z10 = true;
        }
        this.zzK = z10;
    }

    private final void zzak(zzav zzavVar, boolean z10) throws zziw {
        zzal(zzavVar, zzavVar.zzb, true, z10);
    }

    private final void zzal(zzav zzavVar, float f10, boolean z10, boolean z11) throws zziw {
        int i10;
        if (z10) {
            if (z11) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzln zzlnVarZzm = this.zzs.zzm();
        while (true) {
            i10 = 0;
            if (zzlnVarZzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzlnVarZzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i10 < length) {
                zzaac zzaacVar = zzaacVarArr[i10];
                i10++;
            }
            zzlnVarZzm = zzlnVarZzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i10 < 2) {
            zzmpVarArr[i10].zzm(f10, f11);
            i10++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzlq zzlqVar = this.zzs;
        boolean zZzh = false;
        if (zzaF(zzlqVar.zzk())) {
            zzln zzlnVarZzk = zzlqVar.zzk();
            long jZzau = zzau(zzlnVarZzk.zzg());
            if (zzlnVarZzk == zzlqVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzlnVarZzk.zza();
            } else {
                jZza = this.zzT - zzlnVarZzk.zza();
                jZza2 = zzlnVarZzk.zzg.zzb;
            }
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzlnVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            boolean zZzh2 = zzljVar.zzh(zzliVar);
            zzln zzlnVarZzm = zzlqVar.zzm();
            if (zZzh2 || !zzlnVarZzm.zze || jZzau >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzlnVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzljVar.zzh(zzliVar);
            }
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzln zzlnVarZzk2 = zzlqVar.zzk();
            zzlnVarZzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzlnVarZzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzlnVarZzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzlnVarZzk = this.zzs.zzk();
        boolean z10 = true;
        if (!this.zzN && (zzlnVarZzk == null || !zzlnVarZzk.zza.zzn())) {
            z10 = false;
        }
        zzmd zzmdVar = this.zzG;
        if (z10 != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @androidx.annotation.CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzmd zzao(com.google.android.gms.internal.ads.zzwk r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzao(com.google.android.gms.internal.ads.zzwk, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzmd");
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j10) throws zziw {
        zzmp[] zzmpVarArr;
        long j11;
        zzln zzlnVarZzn = this.zzs.zzn();
        zzaak zzaakVarZzr = zzlnVarZzn.zzr();
        int i10 = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                break;
            }
            if (!zzaakVarZzr.zza(i10)) {
                zzmpVarArr[i10].zzG();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < 2) {
            if (!zzaakVarZzr.zza(i11) || zzmpVarArr[i11].zzp(zzlnVarZzn)) {
                j11 = j10;
            } else {
                j11 = j10;
                zzar(zzlnVarZzn, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private final void zzar(zzln zzlnVar, int i10, boolean z10, long j10) throws zziw {
        zzmp zzmpVar = this.zzb[i10];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z11 = zzlnVar == this.zzs.zzm();
        zzaak zzaakVarZzr = zzlnVar.zzr();
        zzmo zzmoVar = zzaakVarZzr.zzb[i10];
        zzaac zzaacVar = zzaakVarZzr.zzc[i10];
        boolean z12 = zzax() && this.zzG.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i10], this.zzT, z13, z11, j10, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z12 && z11) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z10) {
        zzln zzlnVarZzk = this.zzs.zzk();
        zzwk zzwkVar = zzlnVarZzk == null ? this.zzG.zzb : zzlnVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzwkVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzlnVarZzk == null ? zzmdVar.zzs : zzlnVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z10) && zzlnVarZzk != null && zzlnVarZzk.zze) {
            zzaw(zzlnVarZzk.zzg.zza, zzlnVarZzk.zzq(), zzlnVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j10) {
        zzln zzlnVarZzk = this.zzs.zzk();
        if (zzlnVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzT - zzlnVarZzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long jZza;
        long jZza2;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzk = zzlqVar.zzk();
        zzlnVarZzk.getClass();
        if (zzlnVarZzk == zzlqVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzlnVarZzk.zza();
        } else {
            jZza = this.zzT - zzlnVarZzk.zza();
            jZza2 = zzlnVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, jZza - jZza2, zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i10) throws Throwable {
        zzmp zzmpVar = this.zzb[i10];
        try {
            zzln zzlnVarZzm = this.zzs.zzm();
            if (zzlnVarZzm == null) {
                throw null;
            }
            zzmpVar.zzu(zzlnVarZzm);
        } catch (IOException e10) {
            e = e10;
            zzmpVar.zze();
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzmpVarArr[i10].zzc()) {
                return true;
            }
        }
        return false;
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i10, boolean z10, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbfVar2.zza(); i11++) {
            if (zzbfVar2.zzb(i11, zzbeVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= iZzc || iZze2 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar2, i10, z10);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i12++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
            zzbeVar2 = zzbeVar;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e10) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x060e A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TRY_LEAVE, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x071e A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, LOOP:18: B:356:0x071c->B:357:0x071e, LOOP_END, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0887 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, LOOP:8: B:446:0x0885->B:447:0x0887, LOOP_END, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0895 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08a5 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0988 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0a39 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a46 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a4d A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a6a A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0aea A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0c1a  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f10) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i10) {
        this.zzi.zze(33, i10, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j10, long j11, zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z10, int i10, int i11) {
        this.zzi.zze(1, z10 ? 1 : 0, (i11 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i10, long j10) {
        this.zzi.zzd(3, new zzle(zzbfVar, i10, j10)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z10) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f10) {
        this.zzi.zzd(32, Float.valueOf(f10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(@Nullable Object obj, long j10) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j10 != -9223372036854775807L) {
            return zzdqVar.zze(j10);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    final /* synthetic */ zzln zzt(zzlo zzloVar, long j10) {
        zzaan zzaanVarZze = this.zzg.zze(this.zzv);
        long j11 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j10, this.zze, zzaanVarZze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i10, boolean z10) {
        this.zzw.zzB(i10, this.zzb[i10].zze(), z10);
    }

    final /* synthetic */ void zzv(int i10) {
        this.zzw.zzW(i10);
    }

    final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i10, long j10, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i10, j10, null)).zza();
    }
}
