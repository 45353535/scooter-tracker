package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ki {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2996 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f2997 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2998 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static e f2999;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3000;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static e f3001;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f3002;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f3003;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3004;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3005;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3006;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3007;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3008;

    static {
        m7198();
        f3005 = true;
        f3007 = true;
        f3004 = true;
        byte b10 = 0;
        f3008 = false;
        f3006 = false;
        f2999 = new e(b10);
        f3001 = new e(b10);
        int i10 = f2998 + 29;
        f2996 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7190(WebView webView, String str) {
        int i10 = f2996;
        f2998 = (i10 + 121) % 128;
        if (webView != null) {
            int i11 = i10 + 43;
            f2998 = i11 % 128;
            if (i11 % 2 == 0) {
                webView.getHandler();
                throw null;
            }
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7203("⋳雀浄낺뤉ﬠ⠉襘舫愍嶩딹浄낺ጤ\u0018㪒组\udcc6㡨矗뫀", ExpandableListView.getPackedPositionGroup(0L) + 22).intern());
            sb2.append(str);
            sb2.append(m7203("鿉㽞蠠韒", (ViewConfiguration.getEdgeSlop() >> 16) + 4).intern());
            webView.loadUrl(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static synchronized au m7191() {
        int i10 = f2998 + 111;
        f2996 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m4771().mo4782();
            throw null;
        }
        au auVarMo4782 = ar.m4771().mo4782();
        int i11 = f2998 + 73;
        f2996 = i11 % 128;
        if (i11 % 2 == 0) {
            return auVarMo4782;
        }
        int i12 = 76 / 0;
        return auVarMo4782;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m7198() {
        f3003 = (char) 6083;
        f3000 = (char) 30494;
        f2997 = (char) 62869;
        f3002 = (char) 43732;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m7201(WebView webView) {
        f2996 = (f2998 + 117) % 128;
        boolean z10 = m7195(webView) instanceof hk;
        f2998 = (f2996 + 37) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static hv<WebChromeClient> m7202(WebView webView) {
        f2998 = (f2996 + 63) % 128;
        m7189(webView.getContext());
        hv<WebChromeClient> hvVarM7193 = m7193(webView, m7188(), f3001);
        f2998 = (f2996 + 21) % 128;
        return hvVarM7193;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static hv<WebViewClient> m7192(WebView webView) {
        int i10 = f2998 + 123;
        f2996 = i10 % 128;
        if (i10 % 2 == 0) {
            m7189(webView.getContext());
            return m7193(webView, m7200(), f2999);
        }
        m7189(webView.getContext());
        int i11 = 47 / 0;
        return m7193(webView, m7200(), f2999);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebViewClient m7195(WebView webView) {
        int i10 = f2996 + 113;
        f2998 = i10 % 128;
        if (i10 % 2 != 0 ? Build.VERSION.SDK_INT >= 26 : Build.VERSION.SDK_INT >= 32) {
            if (m7191().m4936()) {
                f2996 = (f2998 + 3) % 128;
                if (m7194(webView.getContext())) {
                    WebViewClient webViewClient = webView.getWebViewClient();
                    f2996 = (f2998 + 123) % 128;
                    return webViewClient;
                }
            }
        }
        hv<WebViewClient> hvVarM7192 = m7192(webView);
        if (hvVarM7192 != null) {
            return hvVarM7192.mo6642();
        }
        throw new RuntimeException(m7203("官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕键錭멥뤛猣ꅌł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭", Color.red(0) + 33).intern());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hv<T> m7199(Object obj, ia iaVar, final List<String> list, int i10) {
        hv<T> hvVarM6740 = hu.m6637().m6639().m6740(obj, iaVar, new hm() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.2
            @Override // com.ironsource.adqualitysdk.sdk.i.hm
            /* JADX INFO: renamed from: ﻐ */
            public final Field[] mo6552(Object obj2) {
                hu.m6637().m6640();
                return hq.m6583(obj2.getClass(), true, -1, list);
            }
        }, list, i10);
        f2996 = (f2998 + 77) % 128;
        return hvVarM6740;
    }

    static class e {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3010;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3011;

        private e() {
            this.f3010 = false;
            this.f3011 = false;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m7205() {
            return this.f3010;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final boolean m7206() {
            return this.f3011;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final void m7207() {
            this.f3011 = true;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final boolean m7208() {
            return m7205() || m7206();
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final void m7209() {
            this.f3010 = true;
        }

        /* synthetic */ e(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ia m7200() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo6154(hv hvVar) {
                return WebViewClient.class.equals(hvVar.mo6641().getType());
            }
        };
        f2996 = (f2998 + 65) % 128;
        return iaVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static WebChromeClient m7186(WebView webView) {
        WebChromeClient webChromeClient;
        int i10 = f2998 + 3;
        f2996 = i10 % 128;
        if ((i10 % 2 != 0 || Build.VERSION.SDK_INT >= 26) && m7191().m4934() && m7204(webView.getContext())) {
            f2996 = (f2998 + 9) % 128;
            webChromeClient = webView.getWebChromeClient();
        } else {
            hv<WebChromeClient> hvVarM7202 = m7202(webView);
            if (hvVarM7202 != null) {
                webChromeClient = hvVarM7202.mo6642();
            } else {
                throw new RuntimeException(m7203("官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕⇣\uda8c缌䯄陒蛐\uece0㮫ł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭", 35 - KeyEvent.normalizeMetaState(0)).intern());
            }
        }
        int i11 = f2996 + 11;
        f2998 = i11 % 128;
        if (i11 % 2 != 0) {
            return webChromeClient;
        }
        throw null;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m7204(Context context) {
        int i10 = f2998 + 99;
        f2996 = i10 % 128;
        if (i10 % 2 == 0) {
            if (f3004) {
                boolean z10 = false;
                f3004 = false;
                WebView webView = new WebView(context);
                hi hiVar = new hi(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.4
                });
                webView.setWebChromeClient(hiVar);
                if (hiVar == webView.getWebChromeClient()) {
                    int i11 = f2998 + 51;
                    f2996 = i11 % 128;
                    if (i11 % 2 == 0) {
                        z10 = true;
                    }
                }
                f3006 = z10;
                f2998 = (f2996 + 115) % 128;
            }
            return f3006;
        }
        throw null;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m7194(Context context) {
        boolean z10;
        if (f3007) {
            try {
                f3007 = false;
                WebView webView = new WebView(context);
                hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.1
                });
                webView.setWebViewClient(hkVar);
                if (hkVar == webView.getWebViewClient()) {
                    f2998 = (f2996 + 15) % 128;
                    z10 = true;
                } else {
                    z10 = false;
                }
                f3008 = z10;
                f2996 = (f2998 + 87) % 128;
            } catch (Throwable th2) {
                kd.m7160(m7203("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", 12 - Color.red(0)).intern(), m7203("ᢧន횻\ud90e籄ⴂ閮\ue706丌獹띣鵢\ueea8\ue39a\uf535\u1cce\uf217\ue3c5鴤锓⍡둧ᄚ㸤䯢◑ꙓ\udf00翱瓩\uf773\uf8f5멥뤛䦦筚", ImageFormat.getBitsPerPixel(0) + 37).intern(), th2, false);
            }
        }
        return f3008;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> e m7197(WebView webView, T t10, ia iaVar) {
        e eVar = new e((byte) 0);
        hv hvVarM7187 = m7187(webView, iaVar, m7191().m4935(), m7191().m4939());
        if (hvVarM7187 != null) {
            Object objMo6642 = hvVarM7187.mo6642();
            if (objMo6642 == t10) {
                int i10 = f2998 + 79;
                f2996 = i10 % 128;
                if (i10 % 2 == 0) {
                    eVar.m7209();
                    return eVar;
                }
                eVar.m7209();
                throw null;
            }
            hv hvVarM7196 = m7196(objMo6642, iaVar, m7191().m4938(), m7191().m4937());
            if (hvVarM7196 != null) {
                f2998 = (f2996 + 93) % 128;
                if (hvVarM7196.mo6642() == t10) {
                    eVar.m7207();
                    f2996 = (f2998 + 47) % 128;
                }
            }
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m7189(Context context) {
        int i10 = f2996 + 31;
        f2998 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
            if (!f3005) {
                return;
            }
        } else if (!f3005) {
            return;
        }
        f3005 = false;
        try {
            WebView webView = new WebView(context);
            hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.3
            });
            webView.setWebViewClient(hkVar);
            hi hiVar = new hi(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.5
            });
            webView.setWebChromeClient(hiVar);
            f2999 = m7197(webView, hkVar, m7200());
            f3001 = m7197(webView, hiVar, m7188());
            int i12 = f2998 + 101;
            f2996 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            kd.m7160(m7203("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", TextUtils.indexOf("", "") + 12).intern(), m7203("ᢧន횻\ud90e籄ⴂ閮\ue706丌獹띣鵢\ueea8\ue39a鷿貘愎骹\uf535\u1cceত◹蓍鎿\ue318橔ł蠣藸顓䲐뿋", 32 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7203(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3003)) ^ ((c11 >>> 5) + f2997)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3000) ^ ((c12 + i12) ^ ((c12 << 4) + f3002))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m7193(WebView webView, ia iaVar, e eVar) {
        int i10 = f2996 + 107;
        f2998 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m7203("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m7203("ᢧន횻\ud90e籄ⴂ禺恗鷖엤\ue4b4赸\ufafc뎸\uef66벫멥뤛䦦筚鷿貘멥뤛ɻ♡", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            eVar.m7208();
            throw null;
        }
        if (eVar.m7208()) {
            hv<T> hvVarM7187 = m7187(webView, iaVar, m7191().m4935(), m7191().m4939());
            if (!(!eVar.m7206())) {
                int i11 = f2996 + 83;
                f2998 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (hvVarM7187 != null) {
                    T tMo6642 = hvVarM7187.mo6642();
                    if (tMo6642 != null && !tMo6642.getClass().equals(hvVarM7187.mo6641().getType())) {
                        return m7196(tMo6642, iaVar, m7191().m4938(), m7191().m4937());
                    }
                    f2996 = (f2998 + 39) % 128;
                    return hvVarM7187;
                }
            }
            return hvVarM7187;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m7187(WebView webView, ia iaVar, List<String> list, int i10) {
        f2996 = (f2998 + 31) % 128;
        hv<T> hvVarM7199 = m7199(webView, iaVar, list, i10);
        int i11 = f2996 + 89;
        f2998 = i11 % 128;
        if (i11 % 2 != 0) {
            return hvVarM7199;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ia m7188() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo6154(hv hvVar) {
                return WebChromeClient.class.equals(hvVar.mo6641().getType());
            }
        };
        int i10 = f2996 + 71;
        f2998 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 49 / 0;
        }
        return iaVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m7196(T t10, ia iaVar, List<String> list, int i10) {
        int i11 = f2996 + 33;
        f2998 = i11 % 128;
        if (i11 % 2 == 0) {
            m7199(t10, iaVar, list, i10);
            throw null;
        }
        hv<T> hvVarM7199 = m7199(t10, iaVar, list, i10);
        int i12 = f2998 + 9;
        f2996 = i12 % 128;
        if (i12 % 2 == 0) {
            return hvVarM7199;
        }
        throw null;
    }
}
