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
public final class f0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f3940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3941d;

    private f0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f3938a = constraintLayout;
        this.f3939b = textView;
        this.f3940c = imageView;
        this.f3941d = textView2;
    }

    public static f0 a(View view) {
        int i10 = R.id.detailLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.detailLabel);
        if (textView != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.titleLabel;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                if (textView2 != null) {
                    return new f0((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_setting_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3938a;
    }
}
