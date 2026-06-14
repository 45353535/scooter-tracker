package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f3943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f3944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageButton f3945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f3946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f3947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f3948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f3949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f3950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Button f3951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Button f3952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f3953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Button f3954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f3955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f3956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f3957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConstraintLayout f3958q;

    private g(ConstraintLayout constraintLayout, Button button, Button button2, ImageButton imageButton, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, Button button10, Button button11, View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2) {
        this.f3942a = constraintLayout;
        this.f3943b = button;
        this.f3944c = button2;
        this.f3945d = imageButton;
        this.f3946e = button3;
        this.f3947f = button4;
        this.f3948g = button5;
        this.f3949h = button6;
        this.f3950i = button7;
        this.f3951j = button8;
        this.f3952k = button9;
        this.f3953l = button10;
        this.f3954m = button11;
        this.f3955n = view;
        this.f3956o = imageView;
        this.f3957p = textView;
        this.f3958q = constraintLayout2;
    }

    public static g a(View view) {
        int i10 = R.id.buttonClear;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.buttonClear);
        if (button != null) {
            i10 = R.id.buttonEightView;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.buttonEightView);
            if (button2 != null) {
                i10 = R.id.buttonEscView;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.buttonEscView);
                if (imageButton != null) {
                    i10 = R.id.buttonFiveView;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.buttonFiveView);
                    if (button3 != null) {
                        i10 = R.id.buttonFourView;
                        Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.buttonFourView);
                        if (button4 != null) {
                            i10 = R.id.buttonNineView;
                            Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.buttonNineView);
                            if (button5 != null) {
                                i10 = R.id.buttonOneView;
                                Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.buttonOneView);
                                if (button6 != null) {
                                    i10 = R.id.buttonSevenView;
                                    Button button7 = (Button) ViewBindings.findChildViewById(view, R.id.buttonSevenView);
                                    if (button7 != null) {
                                        i10 = R.id.buttonSixView;
                                        Button button8 = (Button) ViewBindings.findChildViewById(view, R.id.buttonSixView);
                                        if (button8 != null) {
                                            i10 = R.id.buttonThreeView;
                                            Button button9 = (Button) ViewBindings.findChildViewById(view, R.id.buttonThreeView);
                                            if (button9 != null) {
                                                i10 = R.id.buttonTwoView;
                                                Button button10 = (Button) ViewBindings.findChildViewById(view, R.id.buttonTwoView);
                                                if (button10 != null) {
                                                    i10 = R.id.buttonZeroView;
                                                    Button button11 = (Button) ViewBindings.findChildViewById(view, R.id.buttonZeroView);
                                                    if (button11 != null) {
                                                        i10 = R.id.placeholder;
                                                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.placeholder);
                                                        if (viewFindChildViewById != null) {
                                                            i10 = R.id.speedingImageView;
                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.speedingImageView);
                                                            if (imageView != null) {
                                                                i10 = R.id.speedingLabel;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.speedingLabel);
                                                                if (textView != null) {
                                                                    i10 = R.id.speedingView;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.speedingView);
                                                                    if (constraintLayout != null) {
                                                                        return new g((ConstraintLayout) view, button, button2, imageButton, button3, button4, button5, button6, button7, button8, button9, button10, button11, viewFindChildViewById, imageView, textView, constraintLayout);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_custom_speed_limit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3942a;
    }
}
