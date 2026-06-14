package com.my.target;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.my.target.y;

/* JADX INFO: loaded from: classes11.dex */
public class r1 implements y, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f60698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f60699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f60700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y.a f60701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f60702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f60704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f60706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f60707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f60708k;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r1 f60710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y.a f60711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f60713e;

        public a(int i10) {
            this.f60709a = i10;
        }

        public void a(y.a aVar) {
            this.f60711c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60710b == null) {
                return;
            }
            float fI = r0.i() / 1000.0f;
            float duration = this.f60710b.getDuration();
            if (this.f60713e == fI) {
                this.f60712d++;
            } else {
                y.a aVar = this.f60711c;
                if (aVar != null) {
                    aVar.a(fI, duration);
                }
                this.f60713e = fI;
                if (this.f60712d > 0) {
                    this.f60712d = 0;
                }
            }
            if (this.f60712d > this.f60709a) {
                y.a aVar2 = this.f60711c;
                if (aVar2 != null) {
                    aVar2.n();
                }
                this.f60712d = 0;
            }
        }

        public void a(r1 r1Var) {
            this.f60710b = r1Var;
        }
    }

    public r1(MediaPlayer mediaPlayer, a aVar) {
        this.f60698a = u9.a(200);
        this.f60703f = 0;
        this.f60704g = 1.0f;
        this.f60706i = 0L;
        this.f60700c = mediaPlayer;
        this.f60699b = aVar;
        aVar.a(this);
    }

    public static y j() {
        return new r1();
    }

    @Override // com.my.target.y
    public void a(y.a aVar) {
        this.f60701d = aVar;
        this.f60699b.a(aVar);
    }

    @Override // com.my.target.y
    public boolean b() {
        return this.f60703f == 2;
    }

    @Override // com.my.target.y
    public void c() {
        setVolume(0.2f);
    }

    @Override // com.my.target.y
    public void d() {
        setVolume(0.0f);
    }

    @Override // com.my.target.y
    public void destroy() {
        this.f60701d = null;
        this.f60703f = 5;
        this.f60698a.b(this.f60699b);
        k();
        if (l()) {
            try {
                this.f60700c.stop();
            } catch (Throwable th2) {
                gb.a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th2.getMessage());
            }
        }
        try {
            this.f60700c.release();
        } catch (Throwable th3) {
            gb.a("DefaultVideoPlayer: Media player's release method called in wrong state, " + th3.getMessage());
        }
        this.f60707j = null;
    }

    @Override // com.my.target.y
    public boolean e() {
        int i10 = this.f60703f;
        return i10 >= 1 && i10 < 3;
    }

    @Override // com.my.target.y
    public void f() {
        try {
            this.f60700c.start();
            this.f60703f = 1;
        } catch (Throwable th2) {
            gb.a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th2.getMessage());
        }
        seekTo(0L);
    }

    @Override // com.my.target.y
    public boolean g() {
        return this.f60704g == 0.0f;
    }

    @Override // com.my.target.y
    public float getDuration() {
        if (!l()) {
            return 0.0f;
        }
        try {
            return this.f60700c.getDuration() / 1000.0f;
        } catch (Throwable th2) {
            gb.a("DefaultVideoPlayer: Media player's get duration method called in wrong state, " + th2.getMessage());
            return 0.0f;
        }
    }

    @Override // com.my.target.y
    public Uri getUri() {
        return this.f60708k;
    }

    @Override // com.my.target.y
    public void h() {
        setVolume(1.0f);
    }

    @Override // com.my.target.y
    public long i() {
        if (!l() || this.f60703f == 3) {
            return 0L;
        }
        try {
            return this.f60700c.getCurrentPosition();
        } catch (Throwable th2) {
            gb.a("DefaultVideoPlayer: media player's get current position method called in wrong state, " + th2.getMessage());
            return 0L;
        }
    }

    @Override // com.my.target.y
    public boolean isPlaying() {
        return this.f60703f == 1;
    }

    public final void k() {
        z zVar = this.f60707j;
        TextureView textureView = zVar != null ? zVar.getTextureView() : null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this) {
                Log.w("DefaultVideoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                textureView.setSurfaceTextureListener(null);
            }
        }
    }

    public final boolean l() {
        int i10 = this.f60703f;
        return i10 >= 1 && i10 <= 4;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        y.a aVar;
        float duration = getDuration();
        this.f60703f = 4;
        if (duration > 0.0f && (aVar = this.f60701d) != null) {
            aVar.a(duration, duration);
        }
        y.a aVar2 = this.f60701d;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        this.f60698a.b(this.f60699b);
        k();
        a((Surface) null);
        String str = (i10 == 100 ? "Server died" : "Unknown error") + " (reason: " + (i11 == -1004 ? "IO error" : i11 == -1007 ? "Malformed error" : i11 == -1010 ? "Unsupported error" : i11 == -110 ? "Timed out error" : i11 == Integer.MIN_VALUE ? "Low-level system error" : "Unknown") + ")";
        gb.a("DefaultVideoPlayer: Video error - " + str);
        y.a aVar = this.f60701d;
        if (aVar != null) {
            aVar.a(str);
        }
        if (this.f60703f > 0) {
            try {
                this.f60700c.reset();
            } catch (Throwable th2) {
                gb.a("DefaultVideoPlayer: Media player's reset method called in wrong state, " + th2.getMessage());
            }
        }
        this.f60703f = 0;
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 != 3) {
            return false;
        }
        y.a aVar = this.f60701d;
        if (aVar == null) {
            return true;
        }
        aVar.p();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            float f10 = this.f60704g;
            mediaPlayer.setVolume(f10, f10);
            this.f60703f = 1;
            mediaPlayer.start();
            long j10 = this.f60706i;
            if (j10 > 0) {
                seekTo(j10);
            }
        } catch (Throwable th2) {
            gb.a("DefaultVideoPlayer: Media player's start method called in wrong state, " + th2.getMessage());
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        a(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a((Surface) null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.my.target.y
    public void pause() {
        if (this.f60703f == 1) {
            this.f60698a.b(this.f60699b);
            try {
                this.f60705h = this.f60700c.getCurrentPosition();
                this.f60700c.pause();
            } catch (Throwable th2) {
                gb.a("DefaultVideoPlayer: Media player's pause or get current position method called in wrong state, " + th2.getMessage());
            }
            this.f60703f = 2;
            y.a aVar = this.f60701d;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    @Override // com.my.target.y
    public void resume() {
        if (this.f60703f == 2) {
            this.f60698a.a(this.f60699b);
            try {
                this.f60700c.start();
            } catch (Throwable unused) {
                gb.a("DefaultVideoPlayer: Media player's start method called in wrong state");
            }
            int i10 = this.f60705h;
            if (i10 > 0) {
                try {
                    this.f60700c.seekTo(i10);
                } catch (Throwable unused2) {
                    gb.a("DefaultVideoPlayer: Media player's seek to method called in wrong state");
                }
                this.f60705h = 0;
            }
            this.f60703f = 1;
            y.a aVar = this.f60701d;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // com.my.target.y
    public void seekTo(long j10) {
        this.f60706i = j10;
        if (l()) {
            try {
                this.f60700c.seekTo((int) j10);
                this.f60706i = 0L;
            } catch (Throwable th2) {
                gb.a("DefaultVideoPlayer: media player's seek to method called in wrong state, " + th2.getMessage());
            }
        }
    }

    @Override // com.my.target.y
    public void setVolume(float f10) {
        this.f60704g = f10;
        if (l()) {
            try {
                this.f60700c.setVolume(f10, f10);
            } catch (Throwable th2) {
                gb.a("DefaultVideoPlayer: Media player's set volume method called in wrong state, " + th2.getMessage());
            }
        }
        y.a aVar = this.f60701d;
        if (aVar != null) {
            aVar.a(f10);
        }
    }

    @Override // com.my.target.y
    public void stop() {
        this.f60698a.b(this.f60699b);
        try {
            this.f60700c.stop();
        } catch (Throwable th2) {
            gb.a("DefaultVideoPlayer: Media player's stop method called in wrong state, " + th2.getMessage());
        }
        y.a aVar = this.f60701d;
        if (aVar != null) {
            aVar.l();
        }
        this.f60703f = 3;
    }

    @Override // com.my.target.y
    public void a(z zVar) {
        k();
        if (!androidx.activity.s.a(zVar)) {
            this.f60707j = null;
            a((Surface) null);
            return;
        }
        this.f60707j = zVar;
        TextureView textureView = zVar.getTextureView();
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("DefaultVideoPlayer", "Replacing existing SurfaceTextureListener");
        }
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        a(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }

    public r1() {
        this(new MediaPlayer(), new a(50));
    }

    @Override // com.my.target.y
    public void a(Uri uri, z zVar) {
        a(zVar);
        a(uri, zVar.getContext());
    }

    @Override // com.my.target.y
    public void a(Uri uri, Context context) {
        this.f60708k = uri;
        gb.a("DefaultVideoPlayer: Play video in Android MediaPlayer - " + uri);
        if (this.f60703f != 0) {
            try {
                this.f60700c.reset();
            } catch (Throwable unused) {
                gb.a("DefaultVideoPlayer: Media player's reset method called in wrong state");
            }
            this.f60703f = 0;
        }
        this.f60700c.setOnCompletionListener(this);
        this.f60700c.setOnErrorListener(this);
        this.f60700c.setOnPreparedListener(this);
        this.f60700c.setOnInfoListener(this);
        try {
            this.f60700c.setDataSource(context, uri);
            y.a aVar = this.f60701d;
            if (aVar != null) {
                aVar.e();
            }
            try {
                this.f60700c.prepareAsync();
            } catch (Throwable th2) {
                gb.a("DefaultVideoPlayer: Media player's prepare async method called in wrong state, " + th2.getMessage());
            }
            this.f60698a.a(this.f60699b);
        } catch (Throwable th3) {
            if (this.f60701d != null) {
                this.f60701d.a("DefaultVideoPlayer data source error: " + th3.getMessage());
            }
            gb.a("DefaultVideoPlayer: Unable to parse video source, " + th3.getMessage());
            this.f60703f = 5;
            th3.printStackTrace();
        }
    }

    @Override // com.my.target.y
    public void a() {
        if (this.f60704g == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    public final void a(Surface surface) {
        try {
            this.f60700c.setSurface(surface);
        } catch (Throwable th2) {
            gb.a("DefaultVideoPlayer: Media player's set surface method called in wrong state, " + th2.getMessage());
        }
        Surface surface2 = this.f60702e;
        if (surface2 != null && surface2 != surface) {
            surface2.release();
        }
        this.f60702e = surface;
    }
}
