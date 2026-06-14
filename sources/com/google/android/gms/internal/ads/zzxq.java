package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzxq implements zzwi, zzaex, zzaax, zzabc, zzya {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzxp zzB;
    private zzafy zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhb zze;
    private final zzto zzf;
    private final zzwu zzg;
    private final zztj zzh;
    private final zzxi zzi;
    private final zzaan zzj;
    private final long zzk;
    private final long zzl;
    private final zzxd zzn;

    @Nullable
    private zzwh zzs;

    @Nullable
    private zzaic zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabf zzm = new zzabf("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfj.zzc(null);
    private zzxo[] zzw = new zzxo[0];
    private zzyb[] zzv = new zzyb[0];
    private zzxg[] zzu = new zzxg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = DesugarCollections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    public zzxq(Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzto zztoVar, zztj zztjVar, zzaaw zzaawVar, zzwu zzwuVar, zzxi zzxiVar, zzaan zzaanVar, @Nullable String str, int i10, boolean z10, int i11, @Nullable zzv zzvVar, long j10, @Nullable zzabl zzablVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztoVar;
        this.zzh = zztjVar;
        this.zzg = zzwuVar;
        this.zzi = zzxiVar;
        this.zzj = zzaanVar;
        this.zzk = i10;
        this.zzn = zzxdVar;
        this.zzl = j10;
    }

    private final void zzR(int i10) {
        zzaa();
        zzxp zzxpVar = this.zzB;
        boolean[] zArr = zzxpVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzv zzvVarZza = zzxpVar.zza.zza(i10).zza(0);
        this.zzg.zzh(new zzwg(1, zzas.zzf(zzvVarZza.zzo), zzvVarZza, 0, null, zzfj.zzp(this.zzL), -9223372036854775807L));
        zArr[i10] = true;
    }

    private final void zzS(int i10) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i10]) && !this.zzv[i10].zzq(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyb zzybVar : this.zzv) {
                    zzybVar.zzg(false);
                }
                zzwh zzwhVar = this.zzs;
                zzwhVar.getClass();
                zzwhVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzagh zzU(zzxo zzxoVar) {
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzxoVar.equals(this.zzw[i10])) {
                return this.zzv[i10];
            }
        }
        if (this.zzx) {
            int i11 = zzxoVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i11);
            sb2.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb2.toString());
            return new zzaer();
        }
        zzyb zzybVar = new zzyb(this.zzj, this.zzf, this.zzh);
        zzxg zzxgVar = new zzxg(zzybVar);
        zzybVar.zzy(this);
        int i12 = length + 1;
        zzxo[] zzxoVarArr = (zzxo[]) Arrays.copyOf(this.zzw, i12);
        zzxoVarArr[length] = zzxoVar;
        String str = zzfj.zza;
        this.zzw = zzxoVarArr;
        zzyb[] zzybVarArr = (zzyb[]) Arrays.copyOf(this.zzv, i12);
        zzybVarArr[length] = zzybVar;
        this.zzv = zzybVarArr;
        zzxg[] zzxgVarArr = (zzxg[]) Arrays.copyOf(this.zzu, i12);
        zzxgVarArr[length] = zzxgVar;
        this.zzu = zzxgVarArr;
        return zzxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i10;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            if (zzybVar.zzn() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzv zzvVarZzn = this.zzv[i11].zzn();
            zzvVarZzn.getClass();
            String str = zzvVarZzn.zzo;
            boolean zZza = zzas.zza(str);
            boolean z10 = zZza || zzas.zzb(str);
            zArr[i11] = z10;
            this.zzz = z10 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaic zzaicVar = this.zzt;
            if (zzaicVar != null) {
                if (zZza || this.zzw[i11].zzb) {
                    zzap zzapVar = zzvVarZzn.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaicVar) : zzapVar.zzg(zzaicVar);
                    zzt zztVarZza = zzvVarZzn.zza();
                    zztVarZza.zzk(zzapVar2);
                    zzvVarZzn = zztVarZza.zzM();
                }
                if (zZza && zzvVarZzn.zzh == -1 && zzvVarZzn.zzi == -1 && (i10 = zzaicVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzn.zza();
                    zztVarZza2.zzh(i10);
                    zzvVarZzn = zztVarZza2.zzM();
                }
            }
            zzv zzvVarZzb = zzvVarZzn.zzb(this.zzf.zzb(zzvVarZzn));
            zzbgVarArr[i11] = new zzbg(Integer.toString(i11), zzvVarZzb);
            this.zzI = zzvVarZzb.zzu | this.zzI;
        }
        this.zzB = new zzxp(new zzyn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxe(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    private final void zzW() {
        zzxh zzxhVar = new zzxh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgrc.zzi(zzZ());
            long j10 = this.zzD;
            if (j10 != -9223372036854775807L && this.zzM > j10) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzafy zzafyVar = this.zzC;
            zzafyVar.getClass();
            zzxhVar.zzd(zzafyVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxhVar, this, zzaaw.zza(this.zzF));
    }

    private final int zzX() {
        int iZzi = 0;
        for (zzyb zzybVar : this.zzv) {
            iZzi += zzybVar.zzi();
        }
        return iZzi;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzY(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzyb[] r3 = r5.zzv
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzxp r4 = r5.zzB
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzo()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxq.zzY(boolean):long");
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    private final void zzaa() {
        zzgrc.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzA(zzabb zzabbVar, long j10, long j11, boolean z10) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        zzxhVar.zze();
        this.zzg.zzf(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        if (z10) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwh zzwhVar = this.zzs;
            zzwhVar.getClass();
            zzwhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzB(zzabb zzabbVar, long j10, long j11) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j12 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j12;
            this.zzi.zzb(j12, this.zzC, this.zzE);
        }
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        zzxhVar.zze();
        this.zzg.zze(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        this.zzP = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzC(zzabb zzabbVar, long j10, long j11, int i10) {
        zzwb zzwbVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        if (i10 == 0) {
            long jZze = zzxhVar.zze();
            zzhf zzhfVarZzh = zzxhVar.zzh();
            zzwbVar = new zzwb(jZze, zzhfVarZzh, zzhfVarZzh.zza, Collections.EMPTY_MAP, j10, 0L, 0L);
        } else {
            zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        }
        this.zzg.zzd(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), i10);
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzafy zzafyVar) {
        this.zzC = this.zzt == null ? zzafyVar : new zzafx(-9223372036854775807L, 0L);
        this.zzD = zzafyVar.zza();
        boolean z10 = false;
        if (!this.zzK && zzafyVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzE = z10;
        this.zzF = true == z10 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzafyVar, z10);
        } else {
            zzD();
        }
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z10) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzaic zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzaic zzaicVar) {
        this.zzt = zzaicVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzj();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j10) {
        this.zzs = zzwhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j10) {
        zzaac zzaacVar;
        zzaa();
        zzxp zzxpVar = this.zzB;
        zzyn zzynVar = zzxpVar.zza;
        boolean[] zArr3 = zzxpVar.zzc;
        int i10 = this.zzJ;
        int i11 = 0;
        for (int i12 = 0; i12 < zzaacVarArr.length; i12++) {
            zzyc zzycVar = zzycVarArr[i12];
            if (zzycVar != null && (zzaacVarArr[i12] == null || !zArr[i12])) {
                int iZza = ((zzxn) zzycVar).zza();
                zzgrc.zzi(zArr3[iZza]);
                this.zzJ--;
                zArr3[iZza] = false;
                zzycVarArr[i12] = null;
            }
        }
        boolean z10 = !this.zzG ? j10 == 0 || this.zzA : i10 != 0;
        for (int i13 = 0; i13 < zzaacVarArr.length; i13++) {
            if (zzycVarArr[i13] == null && (zzaacVar = zzaacVarArr[i13]) != null) {
                zzgrc.zzi(zzaacVar.zze() == 1);
                zzgrc.zzi(zzaacVar.zzf(0) == 0);
                int iZzb = zzynVar.zzb(zzaacVar.zza());
                zzgrc.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzaacVar.zzc().zzu | this.zzI;
                zzycVarArr[i13] = new zzxn(this, iZzb);
                zArr2[i13] = true;
                if (!z10) {
                    zzyb zzybVar = this.zzv[iZzb];
                    z10 = (zzybVar.zzm() == 0 || zzybVar.zzt(j10, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabf zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                zzyb[] zzybVarArr = this.zzv;
                int length = zzybVarArr.length;
                while (i11 < length) {
                    zzybVarArr[i11].zzx();
                    i11++;
                }
                zzabfVar.zzf();
            } else {
                this.zzP = false;
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzg(false);
                }
            }
        } else if (z10) {
            j10 = zzj(j10);
            while (i11 < zzycVarArr.length) {
                if (zzycVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.zzG = true;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j10, boolean z10) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzv[i10].zzw(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzxp zzxpVar = this.zzB;
                if (zzxpVar.zzb[i10] && zzxpVar.zzc[i10] && !this.zzv[i10].zzp()) {
                    jZzY = Math.min(jZzY, this.zzv[i10].zzo());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzL : jZzY;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzj(long r9) {
        /*
            r8 = this;
            r8.zzaa()
            com.google.android.gms.internal.ads.zzxp r0 = r8.zzB
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzafy r1 = r8.zzC
            boolean r1 = r1.zzb()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.zzH = r1
            long r2 = r8.zzL
            r8.zzL = r9
            boolean r4 = r8.zzZ()
            if (r4 == 0) goto L22
            r8.zzM = r9
            return r9
        L22:
            int r4 = r8.zzF
            r5 = 7
            if (r4 == r5) goto L73
            boolean r4 = r8.zzP
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.zzabf r4 = r8.zzm
            boolean r4 = r4.zze()
            if (r4 == 0) goto L73
        L33:
            com.google.android.gms.internal.ads.zzyb[] r4 = r8.zzv
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto La5
            com.google.android.gms.internal.ads.zzyb[] r6 = r8.zzv
            r6 = r6[r5]
            com.google.android.gms.internal.ads.zzxg[] r7 = r8.zzu
            r7 = r7[r5]
            boolean r7 = r7.zzf()
            if (r7 != 0) goto L48
            goto L70
        L48:
            int r7 = r6.zzm()
            if (r7 != 0) goto L52
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L70
        L52:
            boolean r7 = r8.zzA
            if (r7 == 0) goto L5f
            int r7 = r6.zzl()
            boolean r6 = r6.zzs(r7)
            goto L65
        L5f:
            boolean r7 = r8.zzP
            boolean r6 = r6.zzt(r9, r7)
        L65:
            if (r6 != 0) goto L70
            boolean r6 = r0[r5]
            if (r6 != 0) goto L73
            boolean r6 = r8.zzz
            if (r6 != 0) goto L70
            goto L73
        L70:
            int r5 = r5 + 1
            goto L37
        L73:
            r8.zzN = r1
            r8.zzM = r9
            r8.zzP = r1
            r8.zzI = r1
            com.google.android.gms.internal.ads.zzabf r0 = r8.zzm
            boolean r2 = r0.zze()
            if (r2 == 0) goto L94
            com.google.android.gms.internal.ads.zzyb[] r2 = r8.zzv
            int r3 = r2.length
        L86:
            if (r1 >= r3) goto L90
            r4 = r2[r1]
            r4.zzx()
            int r1 = r1 + 1
            goto L86
        L90:
            r0.zzf()
            return r9
        L94:
            r0.zzc()
            com.google.android.gms.internal.ads.zzyb[] r0 = r8.zzv
            int r2 = r0.length
            r3 = r1
        L9b:
            if (r3 >= r2) goto La5
            r4 = r0[r3]
            r4.zzg(r1)
            int r3 = r3 + 1
            goto L9b
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxq.zzj(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzk(long r28, com.google.android.gms.internal.ads.zzmt r30) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxq.zzk(long, com.google.android.gms.internal.ads.zzmt):long");
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        if (this.zzP) {
            return false;
        }
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzabfVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzp(int i10) {
        return !zzT() && this.zzv[i10].zzq(this.zzP);
    }

    final void zzq(int i10) throws IOException {
        this.zzv[i10].zzk();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzm.zzh(zzaaw.zza(this.zzF));
    }

    final int zzs(int i10, zzlh zzlhVar, zzih zzihVar, int i11) {
        if (zzT()) {
            return -3;
        }
        zzR(i10);
        int iZzr = this.zzv[i10].zzr(zzlhVar, zzihVar, i11, this.zzP);
        if (iZzr == -3) {
            zzS(i10);
        }
        return iZzr;
    }

    final int zzt(int i10, long j10) {
        if (zzT()) {
            return 0;
        }
        zzR(i10);
        zzyb zzybVar = this.zzv[i10];
        int iZzu = zzybVar.zzu(j10, this.zzP);
        zzybVar.zzv(iZzu);
        if (iZzu != 0) {
            return iZzu;
        }
        zzS(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i10, int i11) {
        return zzU(new zzxo(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(final zzafy zzafyVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzafyVar);
            }
        });
    }

    final zzagh zzx() {
        return zzU(new zzxo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ zzaaz zzz(zzabb zzabbVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zzaaz zzaazVarZza;
        zzafy zzafyVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j10, j11, zzhyVarZzf.zzf());
        zzxhVar.zzg();
        String str = zzfj.zza;
        if ((iOException instanceof zzat) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzhp) || (iOException instanceof zzabe)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzhc) && ((zzhc) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzaazVarZza = zzabf.zzb;
        } else {
            int iZzX = zzX();
            boolean z10 = iZzX > this.zzO;
            if (this.zzK || !((zzafyVar = this.zzC) == null || zzafyVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z11 = this.zzy;
                if (!z11 || zzT()) {
                    this.zzH = z11;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzyb zzybVar : this.zzv) {
                        zzybVar.zzg(false);
                    }
                    zzxhVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzaazVarZza = zzabf.zza;
                }
            }
            zzaazVarZza = zzabf.zza(z10, jMin);
        }
        boolean zZza = zzaazVarZza.zza();
        this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, true ^ zZza);
        if (!zZza) {
            zzxhVar.zze();
        }
        return zzaazVarZza;
    }
}
