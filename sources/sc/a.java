package sc;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import id.a0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a extends qc.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f99922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaPlayer f99923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final sc.b f99924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f99925p = 1.0f;

    /* JADX INFO: renamed from: sc.a$a, reason: collision with other inner class name */
    protected class C1193a implements sc.c {
        protected C1193a() {
        }

        @Override // sc.c
        public void a() {
            if (a.this.i()) {
                a.this.I(new a0("Surface Destroyed"));
            }
        }
    }

    protected class b implements MediaPlayer.OnCompletionListener {
        protected b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            a.this.q();
        }
    }

    protected class c implements MediaPlayer.OnErrorListener {
        protected c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            a.this.z(new a0("MediaPlayer - onError (what - " + i10 + ", extra - " + i11 + ")"));
            return true;
        }
    }

    protected class d implements MediaPlayer.OnPreparedListener {
        protected d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(1);
            a.this.g0();
        }
    }

    protected class e implements MediaPlayer.OnSeekCompleteListener {
        protected e() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            a aVar = a.this;
            aVar.J(aVar.c0());
        }
    }

    public a(Context context) {
        this.f99922m = context.getApplicationContext();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f99923n = mediaPlayer;
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer.setOnPreparedListener(new d());
        mediaPlayer.setOnErrorListener(new c());
        mediaPlayer.setOnSeekCompleteListener(new e());
        mediaPlayer.setOnCompletionListener(new b());
        sc.b bVar = new sc.b(context);
        this.f99924o = bVar;
        bVar.setListener(new C1193a());
        bVar.setMediaPlayer(mediaPlayer);
    }

    @Override // qc.a
    protected long E() {
        return this.f99923n.getCurrentPosition();
    }

    @Override // qc.a
    protected void H(Uri uri) throws IOException {
        this.f99923n.reset();
        this.f99923n.setDataSource(this.f99922m, uri);
    }

    @Override // qc.a
    protected long L() {
        return this.f99923n.getDuration();
    }

    @Override // qc.a
    protected void M(float f10) {
        this.f99925p = f10;
        super.M(f10);
        F(f10);
    }

    @Override // qc.a
    public float R() {
        return this.f99925p;
    }

    @Override // qc.a
    protected boolean V() {
        return this.f99923n.isPlaying();
    }

    @Override // qc.a
    protected boolean W() {
        return false;
    }

    @Override // qc.a
    protected void X() {
        this.f99923n.pause();
    }

    @Override // qc.a
    protected void Y() {
        this.f99923n.start();
    }

    @Override // qc.a
    protected void Z() {
        this.f99923n.prepareAsync();
    }

    @Override // qc.a, qc.b
    public void a() {
        super.a();
        this.f99924o.c();
        this.f99923n.reset();
        this.f99923n.release();
    }

    @Override // qc.a
    protected void a0() {
        this.f99923n.stop();
    }

    @Override // qc.a
    protected void c() {
        super.c();
        f0();
    }

    @Override // qc.a
    protected void m0() {
        super.m0();
        e0();
    }

    @Override // qc.b
    public View n() {
        return this.f99924o;
    }

    @Override // qc.a
    protected void x(float f10) {
        this.f99923n.setVolume(f10, f10);
    }

    @Override // qc.a
    protected void y(long j10) {
        this.f99923n.seekTo((int) j10);
    }
}
