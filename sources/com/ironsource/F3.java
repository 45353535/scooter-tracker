package com.ironsource;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class F3 implements InterfaceC4482p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f40858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f40859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final M3 f40860c;

    public F3(@Nullable Boolean bool, @Nullable Integer num, @Nullable M3 m32) {
        this.f40858a = bool;
        this.f40859b = num;
        this.f40860c = m32;
    }

    @Override // com.ironsource.InterfaceC4482p7
    @NotNull
    public Object a() {
        Boolean bool = this.f40858a;
        if (bool == null) {
            Result.Companion companion = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(Boolean.FALSE);
        }
        Integer num = this.f40859b;
        if (num == null || num.intValue() <= 0) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("limit flag is not provided or invalid")));
        }
        if (this.f40860c == null) {
            Result.Companion companion4 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("unit flag is not provided or invalid")));
        }
        Result.Companion companion5 = Result.f93230c;
        return Result.b(Boolean.TRUE);
    }
}
