package com.ironsource;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4600w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4600w7 f45720a = new C4600w7();

    private C4600w7() {
    }

    @NotNull
    public final UUID a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }
}
