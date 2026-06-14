package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class NativeAdViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private View f43782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private View f43783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private View f43784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private View f43785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private LevelPlayMediaView f43786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private View f43787f;

    @Nullable
    public final View getAdvertiserView() {
        return this.f43783b;
    }

    @Nullable
    public final View getBodyView() {
        return this.f43785d;
    }

    @Nullable
    public final View getCallToActionView() {
        return this.f43787f;
    }

    @Nullable
    public final View getIconView() {
        return this.f43784c;
    }

    @Nullable
    public final LevelPlayMediaView getMediaView() {
        return this.f43786e;
    }

    @Nullable
    public final View getTitleView() {
        return this.f43782a;
    }

    public final void setAdvertiserView(@Nullable View view) {
        this.f43783b = view;
    }

    public final void setBodyView(@Nullable View view) {
        this.f43785d = view;
    }

    public final void setCallToActionView(@Nullable View view) {
        this.f43787f = view;
    }

    public final void setIconView(@Nullable View view) {
        this.f43784c = view;
    }

    public final void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f43786e = levelPlayMediaView;
    }

    public final void setTitleView(@Nullable View view) {
        this.f43782a = view;
    }
}
