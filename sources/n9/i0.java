package n9;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f95401b = new i0(ImmutableList.of());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f95402c = o0.C0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableList f95403a;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f95404f = o0.C0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f95405g = o0.C0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f95406h = o0.C0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f95407i = o0.C0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f95409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f95410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f95411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f95412e;

        public a(f0 f0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = f0Var.f95294a;
            this.f95408a = i10;
            boolean z11 = false;
            q9.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f95409b = f0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f95410c = z11;
            this.f95411d = (int[]) iArr.clone();
            this.f95412e = (boolean[]) zArr.clone();
        }

        public f0 a() {
            return this.f95409b;
        }

        public io.bidmachine.media3.common.a b(int i10) {
            return this.f95409b.a(i10);
        }

        public int c() {
            return this.f95409b.f95296c;
        }

        public boolean d() {
            return this.f95410c;
        }

        public boolean e() {
            return Booleans.contains(this.f95412e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f95410c == aVar.f95410c && this.f95409b.equals(aVar.f95409b) && Arrays.equals(this.f95411d, aVar.f95411d) && Arrays.equals(this.f95412e, aVar.f95412e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(boolean z10) {
            for (int i10 = 0; i10 < this.f95411d.length; i10++) {
                if (i(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i10) {
            return this.f95412e[i10];
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public int hashCode() {
            return (((((this.f95409b.hashCode() * 31) + (this.f95410c ? 1 : 0)) * 31) + Arrays.hashCode(this.f95411d)) * 31) + Arrays.hashCode(this.f95412e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f95411d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }
    }

    public i0(List list) {
        this.f95403a = ImmutableList.copyOf((Collection) list);
    }

    public ImmutableList a() {
        return this.f95403a;
    }

    public boolean b() {
        return this.f95403a.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f95403a.size(); i11++) {
            a aVar = (a) this.f95403a.get(i11);
            if (aVar.e() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f95403a.size(); i11++) {
            if (((a) this.f95403a.get(i11)).c() == i10 && ((a) this.f95403a.get(i11)).f(z10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        return this.f95403a.equals(((i0) obj).f95403a);
    }

    public int hashCode() {
        return this.f95403a.hashCode();
    }
}
