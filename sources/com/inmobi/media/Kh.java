package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.inmobi.media.Kh;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class Kh extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37224a;

    public Kh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f37224a = gestureDetectorOnGestureListenerC3635ci;
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        String str = cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId();
        InterfaceC3878m9 interfaceC3878m9 = this.f37224a.f38368i;
        if (interfaceC3878m9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3635ci.f38347g1;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
        ((C3903n9) interfaceC3878m9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f37224a.f38392u.get() != null) {
            new AlertDialog.Builder((Context) this.f37224a.f38392u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: w3.n2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.a(callback, origin, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: w3.o2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.b(callback, origin, dialogInterface, i10);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC3878m9 interfaceC3878m9 = this.f37224a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "jsAlert called with: " + message + url);
        }
        if (!this.f37224a.a(result)) {
            return true;
        }
        Activity fullScreenActivity = this.f37224a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: w3.p2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.a(result, dialogInterface, i10);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC3878m9 interfaceC3878m9 = this.f37224a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "jsConfirm called with: " + message + url);
        }
        if (!this.f37224a.a(result)) {
            return true;
        }
        if (this.f37224a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f37224a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: w3.l2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.b(result, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: w3.m2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.c(result, dialogInterface, i10);
                }
            }).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC3878m9 interfaceC3878m9 = this.f37224a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "jsPrompt called with: " + message + url);
        }
        if (!this.f37224a.a(result)) {
            return true;
        }
        if (this.f37224a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37224a.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).c(str, "webview progress changed - " + i10);
        }
        super.onProgressChanged(webView, i10);
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, true, false);
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, false, false);
    }
}
