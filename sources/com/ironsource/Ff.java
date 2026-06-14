package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f40927a;

    public Ff() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String a() {
        return this.f40927a;
    }

    @Nullable
    public final String b() {
        return this.f40927a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ff) && Intrinsics.areEqual(this.f40927a, ((Ff) obj).f40927a);
    }

    public int hashCode() {
        String str = this.f40927a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f40927a + ")";
    }

    public Ff(@Nullable String str) {
        this.f40927a = str;
    }

    @NotNull
    public final Ff a(@Nullable String str) {
        return new Ff(str);
    }

    public final void b(@Nullable String str) {
        this.f40927a = str;
    }

    public /* synthetic */ Ff(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Ff a(Ff ff2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ff2.f40927a;
        }
        return ff2.a(str);
    }
}
