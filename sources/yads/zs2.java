package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class zs2 extends em1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oh3 f118798d;

    public zs2(CustomizableMediaView customizableMediaView, mm1 mm1Var, oh3 oh3Var) {
        super(customizableMediaView, mm1Var);
        this.f118798d = oh3Var;
    }

    @Override // yads.em1
    public final void a(am1 am1Var) {
    }

    @Override // yads.em1
    public final dm1 d() {
        return dm1.f109975d;
    }

    @Override // yads.nh3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f118798d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        am1 am1Var = (am1) obj;
        this.f118798d.a(giVar, qh3Var, am1Var != null ? am1Var.f108720b : null);
    }

    @Override // yads.nh3
    public final void a() {
        this.f118798d.f114324a.a();
    }

    @Override // yads.em1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f118798d.a();
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        gb3 gb3Var = ((am1) obj).f108720b;
        if (gb3Var != null) {
            return this.f118798d.a(gb3Var);
        }
        return false;
    }

    @Override // yads.em1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, am1 am1Var) {
        super.b(customizableMediaView, am1Var);
        gb3 gb3Var = am1Var.f108720b;
        if (gb3Var == null) {
            return;
        }
        this.f118798d.b(gb3Var);
    }
}
