package a5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f3934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f3935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f3936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Toolbar f3937d;

    private f(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RecyclerView recyclerView, Toolbar toolbar) {
        this.f3934a = constraintLayout;
        this.f3935b = lottieAnimationView;
        this.f3936c = recyclerView;
        this.f3937d = toolbar;
    }

    public static f a(View view) {
        int i10 = R.id.confettiView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.confettiView);
        if (lottieAnimationView != null) {
            i10 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                if (toolbar != null) {
                    return new f((ConstraintLayout) view, lottieAnimationView, recyclerView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3934a;
    }
}
