package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5447te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78290a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78291b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78292c = 1;

    public final int a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f78290a;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return this.f78291b;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return this.f78292c;
        }
        throw new lf.m();
    }

    @Nullable
    public final Boolean a(int i10) {
        if (i10 == this.f78291b) {
            return Boolean.FALSE;
        }
        if (i10 == this.f78292c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
