package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4545t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f45475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f45476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final C4300ed f45477d;

    public AbstractC4545t3(int i10, @NotNull String placementName, boolean z10, @Nullable C4300ed c4300ed) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f45474a = i10;
        this.f45475b = placementName;
        this.f45476c = z10;
        this.f45477d = c4300ed;
    }

    @Nullable
    public final C4300ed a() {
        return this.f45477d;
    }

    public final int b() {
        return this.f45474a;
    }

    @NotNull
    public final String c() {
        return this.f45475b;
    }

    public final boolean d() {
        return this.f45476c;
    }

    @NotNull
    public String toString() {
        return "placement name: " + this.f45475b;
    }

    public final boolean a(int i10) {
        return this.f45474a == i10;
    }

    public /* synthetic */ AbstractC4545t3(int i10, String str, boolean z10, C4300ed c4300ed, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : c4300ed);
    }
}
