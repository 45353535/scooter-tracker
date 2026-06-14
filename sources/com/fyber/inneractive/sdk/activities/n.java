package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f20153a;

    public n(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f20153a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f20153a.finish();
    }
}
