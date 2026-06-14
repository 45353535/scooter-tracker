package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class zo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg.v f40083a;

    public zo(gg.v vVar) {
        this.f40083a = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f40083a.e(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f40083a.e(Boolean.FALSE);
    }
}
