package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.Surface;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.mediaplayer.p f21480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f21482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21484t;

    public a(Context context) {
        super(context);
        this.f21481q = 0;
        this.f21482r = 2;
        this.f21483s = 0;
        this.f21484t = false;
        IAlog.a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            pVar.reset();
            this.f21480p.release();
            this.f21480p = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        if (g() && this.f21535n) {
            return;
        }
        this.f21535n = z10;
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            return pVar.f23310r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        if (g() || !this.f21535n) {
            this.f21535n = z10;
            com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
            if (pVar != null) {
                IAlog.a("%s unmute", pVar.b());
                pVar.f23296d = false;
                if (pVar.a()) {
                    pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.m(pVar));
                } else {
                    IAlog.a("%s unmute called when player is not ready!", pVar.b());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            return pVar.f23312t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            return pVar.f23311s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            return pVar.f23296d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            pVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            pVar.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            return pVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", pVar.b(), Integer.valueOf(i10), Boolean.valueOf(z10));
            if (!pVar.a()) {
                IAlog.a("%s seek called when player is not ready!", pVar.b());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f23294b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                IAlog.a("%s seek called when player is already seeking!", pVar.b());
                return;
            }
            pVar.a(bVar2);
            pVar.f23295c = z10;
            pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.j(pVar, i10));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f21480p;
        if (pVar != null) {
            pVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f21480p == null) {
            IAlog.a("MediaPlayerController: creating media player", new Object[0]);
            this.f21480p = new com.fyber.inneractive.sdk.player.mediaplayer.p(this.f21522a, this, this.f21530i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(String str, int i10) {
        this.f21480p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10) {
        this.f21530i.post(new l(this, i10));
        if (i10 >= c()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i10 == this.f21481q) {
            IAlog.a("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i11 = this.f21483s + 1;
            this.f21483s = i11;
            if (i11 == this.f21482r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.f21484t = true;
            }
        } else if (this.f21484t) {
            IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.f21483s = 0;
            this.f21484t = false;
        }
        this.f21481q = i10;
    }
}
