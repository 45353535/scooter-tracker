package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4433mb<T> {

    /* JADX INFO: renamed from: com.ironsource.mb$a */
    public static final class a<T> implements InterfaceC4433mb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IronSourceError f43728a;

        public a(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f43728a = error;
        }

        @NotNull
        public final IronSourceError a() {
            return this.f43728a;
        }

        @NotNull
        public final IronSourceError b() {
            return this.f43728a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f43728a, ((a) obj).f43728a);
        }

        public int hashCode() {
            return this.f43728a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.f43728a + ")";
        }

        @NotNull
        public final a<T> a(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f43728a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mb$b */
    public static final class b<T> implements InterfaceC4433mb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f43729a;

        public b(T t10) {
            this.f43729a = t10;
        }

        public final T a() {
            return this.f43729a;
        }

        public final T b() {
            return this.f43729a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f43729a, ((b) obj).f43729a);
        }

        public int hashCode() {
            T t10 = this.f43729a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.f43729a + ")";
        }

        @NotNull
        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f43729a;
            }
            return bVar.a(obj);
        }
    }
}
