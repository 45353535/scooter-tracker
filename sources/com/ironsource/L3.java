package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final N3 f41231b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41232a;

        static {
            int[] iArr = new int[N3.values().length];
            try {
                iArr[N3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41232a = iArr;
        }
    }

    public L3(boolean z10, @Nullable N3 n32) {
        this.f41230a = z10;
        this.f41231b = n32;
    }

    public final boolean a() {
        return this.f41230a;
    }

    @Nullable
    public final N3 b() {
        return this.f41231b;
    }

    @Nullable
    public final N3 c() {
        return this.f41231b;
    }

    public final boolean d() {
        return this.f41230a;
    }

    @Nullable
    public final String e() {
        N3 n32 = this.f41231b;
        int i10 = n32 == null ? -1 : a.f41232a[n32.ordinal()];
        if (i10 == 1) {
            return "Placement delivery is false";
        }
        if (i10 == 2) {
            return "In pacing mode";
        }
        if (i10 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L3)) {
            return false;
        }
        L3 l32 = (L3) obj;
        return this.f41230a == l32.f41230a && this.f41231b == l32.f41231b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f41230a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        N3 n32 = this.f41231b;
        return i10 + (n32 == null ? 0 : n32.hashCode());
    }

    @NotNull
    public String toString() {
        return "CappingStatus(isCapped=" + this.f41230a + " reason=" + this.f41231b + ")";
    }

    public /* synthetic */ L3(boolean z10, N3 n32, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : n32);
    }

    @NotNull
    public final L3 a(boolean z10, @Nullable N3 n32) {
        return new L3(z10, n32);
    }

    public static /* synthetic */ L3 a(L3 l32, boolean z10, N3 n32, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = l32.f41230a;
        }
        if ((i10 & 2) != 0) {
            n32 = l32.f41231b;
        }
        return l32.a(z10, n32);
    }
}
