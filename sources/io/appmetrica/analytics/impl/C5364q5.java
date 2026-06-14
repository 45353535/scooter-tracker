package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5364q5 implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy[] f78032a;

    public C5364q5(@NotNull PermissionStrategy... permissionStrategyArr) {
        this.f78032a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        for (PermissionStrategy permissionStrategy : this.f78032a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f78032a) + ')';
    }
}
