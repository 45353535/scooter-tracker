package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class em1 extends nh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mm1 f110422c;

    public em1(CustomizableMediaView customizableMediaView, mm1 mm1Var) {
        super(customizableMediaView);
        this.f110422c = mm1Var;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // yads.nh3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, am1 am1Var) {
        mm1 mm1Var = this.f110422c;
        dm1 dm1VarD = d();
        if (mm1Var.f113552c) {
            if (mm1Var.f113550a.f109194a == qz.f115224g) {
                lm1 lm1Var = new lm1(mm1Var, customizableMediaView, dm1VarD);
                cj3 cj3Var = qi3.f115019a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new pi3(customizableMediaView, lm1Var));
            }
            mm1Var.f113552c = false;
        }
    }

    public abstract void a(am1 am1Var);

    public abstract dm1 d();
}
