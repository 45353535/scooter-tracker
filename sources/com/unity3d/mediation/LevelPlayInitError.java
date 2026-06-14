package com.unity3d.mediation;

import com.ironsource.C4318fe;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f67881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67882b;

    public LevelPlayInitError(int i10, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f67881a = i10;
        this.f67882b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f67881a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.f67882b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayError(errorCode=" + this.f67881a + ", errorMessage='" + this.f67882b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull C4318fe sdkError) {
        this(sdkError.c(), sdkError.d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
