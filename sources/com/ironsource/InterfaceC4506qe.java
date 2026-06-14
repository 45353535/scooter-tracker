package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4506qe {

    /* JADX INFO: renamed from: com.ironsource.qe$a */
    public static final class a implements InterfaceC4506qe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4318fe f44734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f44735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f44736c;

        public a(@NotNull C4318fe error, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f44734a = error;
            this.f44735b = str;
            this.f44736c = str2;
        }

        @NotNull
        public final C4318fe a() {
            return this.f44734a;
        }

        @Nullable
        public final String b() {
            return this.f44735b;
        }

        @Nullable
        public final String c() {
            return this.f44736c;
        }

        @NotNull
        public final C4318fe d() {
            return this.f44734a;
        }

        @Nullable
        public final String e() {
            return this.f44736c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44734a, aVar.f44734a) && Intrinsics.areEqual(this.f44735b, aVar.f44735b) && Intrinsics.areEqual(this.f44736c, aVar.f44736c);
        }

        @Nullable
        public final String f() {
            return this.f44735b;
        }

        public int hashCode() {
            int iHashCode = this.f44734a.hashCode() * 31;
            String str = this.f44735b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f44736c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.f44734a + ", url=" + this.f44735b + ", json=" + this.f44736c + ")";
        }

        public /* synthetic */ a(C4318fe c4318fe, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c4318fe, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }

        @NotNull
        public final a a(@NotNull C4318fe error, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error, str, str2);
        }

        public static /* synthetic */ a a(a aVar, C4318fe c4318fe, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c4318fe = aVar.f44734a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f44735b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f44736c;
            }
            return aVar.a(c4318fe, str, str2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qe$b */
    public static final class b implements InterfaceC4506qe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4436me f44737a;

        public b(@NotNull C4436me sdkInitResponse) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.f44737a = sdkInitResponse;
        }

        @NotNull
        public final C4436me a() {
            return this.f44737a;
        }

        @NotNull
        public final C4436me b() {
            return this.f44737a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f44737a, ((b) obj).f44737a);
        }

        public int hashCode() {
            return this.f44737a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(sdkInitResponse=" + this.f44737a + ")";
        }

        @NotNull
        public final b a(@NotNull C4436me sdkInitResponse) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse);
        }

        public static /* synthetic */ b a(b bVar, C4436me c4436me, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c4436me = bVar.f44737a;
            }
            return bVar.a(c4436me);
        }
    }
}
