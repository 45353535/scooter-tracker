package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f41519b;

    public Oc(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f41518a = url;
        this.f41519b = str;
    }

    @NotNull
    public final String a() {
        return this.f41518a;
    }

    @Nullable
    public final String b() {
        return this.f41519b;
    }

    @Nullable
    public final String c() {
        return this.f41519b;
    }

    @NotNull
    public final String d() {
        return this.f41518a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oc)) {
            return false;
        }
        Oc oc2 = (Oc) obj;
        return Intrinsics.areEqual(this.f41518a, oc2.f41518a) && Intrinsics.areEqual(this.f41519b, oc2.f41519b);
    }

    public int hashCode() {
        int iHashCode = this.f41518a.hashCode() * 31;
        String str = this.f41519b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "OpenUrl(url=" + this.f41518a + ", packageName=" + this.f41519b + ")";
    }

    public /* synthetic */ Oc(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final Oc a(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Oc(url, str);
    }

    public static /* synthetic */ Oc a(Oc oc2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oc2.f41518a;
        }
        if ((i10 & 2) != 0) {
            str2 = oc2.f41519b;
        }
        return oc2.a(str, str2);
    }
}
