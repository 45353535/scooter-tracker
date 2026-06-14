package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class pi3 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f114686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f114687b;

    public pi3(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f114686a = onPreDrawListener;
        this.f114687b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f114686a.onPreDraw();
        this.f114687b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
