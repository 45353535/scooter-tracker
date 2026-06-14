package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23293a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f23300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f23301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Surface f23302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceHolder f23303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23304l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f23306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f23307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f23308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f23309q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.enums.b f23294b = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23295c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23296d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23297e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23298f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23299g = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23305m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23310r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23311s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23312t = 0;

    public p(Context context, n nVar, Handler handler) {
        this.f23293a = context;
        this.f23301i = nVar;
        this.f23300h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f23306n = handlerThread;
        handlerThread.start();
        this.f23307o = new Handler(this.f23306n.getLooper());
        this.f23309q = new b(this);
    }

    public static void b(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.e(strB + "timelog: release took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void c(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f23294b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            super.start();
            pVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            IAlog.a("%s Start called in wrong mState! %s", pVar.b(), bVar);
            if (pVar.f23294b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                pVar.f23295c = true;
            }
        }
        IAlog.e(strB + "timelog: start took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final boolean a() {
        return (this.f23294b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.f23294b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public final void d() {
        this.f23296d = true;
        if (a()) {
            a(new l(this));
        } else {
            IAlog.a("%s mute called when player is not ready!", b());
        }
        IAlog.a("%s mute", b());
    }

    public final void e() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f23294b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            IAlog.a("%s reset called, but player is already resetted. Do nothing", b());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.e(strB + "timelog: reset took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f23310r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f23312t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f23311s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return a() && this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.f("%s onError code = %d code2 = %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        e();
        this.f23300h.post(new a(this, i10, i11));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("%s onPrepared %s gotPrepared = %s", b(), this, Boolean.valueOf(this.f23299g));
        IAlog.a("%sMedia prepare time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f23304l));
        if (this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.f("%s onPrepared: previous error encountered. Aborting", b());
        } else if (this.f23299g) {
            IAlog.a("%s onPrepared called again??? We are already prepared", b());
        } else {
            this.f23299g = true;
            c();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.a("%s onSeekComplete called current position = %d", b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.a("%s onSeekComplete called when Story is not seeking", b());
            return;
        }
        if (this.f23296d) {
            d();
        }
        if (!this.f23295c) {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = false", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        } else {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = true", b());
            this.f23294b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("%s onVideoSizeChanged %d, %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        if (this.f23298f) {
            return;
        }
        c cVar = this.f23308p;
        if (cVar != null) {
            r.f23896b.removeCallbacks(cVar);
            IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", b());
        }
        this.f23298f = true;
        if (i10 == 0 || i11 == 0) {
            IAlog.f("%s onVideoSizeChanged - Invalid video size!", b());
            onError(this, 0, 0);
        } else {
            IAlog.a("%sMedia got video size time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f23304l));
            this.f23311s = i10;
            this.f23312t = i11;
            c();
        }
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f23294b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.f23294b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (a()) {
                    a(new k(this));
                } else {
                    IAlog.a("%s paused called when player is not ready!", b());
                }
                IAlog.a("%s pause", b());
                return;
            }
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", b(), this.f23294b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f23297e) {
            a(new g(this));
        }
        this.f23301i = null;
        this.f23309q = null;
        this.f23297e = true;
        IAlog.a("%s release called", b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.a("%s reset called", b());
        c cVar = this.f23308p;
        if (cVar != null) {
            r.f23896b.removeCallbacks(cVar);
        }
        a(new h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.a("%s setDisplay called", b());
        if (!a()) {
            IAlog.a("%s setDisplay called when player is not ready!", b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f23303k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.a("%s setDisplay called with existing surface. ignoring!", b());
        } else {
            this.f23303k = surfaceHolder;
            a(new e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.a("%s setSurface called", b());
        Surface surface2 = this.f23302j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.a("%s setSurface called with existing surface. ignoring!", b());
        } else {
            this.f23302j = surface;
            a(new f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.a("%s Start called", b());
        if (!a()) {
            IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", b(), this.f23294b);
            return;
        }
        if (this.f23294b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.f23295c = true;
        } else if (isPlaying()) {
            IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", b());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a()) {
            super.stop();
        }
        IAlog.a("%s stop called", b());
        IAlog.e(strB + "timelog: " + AtomManager.ATOM_STOP_METHOD_NAME + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final void a(String str) {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f23298f = false;
        this.f23299g = false;
        if (isPlaying()) {
            IAlog.a("%s loadUri stopping play before refresh", b());
            stop();
        }
        this.f23304l = System.currentTimeMillis();
        e();
        IAlog.a("%s calling setDataSource with %s", b(), str);
        try {
            setDataSource(str);
            IAlog.a("%s setDataSource succeeded, calling prepareAsync", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e10) {
                IAlog.b("%s prepareAsync failed with illegal mState exception: %s", b(), e10.getMessage());
                this.f23305m++;
                if (this.f23305m < 5) {
                    a(str);
                }
                this.f23305m = 0;
            }
            IAlog.e(strB + "timelog: loadUri took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e11) {
            IAlog.b("%s error setting data source %s", b(), str);
            IAlog.b("%s exception message: %s", b(), e11.getMessage());
        }
    }

    public static void d(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.a("%s paused called cannot set to pause, canceled", pVar.b());
        }
        IAlog.e(strB + "timelog: delayed pause took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final String b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + TokenBuilder.TOKEN_DELIMITER + Thread.currentThread().getName() + ": ";
    }

    public final void c() {
        if (this.f23299g) {
            if (this.f23298f) {
                IAlog.a("%sMedia load time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f23304l));
                this.f23310r = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.f23296d) {
                    d();
                    return;
                }
                return;
            }
            IAlog.a("%sGot prepared only, waiting for video size", b());
            if (this.f23308p == null) {
                this.f23308p = new c(this);
            }
            r.f23896b.postDelayed(this.f23308p, 2000L);
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%s updatePlayerState - %s", b(), bVar);
        if (this.f23294b == bVar) {
            IAlog.a("%s updatePlayerState - mState didn't change!", b());
            return;
        }
        IAlog.a("%s updatePlayerState - changing from %s to %s", b(), this.f23294b, bVar);
        this.f23294b = bVar;
        this.f23300h.post(new d(this, bVar));
    }

    public static void a(p pVar, Surface surface) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setSurface called with %s", pVar.b(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.a("%s setSurface with null! current surface cleared", pVar.b());
            } else {
                IAlog.a("%s setSurface - replacing surface!", pVar.b());
            }
            IAlog.e(strB + "timelog: setSurface took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setSurface threw exception!", pVar.b());
        }
    }

    public static void a(p pVar, SurfaceHolder surfaceHolder) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setDisplay called with %s", pVar.b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.a("%s setDisplay with null! current display cleared", pVar.b());
            } else {
                IAlog.a("%s setDisplay - replacing surface holder!", pVar.b());
            }
            IAlog.e(strB + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setDisplay threw exception!", pVar.b());
        }
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f23306n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f23306n.isInterrupted() && (handler2 = this.f23307o) != null) {
            handler2.post(runnable);
        }
        if ((this.f23311s == 0 || this.f23312t == 0 || this.f23310r == 0) && (handler = this.f23307o) != null) {
            handler.post(this.f23309q);
        }
    }

    public static void a(p pVar) {
        if (pVar.a()) {
            pVar.f23311s = super.getVideoWidth();
            pVar.f23312t = super.getVideoHeight();
            pVar.f23310r = super.getDuration();
        }
    }
}
