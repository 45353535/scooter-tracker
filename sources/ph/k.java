package ph;

import com.google.common.base.Ascii;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f98536a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f98537b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f98538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f98539d;

    static {
        byte[] bArr = {13, Ascii.ETB, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.CAN, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, 6, 10, 10, Ascii.FF, 13, 6, 8, Ascii.VT, 10, 10, 8, Ascii.VT, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, Ascii.SI, 6, Ascii.FF, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, Ascii.SO, 6, Ascii.SI, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, Ascii.SI, Ascii.VT, Ascii.SO, 13, Ascii.FS, Ascii.DC4, Ascii.SYN, Ascii.DC4, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.SYN, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.SUB, Ascii.DC4, 19, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.CAN, Ascii.EM, 19, Ascii.NAK, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.NAK, Ascii.NAK, Ascii.SUB, Ascii.SUB, Ascii.FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.DC4, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.EM, Ascii.EM, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.ESC, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.SUB};
        f98538c = bArr;
        f98539d = new a();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            f98536a.a(i10, f98537b[i10], f98538c[i10]);
        }
    }

    private k() {
    }

    private final void a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f98539d;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] aVarArrA = aVar2.a();
            Intrinsics.checkNotNull(aVarArrA);
            a aVar3 = aVarArrA[i13];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrA[i13] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] aVarArrA2 = aVar2.a();
        Intrinsics.checkNotNull(aVarArrA2);
        ArraysKt.fill(aVarArrA2, aVar, i15, (1 << i14) + i15);
    }

    public final void b(vh.g source, long j10, vh.f sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = f98539d;
        int iD = 0;
        int iC = 0;
        for (long j11 = 0; j11 < j10; j11++) {
            iD = (iD << 8) | ih.d.d(source.readByte(), 255);
            iC += 8;
            while (iC >= 8) {
                a[] aVarArrA = aVar.a();
                Intrinsics.checkNotNull(aVarArrA);
                aVar = aVarArrA[(iD >>> (iC - 8)) & 255];
                Intrinsics.checkNotNull(aVar);
                if (aVar.a() == null) {
                    sink.writeByte(aVar.b());
                    iC -= aVar.c();
                    aVar = f98539d;
                } else {
                    iC -= 8;
                }
            }
        }
        while (iC > 0) {
            a[] aVarArrA2 = aVar.a();
            Intrinsics.checkNotNull(aVarArrA2);
            a aVar2 = aVarArrA2[(iD << (8 - iC)) & 255];
            Intrinsics.checkNotNull(aVar2);
            if (aVar2.a() != null || aVar2.c() > iC) {
                return;
            }
            sink.writeByte(aVar2.b());
            iC -= aVar2.c();
            aVar = f98539d;
        }
    }

    public final void c(vh.h source, vh.f sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iK = source.K();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iK; i11++) {
            int iD = ih.d.d(source.l(i11), 255);
            int i12 = f98537b[iD];
            byte b10 = f98538c[iD];
            j10 = (j10 << b10) | ((long) i12);
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    public final int d(vh.h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int iK = bytes.K();
        long j10 = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            j10 += (long) f98538c[ih.d.d(bytes.l(i10), 255)];
        }
        return (int) ((j10 + ((long) 7)) >> 3);
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f98540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f98541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f98542c;

        public a() {
            this.f98540a = new a[256];
            this.f98541b = 0;
            this.f98542c = 0;
        }

        public final a[] a() {
            return this.f98540a;
        }

        public final int b() {
            return this.f98541b;
        }

        public final int c() {
            return this.f98542c;
        }

        public a(int i10, int i11) {
            this.f98540a = null;
            this.f98541b = i10;
            int i12 = i11 & 7;
            this.f98542c = i12 == 0 ? 8 : i12;
        }
    }
}
