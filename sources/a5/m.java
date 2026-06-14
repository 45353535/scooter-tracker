package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f3996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f3998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f3999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f4001h;

    private m(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView2, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3) {
        this.f3994a = constraintLayout;
        this.f3995b = imageView;
        this.f3996c = constraintLayout2;
        this.f3997d = textView;
        this.f3998e = imageView2;
        this.f3999f = constraintLayout3;
        this.f4000g = textView2;
        this.f4001h = textView3;
    }

    public static m a(View view) {
        int i10 = R.id.adjustImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.adjustImageView);
        if (imageView != null) {
            i10 = R.id.adjustView;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.adjustView);
            if (constraintLayout != null) {
                i10 = R.id.odometerLabel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.odometerLabel);
                if (textView != null) {
                    i10 = R.id.resetImageView;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.resetImageView);
                    if (imageView2 != null) {
                        i10 = R.id.resetView;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.resetView);
                        if (constraintLayout2 != null) {
                            i10 = R.id.titleLabel;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                            if (textView2 != null) {
                                i10 = R.id.unitLabel;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.unitLabel);
                                if (textView3 != null) {
                                    return new m((ConstraintLayout) view, imageView, constraintLayout, textView, imageView2, constraintLayout2, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static m d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_odometer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3994a;
    }
}
