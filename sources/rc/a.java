package rc;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.ui.x;
import java.util.List;
import n9.a0;
import n9.b0;
import n9.e0;
import n9.h0;
import n9.i0;
import n9.k;
import n9.n0;
import n9.r;
import n9.t;
import n9.v;
import n9.y;
import n9.z;
import p9.b;

/* JADX INFO: loaded from: classes3.dex */
public class a extends qc.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ExoPlayer f99416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x f99417n;

    /* JADX INFO: renamed from: rc.a$a, reason: collision with other inner class name */
    protected class C1183a implements a0.d {
        protected C1183a() {
        }

        @Override // n9.a0.d
        public /* synthetic */ void A(k kVar) {
            b0.e(this, kVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void D(a0 a0Var, a0.c cVar) {
            b0.g(this, a0Var, cVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void F(y yVar) {
            b0.s(this, yVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void M(h0 h0Var) {
            b0.C(this, h0Var);
        }

        @Override // n9.a0.d
        public /* synthetic */ void a(n0 n0Var) {
            b0.E(this, n0Var);
        }

        @Override // n9.a0.d
        public /* synthetic */ void f(v vVar) {
            b0.m(this, vVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void h(b bVar) {
            b0.d(this, bVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void j(z zVar) {
            b0.o(this, zVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void m(t tVar) {
            b0.l(this, tVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void n(a0.b bVar) {
            b0.b(this, bVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onAudioSessionIdChanged(int i10) {
            b0.a(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onCues(List list) {
            b0.c(this, list);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            b0.f(this, i10, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            b0.h(this, z10);
        }

        @Override // n9.a0.d
        public void onIsPlayingChanged(boolean z10) {
            if (z10) {
                a.this.f0();
            } else {
                a.this.e0();
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            b0.j(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            b0.n(this, z10, i10);
        }

        @Override // n9.a0.d
        public void onPlaybackStateChanged(int i10) {
            if (i10 == 3) {
                a.this.g0();
            } else if (i10 == 4) {
                a.this.q();
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            b0.q(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            b0.t(this, z10, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            b0.u(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onRenderedFirstFrame() {
            b0.w(this);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            b0.x(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            b0.y(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            b0.z(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            b0.A(this, i10, i11);
        }

        @Override // n9.a0.d
        public void onVolumeChanged(float f10) {
            a.this.F(f10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void r(i0 i0Var) {
            b0.D(this, i0Var);
        }

        @Override // n9.a0.d
        public /* synthetic */ void t(r rVar, int i10) {
            b0.k(this, rVar, i10);
        }

        @Override // n9.a0.d
        public void u(a0.e eVar, a0.e eVar2, int i10) {
            a.this.J(Long.valueOf(eVar2.f95186g));
        }

        @Override // n9.a0.d
        public /* synthetic */ void x(e0 e0Var, int i10) {
            b0.B(this, e0Var, i10);
        }

        @Override // n9.a0.d
        public void y(y yVar) {
            a.this.B(yVar);
        }
    }

    public a(Context context) {
        ExoPlayer exoPlayerE = new ExoPlayer.b(context).e();
        this.f99416m = exoPlayerE;
        exoPlayerE.c(new C1183a());
        x xVar = new x(context);
        this.f99417n = xVar;
        xVar.setPlayer(exoPlayerE);
        xVar.setUseController(false);
    }

    @Override // qc.a
    protected long E() {
        return this.f99416m.getCurrentPosition();
    }

    @Override // qc.a
    protected void H(Uri uri) {
        this.f99416m.f(new r.c().f(uri).a());
    }

    @Override // qc.a
    protected long L() {
        return this.f99416m.getDuration();
    }

    @Override // qc.a
    public float R() {
        return this.f99416m.getVolume();
    }

    @Override // qc.a
    protected boolean V() {
        return this.f99416m.isPlaying();
    }

    @Override // qc.a
    protected boolean W() {
        return false;
    }

    @Override // qc.a
    protected void X() {
        this.f99416m.pause();
    }

    @Override // qc.a
    protected void Y() {
        this.f99416m.play();
    }

    @Override // qc.a
    protected void Z() {
        this.f99416m.prepare();
    }

    @Override // qc.a, qc.b
    public void a() {
        super.a();
        this.f99416m.release();
        this.f99417n.setPlayer(null);
    }

    @Override // qc.a
    protected void a0() {
        this.f99416m.stop();
    }

    @Override // qc.b
    public View n() {
        return this.f99417n;
    }

    @Override // qc.a
    protected void x(float f10) {
        this.f99416m.setVolume(f10);
    }

    @Override // qc.a
    protected void y(long j10) {
        this.f99416m.seekTo(j10);
    }
}
