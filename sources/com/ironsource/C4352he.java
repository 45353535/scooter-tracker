package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4352he extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f43277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4352he(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43277a = error;
        this.f43278b = error.getErrorCode();
    }

    @NotNull
    public final IronSourceError a() {
        return this.f43277a;
    }

    public final int b() {
        return this.f43278b;
    }
}
