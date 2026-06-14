package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacc extends zzuu implements zzacr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;

    @Nullable
    private zzms zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;

    @Nullable
    private zzbv zzJ;
    private int zzK;
    private int zzL;

    @Nullable
    private zzacp zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzadl zzg;
    private final boolean zzh;
    private final zzacs zzi;
    private final zzacq zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzacb zzm;
    private boolean zzn;
    private boolean zzo;
    private zzadr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;

    @Nullable
    private Surface zzt;

    @Nullable
    private zzace zzu;
    private zzes zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    protected zzacc(zzaca zzacaVar) {
        super(2, zzacaVar.zzg(), zzacaVar.zzf(), false, 30.0f);
        Context applicationContext = zzacaVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzadl(zzacaVar.zzh(), zzacaVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzacs(applicationContext, this, 0L);
        this.zzj = new zzacq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzes.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzat(com.google.android.gms.internal.ads.zzun r11, com.google.android.gms.internal.ads.zzv r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacc.zzat(com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzv):int");
    }

    protected static int zzbh(zzun zzunVar, zzv zzvVar) {
        int i10 = zzvVar.zzp;
        if (i10 == -1) {
            return zzat(zzunVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean zzbl(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacc.zzbl(java.lang.String):boolean");
    }

    protected static final boolean zzbm(zzun zzunVar) {
        return Build.VERSION.SDK_INT >= 35 && zzunVar.zzh;
    }

    private static List zzbn(Context context, zzuw zzuwVar, zzv zzvVar, boolean z10, boolean z11) throws zzuy {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzguf.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            List listZzd = zzvg.zzd(zzuwVar, zzvVar, z10, z11);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzvg.zzc(zzuwVar, zzvVar, z10, z11);
    }

    private final void zzbo(@Nullable Object obj) throws zziw {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbw();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int iZze = zze();
        zzuk zzukVarZzaE = zzaE();
        if (zzukVarZzaE != null && this.zzp == null) {
            zzun zzunVarZzaH = zzaH();
            zzunVarZzaH.getClass();
            if (!zzbs(zzunVarZzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface surfaceZzbt = zzbt(zzunVarZzaH);
                if (surfaceZzbt != null) {
                    zzukVarZzaE.zzn(surfaceZzbt);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzukVarZzaE.zzo();
                }
            }
        }
        if (surface != null) {
            zzbw();
        } else {
            this.zzJ = null;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzq();
            }
        }
        if (iZze == 2) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbp(zzih zzihVar) {
        if (zzcW() || zzihVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzihVar.zze - zzbb()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean zzbq(zzih zzihVar) {
        return zzihVar.zze < zzG();
    }

    private final void zzbr(long j10, long j11, zzv zzvVar) {
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            zzacpVar.zzcS(j10, j11, zzvVar, zzaG());
        }
    }

    private final boolean zzbs(zzun zzunVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbm(zzunVar) || zzbg(zzunVar);
    }

    @Nullable
    private final Surface zzbt(zzun zzunVar) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbm(zzunVar)) {
            return null;
        }
        zzgrc.zzi(zzbg(zzunVar));
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            if (zzaceVar.zza != zzunVar.zzf) {
                zzbu();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzace.zzb(this.zze, zzunVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbu() {
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            zzaceVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzbv, reason: merged with bridge method [inline-methods] */
    public final void zzbj() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbw() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzA(long j10, boolean z10, boolean z11) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null && !z10) {
            zzadrVar.zzg(true);
        }
        super.zzA(j10, z10, z11);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z10) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzC() {
        if (this.zzA > 0) {
            long jZzb = zzL().zzb();
            this.zzg.zzd(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i10 = this.zzG;
        if (i10 != 0) {
            this.zzg.zze(this.zzF, i10);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzadl zzadlVar = this.zzg;
            zzadlVar.zzi(((zzuu) this).zza);
            zzadlVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzF() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzf) {
            return;
        }
        zzadrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final boolean zzU(long j10) {
        long jZzaU = zzaU();
        return jZzaU == -9223372036854775807L || j10 > jZzaU - zzbb();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final void zzV(float f10, float f11) throws zziw {
        super.zzV(f10, f11);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzm(f10);
        } else {
            this.zzi.zzn(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final void zzW() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i10 = this.zzr;
        if (i10 == 0 || i10 == 1) {
            this.zzr = 0;
        } else {
            zzadrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    @CallSuper
    public final void zzX(long j10, long j11) throws Throwable {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            try {
                zzadrVar.zzv(j10, j11);
            } catch (zzadq e10) {
                throw zzN(e10, e10.zza, false, 7001);
            }
        }
        super.zzX(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        boolean zZzaW = zzaW();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzh(zZzaW);
        }
        if (zZzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zZzaW);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzadr zzadrVar = this.zzp;
        return zzadrVar == null || zzadrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaC(zzun zzunVar) {
        return zzbs(zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaK() {
        zzun zzunVarZzaH = zzaH();
        if (this.zzp != null && zzunVarZzaH != null) {
            String str = zzunVarZzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzuu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean zzaL() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzv r0 = r12.zzaF()
            long r1 = r12.zzO
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r1 = r1 + r8
            long r8 = r12.zzbb()
            long r10 = r12.zzO
            long r8 = r8 + r10
            long r10 = r12.zzaM()
            long r10 = r10 + r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 - r8
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zzms r2 = r12.zzD
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzE
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzq
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzba()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacc.zzaL():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzum zzaP(Throwable th2, @Nullable zzun zzunVar) {
        return new zzabw(th2, zzunVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final boolean zzaQ(zzv zzvVar) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || zzadrVar.zze()) {
            return true;
        }
        try {
            zzadrVar.zzd(zzvVar);
            return true;
        } catch (zzadq e10) {
            throw zzN(e10, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final void zzaR(zzih zzihVar) throws zziw {
        int iZzaS = zzaS(zzihVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaS & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzaS(zzih zzihVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbq(zzihVar) || zzbp(zzihVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaT(zzih zzihVar) {
        boolean z10 = false;
        if (zzbp(zzihVar)) {
            return false;
        }
        if (zzbq(zzihVar)) {
            if (zzihVar.zze()) {
                return false;
            }
            if (zzihVar.zzf()) {
                zzihVar.zza();
                z10 = true;
            }
            if (z10) {
                ((zzuu) this).zza.zzd++;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final void zzaV(long j10) {
        super.zzaV(j10);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        boolean z10;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i10 = 0;
        boolean z11 = zzvVar.zzs != null;
        List listZzbn = zzbn(context, zzuwVar, zzvVar, z11, false);
        if (z11 && listZzbn.isEmpty()) {
            listZzbn = zzbn(context, zzuwVar, zzvVar, false, false);
        }
        if (listZzbn.isEmpty()) {
            return 129;
        }
        if (!zzuu.zzbd(zzvVar)) {
            return 130;
        }
        zzun zzunVar = (zzun) listZzbn.get(0);
        boolean zZzc = zzunVar.zzc(zzvVar);
        if (zZzc) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listZzbn.size(); i11++) {
                zzun zzunVar2 = (zzun) listZzbn.get(i11);
                if (zzunVar2.zzc(zzvVar)) {
                    zZzc = true;
                    z10 = false;
                    zzunVar = zzunVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = true != zZzc ? 3 : 4;
        int i13 = true != zzunVar.zze(zzvVar) ? 8 : 16;
        int i14 = true != zzunVar.zzg ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            i15 = 256;
        }
        if (zZzc) {
            List listZzbn2 = zzbn(context, zzuwVar, zzvVar, z11, true);
            if (!listZzbn2.isEmpty()) {
                zzun zzunVar3 = (zzun) zzvg.zze(listZzbn2, zzvVar).get(0);
                if (zzunVar3.zzc(zzvVar) && zzunVar3.zze(zzvVar)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z10) throws zzuy {
        return zzvg.zze(zzbn(this.zze, zzuwVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f10) {
        int i10;
        zzacb zzacbVar;
        Point pointZzi;
        int i11;
        int i12;
        int i13;
        boolean z10;
        zzv[] zzvVarArr;
        byte b10;
        boolean z11;
        Pair pairZzd;
        int iZzat;
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbh = zzbh(zzunVar, zzvVar);
        int i14 = zzvVar.zzw;
        int i15 = zzvVar.zzv;
        if (length == 1) {
            if (iZzbh != -1 && (iZzat = zzat(zzunVar, zzvVar)) != -1) {
                iZzbh = Math.min((int) (iZzbh * 1.5f), iZzat);
            }
            zzacbVar = new zzacb(i15, i14, iZzbh);
            i10 = 35;
        } else {
            int iMax = i14;
            int iMax2 = i15;
            int i16 = 0;
            boolean z12 = false;
            i10 = 35;
            while (i16 < length) {
                zzv zzvVarZzM = zzvVarArrZzI[i16];
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVarZzM.zzE == null) {
                    zzt zztVarZza = zzvVarZzM.zza();
                    zztVarZza.zzC(zziVar);
                    zzvVarZzM = zztVarZza.zzM();
                }
                if (zzunVar.zzf(zzvVar, zzvVarZzM).zzd != 0) {
                    int i17 = zzvVarZzM.zzv;
                    b10 = -1;
                    if (i17 != -1) {
                        zzvVarArr = zzvVarArrZzI;
                        if (zzvVarZzM.zzw != -1) {
                            z11 = false;
                        }
                        z12 |= z11;
                        iMax2 = Math.max(iMax2, i17);
                        iMax = Math.max(iMax, zzvVarZzM.zzw);
                        iZzbh = Math.max(iZzbh, zzbh(zzunVar, zzvVarZzM));
                    } else {
                        zzvVarArr = zzvVarArrZzI;
                    }
                    z11 = true;
                    z12 |= z11;
                    iMax2 = Math.max(iMax2, i17);
                    iMax = Math.max(iMax, zzvVarZzM.zzw);
                    iZzbh = Math.max(iZzbh, zzbh(zzunVar, zzvVarZzM));
                } else {
                    zzvVarArr = zzvVarArrZzI;
                    b10 = -1;
                }
                i16++;
                zzvVarArrZzI = zzvVarArr;
            }
            if (z12) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(iMax2);
                sb2.append("x");
                sb2.append(iMax);
                zzee.zzc("MediaCodecVideoRenderer", sb2.toString());
                boolean z13 = i14 > i15;
                int i18 = z13 ? i14 : i15;
                int i19 = true != z13 ? i14 : i15;
                int[] iArr = zzb;
                int i20 = 0;
                while (i20 < 9) {
                    float f11 = i19;
                    float f12 = i18;
                    int i21 = iArr[i20];
                    int i22 = i20;
                    float f13 = i21;
                    if (i21 <= i18 || (i11 = (int) (f13 * (f11 / f12))) <= i19) {
                        break;
                    }
                    int i23 = i19;
                    if (true != z13) {
                        i12 = i18;
                        i13 = i21;
                    } else {
                        i12 = i18;
                        i13 = i11;
                    }
                    if (true != z13) {
                        i21 = i11;
                    }
                    pointZzi = zzunVar.zzi(i13, i21);
                    float f14 = zzvVar.zzz;
                    if (pointZzi != null) {
                        z10 = z13;
                        if (zzunVar.zzg(pointZzi.x, pointZzi.y, f14)) {
                            break;
                        }
                    } else {
                        z10 = z13;
                    }
                    i20 = i22 + 1;
                    i19 = i23;
                    i18 = i12;
                    z13 = z10;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzt(iMax2);
                    zztVarZza2.zzu(iMax);
                    iZzbh = Math.max(iZzbh, zzat(zzunVar, zztVarZza2.zzM()));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb3.append("Codec max resolution adjusted to: ");
                    sb3.append(iMax2);
                    sb3.append("x");
                    sb3.append(iMax);
                    zzee.zzc("MediaCodecVideoRenderer", sb3.toString());
                }
            }
            zzacbVar = new zzacb(iMax2, iMax, iZzbh);
        }
        String str = zzunVar.zzc;
        this.zzm = zzacbVar;
        boolean z14 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i14);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        float f15 = zzvVar.zzz;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzeh.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzeh.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzeh.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzeh.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacbVar.zza);
        mediaFormat.setInteger("max-height", zzacbVar.zzb);
        zzeh.zzb(mediaFormat, "max-input-size", zzacbVar.zzc);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z14) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i10) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbt = zzbt(zzunVar);
        if (this.zzp != null && !zzfj.zzR(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuh.zzb(zzunVar, mediaFormat, zzvVar, surfaceZzbt, null);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i10;
        int i11;
        zzio zzioVarZzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i12 = zzioVarZzf.zze;
        zzacb zzacbVar = this.zzm;
        zzacbVar.getClass();
        if (zzvVar2.zzv > zzacbVar.zza || zzvVar2.zzw > zzacbVar.zzb) {
            i12 |= 256;
        }
        if (zzbh(zzunVar, zzvVar2) > zzacbVar.zzc) {
            i12 |= 64;
        }
        String str = zzunVar.zza;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = zzioVarZzf.zzd;
        }
        return new zzio(str, zzvVar, zzvVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        zzun zzunVarZzaH;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f11 = zzvVar2.zzz;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzD == null || (zzunVarZzaH = zzaH()) == null) {
            return f12;
        }
        float fZzh = zzunVarZzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f12 != -1.0f ? Math.max(f12, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaj(String str, zzuh zzuhVar, long j10, long j11) {
        this.zzg.zzb(str, j10, j11);
        this.zzn = zzbl(str);
        zzun zzunVarZzaH = zzaH();
        zzunVarZzaH.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzunVarZzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzunVarZzaH.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.zzo = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzak(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzal(Exception exc) {
        zzee.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @Nullable
    protected final zzio zzam(zzlh zzlhVar) throws zziw {
        zzio zzioVarZzam = super.zzam(zzlhVar);
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzioVarZzam);
        return zzioVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        zzuk zzukVarZzaE = zzaE();
        if (zzukVarZzaE != null) {
            zzukVarZzaE.zzq(this.zzx);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzvVar.zzB;
        int i10 = zzvVar.zzA;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzI = new zzbv(integer, integer2, f10);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(integer);
            zztVarZza.zzu(integer2);
            zztVarZza.zzz(f10);
            zzv zzvVarZzM = zztVarZza.zzM();
            int i12 = this.zzr;
            List listZzi = this.zzs;
            if (listZzi == null) {
                listZzi = zzguf.zzi();
            }
            zzadrVar.zzs(1, zzvVarZzM, zzbc(), i12, listZzi);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzao(long j10, long j11, long j12, boolean z10, boolean z11) throws zziw {
        int iZzP;
        if (this.zzp != null && this.zzf) {
            j11 -= -this.zzN;
        }
        if (j10 >= -500000 || z10 || (iZzP = zzP(j11)) == 0) {
            return false;
        }
        if (z11) {
            zzin zzinVar = ((zzuu) this).zza;
            int i10 = zzinVar.zzd + iZzP;
            zzinVar.zzd = i10;
            zzinVar.zzf += this.zzC;
            zzinVar.zzd = i10 + this.zzl.size();
        } else {
            ((zzuu) this).zza.zzj++;
            zzaw(iZzP + this.zzl.size(), this.zzC);
        }
        zzaJ();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzap() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
            long jZzbc = this.zzN;
            if (jZzbc == -9223372036854775807L) {
                jZzbc = zzbc();
                this.zzN = jZzbc;
            }
            this.zzp.zzo(-jZzbc);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaq(long j10, long j11, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zziw {
        zzacc zzaccVar;
        long j13;
        zzukVar.getClass();
        long jZzbb = j12 - zzbb();
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        zzaw(i13, 0);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            if (!z10 || z11) {
                return zzadrVar.zzu(j12, new zzaby(this, zzukVar, i10, jZzbb));
            }
            zzau(zzukVar, i10, jZzbb);
            return true;
        }
        zzacs zzacsVar = this.zzi;
        long jZzbc = zzbc();
        zzacq zzacqVar = this.zzj;
        int iZzk = zzacsVar.zzk(j12, j10, j11, jZzbc, z10, z11, zzacqVar);
        if (iZzk == 0) {
            long jZzc = zzL().zzc();
            zzbr(jZzbb, jZzc, zzvVar);
            zzay(zzukVar, i10, jZzbb, jZzc);
            zzax(zzacqVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzav(zzukVar, i10, jZzbb);
                zzax(zzacqVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzau(zzukVar, i10, jZzbb);
            zzax(zzacqVar.zza());
            return true;
        }
        long jZzb = zzacqVar.zzb();
        long jZza = zzacqVar.zza();
        if (jZzb == this.zzH) {
            zzau(zzukVar, i10, jZzbb);
            j13 = jZzb;
            zzaccVar = this;
        } else {
            zzbr(jZzbb, jZzb, zzvVar);
            zzay(zzukVar, i10, jZzbb, jZzb);
            zzaccVar = this;
            j13 = jZzb;
        }
        zzaccVar.zzax(jZza);
        zzaccVar.zzH = j13;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzar() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @TargetApi(29)
    protected final void zzas(zzih zzihVar) throws zziw {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzuk zzukVarZzaE = zzaE();
                        zzukVarZzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzukVarZzaE.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzau(zzuk zzukVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzukVar.zzc(i10, false);
        Trace.endSection();
        ((zzuu) this).zza.zzf++;
    }

    protected final void zzav(zzuk zzukVar, int i10, long j10) {
        Trace.beginSection("dropVideoBuffer");
        zzukVar.zzc(i10, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    protected final void zzaw(int i10, int i11) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzh += i10;
        int i12 = i10 + i11;
        zzinVar.zzg += i12;
        this.zzA += i12;
        int i13 = this.zzB + i12;
        this.zzB = i13;
        zzinVar.zzi = Math.max(i13, zzinVar.zzi);
    }

    protected final void zzax(long j10) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzk += j10;
        zzinVar.zzl++;
        this.zzF += j10;
        this.zzG++;
    }

    protected final void zzay(zzuk zzukVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzukVar.zzd(i10, j11);
        Trace.endSection();
        ((zzuu) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbj();
        }
    }

    protected final boolean zzbg(zzun zzunVar) {
        if (zzbl(zzunVar.zza)) {
            return false;
        }
        return !zzunVar.zzf || zzace.zza(this.zze);
    }

    final /* synthetic */ Surface zzbk() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i10, @Nullable Object obj) throws zziw {
        if (i10 == 1) {
            zzbo(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            zzacp zzacpVar = (zzacp) obj;
            this.zzM = zzacpVar;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzl(zzacpVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zzuk zzukVarZzaE = zzaE();
            if (zzukVarZzaE != null) {
                zzukVarZzaE.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzadr zzadrVar3 = this.zzp;
                if (zzadrVar3 == null || !zzadrVar3.zze()) {
                    return;
                }
                zzadrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzadr zzadrVar4 = this.zzp;
            if (zzadrVar4 != null) {
                zzadrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            zzes zzesVar = (zzes) obj;
            if (zzesVar.zza() == 0 || zzesVar.zzb() == 0) {
                return;
            }
            this.zzv = zzesVar;
            zzadr zzadrVar5 = this.zzp;
            if (zzadrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzadrVar5.zzp(surface, zzesVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzuk zzukVarZzaE2 = zzaE();
                if (zzukVarZzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzukVarZzaE2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbo(null);
                obj.getClass();
                ((zzacc) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z10 = this.zzD != null;
                zzms zzmsVar = (zzms) obj;
                this.zzD = zzmsVar;
                if (z10 != (zzmsVar != null)) {
                    zzaZ();
                }
                break;
            default:
                super.zzx(i10, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzy(boolean z10, boolean z11) throws zziw {
        super.zzy(z10, z11);
        zzJ();
        this.zzg.zza(((zzuu) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzacg zzacgVar = new zzacg(this.zze, this.zzi);
                zzacgVar.zza(true);
                long j10 = this.zzk;
                zzacgVar.zzc(j10 != -9223372036854775807L ? -j10 : -9223372036854775807L);
                zzacgVar.zzb(zzL());
                zzaco zzacoVarZzd = zzacgVar.zzd();
                zzacoVarZzd.zza(1);
                this.zzp = zzacoVarZzd.zzb(0);
            }
            this.zzq = true;
        }
        int i10 = !z11 ? 1 : 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            zzacs zzacsVar = this.zzi;
            zzacsVar.zzg(zzL());
            zzacsVar.zza(i10);
            return;
        }
        zzadrVar.zzc(new zzabx(this), zzhaf.zza());
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            this.zzp.zzl(zzacpVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzes.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaX());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i10;
        zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzz(zzv[] zzvVarArr, long j10, long j11, zzwk zzwkVar) throws zziw {
        super.zzz(zzvVarArr, j10, j11, zzwkVar);
        zzbf zzbfVarZzM = zzM();
        if (zzbfVarZzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzbfVarZzM.zzo(zzwkVar.zza, new zzbd()).zzd;
        }
    }
}
