package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f4021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Guideline f4022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RatingBar f4023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f4024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f4025i;

    private q(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, Guideline guideline, RatingBar ratingBar, TextView textView3, ConstraintLayout constraintLayout3) {
        this.f4017a = constraintLayout;
        this.f4018b = imageView;
        this.f4019c = textView;
        this.f4020d = textView2;
        this.f4021e = constraintLayout2;
        this.f4022f = guideline;
        this.f4023g = ratingBar;
        this.f4024h = textView3;
        this.f4025i = constraintLayout3;
    }

    public static q a(View view) {
        int i10 = R.id.experienceImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.experienceImageView);
        if (imageView != null) {
            i10 = R.id.experienceLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.experienceLabel);
            if (textView != null) {
                i10 = R.id.firstActionLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.firstActionLabel);
                if (textView2 != null) {
                    i10 = R.id.firstActionView;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.firstActionView);
                    if (constraintLayout != null) {
                        i10 = R.id.guideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline);
                        if (guideline != null) {
                            i10 = R.id.ratingBar;
                            RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(view, R.id.ratingBar);
                            if (ratingBar != null) {
                                i10 = R.id.secondActionLabel;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.secondActionLabel);
                                if (textView3 != null) {
                                    i10 = R.id.secondActionView;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.secondActionView);
                                    if (constraintLayout2 != null) {
                                        return new q((ConstraintLayout) view, imageView, textView, textView2, constraintLayout, guideline, ratingBar, textView3, constraintLayout2);
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

    public static q c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_rating, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4017a;
    }
}
