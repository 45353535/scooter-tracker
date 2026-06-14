package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.gms.internal.ads.u;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;

/* JADX INFO: loaded from: classes10.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f47392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceHolder f47400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f47401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f47402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f47403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f47404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MediaEvents f47406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f47407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AudioManager f47408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f47409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f47410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f47411t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f47412u;

    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    private class b implements SurfaceHolder.Callback {
        private b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f47395d && !CusPlayerView.this.f47396e && !CusPlayerView.this.isComplete() && !CusPlayerView.this.f47398g && !com.mbridge.msdk.foundation.feedback.b.f48549f) {
                    if (CusPlayerView.this.f47392a.f()) {
                        q0.c("PlayerView", "surfaceChanged  start====");
                        CusPlayerView.this.resumeStart();
                    } else {
                        q0.c("PlayerView", "surfaceChanged  PLAY====");
                        CusPlayerView.this.playVideo(0);
                        CusPlayerView.this.resumeOMSDK();
                    }
                    if (CusPlayerView.this.f47398g) {
                        if (CusPlayerView.this.f47399h) {
                            CusPlayerView.this.f47392a.n();
                            CusPlayerView.this.resumeOMSDK();
                        } else {
                            CusPlayerView.this.pause();
                        }
                    }
                }
                CusPlayerView.this.f47395d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f47392a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f47400i = surfaceHolder;
                CusPlayerView.this.f47392a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f47395d = true;
                CusPlayerView.this.f47397f = true;
                CusPlayerView.this.f47392a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        /* synthetic */ b(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public interface c {
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47394c = false;
        this.f47395d = false;
        this.f47396e = false;
        this.f47397f = false;
        this.f47398g = false;
        this.f47399h = false;
        this.f47403l = 1;
        this.f47404m = false;
        this.f47405n = false;
        this.f47407p = "";
        this.f47410s = false;
        this.f47411t = false;
        this.f47412u = true;
        b();
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f47392a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f47392a.f() && !this.f47397f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public int getCurPosition() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar;
        try {
            bVar = this.f47392a;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        long jC = bVar != null ? bVar.c() : 0L;
        return u.a(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f47407p;
    }

    public MediaEvents getVideoEvents() {
        return this.f47406o;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f47393b = str;
        this.f47392a.a(aVar);
        this.f47392a.c(this.f47393b);
        this.f47394c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                if (bVar.g()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f47411t;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f47412u;
    }

    public boolean isSilent() {
        return this.f47392a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f47401j = motionEvent.getRawX();
        this.f47402k = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f47392a == null || this.f47395d || isComplete() || this.f47396e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.f47392a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        try {
            if (s0.a().a("i_l_s_t_r_i", false) && i10 == 0 && !this.f47404m) {
                this.f47404m = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f47406o == null || this.f47405n) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f47405n = true;
            this.f47406o.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f47392a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f47394c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f47392a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f47412u) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f47392a.j();
                }
            }
            this.f47392a.a(i10);
            this.f47397f = false;
            return true;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f47406o != null) {
                this.f47406o = null;
            }
            a();
            if (this.f47400i != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f47400i.getSurface().release();
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f47406o;
            if (mediaEvents != null) {
                this.f47405n = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f47392a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsBTVideo(boolean z10) {
        this.f47398g = z10;
    }

    public void setIsBTVideoPlaying(boolean z10) {
        this.f47399h = z10;
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f47396e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f47411t = i10 == 1;
    }

    public void setNotifyListener(c cVar) {
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f47412u = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f47407p = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f47406o = mediaEvents;
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f47392a != null) {
                if (z10) {
                    if (e()) {
                        this.f47392a.t();
                    } else {
                        this.f47392a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
                if (bVar == null || this.f47396e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f47406o != null) {
                this.f47406o = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void c() {
        try {
            this.f47408q = (AudioManager) getContext().getSystemService("audio");
            this.f47409r = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e10.getMessage());
        }
    }

    private void d() {
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f47400i = holder;
        holder.setKeepScreenOn(true);
        this.f47400i.addCallback(new b(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f47392a = bVar;
        bVar.a(getContext(), this.f47400i);
        addView(surfaceView, -1, -1);
    }

    private boolean e() {
        int i10;
        try {
            if (this.f47408q == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f47411t) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f47408q.requestAudioFocus(this.f47409r, 3, i10) != 1) {
                z10 = false;
            }
            this.f47410s = z10;
            return z10;
        } catch (Exception e10) {
            q0.b("PlayerView", "Error requesting audio focus: " + e10.getMessage());
            return false;
        }
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f47392a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f47410s = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f47392a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.f47392a.m();
                return;
            }
            if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f47410s = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f47392a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.f47392a.m();
                return;
            }
            if (i10 != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.f47410s = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f47392a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.f47392a.h()) {
                    return;
                }
                this.f47392a.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", "Error handling audio focus change: " + e10.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    private void a() {
        try {
            AudioManager audioManager = this.f47408q;
            if (audioManager == null || !this.f47410s) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f47409r);
            this.f47410s = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e10.getMessage());
        }
    }
}
