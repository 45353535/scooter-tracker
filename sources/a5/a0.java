package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3803b;

    private a0(ConstraintLayout constraintLayout, TextView textView) {
        this.f3802a = constraintLayout;
        this.f3803b = textView;
    }

    public static a0 a(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dateLabel);
        if (textView != null) {
            return new a0((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.dateLabel)));
    }

    public static a0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3802a;
    }
}
