package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgrt;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class zzm extends zzbxr implements zzah {

    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzo = 0;
    protected final Activity zzb;

    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;

    @VisibleForTesting
    zzcjl zzd;

    @VisibleForTesting
    zzj zze;

    @VisibleForTesting
    zzu zzf;

    @VisibleForTesting
    FrameLayout zzh;

    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;

    @VisibleForTesting
    zzi zzl;
    private Runnable zzr;
    private boolean zzs;
    private boolean zzt;
    private Toolbar zzx;

    @VisibleForTesting
    boolean zzg = false;

    @VisibleForTesting
    boolean zzj = false;

    @VisibleForTesting
    boolean zzk = false;

    @VisibleForTesting
    boolean zzm = false;

    @VisibleForTesting
    int zzn = 1;
    private final Object zzp = new Object();
    private final View.OnClickListener zzq = new zzd(this);
    private boolean zzu = false;
    private boolean zzv = false;
    private boolean zzw = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzJ(android.content.res.Configuration r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzJ(android.content.res.Configuration):void");
    }

    private final void zzK(View view) {
        zzekb zzekbVarZzU;
        zzejz zzejzVarZzV;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzejzVarZzV = zzcjlVar.zzV()) != null) {
            zzejzVarZzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && (zzekbVarZzU = zzcjlVar.zzU()) != null && zzekbVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzekbVarZzU.zza(), view);
        }
    }

    private static final void zzL(@Nullable zzekb zzekbVar, @Nullable View view) {
        if (zzekbVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && zzekbVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzekbVar.zza(), view);
    }

    protected final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzu) {
            return;
        }
        this.zzu = true;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzH(this.zzn - 1);
            synchronized (this.zzp) {
                try {
                    if (!this.zzs && this.zzd.zzaa()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfX)).booleanValue() && !this.zzv && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdS();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzB();
                            }
                        };
                        this.zzr = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbd.zzc().zzd(zzbhe.zzbE)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzB();
    }

    @VisibleForTesting
    final void zzB() {
        zzcjl zzcjlVar;
        zzr zzrVar;
        if (this.zzv) {
            return;
        }
        this.zzv = true;
        zzcjl zzcjlVar2 = this.zzd;
        if (zzcjlVar2 != null) {
            this.zzl.removeView(zzcjlVar2.zzE());
            zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzof)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzj zzjVar2 = this.zze;
                viewGroup.addView(viewZzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdT(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcjlVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcjlVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzp) {
            try {
                this.zzs = true;
                Runnable runnable = this.zzr;
                if (runnable != null) {
                    zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzfynVar.removeCallbacks(runnable);
                    zzfynVar.post(this.zzr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzG(zzejh zzejhVar) throws RemoteException, zzh {
        zzbxl zzbxlVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbxlVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbxlVar.zzh(ObjectWrapper.wrap(zzejhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.zzb;
            zzejg zzejgVarZze = zzejh.zze();
            zzejgVarZze.zza(activity);
            zzejgVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzejgVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzt = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public void zzh(Bundle bundle) {
        zzr zzrVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzw = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z10 = zzlVar.zza;
                this.zzk = z10;
                if (z10) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzw) {
                    zzdbs zzdbsVar = this.zzc.zzt;
                    if (zzdbsVar != null) {
                        zzdbsVar.zza();
                    }
                    zzr zzrVar2 = this.zzc.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdjm zzdjmVar = this.zzc.zzu;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i10 = adOverlayInfoParcel5.zzk;
            if (i10 == 1) {
                zzy(false);
                return;
            }
            if (i10 == 2) {
                this.zze = new zzj(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i10 == 3) {
                zzy(true);
            } else {
                if (i10 != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzh e10) {
            String message = e10.getMessage();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            zzcjl zzcjlVar = this.zzd;
            if (zzcjlVar == null || zzcjlVar.zzX()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            return;
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null && !zzcjlVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i10, int i11, Intent intent) {
        zzdxz zzdxzVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            zzbgv zzbgvVar = zzbhe.zzoD;
            if (((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i11);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                zzcjl zzcjlVar = this.zzd;
                if (zzcjlVar == null || zzcjlVar.zzP() == null || (zzdxzVarZzI = zzcjlVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    return;
                }
                zzdxy zzdxyVarZza = zzdxzVarZzI.zza();
                zzdxyVarZza.zzc("action", "hilca");
                zzdxyVarZza.zzc("gqi", zzgrt.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length());
                sb3.append(i11);
                zzdxyVarZza.zzc("hilr", sb3.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdxyVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdxyVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdxyVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            try {
                this.zzl.removeView(zzcjlVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z10) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzgc)).intValue();
        boolean z11 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbH)).booleanValue() || z10;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z11 ? 0 : iIntValue;
        zztVar.zzb = true != z11 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzt(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() {
        this.zzt = true;
    }

    public final void zzt(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbF)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z14 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbG)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            new zzbwx(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.zza(z12);
        }
    }

    public final void zzu(boolean z10) {
        if (z10) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i10) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgU)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgV)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgW)).intValue()) {
                    if (i11 <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzt = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzy(boolean r45) throws com.google.android.gms.ads.internal.overlay.zzh {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzy(boolean):void");
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzx;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}
