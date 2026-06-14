package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcgw extends zzcfk implements TextureView.SurfaceTextureListener, zzcfu {
    private final zzcge zzc;
    private final zzcgf zzd;
    private final zzcgd zze;

    @Nullable
    private final zzdxz zzf;
    private zzcfj zzg;
    private Surface zzh;
    private zzcfv zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcgc zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcgw(Context context, zzcgf zzcgfVar, zzcge zzcgeVar, boolean z10, boolean z11, zzcgd zzcgdVar, @Nullable zzdxz zzdxzVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcgeVar;
        this.zzd = zzcgfVar;
        this.zzo = z10;
        this.zze = zzcgdVar;
        zzcgfVar.zza(this);
        this.zzf = zzdxzVar;
    }

    private final boolean zzT() {
        zzcfv zzcfvVar = this.zzi;
        return (zzcfvVar == null || !zzcfvVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z10, @Nullable Integer num) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null && !z10) {
            zzcfvVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z10) {
            if (!zzT()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcfvVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzchr zzchrVarZzr = this.zzc.zzr(this.zzj);
            if (zzchrVarZzr instanceof zzcia) {
                zzcfv zzcfvVarZza = ((zzcia) zzchrVarZzr).zza();
                this.zzi = zzcfvVarZza;
                zzcfvVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzchrVarZzr instanceof zzchx)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzchx zzchxVar = (zzchx) zzchrVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzchxVar.zzu();
                boolean zZzt = zzchxVar.zzt();
                String strZzs = zzchxVar.zzs();
                if (strZzs == null) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcfv zzcfvVarZzE = zzE(num);
                    this.zzi = zzcfvVarZzE;
                    zzcfvVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i14 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i14 >= strArr.length) {
                    break;
                }
                uriArr[i14] = Uri.parse(strArr[i14]);
                i14++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcfv zzcfvVar = this.zzi;
            if (zzcfvVar != null) {
                zzcfvVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z10) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzu(surface, z10);
        } catch (IOException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(canonicalName);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(message);
        return sb2.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzt != f10) {
            this.zzt = f10;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzt;
        if (f10 != 0.0f && this.zzn == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzdxz zzdxzVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoK)).booleanValue() && (zzdxzVar = this.zzf) != null) {
                zzdxy zzdxyVarZza = zzdxzVar.zza();
                zzdxyVarZza.zzc("action", "svp_aepv");
                zzdxyVarZza.zzd();
            }
            zzcgc zzcgcVar = new zzcgc(getContext());
            this.zzn = zzcgcVar;
            zzcgcVar.zzb(surfaceTexture, i10, i11);
            zzcgc zzcgcVar2 = this.zzn;
            zzcgcVar2.start();
            SurfaceTexture surfaceTextureZze = zzcgcVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i10, i11);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzA(int i10) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzy(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzB(int i10) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzz(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzC(int i10) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    final zzcfv zzE(@Nullable Integer num) {
        zzcgd zzcgdVar = this.zze;
        zzcge zzcgeVar = this.zzc;
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, zzcgeVar, num);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcitVar;
    }

    final String zzF() {
        zzcge zzcgeVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcgeVar.getContext(), zzcgeVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzv(fZzc, false);
        } catch (IOException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
    }

    final /* synthetic */ void zzH() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i10, int i11) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzj(i10, i11);
        }
    }

    final /* synthetic */ void zzO() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i10) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.onWindowVisibilityChanged(i10);
        }
    }

    final /* synthetic */ void zzQ(boolean z10, long j10) {
        this.zzc.zzu(z10, j10);
    }

    final /* synthetic */ void zzR(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzb(zzcfj zzcfjVar) {
        this.zzg = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzc(@Nullable String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcgf zzcgfVar = this.zzd;
        zzcgfVar.zzf();
        this.zzb.zze();
        zzcgfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzi(int i10) {
        if (zzU()) {
            this.zzi.zzx(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzj(float f10, float f11) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzm() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzn() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzo() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgh
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z10, final long j10) {
        if (this.zzc != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i10) {
        if (this.zzm != i10) {
            this.zzm = i10;
            if (i10 == 3) {
                zzY();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i10, int i11) {
        this.zzr = i10;
        this.zzs = i11;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    @Nullable
    public final Integer zzw() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z10 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z10 = true;
        }
        this.zzj = str;
        zzV(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzy(int i10) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzF(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzz(int i10) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzG(i10);
        }
    }
}
