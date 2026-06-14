package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4414l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f43555c;

    public C4414l9() {
        this(null, 0, null, 7, null);
    }

    @NotNull
    public final String a() {
        return this.f43553a;
    }

    public final int b() {
        return this.f43554b;
    }

    @Nullable
    public final String c() {
        return this.f43555c;
    }

    @Nullable
    public final String d() {
        return this.f43555c;
    }

    @NotNull
    public final String e() {
        return this.f43553a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4414l9)) {
            return false;
        }
        C4414l9 c4414l9 = (C4414l9) obj;
        return Intrinsics.areEqual(this.f43553a, c4414l9.f43553a) && this.f43554b == c4414l9.f43554b && Intrinsics.areEqual(this.f43555c, c4414l9.f43555c);
    }

    public final int f() {
        return this.f43554b;
    }

    public int hashCode() {
        int iHashCode = ((this.f43553a.hashCode() * 31) + this.f43554b) * 31;
        String str = this.f43555c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InstanceInformation(instanceId=" + this.f43553a + ", instanceType=" + this.f43554b + ", dynamicDemandSourceId=" + this.f43555c + ")";
    }

    public C4414l9(@NotNull String instanceId, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f43553a = instanceId;
        this.f43554b = i10;
        this.f43555c = str;
    }

    @NotNull
    public final C4414l9 a(@NotNull String instanceId, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C4414l9(instanceId, i10, str);
    }

    public static /* synthetic */ C4414l9 a(C4414l9 c4414l9, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c4414l9.f43553a;
        }
        if ((i11 & 2) != 0) {
            i10 = c4414l9.f43554b;
        }
        if ((i11 & 4) != 0) {
            str2 = c4414l9.f43555c;
        }
        return c4414l9.a(str, i10, str2);
    }

    public /* synthetic */ C4414l9(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }
}
