package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class bi1 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx1 f109012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci1 f109013b;

    public /* synthetic */ bi1(k00 k00Var) {
        this(new nx1(), new ci1(k00Var));
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f109012a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float fA = this.f109013b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new ki2(fA.floatValue(), new vh1()));
    }

    @Override // yads.hf0
    public final void c() {
    }

    public bi1(nx1 nx1Var, ci1 ci1Var) {
        this.f109012a = nx1Var;
        this.f109013b = ci1Var;
    }
}
