package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import com.my.target.common.models.VideoData;
import com.my.target.f5;
import com.my.target.g9;

/* JADX INFO: loaded from: classes11.dex */
public class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5 f61064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f61065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5 f61066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc f61067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8 f61068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f5.c f61069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f5.b f61070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f61071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f61072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f61073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f61074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f61076m = true;

    public class a implements g9.a {
        public a() {
        }

        @Override // com.my.target.y.a
        public void b() {
            y4 y4Var = y4.this;
            if (y4Var.f61075l) {
                return;
            }
            y4Var.f61075l = true;
            gb.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing complete");
            y4.this.f61068e.e();
            y4.this.h();
            y4 y4Var2 = y4.this;
            y4Var2.f61069f.a(y4Var2.f61066c.getView().getContext());
            y4.this.f61066c.c();
            y4.this.f61066c.d();
            y4.this.f61068e.c();
        }

        @Override // com.my.target.g9.a
        public void c() {
            y4 y4Var = y4.this;
            y4Var.a(y4Var.f61066c.getView().getContext());
            y4.this.f61068e.f();
            y4.this.f61066c.pause();
        }

        @Override // com.my.target.y.a
        public void d() {
        }

        @Override // com.my.target.y.a
        public void e() {
        }

        @Override // com.my.target.y.a
        public void f() {
        }

        @Override // com.my.target.g9.a
        public void i() {
            y4.this.f61068e.i();
            y4.this.f61066c.resume();
            y4 y4Var = y4.this;
            if (y4Var.f61072i) {
                y4Var.c();
            } else {
                y4Var.i();
            }
        }

        @Override // com.my.target.g9.a
        public void k() {
            y4.this.f();
        }

        @Override // com.my.target.y.a
        public void l() {
        }

        @Override // com.my.target.y.a
        public void n() {
            y4.this.f61068e.h();
            y4.this.a();
            gb.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing timeout");
            y4.this.f61070g.a();
        }

        @Override // com.my.target.g9.a
        public void o() {
            y4 y4Var = y4.this;
            if (!y4Var.f61072i) {
                y4Var.b(y4Var.f61066c.getView().getContext());
            }
            y4.this.f();
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            if (Looper.getMainLooper().isCurrentThread()) {
                y4.this.a(i10);
            } else {
                f0.f(new Runnable() { // from class: k5.y2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f86166b.a(i10);
                    }
                });
            }
        }

        @Override // com.my.target.y.a
        public void p() {
            y4 y4Var = y4.this;
            if (y4Var.f61073j && y4Var.f61064a.M() == 0.0f) {
                y4.this.f61066c.c();
            }
            y4.this.f61066c.a();
        }

        public void a() {
            y4 y4Var = y4.this;
            if (y4Var.f61072i) {
                y4Var.i();
                y4.this.f61068e.b(true);
                y4.this.f61072i = false;
            } else {
                y4Var.c();
                y4.this.f61068e.b(false);
                y4.this.f61072i = true;
            }
        }

        @Override // com.my.target.y.a
        public void a(float f10) {
            y4.this.f61066c.b(f10 <= 0.0f);
        }

        @Override // com.my.target.y.a
        public void a(float f10, float f11) {
            y4.this.f61066c.setTimeChanged(f10);
            y4 y4Var = y4.this;
            y4Var.f61075l = false;
            if (!y4Var.f61074k) {
                y4Var.f61074k = true;
            }
            if (y4Var.f61073j && y4Var.f61064a.h0() && y4.this.f61064a.M() <= f10) {
                y4.this.f61066c.c();
            }
            y4 y4Var2 = y4.this;
            float f12 = y4Var2.f61071h;
            if (f10 <= f12) {
                y4Var2.a(f10, f11);
                if (f10 == y4.this.f61071h) {
                    b();
                    return;
                }
                return;
            }
            a(f12, f12);
        }

        @Override // com.my.target.y.a
        public void a(String str) {
            gb.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing error: " + str);
            y4.this.f61068e.g();
            y4 y4Var = y4.this;
            if (y4Var.f61076m) {
                gb.a("InterstitialMediaPresenter$MyMediaViewListener: Try to play video stream from URL");
                y4 y4Var2 = y4.this;
                y4Var2.f61076m = false;
                y4Var2.f();
                return;
            }
            y4Var.a();
            y4.this.f61070g.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            y4.this.a(i10);
        }
    }

    public y4(e9 e9Var, s5 s5Var, i5 i5Var, f5.c cVar, f5.b bVar) {
        this.f61064a = s5Var;
        this.f61069f = cVar;
        this.f61070g = bVar;
        a aVar = new a();
        this.f61065b = aVar;
        this.f61066c = i5Var;
        i5Var.setMediaListener(aVar);
        cc ccVarA = cc.a(s5Var.x());
        this.f61067d = ccVarA;
        ccVarA.a(i5Var.getPromoMediaView());
        this.f61068e = e9Var.a(s5Var);
    }

    public static y4 a(e9 e9Var, s5 s5Var, i5 i5Var, f5.c cVar, f5.b bVar) {
        return new y4(e9Var, s5Var, i5Var, cVar, bVar);
    }

    public final void b() {
        this.f61066c.a(1);
    }

    public final void c() {
        a(this.f61066c.getView().getContext());
        this.f61066c.a(0);
    }

    public void d() {
        this.f61066c.a(true);
        a(this.f61066c.getView().getContext());
        if (this.f61074k) {
            this.f61068e.d();
        }
    }

    public void e() {
        this.f61066c.pause();
        a(this.f61066c.getView().getContext());
        if (!this.f61066c.isPlaying() || this.f61066c.b()) {
            return;
        }
        this.f61068e.f();
    }

    public final void f() {
        this.f61066c.c(this.f61076m);
    }

    public void g() {
        a(this.f61066c.getView().getContext());
    }

    public final void h() {
        this.f61066c.c();
        a(this.f61066c.getView().getContext());
        this.f61066c.a(this.f61064a.c0());
    }

    public final void i() {
        if (this.f61066c.isPlaying()) {
            b(this.f61066c.getView().getContext());
        }
        this.f61066c.a(2);
    }

    public void a(s5 s5Var, Context context) {
        VideoData videoData = (VideoData) s5Var.k0();
        if (videoData != null && videoData.a() == null) {
            this.f61076m = false;
        }
        boolean zA0 = s5Var.a0();
        this.f61073j = zA0;
        if (zA0 && s5Var.M() == 0.0f && s5Var.h0()) {
            gb.a("InterstitialMediaPresenter: Banner is allowed to close");
            this.f61066c.c();
        }
        this.f61071h = s5Var.o();
        boolean zG0 = s5Var.g0();
        this.f61072i = zG0;
        if (zG0) {
            this.f61066c.a(0);
            return;
        }
        if (s5Var.h0()) {
            b(context);
        }
        this.f61066c.a(2);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f61065b, 3, 2);
        }
    }

    public void a(o4 o4Var) {
        this.f61066c.c();
        this.f61066c.a(o4Var);
    }

    public void a() {
        a(this.f61066c.getView().getContext());
        this.f61066c.destroy();
    }

    public final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f61065b);
        }
    }

    public final void a(float f10, float f11) {
        this.f61067d.a(f10, f11);
        this.f61068e.a(f10, f11);
    }

    public final void a(int i10) {
        if (i10 == -3) {
            gb.a("InterstitialMediaPresenter: Audiofocus loss can duck, set volume to 0.3");
            if (this.f61072i) {
                return;
            }
            b();
            return;
        }
        if (i10 == -2 || i10 == -1) {
            e();
            gb.a("InterstitialMediaPresenter: Audiofocus loss, pausing");
        } else if (i10 == 1 || i10 == 2 || i10 == 4) {
            gb.a("InterstitialMediaPresenter: Audiofocus gain, unmuting");
            if (this.f61072i) {
                return;
            }
            i();
        }
    }
}
