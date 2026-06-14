package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RadioButton f4028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f4029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioButton f4030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RadioButton f4031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RadioButton f4032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RadioButton f4033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RadioGroup f4034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f4035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f4036k;

    private r(ConstraintLayout constraintLayout, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioButton radioButton6, RadioGroup radioGroup, TextView textView, View view) {
        this.f4026a = constraintLayout;
        this.f4027b = imageView;
        this.f4028c = radioButton;
        this.f4029d = radioButton2;
        this.f4030e = radioButton3;
        this.f4031f = radioButton4;
        this.f4032g = radioButton5;
        this.f4033h = radioButton6;
        this.f4034i = radioGroup;
        this.f4035j = textView;
        this.f4036k = view;
    }

    public static r a(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.resolutionButton1;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.resolutionButton1);
            if (radioButton != null) {
                i10 = R.id.resolutionButton2;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.resolutionButton2);
                if (radioButton2 != null) {
                    i10 = R.id.resolutionButton3;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.resolutionButton3);
                    if (radioButton3 != null) {
                        i10 = R.id.resolutionButton4;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.resolutionButton4);
                        if (radioButton4 != null) {
                            i10 = R.id.resolutionButton5;
                            RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.resolutionButton5);
                            if (radioButton5 != null) {
                                i10 = R.id.resolutionButton6;
                                RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, R.id.resolutionButton6);
                                if (radioButton6 != null) {
                                    i10 = R.id.resolutionGroup;
                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.resolutionGroup);
                                    if (radioGroup != null) {
                                        i10 = R.id.titleLabel;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                        if (textView != null) {
                                            i10 = R.id.view;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.view);
                                            if (viewFindChildViewById != null) {
                                                return new r((ConstraintLayout) view, imageView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioGroup, textView, viewFindChildViewById);
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

    public static r c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static r d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_resolution, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4026a;
    }
}
