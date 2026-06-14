package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4333gc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f43184e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile C4333gc f43185f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private C4589vd f43186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f43187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f43188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private S3 f43189d;

    /* JADX INFO: renamed from: com.ironsource.gc$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4333gc a() {
            C4333gc c4333gc;
            C4333gc c4333gc2 = C4333gc.f43185f;
            if (c4333gc2 != null) {
                return c4333gc2;
            }
            synchronized (this) {
                c4333gc = C4333gc.f43185f;
                if (c4333gc == null) {
                    c4333gc = new C4333gc(null);
                    C4333gc.f43185f = c4333gc;
                }
            }
            return c4333gc;
        }

        private a() {
        }

        @NotNull
        public final InterfaceC4271d1 a(@NotNull IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C4333gc c4333gc = C4333gc.f43185f;
            S3 s3B = c4333gc != null ? c4333gc.b() : null;
            C4333gc c4333gc2 = C4333gc.f43185f;
            C4589vd c4589vdE = c4333gc2 != null ? c4333gc2.e() : null;
            if (s3B != null && c4589vdE != null) {
                return new C4495q3(s3B, c4589vdE, adFormat);
            }
            return new C4393k5();
        }
    }

    public /* synthetic */ C4333gc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final C4333gc d() {
        return f43184e.a();
    }

    @Nullable
    public final S3 b() {
        return this.f43189d;
    }

    @NotNull
    public final AtomicBoolean c() {
        return this.f43187b;
    }

    @Nullable
    public final C4589vd e() {
        return this.f43186a;
    }

    @NotNull
    public final String f() {
        return this.f43188c;
    }

    public final void g() {
        this.f43187b.set(true);
    }

    private C4333gc() {
        this.f43187b = new AtomicBoolean(false);
        this.f43188c = "";
    }

    public final void a(@Nullable C4589vd c4589vd) {
        this.f43186a = c4589vd;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f43188c = str;
    }

    public final void a(@Nullable S3 s32) {
        this.f43189d = s32;
    }
}
