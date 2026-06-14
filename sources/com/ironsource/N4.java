package com.ironsource;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class N4 implements InterfaceC4482p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f41363a;

    public N4(@Nullable Boolean bool) {
        this.f41363a = bool;
    }

    @Override // com.ironsource.InterfaceC4482p7
    @NotNull
    public Object a() {
        Boolean bool = this.f41363a;
        if (bool != null) {
            return Result.b(bool);
        }
        Result.Companion companion = Result.f93230c;
        return Result.b(kotlin.d.a(new Exception("enabled flag is not provided or invalid")));
    }
}
