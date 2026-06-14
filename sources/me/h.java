package me;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oe.a1;
import oe.w0;
import oe.x0;
import ve.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f94865r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f94866s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f94867t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f94868u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f94867t = obj;
            this.f94868u |= Integer.MIN_VALUE;
            return h.e(null, null, null, this);
        }
    }

    public static final io.ktor.utils.io.e a(HttpURLConnection httpURLConnection, int i10, CoroutineContext callContext) {
        io.ktor.utils.io.e eVarA;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        c0.a aVar = c0.f106561d;
        if (CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(aVar.A().e0()), Integer.valueOf(aVar.v().e0())}).contains(Integer.valueOf(i10))) {
            return io.ktor.utils.io.e.f82096a.a();
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (bufferedInputStream == null || (eVarA = p002if.c.a(bufferedInputStream, callContext, af.a.a())) == null) ? io.ktor.utils.io.e.f82096a.a() : eVarA;
    }

    private static final boolean b(Throwable th2) {
        if (th2 instanceof SocketTimeoutException) {
            return true;
        }
        if (th2 instanceof ConnectException) {
            String message = th2.getMessage();
            if (message != null ? StringsKt.g0(message, "timed out", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    private static final void c(HttpURLConnection httpURLConnection, x0 x0Var) {
        Long lC = x0Var.c();
        if (lC != null) {
            long jLongValue = lC.longValue();
            if (jLongValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue) {
                    httpURLConnection.setConnectTimeout(a1.l(jLongValue));
                }
            }
        }
    }

    public static final void d(HttpURLConnection httpURLConnection, re.e requestData) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        x0 x0Var = (x0) requestData.c(w0.f96943a);
        if (x0Var != null) {
            Long lB = x0Var.b();
            if (lB != null) {
                httpURLConnection.setConnectTimeout(a1.l(lB.longValue()));
            }
            Long lD = x0Var.d();
            if (lD != null) {
                httpURLConnection.setReadTimeout(a1.l(lD.longValue()));
            }
            c(httpURLConnection, x0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(java.net.HttpURLConnection r4, re.e r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof me.h.a
            if (r0 == 0) goto L13
            r0 = r7
            me.h$a r0 = (me.h.a) r0
            int r1 = r0.f94868u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94868u = r1
            goto L18
        L13:
            me.h$a r0 = new me.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f94867t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f94868u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f94866s
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.f94865r
            re.e r5 = (re.e) r5
            kotlin.d.b(r7)
            goto L4f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.d.b(r7)
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r4 = move-exception
            r0.f94865r = r5
            r0.f94866s = r4
            r0.f94868u = r3
            java.lang.Object r6 = eg.b2.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = b(r4)
            if (r6 == 0) goto L59
            ne.a r4 = oe.a1.c(r5, r4)
        L59:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.h.e(java.net.HttpURLConnection, re.e, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
