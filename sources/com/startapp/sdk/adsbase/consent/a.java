package com.startapp.sdk.adsbase.consent;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.pubmatic.sdk.webrendering.mraid.s;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b7;
import com.startapp.sdk.internal.cc;
import com.startapp.sdk.internal.dc;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.sk;
import com.startapp.sdk.internal.vi;
import com.vungle.ads.internal.Constants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConsentActivity f64031a;

    public a(ConsentActivity consentActivity) {
        this.f64031a = consentActivity;
    }

    public final boolean a(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        ConsentConfig consentConfigR = MetaData.E().r();
        if (scheme != null && scheme.equalsIgnoreCase("startappad") && !TextUtils.isEmpty(host) && consentConfigR != null) {
            if (host.equalsIgnoreCase("setconsent")) {
                String queryParameter = uri.getQueryParameter("status");
                String queryParameter2 = uri.getQueryParameter("apc");
                Boolean boolValueOf = null;
                try {
                } catch (NumberFormatException unused) {
                } catch (Throwable th2) {
                    g9.a(th2);
                }
                Integer numValueOf = !TextUtils.isEmpty(queryParameter) ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
                try {
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        boolValueOf = Boolean.valueOf(Boolean.parseBoolean(queryParameter2));
                    }
                } catch (Throwable th3) {
                    g9.a(th3);
                }
                ((h6) com.startapp.sdk.components.a.a(this.f64031a).f64183j.a()).a(numValueOf, Long.valueOf(consentConfigR.j()), boolValueOf, true, true);
                return true;
            }
            if (host.equalsIgnoreCase("close")) {
                this.f64031a.f64030c = true;
                this.f64031a.finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String string;
        String string2;
        PackageManager packageManager;
        Bundle extras = this.f64031a.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("javascript:var obj = {};");
        if (!TextUtils.isEmpty(str)) {
            sb2.append("obj.template = '");
            sb2.append(str);
            sb2.append("';");
        }
        if (extras.containsKey("allowCT")) {
            boolean z10 = extras.getBoolean("allowCT");
            sb2.append("obj.allowCT = ");
            sb2.append(z10);
            sb2.append(";");
        }
        ConsentActivity consentActivity = this.f64031a;
        WeakHashMap weakHashMap = vi.f65408a;
        String str2 = null;
        try {
            packageManager = consentActivity.getPackageManager();
        } catch (Throwable th2) {
            g9.a(th2);
        }
        Drawable drawableLoadIcon = packageManager == null ? null : packageManager.getApplicationInfo(consentActivity.getPackageName(), 128).loadIcon(packageManager);
        if (drawableLoadIcon != null) {
            try {
                float f10 = consentActivity.getResources().getDisplayMetrics().density;
                int i10 = (int) (48.0f * f10);
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                    Drawable drawableMutate = drawableLoadIcon.mutate();
                    drawableMutate.setBounds(0, 0, i10, i10);
                    drawableMutate.draw(new Canvas(bitmapCreateBitmap));
                    b7 b7Var = new b7(i10 * i10);
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, b7Var);
                    str2 = new String(Base64.encode(b7Var.a(), 0, b7Var.b(), 2));
                } catch (OutOfMemoryError unused) {
                    int i11 = (int) (f10 * 24.0f);
                    try {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_4444);
                        Drawable drawableMutate2 = drawableLoadIcon.mutate();
                        drawableMutate2.setBounds(0, 0, i11, i11);
                        drawableMutate2.draw(new Canvas(bitmapCreateBitmap2));
                        b7 b7Var2 = new b7(i11 * i11);
                        bitmapCreateBitmap2.compress(Bitmap.CompressFormat.PNG, 100, b7Var2);
                        str2 = new String(Base64.encode(b7Var2.a(), 0, b7Var2.b(), 2));
                    } catch (OutOfMemoryError unused2) {
                    }
                }
            } catch (Throwable th3) {
                g9.a(th3);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append("obj.imageBase64 = '");
            sb2.append(str2);
            sb2.append("';");
        }
        if (extras.containsKey("dParam")) {
            String string3 = extras.getString("dParam");
            if (!TextUtils.isEmpty(string3)) {
                sb2.append("obj.dParam = '");
                sb2.append(string3);
                sb2.append("';");
            }
        }
        if (extras.containsKey(Constants.CLICK_URL)) {
            String string4 = extras.getString(Constants.CLICK_URL);
            if (!TextUtils.isEmpty(string4)) {
                sb2.append("obj.clickUrl = '");
                sb2.append(string4);
                sb2.append("';");
            }
        }
        if (extras.containsKey("impressionUrl")) {
            String string5 = extras.getString("impressionUrl");
            if (!TextUtils.isEmpty(string5)) {
                sb2.append("obj.impressionUrl = '");
                sb2.append(string5);
                sb2.append("';");
            }
        }
        String str3 = ((cc) ((dc) com.startapp.sdk.components.a.a(this.f64031a).f64177d.a()).b()).f64367c;
        if (!TextUtils.isEmpty(str3)) {
            sb2.append("obj.locales = '");
            sb2.append(str3);
            sb2.append("';");
        }
        if (extras.containsKey("timestamp")) {
            long j10 = extras.getLong("timestamp");
            sb2.append("obj.timeStamp = ");
            sb2.append(j10);
            sb2.append(";");
        }
        if (extras.containsKey("templateName")) {
            int i12 = extras.getInt("templateName");
            sb2.append("obj.templateName = ");
            sb2.append(i12);
            sb2.append(";");
        }
        if (extras.containsKey("templateId")) {
            int i13 = extras.getInt("templateId");
            sb2.append("obj.templateId = ");
            sb2.append(i13);
            sb2.append(";");
        }
        sb2.append("obj.os = 'android';obj.consentTypeInfo = {};");
        if (extras.containsKey("impression")) {
            long j11 = extras.getInt("impression");
            sb2.append("obj.consentTypeInfo.impression = ");
            sb2.append(j11);
            sb2.append(";");
        }
        if (extras.containsKey("trueClick")) {
            long j12 = extras.getInt("trueClick");
            sb2.append("obj.consentTypeInfo.trueClick = ");
            sb2.append(j12);
            sb2.append(";");
        }
        if (extras.containsKey("falseClick")) {
            long j13 = extras.getInt("falseClick");
            sb2.append("obj.consentTypeInfo.falseClick = ");
            sb2.append(j13);
            sb2.append(";");
        }
        sb2.append("obj.infoForExternalLinks = {};");
        if (extras.containsKey("advertisingId")) {
            String string6 = extras.getString("advertisingId");
            sb2.append("obj.infoForExternalLinks.advertisingId = '");
            sb2.append(string6);
            sb2.append("';");
        }
        if (extras.containsKey("consentType")) {
            int i14 = extras.getInt("consentType");
            sb2.append("obj.infoForExternalLinks.consentType = ");
            sb2.append(i14);
            sb2.append(";");
        }
        if (extras.containsKey("erid") && (string2 = extras.getString("erid")) != null && !s.a(string2)) {
            sb2.append("obj.erid = '");
            sb2.append(string2);
            sb2.append("';");
        }
        if (extras.containsKey("eridUrl") && (string = extras.getString("eridUrl")) != null && !s.a(string)) {
            sb2.append("obj.eridUrl = '");
            sb2.append(string);
            sb2.append("';");
        }
        sb2.append("startappInit(obj);");
        webView.loadUrl(sb2.toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(Uri.parse(str));
    }
}
