package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import com.my.target.common.models.VideoData;
import com.my.target.y;
import com.my.target.z;

/* JADX INFO: loaded from: classes11.dex */
public class e5 implements z4, AudioManager.OnAudioFocusChangeListener, y.a, z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f59578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5 f59579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f59580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc f59581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8 f59582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f59583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f59584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59585h;

    public interface a {
        void a();

        void a(float f10, float f11);

        void b();

        void d();

        void e();

        void f();

        void h();

        void k();

        void onVolumeChanged(float f10);
    }

    public e5(s5 s5Var, z zVar, a aVar, f9 f9Var, y yVar) {
        this.f59578a = aVar;
        this.f59584g = zVar;
        this.f59580c = yVar;
        zVar.setAdVideoViewListener(this);
        this.f59579b = s5Var;
        cc ccVarA = cc.a(s5Var.x());
        this.f59581d = ccVarA;
        this.f59582e = f9Var.a(s5Var);
        ccVarA.a(zVar);
        this.f59583f = s5Var.o();
        yVar.a(this);
        if (s5Var.g0()) {
            yVar.setVolume(0.0f);
        } else {
            yVar.setVolume(1.0f);
        }
    }

    public static e5 a(s5 s5Var, z zVar, a aVar, f9 f9Var, y yVar) {
        return new e5(s5Var, zVar, aVar, f9Var, yVar);
    }

    @Override // com.my.target.y.a
    public void d() {
        this.f59578a.d();
    }

    @Override // com.my.target.z4
    public void destroy() {
        g();
        this.f59580c.destroy();
        this.f59581d.a();
    }

    @Override // com.my.target.y.a
    public void e() {
        this.f59578a.e();
    }

    @Override // com.my.target.y.a
    public void f() {
        this.f59578a.f();
    }

    @Override // com.my.target.z4
    public void g() {
        a(this.f59584g.getContext());
        this.f59580c.pause();
    }

    @Override // com.my.target.z4
    public void h() {
        if (!this.f59579b.h0()) {
            this.f59578a.h();
        } else {
            this.f59578a.e();
            r();
        }
    }

    @Override // com.my.target.z4
    public void j() {
        this.f59582e.d();
        destroy();
    }

    @Override // com.my.target.y.a
    public void l() {
    }

    @Override // com.my.target.z4
    public void m() {
        if (this.f59580c.isPlaying()) {
            g();
            this.f59582e.f();
        } else if (this.f59580c.i() <= 0) {
            r();
        } else {
            s();
            this.f59582e.i();
        }
    }

    @Override // com.my.target.y.a
    public void n() {
        gb.a("InterstitialPromoMediaPresenterS2: Video playing timeout");
        this.f59582e.h();
        this.f59578a.a();
        this.f59580c.stop();
        this.f59580c.destroy();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i10) {
        if (Looper.getMainLooper().isCurrentThread()) {
            b(i10);
        } else {
            f0.f(new Runnable() { // from class: k5.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86048b.b(i10);
                }
            });
        }
    }

    @Override // com.my.target.y.a
    public void p() {
        this.f59578a.k();
    }

    @Override // com.my.target.z.a
    public void q() {
        if (!(this.f59580c instanceof b2)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        this.f59584g.setViewMode(1);
        this.f59580c.a(this.f59584g);
        VideoData videoData = (VideoData) this.f59579b.k0();
        if (!this.f59580c.isPlaying() || videoData == null) {
            return;
        }
        if (videoData.a() != null) {
            this.f59585h = true;
        }
        a(videoData);
    }

    public void r() {
        VideoData videoData = (VideoData) this.f59579b.k0();
        this.f59582e.c();
        if (videoData != null) {
            if (!this.f59580c.g()) {
                b(this.f59584g.getContext());
            }
            this.f59580c.a(this);
            this.f59580c.a(this.f59584g);
            a(videoData);
        }
    }

    public void s() {
        this.f59580c.resume();
        if (this.f59580c.g()) {
            a(this.f59584g.getContext());
        } else if (this.f59580c.isPlaying()) {
            b(this.f59584g.getContext());
        }
    }

    @Override // com.my.target.z4
    public void a() {
        this.f59580c.a();
        this.f59582e.b(!this.f59580c.g());
    }

    @Override // com.my.target.y.a
    public void b() {
        this.f59582e.e();
        this.f59578a.b();
        this.f59580c.stop();
    }

    @Override // com.my.target.y.a
    public void a(float f10) {
        this.f59578a.onVolumeChanged(f10);
    }

    private void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    @Override // com.my.target.y.a
    public void a(float f10, float f11) {
        float f12 = this.f59583f;
        if (f10 > f12) {
            a(f11, f12);
            return;
        }
        if (f10 != 0.0f) {
            this.f59578a.a(f10, f11);
            this.f59582e.a(f10, f11);
            this.f59581d.a(f10, f11);
        }
        if (f10 == f11) {
            if (this.f59580c.isPlaying()) {
                b();
            }
            this.f59580c.stop();
        }
    }

    @Override // com.my.target.y.a
    public void a(String str) {
        gb.a("InterstitialPromoMediaPresenterS2: Video playing error - " + str);
        this.f59582e.g();
        if (this.f59585h) {
            gb.a("InterstitialPromoMediaPresenterS2: Try to play video stream from URL");
            this.f59585h = false;
            VideoData videoData = (VideoData) this.f59579b.k0();
            if (videoData != null) {
                this.f59580c.a(Uri.parse(videoData.getUrl()), this.f59584g.getContext());
                return;
            }
        }
        this.f59578a.a();
        this.f59580c.stop();
        this.f59580c.destroy();
    }

    public final void a(VideoData videoData) {
        String str = (String) videoData.a();
        this.f59584g.a(videoData.getWidth(), videoData.getHeight());
        if (str != null) {
            this.f59585h = true;
            this.f59580c.a(Uri.parse(str), this.f59584g.getContext());
        } else {
            this.f59585h = false;
            this.f59580c.a(Uri.parse(videoData.getUrl()), this.f59584g.getContext());
        }
    }

    private void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(int i10) {
        if (i10 == -2 || i10 == -1) {
            g();
            gb.a("InterstitialPromoMediaPresenterS2: Audiofocus loss, pausing");
        }
    }
}
