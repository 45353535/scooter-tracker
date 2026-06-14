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
import com.ktwapps.speedometer.Widget.DigitalTextView;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DigitalTextView f4111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DigitalTextView f4112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f4113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f4114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f4116h;

    private y(ConstraintLayout constraintLayout, ImageView imageView, DigitalTextView digitalTextView, DigitalTextView digitalTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2) {
        this.f4109a = constraintLayout;
        this.f4110b = imageView;
        this.f4111c = digitalTextView;
        this.f4112d = digitalTextView2;
        this.f4113e = constraintLayout2;
        this.f4114f = constraintLayout3;
        this.f4115g = textView;
        this.f4116h = textView2;
    }

    public static y a(View view) {
        int i10 = R.id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (imageView != null) {
            i10 = R.id.fontReading;
            DigitalTextView digitalTextView = (DigitalTextView) ViewBindings.findChildViewById(view, R.id.fontReading);
            if (digitalTextView != null) {
                i10 = R.id.fontUnit;
                DigitalTextView digitalTextView2 = (DigitalTextView) ViewBindings.findChildViewById(view, R.id.fontUnit);
                if (digitalTextView2 != null) {
                    i10 = R.id.fontView;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.fontView);
                    if (constraintLayout != null) {
                        i10 = R.id.normalView;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.normalView);
                        if (constraintLayout2 != null) {
                            i10 = R.id.reading;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.reading);
                            if (textView != null) {
                                i10 = R.id.unit;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.unit);
                                if (textView2 != null) {
                                    return new y((ConstraintLayout) view, imageView, digitalTextView, digitalTextView2, constraintLayout, constraintLayout2, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static y c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static y d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.floating_window, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4109a;
    }
}
