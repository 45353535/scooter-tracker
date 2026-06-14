package na;

/* JADX INFO: loaded from: classes12.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f95697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f95698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95700d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f95701a;

        public a(b... bVarArr) {
            this.f95701a = bVarArr;
        }

        public b a(int i10) {
            return this.f95701a[i10];
        }

        public int b() {
            return this.f95701a.length;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f95704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f95705d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f95702a = i10;
            q9.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f95704c = fArr;
            this.f95705d = fArr2;
            this.f95703b = i11;
        }

        public int a() {
            return this.f95704c.length / 3;
        }
    }

    public e(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static e a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14;
        int i15 = i10;
        int i16 = 3;
        int i17 = 1;
        q9.a.a(f10 > 0.0f);
        q9.a.a(i15 >= 1);
        q9.a.a(i11 >= 1);
        q9.a.a(f11 > 0.0f && f11 <= 180.0f);
        q9.a.a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i15;
        float f14 = radians2 / i11;
        int i18 = i11 + 1;
        int i19 = ((i18 * 2) + 2) * i15;
        float[] fArr = new float[i19 * 3];
        float[] fArr2 = new float[i19 * 2];
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < i15) {
            float f15 = radians / 2.0f;
            float f16 = (i20 * f13) - f15;
            int i23 = i16;
            int i24 = i20 + 1;
            int i25 = i17;
            float f17 = (i24 * f13) - f15;
            int i26 = 0;
            while (i26 < i18) {
                float f18 = radians;
                float f19 = radians2;
                int i27 = i22;
                int i28 = 0;
                int i29 = 2;
                while (i28 < i29) {
                    int i30 = i24;
                    float f20 = i26 * f14;
                    float f21 = f13;
                    float f22 = f14;
                    double d10 = f10;
                    double d11 = (f20 + 3.1415927f) - (f19 / 2.0f);
                    double d12 = i28 == 0 ? f16 : f17;
                    fArr[i21] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    fArr[i21 + 1] = (float) (d10 * Math.sin(d12));
                    int i31 = i21 + 3;
                    fArr[i21 + 2] = (float) (Math.cos(d11) * d10 * Math.cos(d12));
                    fArr2[i27] = f20 / f19;
                    int i32 = i27 + 2;
                    fArr2[i27 + 1] = ((i20 + i28) * f21) / f18;
                    if ((i26 == 0 && i28 == 0) || (i26 == i11 && i28 == i25)) {
                        i13 = i23;
                        System.arraycopy(fArr, i21, fArr, i31, i13);
                        i21 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i27, fArr2, i32, 2);
                        i27 += 4;
                    } else {
                        i13 = i23;
                        i14 = 2;
                        i21 = i31;
                        i27 = i32;
                    }
                    i28++;
                    i23 = i13;
                    i25 = 1;
                    i29 = i14;
                    i24 = i30;
                    f13 = f21;
                    f14 = f22;
                }
                i26 += i25;
                radians = f18;
                i22 = i27;
                i24 = i24;
                f14 = f14;
                radians2 = f19;
            }
            int i33 = i24;
            i15 = i10;
            i16 = i23;
            i17 = i25;
            i20 = i33;
        }
        int i34 = i17;
        b[] bVarArr = new b[i34];
        bVarArr[0] = new b(0, fArr, fArr2, i34);
        return new e(new a(bVarArr), i12);
    }

    public static e b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public e(a aVar, a aVar2, int i10) {
        this.f95697a = aVar;
        this.f95698b = aVar2;
        this.f95699c = i10;
        this.f95700d = aVar == aVar2;
    }
}
