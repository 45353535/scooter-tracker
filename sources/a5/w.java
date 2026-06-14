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
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RadioButton f4092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f4093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioButton f4094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RadioButton f4095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RadioButton f4096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RadioGroup f4097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f4099j;

    private w(ConstraintLayout constraintLayout, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioGroup radioGroup, TextView textView, View view) {
        this.f4090a = constraintLayout;
        this.f4091b = imageView;
        this.f4092c = radioButton;
        this.f4093d = radioButton2;
        this.f4094e = radioButton3;
        this.f4095f = radioButton4;
        this.f4096g = radioButton5;
        this.f4097h = radioGroup;
        this.f4098i = textView;
        this.f4099j = view;
    }

    public static w a(View view) {
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
                            i10 = R.id.radioButton5;
                            RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton5);
                            if (radioButton5 != null) {
                                i10 = R.id.radioGroup;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.radioGroup);
                                if (radioGroup != null) {
                                    i10 = R.id.titleLabel;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                    if (textView != null) {
                                        i10 = R.id.view;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.view);
                                        if (viewFindChildViewById != null) {
                                            return new w((ConstraintLayout) view, imageView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioGroup, textView, viewFindChildViewById);
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

    public static w c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static w d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_unit_distance, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4090a;
    }
}
