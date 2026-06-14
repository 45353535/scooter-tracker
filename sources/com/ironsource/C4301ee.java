package com.ironsource;

import com.ironsource.I8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4301ee implements I8, I8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private C4284de f43017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43018b;

    @Override // com.ironsource.I8
    @Nullable
    public Xa a() {
        C4284de c4284de = this.f43017a;
        if (c4284de != null) {
            return new Xa(c4284de);
        }
        return null;
    }

    @Override // com.ironsource.I8
    @Nullable
    public N9 b() {
        C4284de c4284de = this.f43017a;
        if (c4284de != null) {
            return new N9(c4284de);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public boolean c() {
        return this.f43018b;
    }

    @Override // com.ironsource.I8.a
    public void d() {
        this.f43018b = true;
    }

    @Override // com.ironsource.I8.a
    public void a(@NotNull C4284de sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f43017a = sdkConfig;
    }
}
