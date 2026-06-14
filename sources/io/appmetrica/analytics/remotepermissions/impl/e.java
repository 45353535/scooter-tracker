package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f78937a = SetsKt.emptySet();

    public final synchronized void a(@NotNull Set<String> set) {
        this.f78937a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.f78937a.contains(str);
    }
}
