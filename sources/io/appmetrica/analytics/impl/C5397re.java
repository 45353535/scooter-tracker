package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5397re implements Ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ta f78147a;

    public C5397re(@NonNull Ta ta2) {
        this.f78147a = ta2;
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final boolean a(@Nullable C5424sg c5424sg) {
        return (c5424sg == null || ((C5520wc) this.f78147a).D()) ? false : true;
    }
}
