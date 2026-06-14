package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface p {

    public static class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43990a;

        public a(@NotNull String plumbus) {
            Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.f43990a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @NotNull
        public String value() {
            return this.f43990a;
        }
    }

    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @NotNull
    String value();
}
