package s5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.skydoves.balloon.R$layout;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BalloonAnchorOverlayView f99776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BalloonAnchorOverlayView f99777b;

    private b(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.f99776a = balloonAnchorOverlayView;
        this.f99777b = balloonAnchorOverlayView2;
    }

    public static b a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) view;
        return new b(balloonAnchorOverlayView, balloonAnchorOverlayView);
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.f63570b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BalloonAnchorOverlayView getRoot() {
        return this.f99776a;
    }
}
