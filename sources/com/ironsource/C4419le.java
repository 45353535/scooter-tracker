package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4419le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f43563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<IronSource.a> f43564c;

    public C4419le(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f43562a = appKey;
        this.f43563b = str;
        this.f43564c = legacyAdFormats;
    }

    @NotNull
    public final String a() {
        return this.f43562a;
    }

    @Nullable
    public final String b() {
        return this.f43563b;
    }

    @NotNull
    public final List<IronSource.a> c() {
        return this.f43564c;
    }

    @NotNull
    public final String d() {
        return this.f43562a;
    }

    @NotNull
    public final List<IronSource.a> e() {
        return this.f43564c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4419le)) {
            return false;
        }
        C4419le c4419le = (C4419le) obj;
        return Intrinsics.areEqual(this.f43562a, c4419le.f43562a) && Intrinsics.areEqual(this.f43563b, c4419le.f43563b) && Intrinsics.areEqual(this.f43564c, c4419le.f43564c);
    }

    @Nullable
    public final String f() {
        return this.f43563b;
    }

    public int hashCode() {
        int iHashCode = this.f43562a.hashCode() * 31;
        String str = this.f43563b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f43564c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkInitRequest(appKey=" + this.f43562a + ", userId=" + this.f43563b + ", legacyAdFormats=" + this.f43564c + ")";
    }

    @NotNull
    public final C4419le a(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C4419le(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4419le a(C4419le c4419le, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4419le.f43562a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4419le.f43563b;
        }
        if ((i10 & 4) != 0) {
            list = c4419le.f43564c;
        }
        return c4419le.a(str, str2, list);
    }

    public final void a(@NotNull List<? extends IronSource.a> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f43564c.clear();
        this.f43564c.addAll(adFormats);
    }

    public /* synthetic */ C4419le(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }
}
