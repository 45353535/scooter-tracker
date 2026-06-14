package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3929oa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f39177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f39178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eg.p f39181e;

    public ViewTreeObserverOnGlobalLayoutListenerC3929oa(FrameLayout view, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39177a = view;
        this.f39178b = interfaceC3878m9;
        this.f39181e = eg.r.a(Unit.f93236a);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3878m9 interfaceC3878m9 = this.f39178b;
            if (interfaceC3878m9 != null) {
                String str = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).a(str, "close called");
            }
            this.f39179c = F3.b(this.f39177a.getWidth() / J5.b());
            this.f39180d = F3.b(this.f39177a.getHeight() / J5.b());
            this.f39177a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            eg.i.d(A9.f36557c, null, null, new C3904na(this, null), 3, null);
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39178b;
            if (interfaceC3878m92 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e10.getMessage());
            }
        }
    }
}
