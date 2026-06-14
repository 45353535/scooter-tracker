package zg;

import com.ironsource.C4240b4;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f119441a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f119442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119443c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f119444a = new a();

        private a() {
        }
    }

    public l0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f119442b = iArr;
        this.f119443c = -1;
    }

    private final void e() {
        int i10 = this.f119443c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f119441a, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f119441a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f119442b, i10);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f119442b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f119443c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f119441a[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.areEqual(serialDescriptor.getKind(), m.b.f108009a)) {
                    int i12 = this.f119442b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.f(i12));
                    }
                } else if (this.f119442b[i11] != -1) {
                    sb2.append(C4240b4.j.f42672d);
                    sb2.append(this.f119442b[i11]);
                    sb2.append(C4240b4.j.f42674e);
                }
            } else if (obj != a.f119444a) {
                sb2.append(C4240b4.j.f42672d);
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append(C4240b4.j.f42674e);
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i10 = this.f119443c;
        int[] iArr = this.f119442b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f119443c = i10 - 1;
        }
        int i11 = this.f119443c;
        if (i11 != -1) {
            this.f119443c = i11 - 1;
        }
    }

    public final void c(SerialDescriptor sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i10 = this.f119443c + 1;
        this.f119443c = i10;
        if (i10 == this.f119441a.length) {
            e();
        }
        this.f119441a[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.f119442b;
        int i10 = this.f119443c;
        if (iArr[i10] == -2) {
            this.f119441a[i10] = a.f119444a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f119442b;
        int i10 = this.f119443c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f119443c = i11;
            if (i11 == this.f119441a.length) {
                e();
            }
        }
        Object[] objArr = this.f119441a;
        int i12 = this.f119443c;
        objArr[i12] = obj;
        this.f119442b[i12] = -2;
    }

    public final void g(int i10) {
        this.f119442b[this.f119443c] = i10;
    }

    public String toString() {
        return a();
    }
}
