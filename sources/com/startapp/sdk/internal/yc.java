package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yc {
    public static void a(Context context, WebView webView, zc zcVar) {
        if (zcVar == null) {
            zcVar = new zc(context);
        }
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.CALENDAR", Boolean.valueOf(zcVar.f65694b.contains(MRAIDNativeFeature.CALENDAR) && q0.a(zcVar.f65693a, "android.permission.WRITE_CALENDAR")));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.INLINEVIDEO", Boolean.valueOf(zcVar.f65694b.contains(MRAIDNativeFeature.INLINE_VIDEO)));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.SMS", Boolean.valueOf(zcVar.f65694b.contains(MRAIDNativeFeature.SMS) && q0.a(zcVar.f65693a, "android.permission.SEND_SMS")));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.STOREPICTURE", Boolean.valueOf(zcVar.f65694b.contains(MRAIDNativeFeature.STORE_PICTURE)));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.TEL", Boolean.valueOf(zcVar.f65694b.contains(MRAIDNativeFeature.TEL) && q0.a(zcVar.f65693a, "android.permission.CALL_PHONE")));
    }
}
