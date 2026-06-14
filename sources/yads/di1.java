package yads;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class di1 implements hi, ye0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l31 f109934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em1 f109935b;

    public di1(l31 l31Var, em1 em1Var) {
        this.f109934a = l31Var;
        this.f109935b = em1Var;
    }

    @Override // yads.hi
    public final void a() {
        em1 em1Var;
        l31 l31Var;
        ImageView imageView = (ImageView) a((nh3) this.f109934a);
        if (imageView != null && (l31Var = this.f109934a) != null) {
            imageView.setImageDrawable(null);
            l31Var.f112941e.a(imageView);
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setSelected(false);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((nh3) this.f109935b);
        if (customizableMediaView == null || (em1Var = this.f109935b) == null) {
            return;
        }
        em1Var.a((View) customizableMediaView);
    }

    @Override // yads.hi
    public final boolean b() {
        em1 em1Var = this.f109935b;
        if (em1Var != null && em1Var.b() != null) {
            return true;
        }
        l31 l31Var = this.f109934a;
        return (l31Var == null || l31Var.b() == null) ? false : true;
    }

    @Override // yads.hi
    public final fi3 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((nh3) this.f109935b);
        ImageView imageView = (ImageView) a((nh3) this.f109934a);
        if (customizableMediaView != null) {
            return new fi3(customizableMediaView.getWidth(), customizableMediaView.getHeight());
        }
        if (imageView != null) {
            return new fi3(imageView.getWidth(), imageView.getHeight());
        }
        return null;
    }

    @Override // yads.hi
    public final boolean d() {
        em1 em1Var = this.f109935b;
        boolean z10 = em1Var != null && qi3.a(em1Var.b()) >= 100;
        l31 l31Var = this.f109934a;
        return z10 || (l31Var != null && qi3.a(l31Var.b()) >= 100);
    }

    @Override // yads.hi
    public final void destroy() {
        em1 em1Var = this.f109935b;
        if (em1Var != null) {
            em1Var.a();
        }
    }

    @Override // yads.hi
    public final boolean e() {
        l31 l31Var;
        em1 em1Var = this.f109935b;
        return (em1Var != null && em1Var.c()) || ((l31Var = this.f109934a) != null && l31Var.c());
    }

    @Override // yads.ye0
    public final void b(Object obj) {
        am1 am1Var = (am1) obj;
        d31 d31VarA = a(am1Var.f108721c);
        ImageView imageView = (ImageView) a((nh3) this.f109934a);
        if (imageView != null && d31VarA != null) {
            l31 l31Var = this.f109934a;
            if (l31Var != null) {
                l31Var.a(d31VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((nh3) this.f109935b);
        if (customizableMediaView == null) {
            return;
        }
        em1 em1Var = this.f109935b;
        if (em1Var != null) {
            em1Var.a(am1Var);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // yads.hi
    public final void c(Object obj) {
        am1 am1Var = (am1) obj;
        d31 d31VarA = a(am1Var.f108721c);
        ImageView imageView = (ImageView) a((nh3) this.f109934a);
        if (imageView != null && d31VarA != null) {
            l31 l31Var = this.f109934a;
            if (l31Var != null) {
                l31Var.a(d31VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((nh3) this.f109935b);
        if (customizableMediaView != null) {
            em1 em1Var = this.f109935b;
            if (em1Var != null) {
                em1Var.b(customizableMediaView, am1Var);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // yads.hi
    public final void a(gi giVar, qh3 qh3Var) {
        am1 am1Var = (am1) giVar.f111215c;
        l31 l31Var = this.f109934a;
        if (l31Var != null) {
            l31Var.a(giVar, qh3Var, a(am1Var.f108721c));
        }
        em1 em1Var = this.f109935b;
        if (em1Var != null) {
            em1Var.a(giVar, qh3Var, am1Var);
        }
    }

    public static View a(nh3 nh3Var) {
        if (nh3Var != null) {
            return nh3Var.b();
        }
        return null;
    }

    public static d31 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (d31) list.get(0);
    }

    @Override // yads.hi
    public final boolean a(Object obj) {
        am1 am1Var = (am1) obj;
        l31 l31Var = this.f109934a;
        d31 d31VarA = a(am1Var.f108721c);
        View viewA = a((nh3) l31Var);
        boolean z10 = (viewA == null || d31VarA == null || l31Var == null || !l31Var.a(viewA, d31VarA)) ? false : true;
        em1 em1Var = this.f109935b;
        View viewA2 = a((nh3) em1Var);
        return z10 || (viewA2 != null && em1Var != null && em1Var.a(viewA2, am1Var));
    }
}
