package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class V8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f37899a;

    public V8(InMobiBanner inMobiBanner) {
        this.f37899a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3903n9 c3903n9;
        try {
            this.f37899a.f36497i = F3.b(r0.getMeasuredWidth() / J5.b());
            this.f37899a.f36498j = F3.b(r0.getMeasuredHeight() / J5.b());
            if (InMobiBanner.access$hasValidSize(this.f37899a)) {
                this.f37899a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            C3670e2 mAdManager = this.f37899a.getMAdManager();
            if (mAdManager == null || (c3903n9 = mAdManager.f36748f) == null) {
                return;
            }
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            c3903n9.a(strAccess$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e10);
        }
    }
}
