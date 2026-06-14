package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    public static Decoder getDecoder() {
        return Decoder.f84777d;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.f84778e;
    }

    public static class Decoder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f84775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f84776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Decoder f84777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Decoder f84778e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84779a;

        public Decoder(boolean z10) {
            this.f84779a = z10;
        }

        static {
            int[] iArr = new int[256];
            f84775b = iArr;
            Arrays.fill(iArr, -1);
            for (int i10 = 0; i10 < 64; i10++) {
                f84775b[AbstractC5650b.f84823a[i10]] = i10;
            }
            f84775b[61] = -2;
            int[] iArr2 = new int[256];
            f84776c = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i11 = 0; i11 < 64; i11++) {
                f84776c[AbstractC5650b.f84824b[i11]] = i11;
            }
            f84776c[61] = -2;
            f84777d = new Decoder(false);
            f84778e = new Decoder(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
        
            if (r11 != 18) goto L57;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] decode(java.lang.String r20) {
            /*
                Method dump skipped, instruction units count: 359
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }
}
