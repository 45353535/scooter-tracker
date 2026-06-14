package we;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import gg.t;
import gg.v;
import io.ktor.utils.io.i0;
import io.ktor.utils.io.x;
import java.io.IOException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
import ve.g;
import xe.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qg.a f107939a = new qg.a(hf.g.e(IOUtils.LINE_SEPARATOR_WINDOWS, null, 1, null), 0, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qg.a f107940b = qg.c.a(45, 45);

    static final class a extends k implements Function2 {
        final /* synthetic */ qg.a A;
        final /* synthetic */ long B;
        final /* synthetic */ Long C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f107941r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f107942s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f107943t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f107944u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f107945v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f107946w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f107947x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private /* synthetic */ Object f107948y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.e f107949z;

        /* JADX INFO: renamed from: we.g$a$a, reason: collision with other inner class name */
        static final class C1329a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f107950r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f107951s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ qg.a f107952t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ x f107953u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1329a(qg.a aVar, x xVar, Continuation continuation) {
                super(2, continuation);
                this.f107952t = aVar;
                this.f107953u = xVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, Continuation continuation) {
                return ((C1329a) create(i0Var, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C1329a c1329a = new C1329a(this.f107952t, this.f107953u, continuation);
                c1329a.f107951s = obj;
                return c1329a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
            
                if (r11.e(r10) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r10.f107950r
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.d.b(r11)
                    r9 = r10
                    goto L52
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    java.lang.Object r1 = r10.f107951s
                    io.ktor.utils.io.i0 r1 = (io.ktor.utils.io.i0) r1
                    kotlin.d.b(r11)
                    r9 = r10
                    goto L42
                L24:
                    kotlin.d.b(r11)
                    java.lang.Object r11 = r10.f107951s
                    r1 = r11
                    io.ktor.utils.io.i0 r1 = (io.ktor.utils.io.i0) r1
                    qg.a r4 = r10.f107952t
                    io.ktor.utils.io.x r5 = r10.f107953u
                    io.ktor.utils.io.k r6 = r1.a()
                    r10.f107951s = r1
                    r10.f107950r = r3
                    r7 = 8193(0x2001, double:4.048E-320)
                    r9 = r10
                    java.lang.Object r11 = we.g.e(r4, r5, r6, r7, r9)
                    if (r11 != r0) goto L42
                    goto L51
                L42:
                    io.ktor.utils.io.k r11 = r1.a()
                    r1 = 0
                    r9.f107951s = r1
                    r9.f107950r = r2
                    java.lang.Object r11 = r11.e(r10)
                    if (r11 != r0) goto L52
                L51:
                    return r0
                L52:
                    kotlin.Unit r11 = kotlin.Unit.f93236a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: we.g.a.C1329a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.e eVar, qg.a aVar, long j10, Long l10, Continuation continuation) {
            super(2, continuation);
            this.f107949z = eVar;
            this.A = aVar;
            this.B = j10;
            this.C = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f107949z, this.A, this.B, this.C, continuation);
            aVar.f107948y = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v vVar, Continuation continuation) {
            return ((a) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:113:0x0355, code lost:
        
            if (r0.w(r2, r22) != r7) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0386, code lost:
        
            if (r0.w(r2, r22) == r7) goto L124;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0377  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[PHI: r0 r2 r3 r4 r5 r8 r10
  0x00e3: PHI (r0v35 long) = (r0v15 long), (r0v38 long) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r2v28 qg.a) = (r2v14 qg.a), (r2v31 qg.a) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r3v27 io.ktor.utils.io.x) = (r3v9 io.ktor.utils.io.x), (r3v29 io.ktor.utils.io.x) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r4v33 gg.v) = (r4v17 gg.v), (r4v36 gg.v) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r5v19 java.lang.Object) = (r5v11 java.lang.Object), (r5v24 java.lang.Object) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r8v6 long) = (r8v0 long), (r8v7 long) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r10v2 boolean) = (r10v0 boolean), (r10v3 boolean) binds: [B:22:0x00d0, B:51:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01be A[PHI: r0 r2 r4 r8 r10 r13
  0x01be: PHI (r0v41 qg.a) = (r0v5 qg.a), (r0v10 qg.a), (r0v36 qg.a), (r0v42 qg.a) binds: [B:33:0x0197, B:38:0x01b7, B:54:0x0220, B:74:0x02a8] A[DONT_GENERATE, DONT_INLINE]
  0x01be: PHI (r2v34 long) = (r2v1 long), (r2v5 long), (r2v29 long), (r2v35 long) binds: [B:33:0x0197, B:38:0x01b7, B:54:0x0220, B:74:0x02a8] A[DONT_GENERATE, DONT_INLINE]
  0x01be: PHI (r4v39 io.ktor.utils.io.x) = (r4v3 io.ktor.utils.io.x), (r4v8 io.ktor.utils.io.x), (r4v34 io.ktor.utils.io.x), (r4v41 io.ktor.utils.io.x) binds: [B:33:0x0197, B:38:0x01b7, B:54:0x0220, B:74:0x02a8] A[DONT_GENERATE, DONT_INLINE]
  0x01be: PHI (r8v9 long) = (r8v0 long), (r8v0 long), (r8v6 long), (r8v10 long) binds: [B:33:0x0197, B:38:0x01b7, B:54:0x0220, B:74:0x02a8] A[DONT_GENERATE, DONT_INLINE]
  0x01be: PHI (r10v5 boolean) = (r10v0 boolean), (r10v0 boolean), (r10v2 boolean), (r10v6 boolean) binds: [B:33:0x0197, B:38:0x01b7, B:54:0x0220, B:74:0x02a8] A[DONT_GENERATE, DONT_INLINE]
  0x01be: PHI (r13v18 gg.v) = (r13v2 gg.v), (r13v4 gg.v), (r13v16 gg.v), (r13v20 gg.v) binds: [B:33:0x0197, B:38:0x01b7, B:54:0x0220, B:74:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0276 A[Catch: all -> 0x02b7, TRY_LEAVE, TryCatch #3 {all -> 0x02b7, blocks: (B:65:0x0270, B:67:0x0276), top: B:133:0x0270 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02ba  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x02da A[PHI: r2 r4 r8 r13
  0x02da: PHI (r2v23 long) = (r2v32 long), (r2v34 long) binds: [B:45:0x01e7, B:40:0x01c2] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r4v22 io.ktor.utils.io.x) = (r4v37 io.ktor.utils.io.x), (r4v39 io.ktor.utils.io.x) binds: [B:45:0x01e7, B:40:0x01c2] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r8v1 long) = (r8v8 long), (r8v9 long) binds: [B:45:0x01e7, B:40:0x01c2] A[DONT_GENERATE, DONT_INLINE]
  0x02da: PHI (r13v11 gg.v) = (r13v17 gg.v), (r13v18 gg.v) binds: [B:45:0x01e7, B:40:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0220 -> B:39:0x01be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x029f -> B:139:0x02a5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 942
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: we.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f107954r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f107955s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f107956t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        long f107957u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f107958v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f107959w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f107958v = obj;
            this.f107959w |= Integer.MIN_VALUE;
            return g.l(null, null, null, null, 0L, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f107960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f107961s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f107962t;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f107961s = obj;
            this.f107962t |= Integer.MIN_VALUE;
            return g.m(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f107963r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f107964s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f107965t;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f107964s = obj;
            this.f107965t |= Integer.MIN_VALUE;
            return g.o(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int g(java.lang.CharSequence r12) {
        /*
            int r0 = r12.length()
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            if (r2 >= r0) goto L5f
            char r5 = r12.charAt(r2)
            r6 = 59
            r7 = 1
            if (r3 == 0) goto L59
            r8 = 44
            r9 = 2
            if (r3 == r7) goto L3a
            r10 = 34
            r11 = 3
            if (r3 == r9) goto L31
            r6 = 4
            if (r3 == r11) goto L25
            if (r3 == r6) goto L23
            goto L5c
        L23:
            r3 = r11
            goto L5c
        L25:
            if (r5 == r10) goto L2e
            r7 = 92
            if (r5 == r7) goto L2c
            goto L5c
        L2c:
            r3 = r6
            goto L5c
        L2e:
            r4 = r1
            r3 = r7
            goto L5c
        L31:
            if (r5 == r10) goto L23
            if (r5 == r8) goto L38
            if (r5 == r6) goto L2e
            goto L5c
        L38:
            r3 = r1
            goto L5c
        L3a:
            r10 = 61
            if (r5 != r10) goto L40
            r3 = r9
            goto L5c
        L40:
            if (r5 != r6) goto L44
            r4 = r1
            goto L5c
        L44:
            if (r5 != r8) goto L47
            goto L38
        L47:
            r6 = 32
            if (r5 == r6) goto L5c
            if (r4 != 0) goto L56
            java.lang.String r5 = "boundary="
            boolean r5 = kotlin.text.StringsKt.Z0(r12, r5, r2, r7)
            if (r5 == 0) goto L56
            return r2
        L56:
            int r4 = r4 + 1
            goto L5c
        L59:
            if (r5 != r6) goto L5c
            goto L2e
        L5c:
            int r2 = r2 + 1
            goto L8
        L5f:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: we.g.g(java.lang.CharSequence):int");
    }

    public static final byte[] h(CharSequence contentType) throws IOException {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        int iG = g(contentType);
        if (iG == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        t0 t0Var = new t0();
        i(t0Var, bArr, (byte) 13);
        i(t0Var, bArr, (byte) 10);
        i(t0Var, bArr, (byte) 45);
        i(t0Var, bArr, (byte) 45);
        int length = contentType.length();
        char c10 = 0;
        for (int i10 = iG + 9; i10 < length; i10++) {
            char cCharAt = contentType.charAt(i10);
            int i11 = cCharAt & 65535;
            if ((65535 & cCharAt) > 127) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to parse multipart: wrong boundary byte 0x");
                String string = Integer.toString(i11, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                sb2.append(" - should be 7bit character");
                throw new IOException(sb2.toString());
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    if (cCharAt == ' ' || cCharAt == ',' || cCharAt == ';') {
                        break;
                    }
                    i(t0Var, bArr, (byte) i11);
                } else if (c10 == 2) {
                    if (cCharAt == '\"') {
                        break;
                    }
                    if (cCharAt != '\\') {
                        i(t0Var, bArr, (byte) i11);
                    } else {
                        c10 = 3;
                    }
                } else if (c10 == 3) {
                    i(t0Var, bArr, (byte) i11);
                    c10 = 2;
                }
            } else if (cCharAt == ' ') {
                continue;
            } else if (cCharAt == '\"') {
                c10 = 2;
            } else {
                if (cCharAt == ',' || cCharAt == ';') {
                    break;
                }
                i(t0Var, bArr, (byte) i11);
                c10 = 1;
            }
        }
        int i12 = t0Var.f93331b;
        if (i12 != 4) {
            return ArraysKt.copyOfRange(bArr, 0, i12);
        }
        throw new IOException("Empty multipart boundary is not allowed");
    }

    private static final void i(t0 t0Var, byte[] bArr, byte b10) throws IOException {
        int i10 = t0Var.f93331b;
        if (i10 >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        t0Var.f93331b = i10 + 1;
        bArr[i10] = b10;
    }

    public static final gg.x j(CoroutineScope coroutineScope, io.ktor.utils.io.e input, CharSequence contentType, Long l10, long j10) throws l {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (g.c.f106653a.a(contentType)) {
            return k(coroutineScope, new qg.a(h(contentType), 0, 0, 6, null), input, l10, j10);
        }
        throw new l("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) contentType));
    }

    private static final gg.x k(CoroutineScope coroutineScope, qg.a aVar, io.ktor.utils.io.e eVar, Long l10, long j10) {
        return t.h(coroutineScope, null, 0, new a(eVar, aVar, j10, l10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        if (r3.c(r6) != r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(qg.a r16, io.ktor.utils.io.e r17, io.ktor.utils.io.k r18, we.c r19, long r20, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we.g.l(qg.a, io.ktor.utils.io.e, io.ktor.utils.io.k, we.c, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(io.ktor.utils.io.e r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof we.g.c
            if (r0 == 0) goto L14
            r0 = r8
            we.g$c r0 = (we.g.c) r0
            int r1 = r0.f107962t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f107962t = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            we.g$c r0 = new we.g$c
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f107961s
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.f107962t
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r7 = r4.f107960r
            xe.d r7 = (xe.d) r7
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L54
        L2f:
            r0 = move-exception
            r8 = r0
            goto L64
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.d.b(r8)
            r8 = r2
            xe.d r2 = new xe.d
            r1 = 0
            r2.<init>(r1, r8, r1)
            r4.f107960r = r2     // Catch: java.lang.Throwable -> L61
            r4.f107962t = r8     // Catch: java.lang.Throwable -> L61
            r3 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            java.lang.Object r8 = we.e.h(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L61
            if (r8 != r0) goto L53
            return r0
        L53:
            r7 = r2
        L54:
            we.c r8 = (we.c) r8     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L59
            return r8
        L59:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            throw r8     // Catch: java.lang.Throwable -> L2f
        L61:
            r0 = move-exception
            r8 = r0
            r7 = r2
        L64:
            r7.o()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: we.g.m(io.ktor.utils.io.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(qg.a aVar, io.ktor.utils.io.e eVar, io.ktor.utils.io.k kVar, long j10, Continuation continuation) {
        return io.ktor.utils.io.h.m(eVar, aVar, kVar, j10, true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(io.ktor.utils.io.e r4, qg.a r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof we.g.d
            if (r0 == 0) goto L13
            r0 = r6
            we.g$d r0 = (we.g.d) r0
            int r1 = r0.f107965t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107965t = r1
            goto L18
        L13:
            we.g$d r0 = new we.g$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f107964s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f107965t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f107963r
            r5 = r4
            qg.a r5 = (qg.a) r5
            kotlin.d.b(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.d.b(r6)
            r0.f107963r = r5
            r0.f107965t = r3
            java.lang.Object r6 = io.ktor.utils.io.h.t(r4, r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L52
            int r4 = r5.f()
            long r4 = (long) r4
            goto L54
        L52:
            r4 = 0
        L54:
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.e(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: we.g.o(io.ktor.utils.io.e, qg.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Void p(long j10, long j11) throws IOException {
        throw new IOException("Multipart content length exceeds limit " + j10 + " > " + j11 + "; limit is defined using 'formFieldLimit' argument");
    }
}
