package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class A7 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f36553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f36554b;

    public A7(View view, N7 n72) {
        this.f36553a = view;
        this.f36554b = n72;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f36553a.removeOnAttachStateChangeListener(this);
        InterfaceC3878m9 interfaceC3878m9 = this.f36554b.f37403b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.f36554b.a(C3977q8.f39362a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
