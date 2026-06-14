package com.ironsource;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class He implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Long f41062a;

    @Nullable
    public final Long a() {
        return this.f41062a;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public final void a(@Nullable Long l10) {
        this.f41062a = l10;
    }
}
