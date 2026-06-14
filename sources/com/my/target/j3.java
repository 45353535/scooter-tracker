package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.my.target.common.models.VideoData;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.l8;
import com.my.target.q8;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX INFO: loaded from: classes11.dex */
public final class j3 implements InstreamAdPlayer.AdPlayerListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cc f59948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l8 f59949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InstreamAdPlayer f59950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f59951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s5 f59952i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f59957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f59958o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bc f59947d = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59953j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59954k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f59955l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f59956m = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f59944a = u9.a(200);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8 f59945b = q8.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f59946c = new Runnable() { // from class: k5.w0
        @Override // java.lang.Runnable
        public final void run() {
            this.f86153b.a();
        }
    };

    public interface a {
        void a(float f10, float f11, s5 s5Var);

        void a(s5 s5Var);

        void a(String str, s5 s5Var);

        void b(s5 s5Var);

        void c(s5 s5Var);

        void d(s5 s5Var);

        void e(s5 s5Var);
    }

    public static j3 i() {
        return new j3();
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        InstreamAdPlayer instreamAdPlayer2 = this.f59950g;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
        }
        this.f59950g = instreamAdPlayer;
        if (instreamAdPlayer == null) {
            cc ccVar = this.f59948e;
            if (ccVar != null) {
                ccVar.a((View) null);
            }
            bc bcVar = this.f59947d;
            if (bcVar != null) {
                bcVar.e();
            }
            this.f59945b.a((Context) null);
            return;
        }
        View view = instreamAdPlayer.getView();
        cc ccVar2 = this.f59948e;
        if (ccVar2 != null) {
            ccVar2.a(view);
        }
        bc bcVar2 = this.f59947d;
        if (bcVar2 != null) {
            bcVar2.b(view);
        }
        instreamAdPlayer.setAdPlayerListener(this);
        this.f59945b.a(view.getContext());
        l8 l8Var = this.f59949f;
        if (l8Var != null) {
            l8Var.a(instreamAdPlayer.getView());
        }
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        VideoData videoData;
        InstreamAdPlayer instreamAdPlayer2 = this.f59950g;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
            this.f59950g.stopAdVideo();
        }
        this.f59950g = instreamAdPlayer;
        if (instreamAdPlayer != null) {
            cc ccVar = this.f59948e;
            if (ccVar != null) {
                ccVar.a(instreamAdPlayer.getView());
            }
            bc bcVar = this.f59947d;
            if (bcVar != null) {
                bcVar.b(instreamAdPlayer.getView());
            }
            instreamAdPlayer.setAdPlayerListener(this);
            this.f59945b.a(instreamAdPlayer.getView().getContext());
            l8 l8Var = this.f59949f;
            if (l8Var != null) {
                l8Var.a(instreamAdPlayer.getView());
            }
        } else {
            cc ccVar2 = this.f59948e;
            if (ccVar2 != null) {
                ccVar2.a((View) null);
            }
            bc bcVar2 = this.f59947d;
            if (bcVar2 != null) {
                bcVar2.e();
            }
            this.f59945b.a((Context) null);
        }
        s5 s5Var = this.f59952i;
        if (s5Var == null || (videoData = (VideoData) s5Var.k0()) == null || instreamAdPlayer == null) {
            return;
        }
        Uri uri = Uri.parse(videoData.getUrl());
        instreamAdPlayer.setVolume(this.f59955l);
        instreamAdPlayer.playAdVideo(uri, videoData.getWidth(), videoData.getHeight(), this.f59958o);
    }

    public void c() {
        this.f59944a.close();
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.destroy();
            this.f59950g = null;
        }
        b();
    }

    public Context d() {
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer == null) {
            return null;
        }
        return instreamAdPlayer.getView().getContext();
    }

    public InstreamAdPlayer e() {
        return this.f59950g;
    }

    public float f() {
        return this.f59955l;
    }

    public void g() {
        s5 s5Var;
        gb.a("InstreamAdVideoController: Video freeze more then " + this.f59954k + " seconds, stopping");
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        this.f59944a.b(this.f59946c);
        this.f59945b.h();
        a aVar = this.f59951h;
        if (aVar != null && (s5Var = this.f59952i) != null) {
            aVar.a(AndroidInitializeBoldSDK.MSG_TIMEOUT, s5Var);
        }
        b();
    }

    public final /* synthetic */ void h() {
        l8 l8Var;
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer == null || (l8Var = this.f59949f) == null) {
            return;
        }
        l8Var.a(instreamAdPlayer.getView(), new l8.b[0]);
        this.f59949f.c();
    }

    public void j() {
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.pauseAdVideo();
        }
    }

    public void k() {
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.resumeAdVideo();
        }
    }

    public void l() {
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        onAdVideoStopped();
    }

    public void m() {
        l8 l8Var = this.f59949f;
        if (l8Var != null) {
            l8Var.a(2);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoCompleted() {
        if (a(4)) {
            a();
            this.f59944a.b(this.f59946c);
            bc bcVar = this.f59947d;
            if (bcVar != null) {
                bcVar.e();
            }
            s5 s5VarB = b();
            if (s5VarB != null) {
                float fO = s5VarB.o();
                this.f59945b.a(fO, fO);
                cc ccVar = this.f59948e;
                if (ccVar != null) {
                    ccVar.a(fO, fO);
                }
                if (this.f59951h != null) {
                    this.f59945b.e();
                    this.f59951h.d(s5VarB);
                }
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoError(String str) {
        a aVar;
        if (a(6)) {
            InstreamAdPlayer instreamAdPlayer = this.f59950g;
            if (instreamAdPlayer != null) {
                instreamAdPlayer.stopAdVideo();
            }
            this.f59945b.g();
            bc bcVar = this.f59947d;
            if (bcVar != null) {
                bcVar.e();
            }
            this.f59944a.b(this.f59946c);
            s5 s5VarB = b();
            if (s5VarB == null || (aVar = this.f59951h) == null) {
                return;
            }
            aVar.a(str, s5VarB);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoPaused() {
        a aVar;
        if (a(3)) {
            this.f59945b.f();
            this.f59944a.b(this.f59946c);
            s5 s5Var = this.f59952i;
            if (s5Var == null || (aVar = this.f59951h) == null) {
                return;
            }
            aVar.b(s5Var);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoResumed() {
        a aVar;
        if (a(2)) {
            this.f59945b.i();
            this.f59944a.a(this.f59946c);
            s5 s5Var = this.f59952i;
            if (s5Var == null || (aVar = this.f59951h) == null) {
                return;
            }
            aVar.a(s5Var);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStarted() {
        if (a(2)) {
            this.f59944a.a(this.f59946c);
            s5 s5Var = this.f59952i;
            if (s5Var == null) {
                return;
            }
            a aVar = this.f59951h;
            if (aVar != null) {
                aVar.c(s5Var);
            }
            if (this.f59950g == null) {
                return;
            }
            bc bcVar = this.f59947d;
            if (bcVar != null && !bcVar.c()) {
                this.f59947d.c(this.f59950g.getView());
            }
            s5 s5Var2 = this.f59952i;
            if (s5Var2 != null) {
                float fO = s5Var2.o();
                a(fO, 0.0f, fO);
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStopped() {
        a aVar;
        if (a(5)) {
            this.f59945b.j();
            bc bcVar = this.f59947d;
            if (bcVar != null) {
                bcVar.e();
            }
            this.f59944a.b(this.f59946c);
            s5 s5VarB = b();
            if (s5VarB == null || (aVar = this.f59951h) == null) {
                return;
            }
            aVar.e(s5VarB);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onVolumeChanged(float f10) {
        this.f59945b.b(this.f59956m, f10);
        this.f59956m = f10;
    }

    public void a(a aVar) {
        this.f59951h = aVar;
    }

    public void a(s5 s5Var, boolean z10) {
        InstreamAdPlayer instreamAdPlayer;
        if (a(1)) {
            this.f59958o = 0.0f;
            this.f59952i = s5Var;
            this.f59945b.a(s5Var);
            this.f59948e = cc.a(s5Var.x());
            l8 l8Var = this.f59949f;
            if (l8Var != null) {
                l8Var.a();
            }
            bc bcVar = this.f59947d;
            if (bcVar != null) {
                bcVar.e();
                this.f59947d = null;
            }
            InstreamAdPlayer instreamAdPlayer2 = this.f59950g;
            if (instreamAdPlayer2 != null) {
                View view = instreamAdPlayer2.getView();
                this.f59948e.a(view);
                if (!z10) {
                    this.f59949f = l8.a(s5Var, 3, this.f59952i, view.getContext());
                    this.f59947d = bc.b(s5Var.E(), s5Var.x());
                }
            }
            this.f59945b.a(this.f59949f);
            this.f59945b.a(new q8.a() { // from class: k5.x0
                @Override // com.my.target.q8.a
                public final void a() {
                    this.f86158a.h();
                }
            });
            VideoData videoData = (VideoData) s5Var.k0();
            if (videoData == null || (instreamAdPlayer = this.f59950g) == null) {
                return;
            }
            instreamAdPlayer.setVolume(this.f59955l);
            this.f59950g.playAdVideo(Uri.parse(videoData.getUrl()), videoData.getWidth(), videoData.getHeight());
        }
    }

    public void b(int i10) {
        this.f59954k = i10;
    }

    public void b(float f10) {
        InstreamAdPlayer instreamAdPlayer = this.f59950g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.setVolume(f10);
        }
        this.f59955l = f10;
    }

    public s5 b() {
        s5 s5Var = this.f59952i;
        this.f59952i = null;
        cc ccVar = this.f59948e;
        if (ccVar != null) {
            ccVar.a();
            this.f59948e = null;
        }
        bc bcVar = this.f59947d;
        if (bcVar != null) {
            bcVar.e();
            this.f59947d = null;
        }
        l8 l8Var = this.f59949f;
        if (l8Var != null) {
            l8Var.a();
        }
        return s5Var;
    }

    public void a(s5 s5Var) {
        a(s5Var, false);
    }

    public void a() {
        float adVideoDuration;
        float adVideoPosition;
        float f10;
        InstreamAdPlayer instreamAdPlayer;
        s5 s5Var = this.f59952i;
        if (s5Var == null) {
            this.f59944a.b(this.f59946c);
            return;
        }
        float fO = s5Var.o();
        boolean z10 = this.f59953j == 2;
        if (!z10 || (instreamAdPlayer = this.f59950g) == null) {
            adVideoDuration = 0.0f;
            adVideoPosition = 0.0f;
            f10 = 0.0f;
        } else {
            adVideoDuration = instreamAdPlayer.getAdVideoDuration();
            adVideoPosition = this.f59950g.getAdVideoPosition();
            f10 = fO - adVideoPosition;
        }
        if (z10 && this.f59958o != adVideoPosition && adVideoDuration > 0.0f) {
            a(f10, adVideoPosition, fO);
        } else {
            this.f59957n++;
        }
        if (this.f59957n >= (this.f59954k * 1000) / 200) {
            g();
        }
    }

    public void a(float f10, float f11, float f12) {
        s5 s5Var;
        this.f59957n = 0;
        this.f59958o = f11;
        if (f11 >= f12) {
            a(f12);
            return;
        }
        this.f59945b.a(f11, f12);
        cc ccVar = this.f59948e;
        if (ccVar != null) {
            ccVar.a(f11, f12);
        }
        a aVar = this.f59951h;
        if (aVar == null || (s5Var = this.f59952i) == null) {
            return;
        }
        aVar.a(f10, f12, s5Var);
    }

    public void a(float f10) {
        if (a(4)) {
            this.f59945b.a(f10, f10);
            this.f59958o = f10;
            this.f59944a.b(this.f59946c);
            cc ccVar = this.f59948e;
            if (ccVar != null) {
                ccVar.a(f10, f10);
            }
            s5 s5VarB = b();
            if (s5VarB == null) {
                return;
            }
            a aVar = this.f59951h;
            if (aVar != null) {
                aVar.a(0.0f, f10, s5VarB);
            }
            if (this.f59951h != null) {
                this.f59945b.e();
                this.f59951h.d(s5VarB);
            }
        }
    }

    public boolean a(int i10) {
        int i11 = this.f59953j;
        boolean z10 = false;
        if (i10 != i11) {
            switch (i10) {
                case 1:
                case 6:
                    z10 = true;
                    break;
                case 2:
                    if (i11 == 1 || i11 == 3) {
                        z10 = true;
                    }
                    break;
                case 3:
                    if (i11 == 1 || i11 == 2) {
                        z10 = true;
                    }
                    break;
                case 4:
                    if (i11 == 1 || i11 == 2 || i11 == 5) {
                        z10 = true;
                    }
                    break;
                case 5:
                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                        z10 = true;
                    }
                    break;
            }
        }
        if (z10) {
            gb.a("InstreamAdVideoController: state has been changed from " + this.f59953j + " to " + i10);
            this.f59953j = i10;
            return z10;
        }
        gb.a("InstreamAdVideoController: wrong state transition from " + this.f59953j + " to " + i10);
        return z10;
    }
}
