package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbee extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbdv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbee() {
        zzbdv zzbdvVar = new zzbdv();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbdvVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbiv.zzd.zze()).intValue();
        this.zzg = ((Long) zzbiv.zza.zze()).intValue();
        this.zzh = ((Long) zzbiv.zze.zze()).intValue();
        this.zzi = ((Long) zzbiv.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaC)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaD)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaE)).intValue();
        this.zze = ((Long) zzbiv.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaG);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaH)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaI)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaJ)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.extractContent");
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbee.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final void zzb(View view) {
        try {
            zzbdu zzbduVar = new zzbdu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaF), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbed zzbedVarZzc = zzc(view, zzbduVar);
            zzbduVar.zzi();
            if (zzbedVarZzc.zza == 0 && zzbedVarZzc.zzb == 0) {
                return;
            }
            int i10 = zzbedVarZzc.zzb;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.zzd.zzc(zzbduVar);
            } else if (zzbduVar.zzl() == 0) {
                return;
            }
            if (this.zzd.zza(zzbduVar)) {
                return;
            }
            this.zzd.zzc(zzbduVar);
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    final zzbed zzc(@Nullable View view, zzbdu zzbduVar) {
        if (view == null) {
            return new zzbed(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbed(this, 0, 0);
            }
            zzbduVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbed(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcjl)) {
            WebView webView = (WebView) view;
            zzbduVar.zze();
            webView.post(new zzbec(this, zzbduVar, webView, globalVisibleRect));
            return new zzbed(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbed(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            zzbed zzbedVarZzc = zzc(viewGroup.getChildAt(i12), zzbduVar);
            i10 += zzbedVarZzc.zza;
            i11 += zzbedVarZzc.zzb;
        }
        return new zzbed(this, i10, i11);
    }

    @VisibleForTesting
    final void zzd(zzbdu zzbduVar, WebView webView, String str, boolean z10) {
        zzbdu zzbduVar2;
        zzbduVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbduVar2 = zzbduVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbduVar2 = zzbduVar;
                    zzbduVar2.zzf(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb2.append(strOptString);
                    zzbduVar.zzf(sb2.toString(), z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbduVar2 = zzbduVar;
                }
            }
            if (zzbduVar2.zza()) {
                this.zzd.zzb(zzbduVar2);
            }
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th2) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = ");
            sb2.append(true);
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }
}
