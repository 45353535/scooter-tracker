package p002if;

import io.ktor.utils.io.e;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f74741r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f74742s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f74743t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f74744u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f74745v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f74744u = obj;
            this.f74745v |= Integer.MIN_VALUE;
            return d.a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006d -> B:25:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:27:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(io.ktor.utils.io.e r16, java.io.OutputStream r17, long r18, kotlin.coroutines.Continuation r20) throws java.io.IOException {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof if.d.a
            if (r3 == 0) goto L17
            r3 = r2
            if.d$a r3 = (if.d.a) r3
            int r4 = r3.f74745v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f74745v = r4
            goto L1c
        L17:
            if.d$a r3 = new if.d$a
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f74744u
            java.lang.Object r4 = pf.b.g()
            int r5 = r3.f74745v
            r6 = 1
            if (r5 == 0) goto L3f
            if (r5 != r6) goto L37
            long r0 = r3.f74743t
            java.lang.Object r5 = r3.f74742s
            java.io.OutputStream r5 = (java.io.OutputStream) r5
            java.lang.Object r7 = r3.f74741r
            io.ktor.utils.io.e r7 = (io.ktor.utils.io.e) r7
            kotlin.d.b(r2)
            goto L71
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            kotlin.d.b(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L9b
            r0 = r16
            r1 = r17
        L4c:
            boolean r2 = r0.h()
            if (r2 != 0) goto L96
            pg.s r2 = r0.g()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L76
            r3.f74741r = r0
            r3.f74742s = r1
            r3.f74743t = r7
            r3.f74745v = r6
            r2 = 0
            r5 = 0
            java.lang.Object r2 = io.ktor.utils.io.e.b.a(r0, r2, r3, r6, r5)
            if (r2 != r4) goto L6d
            return r4
        L6d:
            r5 = r1
            r14 = r7
            r7 = r0
            r0 = r14
        L71:
            r14 = r0
            r0 = r7
            r7 = r14
            r9 = r5
            goto L77
        L76:
            r9 = r1
        L77:
            pg.s r1 = r0.g()
            pg.a r1 = r1.getBuffer()
            long r1 = r1.s()
            long r1 = r1 + r7
            pg.s r5 = r0.g()
            pg.a r8 = r5.getBuffer()
            r12 = 2
            r13 = 0
            r10 = 0
            pg.b.b(r8, r9, r10, r12, r13)
            r7 = r1
            r1 = r9
            goto L4c
        L96:
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.e(r7)
            return r0
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Limit shouldn't be negative: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.d.a(io.ktor.utils.io.e, java.io.OutputStream, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(e eVar, OutputStream outputStream, long j10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return a(eVar, outputStream, j10, continuation);
    }
}
