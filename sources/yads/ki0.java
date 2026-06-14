package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ki0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f112708e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f112709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f112710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4 f112711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oz0 f112712d;

    public /* synthetic */ ki0(Context context, v5 v5Var) {
        this(v5Var, context.getApplicationContext(), new z4(), new oz0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof yads.gi0
            if (r0 == 0) goto L13
            r0 = r8
            yads.gi0 r0 = (yads.gi0) r0
            int r1 = r0.f111223f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111223f = r1
            goto L18
        L13:
            yads.gi0 r0 = new yads.gi0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f111221d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f111223f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yads.u5 r1 = r0.f111220c
            yads.v5 r0 = r0.f111219b
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L6e
        L2d:
            r8 = move-exception
            goto L69
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.d.b(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = yads.ki0.f112708e
            r2 = 0
            boolean r8 = r8.getAndSet(r2)
            if (r8 == 0) goto L73
            yads.v5 r8 = r7.f112709a
            yads.u5 r2 = yads.u5.f116522z
            r8.b(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = yads.i10.a()     // Catch: java.lang.Throwable -> L64
            yads.hi0 r5 = new yads.hi0     // Catch: java.lang.Throwable -> L64
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L64
            r0.f111219b = r8     // Catch: java.lang.Throwable -> L64
            r0.f111220c = r2     // Catch: java.lang.Throwable -> L64
            r0.f111223f = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = eg.g.g(r4, r5, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L61
            return r1
        L61:
            r0 = r8
            r1 = r2
            goto L6e
        L64:
            r0 = move-exception
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r2
        L69:
            r8.getMessage()
            boolean r8 = yads.lb1.f113032a
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            r0.a(r1)
        L73:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ki0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ki0(v5 v5Var, Context context, z4 z4Var, oz0 oz0Var) {
        this.f112709a = v5Var;
        this.f112710b = context;
        this.f112711c = z4Var;
        this.f112712d = oz0Var;
    }

    public final void a(String str) {
        if (this.f112712d.a(2000, str)) {
            boolean z10 = lb1.f113032a;
        } else {
            boolean z11 = lb1.f113032a;
        }
    }
}
