package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Be implements PermissionExtractor {
    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NotNull Context context, @NotNull String str) {
        return false;
    }
}
