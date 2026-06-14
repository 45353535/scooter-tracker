package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzlq {
    private final zzmx zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjg zzh;

    @Nullable
    private zzln zzi;

    @Nullable
    private zzln zzj;

    @Nullable
    private zzln zzk;

    @Nullable
    private zzln zzl;

    @Nullable
    private zzln zzm;
    private int zzn;

    @Nullable
    private Object zzo;
    private long zzp;
    private final zzky zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzlq(zzmx zzmxVar, zzdx zzdxVar, zzky zzkyVar, zzjg zzjgVar) {
        this.zzc = zzmxVar;
        this.zzd = zzdxVar;
        this.zzr = zzkyVar;
        this.zzh = zzjgVar;
    }

    private static zzwk zzA(zzbf zzbfVar, Object obj, long j10, long j11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j10);
        return iZze == -1 ? new zzwk(obj, j11, zzbdVar.zzf(j10)) : new zzwk(obj, iZze, zzbdVar.zzd(iZze), j11);
    }

    private final void zzB() {
        int i10 = zzguf.zzd;
        final zzguc zzgucVar = new zzguc();
        for (zzln zzlnVarZzp = this.zzi; zzlnVarZzp != null; zzlnVarZzp = zzlnVarZzp.zzp()) {
            zzgucVar.zzf(zzlnVarZzp.zzg.zza);
        }
        zzln zzlnVar = this.zzj;
        final zzwk zzwkVar = zzlnVar == null ? null : zzlnVar.zzg.zza;
        this.zzd.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgucVar, zzwkVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzln zzlnVar = (zzln) this.zzq.get(i10);
            if (zzlnVar.zzb.equals(obj)) {
                return zzlnVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzln zzlnVarZzp = this.zzi;
        if (zzlnVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzlnVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlnVarZzp.getClass();
                if (zzlnVarZzp.zzp() == null || zzlnVarZzp.zzg.zzh) {
                    break;
                }
                zzlnVarZzp = zzlnVarZzp.zzp();
            }
            zzln zzlnVarZzp2 = zzlnVarZzp.zzp();
            if (iZze == -1 || zzlnVarZzp2 == null || zzbfVar2.zze(zzlnVarZzp2.zzb) != iZze) {
                break;
            }
            zzlnVarZzp = zzlnVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzlnVarZzp);
        zzlnVarZzp.zzg = zzx(zzbfVar2, zzlnVarZzp.zzg);
        return iZzs;
    }

    @Nullable
    private final zzlo zzE(zzbf zzbfVar, zzln zzlnVar, long j10) {
        zzbf zzbfVar2;
        long j11;
        zzbf zzbfVar3;
        zzbd zzbdVar;
        zzbe zzbeVar;
        Object obj;
        long j12;
        long j13;
        long j14;
        zzlo zzloVar = zzlnVar.zzg;
        long jZza = zzlnVar.zza();
        long j15 = zzloVar.zze;
        long j16 = (jZza + j15) - j10;
        if (!zzloVar.zzh) {
            zzwk zzwkVar = zzloVar.zza;
            Object obj2 = zzwkVar.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj2, zzbdVar2);
            if (!zzwkVar.zzb()) {
                int i10 = zzwkVar.zze;
                if (i10 != -1) {
                    zzbdVar2.zzi(i10);
                }
                int iZzd = zzbdVar2.zzd(i10);
                zzbdVar2.zzk(i10);
                if (iZzd != zzbdVar2.zzg(i10)) {
                    return zzG(zzbfVar, obj2, i10, iZzd, j15, zzwkVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i10);
                return zzH(zzbfVar, obj2, 0L, j15, zzwkVar.zzd, false);
            }
            int i11 = zzwkVar.zzb;
            if (zzbdVar2.zzg(i11) == -1) {
                return null;
            }
            int iZza = zzbdVar2.zzg.zza(i11).zza(zzwkVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i11, iZza, zzloVar.zzc, zzwkVar.zzd, false);
            }
            long jLongValue = zzloVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                Pair pairZzn = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, Math.max(0L, j16));
                zzbfVar2 = zzbfVar;
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j11 = jLongValue;
            }
            zzK(zzbfVar2, obj2, i11);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j11, zzwkVar.zzd, false);
        }
        zzwk zzwkVar2 = zzloVar.zza;
        Object obj3 = zzwkVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        int i12 = this.zzf;
        boolean z10 = this.zzg;
        zzbe zzbeVar2 = this.zzb;
        zzbd zzbdVar3 = this.zza;
        long j17 = 0;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar3, zzbeVar2, i12, z10);
        if (iZzl == -1) {
            return null;
        }
        int i13 = zzbfVar.zzd(iZzl, zzbdVar3, true).zzc;
        Object obj4 = zzbdVar3.zzb;
        obj4.getClass();
        long j18 = zzwkVar2.zzd;
        if (zzbfVar.zzb(i13, zzbeVar2, 0L).zzn == iZzl) {
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar3, i13, -9223372036854775807L, Math.max(0L, j16));
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzln zzlnVarZzp = zzlnVar.zzp();
            if (zzlnVarZzp == null || !zzlnVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j14 = jZzC;
            } else {
                j14 = zzlnVarZzp.zzg.zza.zzd;
            }
            zzbfVar3 = zzbfVar;
            zzbeVar = zzbeVar2;
            zzbdVar = zzbdVar3;
            j12 = jLongValue2;
            obj = obj5;
            j13 = j14;
            j17 = -9223372036854775807L;
        } else {
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            zzbeVar = zzbeVar2;
            obj = obj4;
            j12 = 0;
            j13 = j18;
        }
        zzwk zzwkVarZzA = zzA(zzbfVar3, obj, j12, j13, zzbeVar, zzbdVar);
        long j19 = j12;
        zzbd zzbdVar4 = zzbdVar;
        if (j17 != -9223372036854775807L && zzloVar.zzc != -9223372036854775807L) {
            zzbfVar3.zzo(obj3, zzbdVar4).zzb();
            int i14 = zzbdVar4.zzg.zzd;
        }
        return zzF(zzbfVar3, zzwkVarZzA, j17, j19);
    }

    private final zzlo zzF(zzbf zzbfVar, zzwk zzwkVar, long j10, long j11) {
        Object obj = zzwkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwkVar.zzb() ? zzG(zzbfVar, obj, zzwkVar.zzb, zzwkVar.zzc, j10, zzwkVar.zzd, false) : zzH(zzbfVar, obj, j11, j10, zzwkVar.zzd, false);
    }

    private final zzlo zzG(zzbf zzbfVar, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        zzwk zzwkVar = new zzwk(obj, i10, i11, j11);
        Object obj2 = zzwkVar.zza;
        int i12 = zzwkVar.zzb;
        int i13 = zzwkVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i12, i13);
        if (i11 == zzbdVar.zzd(i10)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i12);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzlo(zzwkVar, jMax, j10, -9223372036854775807L, jZzh, false, false, false, false, false);
    }

    private final zzlo zzH(zzbf zzbfVar, Object obj, long j10, long j11, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzwk zzwkVar = new zzwk(obj, j12, iZzf);
        boolean zZzL = zzL(zzwkVar);
        boolean zZzI = zzI(zzbfVar, zzwkVar);
        boolean zZzJ = zzJ(zzbfVar, zzwkVar, zZzL);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j15 = j13;
            j14 = j15;
        } else {
            j14 = zzbdVar.zzd;
            j15 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && jMax >= j14) {
            jMax = Math.max(0L, j14 - 1);
        }
        return new zzlo(zzwkVar, jMax, j11, j15, j14, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzL(zzwkVar)) {
            return false;
        }
        Object obj = zzwkVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwk zzwkVar, boolean z10) {
        int iZze = zzbfVar.zze(zzwkVar.zza);
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i10, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z10;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i10) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i10);
        long j10 = zzbdVar.zzg.zza(i10).zzi;
        return 0L;
    }

    private static final boolean zzL(zzwk zzwkVar) {
        return !zzwkVar.zzb() && zzwkVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i10) {
        this.zzf = i10;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z10) {
        this.zzg = z10;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjg zzjgVar) {
        this.zzh = zzjgVar;
        long j10 = zzjgVar.zzb;
        zzj();
    }

    public final boolean zzd(zzwi zzwiVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final boolean zze(zzwi zzwiVar) {
        zzln zzlnVar = this.zzm;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final void zzf(long j10) {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            zzlnVar.zzi(j10);
        }
    }

    public final boolean zzg() {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            return !zzlnVar.zzg.zzj && zzlnVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    @Nullable
    public final zzlo zzh(long j10, zzmd zzmdVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar == null ? zzF(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzs) : zzE(zzmdVar.zza, zzlnVar, j10);
    }

    public final zzln zzi(zzlo zzloVar) {
        zzln zzlnVarZza;
        zzln zzlnVar = this.zzl;
        long jZza = zzlnVar == null ? 1000000000000L : (zzlnVar.zza() + zzlnVar.zzg.zze) - zzloVar.zzb;
        int i10 = 0;
        while (true) {
            if (i10 >= this.zzq.size()) {
                zzlnVarZza = null;
                break;
            }
            zzlo zzloVar2 = ((zzln) this.zzq.get(i10)).zzg;
            long j10 = zzloVar2.zze;
            long j11 = zzloVar.zze;
            if ((j10 == -9223372036854775807L || j10 == j11) && zzloVar2.zzb == zzloVar.zzb && zzloVar2.zza.equals(zzloVar.zza)) {
                zzlnVarZza = (zzln) this.zzq.remove(i10);
                break;
            }
            i10++;
        }
        if (zzlnVarZza == null) {
            zzlnVarZza = this.zzr.zza(zzloVar, jZza);
        } else {
            zzlnVarZza.zzg = zzloVar;
            zzlnVarZza.zzb(jZza);
        }
        zzln zzlnVar2 = this.zzl;
        if (zzlnVar2 != null) {
            zzlnVar2.zzo(zzlnVarZza);
        } else {
            this.zzi = zzlnVarZza;
            this.zzj = zzlnVarZza;
            this.zzk = zzlnVarZza;
        }
        this.zzo = null;
        this.zzl = zzlnVarZza;
        this.zzn++;
        zzB();
        return zzlnVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            ((zzln) this.zzq.get(i10)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    @Nullable
    public final zzln zzk() {
        return this.zzl;
    }

    @Nullable
    public final zzln zzl() {
        return this.zzm;
    }

    @Nullable
    public final zzln zzm() {
        return this.zzi;
    }

    @Nullable
    public final zzln zzn() {
        return this.zzj;
    }

    @Nullable
    public final zzln zzo() {
        return this.zzk;
    }

    public final zzln zzp() {
        zzln zzlnVar = this.zzk;
        zzln zzlnVar2 = this.zzj;
        if (zzlnVar == zzlnVar2) {
            zzlnVar2.getClass();
            this.zzk = zzlnVar2.zzp();
        }
        zzlnVar2.getClass();
        this.zzj = zzlnVar2.zzp();
        zzB();
        zzln zzlnVar3 = this.zzj;
        zzlnVar3.getClass();
        return zzlnVar3;
    }

    public final zzln zzq() {
        zzln zzlnVar = this.zzk;
        zzlnVar.getClass();
        this.zzk = zzlnVar.zzp();
        zzB();
        zzln zzlnVar2 = this.zzk;
        zzlnVar2.getClass();
        return zzlnVar2;
    }

    @Nullable
    public final zzln zzr() {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return null;
        }
        if (zzlnVar == this.zzj) {
            this.zzj = zzlnVar.zzp();
        }
        if (zzlnVar == this.zzk) {
            this.zzk = zzlnVar.zzp();
        }
        zzlnVar.zzn();
        int i10 = this.zzn - 1;
        this.zzn = i10;
        if (i10 == 0) {
            this.zzl = null;
            zzln zzlnVar2 = this.zzi;
            this.zzo = zzlnVar2.zzb;
            this.zzp = zzlnVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzln zzlnVar) {
        zzlnVar.getClass();
        int i10 = 0;
        if (zzlnVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlnVar;
        while (zzlnVar.zzp() != null) {
            zzlnVar = zzlnVar.zzp();
            zzlnVar.getClass();
            if (zzlnVar == this.zzj) {
                zzln zzlnVar2 = this.zzi;
                this.zzj = zzlnVar2;
                this.zzk = zzlnVar2;
                i10 = 3;
            }
            if (zzlnVar == this.zzk) {
                this.zzk = this.zzj;
                i10 |= 2;
            }
            zzlnVar.zzn();
            this.zzn--;
        }
        zzln zzlnVar3 = this.zzl;
        zzlnVar3.getClass();
        zzlnVar3.zzo(null);
        zzB();
        return i10;
    }

    public final void zzt() {
        zzln zzlnVar = this.zzm;
        if (zzlnVar == null || zzlnVar.zze()) {
            this.zzm = null;
            for (int i10 = 0; i10 < this.zzq.size(); i10++) {
                zzln zzlnVar2 = (zzln) this.zzq.get(i10);
                if (!zzlnVar2.zze()) {
                    this.zzm = zzlnVar2;
                    return;
                }
            }
        }
    }

    @Nullable
    public final zzln zzu(zzwi zzwiVar) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzln zzlnVar = (zzln) this.zzq.get(i10);
            if (zzlnVar.zza == zzwiVar) {
                return zzlnVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzln zzlnVarZzp = this.zzi;
        zzlnVarZzp.getClass();
        this.zzo = zzlnVarZzp.zzb;
        this.zzp = zzlnVarZzp.zzg.zza.zzd;
        while (zzlnVarZzp != null) {
            zzlnVarZzp.zzn();
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        return zzs(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzw(com.google.android.gms.internal.ads.zzbf r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzln r0 = r13.zzi
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzlo r3 = r0.zzg
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.zzlo r1 = r13.zzx(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            com.google.android.gms.internal.ads.zzlo r6 = r13.zzE(r14, r1, r4)
            if (r6 == 0) goto L99
            long r7 = r3.zzb
            long r9 = r6.zzb
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L99
            com.google.android.gms.internal.ads.zzwk r7 = r3.zza
            com.google.android.gms.internal.ads.zzwk r8 = r6.zza
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L99
            r1 = r6
        L2a:
            long r6 = r3.zzc
            com.google.android.gms.internal.ads.zzlo r6 = r1.zzb(r6)
            r0.zzg = r6
            long r6 = r3.zze
            long r8 = r1.zze
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L90
            r0.zzs()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 != 0) goto L4c
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L51
        L4c:
            long r10 = r0.zza()
            long r8 = r8 + r10
        L51:
            com.google.android.gms.internal.ads.zzln r14 = r13.zzj
            r10 = -9223372036854775808
            r1 = 1
            if (r0 != r14) goto L66
            com.google.android.gms.internal.ads.zzlo r14 = r0.zzg
            boolean r14 = r14.zzg
            int r14 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r14 == 0) goto L64
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 < 0) goto L66
        L64:
            r14 = r1
            goto L67
        L66:
            r14 = r2
        L67:
            com.google.android.gms.internal.ads.zzln r5 = r13.zzk
            if (r0 != r5) goto L75
            int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r5 == 0) goto L73
            int r5 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r5 < 0) goto L75
        L73:
            r5 = r1
            goto L76
        L75:
            r5 = r2
        L76:
            int r0 = r13.zzs(r0)
            if (r0 == 0) goto L7d
            return r0
        L7d:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L82
            r6 = r3
        L82:
            if (r14 == 0) goto L8a
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 != 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            if (r5 == 0) goto L8f
            r14 = r2 | 2
            return r14
        L8f:
            return r2
        L90:
            com.google.android.gms.internal.ads.zzln r1 = r0.zzp()
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L99:
            int r14 = r13.zzs(r1)
            return r14
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlq.zzw(com.google.android.gms.internal.ads.zzbf, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzlo zzx(com.google.android.gms.internal.ads.zzbf r19, com.google.android.gms.internal.ads.zzlo r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzwk r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzI(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbd r5 = r0.zza
            r1.zzo(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.zze
            if (r1 != r4) goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r5.zzc(r1)
            r10 = r6
        L33:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L47
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzh(r1, r6)
        L41:
            r16 = r10
            r9 = r6
            r7 = r16
            goto L51
        L47:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4e
            r9 = r6
            r7 = r9
            goto L51
        L4e:
            long r6 = r5.zzd
            goto L41
        L51:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L5d
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L64
        L5d:
            int r1 = r3.zze
            if (r1 == r4) goto L64
            r5.zzk(r1)
        L64:
            com.google.android.gms.internal.ads.zzlo r1 = new com.google.android.gms.internal.ads.zzlo
            r5 = r3
            long r3 = r2.zzb
            long r11 = r2.zzc
            r2 = r5
            r5 = r11
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlq.zzx(com.google.android.gms.internal.ads.zzbf, com.google.android.gms.internal.ads.zzlo):com.google.android.gms.internal.ads.zzlo");
    }

    public final zzwk zzy(zzbf zzbfVar, Object obj, long j10) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i10) {
            zzln zzlnVarZzp = this.zzi;
            while (true) {
                if (zzlnVarZzp == null) {
                    zzln zzlnVarZzp2 = this.zzi;
                    while (true) {
                        if (zzlnVarZzp2 != null) {
                            int iZze2 = zzbfVar.zze(zzlnVarZzp2.zzb);
                            if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i10) {
                                jZzC = zzlnVarZzp2.zzg.zza.zzd;
                                break;
                            }
                            zzlnVarZzp2 = zzlnVarZzp2.zzp();
                        } else {
                            jZzC = zzC(obj);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = jZzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlnVarZzp.zzb.equals(obj)) {
                        jZzC = zzlnVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzlnVarZzp = zzlnVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j11 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i11 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i11, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j10, j11, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzguc zzgucVar, zzwk zzwkVar) {
        this.zzc.zzz(zzgucVar.zzi(), zzwkVar);
    }
}
