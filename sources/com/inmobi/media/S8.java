package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* JADX INFO: loaded from: classes9.dex */
public final class S8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f37700a;

    public S8(InMobiAudio inMobiAudio) {
        this.f37700a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.f37700a.f36487f = F3.b(r0.getMeasuredWidth() / J5.b());
            this.f37700a.f36488g = F3.b(r0.getMeasuredHeight() / J5.b());
            if (InMobiAudio.access$hasValidSize(this.f37700a)) {
                this.f37700a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            e10.getMessage();
        }
    }
}
