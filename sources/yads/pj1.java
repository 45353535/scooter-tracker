package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class pj1 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f114689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx1 f114690b;

    public pj1(k00 k00Var, nx1 nx1Var) {
        this.f114689a = k00Var;
        this.f114690b = nx1Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f114690b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        if (extendedViewContainer != null) {
            k00 k00Var = this.f114689a;
            if (k00Var.f112532d == null && k00Var.f112529a == null) {
                extendedViewContainer.setVisibility(8);
            }
        }
    }

    @Override // yads.hf0
    public final void c() {
    }
}
