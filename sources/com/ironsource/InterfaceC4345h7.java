package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4345h7 {

    /* JADX INFO: renamed from: com.ironsource.h7$a */
    public interface a extends InterfaceC4345h7 {

        /* JADX INFO: renamed from: com.ironsource.h7$a$a, reason: collision with other inner class name */
        public static final class C0464a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Exception f43242a;

            public C0464a(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f43242a = exception;
            }

            @NotNull
            public final C0464a a(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new C0464a(exception);
            }

            @Override // com.ironsource.InterfaceC4345h7.a
            public boolean b() {
                return true;
            }

            @NotNull
            public final Exception c() {
                return this.f43242a;
            }

            @NotNull
            public final Exception d() {
                return this.f43242a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0464a) && Intrinsics.areEqual(this.f43242a, ((C0464a) obj).f43242a);
            }

            public int hashCode() {
                return this.f43242a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Exception(exception=" + this.f43242a + ")";
            }

            public static /* synthetic */ C0464a a(C0464a c0464a, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = c0464a.f43242a;
                }
                return c0464a.a(exc);
            }

            @Override // com.ironsource.InterfaceC4345h7.a
            @NotNull
            public String a() {
                String message = this.f43242a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h7$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f43243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final String f43244b;

            public b(int i10, @Nullable String str) {
                this.f43243a = i10;
                this.f43244b = str;
            }

            @NotNull
            public final b a(int i10, @Nullable String str) {
                return new b(i10, str);
            }

            @Override // com.ironsource.InterfaceC4345h7.a
            public boolean b() {
                return this.f43243a != 400;
            }

            public final int c() {
                return this.f43243a;
            }

            @Nullable
            public final String d() {
                return this.f43244b;
            }

            public final int e() {
                return this.f43243a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f43243a == bVar.f43243a && Intrinsics.areEqual(this.f43244b, bVar.f43244b);
            }

            @Nullable
            public final String f() {
                return this.f43244b;
            }

            public int hashCode() {
                int i10 = this.f43243a * 31;
                String str = this.f43244b;
                return i10 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "HttpError(errorCode=" + this.f43243a + ", errorMessage=" + this.f43244b + ")";
            }

            public static /* synthetic */ b a(b bVar, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = bVar.f43243a;
                }
                if ((i11 & 2) != 0) {
                    str = bVar.f43244b;
                }
                return bVar.a(i10, str);
            }

            @Override // com.ironsource.InterfaceC4345h7.a
            @NotNull
            public String a() {
                int i10 = this.f43243a;
                String str = this.f43244b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i10 + ", Message: " + str;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4345h7.a
            @NotNull
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4345h7.a
            public boolean b() {
                return true;
            }
        }

        @NotNull
        String a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.ironsource.h7$b */
    public static final class b implements InterfaceC4345h7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43245a;

        public b(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f43245a = response;
        }

        @NotNull
        public final b a(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new b(response);
        }

        @NotNull
        public final String c() {
            return this.f43245a;
        }

        @NotNull
        public final String d() {
            return this.f43245a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f43245a, ((b) obj).f43245a);
        }

        public int hashCode() {
            return this.f43245a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(response=" + this.f43245a + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f43245a;
            }
            return bVar.a(str);
        }
    }
}
