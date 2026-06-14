package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4606wd extends C4528s3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4606wd f45745d = new C4606wd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4486pb f45746b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4486pb f45747c = null;

    /* JADX INFO: renamed from: com.ironsource.wd$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f45748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45749b;

        a(boolean z10, AdInfo adInfo) {
            this.f45748a = z10;
            this.f45749b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                if (!this.f45748a) {
                    ((InterfaceC4503qb) interfaceC4486pb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4503qb) interfaceC4486pb).d(c4606wd.a(this.f45749b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C4606wd.this.a(this.f45749b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4283dd f45751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45752b;

        b(C4283dd c4283dd, AdInfo adInfo) {
            this.f45751a = c4283dd;
            this.f45752b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.b(this.f45751a, c4606wd.a(this.f45752b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f45751a + ", adInfo = " + C4606wd.this.a(this.f45752b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4283dd f45754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45755b;

        c(C4283dd c4283dd, AdInfo adInfo) {
            this.f45754a = c4283dd;
            this.f45755b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.b(this.f45754a, c4606wd.a(this.f45755b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f45754a + ", adInfo = " + C4606wd.this.a(this.f45755b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f45757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45758b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f45757a = ironSourceError;
            this.f45758b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.a(this.f45757a, c4606wd.a(this.f45758b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4606wd.this.a(this.f45758b) + ", error = " + this.f45757a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f45760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45761b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f45760a = ironSourceError;
            this.f45761b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.a(this.f45760a, c4606wd.a(this.f45761b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4606wd.this.a(this.f45761b) + ", error = " + this.f45760a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4283dd f45763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45764b;

        f(C4283dd c4283dd, AdInfo adInfo) {
            this.f45763a = c4283dd;
            this.f45764b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.a(this.f45763a, c4606wd.a(this.f45764b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f45763a + ", adInfo = " + C4606wd.this.a(this.f45764b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4283dd f45766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45767b;

        g(C4283dd c4283dd, AdInfo adInfo) {
            this.f45766a = c4283dd;
            this.f45767b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.a(this.f45766a, c4606wd.a(this.f45767b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f45766a + ", adInfo = " + C4606wd.this.a(this.f45767b));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45769a;

        h(AdInfo adInfo) {
            this.f45769a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                ((InterfaceC4519rb) interfaceC4486pb).a(c4606wd.a(this.f45769a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4606wd.this.a(this.f45769a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45771a;

        i(AdInfo adInfo) {
            this.f45771a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                ((InterfaceC4519rb) interfaceC4486pb).a(c4606wd.a(this.f45771a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4606wd.this.a(this.f45771a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f45773a;

        j(IronSourceError ironSourceError) {
            this.f45773a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4486pb interfaceC4486pb = C4606wd.this.f45747c;
            if (interfaceC4486pb != null) {
                ((InterfaceC4519rb) interfaceC4486pb).b(this.f45773a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f45773a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f45775a;

        k(IronSourceError ironSourceError) {
            this.f45775a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4486pb interfaceC4486pb = C4606wd.this.f45746b;
            if (interfaceC4486pb != null) {
                ((InterfaceC4519rb) interfaceC4486pb).b(this.f45775a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f45775a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$l */
    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45777a;

        l(AdInfo adInfo) {
            this.f45777a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.c(c4606wd.a(this.f45777a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4606wd.this.a(this.f45777a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$m */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45779a;

        m(AdInfo adInfo) {
            this.f45779a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.c(c4606wd.a(this.f45779a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4606wd.this.a(this.f45779a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$n */
    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45781a;

        n(AdInfo adInfo) {
            this.f45781a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.b(c4606wd.a(this.f45781a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4606wd.this.a(this.f45781a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$o */
    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45783a;

        o(AdInfo adInfo) {
            this.f45783a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45746b;
            if (interfaceC4486pb != null) {
                interfaceC4486pb.b(c4606wd.a(this.f45783a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4606wd.this.a(this.f45783a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$p */
    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f45785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f45786b;

        p(boolean z10, AdInfo adInfo) {
            this.f45785a = z10;
            this.f45786b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4606wd c4606wd = C4606wd.this;
            InterfaceC4486pb interfaceC4486pb = c4606wd.f45747c;
            if (interfaceC4486pb != null) {
                if (!this.f45785a) {
                    ((InterfaceC4503qb) interfaceC4486pb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4503qb) interfaceC4486pb).d(c4606wd.a(this.f45786b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + C4606wd.this.a(this.f45786b));
            }
        }
    }

    private C4606wd() {
    }

    public static C4606wd a() {
        return f45745d;
    }

    public void b() {
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4486pb interfaceC4486pb = this.f45746b;
        if (interfaceC4486pb == null || !(interfaceC4486pb instanceof InterfaceC4519rb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC4486pb interfaceC4486pb) {
        this.f45746b = interfaceC4486pb;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4486pb interfaceC4486pb = this.f45746b;
        if (interfaceC4486pb == null || !(interfaceC4486pb instanceof InterfaceC4519rb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(InterfaceC4486pb interfaceC4486pb) {
        this.f45747c = interfaceC4486pb;
    }

    public void c(AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f45746b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f45746b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        InterfaceC4486pb interfaceC4486pb = this.f45746b;
        if (interfaceC4486pb == null || !(interfaceC4486pb instanceof InterfaceC4503qb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void b(C4283dd c4283dd, AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4283dd, adInfo));
        } else if (this.f45746b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4283dd, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f45746b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C4283dd c4283dd, AdInfo adInfo) {
        if (this.f45747c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4283dd, adInfo));
        } else if (this.f45746b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4283dd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
