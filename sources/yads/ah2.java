package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class ah2 implements e21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f108687c = {ub.a(ah2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), ub.a(ah2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f108688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk2 f108689b;

    public ah2(ImageView imageView, ProgressBar progressBar) {
        this.f108688a = hk2.a(imageView);
        this.f108689b = hk2.a(progressBar);
    }

    @Override // yads.e21
    public final void a(Drawable drawable) {
        if (drawable == null) {
            gk2 gk2Var = this.f108689b;
            KProperty kProperty = f108687c[1];
            ProgressBar progressBar = (ProgressBar) gk2Var.f111244a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        gk2 gk2Var2 = this.f108688a;
        KProperty[] kPropertyArr = f108687c;
        KProperty kProperty2 = kPropertyArr[0];
        ImageView imageView = (ImageView) gk2Var2.f111244a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        gk2 gk2Var3 = this.f108689b;
        KProperty kProperty3 = kPropertyArr[1];
        ProgressBar progressBar2 = (ProgressBar) gk2Var3.f111244a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
