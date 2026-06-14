package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class cg implements Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Zc f42830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42831b;

    public cg(@NotNull Zc folderRootUrl, @NotNull String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f42830a = folderRootUrl;
        this.f42831b = version;
    }

    @NotNull
    public final String a() {
        return this.f42831b;
    }

    @Override // com.ironsource.Y5
    @NotNull
    public String value() {
        return this.f42830a.a() + "/versions/" + this.f42831b + "/mobileController.html";
    }
}
