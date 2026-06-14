package com.ironsource;

import com.ironsource.C4406l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4356i1 {

    /* JADX INFO: renamed from: com.ironsource.i1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0466a f43302a = new C0466a(null);

        /* JADX INFO: renamed from: com.ironsource.i1$a$a, reason: collision with other inner class name */
        public static final class C0466a {
            public /* synthetic */ C0466a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull C4406l1.j errorCode, @NotNull C4406l1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(403, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @NotNull
            public final InterfaceC4356i1 b(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(404, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4356i1 c(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(409, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4356i1 d(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(401, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4356i1 e(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(408, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4356i1 f(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(405, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            private C0466a() {
            }

            @NotNull
            public final InterfaceC4356i1 a() {
                return new b(406, new ArrayList());
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(407, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4356i1 a(boolean z10) {
                if (z10) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i1$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f43303a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f43304b = 401;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f43305c = 403;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f43306d = 404;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f43307e = 405;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f43308f = 406;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f43309g = 407;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f43310h = 408;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f43311i = 409;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f43312j = 410;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f43313k = 411;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4356i1 a() {
            return f43302a.a();
        }

        @NotNull
        public static final InterfaceC4356i1 b(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43302a.b(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 c(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43302a.c(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 d(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43302a.d(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 e(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43302a.e(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 f(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43302a.f(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43302a.a(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 a(boolean z10) {
            return f43302a.a(z10);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull C4406l1.j jVar, @NotNull C4406l1.k kVar) {
            return f43302a.a(jVar, kVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i1$b */
    public static final class b implements InterfaceC4356i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC4423m1> f43315b;

        public b(int i10, @NotNull List<InterfaceC4423m1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.f43314a = i10;
            this.f43315b = arrayList;
        }

        @Override // com.ironsource.InterfaceC4356i1
        public void a(@NotNull InterfaceC4476p1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.f43314a, this.f43315b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i1$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f43316a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.i1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4356i1 a() {
                return new b(201, new ArrayList());
            }

            @NotNull
            public final InterfaceC4356i1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull C4406l1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(207, CollectionsKt.mutableListOf(ext1));
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull InterfaceC4423m1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(202, CollectionsKt.mutableListOf(duration));
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull C4406l1.j errorCode, @NotNull C4406l1.k errorReason, @NotNull C4406l1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(203, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(204, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i1$c$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f43317a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f43318b = 201;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f43319c = 202;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f43320d = 203;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f43321e = 204;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f43322f = 205;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f43323g = 206;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f43324h = 207;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43316a.a(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 b() {
            return f43316a.b();
        }

        @NotNull
        public static final InterfaceC4356i1 a() {
            return f43316a.a();
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull C4406l1.j jVar, @NotNull C4406l1.k kVar, @NotNull C4406l1.f fVar) {
            return f43316a.a(jVar, kVar, fVar);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull InterfaceC4423m1 interfaceC4423m1) {
            return f43316a.a(interfaceC4423m1);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull C4406l1.l lVar) {
            return f43316a.a(lVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i1$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f43325a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.i1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4356i1 a() {
                return new b(101, new ArrayList());
            }

            @NotNull
            public final InterfaceC4356i1 b(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(110, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull InterfaceC4423m1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4356i1 b() {
                return new b(112, new ArrayList());
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull C4406l1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(103, CollectionsKt.mutableListOf(duration));
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull C4406l1.j errorCode, @NotNull C4406l1.k errorReason, @NotNull C4406l1.f duration, @NotNull C4406l1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull C4406l1.j errorCode, @NotNull C4406l1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(109, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @NotNull
            public final InterfaceC4356i1 a(@NotNull InterfaceC4423m1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(111, CollectionsKt.mutableListOf(ext1));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i1$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f43326a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f43327b = 101;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f43328c = 102;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f43329d = 103;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f43330e = 104;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f43331f = 105;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f43332g = 109;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f43333h = 110;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f43334i = 111;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f43335j = 112;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4356i1 a() {
            return f43325a.a();
        }

        @NotNull
        public static final InterfaceC4356i1 b() {
            return f43325a.b();
        }

        @NotNull
        public static final b c() {
            return f43325a.c();
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43325a.a(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 b(@NotNull InterfaceC4423m1... interfaceC4423m1Arr) {
            return f43325a.b(interfaceC4423m1Arr);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull C4406l1.j jVar, @NotNull C4406l1.k kVar) {
            return f43325a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull C4406l1.j jVar, @NotNull C4406l1.k kVar, @NotNull C4406l1.f fVar, @NotNull C4406l1.l lVar) {
            return f43325a.a(jVar, kVar, fVar, lVar);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull InterfaceC4423m1 interfaceC4423m1) {
            return f43325a.a(interfaceC4423m1);
        }

        @NotNull
        public static final InterfaceC4356i1 a(@NotNull C4406l1.f fVar) {
            return f43325a.a(fVar);
        }
    }

    void a(@NotNull InterfaceC4476p1 interfaceC4476p1);
}
