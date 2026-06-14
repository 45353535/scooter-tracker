package n9;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import j$.util.Objects;
import java.util.List;
import n9.n;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public interface a0 {

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f95167b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f95168c = o0.C0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f95169a;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f95170b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final n.b f95171a = new n.b();

            public a a(int i10) {
                this.f95171a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f95171a.b(bVar.f95169a);
                return this;
            }

            public a c(int... iArr) {
                this.f95171a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f95171a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f95171a.e());
            }
        }

        public boolean b(int i10) {
            return this.f95169a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f95169a.equals(((b) obj).f95169a);
            }
            return false;
        }

        public int hashCode() {
            return this.f95169a.hashCode();
        }

        private b(n nVar) {
            this.f95169a = nVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f95172a;

        public c(n nVar) {
            this.f95172a = nVar;
        }

        public boolean a(int... iArr) {
            return this.f95172a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f95172a.equals(((c) obj).f95172a);
            }
            return false;
        }

        public int hashCode() {
            return this.f95172a.hashCode();
        }
    }

    public interface d {
        void A(k kVar);

        void D(a0 a0Var, c cVar);

        void F(y yVar);

        void M(h0 h0Var);

        void a(n0 n0Var);

        void f(v vVar);

        void h(p9.b bVar);

        void j(z zVar);

        void m(t tVar);

        void n(b bVar);

        void onAudioSessionIdChanged(int i10);

        void onCues(List list);

        void onDeviceVolumeChanged(int i10, boolean z10);

        void onIsLoadingChanged(boolean z10);

        void onIsPlayingChanged(boolean z10);

        void onLoadingChanged(boolean z10);

        void onPlayWhenReadyChanged(boolean z10, int i10);

        void onPlaybackStateChanged(int i10);

        void onPlaybackSuppressionReasonChanged(int i10);

        void onPlayerStateChanged(boolean z10, int i10);

        void onPositionDiscontinuity(int i10);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i10);

        void onShuffleModeEnabledChanged(boolean z10);

        void onSkipSilenceEnabledChanged(boolean z10);

        void onSurfaceSizeChanged(int i10, int i11);

        void onVolumeChanged(float f10);

        void r(i0 i0Var);

        void t(r rVar, int i10);

        void u(e eVar, e eVar2, int i10);

        void x(e0 e0Var, int i10);

        void y(y yVar);
    }

    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f95173k = o0.C0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95174l = o0.C0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f95175m = o0.C0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f95176n = o0.C0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f95177o = o0.C0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f95178p = o0.C0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f95179q = o0.C0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f95180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f95183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f95184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f95185f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f95186g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f95187h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f95188i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f95189j;

        public e(Object obj, int i10, r rVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f95180a = obj;
            this.f95181b = i10;
            this.f95182c = i10;
            this.f95183d = rVar;
            this.f95184e = obj2;
            this.f95185f = i11;
            this.f95186g = j10;
            this.f95187h = j11;
            this.f95188i = i12;
            this.f95189j = i13;
        }

        public boolean a(e eVar) {
            return this.f95182c == eVar.f95182c && this.f95185f == eVar.f95185f && this.f95186g == eVar.f95186g && this.f95187h == eVar.f95187h && this.f95188i == eVar.f95188i && this.f95189j == eVar.f95189j && Objects.equals(this.f95183d, eVar.f95183d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f95180a, eVar.f95180a) && Objects.equals(this.f95184e, eVar.f95184e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f95180a, Integer.valueOf(this.f95182c), this.f95183d, this.f95184e, Integer.valueOf(this.f95185f), Long.valueOf(this.f95186g), Long.valueOf(this.f95187h), Integer.valueOf(this.f95188i), Integer.valueOf(this.f95189j));
        }
    }

    void b(z zVar);

    void c(d dVar);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void d(d dVar);

    void e(h0 h0Var);

    void f(r rVar);

    Looper getApplicationLooper();

    b getAvailableCommands();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    p9.b getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    e0 getCurrentTimeline();

    i0 getCurrentTracks();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    t getMediaMetadata();

    boolean getPlayWhenReady();

    z getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    y getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    h0 getTrackSelectionParameters();

    n0 getVideoSize();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCommandAvailable(int i10);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void pause();

    void play();

    void prepare();

    void seekBack();

    void seekForward();

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToDefaultPosition();

    void seekToNext();

    void seekToPrevious();

    void setMediaItems(List list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();
}
