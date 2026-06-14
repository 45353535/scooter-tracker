package wh;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import vh.a0;
import vh.g0;
import vh.p0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f108012a = p0.a("0123456789abcdef");

    public static final byte[] a() {
        return f108012a;
    }

    public static final boolean b(g0 segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f106835c;
        byte[] bArr = segment.f106833a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f106838f;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.f106833a;
                bArr = bArr2;
                i10 = segment.f106834b;
                i13 = segment.f106835c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String c(vh.e eVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.z(j11) == 13) {
                String utf8 = eVar.readUtf8(j11);
                eVar.skip(2L);
                return utf8;
            }
        }
        String utf82 = eVar.readUtf8(j10);
        eVar.skip(1L);
        return utf82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int d(vh.e r17, vh.a0 r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            vh.g0 r0 = r0.f106814b
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L18
            if (r19 == 0) goto L17
            return r1
        L17:
            return r3
        L18:
            byte[] r4 = r0.f106833a
            int r5 = r0.f106834b
            int r6 = r0.f106835c
            int[] r2 = r2.getTrie$okio()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L26:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L31
            r10 = r11
        L31:
            if (r9 != 0) goto L34
            goto L64
        L34:
            r11 = 0
            if (r12 >= 0) goto L7d
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3b:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L48
            goto L87
        L48:
            if (r14 != r13) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r12 != r6) goto L6d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            vh.g0 r4 = r9.f106838f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r6 = r4.f106834b
            byte[] r8 = r4.f106833a
            int r9 = r4.f106835c
            if (r4 != r0) goto L67
            if (r5 == 0) goto L64
            r4 = r8
            r8 = r11
            goto L70
        L64:
            if (r19 == 0) goto L87
            return r1
        L67:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r6
            r6 = r12
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3b
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L85:
            if (r8 != r14) goto L88
        L87:
            return r10
        L88:
            r15 = r2[r8]
            if (r5 != r15) goto La9
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La2
            vh.g0 r9 = r9.f106838f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r4 = r9.f106834b
            byte[] r6 = r9.f106833a
            int r8 = r9.f106835c
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L26
        La9:
            int r8 = r8 + 1
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a.d(vh.e, vh.a0, boolean):int");
    }

    public static /* synthetic */ int e(vh.e eVar, a0 a0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d(eVar, a0Var, z10);
    }
}
