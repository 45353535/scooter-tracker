package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f46271z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f46275d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f46277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.l f46278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f46279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f46280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f46282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f46283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f46284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f46285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f46286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f46287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f46288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f46289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f46290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f46291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f46292u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f46294w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Handler f46295x = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f46296y = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f46276e = com.mbridge.msdk.foundation.controller.c.n().d();

    class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46298b;

        a(CampaignEx campaignEx, int i10) {
            this.f46297a = campaignEx;
            this.f46298b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f46271z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f46297a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.f46295x.sendMessage(messageObtain);
            b.this.a(this.f46297a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f46271z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f46297a;
            messageObtain.arg1 = this.f46298b;
            b.this.f46295x.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            b.this.a(this.f46297a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    class C0486b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f46302c;

        C0486b(CampaignEx campaignEx, int i10, long j10) {
            this.f46300a = campaignEx;
            this.f46301b = i10;
            this.f46302c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i10);
            if (i10 != 1) {
                b.this.a(this.f46300a, "readyState 2", this.f46301b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46300a, b.this.f46272a, "readyState 2", this.f46302c, 3);
                return;
            }
            b.this.f46277f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f46273b + b.this.f46272a + this.f46300a.getRequestId(), true);
            b.this.h(this.f46300a, this.f46301b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46300a, b.this.f46272a, "", this.f46302c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f46300a.isHasMBTplMark()) {
                b.this.f46277f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f46273b + b.this.f46272a + this.f46300a.getRequestId(), true);
                b.this.h(this.f46300a, this.f46301b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46300a, b.this.f46272a, "", this.f46302c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f46300a, str, this.f46301b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46300a, b.this.f46272a, "error code:" + i10 + str, this.f46302c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f46300a, "onReceivedSslError:" + sslError.getUrl(), this.f46301b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46300a, b.this.f46272a, "error url:" + sslError.getUrl(), this.f46302c, 3);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f46304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46305b;

        c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f46304a = mBNativeAdvancedWebview;
            this.f46305b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46304a.loadUrl(this.f46305b);
        }
    }

    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            Object obj;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj2 = message.obj;
                int i11 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                return;
            }
            if (i10 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i12 = ((Bundle) obj3).getInt("type");
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880007 : i12 == 3 ? 880006 : 880024);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.f46285n, b.this.f46286o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e10);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.f46285n, b.this.f46286o, (CampaignEx) null);
                    return;
                }
            }
            if (i10 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.f46286o);
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f46277f != null) {
                        b.this.f46277f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.f46286o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f46277f != null) {
                b.this.f46277f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.f46286o);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f46285n, b.this.f46286o, (CampaignEx) null);
        }
    }

    class g extends com.mbridge.msdk.advanced.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f46311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f46312f;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f46314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f46315b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f46316c;

            a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f46314a = exc;
                this.f46315b = i10;
                this.f46316c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f46314a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f46311e;
                int i10 = this.f46315b;
                CampaignUnit campaignUnit = this.f46316c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f46316c.getAds().size() == 0) ? null : this.f46316c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        class RunnableC0487b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f46318a;

            RunnableC0487b(String str) {
                this.f46318a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f46318a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f46311e, gVar.f46312f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, String str, int i11) {
            super(i10);
            this.f46311e = str;
            this.f46312f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f46272a, this.f46311e);
                b.this.f46294w = campaignUnit.getRequestId();
                b.this.f46279h = campaignUnit.getAds();
            } catch (Exception e10) {
                q0.b(b.f46271z, e10.getMessage());
                q0.c(b.f46271z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f46295x != null) {
                    b.this.f46295x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            q0.b(b.f46271z, str);
            q0.c(b.f46271z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f46295x != null) {
                b.this.f46295x.post(new RunnableC0487b(str));
            }
            b.this.f();
        }
    }

    class h extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46320a;

        h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f46320a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f46320a, b.this.f46276e, null);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46322a;

        i(CampaignEx campaignEx) {
            this.f46322a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f46276e)).d();
            y.a(b.this.f46276e, this.f46322a);
        }
    }

    class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46325b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f46324a, jVar.f46325b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        class RunnableC0488b implements Runnable {
            RunnableC0488b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f46324a, jVar.f46325b);
            }
        }

        j(CampaignEx campaignEx, int i10) {
            this.f46324a = campaignEx;
            this.f46325b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f46271z, "gifurl 下载失败： " + str2);
            if (b.this.f46295x != null) {
                b.this.f46295x.post(new RunnableC0488b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f46271z, "giturl 下载成功： " + str);
            if (b.this.f46295x != null) {
                b.this.f46295x.post(new a());
            }
        }
    }

    class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46330b;

        k(CampaignEx campaignEx, int i10) {
            this.f46329a = campaignEx;
            this.f46330b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f46271z, "endcard 下载失败： " + str2);
            if (b.this.f46277f != null) {
                b.this.f46277f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f46329a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.f46295x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f46271z, "endcard 下载成功： " + str);
            if (b.this.f46295x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f46329a;
                messageObtain.arg1 = this.f46330b;
                b.this.f46295x.sendMessage(messageObtain);
            }
        }
    }

    class l implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46333b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f46332a, lVar.f46333b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        class RunnableC0489b implements Runnable {
            RunnableC0489b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f46332a, lVar.f46333b);
            }
        }

        l(CampaignEx campaignEx, int i10) {
            this.f46332a = campaignEx;
            this.f46333b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f46271z, "image 下载失败： " + str2);
            if (b.this.f46295x != null) {
                b.this.f46295x.post(new RunnableC0489b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f46271z, "image 下载成功： " + str);
            if (b.this.f46295x != null) {
                b.this.f46295x.post(new a());
            }
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f46337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f46339c;

        m(File file, CampaignEx campaignEx, int i10) {
            this.f46337a = file;
            this.f46338b = campaignEx;
            this.f46339c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f46337a.getAbsolutePath(), this.f46338b, this.f46339c);
        }
    }

    public b(String str, String str2, long j10) {
        this.f46273b = str;
        this.f46272a = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f46277f, campaignEx, this.f46273b, this.f46272a) || this.f46288q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f46272a);
        this.f46288q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f46275d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f46280i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f46277f, campaignEx, this.f46273b, this.f46272a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f46293v = 0;
    }

    private void g() {
        try {
            int i10 = this.f46293v + 1;
            this.f46293v = i10;
            com.mbridge.msdk.setting.l lVar = this.f46278g;
            if (lVar == null || i10 > lVar.y()) {
                q0.c(f46271z, "onload 重置offset为0");
                this.f46293v = 0;
            }
            q0.c(f46271z, "onload 算出 下次的offset是:" + this.f46293v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f46277f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f46272a, campaignEx);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f46279h);
    }

    public String d() {
        return this.f46294w;
    }

    public void e() {
        if (this.f46275d != null) {
            this.f46275d = null;
        }
        if (this.f46289r != null) {
            this.f46289r = null;
        }
        if (this.f46290s != null) {
            this.f46290s = null;
        }
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:81|(4:80|3|91|4)|(8:6|(1:8)|13|82|14|(6:16|95|17|(1:19)|24|25)|89|72)(1:30)|87|31|(1:33)|45|(1:54)(2:51|(1:53))|(3:56|89|72)(1:98)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        r5 = r4;
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: all -> 0x00b7, Exception -> 0x0130, TRY_ENTER, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106 A[Catch: all -> 0x00b7, Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[Catch: IOException -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0122, blocks: (B:69:0x013c, B:56:0x011e), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c A[Catch: IOException -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0122, blocks: (B:69:0x013c, B:56:0x011e), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.b.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f46289r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f46276e, this.f46272a, copyOnWriteArrayList, 298, this.f46289r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f46272a, campaignEx.isBidCampaign())) {
            q0.a(f46271z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f46272a);
        } else {
            q0.a(f46271z, " load Video isReady true");
            this.f46277f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    public void b(String str, int i10) throws Throwable {
        String str2;
        CampaignEx campaignExA;
        List<Integer> listC;
        this.f46288q = false;
        this.f46285n = str;
        this.f46286o = i10;
        this.f46280i = null;
        if (this.f46277f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f46277f, this.f46273b, this.f46272a, str, this.f46281j, false, false);
            str2 = str;
        } else {
            str2 = str;
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f46277f, this.f46273b, this.f46272a, str2, this.f46281j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.f46278g;
        if (lVar != null && lVar.t() == 1 && this.f46277f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f46287p = false;
        com.mbridge.msdk.setting.l lVar2 = this.f46278g;
        if (lVar2 != null && (listC = lVar2.c()) != null && listC.size() > 0) {
            this.f46274c = listC.get(0).intValue() * 1000;
        } else {
            this.f46274c = 30000L;
        }
        q0.a(f46271z, "开始从V3请求新的 offer，超时 ：" + this.f46274c);
        if (this.f46278g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            a(this.f46274c);
            a(this.f46276e, str2, i10);
        } else if (System.currentTimeMillis() - timestamp > this.f46278g.v() * 1000) {
            a(this.f46274c);
            a(this.f46276e, str2, i10);
        } else {
            j(campaignExA, i10);
        }
    }

    class d implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46307a;

        d(CampaignEx campaignEx) {
            this.f46307a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.f46271z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f46307a;
            messageObtain.what = 5;
            b.this.f46295x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.f46271z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f46307a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f46295x.sendMessage(messageObtain);
        }
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f46277f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(f46271z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(f46271z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(f46271z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(f46271z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(f46271z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(f46271z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f46290s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f46290s);
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.f46278g = lVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f46277f = mBNativeAdvancedView;
    }

    public void a(int i10) {
        this.f46281j = i10;
    }

    public void a(int i10, int i11) {
        this.f46284m = i10;
        this.f46283l = i11;
    }

    private void a(long j10) {
        this.f46295x.postDelayed(this.f46296y, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        Exception exc;
        String str2;
        try {
        } catch (Exception e10) {
            exc = e10;
            str2 = str;
        }
        if (context == null) {
            a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
            return;
        }
        try {
            if (a1.a(this.f46272a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            try {
                com.mbridge.msdk.advanced.manager.d.b(this.f46272a);
            } catch (Throwable th2) {
                q0.b(f46271z, th2.getMessage());
            }
            q0.c(f46271z, "load 开始准备请求参数");
            MBridgeIds mBridgeIds = new MBridgeIds(this.f46273b, this.f46272a);
            com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
            fVar.d(i10);
            fVar.c(this.f46293v);
            fVar.a(this.f46292u);
            fVar.b(this.f46284m);
            fVar.a(this.f46283l);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                q0.c(f46271z, "load 请求参数为空 load失败");
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a("token", str);
            }
            String strD = v0.d(this.f46272a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            str2 = str;
            try {
                new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str2, com.mbridge.msdk.foundation.same.c.a(this.f46274c, 30000L));
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            str2 = str;
        }
        exc = e;
        q0.b(f46271z, exc.getMessage());
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
        bVar.a((Throwable) exc);
        a(bVar, str2, i10, (CampaignEx) null);
        f();
    }

    private void b() {
        this.f46295x.removeCallbacks(this.f46296y);
    }

    private void b(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f46272a);
        gVar.setPlacementId(this.f46273b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        String str3;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str3, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            q0.c(f46271z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i10);
            return;
        }
        q0.c(f46271z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str3, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f46272a);
        a(campaignEx);
        this.f46292u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f46276e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f46276e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f46272a, campaignEx, com.mbridge.msdk.foundation.same.a.f48612x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f46276e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f46275d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f46287p) {
            this.f46287p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f46277f, this.f46273b, this.f46272a, str, this.f46281j, true, true);
        if (campaignExA != null) {
            q0.b(f46271z, "load failed cache ");
            j(campaignExA, i10);
        } else {
            a(bVar, i10, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f46288q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(f46271z, "real failed: " + bVar.l());
        }
        this.f46288q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f46275d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f46291t = new k(campaignEx, i10);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f46291t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f46277f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f46272a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f46277f.getContext(), this.f46273b, this.f46272a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f46281j);
        bVar.b(this.f46282k);
        this.f46277f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f46277f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0486b(campaignEx, i10, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.b(f46271z, "=======开始渲染: " + str);
            Handler handler = this.f46295x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.f46285n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f46272a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f46285n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f46272a, campaignEx);
    }

    public String a(String str) {
        int iO;
        if (this.f46280i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f46272a, this.f46280i.getId() + this.f46280i.getVideoUrlEncode() + this.f46280i.getBidToken());
                if (aVarA != null && (iO = aVarA.o()) == 5) {
                    String strP = aVarA.p();
                    if (new File(strP).exists()) {
                        q0.b(f46271z, "本地已下载完 拿本地播放地址：" + strP + " state：" + iO);
                        return strP;
                    }
                }
            } catch (Exception e10) {
                q0.b(f46271z, e10.getMessage());
            }
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f46271z, e10.getMessage());
            }
        }
    }
}
