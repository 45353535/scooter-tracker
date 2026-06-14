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
public final class v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RadioButton f4085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f4086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioGroup f4087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4089g;

    private v(ConstraintLayout constraintLayout, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextView textView, View view) {
        this.f4083a = constraintLayout;
        this.f4084b = imageView;
        this.f4085c = radioButton;
        this.f4086d = radioButton2;
        this.f4087e = radioGroup;
        this.f4088f = textView;
        this.f4089g = view;
    }

    public static v a(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.radioButton1;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton1);
            if (radioButton != null) {
                i10 = R.id.radioButton2;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton2);
                if (radioButton2 != null) {
                    i10 = R.id.radioGroup;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.radioGroup);
                    if (radioGroup != null) {
                        i10 = R.id.titleLabel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                        if (textView != null) {
                            i10 = R.id.view;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.view);
                            if (viewFindChildViewById != null) {
                                return new v((ConstraintLayout) view, imageView, radioButton, radioButton2, radioGroup, textView, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static v d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_theme, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4083a;
    }
}
