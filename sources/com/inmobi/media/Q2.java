package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Q2 implements EngagementSignalsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f37571a;

    public Q2(R2 r22) {
        this.f37571a = r22;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i10, Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z10, Bundle extras) {
        Rh rh2;
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (z10 && (rh2 = (Rh) this.f37571a.f37635i.get()) != null) {
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            rh2.a(Mh.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        Rh rh3 = (Rh) this.f37571a.f37635i.get();
        if (rh3 != null) {
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            rh3.a(Mh.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z10, Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        R2 r22 = this.f37571a;
        if (r22.f37634h) {
            return;
        }
        r22.f37634h = true;
        Rh rh2 = (Rh) r22.f37635i.get();
        if (rh2 != null) {
            GestureDetectorOnGestureListenerC3635ci.f38345e1.getClass();
            rh2.a(Mh.a("IN_NATIVE_BROWSER", "onScroll"));
        }
    }
}
