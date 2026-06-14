package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f53123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f53124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f53125l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f53114a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f53115b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f53116c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f53117d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f53118e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f53119f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f53120g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f53121h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f53122i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a.InterfaceC0598a f53126m = new C0599a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f53127n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f53128o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f53129p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f53130q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f53131r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    public static class C0599a implements a.InterfaceC0598a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f53115b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f53116c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f53118e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f53121h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f53117d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f53127n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f53122i;
    }

    public AdEvents j() {
        return this.f53131r;
    }

    public AdSession k() {
        return this.f53129p;
    }

    public int l() {
        if (this.f53116c == 0 && this.f53115b) {
            this.f53116c = 1;
        }
        return this.f53116c;
    }

    public int m() {
        if (this.f53117d == 0 && this.f53115b) {
            this.f53117d = 1;
        }
        return this.f53117d;
    }

    public int n() {
        if (this.f53118e == 0 && this.f53115b) {
            this.f53118e = 1;
        }
        return this.f53118e;
    }

    public MediaEvents o() {
        return this.f53130q;
    }

    public boolean p() {
        return this.f53115b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f53125l;
        if (aVar != null) {
            aVar.a(false);
            this.f53125l.a((NativeListener.NativeTrackingListener) null);
            this.f53125l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f53131r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f53129p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f53124k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        q0.a("DefaultJSCommon", "setUnitId:" + str);
        this.f53123j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f53130q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f53120g = i10;
    }

    public static class b implements a.InterfaceC0598a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f53132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.InterfaceC0598a f53133b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0598a interfaceC0598a) {
            this.f53132a = dVar;
            this.f53133b = interfaceC0598a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void a(boolean z10) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f53132a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void onInitSuccess() {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            return interfaceC0598a != null && interfaceC0598a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f53132a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void a(int i10, String str) {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0598a
        public void a() {
            a.InterfaceC0598a interfaceC0598a = this.f53133b;
            if (interfaceC0598a != null) {
                interfaceC0598a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f53120g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f53114a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f53114a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f53121h);
        return this.f53121h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(a.InterfaceC0598a interfaceC0598a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0598a);
        this.f53126m = interfaceC0598a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f53122i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }
}
