package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.a.d;

/* JADX INFO: loaded from: classes4.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements sg.bigo.ads.common.view.a.c<RealtimeBlurLinearLayout> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<RealtimeBlurLinearLayout> f102930a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        return background instanceof sg.bigo.ads.common.view.a.a ? ((sg.bigo.ads.common.view.a.a) background).f102539a : background;
    }

    @Nullable
    public sg.bigo.ads.common.view.a.b getBlurStyle() {
        return this.f102930a.f103031d.f103016b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d<RealtimeBlurLinearLayout> dVar = this.f102930a;
        View viewA = u.a(dVar.f103030c, dVar.f103029b);
        dVar.f103033f = viewA;
        if (viewA == null) {
            dVar.f103034g = false;
            return;
        }
        viewA.getViewTreeObserver().addOnPreDrawListener(dVar.f103035h);
        dVar.a();
        boolean z10 = dVar.f103033f.getRootView() != dVar.f103029b.getRootView();
        dVar.f103034g = z10;
        if (z10) {
            dVar.f103033f.postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d<RealtimeBlurLinearLayout> dVar = this.f102930a;
        View view = dVar.f103033f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(dVar.f103035h);
        }
        dVar.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        d<RealtimeBlurLinearLayout> dVar = this.f102930a;
        sg.bigo.ads.common.view.a.a aVar = dVar.f103031d;
        if (drawable != aVar) {
            aVar.a(drawable);
            dVar.b();
        }
        super.setBackground(dVar.f103031d);
    }

    @Override // sg.bigo.ads.common.view.a.c
    public void setBlurStyle(@Nullable sg.bigo.ads.common.view.a.b bVar) {
        this.f102930a.setBlurStyle(bVar);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d<RealtimeBlurLinearLayout> dVar = new d<>(this);
        this.f102930a = dVar;
        setBackground(dVar.f103031d);
    }
}
