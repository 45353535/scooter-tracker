package yads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes4.dex */
public final class sk2 extends b41 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sk2 f115840h = new sk2(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f115841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f115842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f115843g;

    public sk2(Object obj, Object[] objArr, int i10) {
        this.f115841e = obj;
        this.f115842f = objArr;
        this.f115843g = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.sk2 a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sk2.a(int, java.lang.Object[]):yads.sk2");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[EDGE_INSN: B:43:0x008d->B:35:0x008d BREAK  A[LOOP:0: B:15:0x0036->B:21:0x004c], EDGE_INSN: B:45:0x008d->B:35:0x008d BREAK  A[LOOP:1: B:25:0x0061->B:31:0x0078], EDGE_INSN: B:47:0x008d->B:35:0x008d BREAK  A[LOOP:2: B:33:0x0087->B:42:0x009f]] */
    @Override // yads.b41, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f115841e
            java.lang.Object[] r1 = r8.f115842f
            int r2 = r8.f115843g
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8d
        Lb:
            r4 = 1
            if (r2 != r4) goto L21
            r0 = 0
            r0 = r1[r0]
            j$.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8d
            r9 = r1[r4]
            j$.util.Objects.requireNonNull(r9)
            goto L9b
        L21:
            if (r0 != 0) goto L24
            goto L8d
        L24:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L4f
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = yads.az0.a(r0)
        L36:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            goto L8d
        L3f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L4c:
            int r0 = r0 + 1
            goto L36
        L4f:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7b
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = yads.az0.a(r0)
        L61:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6b
            goto L8d
        L6b:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L78
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L78:
            int r0 = r0 + 1
            goto L61
        L7b:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = yads.az0.a(r5)
        L87:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L8f
        L8d:
            r9 = r3
            goto L9b
        L8f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L9f
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9b:
            if (r9 != 0) goto L9e
            return r3
        L9e:
            return r9
        L9f:
            int r5 = r5 + 1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sk2.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f115843g;
    }

    public static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i10) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + C4240b4.j.f42668b + obj2 + " and " + objArr[i10] + C4240b4.j.f42668b + objArr[i10 ^ 1]);
    }
}
