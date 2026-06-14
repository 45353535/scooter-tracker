package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wv1 extends nh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hg2 f117608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm2 f117609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t9 f117610e;

    public wv1(ViewPager2 viewPager2, hg2 hg2Var, mr1 mr1Var, t9 t9Var) {
        super(viewPager2);
        this.f117608c = hg2Var;
        this.f117609d = mr1Var;
        this.f117610e = t9Var;
    }

    @Override // yads.nh3
    public final boolean a(View view, Object obj) {
        return ((ViewPager2) view).getAdapter() instanceof tv1;
    }

    @Override // yads.nh3
    public final void b(View view, Object obj) {
        try {
            ((ViewPager2) view).setAdapter(new tv1(this.f117608c, (List) obj, this.f117610e));
        } catch (IllegalArgumentException e10) {
            dm2 dm2Var = this.f117609d;
            String message = e10.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            dm2Var.reportError(message, e10);
        }
    }
}
