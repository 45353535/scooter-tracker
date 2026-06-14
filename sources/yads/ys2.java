package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ys2 extends em1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oh3 f118372d;

    public ys2(CustomizableMediaView customizableMediaView, mm1 mm1Var, oh3 oh3Var) {
        super(customizableMediaView, mm1Var);
        this.f118372d = oh3Var;
    }

    @Override // yads.nh3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f118372d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.em1
    public final dm1 d() {
        return dm1.f109976e;
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        am1 am1Var = (am1) obj;
        this.f118372d.a(giVar, qh3Var, am1Var != null ? am1Var.f108721c : null);
    }

    @Override // yads.em1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f118372d.a();
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        List list = ((am1) obj).f108721c;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return this.f118372d.a(list);
    }

    @Override // yads.em1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, am1 am1Var) {
        super.b(customizableMediaView, am1Var);
        List list = am1Var.f108721c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f118372d.b(list);
    }

    @Override // yads.em1
    public final void a(am1 am1Var) {
        List list = am1Var.f108721c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f118372d.b(list);
    }
}
