package sg.bigo.ads.ad.b.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.b.e;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends sg.bigo.ads.ad.b.a.d implements f {
    public boolean I;
    private e J;

    public c(@NonNull sg.bigo.ads.api.core.f fVar, e eVar) {
        super(fVar);
        this.I = false;
        this.J = eVar;
    }

    @Override // sg.bigo.ads.api.b.f
    public final boolean K() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.b.f
    public final void L() {
        if (this.J != null) {
            ((sg.bigo.ads.core.a.a) f()).n(this.J.c(this));
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void b(@Nullable i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        if (this.J != null) {
            ((sg.bigo.ads.core.a.a) f()).n(this.J.c(this));
        }
        super.b(iVar, i10, i11, dVar);
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void h() {
        if (this.J != null) {
            ((sg.bigo.ads.core.a.a) f()).m(this.J.b(this));
        }
        super.h();
    }

    @Override // sg.bigo.ads.api.b.f
    public final void h_() {
        e eVar = this.J;
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
        e eVar = this.J;
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
