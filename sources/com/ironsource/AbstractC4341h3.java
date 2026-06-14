package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4341h3 implements InterfaceC4429m7 {

    /* JADX INFO: renamed from: com.ironsource.h3$a */
    public static final class a extends AbstractC4341h3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f43211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b firstReason) {
            super(null);
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            this.f43211a = firstReason;
        }

        @NotNull
        public final a a(@NotNull b firstReason) {
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            return new a(firstReason);
        }

        @NotNull
        public final b d() {
            return this.f43211a;
        }

        @NotNull
        public final b e() {
            return this.f43211a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f43211a, ((a) obj).f43211a);
        }

        public int hashCode() {
            return this.f43211a.hashCode();
        }

        @NotNull
        public String toString() {
            return "First(firstReason=" + this.f43211a + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f43211a;
            }
            return aVar.a(bVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h3$b */
    public static abstract class b implements InterfaceC4429m7 {

        /* JADX INFO: renamed from: com.ironsource.h3$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f43212a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$b$b, reason: collision with other inner class name */
        public static final class C0461b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0461b f43213a = new C0461b();

            private C0461b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f43214a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC4429m7
        @NotNull
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0461b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new lf.m();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h3$c */
    public static final class c extends AbstractC4341h3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f43215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final d f43216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, @NotNull d recurringReason) {
            super(null);
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            this.f43215a = j10;
            this.f43216b = recurringReason;
        }

        @NotNull
        public final c a(long j10, @NotNull d recurringReason) {
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            return new c(j10, recurringReason);
        }

        public final long d() {
            return this.f43215a;
        }

        @NotNull
        public final d e() {
            return this.f43216b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f43215a == cVar.f43215a && Intrinsics.areEqual(this.f43216b, cVar.f43216b);
        }

        @NotNull
        public final d f() {
            return this.f43216b;
        }

        public final long g() {
            return this.f43215a;
        }

        public int hashCode() {
            return (androidx.collection.b.a(this.f43215a) * 31) + this.f43216b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Recurring(reloadDuration=" + this.f43215a + ", recurringReason=" + this.f43216b + ")";
        }

        public static /* synthetic */ c a(c cVar, long j10, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f43215a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f43216b;
            }
            return cVar.a(j10, dVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h3$d */
    public static abstract class d implements InterfaceC4429m7 {

        /* JADX INFO: renamed from: com.ironsource.h3$d$a */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f43217a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$b */
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f43218a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$c */
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f43219a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$d, reason: collision with other inner class name */
        public static final class C0462d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0462d f43220a = new C0462d();

            private C0462d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$e */
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f43221a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$f */
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f43222a;

            public f(long j10) {
                super(null);
                this.f43222a = j10;
            }

            @NotNull
            public final f a(long j10) {
                return new f(j10);
            }

            public final long c() {
                return this.f43222a;
            }

            public final long d() {
                return this.f43222a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f43222a == ((f) obj).f43222a;
            }

            public int hashCode() {
                return androidx.collection.b.a(this.f43222a);
            }

            @NotNull
            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f43222a + ")";
            }

            public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = fVar.f43222a;
                }
                return fVar.a(j10);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$g */
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f43223a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.h3$d$h */
        public static final class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f43224a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC4429m7
        @NotNull
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0462d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new lf.m();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC4341h3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ironsource.InterfaceC4429m7
    @NotNull
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new lf.m();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new lf.m();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new lf.m();
    }

    private AbstractC4341h3() {
    }
}
