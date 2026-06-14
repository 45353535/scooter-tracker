package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f3806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Toolbar f3807d;

    private b(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, Toolbar toolbar) {
        this.f3804a = constraintLayout;
        this.f3805b = textView;
        this.f3806c = recyclerView;
        this.f3807d = toolbar;
    }

    public static b a(View view) {
        int i10 = R.id.emptyLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.emptyLabel);
        if (textView != null) {
            i10 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                if (toolbar != null) {
                    return new b((ConstraintLayout) view, textView, recyclerView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3804a;
    }
}
