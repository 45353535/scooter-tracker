package com.ironsource;

import com.ironsource.InterfaceC4499q7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Uc implements InterfaceC4499q7, InterfaceC4499q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f41845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final J7 f41846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Tc> f41847c;

    public Uc(@NotNull InterfaceC4496q4 currentTimeProvider, @NotNull J7 repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f41845a = currentTimeProvider;
        this.f41846b = repository;
        this.f41847c = new LinkedHashMap();
    }

    @NotNull
    public final Map<String, Tc> a() {
        return this.f41847c;
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.f41847c.get(identifier) == null) {
            return;
        }
        this.f41846b.a(this.f41845a.a(), identifier);
    }

    private final boolean a(Tc tc2, String str) {
        Long lA = this.f41846b.a(str);
        return lA != null && this.f41845a.a() - lA.longValue() < tc2.a();
    }

    @Override // com.ironsource.InterfaceC4499q7
    @NotNull
    public L3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Tc tc2 = this.f41847c.get(identifier);
        if (tc2 == null) {
            return new L3(false, null, 2, null);
        }
        if (a(tc2, identifier)) {
            return new L3(true, N3.Pacing);
        }
        return new L3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull N3 cappingType, @NotNull InterfaceC4465o7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objB = cappingConfig.b();
        if (Result.j(objB)) {
            Tc tc2 = (Tc) objB;
            if (tc2 != null) {
                this.f41847c.put(identifier, tc2);
            }
            return Result.b(Unit.f93236a);
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            return Result.b(kotlin.d.a(thG));
        }
        return Result.b(Unit.f93236a);
    }
}
