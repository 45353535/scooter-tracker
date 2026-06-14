package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f96948d = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ze.a f96949e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f96950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f96951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f96952c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        KType kTypeO = null;
        KClass kClassB = kotlin.jvm.internal.v0.b(x0.class);
        try {
            kTypeO = kotlin.jvm.internal.v0.o(x0.class);
        } catch (Throwable unused) {
        }
        f96949e = new ze.a("TimeoutConfiguration", new ff.a(kClassB, kTypeO));
    }

    public /* synthetic */ x0(Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
    }

    private final Long a(Long l10) {
        if (l10 == null || l10.longValue() > 0) {
            return l10;
        }
        throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
    }

    public final Long b() {
        return this.f96951b;
    }

    public final Long c() {
        return this.f96950a;
    }

    public final Long d() {
        return this.f96952c;
    }

    public final void e(Long l10) {
        this.f96951b = a(l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.areEqual(this.f96950a, x0Var.f96950a) && Intrinsics.areEqual(this.f96951b, x0Var.f96951b) && Intrinsics.areEqual(this.f96952c, x0Var.f96952c);
    }

    public final void f(Long l10) {
        this.f96950a = a(l10);
    }

    public final void g(Long l10) {
        this.f96952c = a(l10);
    }

    public int hashCode() {
        Long l10 = this.f96950a;
        int iHashCode = (l10 != null ? l10.hashCode() : 0) * 31;
        Long l11 = this.f96951b;
        int iHashCode2 = (iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
        Long l12 = this.f96952c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    public x0(Long l10, Long l11, Long l12) {
        this.f96950a = 0L;
        this.f96951b = 0L;
        this.f96952c = 0L;
        f(l10);
        e(l11);
        g(l12);
    }
}
