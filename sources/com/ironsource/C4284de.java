package com.ironsource;

import com.ironsource.Ee;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4284de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4436me f42921a;

    public C4284de(@NotNull C4436me sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f42921a = sdkInitResponse;
    }

    @NotNull
    public final J1 a() {
        return this.f42921a.a().b().c();
    }

    @NotNull
    public final C1 b() {
        return this.f42921a.a().b().b();
    }

    @NotNull
    public final N5 c() {
        return this.f42921a.b();
    }

    @NotNull
    public final Ee d() {
        return this.f42921a.c();
    }

    @NotNull
    public final Eb e() {
        return this.f42921a.a().b().e();
    }

    @NotNull
    public final Ee.a f() {
        Ee.a aVarI = this.f42921a.c().i();
        Intrinsics.checkNotNullExpressionValue(aVarI, "sdkInitResponse.fullResponse.origin");
        return aVarI;
    }

    @NotNull
    protected final C4436me g() {
        return this.f42921a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4284de(@NotNull C4284de sdkConfig) {
        this(sdkConfig.f42921a);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
