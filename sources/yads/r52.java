package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class r52 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pf3 f115323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureView f115324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d42 f115325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v42 f115326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wh1 f115327e;

    public r52(Context context, pf3 pf3Var, TextureView textureView, d42 d42Var) {
        super(context);
        this.f115323a = pf3Var;
        this.f115324b = textureView;
        this.f115325c = d42Var;
        this.f115327e = new ow2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v42 v42Var = this.f115326d;
        if (v42Var != null) {
            n42 n42Var = (n42) v42Var;
            ((do0) n42Var.f113724a).a(n42Var.f113725b.f115324b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v42 v42Var = this.f115326d;
        if (v42Var != null) {
            n42 n42Var = (n42) v42Var;
            n42Var.f113725b.f115323a.f114658a.clearAnimation();
            ((do0) n42Var.f113724a).a((TextureView) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        vh1 vh1VarA = this.f115327e.a(i10, i11);
        super.onMeasure(vh1VarA.f117010a, vh1VarA.f117011b);
    }

    public final void setAspectRatio(float f10) {
        this.f115327e = new ki2(f10);
    }

    public final void setOnAttachStateChangeListener(@Nullable v42 v42Var) {
        this.f115326d = v42Var;
    }
}
