package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4359i4 implements InterfaceC4583v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f43354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f43355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Zc f43356d;

    public C4359i4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC4583v7
    @NotNull
    public String a() {
        return this.f43353a;
    }

    @Override // com.ironsource.InterfaceC4583v7
    public boolean b() {
        return this.f43355c;
    }

    @Override // com.ironsource.InterfaceC4583v7
    @NotNull
    public Zc c() {
        return this.f43356d;
    }

    @Override // com.ironsource.InterfaceC4583v7
    @NotNull
    public String d() {
        return this.f43354b;
    }

    public C4359i4(@NotNull String controllerUrl, @NotNull String cacheFolder, boolean z10, @NotNull Zc rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.f43353a = controllerUrl;
        this.f43354b = cacheFolder;
        this.f43355c = z10;
        this.f43356d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4359i4(String str, String str2, boolean z10, Zc zc2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new Zc(str) : zc2);
    }
}
