package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC4955a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f76794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76795b = "[ComponentMigrationToV113]";

    public AbstractC4955a5(C5058e5 c5058e5) {
        this.f76794a = c5058e5;
    }

    @NotNull
    public final C5058e5 a() {
        return this.f76794a;
    }

    @NotNull
    public final String b() {
        return this.f76795b;
    }

    public abstract boolean b(int i10);

    public abstract void c();

    public final void a(int i10) {
        if (b(i10)) {
            c();
        }
    }
}
