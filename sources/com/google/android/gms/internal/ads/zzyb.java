package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyb implements zzagh {
    private boolean zzB;
    private final zzxw zza;

    @Nullable
    private final zzto zzd;

    @Nullable
    private final zztj zze;

    @Nullable
    private zzya zzf;

    @Nullable
    private zzv zzg;

    @Nullable
    private zzth zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;

    @Nullable
    private zzv zzz;
    private final zzxx zzb = new zzxx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzagg[] zzo = new zzagg[1000];
    private final zzyi zzc = new zzyi(zzxy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    protected zzyb(zzaan zzaanVar, @Nullable zzto zztoVar, @Nullable zztj zztjVar) {
        this.zzd = zztoVar;
        this.zze = zztjVar;
        this.zza = new zzxw(zzaanVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzlh zzlhVar, zzih zzihVar, boolean z10, boolean z11, zzxx zzxxVar) {
        try {
            zzihVar.zzd = false;
            if (!zzH()) {
                if (!z11 && !this.zzw) {
                    zzv zzvVar = this.zzz;
                    if (zzvVar == null || (!z10 && zzvVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzvVar, zzlhVar);
                    return -5;
                }
                zzihVar.zzg(4);
                zzihVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z10 && zzvVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzihVar.zzd = true;
                    return -3;
                }
                zzihVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z11 || this.zzw)) {
                    zzihVar.zzh(536870912);
                }
                zzihVar.zze = this.zzn[iZzM];
                zzxxVar.zza = this.zzl[iZzM];
                zzxxVar.zzb = this.zzk[iZzM];
                zzxxVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzvVar2, zzlhVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzvVar, this.zzz)) {
                return false;
            }
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(zzvVar)) {
                this.zzz = zzvVar;
            } else {
                this.zzz = ((zzxz) zzyiVar.zzc()).zza;
            }
            boolean z10 = this.zzA;
            zzv zzvVar2 = this.zzz;
            this.zzA = z10 & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized long zzD(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzp     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzn     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzr     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzs     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzK(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzL(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.zzD(long, boolean, boolean):long");
    }

    private final synchronized long zzE() {
        int i10 = this.zzp;
        if (i10 == 0) {
            return -1L;
        }
        return zzL(i10);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j10, int i10, long j11, int i11, @Nullable zzagg zzaggVar) {
        try {
            int i12 = this.zzp;
            if (i12 > 0) {
                int iZzM = zzM(i12 - 1);
                zzgrc.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j11);
            }
            this.zzw = (536870912 & i10) != 0;
            this.zzv = Math.max(this.zzv, j10);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j10;
            this.zzk[iZzM2] = j11;
            this.zzl[iZzM2] = i11;
            this.zzm[iZzM2] = i10;
            this.zzo[iZzM2] = zzaggVar;
            this.zzj[iZzM2] = 0;
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(this.zzz)) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null) {
                    throw null;
                }
                zzyiVar.zzb(this.zzq + this.zzp, new zzxz(zzvVar, zztn.zzb, null));
            }
            int i13 = this.zzp + 1;
            this.zzp = i13;
            int i14 = this.zzi;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                zzagg[] zzaggVarArr = new zzagg[i15];
                int i16 = this.zzr;
                int i17 = i14 - i16;
                System.arraycopy(this.zzk, i16, jArr2, 0, i17);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i17);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i17);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i17);
                System.arraycopy(this.zzo, this.zzr, zzaggVarArr, 0, i17);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i17);
                int i18 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i17, i18);
                System.arraycopy(this.zzn, 0, jArr3, i17, i18);
                System.arraycopy(this.zzm, 0, iArr, i17, i18);
                System.arraycopy(this.zzl, 0, iArr2, i17, i18);
                System.arraycopy(this.zzo, 0, zzaggVarArr, i17, i18);
                System.arraycopy(this.zzj, 0, jArr, i17, i18);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaggVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzv zzvVar, zzlh zzlhVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzto zztoVar = this.zzd;
        zzlhVar.zzb = zzvVar.zzb(zztoVar.zzb(zzvVar));
        zzlhVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzth zzthVarZza = zztoVar.zza(this.zze, zzvVar);
            this.zzh = zzthVarZza;
            zzlhVar.zza = zzthVarZza;
        }
    }

    private final boolean zzJ(int i10) {
        if (this.zzh == null) {
            return true;
        }
        int i11 = this.zzm[i10];
        return false;
    }

    private final int zzK(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzn[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzm[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.zzi) {
                i10 = 0;
            }
        }
        return i12;
    }

    @GuardedBy("this")
    private final long zzL(int i10) {
        long j10 = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzM = zzM(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j10, jMax);
        this.zzp -= i10;
        int i12 = this.zzq + i10;
        this.zzq = i12;
        int i13 = this.zzr + i10;
        this.zzr = i13;
        int i14 = this.zzi;
        if (i13 >= i14) {
            this.zzr = i13 - i14;
        }
        int i15 = this.zzs - i10;
        this.zzs = i15;
        if (i15 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i12);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i16 = this.zzr;
        if (i16 == 0) {
            i16 = this.zzi;
        }
        int i17 = i16 - 1;
        return this.zzk[i17] + ((long) this.zzl[i17]);
    }

    private final int zzM(int i10) {
        int i11 = this.zzr + i10;
        int i12 = this.zzi;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ void zzN(long j10) {
        m.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return m.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zzg(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ void zzc(zzer zzerVar, int i10) {
        m.c(this, zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i10, int i11) {
        this.zza.zzh(zzerVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar) {
        if (this.zzx) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j10 < this.zzt) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzB) {
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        int i13 = i10;
        zzG(j10, i13, (this.zza.zzf() - ((long) i11)) - ((long) i12), i11, zzaggVar);
    }

    @CallSuper
    public final void zzf() {
        zzg(true);
        zzF();
    }

    @CallSuper
    public final void zzg(boolean z10) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z10) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzh(long j10) {
        this.zzt = j10;
    }

    public final int zzi() {
        return this.zzq + this.zzp;
    }

    @CallSuper
    public final void zzj() {
        zzx();
        zzF();
    }

    @CallSuper
    public final void zzk() throws IOException {
        zzth zzthVar = this.zzh;
        if (zzthVar != null) {
            throw zzthVar.zza();
        }
    }

    public final int zzl() {
        return this.zzq;
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    @Nullable
    public final synchronized zzv zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    @CallSuper
    public final synchronized boolean zzq(boolean z10) {
        boolean z11 = true;
        if (zzH()) {
            if (((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z10 && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z11 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    @CallSuper
    public final int zzr(zzlh zzlhVar, zzih zzihVar, int i10, boolean z10) {
        boolean z11 = (i10 & 2) != 0;
        zzxx zzxxVar = this.zzb;
        int iZzB = zzB(zzlhVar, zzihVar, z11, z10, zzxxVar);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzihVar.zzb()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.zza.zzd(zzihVar, zzxxVar);
                    return -4;
                }
                this.zza.zzc(zzihVar, zzxxVar);
            } else if (i11 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzs(int i10) {
        zzA();
        int i11 = this.zzq;
        if (i10 >= i11 && i10 <= this.zzp + i11) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzt(long j10, boolean z10) throws Throwable {
        Throwable th2;
        zzyb zzybVar;
        long j11;
        int iZzK;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            zzA();
            int i10 = this.zzs;
            int iZzM = zzM(i10);
            if (zzH() && j10 >= this.zzn[iZzM]) {
                if (j10 > this.zzv) {
                    if (z10) {
                        z10 = true;
                    }
                }
                if (this.zzA) {
                    try {
                        int i11 = this.zzp - i10;
                        int i12 = 0;
                        while (true) {
                            if (i12 < i11) {
                                if (this.zzn[iZzM] >= j10) {
                                    zzybVar = this;
                                    j11 = j10;
                                    iZzK = i12;
                                    break;
                                }
                                iZzM++;
                                if (iZzM == this.zzi) {
                                    iZzM = 0;
                                }
                                i12++;
                            } else if (z10) {
                                j11 = j10;
                                iZzK = i11;
                                zzybVar = this;
                            } else {
                                zzybVar = this;
                                j11 = j10;
                                iZzK = -1;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        throw th2;
                    }
                } else {
                    zzybVar = this;
                    j11 = j10;
                    iZzK = zzybVar.zzK(iZzM, this.zzp - i10, j11, true);
                }
                if (iZzK != -1) {
                    zzybVar.zzt = j11;
                    zzybVar.zzs += iZzK;
                    return true;
                }
            }
            return false;
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized int zzu(long j10, boolean z10) {
        Throwable th2;
        try {
            try {
                int i10 = this.zzs;
                int iZzM = zzM(i10);
                if (!zzH() || j10 < this.zzn[iZzM]) {
                    return 0;
                }
                if (j10 <= this.zzv || !z10) {
                    int iZzK = zzK(iZzM, this.zzp - i10, j10, true);
                    if (iZzK == -1) {
                        return 0;
                    }
                    return iZzK;
                }
                try {
                    return this.zzp - i10;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzs + i10 <= this.zzp) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzgrc.zza(z10);
        this.zzs += i10;
    }

    public final void zzw(long j10, boolean z10, boolean z11) {
        this.zza.zze(zzD(j10, false, z11));
    }

    public final void zzx() {
        this.zza.zze(zzE());
    }

    public final void zzy(@Nullable zzya zzyaVar) {
        this.zzf = zzyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        boolean zZzC = zzC(zzvVar);
        zzya zzyaVar = this.zzf;
        if (zzyaVar == null || !zZzC) {
            return;
        }
        zzyaVar.zzy(zzvVar);
    }
}
