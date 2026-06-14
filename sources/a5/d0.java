package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;
import com.ktwapps.speedometer.Widget.ColorOptionView;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorOptionView f3869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorOptionView f3870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorOptionView f3871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ColorOptionView f3872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ColorOptionView f3873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ColorOptionView f3874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f3875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HorizontalScrollView f3876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f3877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f3878k;

    private d0(ConstraintLayout constraintLayout, ColorOptionView colorOptionView, ColorOptionView colorOptionView2, ColorOptionView colorOptionView3, ColorOptionView colorOptionView4, ColorOptionView colorOptionView5, ColorOptionView colorOptionView6, ImageView imageView, HorizontalScrollView horizontalScrollView, TextView textView, ConstraintLayout constraintLayout2) {
        this.f3868a = constraintLayout;
        this.f3869b = colorOptionView;
        this.f3870c = colorOptionView2;
        this.f3871d = colorOptionView3;
        this.f3872e = colorOptionView4;
        this.f3873f = colorOptionView5;
        this.f3874g = colorOptionView6;
        this.f3875h = imageView;
        this.f3876i = horizontalScrollView;
        this.f3877j = textView;
        this.f3878k = constraintLayout2;
    }

    public static d0 a(View view) {
        int i10 = R.id.colorBlueView;
        ColorOptionView colorOptionView = (ColorOptionView) ViewBindings.findChildViewById(view, R.id.colorBlueView);
        if (colorOptionView != null) {
            i10 = R.id.colorGreenView;
            ColorOptionView colorOptionView2 = (ColorOptionView) ViewBindings.findChildViewById(view, R.id.colorGreenView);
            if (colorOptionView2 != null) {
                i10 = R.id.colorOrangeView;
                ColorOptionView colorOptionView3 = (ColorOptionView) ViewBindings.findChildViewById(view, R.id.colorOrangeView);
                if (colorOptionView3 != null) {
                    i10 = R.id.colorPurpleView;
                    ColorOptionView colorOptionView4 = (ColorOptionView) ViewBindings.findChildViewById(view, R.id.colorPurpleView);
                    if (colorOptionView4 != null) {
                        i10 = R.id.colorRedView;
                        ColorOptionView colorOptionView5 = (ColorOptionView) ViewBindings.findChildViewById(view, R.id.colorRedView);
                        if (colorOptionView5 != null) {
                            i10 = R.id.colorTealView;
                            ColorOptionView colorOptionView6 = (ColorOptionView) ViewBindings.findChildViewById(view, R.id.colorTealView);
                            if (colorOptionView6 != null) {
                                i10 = R.id.imageView;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                                if (imageView != null) {
                                    i10 = R.id.scrollView;
                                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                    if (horizontalScrollView != null) {
                                        i10 = R.id.titleLabel;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                        if (textView != null) {
                                            i10 = R.id.titleView;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.titleView);
                                            if (constraintLayout != null) {
                                                return new d0((ConstraintLayout) view, colorOptionView, colorOptionView2, colorOptionView3, colorOptionView4, colorOptionView5, colorOptionView6, imageView, horizontalScrollView, textView, constraintLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_setting_color, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3868a;
    }
}
