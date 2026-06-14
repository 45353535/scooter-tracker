package bd;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f6373b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ud.b f6374a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6375r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6376s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f6377t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f6378u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f6380w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6378u = obj;
            this.f6380w |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f6382g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j10) {
            super(0);
            this.f6381f = str;
            this.f6382g = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f6381f + " took " + (System.currentTimeMillis() - this.f6382g) + " ms";
        }
    }

    public l(ud.b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f6374a = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof bd.l.b
            if (r0 == 0) goto L13
            r0 = r9
            bd.l$b r0 = (bd.l.b) r0
            int r1 = r0.f6380w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6380w = r1
            goto L18
        L13:
            bd.l$b r0 = new bd.l$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6378u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6380w
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            long r7 = r0.f6377t
            java.lang.Object r1 = r0.f6376s
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f6375r
            bd.l r0 = (bd.l) r0
            kotlin.d.b(r9)
            r4 = r7
            r7 = r1
            goto L54
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.d.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f6375r = r6
            r0.f6376s = r7
            r0.f6377t = r4
            r0.f6380w = r3
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            r0 = r6
        L54:
            ud.b r8 = r0.f6374a
            bd.l$c r0 = new bd.l$c
            r0.<init>(r7, r4)
            java.lang.String r7 = "MeanPerformanceMeasurer"
            r8.a(r7, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.l.a(java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
