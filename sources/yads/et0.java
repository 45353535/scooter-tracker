package yads;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R$drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class et0 extends nh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h21 f110457c;

    public et0(ImageView imageView, h21 h21Var) {
        super(imageView);
        this.f110457c = h21Var;
    }

    @Override // yads.nh3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.nh3
    public final void b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        d31 d31Var = ((bt0) obj).f109095a;
        if (d31Var == null) {
            return;
        }
        imageView.setForeground(null);
        imageView.setBackground(null);
        a(d31Var);
    }

    public final void a(d31 d31Var) {
        this.f110457c.a(d31Var, new e21() { // from class: yads.j6
            @Override // yads.e21
            public final void a(Drawable drawable) {
                et0.a(this.f112239a, drawable);
            }
        });
    }

    public static final void a(et0 et0Var, Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = (ImageView) et0Var.b();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) et0Var.b();
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(imageView2.getContext(), R$drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }
}
