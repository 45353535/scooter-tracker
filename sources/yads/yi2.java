package yads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yi2 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l43 f118231a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f118235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f118236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f118237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f118238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vi2 f118239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ap0 f118240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f118241k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f118233c = new w92(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f118232b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wi2 f118234d = new wi2();

    static {
        new cp0() { // from class: yads.g71
            @Override // yads.cp0
            public final xo0[] a() {
                return yi2.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    public yi2(l43 l43Var) {
        this.f118231a = l43Var;
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f118240j = ap0Var;
    }

    @Override // yads.xo0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r25, yads.be2 r26) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yi2.a(yads.yo0, yads.be2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r5, long r7) {
        /*
            r4 = this;
            yads.l43 r5 = r4.f118231a
            monitor-enter(r5)
            long r0 = r5.f112968b     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L2a
            yads.l43 r0 = r4.f118231a
            long r2 = r0.a()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L31
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r0 == 0) goto L31
        L2c:
            yads.l43 r5 = r4.f118231a
            r5.c(r7)
        L31:
            yads.vi2 r5 = r4.f118239i
            if (r5 == 0) goto L38
            r5.a(r7)
        L38:
            r5 = r1
        L39:
            android.util.SparseArray r6 = r4.f118232b
            int r6 = r6.size()
            if (r5 >= r6) goto L53
            android.util.SparseArray r6 = r4.f118232b
            java.lang.Object r6 = r6.valueAt(r5)
            yads.xi2 r6 = (yads.xi2) r6
            r6.f117831f = r1
            yads.qk0 r6 = r6.f117826a
            r6.a()
            int r5 = r5 + 1
            goto L39
        L53:
            return
        L54:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yi2.a(long, long):void");
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        yc0 yc0Var = (yc0) yo0Var;
        yc0Var.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        yc0Var.a(false, bArr[13] & 7);
        yc0Var.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public static xo0[] a() {
        return new xo0[]{new yi2(new l43(0L))};
    }
}
