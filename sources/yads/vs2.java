package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vs2 implements gm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f117167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f117168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final km1 f117169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm1 f117170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm1 f117171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final im1 f117172f;

    public vs2(es2 es2Var, t9 t9Var, km1 km1Var, hm1 hm1Var, jm1 jm1Var, im1 im1Var) {
        this.f117167a = es2Var;
        this.f117168b = t9Var;
        this.f117169c = km1Var;
        this.f117170d = hm1Var;
        this.f117171e = jm1Var;
        this.f117172f = im1Var;
    }

    public final em1 a(CustomizableMediaView customizableMediaView, es2 es2Var, hg2 hg2Var, mm1 mm1Var, zv2 zv2Var, am1 am1Var) {
        CustomizableMediaView customizableMediaView2;
        hg2 hg2Var2;
        mm1 mm1Var2;
        List list = am1Var.f108721c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return this.f117170d.a(customizableMediaView, hg2Var, mm1Var);
        }
        try {
            customizableMediaView2 = customizableMediaView;
            hg2Var2 = hg2Var;
            mm1Var2 = mm1Var;
            try {
                return this.f117171e.a(this.f117168b, es2Var, customizableMediaView2, hg2Var2, list, mm1Var2, zv2Var);
            } catch (Throwable unused) {
                return this.f117170d.a(customizableMediaView2, hg2Var2, mm1Var2);
            }
        } catch (Throwable unused2) {
            customizableMediaView2 = customizableMediaView;
            hg2Var2 = hg2Var;
            mm1Var2 = mm1Var;
        }
    }

    @Override // yads.gm1
    public final em1 a(CustomizableMediaView customizableMediaView, c4 c4Var, hg2 hg2Var, sj1 sj1Var, g41 g41Var, r22 r22Var, u12 u12Var, rx1 rx1Var, mm1 mm1Var, zv2 zv2Var, am1 am1Var) {
        vs2 vs2Var;
        em1 em1VarA = null;
        em1VarA = null;
        em1VarA = null;
        em1VarA = null;
        if (am1Var == null) {
            return null;
        }
        q42 q42Var = r22Var.f115285a;
        b62 b62Var = r22Var.f115286b;
        ai1 ai1Var = am1Var.f108719a;
        Context context = customizableMediaView.getContext();
        Context context2 = customizableMediaView.getContext();
        zp0 zp0Var = zp0.f118752e;
        boolean zA = aq0.a(context2, zp0Var);
        if (zA) {
            customizableMediaView.removeAllViews();
        }
        if (q42Var != null) {
            gb3 gb3Var = am1Var.f108720b;
            km1 km1Var = this.f117169c;
            km1Var.getClass();
            Context context3 = customizableMediaView.getContext();
            km1Var.f112759e.f112596a.getClass();
            pg3 videoScaleType = customizableMediaView.getVideoScaleType();
            if (videoScaleType == null) {
                videoScaleType = pg3.f114670b;
            }
            w42 w42Var = km1Var.f112760f;
            rg3 rg3Var = gb3Var != null ? gb3Var.f111137b : null;
            w42Var.getClass();
            lf3 lf3Var = new lf3(videoScaleType, rg3Var != null ? rg3Var.f115441a : true, rg3Var != null ? rg3Var.f115442b : false, rg3Var != null ? rg3Var.f115444d : null);
            km1Var.f112758d.getClass();
            r52 r52VarA = km1Var.f112761g.a(context3, lf3Var, sj1Var, gb3Var, customizableMediaView.getVideoControlsLayoutId());
            km1Var.f112757c.getClass();
            if (!aq0.a(customizableMediaView.getContext(), zp0Var)) {
                customizableMediaView.removeAllViews();
            }
            customizableMediaView.addView(r52VarA, new FrameLayout.LayoutParams(-1, -1));
            zs2 zs2Var = new zs2(customizableMediaView, mm1Var, new oh3(new jh3(km1Var.f112755a, r52VarA, lf3Var, c4Var, km1Var.f112756b, g41Var, q42Var, u12Var, rx1Var, hg2Var, zv2Var, new hh3())));
            kx2 kx2Var = zv2Var != null ? zv2Var.f118851e : null;
            if (kx2Var == null || !zA) {
                vs2Var = this;
            } else {
                em1 em1VarA2 = a(customizableMediaView, this.f117167a, hg2Var, mm1Var, zv2Var, am1Var);
                vs2Var = this;
                if (em1VarA2 != null) {
                    em1VarA = new dt2(customizableMediaView, zs2Var, em1VarA2, mm1Var, kx2Var);
                }
            }
            em1VarA = zs2Var;
        } else {
            vs2Var = this;
            if (b62Var != null && ai1Var != null && rb.a(context)) {
                try {
                    em1VarA = vs2Var.f117172f.a(customizableMediaView, ai1Var, g41Var, b62Var, mm1Var);
                } catch (dl3 unused) {
                }
            }
        }
        if (em1VarA == null) {
            return vs2Var.a(customizableMediaView, vs2Var.f117167a, hg2Var, mm1Var, zv2Var, am1Var);
        }
        return em1VarA;
    }
}
