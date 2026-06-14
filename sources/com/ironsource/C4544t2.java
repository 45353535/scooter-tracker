package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4544t2 extends C4528s3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4544t2 f45447d = new C4544t2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Da f45448b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Da f45449c = null;

    /* JADX INFO: renamed from: com.ironsource.t2$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45450a;

        a(AdInfo adInfo) {
            this.f45450a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45448b;
            if (da2 != null) {
                da2.g(c4544t2.a(this.f45450a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4544t2.this.a(this.f45450a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45452a;

        b(AdInfo adInfo) {
            this.f45452a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45449c;
            if (da2 != null) {
                da2.d(c4544t2.a(this.f45452a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4544t2.this.a(this.f45452a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45454a;

        c(AdInfo adInfo) {
            this.f45454a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45448b;
            if (da2 != null) {
                da2.d(c4544t2.a(this.f45454a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4544t2.this.a(this.f45454a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45456a;

        d(AdInfo adInfo) {
            this.f45456a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45449c;
            if (da2 != null) {
                da2.e(c4544t2.a(this.f45456a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4544t2.this.a(this.f45456a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45458a;

        e(AdInfo adInfo) {
            this.f45458a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45448b;
            if (da2 != null) {
                da2.e(c4544t2.a(this.f45458a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4544t2.this.a(this.f45458a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f45460a;

        f(IronSourceError ironSourceError) {
            this.f45460a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Da da2 = C4544t2.this.f45449c;
            if (da2 != null) {
                da2.b(this.f45460a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f45460a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f45462a;

        g(IronSourceError ironSourceError) {
            this.f45462a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Da da2 = C4544t2.this.f45448b;
            if (da2 != null) {
                da2.b(this.f45462a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f45462a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45464a;

        h(AdInfo adInfo) {
            this.f45464a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45449c;
            if (da2 != null) {
                da2.h(c4544t2.a(this.f45464a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4544t2.this.a(this.f45464a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45466a;

        i(AdInfo adInfo) {
            this.f45466a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45448b;
            if (da2 != null) {
                da2.h(c4544t2.a(this.f45466a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4544t2.this.a(this.f45466a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45468a;

        j(AdInfo adInfo) {
            this.f45468a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45449c;
            if (da2 != null) {
                da2.f(c4544t2.a(this.f45468a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4544t2.this.a(this.f45468a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45470a;

        k(AdInfo adInfo) {
            this.f45470a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45448b;
            if (da2 != null) {
                da2.f(c4544t2.a(this.f45470a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4544t2.this.a(this.f45470a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t2$l */
    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f45472a;

        l(AdInfo adInfo) {
            this.f45472a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4544t2 c4544t2 = C4544t2.this;
            Da da2 = c4544t2.f45449c;
            if (da2 != null) {
                da2.g(c4544t2.a(this.f45472a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4544t2.this.a(this.f45472a));
            }
        }
    }

    private C4544t2() {
    }

    public static C4544t2 a() {
        return f45447d;
    }

    public void d(AdInfo adInfo) {
        if (this.f45449c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f45448b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f45449c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f45448b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f45449c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f45448b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(Da da2) {
        this.f45448b = da2;
    }

    public void b(Da da2) {
        this.f45449c = da2;
    }

    public void c(AdInfo adInfo) {
        if (this.f45449c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f45448b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f45449c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f45448b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public Da b() {
        return this.f45448b;
    }

    public void b(AdInfo adInfo) {
        if (this.f45449c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f45448b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
