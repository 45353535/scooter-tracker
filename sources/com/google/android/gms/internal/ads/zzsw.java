package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsw implements zzrj {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;

    @Nullable
    private ByteBuffer zzH;
    private int zzI;

    @Nullable
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;

    @Nullable
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzsr zzZ;

    @Nullable
    private final Context zzb;
    private final zzsl zzc;
    private final zzte zzd;
    private final zzcv zze;
    private final zztd zzf;
    private final zzguf zzg;
    private final ArrayDeque zzh;

    @Nullable
    private zzsn zzi;
    private final zzsv zzj;
    private final zzsv zzk;

    @Nullable
    private zzpq zzl;

    @Nullable
    private zzrg zzm;

    @Nullable
    private zzsq zzn;
    private zzsq zzo;
    private zzck zzp;
    private final zzqm zzq;
    private zzqj zzr;

    @Nullable
    private zzqc zzs;
    private zzd zzt;

    @Nullable
    private zzsu zzu;
    private zzsu zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    /* synthetic */ zzsw(zzsp zzspVar, byte[] bArr) {
        this.zzb = zzspVar.zzb() == null ? null : zzspVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzZ = zzspVar.zzd();
        this.zzq = zzspVar.zzc();
        zzsl zzslVar = new zzsl();
        this.zzc = zzslVar;
        zzte zzteVar = new zzte();
        this.zzd = zzteVar;
        this.zze = new zzcv();
        this.zzf = new zztd();
        this.zzg = zzguf.zzk(zzteVar, zzslVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzsu(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zzsv();
        this.zzk = new zzsv();
        int iZzaf = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzspVar.zzb() != null) {
            iZzaf = zzaf(zzspVar.zzb().getDeviceId());
        }
        this.zzS = iZzaf;
    }

    static int zzD(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        byte b10;
        int i13;
        int i14;
        if (i10 == 20) {
            return zzafu.zzb(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzafs.zzb(zzfj.zzJ(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int i15 = zzadv.zza;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition;
                            while (true) {
                                if (i16 > iLimit) {
                                    i14 = -1;
                                } else if ((zzfj.zzJ(byteBuffer, i16 + 4) & (-2)) == -126718022) {
                                    i14 = i16 - iPosition;
                                } else {
                                    i16++;
                                }
                            }
                            if (i14 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i14) + ((byteBuffer.get((byteBuffer.position() + i14) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i17 = zzady.zza;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzady.zzb(new zzeq(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
                            sb2.append("Unexpected audio encoding: ");
                            sb2.append(i10);
                            throw new IllegalStateException(sb2.toString());
                    }
                    break;
            }
            return zzadv.zze(byteBuffer);
        }
        int i18 = zzaet.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b11 = byteBuffer.get(iPosition3);
        if (b11 != -2) {
            if (b11 == -1) {
                i12 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b10 = byteBuffer.get(iPosition3 + 7);
            } else if (b11 != 31) {
                i12 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                i13 = byteBuffer.get(iPosition3 + 5) & 252;
                i11 = (i13 >> 2) | i12;
            } else {
                i12 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                b10 = byteBuffer.get(iPosition3 + 6);
            }
            i13 = b10 & 60;
            i11 = (i13 >> 2) | i12;
        } else {
            i11 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i11 + 1) * 32;
    }

    static /* synthetic */ boolean zzG() {
        return zza.get() > 0;
    }

    private final void zzP() {
        zzck zzckVarZzl = this.zzo.zzl();
        this.zzp = zzckVarZzl;
        zzckVarZzl.zzb(zzcm.zza);
    }

    private final zzqc zzQ(zzql zzqlVar) throws zzrf {
        try {
            return ((zzsi) this.zzq).zzf(zzqlVar);
        } catch (zzqi e10) {
            zzrf zzrfVar = new zzrf(0, zzqlVar.zzb, zzqlVar.zzc, zzqlVar.zza, zzqlVar.zze, this.zzo.zzg(), false, e10);
            zzrg zzrgVar = this.zzm;
            if (zzrgVar == null) {
                throw zzrfVar;
            }
            zzrgVar.zza(zzrfVar);
            throw zzrfVar;
        }
    }

    private final void zzR(long j10) throws Exception {
        zzU(j10);
        if (this.zzJ != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzH;
            if (byteBuffer != null) {
                zzT(byteBuffer);
                zzU(j10);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzp.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzT(byteBufferZze);
                    zzU(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.zzH;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzH);
                    }
                }
            } while (this.zzJ == null);
            return;
        }
    }

    private final boolean zzS() throws Exception {
        if (!this.zzp.zzc()) {
            zzU(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzR(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzJ;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzT(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsw.zzT(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzU(long r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.zzJ
            if (r0 != 0) goto L6
            goto Lbb
        L6:
            com.google.android.gms.internal.ads.zzsv r0 = r8.zzk
            boolean r0 = r0.zzb()
            if (r0 != 0) goto Lbb
            java.nio.ByteBuffer r0 = r8.zzJ
            int r0 = r0.remaining()
            r1 = 0
            r3 = 1
            r4 = 0
            com.google.android.gms.internal.ads.zzqc r5 = r8.zzs     // Catch: com.google.android.gms.internal.ads.zzqb -> L83
            java.nio.ByteBuffer r6 = r8.zzJ     // Catch: com.google.android.gms.internal.ads.zzqb -> L83
            int r7 = r8.zzI     // Catch: com.google.android.gms.internal.ads.zzqb -> L83
            boolean r9 = r5.zzc(r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzqb -> L83
            long r5 = android.os.SystemClock.elapsedRealtime()
            r8.zzT = r5
            com.google.android.gms.internal.ads.zzsv r10 = r8.zzk
            r10.zzc()
            com.google.android.gms.internal.ads.zzqc r10 = r8.zzs
            boolean r10 = r10.zzg()
            if (r10 == 0) goto L49
            long r5 = r8.zzB
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L3d
            r8.zzV = r4
        L3d:
            boolean r10 = r8.zzN
            if (r10 == 0) goto L49
            com.google.android.gms.internal.ads.zzrg r10 = r8.zzm
            if (r10 == 0) goto L49
            if (r9 != 0) goto L49
            com.google.android.gms.internal.ads.zzsz r10 = (com.google.android.gms.internal.ads.zzsz) r10
        L49:
            com.google.android.gms.internal.ads.zzsq r10 = r8.zzo
            boolean r10 = r10.zzf()
            if (r10 == 0) goto L5e
            long r1 = r8.zzA
            java.nio.ByteBuffer r10 = r8.zzJ
            int r10 = r10.remaining()
            int r0 = r0 - r10
            long r5 = (long) r0
            long r1 = r1 + r5
            r8.zzA = r1
        L5e:
            if (r9 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzsq r9 = r8.zzo
            boolean r9 = r9.zzf()
            if (r9 != 0) goto L7f
            java.nio.ByteBuffer r9 = r8.zzJ
            java.nio.ByteBuffer r10 = r8.zzH
            if (r9 != r10) goto L6f
            goto L70
        L6f:
            r3 = r4
        L70:
            com.google.android.gms.internal.ads.zzgrc.zzi(r3)
            long r9 = r8.zzB
            int r0 = r8.zzC
            long r0 = (long) r0
            int r2 = r8.zzI
            long r2 = (long) r2
            long r0 = r0 * r2
            long r9 = r9 + r0
            r8.zzB = r9
        L7f:
            r9 = 0
            r8.zzJ = r9
            return
        L83:
            r9 = move-exception
            boolean r10 = r9.zzb
            if (r10 == 0) goto L9d
            long r5 = r8.zzac()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
            goto L9e
        L91:
            com.google.android.gms.internal.ads.zzqc r0 = r8.zzs
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L9d
            r8.zzV()
            goto L9e
        L9d:
            r3 = r4
        L9e:
            int r9 = r9.zza
            com.google.android.gms.internal.ads.zzri r0 = new com.google.android.gms.internal.ads.zzri
            com.google.android.gms.internal.ads.zzsq r1 = r8.zzo
            com.google.android.gms.internal.ads.zzv r1 = r1.zzg()
            r0.<init>(r9, r1, r3)
            com.google.android.gms.internal.ads.zzrg r9 = r8.zzm
            if (r9 == 0) goto Lb2
            r9.zza(r0)
        Lb2:
            if (r10 != 0) goto Lba
            com.google.android.gms.internal.ads.zzsv r9 = r8.zzk
            r9.zza(r0)
            return
        Lba:
            throw r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsw.zzU(long):void");
    }

    private final void zzV() {
        this.zzo.zzk();
    }

    private final void zzW() {
        if (zzab()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzX() {
        if (this.zzo != null) {
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            try {
                this.zzo = new zzsq(this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzo.zzj(), this.zzq.zzb(zzad(this.zzo.zzh(), -1)), this.zzo.zzl(), null);
            } catch (zzqd e10) {
                throw new IllegalStateException(new zzre(e10, this.zzo.zzg()));
            }
        }
        zzA();
    }

    private final void zzY(zzav zzavVar) {
        zzsu zzsuVar = new zzsu(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzab()) {
            this.zzu = zzsuVar;
        } else {
            this.zzv = zzsuVar;
        }
    }

    private final void zzZ(long j10) {
        zzav zzavVar;
        boolean z10;
        if (zzaa()) {
            zzsr zzsrVar = this.zzZ;
            zzavVar = this.zzw;
            zzsrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzaa()) {
            zzsr zzsrVar2 = this.zzZ;
            z10 = this.zzx;
            zzsrVar2.zzc(z10);
        } else {
            z10 = false;
        }
        this.zzx = z10;
        this.zzh.add(new zzsu(zzavVar2, Math.max(0L, j10), this.zzo.zzd(zzac()), null));
        zzP();
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzaw().zzh(this.zzx);
        }
    }

    private final boolean zzaa() {
        if (!this.zzo.zzf()) {
            return false;
        }
        int i10 = this.zzo.zzg().zzI;
        return true;
    }

    private final boolean zzab() {
        return this.zzs != null;
    }

    private final long zzac() {
        if (!this.zzo.zzf()) {
            return this.zzB;
        }
        long j10 = this.zzA;
        long jZzj = this.zzo.zzj();
        String str = zzfj.zza;
        return ((j10 + jZzj) - 1) / jZzj;
    }

    private final zzqf zzad(zzv zzvVar, int i10) {
        zzqe zzqeVar = new zzqe(zzvVar);
        zzqeVar.zza(this.zzt);
        zzqeVar.zzb(this.zzR);
        zzqeVar.zzc(this.zzO);
        zzqeVar.zze(-1);
        zzqeVar.zzd(this.zzS);
        return new zzqf(zzqeVar, null);
    }

    private final void zzae() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    private static int zzaf(int i10) {
        if (i10 == 0 || i10 == -1) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzA() {
        if (zzab()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzsu(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzP();
            this.zzi = null;
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzB() {
        zzA();
        zzguf zzgufVar = this.zzg;
        int size = zzgufVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzco) zzgufVar.get(i10)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzC() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzE() {
        if (this.zzX >= 300000) {
            ((zzsz) this.zzm).zza.zzay(true);
            this.zzX = 0L;
        }
    }

    final /* synthetic */ void zzF() {
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzR();
        }
    }

    final /* synthetic */ zzsn zzI() {
        return this.zzi;
    }

    final /* synthetic */ zzrg zzJ() {
        return this.zzm;
    }

    final /* synthetic */ zzsq zzK() {
        return this.zzo;
    }

    final /* synthetic */ zzqc zzL() {
        return this.zzs;
    }

    final /* synthetic */ void zzM(boolean z10) {
        this.zzM = true;
    }

    final /* synthetic */ boolean zzN() {
        return this.zzN;
    }

    final /* synthetic */ long zzO() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zza(zzrg zzrgVar) {
        this.zzm = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzb(@Nullable zzpq zzpqVar) {
        this.zzl = zzpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzc(zzdn zzdnVar) {
        this.zzq.zzd(zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final int zze(zzv zzvVar) {
        int i10 = this.zzq.zza(zzad(zzvVar, -1)).zzd;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzpz zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzpz.zza;
        }
        zzqh zzqhVarZza = this.zzq.zza(zzad(zzvVar, -1));
        zzpy zzpyVar = new zzpy();
        zzpyVar.zza(zzqhVarZza.zza);
        zzpyVar.zzb(zzqhVarZza.zzb);
        zzpyVar.zzc(zzqhVarZza.zzc);
        return zzpyVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzg(boolean z10) {
        ArrayDeque arrayDeque;
        long j10;
        if (!zzab() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzs.zzk(), this.zzo.zzd(zzac()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || jMin < ((zzsu) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzsu) arrayDeque.remove();
        }
        zzsu zzsuVar = this.zzv;
        long j11 = jMin - zzsuVar.zzc;
        long jZzv = zzfj.zzv(j11, zzsuVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzZ.zzd(j11);
            zzsu zzsuVar2 = this.zzv;
            j10 = zzsuVar2.zzb + jZzd;
            zzsuVar2.zzd = jZzd - jZzv;
        } else {
            zzsu zzsuVar3 = this.zzv;
            j10 = zzsuVar3.zzb + jZzv + zzsuVar3.zzd;
        }
        long jZze = this.zzZ.zze();
        long jZzd2 = j10 + this.zzo.zzd(jZze);
        long j12 = this.zzW;
        if (jZze > j12) {
            long jZzd3 = this.zzo.zzd(jZze - j12);
            this.zzW = jZze;
            this.zzX += jZzd3;
            if (this.zzY == null) {
                this.zzY = new Handler(Looper.myLooper());
            }
            this.zzY.removeCallbacksAndMessages(null);
            this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzst
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzE();
                }
            }, 100L);
        }
        return jZzd2;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzh(zzv zzvVar, int i10, @Nullable int[] iArr) throws zzre {
        zzck zzckVar;
        zzv zzvVarZzM;
        int iZzD;
        int iZzD2;
        if (this.zzr == null && this.zzb != null) {
            zzqj zzqjVar = new zzqj() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // com.google.android.gms.internal.ads.zzqj
                public final /* synthetic */ void zza() {
                    this.zza.zzF();
                }
            };
            this.zzr = zzqjVar;
            this.zzq.zzc(zzqjVar);
        }
        if ("audio/raw".equals(zzvVar.zzo)) {
            int i11 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i11));
            int i12 = zzvVar.zzG;
            iZzD = zzfj.zzD(i11) * i12;
            zzguc zzgucVar = new zzguc();
            zzgucVar.zzh(this.zzg);
            zzgucVar.zzf(this.zze);
            zzgucVar.zzg(this.zzZ.zza());
            zzckVar = new zzck(zzgucVar.zzi());
            if (zzckVar.equals(this.zzp)) {
                zzckVar = this.zzp;
            }
            this.zzd.zzq(zzvVar.zzJ, zzvVar.zzK);
            this.zzc.zzq(iArr);
            try {
                zzcl zzclVarZza = zzckVar.zza(new zzcl(zzvVar.zzH, i12, i11));
                zzt zztVarZza = zzvVar.zza();
                int i13 = zzclVarZza.zzd;
                zztVarZza.zzG(i13);
                zztVarZza.zzF(zzclVarZza.zzb);
                int i14 = zzclVarZza.zzc;
                zztVarZza.zzE(i14);
                zzvVarZzM = zztVarZza.zzM();
                iZzD2 = zzfj.zzD(i13) * i14;
            } catch (zzcn e10) {
                throw new zzre(e10, zzvVar);
            }
        } else {
            zzckVar = new zzck(zzguf.zzi());
            zzvVarZzM = zzvVar;
            iZzD = -1;
            iZzD2 = -1;
        }
        zzck zzckVar2 = zzckVar;
        zzqf zzqfVarZzad = zzad(zzvVarZzM, -1);
        try {
            zzql zzqlVarZzb = this.zzq.zzb(zzqfVarZzad);
            if (zzqlVarZzb.zza == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=");
                sb2.append(false);
                sb2.append(")");
                throw new zzre(sb2.toString(), zzqfVarZzad.zza);
            }
            if (zzqlVarZzb.zzc == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=");
                sb3.append(false);
                sb3.append(")");
                throw new zzre(sb3.toString(), zzqfVarZzad.zza);
            }
            this.zzU = false;
            zzsq zzsqVar = new zzsq(zzvVar, zzvVarZzM, iZzD, iZzD2, zzqlVarZzb, zzckVar2, null);
            if (zzab()) {
                this.zzn = zzsqVar;
            } else {
                this.zzo = zzsqVar;
            }
        } catch (zzqd e11) {
            throw new zzre(e11, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzi() {
        this.zzN = true;
        if (zzab()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzk(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        zzqc zzqcVarZzQ;
        long j11;
        long jZzi;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgrc.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzS()) {
                return false;
            }
            if (this.zzn.zzb(this.zzo)) {
                this.zzo = this.zzn;
                this.zzn = null;
                zzqc zzqcVar = this.zzs;
                if (zzqcVar != null && zzqcVar.zzg()) {
                    this.zzo.zzk();
                }
            } else {
                zzae();
                if (zzn()) {
                    return false;
                }
                zzA();
            }
            zzZ(j10);
        }
        if (!zzab()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqcVarZzQ = zzQ(this.zzo.zzk());
                } catch (zzrf e10) {
                    if (this.zzo.zzk().zze > 1000000) {
                        zzqk zzqkVar = new zzqk(this.zzo.zzk(), null);
                        zzqkVar.zze(1000000);
                        zzql zzqlVar = new zzql(zzqkVar, null);
                        try {
                            zzqc zzqcVarZzQ2 = zzQ(zzqlVar);
                            this.zzo = this.zzo.zza(zzqlVar);
                            zzqcVarZzQ = zzqcVarZzQ2;
                        } catch (zzrf e11) {
                            e10.addSuppressed(e11);
                            zzV();
                            throw e10;
                        }
                    }
                    zzV();
                    throw e10;
                }
                this.zzs = zzqcVarZzQ;
                zzsn zzsnVar = new zzsn(this, this.zzo.zzk(), bArr);
                this.zzi = zzsnVar;
                this.zzs.zzm(zzsnVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzk();
                }
                zzpq zzpqVar = this.zzl;
                if (zzpqVar != null) {
                    this.zzs.zzn(zzpqVar);
                }
                zzW();
                int i11 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int iZzh = this.zzs.zzh();
                int i12 = this.zzO;
                this.zzO = iZzh;
                zzrg zzrgVar = this.zzm;
                if (zzrgVar != null) {
                    ((zzsz) zzrgVar).zza.zzaw().zzk(this.zzo.zze());
                    if (iZzh != i12) {
                        this.zzP = true;
                        zzsq zzsqVar = this.zzo;
                        zzqk zzqkVar2 = new zzqk(zzsqVar.zzk(), null);
                        zzqkVar2.zzg(this.zzO);
                        this.zzo = zzsqVar.zza(new zzql(zzqkVar2, null));
                        zzsq zzsqVar2 = this.zzn;
                        if (zzsqVar2 != null) {
                            zzqk zzqkVar3 = new zzqk(zzsqVar2.zzk(), null);
                            zzqkVar3.zzg(this.zzO);
                            this.zzn = zzsqVar2.zza(new zzql(zzqkVar3, null));
                        }
                        zzrg zzrgVar2 = this.zzm;
                        int i13 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzta zztaVar = ((zzsz) zzrgVar2).zza;
                            if (zztaVar.zzax() != null) {
                                zztaVar.zzax().zza(i13);
                            }
                        }
                        ((zzsz) zzrgVar2).zza.zzaw().zzm(i13);
                    }
                }
            } catch (zzrf e12) {
                this.zzj.zza(e12);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j10);
            this.zzD = false;
            this.zzE = false;
            zzZ(j10);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgrc.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zzf() && this.zzC == 0) {
                int iZzD = zzD(this.zzo.zzk().zza, byteBuffer);
                this.zzC = iZzD;
                if (iZzD == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzS()) {
                    return false;
                }
                zzZ(j10);
                this.zzu = null;
            }
            long j12 = this.zzF;
            zzsq zzsqVar3 = this.zzo;
            if (zzsqVar3.zzf()) {
                j11 = 0;
                jZzi = this.zzy / ((long) this.zzo.zzi());
            } else {
                j11 = 0;
                jZzi = this.zzz;
            }
            long jZzc = j12 + zzsqVar3.zzc(jZzi - this.zzd.zzs());
            if (!this.zzD && Math.abs(jZzc - j10) > 200000) {
                zzrg zzrgVar3 = this.zzm;
                if (zzrgVar3 != null) {
                    zzrgVar3.zza(new zzrh(j10, jZzc));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzS()) {
                    return false;
                }
                long j13 = j10 - jZzc;
                this.zzF += j13;
                this.zzD = false;
                zzZ(j10);
                zzrg zzrgVar4 = this.zzm;
                if (zzrgVar4 != null && j13 != j11) {
                    ((zzsz) zzrgVar4).zza.zzao();
                }
            }
            if (this.zzo.zzf()) {
                this.zzy += (long) byteBuffer.remaining();
            } else {
                this.zzz += ((long) this.zzC) * ((long) i10);
            }
            this.zzH = byteBuffer;
            this.zzI = i10;
        }
        zzR(j10);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzee.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzA();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzl() throws zzri {
        if (!this.zzK && zzab() && zzS()) {
            zzae();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzm() {
        if (zzab()) {
            return this.zzK && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzn() {
        if (!zzab()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzM) {
            return false;
        }
        long jZzac = zzac();
        long jZzk = this.zzs.zzk();
        zzqc zzqcVar = this.zzs;
        zzqcVar.getClass();
        return jZzac > zzfj.zzs(jZzk, zzqcVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzo(zzav zzavVar) {
        float f10 = zzavVar.zzb;
        String str = zzfj.zza;
        this.zzw = new zzav(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        zzY(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzq(boolean z10) {
        this.zzx = z10;
        zzY(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzs(int i10) {
        if (this.zzP) {
            if (this.zzO != i10) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i10) {
            this.zzO = i10;
            zzX();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzt(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i10 = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzv(int i10) {
        int i11 = this.zzS;
        int iZzaf = zzaf(i10);
        if (i11 == iZzaf) {
            return;
        }
        this.zzS = iZzaf;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzw() {
        if (!zzab()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zzf()) {
            return this.zzo.zzd(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzaey.zzf(this.zzo.zzk().zza);
        zzgrc.zzi(iZzf != -2147483647);
        return zzfj.zzt(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    @RequiresApi(29)
    public final void zzx(int i10, int i11) {
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzy(float f10) {
        if (this.zzG != f10) {
            this.zzG = f10;
            zzW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzz() {
        this.zzN = false;
        if (zzab()) {
            this.zzs.zzb();
        }
    }
}
