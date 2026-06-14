package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4295e8 extends C4528s3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4295e8 f42968d = new C4295e8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4298eb f42969b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4298eb f42970c = null;

    /* JADX INFO: renamed from: com.ironsource.e8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42971a;

        a(AdInfo adInfo) {
            this.f42971a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.e(c4295e8.a(this.f42971a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4295e8.this.a(this.f42971a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f42974b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f42973a = ironSourceError;
            this.f42974b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.a(this.f42973a, c4295e8.a(this.f42974b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4295e8.this.a(this.f42974b) + ", error = " + this.f42973a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f42977b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f42976a = ironSourceError;
            this.f42977b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.a(this.f42976a, c4295e8.a(this.f42977b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4295e8.this.a(this.f42977b) + ", error = " + this.f42976a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42979a;

        d(AdInfo adInfo) {
            this.f42979a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.d(c4295e8.a(this.f42979a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4295e8.this.a(this.f42979a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42981a;

        e(AdInfo adInfo) {
            this.f42981a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.d(c4295e8.a(this.f42981a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4295e8.this.a(this.f42981a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42983a;

        f(AdInfo adInfo) {
            this.f42983a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.a(c4295e8.a(this.f42983a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4295e8.this.a(this.f42983a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42985a;

        g(AdInfo adInfo) {
            this.f42985a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.a(c4295e8.a(this.f42985a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4295e8.this.a(this.f42985a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42987a;

        h(IronSourceError ironSourceError) {
            this.f42987a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4298eb interfaceC4298eb = C4295e8.this.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.b(this.f42987a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f42987a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f42989a;

        i(IronSourceError ironSourceError) {
            this.f42989a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4298eb interfaceC4298eb = C4295e8.this.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.b(this.f42989a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f42989a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42991a;

        j(AdInfo adInfo) {
            this.f42991a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.c(c4295e8.a(this.f42991a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4295e8.this.a(this.f42991a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42993a;

        k(AdInfo adInfo) {
            this.f42993a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.c(c4295e8.a(this.f42993a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4295e8.this.a(this.f42993a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$l */
    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42995a;

        l(AdInfo adInfo) {
            this.f42995a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.b(c4295e8.a(this.f42995a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4295e8.this.a(this.f42995a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$m */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42997a;

        m(AdInfo adInfo) {
            this.f42997a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42969b;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.b(c4295e8.a(this.f42997a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4295e8.this.a(this.f42997a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e8$n */
    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f42999a;

        n(AdInfo adInfo) {
            this.f42999a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4295e8 c4295e8 = C4295e8.this;
            InterfaceC4298eb interfaceC4298eb = c4295e8.f42970c;
            if (interfaceC4298eb != null) {
                interfaceC4298eb.e(c4295e8.a(this.f42999a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4295e8.this.a(this.f42999a));
            }
        }
    }

    private C4295e8() {
    }

    public static synchronized C4295e8 a() {
        return f42968d;
    }

    public void d(AdInfo adInfo) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC4298eb interfaceC4298eb) {
        this.f42969b = interfaceC4298eb;
    }

    public synchronized void b(InterfaceC4298eb interfaceC4298eb) {
        this.f42970c = interfaceC4298eb;
    }

    public void c(AdInfo adInfo) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f42970c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f42969b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
