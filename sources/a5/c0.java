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
public final class c0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckBox f3841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f3842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f3843e;

    private c0(ConstraintLayout constraintLayout, ImageView imageView, CheckBox checkBox, ImageView imageView2, TextView textView) {
        this.f3839a = constraintLayout;
        this.f3840b = imageView;
        this.f3841c = checkBox;
        this.f3842d = imageView2;
        this.f3843e = textView;
    }

    public static c0 a(View view) {
        int i10 = R.id.askImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.askImageView);
        if (imageView != null) {
            i10 = R.id.checkBox;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBox);
            if (checkBox != null) {
                i10 = R.id.imageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                if (imageView2 != null) {
                    i10 = R.id.titleLabel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
                    if (textView != null) {
                        return new c0((ConstraintLayout) view, imageView, checkBox, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_setting_checkbox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3839a;
    }
}
