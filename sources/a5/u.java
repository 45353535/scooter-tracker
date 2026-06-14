package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f4067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f4068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f4069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f4070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f4071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f4072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f4073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Button f4074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Button f4075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f4076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Button f4077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f4078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f4079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f4080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f4081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f4082r;

    private u(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, Button button10, Button button11, Button button12, View view, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3) {
        this.f4065a = constraintLayout;
        this.f4066b = button;
        this.f4067c = button2;
        this.f4068d = button3;
        this.f4069e = button4;
        this.f4070f = button5;
        this.f4071g = button6;
        this.f4072h = button7;
        this.f4073i = button8;
        this.f4074j = button9;
        this.f4075k = button10;
        this.f4076l = button11;
        this.f4077m = button12;
        this.f4078n = view;
        this.f4079o = textView;
        this.f4080p = constraintLayout2;
        this.f4081q = textView2;
        this.f4082r = textView3;
    }

    public static u a(View view) {
        int i10 = R.id.buttonCustomView;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.buttonCustomView);
        if (button != null) {
            i10 = R.id.buttonEightView;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.buttonEightView);
            if (button2 != null) {
                i10 = R.id.buttonEleventhView;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.buttonEleventhView);
                if (button3 != null) {
                    i10 = R.id.buttonFiveView;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.buttonFiveView);
                    if (button4 != null) {
                        i10 = R.id.buttonFourView;
                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.buttonFourView);
                        if (button5 != null) {
                            i10 = R.id.buttonNineView;
                            Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.buttonNineView);
                            if (button6 != null) {
                                i10 = R.id.buttonOneView;
                                Button button7 = (Button) ViewBindings.findChildViewById(view, R.id.buttonOneView);
                                if (button7 != null) {
                                    i10 = R.id.buttonSevenView;
                                    Button button8 = (Button) ViewBindings.findChildViewById(view, R.id.buttonSevenView);
                                    if (button8 != null) {
                                        i10 = R.id.buttonSixView;
                                        Button button9 = (Button) ViewBindings.findChildViewById(view, R.id.buttonSixView);
                                        if (button9 != null) {
                                            i10 = R.id.buttonTenthView;
                                            Button button10 = (Button) ViewBindings.findChildViewById(view, R.id.buttonTenthView);
                                            if (button10 != null) {
                                                i10 = R.id.buttonThreeView;
                                                Button button11 = (Button) ViewBindings.findChildViewById(view, R.id.buttonThreeView);
                                                if (button11 != null) {
                                                    i10 = R.id.buttonTwoView;
                                                    Button button12 = (Button) ViewBindings.findChildViewById(view, R.id.buttonTwoView);
                                                    if (button12 != null) {
                                                        i10 = R.id.placeholder;
                                                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.placeholder);
                                                        if (viewFindChildViewById != null) {
                                                            i10 = R.id.speedLabel;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.speedLabel);
                                                            if (textView != null) {
                                                                i10 = R.id.speedView;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.speedView);
                                                                if (constraintLayout != null) {
                                                                    i10 = R.id.titleLabel;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.unitLabel;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.unitLabel);
                                                                        if (textView3 != null) {
                                                                            return new u((ConstraintLayout) view, button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, viewFindChildViewById, textView, constraintLayout, textView2, textView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static u c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static u d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_speed_limit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4065a;
    }
}
