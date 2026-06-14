package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f4002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f4003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4004c;

    private n(ConstraintLayout constraintLayout, EditText editText, TextView textView) {
        this.f4002a = constraintLayout;
        this.f4003b = editText;
        this.f4004c = textView;
    }

    public static n a(View view) {
        int i10 = R.id.editText;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.editText);
        if (editText != null) {
            i10 = R.id.titleLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
            if (textView != null) {
                return new n((ConstraintLayout) view, editText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static n d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_odometer_edit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4002a;
    }
}
