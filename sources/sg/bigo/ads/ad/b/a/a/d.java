package sg.bigo.ads.ad.b.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.b.a.e;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e implements f {
    public boolean O;
    public boolean P;
    private sg.bigo.ads.api.b.e Q;

    public d(@NonNull sg.bigo.ads.api.core.f fVar, sg.bigo.ads.api.b.e eVar) {
        super(fVar);
        this.O = false;
        this.P = true;
        this.Q = eVar;
    }

    @Override // sg.bigo.ads.api.b.f
    public final boolean K() {
        return this.O;
    }

    @Override // sg.bigo.ads.api.b.f
    public final void L() {
        if (this.Q != null) {
            ((sg.bigo.ads.core.a.a) f()).n(this.Q.c(this));
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(VideoController videoController, boolean z10) {
        if (videoController != null) {
            if (i_() != 2 || this.O) {
                videoController.mute(z10);
            } else {
                videoController.mute(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void b(@Nullable i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        if (this.Q != null) {
            ((sg.bigo.ads.core.a.a) f()).n(this.Q.c(this));
        }
        super.b(iVar, i10, i11, dVar);
    }

    @Override // sg.bigo.ads.ad.b.a.e, sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (f() != 0) {
            sg.bigo.ads.core.player.b.a().a(((sg.bigo.ads.core.a.a) f()).aJ());
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public final boolean e(int i10) {
        return this.P;
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void h() {
        if (this.Q != null) {
            ((sg.bigo.ads.core.a.a) f()).m(this.Q.b(this));
        }
        super.h();
    }

    @Override // sg.bigo.ads.api.b.f
    public final void h_() {
        sg.bigo.ads.api.b.e eVar = this.Q;
        if (eVar != null) {
            eVar.K();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final int i() {
        return ((sg.bigo.ads.core.a.a) f()).bn();
    }

    @Override // sg.bigo.ads.api.b.f
    public final int i_() {
        sg.bigo.ads.api.b.e eVar = this.Q;
        if (eVar != null) {
            return eVar.L();
        }
        return 3;
    }

    @Override // sg.bigo.ads.ad.c
    public final int k() {
        return ((sg.bigo.ads.core.a.a) f()).bo();
    }
}
