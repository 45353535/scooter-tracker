package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class M3 extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5068ef f76116a;

    public M3(@NotNull C5068ef c5068ef) {
        super(c5068ef.e(), "[ClientApiTrackingStatusToggle]");
        this.f76116a = c5068ef;
    }

    public final void a(boolean z10) {
        updateState(z10);
        this.f76116a.f(z10);
    }
}
