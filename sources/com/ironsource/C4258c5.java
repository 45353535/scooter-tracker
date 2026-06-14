package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4258c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4258c5 f42807a = new C4258c5();

    private C4258c5() {
    }

    public final boolean a(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
