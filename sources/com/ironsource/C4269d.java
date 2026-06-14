package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4269d implements Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Zc f42847a;

    public C4269d(@NotNull Zc folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f42847a = folderRootUrl;
    }

    @Override // com.ironsource.Y5
    @NotNull
    public String value() {
        return this.f42847a.a() + "/abTestMap.json";
    }
}
