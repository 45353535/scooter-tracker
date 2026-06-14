package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.common.c;
import com.mbridge.msdk.splash.manager.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f50750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f50751e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBSplashView f50753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f50754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f50759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f50762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f50763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f50764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f50765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50766t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f50769w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f50767u = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f50770x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f50771y = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f50772z = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f50752f = com.mbridge.msdk.foundation.controller.c.n().d();

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj = message.obj;
                int i11 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.f50760n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i12 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880006 : 880027);
                    bVar.c(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f50759m, e.this.f50760n, campaignEx2);
                }
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e10);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.f50759m, e.this.f50760n, (CampaignEx) null);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f50759m, e.this.f50760n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    class C0571e extends com.mbridge.msdk.splash.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f50780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f50781f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0571e(int i10, String str, int i11) {
            super(i10);
            this.f50780e = str;
            this.f50781f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f50747a, this.f50780e);
                e.this.f50767u = campaignUnit.getRequestId();
                e.this.f50769w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f50780e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            q0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f50780e, this.f50781f, (CampaignEx) null);
            e.this.f();
        }
    }

    class f extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50783a;

        f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f50783a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f50783a, e.this.f50752f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50785a;

        g(CampaignEx campaignEx) {
            this.f50785a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f50752f)).d();
            y.a(e.this.f50752f, this.f50785a);
        }
    }

    class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50788b;

        h(CampaignEx campaignEx, int i10) {
            this.f50787a = campaignEx;
            this.f50788b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f50787a.isDynamicView() && e.this.f50753g != null) {
                e.this.f50753g.setImageReady(true);
                e.this.f(this.f50787a, this.f50788b);
            }
            e.this.h(this.f50787a, this.f50788b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f50787a.isDynamicView() || e.this.f50753g == null) {
                return;
            }
            e.this.f50753g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f50759m, this.f50788b, this.f50787a);
        }
    }

    class i implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50790a;

        i(CampaignEx campaignEx) {
            this.f50790a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f50790a, str, true, "");
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            e.this.a(this.f50790a, str, false, message);
        }
    }

    class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50793b;

        j(CampaignEx campaignEx, int i10) {
            this.f50792a = campaignEx;
            this.f50793b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f50759m, this.f50793b, this.f50792a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f50792a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.f50771y.sendMessage(messageObtain);
            e.this.a(this.f50792a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f50792a;
            messageObtain.arg1 = this.f50793b;
            e.this.f50771y.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            CampaignEx campaignEx = this.f50792a;
            e.this.a(this.f50792a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    class k implements com.mbridge.msdk.splash.inter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50796b;

        k(CampaignEx campaignEx, int i10) {
            this.f50795a = campaignEx;
            this.f50796b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f50753g != null) {
                e.this.f50753g.setDynamicView(true);
                e.this.f50753g.setSplashNativeView(view);
                e.this.h(this.f50795a, this.f50796b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f50759m, this.f50796b, this.f50795a);
        }
    }

    public e(String str, String str2, long j10) {
        this.f50748b = str;
        this.f50747a = str2;
        this.f50750d = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f50753g, campaignEx) || this.f50762p) {
            return;
        }
        b();
        if (this.f50761o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f50747a);
        }
        this.f50762p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f50751e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f50753g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f50753g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f50753g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    class a implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50774b;

        a(CampaignEx campaignEx, int i10) {
            this.f50773a = campaignEx;
            this.f50774b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f50773a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f50773a, this.f50774b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f50774b, this.f50773a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f50773a, this.f50774b);
            } else {
                e.this.a("readyState 2", this.f50774b, this.f50773a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f50766t = 0;
    }

    private void g() {
        try {
            int i10 = this.f50766t + 1;
            this.f50766t = i10;
            l lVar = this.f50754h;
            if (lVar != null && i10 <= lVar.y()) {
                return;
            }
            this.f50766t = 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String d() {
        return this.f50767u;
    }

    public void e() {
        if (this.f50751e != null) {
            this.f50751e = null;
        }
        if (this.f50763q != null) {
            this.f50763q = null;
        }
        if (this.f50764r != null) {
            this.f50764r = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:57|3|64|4)|(8:6|(1:8)|13|60|14|(6:16|66|17|(1:19)|24|25)|43|(2:50|69)(2:49|68))(1:30)|62|31|(1:33)|43|(1:45)|50|69) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r5 = r4;
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: Exception -> 0x011a, TRY_ENTER, TryCatch #3 {Exception -> 0x011a, blocks: (B:53:0x0116, B:54:0x0119, B:41:0x00d2, B:43:0x00d6, B:45:0x00dc, B:47:0x00e2, B:49:0x00e8, B:50:0x0108, B:33:0x00b3), top: B:59:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[Catch: Exception -> 0x011a, TryCatch #3 {Exception -> 0x011a, blocks: (B:53:0x0116, B:54:0x0119, B:41:0x00d2, B:43:0x00d6, B:45:0x00dc, B:47:0x00e2, B:49:0x00e8, B:50:0x0108, B:33:0x00b3), top: B:59:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.e.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            c.a aVar = new c.a();
            aVar.b(this.f50747a).a(this.f50748b).a(this.f50755i).a(campaignEx).c(this.f50756j).f(this.f50768v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                q0.b(A, th2.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f50753g, aVar.a(), new k(campaignEx, i10));
        }
    }

    public void b(int i10) {
        this.f50768v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f50769w);
    }

    private void b() {
        this.f50771y.removeCallbacks(this.f50772z);
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f50753g, campaignEx, new h(campaignEx, i10));
    }

    class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50776a;

        b(CampaignEx campaignEx) {
            this.f50776a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f50753g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f50776a;
            messageObtain.what = 3;
            e.this.f50771y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f50753g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f50759m, e.this.f50760n, this.f50776a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f50776a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f50771y.sendMessage(messageObtain);
        }
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f50763q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f50752f, this.f50747a, copyOnWriteArrayList, 297, this.f50763q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f50747a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f50747a);
        } else {
            this.f50753g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f50753g.isH5Ready()) {
            return;
        }
        this.f50753g.setH5Ready(true);
        h(campaignEx, i10);
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            z.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f50764r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f50764r);
    }

    public void a(l lVar) {
        this.f50754h = lVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f50753g = mBSplashView;
    }

    public void a(boolean z10) {
        this.f50755i = z10;
    }

    public void a(int i10) {
        this.f50756j = i10;
    }

    public void a(int i10, int i11) {
        this.f50758l = i10;
        this.f50757k = i11;
    }

    public void a(String str, int i10) {
        this.f50762p = false;
        this.f50759m = str;
        this.f50760n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f50753g, this.f50748b, this.f50747a, str, this.f50755i, this.f50756j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f50754h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f50761o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f50754h.c();
            if (listC != null && listC.size() > 0) {
                this.f50749c = listC.get(0).intValue() * 1000;
            } else {
                this.f50749c = 30000L;
            }
        } else {
            long j10 = this.f50750d;
            if (j10 <= 0) {
                this.f50749c = this.f50754h.E();
            } else {
                this.f50749c = j10;
            }
        }
        if (this.f50754h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f50749c);
            a(this.f50752f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f50754h.v() * 1000) {
            a(this.f50749c);
            a(this.f50752f, str, i10);
        } else {
            i(campaignExA, i10);
        }
    }

    private void a(long j10) {
        this.f50771y.postDelayed(this.f50772z, j10);
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
            if (a1.a(this.f50747a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.f50748b, this.f50747a);
            com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
            fVar.d(i10);
            fVar.c(this.f50766t);
            fVar.a(this.f50765s);
            fVar.b(this.f50758l);
            fVar.a(this.f50757k);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a("token", str);
            }
            String strD = v0.d(this.f50747a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
            C0571e c0571e = new C0571e(i10, str, i10);
            c0571e.a(str);
            c0571e.setUnitId(this.f50747a);
            c0571e.setPlacementId(this.f50748b);
            c0571e.setAdType(297);
            str2 = str;
            try {
                cVar.choiceV3OrV5BySetting(1, eVarB, c0571e, str2, com.mbridge.msdk.foundation.same.c.a(this.f50749c, 30000L));
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            str2 = str;
        }
        exc = e;
        q0.b(A, exc.getMessage());
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
        bVar.a((Throwable) exc);
        a(bVar, str2, i10, (CampaignEx) null);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 297);
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            }
            CampaignEx campaignEx = listA.get(0);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i10);
            return;
        }
        if (this.f50770x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f50747a);
        a(campaignEx);
        this.f50765s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f50752f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f50752f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f50747a, campaignEx, com.mbridge.msdk.foundation.same.a.f48612x);
                this.f50770x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f50752f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f50751e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f50761o) {
            this.f50761o = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f50753g, this.f50748b, this.f50747a, str, this.f50755i, this.f50756j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f50762p) {
            return;
        }
        b();
        this.f50762p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f50751e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f50753g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        g.d dVar = new g.d();
        dVar.c(this.f50747a);
        dVar.b(this.f50748b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f50755i);
        dVar.a(this.f50756j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f50753g, dVar, new a(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f50759m, i10, campaignEx);
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
                q0.b(A, e10.getMessage());
            }
        }
    }
}
