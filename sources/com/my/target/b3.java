package com.my.target;

import android.content.Context;
import android.net.Uri;
import com.my.target.common.models.AudioData;
import com.my.target.instreamads.InstreamAudioAdPlayer;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
public class b3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InstreamAudioAdPlayer f59268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f59269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s5 f59270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f59272k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f59274m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f59267f = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59273l = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f59275n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f59262a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9 f59263b = u9.a(200);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f59264c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f59265d = new Stack();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8 f59266e = q8.b();

    public class a implements InstreamAudioAdPlayer.AdPlayerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f59276a = 1.0f;

        public a() {
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioCompleted() {
            b3 b3Var = b3.this;
            if (b3Var.f59275n != 2) {
                if (b3Var.f59270i != null && b3Var.f59269h != null) {
                    b3Var.a();
                    b3 b3Var2 = b3.this;
                    s5 s5Var = b3Var2.f59270i;
                    b3Var2.f59270i = null;
                    if (s5Var != null) {
                        float fO = s5Var.o();
                        b3.this.f59266e.a(fO, fO);
                        b3.this.f59266e.e();
                        b3.this.f59269h.a(s5Var);
                    }
                }
                b3.this.f59275n = 2;
            }
            b3 b3Var3 = b3.this;
            b3Var3.f59263b.b(b3Var3.f59264c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioError(String str) {
            b bVar;
            InstreamAudioAdPlayer instreamAudioAdPlayer = b3.this.f59268g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            b3 b3Var = b3.this;
            s5 s5Var = b3Var.f59270i;
            if (s5Var != null && (bVar = b3Var.f59269h) != null) {
                bVar.a(str, s5Var);
            }
            b3.this.f59266e.g();
            b3 b3Var2 = b3.this;
            b3Var2.f59263b.b(b3Var2.f59264c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioPaused() {
            Context contextD = b3.this.d();
            b3 b3Var = b3.this;
            if (b3Var.f59270i != null && contextD != null) {
                b3Var.f59266e.f();
            }
            b3 b3Var2 = b3.this;
            b3Var2.f59263b.b(b3Var2.f59264c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioResumed() {
            Context contextD = b3.this.d();
            b3 b3Var = b3.this;
            if (b3Var.f59270i != null && contextD != null) {
                b3Var.f59266e.i();
            }
            b3 b3Var2 = b3.this;
            b3Var2.f59263b.a(b3Var2.f59264c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStarted() {
            InstreamAudioAdPlayer instreamAudioAdPlayer;
            b3 b3Var = b3.this;
            b3Var.f59275n = 1;
            if (!b3Var.f59274m && (instreamAudioAdPlayer = b3Var.f59268g) != null) {
                b3Var.b(instreamAudioAdPlayer.getAdAudioDuration());
            }
            b3 b3Var2 = b3.this;
            b3Var2.f59263b.a(b3Var2.f59264c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStopped() {
            b3 b3Var = b3.this;
            if (b3Var.f59275n == 1) {
                if (b3Var.f59270i != null && b3Var.f59269h != null) {
                    b3Var.f59266e.j();
                    b3 b3Var2 = b3.this;
                    b3Var2.f59269h.b(b3Var2.f59270i);
                }
                b3.this.f59275n = 0;
            }
            b3 b3Var3 = b3.this;
            b3Var3.f59263b.b(b3Var3.f59264c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onVolumeChanged(float f10) {
            float f11 = this.f59276a;
            if (f10 == f11) {
                return;
            }
            if (f11 > 0.0f && f10 <= 0.0f) {
                if (b3.this.d() != null) {
                    b3 b3Var = b3.this;
                    if (b3Var.f59270i != null) {
                        b3Var.f59266e.b(false);
                        this.f59276a = f10;
                        b3.this.f59267f = f10;
                        return;
                    }
                    return;
                }
                return;
            }
            if (f11 != 0.0f || f10 <= 0.0f || b3.this.d() == null) {
                return;
            }
            b3 b3Var2 = b3.this;
            if (b3Var2.f59270i != null) {
                b3Var2.f59266e.b(true);
                this.f59276a = f10;
                b3.this.f59267f = f10;
            }
        }
    }

    public interface b {
        void a(float f10, float f11, s5 s5Var);

        void a(s5 s5Var);

        void a(String str, s5 s5Var);

        void b(s5 s5Var);

        void c(s5 s5Var);
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b3.this.a();
        }
    }

    public static b3 h() {
        return new b3();
    }

    public void a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        InstreamAudioAdPlayer instreamAudioAdPlayer2 = this.f59268g;
        if (instreamAudioAdPlayer2 != null) {
            instreamAudioAdPlayer2.setAdPlayerListener(null);
        }
        this.f59268g = instreamAudioAdPlayer;
        if (instreamAudioAdPlayer == null) {
            this.f59266e.a((Context) null);
        } else {
            instreamAudioAdPlayer.setAdPlayerListener(this.f59262a);
            this.f59266e.a(instreamAudioAdPlayer.getCurrentContext());
        }
    }

    public final void b(float f10) {
        s5 s5Var;
        b bVar;
        s5 s5Var2 = this.f59270i;
        if (s5Var2 != null && (bVar = this.f59269h) != null) {
            bVar.c(s5Var2);
        }
        b bVar2 = this.f59269h;
        if (bVar2 != null && (s5Var = this.f59270i) != null) {
            bVar2.a(0.0f, f10, s5Var);
        }
        this.f59266e.a(0.0f, f10);
        this.f59274m = true;
    }

    public void c() {
        this.f59263b.close();
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.destroy();
        }
        this.f59268g = null;
    }

    public Context d() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer == null) {
            return null;
        }
        return instreamAudioAdPlayer.getCurrentContext();
    }

    public InstreamAudioAdPlayer e() {
        return this.f59268g;
    }

    public float f() {
        return this.f59267f;
    }

    public final void g() {
        s5 s5Var;
        gb.a("InstreamAdAudioController: Video freeze more then " + this.f59273l + " seconds, stopping");
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
        this.f59263b.b(this.f59264c);
        this.f59266e.h();
        b bVar = this.f59269h;
        if (bVar == null || (s5Var = this.f59270i) == null) {
            return;
        }
        bVar.a(AndroidInitializeBoldSDK.MSG_TIMEOUT, s5Var);
    }

    public void i() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.pauseAdAudio();
        }
    }

    public void j() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.resumeAdAudio();
        }
    }

    public void k() {
        if (this.f59275n == 1) {
            if (this.f59270i != null && this.f59269h != null) {
                this.f59266e.j();
                this.f59269h.b(this.f59270i);
            }
            this.f59275n = 0;
        }
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
    }

    public void c(float f10) {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(f10);
        }
        this.f59267f = f10;
    }

    public void a(b bVar) {
        this.f59269h = bVar;
    }

    public final void b() {
        this.f59263b.b(this.f59264c);
        if (this.f59275n != 2) {
            this.f59275n = 2;
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            if (this.f59270i == null || this.f59269h == null) {
                return;
            }
            this.f59266e.e();
            s5 s5Var = this.f59270i;
            this.f59270i = null;
            this.f59269h.a(s5Var);
        }
    }

    public void a(s5 s5Var) {
        this.f59270i = s5Var;
        this.f59266e.a(s5Var);
        this.f59274m = false;
        s5Var.x().b(this.f59265d);
        AudioData audioData = (AudioData) s5Var.k0();
        if (audioData == null) {
            return;
        }
        Uri uri = Uri.parse(audioData.getUrl());
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59268g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(this.f59267f);
            this.f59268g.playAdAudio(uri);
        }
    }

    public void a(int i10) {
        this.f59273l = i10;
    }

    public void a() {
        float adAudioDuration;
        float adAudioPosition;
        float f10;
        InstreamAudioAdPlayer instreamAudioAdPlayer;
        s5 s5Var = this.f59270i;
        float fO = s5Var != null ? s5Var.o() : 0.0f;
        if (this.f59270i == null) {
            this.f59263b.b(this.f59264c);
            return;
        }
        if (this.f59275n != 1 || (instreamAudioAdPlayer = this.f59268g) == null) {
            adAudioDuration = 0.0f;
            adAudioPosition = 0.0f;
            f10 = 0.0f;
        } else {
            adAudioDuration = instreamAudioAdPlayer.getAdAudioDuration();
            adAudioPosition = this.f59268g.getAdAudioPosition();
            f10 = fO - adAudioPosition;
        }
        if (this.f59275n == 1 && this.f59272k != adAudioPosition && adAudioDuration > 0.0f) {
            a(f10, adAudioPosition, fO);
        } else {
            this.f59271j++;
        }
        if (this.f59271j >= (this.f59273l * 1000) / 200) {
            g();
        }
    }

    public final void a(float f10, float f11, float f12) {
        s5 s5Var;
        this.f59271j = 0;
        this.f59272k = f11;
        if (f11 < f12) {
            this.f59266e.a(f11, f12);
            b bVar = this.f59269h;
            if (bVar == null || (s5Var = this.f59270i) == null) {
                return;
            }
            bVar.a(f10, f12, s5Var);
            return;
        }
        a(f12);
    }

    public final void a(float f10) {
        s5 s5Var;
        this.f59266e.a(f10, f10);
        b bVar = this.f59269h;
        if (bVar != null && (s5Var = this.f59270i) != null) {
            bVar.a(0.0f, f10, s5Var);
        }
        b();
    }
}
