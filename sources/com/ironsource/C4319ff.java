package com.ironsource;

import com.ironsource.InterfaceC4499q7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4319ff implements InterfaceC4499q7, InterfaceC4499q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f43122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q8 f43123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, C4268cf> f43124c;

    /* JADX INFO: renamed from: com.ironsource.ff$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f43125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f43126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Long f43127c;

        public a(int i10, long j10, @Nullable Long l10) {
            this.f43125a = i10;
            this.f43126b = j10;
            this.f43127c = l10;
        }

        public final int a() {
            return this.f43125a;
        }

        public final long b() {
            return this.f43126b;
        }

        @Nullable
        public final Long c() {
            return this.f43127c;
        }

        public final int d() {
            return this.f43125a;
        }

        public final long e() {
            return this.f43126b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f43125a == aVar.f43125a && this.f43126b == aVar.f43126b && Intrinsics.areEqual(this.f43127c, aVar.f43127c);
        }

        @Nullable
        public final Long f() {
            return this.f43127c;
        }

        public int hashCode() {
            int iA = ((this.f43125a * 31) + androidx.collection.b.a(this.f43126b)) * 31;
            Long l10 = this.f43127c;
            return iA + (l10 == null ? 0 : l10.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f43125a + ", currentTime=" + this.f43126b + ", currentTimeThreshold=" + this.f43127c + ")";
        }

        @NotNull
        public final a a(int i10, long j10, @Nullable Long l10) {
            return new a(i10, j10, l10);
        }

        public static /* synthetic */ a a(a aVar, int i10, long j10, Long l10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f43125a;
            }
            if ((i11 & 2) != 0) {
                j10 = aVar.f43126b;
            }
            if ((i11 & 4) != 0) {
                l10 = aVar.f43127c;
            }
            return aVar.a(i10, j10, l10);
        }

        public final void a(int i10) {
            this.f43125a = i10;
        }

        public final void a(long j10) {
            this.f43126b = j10;
        }

        public final void a(@Nullable Long l10) {
            this.f43127c = l10;
        }
    }

    public C4319ff(@NotNull InterfaceC4496q4 currentTimeProvider, @NotNull Q8 serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f43122a = currentTimeProvider;
        this.f43123b = serviceDataRepository;
        this.f43124c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.f43123b.a(str), this.f43122a.a(), this.f43123b.b(str));
    }

    @NotNull
    public final Map<String, C4268cf> a() {
        return this.f43124c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC4499q7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Map<java.lang.String, com.ironsource.cf> r0 = r8.f43124c
            java.lang.Object r0 = r0.get(r9)
            com.ironsource.cf r0 = (com.ironsource.C4268cf) r0
            if (r0 != 0) goto L10
            return
        L10:
            com.ironsource.ff$a r1 = r8.c(r9)
            int r2 = r1.d()
            r3 = 1
            if (r2 == 0) goto L30
            long r4 = r1.e()
            java.lang.Long r2 = r1.f()
            if (r2 == 0) goto L2a
            long r6 = r2.longValue()
            goto L2c
        L2a:
            r6 = 0
        L2c:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L47
        L30:
            long r4 = r1.e()
            com.ironsource.M3 r0 = r0.b()
            r2 = 0
            long r6 = com.ironsource.M3.a(r0, r2, r3, r2)
            long r4 = r4 + r6
            com.ironsource.Q8 r0 = r8.f43123b
            r0.a(r4, r9)
            r0 = 0
            r1.a(r0)
        L47:
            int r0 = r1.d()
            int r0 = r0 + r3
            r1.a(r0)
            com.ironsource.Q8 r0 = r8.f43123b
            int r1 = r1.d()
            r0.a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4319ff.b(java.lang.String):void");
    }

    @Override // com.ironsource.InterfaceC4499q7
    @NotNull
    public L3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C4268cf c4268cf = this.f43124c.get(identifier);
        return c4268cf == null ? new L3(false, null, 2, null) : a(c4268cf, identifier) ? new L3(true, N3.ShowCount) : new L3(false, null, 2, null);
    }

    private final boolean a(C4268cf c4268cf, String str) {
        a aVarC = c(str);
        Long lF = aVarC.f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            if (aVarC.d() >= c4268cf.a() && this.f43122a.a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4499q7.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull N3 cappingType, @NotNull InterfaceC4465o7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objC = cappingConfig.c();
        if (Result.j(objC)) {
            C4268cf c4268cf = (C4268cf) objC;
            if (c4268cf != null) {
                this.f43124c.put(identifier, c4268cf);
            }
            return Result.b(Unit.f93236a);
        }
        Throwable thG = Result.g(objC);
        if (thG != null) {
            return Result.b(kotlin.d.a(thG));
        }
        return Result.b(Unit.f93236a);
    }
}
