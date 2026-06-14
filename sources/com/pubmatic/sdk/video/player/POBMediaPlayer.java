package com.pubmatic.sdk.video.player;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.player.POBPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class POBMediaPlayer implements POBPlayer, MediaPlayer.OnPreparedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBPlayer.POBPlayerListener f63005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaPlayer f63006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f63007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f63008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f63009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBTimeoutHandler f63010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBTimeoutHandler f63012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBTimeoutHandler f63014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f63015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f63016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f63017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63018n;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$a$a, reason: collision with other inner class name */
        class RunnableC0787a implements Runnable {
            RunnableC0787a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.f63005a != null) {
                    POBMediaPlayer.this.f63005a.onPause();
                }
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b != null) {
                POBMediaPlayer.this.f63006b.pause();
            }
            POBMediaPlayer.this.f63009e.post(new RunnableC0787a());
        }
    }

    class b implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.f63005a != null) {
                    POBMediaPlayer.this.f63005a.onStop();
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b != null) {
                POBMediaPlayer.this.f63006b.stop();
                POBMediaPlayer.this.f63009e.post(new a());
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f63023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f63024b;

        c(int i10, int i11) {
            this.f63023a = i10;
            this.f63024b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b != null) {
                POBMediaPlayer.this.f63006b.setVolume(this.f63023a, this.f63024b);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f63026a;

        d(Surface surface) {
            this.f63026a = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b == null || !this.f63026a.isValid()) {
                return;
            }
            try {
                POBMediaPlayer.this.f63006b.setSurface(this.f63026a);
            } catch (IllegalArgumentException e10) {
                POBLog.error("POBMediaPlayer", "Unable to set surface to media player. Reason - " + e10.getMessage(), new Object[0]);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b != null) {
                POBMediaPlayer.this.f63006b.setSurface(null);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.g();
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f63030a;

        g(int i10) {
            this.f63030a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63005a != null) {
                POBMediaPlayer.this.f63005a.onBufferUpdate(this.f63030a);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.h();
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63005a != null) {
                POBMediaPlayer.this.f63005a.onCompletion();
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63005a != null) {
                POBMediaPlayer.this.f63005a.onStart();
            }
        }
    }

    class k extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2) {
            super(str);
            this.f63035a = str2;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            POBMediaPlayer.this.f63007c = new Handler(getLooper());
            POBMediaPlayer.this.a(this.f63035a);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.c();
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.f();
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.g();
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63005a != null) {
                POBMediaPlayer.this.f63005a.onPrepared();
            }
        }
    }

    class p implements POBTimeoutHandler.POBTimeoutHandlerListener {
        p() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBMediaPlayer.this.f63005a != null) {
                POBMediaPlayer.this.f63005a.onFailure(-1, "MEDIA_FILE_TIMEOUT_ERROR");
            }
            POBMediaPlayer.this.b();
        }
    }

    class q implements POBTimeoutHandler.POBTimeoutHandlerListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.f63005a != null) {
                    POBMediaPlayer.this.f63005a.onFailure(-108, "MEDIA_DISPLAY_ERROR");
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.f63006b != null) {
                    POBMediaPlayer.this.f63006b.stop();
                }
            }
        }

        q() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBMediaPlayer.this.f63009e.post(new a());
            POBMediaPlayer.this.a(new b());
        }
    }

    class r implements POBTimeoutHandler.POBTimeoutHandlerListener {

        class a implements Runnable {

            /* JADX INFO: renamed from: com.pubmatic.sdk.video.player.POBMediaPlayer$r$a$a, reason: collision with other inner class name */
            class RunnableC0788a implements Runnable {
                RunnableC0788a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (POBMediaPlayer.this.f63005a != null) {
                        POBMediaPlayer.this.f63005a.onProgressUpdate(POBMediaPlayer.this.f63011g);
                    }
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.f63006b != null) {
                    POBMediaPlayer pOBMediaPlayer = POBMediaPlayer.this;
                    pOBMediaPlayer.f63011g = pOBMediaPlayer.f63006b.getCurrentPosition();
                }
                POBMediaPlayer.this.f63009e.post(new RunnableC0788a());
            }
        }

        r() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBMediaPlayer.this.a(new a());
        }
    }

    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMediaPlayer.this.g();
        }
    }

    class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f63049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63050b;

        t(int i10, String str) {
            this.f63049a = i10;
            this.f63050b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63005a != null) {
                POBMediaPlayer.this.f63005a.onFailure(this.f63049a, this.f63050b);
            }
        }
    }

    class u implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63052a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                POBMediaPlayer.this.d();
            }
        }

        u(String str) {
            this.f63052a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String message;
            int i10;
            POBMediaPlayer.this.a();
            try {
                if (POBMediaPlayer.this.f63006b != null) {
                    POBMediaPlayer.this.f63006b.setDataSource(this.f63052a);
                    POBTaskHandler.getInstance().runOnMainThread(new a());
                    POBMediaPlayer.this.f63006b.prepare();
                }
            } catch (IOException e10) {
                message = e10.getMessage();
                if (message != null) {
                    i10 = -1004;
                    POBMediaPlayer.this.a(i10, message);
                }
            } catch (Exception e11) {
                message = e11.getMessage();
                if (message != null) {
                    i10 = 1;
                    POBMediaPlayer.this.a(i10, message);
                }
            }
        }
    }

    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b != null) {
                try {
                    try {
                        POBMediaPlayer.this.f63006b.setSurface(null);
                        POBMediaPlayer.this.f63006b.stop();
                        POBMediaPlayer.this.f63006b.release();
                    } catch (AssertionError | Exception e10) {
                        POBLog.error("POBMediaPlayer", "Error invalidating MediaPlayer, due to " + e10.getMessage(), new Object[0]);
                    }
                } finally {
                    POBMediaPlayer.this.f63006b = null;
                }
            }
            POBMediaPlayer.this.f63008d.quitSafely();
        }
    }

    class w implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMediaPlayer.this.f63005a != null) {
                    POBMediaPlayer.this.f63005a.onResume();
                }
            }
        }

        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMediaPlayer.this.f63006b != null) {
                POBMediaPlayer.this.f63006b.start();
            }
            POBMediaPlayer.this.f63009e.post(new a());
        }
    }

    public POBMediaPlayer(@NonNull String str, @NonNull Handler handler) {
        this.f63009e = handler;
        k kVar = new k("POBMediaPlayer", str);
        this.f63008d = kVar;
        kVar.start();
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void destroy() {
        b();
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getDuration() {
        return this.f63018n;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getVideoHeight() {
        return this.f63017m;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public int getVideoWidth() {
        return this.f63016l;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        POBTaskHandler.getInstance().runOnMainThread(new f());
        this.f63009e.post(new g(i10));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        POBTaskHandler.getInstance().runOnMainThread(new h());
        this.f63009e.post(new i());
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        return a(i11, a(i11));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        POBLog.info("POBMediaPlayer", "onInfo what: " + i10 + ", extra:" + i11, new Object[0]);
        if (i10 == 3) {
            this.f63009e.post(new j());
            return true;
        }
        if (i10 == 701) {
            POBTaskHandler.getInstance().runOnMainThread(new l());
        } else if (i10 == 702) {
            POBUtils.runOnMainThread(new m());
        } else if (i11 == -1004) {
            return a(i11, a(i11));
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        POBTaskHandler.getInstance().runOnMainThread(new n());
        if (mediaPlayer != null) {
            this.f63018n = mediaPlayer.getDuration();
        }
        this.f63009e.post(new o());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void onSurfaceCreated(@NonNull Surface surface) {
        e();
        a(new d(surface));
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void onSurfaceDestroyed(@NonNull Surface surface) {
        h();
        a(new e());
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.f63016l = i10;
        this.f63017m = i11;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void pause() {
        h();
        a(new a());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setPlayerListener(@NonNull POBPlayer.POBPlayerListener pOBPlayerListener) {
        this.f63005a = pOBPlayerListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setPrepareTimeout(int i10) {
        this.f63013i = i10;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setStallTimeout(int i10) {
        this.f63015k = i10;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void setVolume(int i10, int i11) {
        a(new c(i10, i11));
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void start() {
        e();
        a(new w());
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer
    public void stop() {
        h();
        a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f63005a = null;
        h();
        g();
        f();
        a(new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f63014j == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new q());
            this.f63014j = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.f63015k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new p());
        this.f63012h = pOBTimeoutHandler;
        pOBTimeoutHandler.start(this.f63013i);
    }

    private void e() {
        if (this.f63010f == null) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new r());
            this.f63010f = pOBTimeoutHandler;
            pOBTimeoutHandler.startAtFixedRate(0L, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        POBTimeoutHandler pOBTimeoutHandler = this.f63014j;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f63014j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBTimeoutHandler pOBTimeoutHandler = this.f63012h;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f63012h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBTimeoutHandler pOBTimeoutHandler = this.f63010f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f63010f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f63006b = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        this.f63006b.setOnCompletionListener(this);
        this.f63006b.setOnBufferingUpdateListener(this);
        this.f63006b.setAudioStreamType(3);
        this.f63006b.setOnErrorListener(this);
        this.f63006b.setOnInfoListener(this);
        this.f63006b.setOnVideoSizeChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (this.f63008d.isAlive()) {
            Handler handler = this.f63007c;
            if (handler != null) {
                handler.post(runnable);
                return;
            } else {
                POBLog.error("POBMediaPlayer", "mediaPlayerHandler is null", new Object[0]);
                return;
            }
        }
        POBLog.error("POBMediaPlayer", "Handler thread is dead already", new Object[0]);
    }

    private String a(int i10) {
        if (i10 == -1010) {
            return "MEDIA_ERROR_UNSUPPORTED";
        }
        if (i10 == -1007) {
            return "MEDIA_ERROR_MALFORMED";
        }
        if (i10 == -1004) {
            return "MEDIA_ERROR_IO";
        }
        if (i10 != -110) {
            return "MEDIA_ERROR_UNKNOWN";
        }
        return "MEDIA_ERROR_TIMED_OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, String str) {
        POBTaskHandler.getInstance().runOnMainThread(new s());
        POBLog.error("POBMediaPlayer", "errorCode: " + i10 + ", errorMsg:" + str, new Object[0]);
        this.f63009e.post(new t(i10, str));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        a(new u(str));
    }
}
