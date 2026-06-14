package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f3978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckBox f3979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f3980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f3981f;

    private j(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, CheckBox checkBox, TextView textView2, ImageView imageView2) {
        this.f3976a = constraintLayout;
        this.f3977b = imageView;
        this.f3978c = textView;
        this.f3979d = checkBox;
        this.f3980e = textView2;
        this.f3981f = imageView2;
    }

    public static j a(View view) {
        int i10 = R.id.closeImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closeImage);
        if (imageView != null) {
            i10 = R.id.detailLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.detailLabel);
            if (textView != null) {
                i10 = R.id.dontShowCheckBox;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.dontShowCheckBox);
                if (checkBox != null) {
                    i10 = R.id.titleLabel;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                    if (textView2 != null) {
                        i10 = R.id.walkthroughImage;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.walkthroughImage);
                        if (imageView2 != null) {
                            return new j((ConstraintLayout) view, imageView, textView, checkBox, textView2, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static j d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_hud_walkthrough, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3976a;
    }
}
