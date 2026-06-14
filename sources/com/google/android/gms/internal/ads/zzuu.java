package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private float zzA;

    @Nullable
    private ArrayDeque zzB;

    @Nullable
    private zzuq zzC;

    @Nullable
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;

    @Nullable
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;

    @Nullable
    private zzv zzn;
    private zzv zzo;

    @Nullable
    private zzth zzp;

    @Nullable
    private zzth zzq;
    private zzmk zzr;

    @Nullable
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;

    @Nullable
    private zzuk zzw;

    @Nullable
    private zzv zzx;

    @Nullable
    private MediaFormat zzy;
    private boolean zzz;

    public zzuu(int i10, zzui zzuiVar, zzuw zzuwVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f10;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar == null) {
                throw null;
            }
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzax(int i10) throws zziw {
        zzlh zzlhVarZzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int iZzO = zzO(zzlhVarZzH, zzihVar, i10 | 4);
        if (iZzO == -5) {
            zzam(zzlhVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j10) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j10 < this.zzt;
    }

    protected static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(@Nullable zzv zzvVar) throws zziw {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f10 = this.zzv;
            zzvVar.getClass();
            float fZzai = zzai(f10, zzvVar, zzI());
            float f11 = this.zzA;
            if (f11 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f11 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = fZzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zziw {
        int i10 = this.zzY;
        if (i10 == 1) {
            zzav();
            return;
        }
        if (i10 == 2) {
            zzav();
            zzbp();
        } else if (i10 != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() throws zziw {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzv zzvVar = this.zzo;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, "audio/opus") && zzafu.zzf(j10, j11)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzA(long j10, boolean z10, boolean z11) throws zziw {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final long zzT(long j10, long j11) {
        return zzah(j10, j11, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public void zzV(float f10, float f11) throws zziw {
        this.zzu = f10;
        this.zzv = f11;
        zzbj(this.zzx);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:128|129|(12:390|131|(2:133|(2:135|(6:137|(1:146)(1:143)|144|145|227|(2:402|229)(1:230))(2:396|147))(6:395|148|(1:154)|155|(1:159)|160))(2:162|(4:164|145|227|(0)(0))(2:167|(7:172|(1:174)|175|(1:181)|(1:183)(2:184|(0))|188|(1:190)(2:398|191))(2:397|171)))|358|(2:361|(1:379))|365|(1:370)(1:369)|(1:372)|373|(1:375)(1:376)|377|378)(1:192)|193|(1:197)(1:198)|199|(1:204)(1:203)|205|206|388|207|(3:209|210|(5:212|(1:214)(1:215)|(1:221)|222|(2:401|224)(3:226|227|(0)(0)))(1:400))(3:399|349|350)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026a, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x035d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0372, code lost:
    
        r4 = r22.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0374, code lost:
    
        if (r4 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0379, code lost:
    
        if (r22.zzX == 2) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x037d, code lost:
    
        if (r22.zzad == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0385, code lost:
    
        if (r22.zzN >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0387, code lost:
    
        r0 = r4.zze();
        r22.zzN = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x038d, code lost:
    
        if (r0 < 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x038f, code lost:
    
        r5 = r22.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x039c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x039d, code lost:
    
        if (r22.zzX != 1) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03a1, code lost:
    
        if (r22.zzJ != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03a3, code lost:
    
        r22.zzaa = true;
        r4.zza(r22.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03b7, code lost:
    
        r22.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03be, code lost:
    
        if (r22.zzH == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03c1, code lost:
    
        r22.zzH = false;
        r0 = r22.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03c7, code lost:
    
        if (r0 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03c9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.zzuu.zzb);
        r4.zza(r22.zzN, 0, 38, 0, 0);
        zzbh();
        r22.zzZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03e6, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03ea, code lost:
    
        if (r22.zzW != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03ec, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03ed, code lost:
    
        r5 = r22.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03ef, code lost:
    
        if (r5 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03f7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03f9, code lost:
    
        r5 = (byte[]) r22.zzx.zzr.get(r0);
        r6 = r22.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0407, code lost:
    
        if (r6 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0409, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x040f, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0410, code lost:
    
        r22.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0413, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0414, code lost:
    
        r0 = r22.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0418, code lost:
    
        if (r0 == null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x041a, code lost:
    
        r0 = r0.position();
        r5 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0422, code lost:
    
        r4.zzi(new com.google.android.gms.internal.ads.zzur(r22, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x042a, code lost:
    
        r6 = r22.zzm.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0431, code lost:
    
        if (r6 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0437, code lost:
    
        if (zzcW() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0439, code lost:
    
        zzbo().zzf = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0444, code lost:
    
        if (r6 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0448, code lost:
    
        if (r22.zzW != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x044a, code lost:
    
        r22.zzg.zza();
        r22.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0451, code lost:
    
        zzam(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0456, code lost:
    
        r5 = r22.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x045c, code lost:
    
        if (r5.zzb() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x045e, code lost:
    
        zzbo().zzf = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0468, code lost:
    
        if (r22.zzW != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x046a, code lost:
    
        r5.zza();
        r22.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x046f, code lost:
    
        r22.zzad = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0473, code lost:
    
        if (r22.zzZ != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0475, code lost:
    
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x047c, code lost:
    
        if (r22.zzJ != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x047e, code lost:
    
        r22.zzaa = true;
        r4.zza(r22.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0492, code lost:
    
        if (r22.zzZ != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0498, code lost:
    
        if (r5.zzc() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x049a, code lost:
    
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x049f, code lost:
    
        if (r22.zzW != 2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x04a1, code lost:
    
        r22.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x04a5, code lost:
    
        r6 = r5.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x04ab, code lost:
    
        if (zzaT(r5) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04ad, code lost:
    
        r8 = r5.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04b1, code lost:
    
        if (r8 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04b3, code lost:
    
        r5.zzb.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04ba, code lost:
    
        if (r22.zzaf == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04bc, code lost:
    
        r0 = zzbo().zze;
        r9 = r22.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04c4, code lost:
    
        if (r9 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04c6, code lost:
    
        r0.zza(r6, r9);
        r22.zzaf = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04cc, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04cd, code lost:
    
        r22.zzac = java.lang.Math.max(r22.zzac, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04d9, code lost:
    
        if (zzcW() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04df, code lost:
    
        if (r5.zzd() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04e1, code lost:
    
        zzbo().zzf = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04e9, code lost:
    
        r5.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04f0, code lost:
    
        if (r5.zze() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04f2, code lost:
    
        zzas(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x04f7, code lost:
    
        if (r22.zzak == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04f9, code lost:
    
        r9 = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x04fd, code lost:
    
        if (r6 > r9) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x04ff, code lost:
    
        r22.zzal += (r9 - r6) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0509, code lost:
    
        r22.zzac = r6;
        r22.zzak = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x050d, code lost:
    
        zzaR(r5);
        r10 = zzaS(r5);
        r6 = r6 + r22.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0517, code lost:
    
        if (r8 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0519, code lost:
    
        r4.zzb(r22.zzN, 0, r5.zzb, r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0524, code lost:
    
        r0 = r22.zzN;
        r5 = r5.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0529, code lost:
    
        if (r5 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x052b, code lost:
    
        r4.zza(r0, 0, r5.limit(), r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0534, code lost:
    
        zzbh();
        r22.zzZ = true;
        r22.zzW = 0;
        r22.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0543, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0544, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0545, code lost:
    
        zzal(r0);
        zzax(0);
        zzav();
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0556, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x055f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0560, code lost:
    
        r12 = r5;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0369 A[LOOP:0: B:126:0x01fa->B:230:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.google.android.gms.internal.ads.zzml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzX(long r23, long r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzX(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e8 A[Catch: Exception -> 0x0167, TryCatch #6 {Exception -> 0x0167, blocks: (B:72:0x0155, B:78:0x0172, B:80:0x017a, B:82:0x0182, B:84:0x018c, B:86:0x0194, B:88:0x019c, B:108:0x01e2, B:110:0x01e8, B:114:0x01f5, B:116:0x01fb, B:120:0x0208, B:122:0x020e, B:147:0x0267, B:149:0x026d, B:127:0x021c, B:129:0x0224, B:131:0x022c, B:133:0x0234, B:135:0x023c, B:137:0x0244, B:139:0x024c, B:141:0x0256, B:143:0x0260, B:93:0x01aa, B:95:0x01b2, B:99:0x01be, B:101:0x01c8, B:103:0x01d0, B:105:0x01d8), top: B:207:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026d A[Catch: Exception -> 0x0167, TRY_LEAVE, TryCatch #6 {Exception -> 0x0167, blocks: (B:72:0x0155, B:78:0x0172, B:80:0x017a, B:82:0x0182, B:84:0x018c, B:86:0x0194, B:88:0x019c, B:108:0x01e2, B:110:0x01e8, B:114:0x01f5, B:116:0x01fb, B:120:0x0208, B:122:0x020e, B:147:0x0267, B:149:0x026d, B:127:0x021c, B:129:0x0224, B:131:0x022c, B:133:0x0234, B:135:0x023c, B:137:0x0244, B:139:0x024c, B:141:0x0256, B:143:0x0260, B:93:0x01aa, B:95:0x01b2, B:99:0x01be, B:101:0x01c8, B:103:0x01d0, B:105:0x01d8), top: B:207:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02eb A[Catch: zzuq -> 0x0082, TryCatch #9 {zzuq -> 0x0082, blocks: (B:24:0x0055, B:26:0x005c, B:28:0x0060, B:30:0x0076, B:35:0x0087, B:39:0x0093, B:41:0x009b, B:43:0x009f, B:45:0x00a3, B:47:0x00ac, B:175:0x02d1, B:177:0x02eb, B:179:0x02f4, B:182:0x0300, B:183:0x0302, B:178:0x02ee, B:185:0x0304, B:186:0x0305, B:188:0x030a, B:189:0x030b, B:190:0x0315, B:37:0x008a, B:38:0x0092, B:192:0x0318), top: B:213:0x0055, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ee A[Catch: zzuq -> 0x0082, TryCatch #9 {zzuq -> 0x0082, blocks: (B:24:0x0055, B:26:0x005c, B:28:0x0060, B:30:0x0076, B:35:0x0087, B:39:0x0093, B:41:0x009b, B:43:0x009f, B:45:0x00a3, B:47:0x00ac, B:175:0x02d1, B:177:0x02eb, B:179:0x02f4, B:182:0x0300, B:183:0x0302, B:178:0x02ee, B:185:0x0304, B:186:0x0305, B:188:0x030a, B:189:0x030b, B:190:0x0315, B:37:0x008a, B:38:0x0092, B:192:0x0318), top: B:213:0x0055, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bb  */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.google.android.gms.internal.ads.zzuk] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [com.google.android.gms.internal.ads.zzuj, com.google.android.gms.internal.ads.zzus] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.google.android.gms.internal.ads.zzun] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzaA() throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzaA():void");
    }

    protected final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    protected boolean zzaC(zzun zzunVar) {
        return true;
    }

    protected final boolean zzaD() {
        return this.zzS;
    }

    @Nullable
    protected final zzuk zzaE() {
        return this.zzw;
    }

    @Nullable
    protected final zzv zzaF() {
        return this.zzx;
    }

    @Nullable
    protected final MediaFormat zzaG() {
        return this.zzy;
    }

    @Nullable
    protected final zzun zzaH() {
        return this.zzD;
    }

    protected final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                if (zzunVar == null) {
                    throw null;
                }
                zzak(zzunVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        } catch (Throwable th2) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
            throw th2;
        }
    }

    protected final boolean zzaJ() throws zziw {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    protected boolean zzaK() {
        int i10 = this.zzY;
        if (i10 == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e10) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    protected boolean zzaL() {
        return true;
    }

    protected final long zzaM() {
        return this.zzal;
    }

    @CallSuper
    protected void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    @CallSuper
    protected final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    protected zzum zzaP(Throwable th2, @Nullable zzun zzunVar) {
        return new zzum(th2, zzunVar);
    }

    protected boolean zzaQ(zzv zzvVar) throws zziw {
        return true;
    }

    protected void zzaR(zzih zzihVar) throws zziw {
    }

    protected int zzaS(zzih zzihVar) {
        return 0;
    }

    protected boolean zzaT(zzih zzihVar) {
        return false;
    }

    protected final long zzaU() {
        return this.zzah;
    }

    @CallSuper
    protected void zzaV(long j10) {
        this.zzah = j10;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j10 < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    protected final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    protected final float zzaX() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final zzmk zzaY() {
        return this.zzr;
    }

    protected final boolean zzaZ() throws zziw {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e10) {
            throw zzN(e10, zzvVar, false, 4002);
        }
    }

    protected abstract int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy;

    protected abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z10) throws zzuy;

    protected boolean zzae(zzv zzvVar) {
        return false;
    }

    protected abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f10);

    protected zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected long zzah(long j10, long j11, boolean z10) {
        return super.zzT(j10, j11);
    }

    protected float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzaj(String str, zzuh zzuhVar, long j10, long j11) {
        throw null;
    }

    protected void zzak(String str) {
        throw null;
    }

    protected void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.gms.internal.ads.zzio zzam(com.google.android.gms.internal.ads.zzlh r14) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzam(com.google.android.gms.internal.ads.zzlh):com.google.android.gms.internal.ads.zzio");
    }

    protected void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zziw {
        throw null;
    }

    protected void zzap() {
    }

    protected abstract boolean zzaq(long j10, long j11, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zziw;

    protected void zzar() throws zziw {
        throw null;
    }

    protected void zzas(zzih zzihVar) throws zziw {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    protected final long zzba() {
        return this.zzag.zzf;
    }

    protected final long zzbb() {
        return this.zzag.zzd;
    }

    protected final long zzbc() {
        return this.zzag.zzc;
    }

    final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i10, @Nullable Object obj) throws zziw {
        if (i10 == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzy(boolean z10, boolean z11) throws zziw {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void zzz(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzwk r17) throws com.google.android.gms.internal.ads.zziw {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzut r12 = r11.zzag
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzut r4 = new com.google.android.gms.internal.ads.zzut
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbn(r4)
            boolean r12 = r11.zzaj
            if (r12 == 0) goto L56
            r11.zzap()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzac
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzah
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzut r4 = new com.google.android.gms.internal.ads.zzut
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbn(r4)
            com.google.android.gms.internal.ads.zzut r12 = r11.zzag
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzap()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzut r0 = new com.google.android.gms.internal.ads.zzut
            long r1 = r11.zzac
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzwk):void");
    }
}
