package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4642yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f45892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f45893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f45894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Boolean f45895d;

    public C4642yf(@Nullable String str, boolean z10, @Nullable Boolean bool, @Nullable String str2) {
        this.f45892a = str2;
        this.f45893b = str;
        this.f45894c = z10;
        this.f45895d = bool;
    }

    @Nullable
    public final String a() {
        return this.f45892a;
    }

    public final boolean b() {
        return Intrinsics.areEqual(this.f45895d, Boolean.TRUE);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.f45893b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Bf bf2 = Bf.f40456a;
        return Intrinsics.areEqual(bf2.a(networkSettings), this.f45893b) && bf2.a(networkSettings, adUnit) == this.f45894c;
    }

    public /* synthetic */ C4642yf(String str, boolean z10, Boolean bool, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }
}
