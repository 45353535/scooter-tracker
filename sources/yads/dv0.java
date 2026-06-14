package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class dv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yu0 f110084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv0 f110085b;

    public /* synthetic */ dv0(Context context) {
        this(new yu0(context), new tv0(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:13:0x002d, B:32:0x008a, B:35:0x0098, B:18:0x003d, B:28:0x0069, B:24:0x0055), top: B:40:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(yads.yk2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof yads.zu0
            if (r0 == 0) goto L13
            r0 = r11
            yads.zu0 r0 = (yads.zu0) r0
            int r1 = r0.f118835f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f118835f = r1
            goto L18
        L13:
            yads.zu0 r0 = new yads.zu0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f118833d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f118835f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            yads.yk2 r10 = r0.f118832c
            yads.dv0 r0 = r0.f118831b
            kotlin.d.b(r11)     // Catch: java.lang.Exception -> La2
            goto L8a
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            yads.yk2 r10 = r0.f118832c
            yads.dv0 r2 = r0.f118831b
            kotlin.d.b(r11)     // Catch: java.lang.Exception -> La2
            goto L69
        L41:
            kotlin.d.b(r11)
            yads.ev0 r11 = r10.a()
            yads.tv0 r2 = r9.f110085b
            android.graphics.Typeface r11 = r2.a(r11)
            if (r11 == 0) goto L55
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r10
        L55:
            yads.yu0 r11 = r9.f110084a     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r10.b()     // Catch: java.lang.Exception -> La2
            r0.f118831b = r9     // Catch: java.lang.Exception -> La2
            r0.f118832c = r10     // Catch: java.lang.Exception -> La2
            r0.f118835f = r5     // Catch: java.lang.Exception -> La2
            java.lang.Object r11 = r11.a(r2, r0)     // Catch: java.lang.Exception -> La2
            if (r11 != r1) goto L68
            goto L88
        L68:
            r2 = r9
        L69:
            byte[] r11 = (byte[]) r11     // Catch: java.lang.Exception -> La2
            yads.ev0 r6 = r10.a()     // Catch: java.lang.Exception -> La2
            r0.f118831b = r2     // Catch: java.lang.Exception -> La2
            r0.f118832c = r10     // Catch: java.lang.Exception -> La2
            r0.f118835f = r4     // Catch: java.lang.Exception -> La2
            r2.getClass()     // Catch: java.lang.Exception -> La2
            kotlinx.coroutines.CoroutineDispatcher r4 = eg.o0.b()     // Catch: java.lang.Exception -> La2
            yads.cv0 r7 = new yads.cv0     // Catch: java.lang.Exception -> La2
            r8 = 0
            r7.<init>(r11, r2, r6, r8)     // Catch: java.lang.Exception -> La2
            java.lang.Object r11 = eg.g.g(r4, r7, r0)     // Catch: java.lang.Exception -> La2
            if (r11 != r1) goto L89
        L88:
            return r1
        L89:
            r0 = r2
        L8a:
            yads.tv0 r11 = r0.f110085b     // Catch: java.lang.Exception -> La2
            yads.ev0 r0 = r10.a()     // Catch: java.lang.Exception -> La2
            android.graphics.Typeface r11 = r11.a(r0)     // Catch: java.lang.Exception -> La2
            if (r11 == 0) goto L98
            r3 = r5
            goto La4
        L98:
            yads.ev0 r10 = r10.a()     // Catch: java.lang.Exception -> La2
            r10.name()     // Catch: java.lang.Exception -> La2
            boolean r10 = yads.lb1.f113032a     // Catch: java.lang.Exception -> La2
            goto La4
        La2:
            boolean r10 = yads.lb1.f113032a
        La4:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dv0.a(yads.yk2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public dv0(yu0 yu0Var, tv0 tv0Var) {
        this.f110084a = yu0Var;
        this.f110085b = tv0Var;
    }
}
