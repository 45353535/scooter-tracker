package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f3960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f3961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3962d;

    private g0(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView) {
        this.f3959a = constraintLayout;
        this.f3960b = button;
        this.f3961c = imageView;
        this.f3962d = textView;
    }

    public static g0 a(View view) {
        int i10 = R.id.button;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.button);
        if (button != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.titleLabel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                if (textView != null) {
                    return new g0((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_setting_premium, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3959a;
    }
}
