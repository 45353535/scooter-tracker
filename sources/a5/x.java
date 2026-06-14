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
public final class x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RadioButton f4102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f4103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioButton f4104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RadioButton f4105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RadioGroup f4106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f4107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f4108i;

    private x(ConstraintLayout constraintLayout, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioGroup radioGroup, TextView textView, View view) {
        this.f4100a = constraintLayout;
        this.f4101b = imageView;
        this.f4102c = radioButton;
        this.f4103d = radioButton2;
        this.f4104e = radioButton3;
        this.f4105f = radioButton4;
        this.f4106g = radioGroup;
        this.f4107h = textView;
        this.f4108i = view;
    }

    public static x a(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.radioButton1;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton1);
            if (radioButton != null) {
                i10 = R.id.radioButton2;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton2);
                if (radioButton2 != null) {
                    i10 = R.id.radioButton3;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton3);
                    if (radioButton3 != null) {
                        i10 = R.id.radioButton4;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton4);
                        if (radioButton4 != null) {
                            i10 = R.id.radioGroup;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.radioGroup);
                            if (radioGroup != null) {
                                i10 = R.id.titleLabel;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                if (textView != null) {
                                    i10 = R.id.view;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.view);
                                    if (viewFindChildViewById != null) {
                                        return new x((ConstraintLayout) view, imageView, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, textView, viewFindChildViewById);
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

    public static x c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static x d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_unit_speed, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4100a;
    }
}
