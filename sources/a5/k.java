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
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f3984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f3986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f3987f;

    private k(ConstraintLayout constraintLayout, TextView textView, Button button, View view, Button button2, TextView textView2) {
        this.f3982a = constraintLayout;
        this.f3983b = textView;
        this.f3984c = button;
        this.f3985d = view;
        this.f3986e = button2;
        this.f3987f = textView2;
    }

    public static k a(View view) {
        int i10 = R.id.detailLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.detailLabel);
        if (textView != null) {
            i10 = R.id.negativeButton;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.negativeButton);
            if (button != null) {
                i10 = R.id.placeholderView;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.placeholderView);
                if (viewFindChildViewById != null) {
                    i10 = R.id.positiveButton;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.positiveButton);
                    if (button2 != null) {
                        i10 = R.id.titleLabel;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                        if (textView2 != null) {
                            return new k((ConstraintLayout) view, textView, button, viewFindChildViewById, button2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static k c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static k d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_location_permission, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3982a;
    }
}
