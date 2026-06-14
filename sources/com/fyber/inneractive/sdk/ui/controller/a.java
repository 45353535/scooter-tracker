package com.fyber.inneractive.sdk.ui.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f23830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23831b = new AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f10) {
        if (f10 < 0.01f || !this.f23831b.compareAndSet(false, true)) {
            return;
        }
        IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f10 * 100.0f));
        this.f23830a.u();
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        throw null;
    }
}
