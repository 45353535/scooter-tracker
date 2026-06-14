package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4243b7 {

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    public static final class a implements InterfaceC4243b7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Y6 f42717a;

        public a(@NotNull Y6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f42717a = failure;
        }

        @NotNull
        public final Y6 a() {
            return this.f42717a;
        }

        @NotNull
        public final Y6 b() {
            return this.f42717a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f42717a, ((a) obj).f42717a);
        }

        public int hashCode() {
            return this.f42717a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.f42717a + ")";
        }

        @NotNull
        public final a a(@NotNull Y6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, Y6 y62, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                y62 = aVar.f42717a;
            }
            return aVar.a(y62);
        }

        @Override // com.ironsource.InterfaceC4243b7
        public void a(@NotNull InterfaceC4260c7 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.f42717a);
        }
    }

    void a(@NotNull InterfaceC4260c7 interfaceC4260c7);
}
