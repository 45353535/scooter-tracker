package yads;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nj2 extends nh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm2 f113941c;

    public nj2(View view, dm2 dm2Var) {
        super(view);
        this.f113941c = dm2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.nh3
    public final void a(View view) {
        ((pj2) view).setRating(0.0f);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.nh3
    public final void b(View view, Object obj) {
        String str = (String) obj;
        try {
            ((pj2) view).setRating(kotlin.ranges.g.d(Float.parseFloat(str), 0.0f));
        } catch (NumberFormatException e10) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = lb1.f113032a;
            this.f113941c.reportError("Could not parse rating value", e10);
        }
    }

    @Override // yads.nh3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
