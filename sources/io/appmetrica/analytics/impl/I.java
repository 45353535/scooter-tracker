package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class I implements Savable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f75886a;

    public I(J j10) {
        this.f75886a = j10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f75886a.f75971a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z10) {
        this.f75886a.f75971a.e(z10);
    }
}
