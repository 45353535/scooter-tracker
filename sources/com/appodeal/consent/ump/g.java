package com.appodeal.consent.ump;

import android.app.Activity;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.OnConsentFormDismissedListener;
import eg.e1;
import eg.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements ConsentForm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f15570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f15571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.ump.ConsentForm f15572c;

    public g() {
        e1 e1VarW = o0.c().w();
        this.f15570a = e1VarW;
        this.f15571b = kotlinx.coroutines.i.a(e1VarW);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appodeal.consent.ump.a
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.consent.ump.a r0 = (com.appodeal.consent.ump.a) r0
            int r1 = r0.f15559t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15559t = r1
            goto L18
        L13:
            com.appodeal.consent.ump.a r0 = new com.appodeal.consent.ump.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15557r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15559t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            java.lang.String r7 = "[UMP] UmpConsentForm - prepare"
            r2 = 0
            com.appodeal.consent.logger.a.b(r7, r2)
            eg.e1 r7 = r5.f15570a
            com.appodeal.consent.ump.d r4 = new com.appodeal.consent.ump.d
            r4.<init>(r6, r5, r2)
            r0.f15559t = r3
            java.lang.Object r7 = eg.g.g(r7, r4, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.ump.g.b(android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.appodeal.consent.ConsentForm
    public final void show(Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        eg.i.d(this.f15571b, null, null, new f(this, activity, onConsentFormDismissedListener, null), 3, null);
    }
}
