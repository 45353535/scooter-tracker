package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Y6 {

    public static final class a implements Y6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC4225a7 f42143a;

        public a(@NotNull EnumC4225a7 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.f42143a = strategy;
        }

        @Override // com.ironsource.Y6
        @NotNull
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.Y6
        @NotNull
        public EnumC4225a7 b() {
            return this.f42143a;
        }

        @NotNull
        public final EnumC4225a7 c() {
            return this.f42143a;
        }
    }

    @NotNull
    String a();

    @NotNull
    EnumC4225a7 b();
}
