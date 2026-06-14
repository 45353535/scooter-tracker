package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4571uc implements InterfaceC4521rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f45554a;

    /* JADX INFO: renamed from: com.ironsource.uc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45555a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f45556b = "IronSource";

        private a() {
        }
    }

    public C4571uc(@NotNull String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f45554a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC4521rd
    @NotNull
    public String value() {
        if (this.f45554a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.f45554a, "0") || Intrinsics.areEqual(this.f45554a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f45554a;
    }
}
