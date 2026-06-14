package com.mbridge.msdk.mbbanner.common.communication;

import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static void a(WebView webView) {
        q0.b("BannerCallJS", "fireOnJSBridgeConnected");
        f.a().a(webView);
    }

    public static void a(WebView webView, float f10, float f11) {
        q0.b("BannerCallJS", "fireOnBannerWebViewShow");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f10);
            jSONObject.put("startY", f11);
            jSONObject.put("scale", v0.d(c.n().d()));
            f.a().a(webView, "webviewshow", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            q0.b("BannerCallJS", "fireOnBannerWebViewShow", th2);
        }
    }

    public static void a(WebView webView, int i10, int i11) {
        q0.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(webView, i10, i11);
        } catch (Throwable th2) {
            q0.b("BannerCallJS", "fireOnBannerViewSizeChange", th2);
        }
    }

    public static void a(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        q0.b("BannerCallJS", "transInfoForMraid");
        try {
            int i14 = c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = "landscape";
            } else {
                str = i14 == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fN = m0.n(c.n().d());
            float fM = m0.m(c.n().d());
            HashMap mapV = m0.v(c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
            map.put("state", "default");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b("BannerCallJS", "transInfoForMraid", th2);
        }
    }
}
