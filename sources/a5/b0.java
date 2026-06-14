package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f3810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f3811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f3812e;

    private b0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        this.f3808a = constraintLayout;
        this.f3809b = textView;
        this.f3810c = imageView;
        this.f3811d = imageView2;
        this.f3812e = textView2;
    }

    public static b0 a(View view) {
        int i10 = R.id.detailLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.detailLabel);
        if (textView != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.statusImageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.statusImageView);
                if (imageView2 != null) {
                    i10 = R.id.titleLabel;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                    if (textView2 != null) {
                        return new b0((ConstraintLayout) view, textView, imageView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_setting_battery_optimization, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3808a;
    }
}
