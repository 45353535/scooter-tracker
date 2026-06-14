package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class xs2 extends em1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oh3 f117957d;

    public xs2(CustomizableMediaView customizableMediaView, mm1 mm1Var, oh3 oh3Var) {
        super(customizableMediaView, mm1Var);
        this.f117957d = oh3Var;
    }

    @Override // yads.em1
    public final void a(am1 am1Var) {
    }

    @Override // yads.em1
    public final dm1 d() {
        return dm1.f109974c;
    }

    @Override // yads.nh3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f117957d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        am1 am1Var = (am1) obj;
        this.f117957d.a(giVar, qh3Var, am1Var != null ? am1Var.f108719a : null);
    }

    @Override // yads.em1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f117957d.a();
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        ai1 ai1Var = ((am1) obj).f108719a;
        if (ai1Var != null) {
            return this.f117957d.a(ai1Var);
        }
        return false;
    }

    @Override // yads.em1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, am1 am1Var) {
        super.b(customizableMediaView, am1Var);
        ai1 ai1Var = am1Var.f108719a;
        if (ai1Var == null) {
            return;
        }
        this.f117957d.b(ai1Var);
    }
}
