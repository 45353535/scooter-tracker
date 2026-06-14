package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5474ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ua f78387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5350pg f78388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sa f78389c;

    public C5474ug(Ua ua2, InterfaceC5350pg interfaceC5350pg, Sa sa2) {
        this.f78387a = ua2;
        this.f78388b = interfaceC5350pg;
        this.f78389c = sa2;
    }

    public final void a(@Nullable C5424sg c5424sg) {
        if (this.f78387a.a(c5424sg)) {
            this.f78388b.a(c5424sg);
            this.f78389c.a();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final InterfaceC5350pg b() {
        return this.f78388b;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final Sa c() {
        return this.f78389c;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final Ua a() {
        return this.f78387a;
    }
}
