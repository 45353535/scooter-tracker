package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5475uh extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5576yi f78390b;

    public C5475uh(C5058e5 c5058e5) {
        super(c5058e5);
        this.f78390b = new C5576yi(new C5417s9(c5058e5), c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        return this.f78390b.a(w52, new C5551xi());
    }
}
