package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4261c8 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f42808a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4261c8(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f42808a = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f42808a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C4261c8.class, obj.getClass())) {
            return false;
        }
        C4261c8 c4261c8 = (C4261c8) obj;
        if (this.f42808a.getErrorCode() != c4261c8.f42808a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.f42808a.getErrorMessage(), c4261c8.f42808a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f42808a.getErrorCode()), this.f42808a.getErrorMessage());
    }
}
