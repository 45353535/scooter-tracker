package ph;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f98546c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f98548b = new int[10];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f98548b[i10];
    }

    public final int b() {
        if ((this.f98547a & 2) != 0) {
            return this.f98548b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f98547a & 128) != 0) {
            return this.f98548b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f98547a & 16) != 0) {
            return this.f98548b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f98547a & 32) != 0 ? this.f98548b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f98547a) != 0;
    }

    public final void g(m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f98548b;
            if (i10 < iArr.length) {
                this.f98547a = (1 << i10) | this.f98547a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f98547a);
    }
}
