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
public final class t implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RadioButton f4057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f4058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioButton f4059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RadioButton f4060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RadioButton f4061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RadioButton f4062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RadioGroup f4063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f4064j;

    private t(ConstraintLayout constraintLayout, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioButton radioButton6, RadioGroup radioGroup, TextView textView) {
        this.f4055a = constraintLayout;
        this.f4056b = imageView;
        this.f4057c = radioButton;
        this.f4058d = radioButton2;
        this.f4059e = radioButton3;
        this.f4060f = radioButton4;
        this.f4061g = radioButton5;
        this.f4062h = radioButton6;
        this.f4063i = radioGroup;
        this.f4064j = textView;
    }

    public static t a(View view) {
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
                                i10 = R.id.radioButton6;
                                RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton6);
                                if (radioButton6 != null) {
                                    i10 = R.id.radioGroup;
                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.radioGroup);
                                    if (radioGroup != null) {
                                        i10 = R.id.titleLabel;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                        if (textView != null) {
                                            return new t((ConstraintLayout) view, imageView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioGroup, textView);
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

    public static t c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_sound, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4055a;
    }
}
