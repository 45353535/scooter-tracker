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
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f4014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f4015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4016e;

    private p(ConstraintLayout constraintLayout, TextView textView, Button button, Button button2, TextView textView2) {
        this.f4012a = constraintLayout;
        this.f4013b = textView;
        this.f4014c = button;
        this.f4015d = button2;
        this.f4016e = textView2;
    }

    public static p a(View view) {
        int i10 = R.id.detailLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.detailLabel);
        if (textView != null) {
            i10 = R.id.negativeButton;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.negativeButton);
            if (button != null) {
                i10 = R.id.positiveButton;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.positiveButton);
                if (button2 != null) {
                    i10 = R.id.titleLabel;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                    if (textView2 != null) {
                        return new p((ConstraintLayout) view, textView, button, button2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4012a;
    }
}
