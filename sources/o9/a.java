package o9;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import j$.util.Objects;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f96367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f96368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n9.c f96369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f96370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f96371f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f96372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f96373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f96374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n9.c f96375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f96376e;

        public a a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f96373b;
            if (onAudioFocusChangeListener != null) {
                return new a(this.f96372a, onAudioFocusChangeListener, (Handler) q9.a.e(this.f96374c), this.f96375d, this.f96376e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(n9.c cVar) {
            q9.a.e(cVar);
            this.f96375d = cVar;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            q9.a.e(onAudioFocusChangeListener);
            q9.a.e(handler);
            this.f96373b = onAudioFocusChangeListener;
            this.f96374c = handler;
            return this;
        }

        public b d(boolean z10) {
            this.f96376e = z10;
            return this;
        }

        public b(int i10) {
            this.f96375d = n9.c.f95224g;
            this.f96372a = i10;
        }

        private b(a aVar) {
            this.f96372a = aVar.e();
            this.f96373b = aVar.f();
            this.f96374c = aVar.d();
            this.f96375d = aVar.b();
            this.f96376e = aVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f96377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f96378c;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f96378c = onAudioFocusChangeListener;
            this.f96377b = o0.z(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            o0.Z0(this.f96377b, new Runnable() { // from class: o9.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96379b.f96378c.onAudioFocusChange(i10);
                }
            });
        }
    }

    a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, n9.c cVar, boolean z10) {
        this.f96366a = i10;
        this.f96368c = handler;
        this.f96369d = cVar;
        this.f96370e = z10;
        int i11 = o0.f98837a;
        if (i11 < 26) {
            this.f96367b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f96367b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f96371f = androidx.media3.exoplayer.g.a(i10).setAudioAttributes(cVar.a().f95236a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f96371f = null;
        }
    }

    public b a() {
        return new b();
    }

    public n9.c b() {
        return this.f96369d;
    }

    AudioFocusRequest c() {
        return androidx.media.b.a(q9.a.e(this.f96371f));
    }

    public Handler d() {
        return this.f96368c;
    }

    public int e() {
        return this.f96366a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96366a == aVar.f96366a && this.f96370e == aVar.f96370e && Objects.equals(this.f96367b, aVar.f96367b) && Objects.equals(this.f96368c, aVar.f96368c) && Objects.equals(this.f96369d, aVar.f96369d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f96367b;
    }

    public boolean g() {
        return this.f96370e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f96366a), this.f96367b, this.f96368c, this.f96369d, Boolean.valueOf(this.f96370e));
    }
}
