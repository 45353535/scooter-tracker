package se;

import java.nio.charset.Charset;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f100021r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f100022s;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f100021r = obj;
            this.f100022s |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f100023r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f100024s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f100025t;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f100024s = obj;
            this.f100025t |= Integer.MIN_VALUE;
            return e.b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(se.c r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof se.e.a
            if (r0 == 0) goto L13
            r0 = r6
            se.e$a r0 = (se.e.a) r0
            int r1 = r0.f100022s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100022s = r1
            goto L18
        L13:
            se.e$a r0 = new se.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f100021r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f100022s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            je.b r5 = r5.p()
            java.lang.Class<io.ktor.utils.io.e> r6 = io.ktor.utils.io.e.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.v0.b(r6)
            kotlin.reflect.KType r6 = kotlin.jvm.internal.v0.o(r6)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r6 = 0
        L44:
            ff.a r4 = new ff.a
            r4.<init>(r2, r6)
            r0.f100022s = r3
            java.lang.Object r6 = r5.a(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L57
            io.ktor.utils.io.e r6 = (io.ktor.utils.io.e) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.e.a(se.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(se.c r6, java.nio.charset.Charset r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof se.e.b
            if (r0 == 0) goto L13
            r0 = r8
            se.e$b r0 = (se.e.b) r0
            int r1 = r0.f100025t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100025t = r1
            goto L18
        L13:
            se.e$b r0 = new se.e$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f100024s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f100025t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.f100023r
            java.nio.charset.CharsetDecoder r6 = (java.nio.charset.CharsetDecoder) r6
            kotlin.d.b(r8)
            goto L66
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.d.b(r8)
            java.nio.charset.Charset r8 = ve.y.a(r6)
            if (r8 != 0) goto L40
            goto L41
        L40:
            r7 = r8
        L41:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            je.b r6 = r6.p()
            java.lang.Class<pg.s> r8 = pg.s.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.v0.b(r8)
            kotlin.reflect.KType r8 = kotlin.jvm.internal.v0.o(r8)     // Catch: java.lang.Throwable -> L54
            goto L55
        L54:
            r8 = r3
        L55:
            ff.a r5 = new ff.a
            r5.<init>(r2, r8)
            r0.f100023r = r7
            r0.f100025t = r4
            java.lang.Object r8 = r6.a(r5, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r6 = r7
        L66:
            if (r8 == 0) goto L74
            pg.s r8 = (pg.s) r8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r7 = 0
            r0 = 2
            java.lang.String r6 = gf.b.b(r6, r8, r7, r0, r3)
            return r6
        L74:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.io.Source"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: se.e.b(se.c, java.nio.charset.Charset, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(c cVar, Charset charset, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return b(cVar, charset, continuation);
    }

    public static final re.b d(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.p().d();
    }
}
