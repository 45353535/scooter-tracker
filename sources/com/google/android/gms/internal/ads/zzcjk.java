package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcjk extends WebChromeClient {
    private final zzcjl zza;

    public zzcjk(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcjl)) {
            return webView.getContext();
        }
        zzcjl zzcjlVar = (zzcjl) webView;
        Activity activityZzj = zzcjlVar.zzj();
        return activityZzj != null ? activityZzj : zzcjlVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcjl)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = ((zzcjl) webView).zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzb();
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb2 = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
        sb2.append("JS: ");
        sb2.append(strMessage);
        sb2.append(" (");
        sb2.append(strSourceId);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(iLineNumber);
        sb2.append(")");
        String string = sb2.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcjj.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
        } else if (i10 == 2) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        } else {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar.zzQ() != null) {
            webView2.setWebViewClient(zzcjlVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j13), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } else {
            if (j11 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r6, android.webkit.GeolocationPermissions.Callback r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L59
            com.google.android.gms.internal.ads.zzcjl r0 = r5.zza
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = com.google.android.gms.ads.internal.util.zzs.zzF(r1, r2)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L24
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzF(r0, r1)
            if (r0 == 0) goto L26
        L24:
            r0 = r3
            goto L27
        L26:
            r0 = r2
        L27:
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzoH
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d
            r7.invoke(r6, r2, r3)
            goto L40
        L3d:
            r7.invoke(r6, r0, r3)
        L40:
            com.google.android.gms.internal.ads.zzbgv r6 = com.google.android.gms.internal.ads.zzbhe.zzoI
            com.google.android.gms.internal.ads.zzbhc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L59
            int r6 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r6 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjk.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zza.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzc();
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zza.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzx(view, customViewCallback);
            zzmVarZzL.zzw(i10);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        zzcjl zzcjlVar;
        com.google.android.gms.ads.internal.zzb zzbVarZzh;
        try {
            zzcjlVar = this.zza;
        } catch (WindowManager.BadTokenException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to display Dialog.", e10);
        }
        if (zzcjlVar != null && zzcjlVar.zzP() != null && zzcjlVar.zzP().zzh() != null && (zzbVarZzh = zzcjlVar.zzP().zzh()) != null && !zzbVarZzh.zzb()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
            sb2.append("window.");
            sb2.append(str);
            sb2.append("('");
            sb2.append(str3);
            sb2.append("')");
            zzbVarZzh.zzc(sb2.toString());
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(context);
        builderZzP.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderZzP.setView(linearLayout).setPositiveButton(R.string.ok, new zzcji(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcjh(jsPromptResult)).setOnCancelListener(new zzcjg(jsPromptResult)).create().show();
        } else {
            builderZzP.setMessage(str3).setPositiveButton(R.string.ok, new zzcjf(jsResult)).setNegativeButton(R.string.cancel, new zzcje(jsResult)).setOnCancelListener(new zzcjd(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
