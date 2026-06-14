package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5042de implements PermissionStrategy {
    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NonNull String str) {
        return false;
    }

    public final String toString() {
        return "AlwaysAskForPermissionStrategy{always allow permission}";
    }
}
