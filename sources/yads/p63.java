package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class p63 implements kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l43 f114570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f114571b = new w92();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114573d;

    public p63(int i10, l43 l43Var, int i11) {
        this.f114572c = i10;
        this.f114570a = l43Var;
        this.f114573d = i11;
    }

    @Override // yads.kp
    public final void a() {
        this.f114571b.a(w83.f117346f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        return new yads.jp(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        return yads.jp.f112424d;
     */
    @Override // yads.kp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.jp a(yads.yc0 r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            long r5 = r1.f118152d
            int r2 = r0.f114573d
            long r2 = (long) r2
            long r7 = r1.f118151c
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)
            int r2 = (int) r2
            yads.w92 r3 = r0.f114571b
            r3.c(r2)
            yads.w92 r3 = r0.f114571b
            byte[] r3 = r3.f117356a
            r4 = 0
            r1.b(r3, r4, r2, r4)
            yads.w92 r1 = r0.f114571b
            int r2 = r1.f117358c
            r3 = -1
            r9 = r3
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2a:
            int r11 = r1.f117358c
            int r12 = r1.f117357b
            int r11 = r11 - r12
            r15 = 188(0xbc, float:2.63E-43)
            if (r11 < r15) goto L9b
            byte[] r11 = r1.f117356a
        L35:
            if (r12 >= r2) goto L45
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 71
            if (r15 == r7) goto L4a
            int r12 = r12 + 1
            goto L35
        L45:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4a:
            int r7 = r12 + 188
            if (r7 <= r2) goto L4f
            goto La0
        L4f:
            int r3 = r0.f114572c
            long r3 = yads.a73.a(r12, r3, r1)
            int r8 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r8 == 0) goto L96
            yads.l43 r8 = r0.f114570a
            long r3 = r8.b(r3)
            int r8 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r8 <= 0) goto L7c
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L6e
            yads.jp r1 = new yads.jp
            r2 = -1
            r1.<init>(r2, r3, r5)
            return r1
        L6e:
            long r15 = r5 + r9
            yads.jp r11 = new yads.jp
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L7c:
            r8 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r3
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L93
            long r1 = (long) r12
            long r11 = r5 + r1
            yads.jp r7 = new yads.jp
            r8 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r8, r9, r11)
            return r7
        L93:
            long r8 = (long) r12
            r13 = r3
            r9 = r8
        L96:
            r1.e(r7)
            long r3 = (long) r7
            goto L2a
        L9b:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La0:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Lad
            long r15 = r5 + r3
            yads.jp r11 = new yads.jp
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Lad:
            yads.jp r1 = yads.jp.f112424d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.p63.a(yads.yc0, long):yads.jp");
    }
}
