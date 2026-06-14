package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f3964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f3965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f3966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f3967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f3968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f3970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f3971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f3972j;

    private h(ConstraintLayout constraintLayout, Button button, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView2, Button button2, TextView textView3, ImageView imageView2) {
        this.f3963a = constraintLayout;
        this.f3964b = button;
        this.f3965c = textView;
        this.f3966d = constraintLayout2;
        this.f3967e = constraintLayout3;
        this.f3968f = imageView;
        this.f3969g = textView2;
        this.f3970h = button2;
        this.f3971i = textView3;
        this.f3972j = imageView2;
    }

    public static h a(View view) {
        int i10 = R.id.adButton;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.adButton);
        if (button != null) {
            i10 = R.id.adSmallLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.adSmallLabel);
            if (textView != null) {
                i10 = R.id.adSmallView;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.adSmallView);
                if (constraintLayout != null) {
                    i10 = R.id.adView;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.adView);
                    if (constraintLayout2 != null) {
                        i10 = R.id.closeImage;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closeImage);
                        if (imageView != null) {
                            i10 = R.id.detailLabel;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.detailLabel);
                            if (textView2 != null) {
                                i10 = R.id.premiumButton;
                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.premiumButton);
                                if (button2 != null) {
                                    i10 = R.id.titleLabel;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                    if (textView3 != null) {
                                        i10 = R.id.walkthroughImage;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.walkthroughImage);
                                        if (imageView2 != null) {
                                            return new h((ConstraintLayout) view, button, textView, constraintLayout, constraintLayout2, imageView, textView2, button2, textView3, imageView2);
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

    public static h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_floating_walkthrough, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3963a;
    }
}
