package s5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.skydoves.balloon.R$id;
import com.skydoves.balloon.R$layout;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f99769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f99770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f99771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadiusLayout f99772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f99773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VectorTextView f99774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f99775g;

    private a(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.f99769a = frameLayout;
        this.f99770b = frameLayout2;
        this.f99771c = imageView;
        this.f99772d = radiusLayout;
        this.f99773e = frameLayout3;
        this.f99774f = vectorTextView;
        this.f99775g = frameLayout4;
    }

    public static a a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i10 = R$id.f63564a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R$id.f63565b;
            RadiusLayout radiusLayout = (RadiusLayout) ViewBindings.findChildViewById(view, i10);
            if (radiusLayout != null) {
                i10 = R$id.f63566c;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                if (frameLayout2 != null) {
                    i10 = R$id.f63567d;
                    VectorTextView vectorTextView = (VectorTextView) ViewBindings.findChildViewById(view, i10);
                    if (vectorTextView != null) {
                        i10 = R$id.f63568e;
                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                        if (frameLayout3 != null) {
                            return new a(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.f63569a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f99769a;
    }
}
