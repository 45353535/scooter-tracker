package yads;

import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class lm1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mm1 f113152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f113153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dm1 f113154c;

    public lm1(mm1 mm1Var, CustomizableMediaView customizableMediaView, dm1 dm1Var) {
        this.f113152a = mm1Var;
        this.f113153b = customizableMediaView;
        this.f113154c = dm1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f113152a.f113551b.a(this.f113153b, this.f113154c.f109980b);
        return false;
    }
}
