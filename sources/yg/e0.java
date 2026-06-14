package yg;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f118949e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f118950f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f118951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f118952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f118953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f118954d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e0(SerialDescriptor descriptor, Function2 readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f118951a = descriptor;
        this.f118952b = readIfAbsent;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.f118953c = iE != 64 ? (-1) << iE : 0L;
            this.f118954d = f118950f;
        } else {
            this.f118953c = 0L;
            this.f118954d = e(iE);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f118954d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f118954d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f118954d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f118952b.invoke(this.f118951a, Integer.valueOf(i13))).booleanValue()) {
                    this.f118954d[i10] = j10;
                    return i13;
                }
            }
            this.f118954d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f118953c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f118951a.e();
        do {
            long j10 = this.f118953c;
            if (j10 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f118953c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f118952b.invoke(this.f118951a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
