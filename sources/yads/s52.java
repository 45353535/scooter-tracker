package yads;

import android.view.TextureView;

/* JADX INFO: loaded from: classes4.dex */
public final class s52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f42 f115704a;

    public s52(f42 f42Var) {
        this.f115704a = f42Var;
    }

    public final void a(r52 r52Var) {
        TextureView textureView = r52Var.f115324b;
        ((do0) this.f115704a).a(textureView);
        textureView.setVisibility(0);
        r52Var.f115325c.setVisibility(0);
        r52Var.f115323a.setVisibility(0);
    }

    public final void b(r52 r52Var) {
        TextureView textureView = r52Var.f115324b;
        ((do0) this.f115704a).a((TextureView) null);
        textureView.setVisibility(8);
        r52Var.f115325c.setVisibility(8);
        r52Var.f115323a.setVisibility(8);
    }
}
