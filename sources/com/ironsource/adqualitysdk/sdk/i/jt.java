package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.bb;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class jt {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2914 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2915 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2916 = -8951586584454626386L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2917;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WeakReference<WebView> f2918;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<bb.e> f2919;

    public jt(WebView webView) {
        this.f2918 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m7017(bb.e eVar) {
        new WeakReference(eVar);
        int i10 = f2915 + 79;
        f2914 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final bb.e m7019() {
        int i10 = (f2914 + 123) % 128;
        f2915 = i10;
        WeakReference<bb.e> weakReference = this.f2919;
        if (weakReference != null) {
            return weakReference.get();
        }
        f2914 = (i10 + 9) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final WebView m7020() {
        f2914 = (f2915 + 123) % 128;
        WebView webView = this.f2918.get();
        int i10 = f2915 + 29;
        f2914 = i10 % 128;
        if (i10 % 2 != 0) {
            return webView;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7023(WebViewClient webViewClient) {
        int i10 = f2915 + 3;
        f2914 = i10 % 128;
        if (i10 % 2 == 0) {
            m7020();
            throw null;
        }
        WebView webViewM7020 = m7020();
        if (webViewM7020 != null) {
            try {
                hk hkVar = new hk(ki.m7195(webViewM7020), webViewClient);
                m7016(hkVar);
                webViewM7020.setWebViewClient(hkVar);
                this.f2917 = true;
                int i11 = f2914 + 51;
                f2915 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            } catch (Exception e10) {
                kd.m7160(m7018("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - View.MeasureSpec.getSize(0)).intern(), m7018("ϫ쇟蟚䗈ௐ즁进䷞Ꮒ퇁韙嗡ᯭ\ud9a9鿓左⏼\ue1cb\ua7f1旲⯥\ue9d2꾀涂㎃\uf18b랔", 49666 - TextUtils.lastIndexOf("", '0', 0)).intern(), e10, false);
            }
        }
        this.f2917 = false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7016(bb.e eVar) {
        this.f2919 = new WeakReference<>(eVar);
        f2914 = (f2915 + 123) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7021(WebChromeClient webChromeClient) {
        WebView webViewM7020;
        int i10 = f2914 + 83;
        f2915 = i10 % 128;
        if (i10 % 2 != 0) {
            webViewM7020 = m7020();
            int i11 = 38 / 0;
            if (webViewM7020 == null) {
                return;
            }
        } else {
            webViewM7020 = m7020();
            if (webViewM7020 == null) {
                return;
            }
        }
        f2915 = (f2914 + 71) % 128;
        try {
            WebChromeClient webChromeClientM7186 = ki.m7186(webViewM7020);
            if (webChromeClientM7186 != null) {
                f2914 = (f2915 + 109) % 128;
                if (androidx.activity.s.a(webChromeClientM7186)) {
                    return;
                }
                hi hiVar = new hi(webChromeClientM7186, webChromeClient);
                m7017((bb.e) hiVar);
                webViewM7020.setWebChromeClient(hiVar);
            }
        } catch (Exception e10) {
            kd.m7160(m7018("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - Color.blue(0)).intern(), m7018("ϫ頙㑖킎泈ॗꕗ䆨\uddf2稷ᙵ늷仵\uea8f蜿⍀뾜寸\uf01c豃⢥쓪愥ﵞ馺㗺퇉渇\u0a56", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39877).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7018(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2916);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7022() {
        int i10 = f2915 + 71;
        int i11 = i10 % 128;
        f2914 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f2917;
        int i12 = i11 + 45;
        f2915 = i12 % 128;
        if (i12 % 2 == 0) {
            return z10;
        }
        throw null;
    }
}
