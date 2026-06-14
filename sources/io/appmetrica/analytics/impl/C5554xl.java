package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5554xl implements PermissionExtractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f78561b = "[SimplePermissionExtractor]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f78562a;

    public C5554xl(@NonNull PermissionStrategy permissionStrategy) {
        this.f78562a = permissionStrategy;
    }

    @NonNull
    @VisibleForTesting
    public final PermissionStrategy a() {
        return this.f78562a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NonNull Context context, @NonNull String str) {
        if (this.f78562a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
