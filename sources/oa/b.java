package oa;

import androidx.media3.extractor.ts.TsExtractor;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f96451a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f96452b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f96453c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f96454d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f96455e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f96456f = {69, 87, 104, 121, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_W, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: oa.b$b, reason: collision with other inner class name */
    public static final class C1109b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f96461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f96462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f96463g;

        private C1109b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f96457a = str;
            this.f96458b = i10;
            this.f96460d = i11;
            this.f96459c = i12;
            this.f96461e = i13;
            this.f96462f = i14;
            this.f96463g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((q9.o0.P(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f96452b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f96456f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f96455e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static io.bidmachine.media3.common.a d(q9.d0 d0Var, String str, String str2, DrmInitData drmInitData) {
        q9.c0 c0Var = new q9.c0();
        c0Var.m(d0Var);
        int i10 = f96452b[c0Var.h(2)];
        c0Var.r(8);
        int i11 = f96454d[c0Var.h(3)];
        if (c0Var.h(1) != 0) {
            i11++;
        }
        int i12 = f96455e[c0Var.h(5)] * 1000;
        c0Var.c();
        d0Var.W(c0Var.d());
        return new a.b().f0(str).u0("audio/ac3").R(i11).v0(i10).Y(drmInitData).j0(str2).Q(i12).p0(i12).N();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f96451a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C1109b f(q9.c0 c0Var) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = c0Var.e();
        c0Var.r(40);
        boolean z10 = c0Var.h(5) > 10;
        c0Var.p(iE);
        int i19 = -1;
        if (z10) {
            c0Var.r(16);
            int iH = c0Var.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            c0Var.r(3);
            iC = (c0Var.h(11) + 1) * 2;
            int iH2 = c0Var.h(2);
            if (iH2 == 3) {
                i10 = f96453c[c0Var.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = c0Var.h(2);
                int i20 = f96451a[iH3];
                i14 = iH3;
                i10 = f96452b[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = c0Var.h(3);
            boolean zG = c0Var.g();
            i11 = f96454d[iH4] + (zG ? 1 : 0);
            c0Var.r(10);
            if (c0Var.g()) {
                c0Var.r(8);
            }
            if (iH4 == 0) {
                c0Var.r(5);
                if (c0Var.g()) {
                    c0Var.r(8);
                }
            }
            if (i19 == 1 && c0Var.g()) {
                c0Var.r(16);
            }
            if (c0Var.g()) {
                if (iH4 > 2) {
                    c0Var.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    c0Var.r(6);
                }
                if ((iH4 & 4) != 0) {
                    c0Var.r(i17);
                }
                if (zG && c0Var.g()) {
                    c0Var.r(5);
                }
                if (i19 == 0) {
                    if (c0Var.g()) {
                        i18 = 6;
                        c0Var.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && c0Var.g()) {
                        c0Var.r(i18);
                    }
                    if (c0Var.g()) {
                        c0Var.r(i18);
                    }
                    int iH5 = c0Var.h(2);
                    if (iH5 == 1) {
                        c0Var.r(5);
                    } else if (iH5 == 2) {
                        c0Var.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = c0Var.h(5);
                        if (c0Var.g()) {
                            c0Var.r(5);
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                if (c0Var.g()) {
                                    c0Var.r(4);
                                }
                                if (c0Var.g()) {
                                    c0Var.r(4);
                                }
                            }
                        }
                        if (c0Var.g()) {
                            c0Var.r(5);
                            if (c0Var.g()) {
                                c0Var.r(7);
                                if (c0Var.g()) {
                                    c0Var.r(8);
                                }
                            }
                        }
                        c0Var.r((iH6 + 2) * 8);
                        c0Var.c();
                    }
                    if (iH4 < 2) {
                        if (c0Var.g()) {
                            c0Var.r(14);
                        }
                        if (iH4 == 0 && c0Var.g()) {
                            c0Var.r(14);
                        }
                    }
                    if (c0Var.g()) {
                        if (i14 == 0) {
                            c0Var.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (c0Var.g()) {
                                    c0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c0Var.g()) {
                c0Var.r(5);
                if (iH4 == 2) {
                    c0Var.r(4);
                }
                if (iH4 >= 6) {
                    c0Var.r(2);
                }
                if (c0Var.g()) {
                    c0Var.r(8);
                }
                if (iH4 == 0 && c0Var.g()) {
                    c0Var.r(8);
                }
                if (iH2 < 3) {
                    c0Var.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                c0Var.q();
            }
            if (i19 == 2 && (i14 == 3 || c0Var.g())) {
                i16 = 6;
                c0Var.r(6);
            } else {
                i16 = 6;
            }
            str = (c0Var.g() && c0Var.h(i16) == 1 && c0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            c0Var.r(32);
            int iH7 = c0Var.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = c0Var.h(6);
            int i22 = f96455e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            c0Var.r(8);
            int iH9 = c0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                c0Var.r(2);
            }
            if ((iH9 & 4) != 0) {
                c0Var.r(2);
            }
            if (iH9 == 2) {
                c0Var.r(2);
            }
            int[] iArr = f96452b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f96454d[iH9] + (c0Var.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C1109b(str, i19, i11, i10, iC, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.bidmachine.media3.common.a h(q9.d0 r7, java.lang.String r8, java.lang.String r9, io.bidmachine.media3.common.DrmInitData r10) {
        /*
            q9.c0 r0 = new q9.c0
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = oa.b.f96452b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = oa.b.f96454d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.r(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.W(r0)
            io.bidmachine.media3.common.a$b r7 = new io.bidmachine.media3.common.a$b
            r7.<init>()
            io.bidmachine.media3.common.a$b r7 = r7.f0(r8)
            io.bidmachine.media3.common.a$b r7 = r7.u0(r2)
            io.bidmachine.media3.common.a$b r7 = r7.R(r4)
            io.bidmachine.media3.common.a$b r7 = r7.v0(r3)
            io.bidmachine.media3.common.a$b r7 = r7.Y(r10)
            io.bidmachine.media3.common.a$b r7 = r7.j0(r9)
            io.bidmachine.media3.common.a$b r7 = r7.p0(r1)
            io.bidmachine.media3.common.a r7 = r7.N()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.b.h(q9.d0, java.lang.String, java.lang.String, io.bidmachine.media3.common.DrmInitData):io.bidmachine.media3.common.a");
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
