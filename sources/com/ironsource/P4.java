package com.ironsource;

import com.ironsource.InterfaceC4499q7;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class P4 implements InterfaceC4499q7, InterfaceC4499q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, M4> f41548a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4499q7
    @NotNull
    public L3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        M4 m42 = this.f41548a.get(identifier);
        return (m42 == null || m42.a()) ? new L3(false, null, 2, null) : new L3(true, N3.Delivery);
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull N3 cappingType, @NotNull InterfaceC4465o7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objA = cappingConfig.a();
        if (Result.j(objA)) {
            M4 m42 = (M4) objA;
            if (m42 != null) {
                this.f41548a.put(identifier, m42);
            }
            return Result.b(Unit.f93236a);
        }
        Throwable thG = Result.g(objA);
        if (thG != null) {
            return Result.b(kotlin.d.a(thG));
        }
        return Result.b(Unit.f93236a);
    }
}
