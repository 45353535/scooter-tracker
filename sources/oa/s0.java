package oa;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public interface s0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f96643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96645d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f96642a = i10;
            this.f96643b = bArr;
            this.f96644c = i11;
            this.f96645d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f96642a == aVar.f96642a && this.f96644c == aVar.f96644c && this.f96645d == aVar.f96645d && Arrays.equals(this.f96643b, aVar.f96643b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f96642a * 31) + Arrays.hashCode(this.f96643b)) * 31) + this.f96644c) * 31) + this.f96645d;
        }
    }

    void a(q9.d0 d0Var, int i10, int i11);

    int b(n9.h hVar, int i10, boolean z10);

    void c(q9.d0 d0Var, int i10);

    void d(long j10);

    void e(long j10, int i10, int i11, int i12, a aVar);

    void f(io.bidmachine.media3.common.a aVar);

    int g(n9.h hVar, int i10, boolean z10, int i11);
}
