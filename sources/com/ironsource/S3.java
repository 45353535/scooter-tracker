package com.ironsource;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Rd f41713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final E9 f41714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final T2 f41715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Nb f41716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final C4645z1 f41717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Ff f41718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final com.ironsource.mediationsdk.adquality.a f41719g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Rd f41720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private E9 f41721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private T2 f41722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Nb f41723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private C4645z1 f41724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Ff f41725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private com.ironsource.mediationsdk.adquality.a f41726g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @NotNull
        public final a a(@Nullable Rd rd2, @Nullable E9 e92, @Nullable T2 t22, @Nullable Nb nb2, @Nullable C4645z1 c4645z1, @Nullable Ff ff2, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(rd2, e92, t22, nb2, c4645z1, ff2, aVar);
        }

        @Nullable
        public final Rd b() {
            return this.f41720a;
        }

        @Nullable
        public final E9 c() {
            return this.f41721b;
        }

        @Nullable
        public final T2 d() {
            return this.f41722c;
        }

        @Nullable
        public final Nb e() {
            return this.f41723d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f41720a, aVar.f41720a) && Intrinsics.areEqual(this.f41721b, aVar.f41721b) && Intrinsics.areEqual(this.f41722c, aVar.f41722c) && Intrinsics.areEqual(this.f41723d, aVar.f41723d) && Intrinsics.areEqual(this.f41724e, aVar.f41724e) && Intrinsics.areEqual(this.f41725f, aVar.f41725f) && Intrinsics.areEqual(this.f41726g, aVar.f41726g);
        }

        @Nullable
        public final C4645z1 f() {
            return this.f41724e;
        }

        @Nullable
        public final Ff g() {
            return this.f41725f;
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.f41726g;
        }

        public int hashCode() {
            Rd rd2 = this.f41720a;
            int iHashCode = (rd2 == null ? 0 : rd2.hashCode()) * 31;
            E9 e92 = this.f41721b;
            int iHashCode2 = (iHashCode + (e92 == null ? 0 : e92.hashCode())) * 31;
            T2 t22 = this.f41722c;
            int iHashCode3 = (iHashCode2 + (t22 == null ? 0 : t22.hashCode())) * 31;
            Nb nb2 = this.f41723d;
            int iHashCode4 = (iHashCode3 + (nb2 == null ? 0 : nb2.hashCode())) * 31;
            C4645z1 c4645z1 = this.f41724e;
            int iHashCode5 = (iHashCode4 + (c4645z1 == null ? 0 : c4645z1.hashCode())) * 31;
            Ff ff2 = this.f41725f;
            int iHashCode6 = (iHashCode5 + (ff2 == null ? 0 : ff2.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.f41726g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.f41726g;
        }

        @Nullable
        public final C4645z1 j() {
            return this.f41724e;
        }

        @Nullable
        public final T2 k() {
            return this.f41722c;
        }

        @Nullable
        public final E9 l() {
            return this.f41721b;
        }

        @Nullable
        public final Nb m() {
            return this.f41723d;
        }

        @Nullable
        public final Rd n() {
            return this.f41720a;
        }

        @Nullable
        public final Ff o() {
            return this.f41725f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f41720a + ", interstitialConfigurations=" + this.f41721b + ", bannerConfigurations=" + this.f41722c + ", nativeAdConfigurations=" + this.f41723d + ", applicationConfigurations=" + this.f41724e + ", testSuiteSettings=" + this.f41725f + ", adQualityConfigurations=" + this.f41726g + ")";
        }

        public a(@Nullable Rd rd2, @Nullable E9 e92, @Nullable T2 t22, @Nullable Nb nb2, @Nullable C4645z1 c4645z1, @Nullable Ff ff2, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.f41720a = rd2;
            this.f41721b = e92;
            this.f41722c = t22;
            this.f41723d = nb2;
            this.f41724e = c4645z1;
            this.f41725f = ff2;
            this.f41726g = aVar;
        }

        public static /* synthetic */ a a(a aVar, Rd rd2, E9 e92, T2 t22, Nb nb2, C4645z1 c4645z1, Ff ff2, com.ironsource.mediationsdk.adquality.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rd2 = aVar.f41720a;
            }
            if ((i10 & 2) != 0) {
                e92 = aVar.f41721b;
            }
            if ((i10 & 4) != 0) {
                t22 = aVar.f41722c;
            }
            if ((i10 & 8) != 0) {
                nb2 = aVar.f41723d;
            }
            if ((i10 & 16) != 0) {
                c4645z1 = aVar.f41724e;
            }
            if ((i10 & 32) != 0) {
                ff2 = aVar.f41725f;
            }
            if ((i10 & 64) != 0) {
                aVar2 = aVar.f41726g;
            }
            Ff ff3 = ff2;
            com.ironsource.mediationsdk.adquality.a aVar3 = aVar2;
            C4645z1 c4645z12 = c4645z1;
            T2 t23 = t22;
            return aVar.a(rd2, e92, t23, nb2, c4645z12, ff3, aVar3);
        }

        public final void b(@Nullable Rd rd2) {
            this.f41720a = rd2;
        }

        public final void a(@Nullable Ff ff2) {
            this.f41725f = ff2;
        }

        public final void b(@Nullable E9 e92) {
            this.f41721b = e92;
        }

        @NotNull
        public final a a(@Nullable Rd rd2) {
            this.f41720a = rd2;
            return this;
        }

        public final void b(@Nullable T2 t22) {
            this.f41722c = t22;
        }

        @NotNull
        public final a a(@Nullable E9 e92) {
            this.f41721b = e92;
            return this;
        }

        public final void b(@Nullable Nb nb2) {
            this.f41723d = nb2;
        }

        @NotNull
        public final a a(@Nullable T2 t22) {
            this.f41722c = t22;
            return this;
        }

        public final void b(@Nullable C4645z1 c4645z1) {
            this.f41724e = c4645z1;
        }

        @NotNull
        public final a a(@Nullable Nb nb2) {
            this.f41723d = nb2;
            return this;
        }

        public final void b(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.f41726g = aVar;
        }

        @NotNull
        public final a a(@Nullable C4645z1 c4645z1) {
            this.f41724e = c4645z1;
            return this;
        }

        @NotNull
        public final a b(@Nullable Ff ff2) {
            this.f41725f = ff2;
            return this;
        }

        @NotNull
        public final a a(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.f41726g = aVar;
            return this;
        }

        public /* synthetic */ a(Rd rd2, E9 e92, T2 t22, Nb nb2, C4645z1 c4645z1, Ff ff2, com.ironsource.mediationsdk.adquality.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : rd2, (i10 & 2) != 0 ? null : e92, (i10 & 4) != 0 ? null : t22, (i10 & 8) != 0 ? null : nb2, (i10 & 16) != 0 ? null : c4645z1, (i10 & 32) != 0 ? null : ff2, (i10 & 64) != 0 ? null : aVar);
        }

        @NotNull
        public final S3 a() {
            return new S3(this.f41720a, this.f41721b, this.f41722c, this.f41723d, this.f41724e, this.f41725f, this.f41726g, null);
        }
    }

    public /* synthetic */ S3(Rd rd2, E9 e92, T2 t22, Nb nb2, C4645z1 c4645z1, Ff ff2, com.ironsource.mediationsdk.adquality.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(rd2, e92, t22, nb2, c4645z1, ff2, aVar);
    }

    @Nullable
    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.f41719g;
    }

    @Nullable
    public final C4645z1 b() {
        return this.f41717e;
    }

    @Nullable
    public final T2 c() {
        return this.f41715c;
    }

    @Nullable
    public final E9 d() {
        return this.f41714b;
    }

    @Nullable
    public final Nb e() {
        return this.f41716d;
    }

    @Nullable
    public final Rd f() {
        return this.f41713a;
    }

    @Nullable
    public final Ff g() {
        return this.f41718f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.f41713a + IOUtils.LINE_SEPARATOR_UNIX + this.f41714b + IOUtils.LINE_SEPARATOR_UNIX + this.f41715c + IOUtils.LINE_SEPARATOR_UNIX + this.f41716d + ")";
    }

    private S3(Rd rd2, E9 e92, T2 t22, Nb nb2, C4645z1 c4645z1, Ff ff2, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f41713a = rd2;
        this.f41714b = e92;
        this.f41715c = t22;
        this.f41716d = nb2;
        this.f41717e = c4645z1;
        this.f41718f = ff2;
        this.f41719g = aVar;
    }
}
