package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ws2 extends em1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oh3 f117554d;

    public ws2(CustomizableMediaView customizableMediaView, mm1 mm1Var, oh3 oh3Var) {
        super(customizableMediaView, mm1Var);
        this.f117554d = oh3Var;
    }

    @Override // yads.nh3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f117554d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.em1
    public final dm1 d() {
        return dm1.f109977f;
    }

    @Override // yads.nh3
    public final void a(gi giVar, qh3 qh3Var, Object obj) {
        am1 am1Var = (am1) obj;
        this.f117554d.a(giVar, qh3Var, a(am1Var != null ? am1Var.f108721c : null));
    }

    public static d31 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (d31) list.get(0);
    }

    @Override // yads.em1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f117554d.a();
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        d31 d31VarA = a(((am1) obj).f108721c);
        if (d31VarA != null) {
            return this.f117554d.a(d31VarA);
        }
        return false;
    }

    @Override // yads.em1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, am1 am1Var) {
        super.b(customizableMediaView, am1Var);
        d31 d31VarA = a(am1Var.f108721c);
        if (d31VarA == null) {
            return;
        }
        this.f117554d.b(d31VarA);
    }

    @Override // yads.em1
    public final void a(am1 am1Var) {
        d31 d31VarA = a(am1Var.f108721c);
        if (d31VarA == null) {
            return;
        }
        this.f117554d.b(d31VarA);
    }
}
