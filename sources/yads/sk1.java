package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class sk1 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx1 f115838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci1 f115839b;

    public sk1(nx1 nx1Var, ci1 ci1Var) {
        this.f115838a = nx1Var;
        this.f115839b = ci1Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f115838a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float fA = this.f115839b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new xx(new ki2(Math.min(Math.max(fA.floatValue(), 1.0f), 1.7777778f), new vh1()), new rh1(viewGroup, 0.5f, viewGroup.getContext().getApplicationContext())));
    }

    @Override // yads.hf0
    public final void c() {
    }
}
