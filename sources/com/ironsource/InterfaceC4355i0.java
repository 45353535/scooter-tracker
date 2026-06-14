package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4355i0 {

    /* JADX INFO: renamed from: com.ironsource.i0$a */
    public static final class a implements InterfaceC4355i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0465a f43297c = new C0465a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f43298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f43299b;

        /* JADX INFO: renamed from: com.ironsource.i0$a$a, reason: collision with other inner class name */
        public static final class C0465a {
            public /* synthetic */ C0465a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@Nullable String str) {
                return new a(str);
            }

            private C0465a() {
            }
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@Nullable String str) {
            return new a(str);
        }

        @Nullable
        public final String b() {
            return this.f43298a;
        }

        @Nullable
        public final String c() {
            return this.f43298a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f43298a, ((a) obj).f43298a);
        }

        public int hashCode() {
            String str = this.f43298a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotReady(reason=" + this.f43298a + ")";
        }

        public a(@Nullable String str) {
            this.f43298a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f43298a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC4355i0
        public boolean a() {
            return this.f43299b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i0$b */
    public static final class b implements InterfaceC4355i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f43300a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f43301b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4355i0
        public boolean a() {
            return f43301b;
        }
    }

    boolean a();
}
