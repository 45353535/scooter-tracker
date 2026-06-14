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
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f3974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f3975c;

    private i(ConstraintLayout constraintLayout, EditText editText, TextView textView) {
        this.f3973a = constraintLayout;
        this.f3974b = editText;
        this.f3975c = textView;
    }

    public static i a(View view) {
        int i10 = R.id.editText;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.editText);
        if (editText != null) {
            i10 = R.id.titleLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleLabel);
            if (textView != null) {
                return new i((ConstraintLayout) view, editText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_history_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3973a;
    }
}
