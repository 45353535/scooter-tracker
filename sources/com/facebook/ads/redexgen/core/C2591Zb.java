package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2591Zb extends WebViewClient {
    public static byte[] A05;
    public ZX A00 = new ZX() { // from class: com.facebook.ads.redexgen.X.LP
        @Override // com.facebook.ads.redexgen.core.ZX
        public final boolean AAW(String str) {
            return C2591Zb.A04(str);
        }
    };
    public WeakReference<ZZ> A01 = new WeakReference<>(null);
    public final WeakReference<C2820dL> A02;
    public final WeakReference<ZY> A03;
    public final WeakReference<ZT> A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Ascii.FS, Ascii.US, Ascii.DC2, 8, 9, 71, Ascii.US, 17, Ascii.FS, 19, Ascii.SYN, 37, 42, Ascii.ESC, 37, 39, 48, 45, 50, 45, 48, 61, Ascii.FF, 3, 9, Ascii.US, 2, 4, 9, 67, 4, 3, Ascii.EM, 8, 3, Ascii.EM, 67, Ascii.FF, Ascii.SO, Ascii.EM, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, Ascii.DEL, 114, 56, Ascii.DEL, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, Ascii.ESC, 77, 87, Ascii.US, 13, 10, 55, Ascii.RS, 1, 13, Ascii.US};
    }

    public C2591Zb(WeakReference<C2820dL> weakReference, WeakReference<ZY> weakReference2, WeakReference<ZT> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C2820dL c2820dL) {
        c2820dL.A08().AAy(A00(11, 11, 104), AbstractC2433Sv.A09, new C2434Sw(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 68);
        C2820dL c2820dL = this.A02.get();
        if (c2820dL != null) {
            if ((LJ.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A00.AAW(str)) {
                return true;
            }
            try {
                Uri uri = WQ.A00(str);
                String scheme = uri.getScheme();
                try {
                    boolean zA14 = U7.A14(c2820dL);
                    String strA002 = A00(48, 33, 58);
                    String strA003 = A00(22, 26, 65);
                    String strA004 = A00(105, 6, 36);
                    if (zA14) {
                        if (!LJ.A0E.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                            if (strA004.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA003, uri);
                            }
                            intent.addCategory(strA002);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(268435456);
                            }
                            try {
                                if (!WB.A0D(c2820dL, intent)) {
                                    A02(str, c2820dL);
                                }
                                return true;
                            } catch (W9 unused) {
                                if (strA004.equals(scheme)) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!WB.A0D(c2820dL, new Intent(strA003, WQ.A00(stringExtra)))) {
                                            A02(str, c2820dL);
                                        }
                                        return true;
                                    }
                                }
                                C2434Sw c2434Sw = new C2434Sw(A00(111, 5, 91) + str);
                                c2434Sw.A05(1);
                                c2820dL.A08().AAz(A00(11, 11, 104), AbstractC2433Sv.A06, c2434Sw);
                                return true;
                            }
                        }
                        return false;
                    }
                    if (!LJ.A0A || !strA004.equalsIgnoreCase(scheme)) {
                        if ((LJ.A0A && AbstractC2527Wp.A04(str)) || !LJ.A0E.contains(scheme)) {
                            return WB.A0D(c2820dL, new Intent(strA003, uri));
                        }
                    } else {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.addCategory(strA002);
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        if (c2820dL.getPackageManager().resolveActivity(uri2, 65536) != null && WB.A0D(c2820dL, uri2)) {
                            webView.goBack();
                            return true;
                        }
                    }
                } catch (Exception e10) {
                    c2820dL.A08().AAz(strA00, AbstractC2433Sv.A2d, new C2434Sw(e10));
                    c2820dL.A0F().A9u(e10.toString());
                }
                return false;
            } catch (SecurityException e11) {
                c2820dL.A08().AAz(strA00, AbstractC2433Sv.A2d, new C2434Sw(e11));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(ZX zx) {
        this.A00 = zx;
    }

    public final void A06(WeakReference<ZZ> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ZT timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        ZY zy = this.A03.get();
        if (zy != null) {
            zy.AES(str);
        }
        ZZ zz = this.A01.get();
        if (zz != null) {
            zz.ACa(webView.canGoBack());
            zz.ADJ(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ZY listener = this.A03.get();
        if (listener != null) {
            listener.AEU(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C2820dL c2820dL = this.A02.get();
        if (c2820dL != null) {
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC2527Wp.A01(i10, sb2.append(strA00).append(str).toString(), strA00 + str2);
            c2820dL.A0F().A9r(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C2820dL c2820dL = this.A02.get();
        if (c2820dL != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC2527Wp.A01(errorCode, sb2.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c2820dL.A0F().A9r(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C2820dL context = this.A02.get();
        if (context != null) {
            context.A0F().A9s();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C2820dL context = this.A02.get();
        if (context != null) {
            context.A0F().A9t();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC2594Ze.A0D(AbstractC2433Sv.A2e);
        ZY listener = this.A03.get();
        if (listener != null) {
            listener.AEw();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
