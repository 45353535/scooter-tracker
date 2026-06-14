package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class P5 extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f37518a;

    public P5(RelativeLayout.LayoutParams layoutParams) {
        this.f37518a = layoutParams;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df orientation, wo finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        F3.a(finalInsets, this.f37518a, orientation);
    }
}
