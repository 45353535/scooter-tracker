package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4329g8;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
final class zzcko extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcjl {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzckr zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbkf zzE;
    private zzbkc zzF;
    private zzber zzG;
    private int zzH;
    private int zzI;
    private zzbhq zzJ;
    private final zzbhq zzK;
    private zzbhq zzL;
    private final zzbhr zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbgd zzY;
    private boolean zzZ;
    private final zzcln zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final zzbil zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfir zzk;
    private zzfiu zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjw zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzekb zzq;
    private zzejz zzr;
    private zzclv zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    protected zzcko(zzcln zzclnVar, zzclv zzclvVar, String str, boolean z10, boolean z11, zzazh zzazhVar, zzbil zzbilVar, VersionInfoParcel versionInfoParcel, zzbht zzbhtVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzfjo zzfjoVar) {
        zzfiu zzfiuVar2;
        super(zzclnVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzclnVar;
        this.zzs = zzclvVar;
        this.zzt = str;
        this.zzw = z10;
        this.zzc = zzazhVar;
        this.zzd = zzfjoVar;
        this.zze = zzbilVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = displayMetricsZzx;
        this.zzj = displayMetricsZzx.density;
        this.zzY = zzbgdVar;
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzclnVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzna)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmZ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoG)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzclnVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzckw(this, new zzckv() { // from class: com.google.android.gms.internal.ads.zzcku
            @Override // com.google.android.gms.internal.ads.zzckv
            public final /* synthetic */ void zza(Uri uri) {
                zzcjw zzcjwVarZzaS = ((zzcko) this).zzaS();
                if (zzcjwVarZzaS != null) {
                    zzcjwVarZzaS.zzQ(uri);
                } else {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbhr zzbhrVar = new zzbhr(new zzbht(true, "make_wv", this.zzt));
        this.zzM = zzbhrVar;
        zzbhrVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && (zzfiuVar2 = this.zzl) != null && zzfiuVar2.zzb != null) {
            zzbhrVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbhrVar.zzc();
        zzbhq zzbhqVarZzf = zzbht.zzf();
        this.zzK = zzbhqVarZzf;
        zzbhrVar.zza("native:view_create", zzbhqVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzclnVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = AndroidWebViewClient.BLANK_PAGE;
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzckl
                private final /* synthetic */ String zzb = AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdWebViewImpl.loadUrlUnsafe");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbhl.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfir zzfirVar = this.zzk;
        if (zzfirVar != null && zzfirVar.zzam) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzchr) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void zzbh() {
        zzbhr zzbhrVar = this.zzM;
        if (zzbhrVar == null) {
            return;
        }
        zzbht zzbhtVarZzc = zzbhrVar.zzc();
        zzbhj zzbhjVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zzbhjVarZza != null) {
            zzbhjVarZza.zzb(zzbhtVarZzc);
        }
    }

    private final void zzbi(boolean z10) {
        HashMap map = new HashMap();
        map.put(C4329g8.f43166k, true != z10 ? "0" : "1");
        zze("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.zzc();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmk)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb != null && activityZzb.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzaZ(AndroidWebViewClient.BLANK_PAGE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzml)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcei.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                    return;
                } else {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdWebViewImpl.loadUrl");
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.zzd();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z10 = this.zzC;
            zzcjw zzcjwVar = this.zzo;
            if (zzcjwVar != null && zzcjwVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z10 = true;
            }
            zzbi(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcjw zzcjwVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.zze();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcjwVar = this.zzo) != null && zzcjwVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmz)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb2.append("Couldn't find an Activity to view url/mimetype: ");
            sb2.append(str);
            sb2.append(" / ");
            sb2.append(str4);
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaM) {
            return;
        }
        zzmVarZzL.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcko.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e10);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e10);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzer)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z10) {
            zzazh zzazhVar = this.zzc;
            if (zzazhVar != null) {
                zzazhVar.zzc(motionEvent);
            }
            zzbil zzbilVar = this.zze;
            if (zzbilVar != null) {
                zzbilVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbkf zzbkfVar = this.zzE;
                    if (zzbkfVar != null) {
                        zzbkfVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjw) {
            this.zzo = (zzcjw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzA(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcjc
    public final zzfir zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclg
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzH(int i10) {
        if (i10 == 0) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbhr zzbhrVar2 = this.zzM;
        zzbhrVar2.zzc();
        zzbhrVar2.zzc().zzd("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzI() {
        if (this.zzJ == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aes2");
            zzbhrVar.zzc();
            zzbhq zzbhqVarZzf = zzbht.zzf();
            this.zzJ = zzbhqVarZzf;
            zzbhrVar.zza("native:view_show", zzbhqVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcld
    public final synchronized zzclv zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final /* synthetic */ zzclj zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcle
    public final zzazh zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzfjo zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzekb zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzejz zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzckj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaA(final boolean z10, final int i10) {
        destroy();
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzckm
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                int i11 = zzcko.zza;
                zzbgj.zzbl.zza zzaVarZzq = zzbgj.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z11 = z10;
                if (zZzb != z11) {
                    zzaVarZzq.zzc(z11);
                }
                zzaVarZzq.zzg(i10);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbgd zzbgdVar = this.zzY;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcks
    public final zzfiu zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaE(boolean z10) {
        if (z10) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final ListenableFuture zzaF() {
        zzbil zzbilVar = this.zze;
        return zzbilVar == null ? zzgzo.zza(null) : zzbilVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaG(boolean z10) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        this.zzo.zzv(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaI(boolean z10, int i10, boolean z11) {
        this.zzo.zzx(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaJ(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzo.zzy(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaK(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzo.zzz(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaL(String str, String str2, int i10) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaM() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcjw r0 = r10.zzo
            boolean r0 = r0.zzk()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcjw r0 = r10.zzo
            boolean r0 = r0.zzl()
            if (r0 == 0) goto L86
        L11:
            com.google.android.gms.ads.internal.client.zzbb.zza()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.internal.ads.zzcln r2 = r10.zzb
            android.app.Activity r2 = r2.zzb()
            r3 = 1
            if (r2 == 0) goto L50
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L35
            goto L50
        L35:
            com.google.android.gms.ads.internal.zzt.zzc()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzX(r2)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r6)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            r7 = r2
            goto L52
        L50:
            r6 = r4
            r7 = r5
        L52:
            com.google.android.gms.ads.internal.zzt.zzc()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L87
            int r2 = r10.zzR
            if (r2 != r5) goto L87
            int r2 = r10.zzT
            if (r2 != r6) goto L87
            int r2 = r10.zzU
            if (r2 != r7) goto L87
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzaB
            com.google.android.gms.internal.ads.zzbhc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L86
            int r2 = r10.zzV
            if (r2 == r9) goto L86
            goto L87
        L86:
            return r1
        L87:
            int r2 = r10.zzS
            if (r2 != r4) goto La5
            int r2 = r10.zzR
            if (r2 != r5) goto La5
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzaB
            com.google.android.gms.internal.ads.zzbhc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La6
            int r2 = r10.zzV
            if (r2 == r9) goto La6
        La5:
            r1 = r3
        La6:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbwx r3 = new com.google.android.gms.internal.ads.zzbwx
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzl(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcko.zzaM():boolean");
    }

    protected final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    @VisibleForTesting
    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    @VisibleForTesting
    final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcjw zzaS() {
        return this.zzo;
    }

    final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaW(String str) {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i10) {
        this.zzI = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzab(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzB(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzac(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzC(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzad(String str, Predicate predicate) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaf(zzclv zzclvVar) {
        this.zzs = zzclvVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzag(boolean z10) {
        try {
            boolean z11 = this.zzw;
            this.zzw = z10;
            zzbc();
            if (z10 != z11) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaz)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbwx(this, "").zzk(true != z10 ? "default" : "expanded");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzai(Context context) {
        zzcln zzclnVar = this.zzb;
        zzclnVar.setBaseContext(context);
        this.zzQ.zza(zzclnVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaj(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z10);
        } else {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzak(zzekb zzekbVar) {
        this.zzq = zzekbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzal(zzejz zzejzVar) {
        this.zzr = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzam(int i10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzao(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzap() {
        if (this.zzL == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhrVar.zzc();
            zzbhq zzbhqVarZzf = zzbht.zzf();
            this.zzL = zzbhqVarZzf;
            zzbhrVar.zza("native:view_load", zzbhqVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaq(zzbkf zzbkfVar) {
        this.zzE = zzbkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzbkf zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzas(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i10 = this.zzH + (true != z10 ? -1 : 1);
        this.zzH = i10;
        if (i10 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzau(String str, String str2, String str3) throws Throwable {
        Throwable th2;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzay);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e10) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e10);
                        str4 = null;
                    }
                    super.loadDataWithBaseURL(str, zzclc.zza(str2, str4), "text/html", "UTF-8", null);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        throw th2;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaw(boolean z10) {
        this.zzo.zzO(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzax(zzbkc zzbkcVar) {
        this.zzF = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzay(zzber zzberVar) {
        this.zzG = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzber zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzc(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        zzaP(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        String string2 = sb2.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string2));
        zzaP(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzbddVar.zzj;
            this.zzC = z10;
        }
        zzbi(z10);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcft zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzdn(boolean z10) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized zzckr zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzbhq zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzn() {
        zzfiu zzfiuVar = this.zzl;
        if (zzfiuVar == null) {
            return null;
        }
        return zzfiuVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzo(int i10) {
        this.zzN = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final zzbhr zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized zzchr zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzchr) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclf, com.google.android.gms.internal.ads.zzcge
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzt(String str, zzchr zzchrVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzchrVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzu(boolean z10, long j10) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? "0" : "1");
        map.put("duration", Long.toString(j10));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzv(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzw(zzckr zzckrVar) {
        if (this.zzB == null) {
            this.zzB = zzckrVar;
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzz() {
        zzbkc zzbkcVar = this.zzF;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
        }
    }
}
