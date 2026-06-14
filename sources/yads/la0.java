package yads;

import android.view.View;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class la0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa0 f113021a;

    public la0(qa0 qa0Var) {
        this.f113021a = qa0Var;
    }

    @Override // yads.o0
    public final /* bridge */ /* synthetic */ Object a(View view, m0 m0Var, u0 u0Var) {
        return a(view, (ja0) m0Var, (Continuation) u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.View r5, yads.ja0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yads.ka0
            if (r0 == 0) goto L13
            r0 = r7
            yads.ka0 r0 = (yads.ka0) r0
            int r1 = r0.f112661d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112661d = r1
            goto L18
        L13:
            yads.ka0 r0 = new yads.ka0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f112659b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f112661d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r7)
            android.content.Context r5 = r5.getContext()
            yads.qa0 r7 = r4.f113021a
            r0.f112661d = r3
            java.lang.Object r5 = r7.a(r5, r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            yads.zy0 r5 = new yads.zy0
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.la0.a(android.view.View, yads.ja0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
