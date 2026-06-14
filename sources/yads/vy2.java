package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class vy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy2 f117251a = new yy2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl f117252b = new tl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to f117253c = new to();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xy2 f117254d;

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.f117254d);
    }

    public final void a(Drawable drawable, ImageView imageView, d31 d31Var) {
        xy2 xy2Var = new xy2(this.f117252b, this.f117253c, this.f117251a, d31Var, drawable);
        this.f117254d = xy2Var;
        imageView.addOnLayoutChangeListener(xy2Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }
}
