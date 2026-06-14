package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class tq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp0 f116341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xo0 f116342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yc0 f116343c;

    public tq(cp0 cp0Var) {
        this.f116341a = cp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        if (r7.f116342b != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        r12 = new java.lang.StringBuilder("None of the available extractors (");
        r13 = yads.w83.f117341a;
        r13 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r11 >= r8.length) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        r13.append(r8[r11].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        if (r11 >= (r8.length - 1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        r13.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        r12.append(r13.toString());
        r12.append(") could read the stream.");
        r8 = r12.toString();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        throw new yads.x73(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.c30 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, yads.ap0 r15) throws yads.x73 {
        /*
            r7 = this;
            r0 = 1
            yads.yc0 r1 = new yads.yc0
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f116343c = r1
            yads.xo0 r8 = r7.f116342b
            if (r8 == 0) goto L10
            return
        L10:
            yads.cp0 r8 = r7.f116341a
            yads.xo0[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r11 = 0
            if (r10 != r0) goto L20
            r8 = r8[r11]
            r7.f116342b = r8
            goto Lb4
        L20:
            int r10 = r8.length
            r12 = r11
        L22:
            if (r12 >= r10) goto L6e
            r13 = r8[r12]
            boolean r14 = r13.a(r1)     // Catch: java.lang.Throwable -> L31 java.io.EOFException -> L59
            if (r14 == 0) goto L34
            r7.f116342b = r13     // Catch: java.lang.Throwable -> L31 java.io.EOFException -> L59
            r1.f118154f = r11
            goto L6e
        L31:
            r0 = move-exception
            r8 = r0
            goto L45
        L34:
            yads.xo0 r13 = r7.f116342b
            if (r13 != 0) goto L6a
            long r13 = r1.f118152d
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L3f
            goto L6a
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L45:
            yads.xo0 r9 = r7.f116342b
            if (r9 != 0) goto L56
            long r9 = r1.f118152d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L50
            goto L56
        L50:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L56:
            r1.f118154f = r11
            throw r8
        L59:
            yads.xo0 r13 = r7.f116342b
            if (r13 != 0) goto L6a
            long r13 = r1.f118152d
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L64
            goto L6a
        L64:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L6a:
            r1.f118154f = r11
            int r12 = r12 + r0
            goto L22
        L6e:
            yads.xo0 r10 = r7.f116342b
            if (r10 != 0) goto Lb4
            yads.x73 r10 = new yads.x73
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "None of the available extractors ("
            r12.<init>(r13)
            int r13 = yads.w83.f117341a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
        L82:
            int r14 = r8.length
            if (r11 >= r14) goto L9d
            r14 = r8[r11]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r13.append(r14)
            int r14 = r8.length
            int r14 = r14 - r0
            if (r11 >= r14) goto L9b
            java.lang.String r14 = ", "
            r13.append(r14)
        L9b:
            int r11 = r11 + r0
            goto L82
        L9d:
            java.lang.String r8 = r13.toString()
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lb4:
            yads.xo0 r8 = r7.f116342b
            r8.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tq.a(yads.c30, android.net.Uri, java.util.Map, long, long, yads.ap0):void");
    }
}
