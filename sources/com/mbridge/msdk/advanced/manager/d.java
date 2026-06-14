package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f46343a = "ResManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f46344b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f46345c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f46349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f46350e;

        a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j10) {
            this.f46346a = str;
            this.f46347b = str2;
            this.f46348c = campaignEx;
            this.f46349d = mBNativeAdvancedView;
            this.f46350e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            if (i10 != 1) {
                this.f46349d.setH5Ready(false);
                q0.a("WindVaneWebView", "======渲染失败");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46348c, this.f46347b, "readyState 2", this.f46350e, 3);
                return;
            }
            com.mbridge.msdk.advanced.common.c.a(this.f46346a + this.f46347b + this.f46348c.getRequestId(), true);
            this.f46349d.setH5Ready(true);
            q0.a("WindVaneWebView", "======渲染成功：ready");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46348c, this.f46347b, "", this.f46350e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f46348c.isHasMBTplMark()) {
                com.mbridge.msdk.advanced.common.c.a(this.f46346a + this.f46347b + this.f46348c.getRequestId(), true);
                this.f46349d.setH5Ready(true);
                q0.a("WindVaneWebView", "======渲染成功：finish");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46348c, this.f46347b, "", this.f46350e, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f46349d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46348c, this.f46347b, "error code:" + i10 + str, this.f46350e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f46349d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46348c, this.f46347b, "error url:" + sslError.getUrl(), this.f46350e, 3);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f46351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46352b;

        b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f46351a = mBNativeAdvancedWebview;
            this.f46352b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46351a.loadUrl(this.f46352b);
        }
    }

    public static CampaignEx a(MBNativeAdvancedView mBNativeAdvancedView, String str, String str2, String str3, int i10, boolean z10, boolean z11) {
        com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        long jA0 = gVarD.a0() * 1000;
        long jB0 = gVarD.b0() * 1000;
        a(jB0, str2);
        List<CampaignEx> listA = a(str2, str3);
        if (listA != null && listA.size() > 0) {
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - jA0;
            if (z10) {
                if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                    if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11) && campaignEx.isSpareOffer(jA0, jB0)) {
                        return a(campaignEx);
                    }
                    if (!campaignEx.isSpareOffer(jA0, jB0) && mBNativeAdvancedView != null) {
                        mBNativeAdvancedView.setVisibility(8);
                    }
                } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                    q0.b(f46343a, "cache campain is picked:" + campaignEx.getAppName());
                    return a(campaignEx);
                }
            } else if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                q0.a(f46343a, "========已经超了缓存时间");
                if (!campaignEx.isSpareOffer(jA0, jB0) && mBNativeAdvancedView != null) {
                    mBNativeAdvancedView.setVisibility(8);
                    return null;
                }
            } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                q0.b(f46343a, "cache campain is picked:" + campaignEx.getAppName());
                return a(campaignEx);
            }
        }
        return null;
    }

    public static void b(String str) {
        if (f46345c == null) {
            f46345c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f46345c.a(str, 0, f46344b);
    }

    private static List<CampaignEx> a(String str, String str2) {
        if (f46345c == null) {
            f46345c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        return f46345c.b(str, 0, 0, f46344b);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView r9, com.mbridge.msdk.foundation.entity.CampaignEx r10, java.lang.String r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.d.a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, java.lang.String, int, boolean):boolean");
    }

    private static void a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i10) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(str3, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(i10);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.a(f46343a, "======开始渲染：" + str);
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
            return;
        }
        mBNativeAdvancedView.setH5Ready(false);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zA;
        boolean z10 = false;
        if (mBNativeAdvancedView == null) {
            q0.b(f46343a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zA = true;
        } else {
            zA = mBNativeAdvancedView.isVideoReady();
            q0.b(f46343a, "======isReady isVideoReady:" + zA);
        }
        if (zA && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            zA = com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId());
            q0.b(f46343a, "======isReady getAdZip:" + zA);
        }
        if (zA && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zA = com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId());
            q0.b(f46343a, "======isReady getAdHtml:" + zA);
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.b(f46343a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z10 = zA;
        }
        if (!z10 || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z10;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        q0.b(f46343a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f46345c == null) {
            f46345c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f46345c.a(arrayList, str);
    }

    public static void a(long j10, String str) {
        if (f46345c == null) {
            f46345c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f46345c.a(j10, str);
    }
}
