package sg.bigo.ads.ad.b.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends sg.bigo.ads.ad.b.b implements sg.bigo.ads.common.p.g {
    public boolean I;
    public boolean J;

    public c(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.I = false;
        this.J = false;
    }

    @Override // sg.bigo.ads.ad.c
    @NonNull
    public final sg.bigo.ads.core.e.a.b a(q qVar, sg.bigo.ads.core.e.a.e[] eVarArr, sg.bigo.ads.core.e.a.e[] eVarArr2, sg.bigo.ads.core.e.a.e[] eVarArr3, sg.bigo.ads.core.e.a.e[] eVarArr4) {
        return new sg.bigo.ads.core.e.a.a(qVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.core.d.b.c(this.f100335b.f102174a, this));
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(int i10, @NonNull String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "IconAds", "icon download fail, error=" + i10 + ", errorMsg=" + str);
        this.J = true;
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "IconAds", "icon download success, url = " + fVar.f102683e);
        this.I = true;
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull d.a<NativeAd> aVar, int i10) {
        aVar.a(this);
    }

    @Override // sg.bigo.ads.ad.b.b
    public final boolean a(@NonNull ViewGroup viewGroup, View view, int i10) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (view != null && aVar != null) {
            view.setTag(1);
            if (sg.bigo.ads.ad.b.b.a(viewGroup, view)) {
                n.a aVarAv = aVar.av();
                if (aVarAv != null) {
                    String strC = aVarAv.c();
                    if (i.f102116a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                        sg.bigo.ads.core.d.b.a(aVar, 3000, 10220, "Invalid http url: ".concat(String.valueOf(strC)));
                    } else if (view instanceof ImageView) {
                        sg.bigo.ads.common.p.b bVar = new sg.bigo.ads.common.p.b((ImageView) view, (byte) 0);
                        bVar.a(this);
                        bVar.a(sg.bigo.ads.common.u.a.e.i(), aVarAv.c(), aVar.al());
                    } else if (view instanceof AdIconView) {
                        ((AdIconView) view).a(sg.bigo.ads.common.u.a.e.i(), aVarAv.c(), aVar.al(), this);
                    }
                }
                sg.bigo.ads.ad.b.a.a(viewGroup, view, i10, this, this.H);
                return true;
            }
        }
        return false;
    }
}
