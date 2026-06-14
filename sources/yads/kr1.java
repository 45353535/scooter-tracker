package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class kr1 extends jo implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hr1 f112817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jr1 f112818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f112819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ir1 f112820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public pw2 f112821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f112822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f112823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f112824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f112825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fr1 f112826w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr1(sm0 sm0Var, Looper looper) {
        super(5);
        gr1 gr1Var = hr1.f111714a;
        this.f112818o = (jr1) fi.a(sm0Var);
        this.f112819p = looper == null ? null : w83.a(looper, (Handler.Callback) this);
        this.f112817n = (hr1) fi.a(gr1Var);
        this.f112820q = new ir1();
        this.f112825v = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.fr1 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            yads.er1[] r1 = r6.f110835b
            int r2 = r1.length
            if (r0 >= r2) goto L7f
            r1 = r1[r0]
            yads.yv0 r1 = r1.a()
            if (r1 == 0) goto L75
            yads.hr1 r2 = r5.f112817n
            yads.gr1 r2 = (yads.gr1) r2
            r2.getClass()
            java.lang.String r2 = r1.f118398m
            java.lang.String r3 = "application/id3"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-emsg"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-scte35"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-icy"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/vnd.dvb.ait"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L75
        L3f:
            yads.hr1 r2 = r5.f112817n
            yads.gr1 r2 = (yads.gr1) r2
            yads.pw2 r1 = r2.a(r1)
            yads.er1[] r2 = r6.f110835b
            r2 = r2[r0]
            byte[] r2 = r2.b()
            r2.getClass()
            yads.ir1 r3 = r5.f112820q
            r3.b()
            yads.ir1 r3 = r5.f112820q
            int r4 = r2.length
            r3.c(r4)
            yads.ir1 r3 = r5.f112820q
            java.nio.ByteBuffer r3 = r3.f110670d
            r3.put(r2)
            yads.ir1 r2 = r5.f112820q
            r2.c()
            yads.ir1 r2 = r5.f112820q
            yads.fr1 r1 = r1.a(r2)
            if (r1 == 0) goto L7c
            r5.a(r1, r7)
            goto L7c
        L75:
            yads.er1[] r1 = r6.f110835b
            r1 = r1[r0]
            r7.add(r1)
        L7c:
            int r0 = r0 + 1
            goto L1
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kr1.a(yads.fr1, java.util.ArrayList):void");
    }

    @Override // yads.jo
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // yads.jo
    public final boolean f() {
        return this.f112823t;
    }

    @Override // yads.jo
    public final boolean g() {
        return true;
    }

    @Override // yads.jo
    public final void h() {
        this.f112826w = null;
        this.f112825v = -9223372036854775807L;
        this.f112821r = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ((sm0) this.f112818o).a((fr1) message.obj);
        return true;
    }

    @Override // yads.jo
    public final void a(long j10, boolean z10) {
        this.f112826w = null;
        this.f112825v = -9223372036854775807L;
        this.f112822s = false;
        this.f112823t = false;
    }

    @Override // yads.jo
    public final void a(yv0[] yv0VarArr, long j10, long j11) {
        this.f112821r = ((gr1) this.f112817n).a(yv0VarArr[0]);
    }

    @Override // yads.jo
    public final void a(long j10, long j11) {
        boolean z10;
        do {
            z10 = false;
            if (!this.f112822s && this.f112826w == null) {
                this.f112820q.b();
                zv0 zv0Var = this.f112408c;
                zv0Var.f118844a = null;
                zv0Var.f118845b = null;
                int iA = a(zv0Var, this.f112820q, 0);
                if (iA == -4) {
                    if (this.f112820q.b(4)) {
                        this.f112822s = true;
                    } else {
                        ir1 ir1Var = this.f112820q;
                        ir1Var.f112111j = this.f112824u;
                        ir1Var.c();
                        pw2 pw2Var = this.f112821r;
                        int i10 = w83.f117341a;
                        fr1 fr1VarA = pw2Var.a(this.f112820q);
                        if (fr1VarA != null) {
                            ArrayList arrayList = new ArrayList(fr1VarA.f110835b.length);
                            a(fr1VarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f112826w = new fr1(arrayList);
                                this.f112825v = this.f112820q.f110672f;
                            }
                        }
                    }
                } else if (iA == -5) {
                    yv0 yv0Var = zv0Var.f118845b;
                    yv0Var.getClass();
                    this.f112824u = yv0Var.f118402q;
                }
            }
            fr1 fr1Var = this.f112826w;
            if (fr1Var != null && this.f112825v <= j10) {
                Handler handler = this.f112819p;
                if (handler != null) {
                    handler.obtainMessage(0, fr1Var).sendToTarget();
                } else {
                    ((sm0) this.f112818o).a(fr1Var);
                }
                this.f112826w = null;
                this.f112825v = -9223372036854775807L;
                z10 = true;
            }
            if (this.f112822s && this.f112826w == null) {
                this.f112823t = true;
            }
        } while (z10);
    }

    @Override // yads.jo
    public final int a(yv0 yv0Var) {
        ((gr1) this.f112817n).getClass();
        String str = yv0Var.f118398m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return jo.a(0, 0, 0);
        }
        return jo.a(yv0Var.F == 0 ? 4 : 2, 0, 0);
    }
}
