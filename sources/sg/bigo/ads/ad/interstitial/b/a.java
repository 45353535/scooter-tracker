package sg.bigo.ads.ad.interstitial.b;

import androidx.annotation.CallSuper;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.ad.b.b f100678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f100679b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f100683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1224a f100684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f100685h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f100681d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f100682e = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f100686i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100680c = 1;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC1224a {
        void a(boolean z10, boolean z11);

        void ax();

        void ay();

        void b(long j10);
    }

    static class b implements VideoController.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoController.d f100690a;

        private b(VideoController.d dVar) {
            this.f100690a = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController.d
        @CallSuper
        public void a(int i10, int i11) {
            VideoController.d dVar = this.f100690a;
            if (dVar != null) {
                dVar.a(i10, i11);
            }
        }

        /* synthetic */ b(VideoController.d dVar, byte b10) {
            this(dVar);
        }
    }

    static class c implements VideoController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoController.b f100691a;

        private c(VideoController.b bVar) {
            this.f100691a = bVar;
        }

        @Override // sg.bigo.ads.api.VideoController.b
        @CallSuper
        public final void a() {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.b
        @CallSuper
        public final void b() {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onMuteChange(boolean z10) {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.onMuteChange(z10);
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoEnd() {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.onVideoEnd();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoPause() {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.onVideoPause();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoPlay() {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.onVideoPlay();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoStart() {
            VideoController.b bVar = this.f100691a;
            if (bVar != null) {
                bVar.onVideoStart();
            }
        }

        /* synthetic */ c(VideoController.b bVar, byte b10) {
            this(bVar);
        }
    }

    private void b() {
        InterfaceC1224a interfaceC1224a = this.f100684g;
        if (interfaceC1224a != null) {
            interfaceC1224a.a(a(), this.f100681d);
        }
    }

    public final void a(long j10) {
        this.f100685h = j10;
        this.f100680c = 2;
    }

    static /* synthetic */ void a(a aVar) {
        if (!aVar.a()) {
            if (aVar.f100681d) {
                aVar.b();
                return;
            }
            sg.bigo.ads.common.t.a.a(0, "CountdownHelper", "invalid status, isCountdownIgnoreVideoProgress=" + aVar.a() + ", mVideoEnd=" + aVar.f100681d);
            return;
        }
        if (aVar.f100682e) {
            aVar.b();
            return;
        }
        sg.bigo.ads.ad.b.b bVar = aVar.f100678a;
        VideoController videoController = bVar != null ? bVar.getVideoController() : null;
        if (videoController == null || videoController.isPlaying()) {
            return;
        }
        videoController.play();
    }

    public final void b(boolean z10) {
        if (z10 && !a()) {
            InterfaceC1224a interfaceC1224a = this.f100684g;
            if (interfaceC1224a != null) {
                interfaceC1224a.ay();
                return;
            }
            return;
        }
        if (z10 || !a()) {
            return;
        }
        n nVar = this.f100683f;
        if (nVar != null) {
            nVar.d();
        }
        InterfaceC1224a interfaceC1224a2 = this.f100684g;
        if (interfaceC1224a2 != null) {
            interfaceC1224a2.ay();
        }
    }

    public final void a(boolean z10) {
        if (z10 && !a()) {
            InterfaceC1224a interfaceC1224a = this.f100684g;
            if (interfaceC1224a != null) {
                interfaceC1224a.ax();
                return;
            }
            return;
        }
        if (z10 || !a()) {
            return;
        }
        n nVar = this.f100683f;
        if (nVar != null && nVar.e()) {
            this.f100683f.c();
        }
        InterfaceC1224a interfaceC1224a2 = this.f100684g;
        if (interfaceC1224a2 != null) {
            interfaceC1224a2.ax();
        }
    }

    public final boolean a() {
        return this.f100680c == 2;
    }
}
