package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Q8 extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f37583a;

    public Q8(RelativeLayout.LayoutParams layoutParams) {
        this.f37583a = layoutParams;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df orientation, wo finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        F3.a(finalInsets, this.f37583a, orientation);
    }
}
