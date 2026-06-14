package yads;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class hm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f111633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c31 f111634b;

    public /* synthetic */ hm1(t9 t9Var) {
        this(t9Var, new c31());
    }

    public final ws2 a(CustomizableMediaView customizableMediaView, hg2 hg2Var, mm1 mm1Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        this.f111634b.getClass();
        if (!aq0.a(customizableMediaView.getContext(), zp0.f118752e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new ws2(customizableMediaView, mm1Var, new oh3(new l31(imageView, hg2Var, this.f111633a)));
    }

    public hm1(t9 t9Var, c31 c31Var) {
        this.f111633a = t9Var;
        this.f111634b = c31Var;
    }
}
