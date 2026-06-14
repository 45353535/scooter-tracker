package m9;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Df;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements a9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f94486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AdSession f94487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdEvents f94488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MediaEvents f94489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f94490g;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.resume();
                    b.this.n("onMediaResumed");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    /* JADX INFO: renamed from: m9.b$b, reason: collision with other inner class name */
    class RunnableC1085b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f94492b;

        RunnableC1085b(float f10) {
            this.f94492b = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.volumeChange(this.f94492b);
                    b.this.n("onMediaVolumeChanged");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.skipped();
                    b.this.n("onMediaSkipped");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.f94489f = null;
                b.this.f94488e = null;
                if (b.this.f94487d != null) {
                    b.this.f94487d.finish();
                }
                b.this.n("destroy");
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ErrorType f94496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94497c;

        e(ErrorType errorType, String str) {
            this.f94496b = errorType;
            this.f94497c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94487d != null) {
                    b.this.f94487d.error(this.f94496b, this.f94497c);
                    b.this.n("error");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f94499b;

        f(ViewGroup viewGroup) {
            this.f94499b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94487d != null) {
                    b bVar = b.this;
                    bVar.r(bVar.f94487d, this.f94499b);
                } else {
                    b.this.f94490g = new WeakReference(this.f94499b);
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94488e != null) {
                    b.this.f94488e.impressionOccurred();
                    b.this.n("onAdShown");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.adUserInteraction(InteractionType.CLICK);
                    b.this.n(Df.f40645f);
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f94503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f94504c;

        i(float f10, float f11) {
            this.f94503b = f10;
            this.f94504c = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.start(this.f94503b / 1000.0f, this.f94504c);
                    b.this.n("onMediaStarted");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.firstQuartile();
                    b.this.n("onMediaFirstQuartile");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.midpoint();
                    b.this.n("onMediaMidpoint");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.thirdQuartile();
                    b.this.n("onMediaThirdQuartile");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.complete();
                    b.this.n("onMediaCompleted");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f94489f != null) {
                    b.this.f94489f.pause();
                    b.this.n("onMediaPaused");
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    public b() {
        this(false);
    }

    private void k(ErrorType errorType, String str) {
        io.bidmachine.core.h.U(new e(errorType, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(AdSession adSession, View view) {
        adSession.registerAdView(view);
        n("registerAdView");
    }

    private void s(AdSession adSession) {
        WeakReference weakReference = this.f94490g;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            r(adSession, view);
        }
        this.f94490g = null;
    }

    @Override // a9.a
    public void e(ViewGroup viewGroup) {
        io.bidmachine.core.h.U(new f(viewGroup));
    }

    public void j() {
        io.bidmachine.core.h.U(new d());
    }

    public void l(String str) {
        k(ErrorType.GENERIC, str);
    }

    protected boolean m() {
        return this.f94487d != null;
    }

    protected void n(String str) {
        io.bidmachine.core.a.c("AdMeasurer", str);
    }

    protected abstract void o(AdEvents adEvents);

    @Override // a9.a
    public void onAdClicked() {
        io.bidmachine.core.h.U(new h());
    }

    @Override // a9.a
    public void onAdShown() {
        if (this.f94485b) {
            return;
        }
        t();
    }

    public void onMediaCompleted() {
        io.bidmachine.core.h.U(new m());
    }

    public void onMediaFirstQuartile() {
        io.bidmachine.core.h.U(new j());
    }

    public void onMediaMidpoint() {
        io.bidmachine.core.h.U(new k());
    }

    public void onMediaPaused() {
        io.bidmachine.core.h.U(new n());
    }

    public void onMediaResumed() {
        io.bidmachine.core.h.U(new a());
    }

    public void onMediaSkipped() {
        io.bidmachine.core.h.U(new c());
    }

    public void onMediaStarted(float f10, float f11) {
        io.bidmachine.core.h.U(new i(f10, f11));
    }

    public void onMediaThirdQuartile() {
        io.bidmachine.core.h.U(new l());
    }

    public void onMediaVolumeChanged(float f10) {
        io.bidmachine.core.h.U(new RunnableC1085b(f10));
    }

    protected void q(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.f94487d = adSessionCreateAdSession;
            this.f94488e = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.f94489f = MediaEvents.createMediaEvents(this.f94487d);
            }
            s(this.f94487d);
            this.f94487d.start();
            o(this.f94488e);
            n("prepareAdSession");
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    public void t() {
        if (this.f94486c.compareAndSet(false, true)) {
            io.bidmachine.core.h.U(new g());
        }
    }

    @Override // a9.a
    public void y(y8.b bVar) {
        l(bVar.d());
    }

    public b(boolean z10) {
        this.f94485b = z10;
        this.f94486c = new AtomicBoolean(false);
    }

    @Override // a9.a
    public void f(View view) {
    }

    @Override // a9.a
    public void w(View view) {
    }
}
