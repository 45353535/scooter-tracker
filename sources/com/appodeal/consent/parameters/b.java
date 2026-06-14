package com.appodeal.consent.parameters;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.appodeal.consent.ConsentUpdateRequestParameters r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.consent.parameters.a
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.consent.parameters.a r0 = (com.appodeal.consent.parameters.a) r0
            int r1 = r0.f15546s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15546s = r1
            goto L18
        L13:
            com.appodeal.consent.parameters.a r0 = new com.appodeal.consent.parameters.a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15545r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15546s
            java.lang.String r3 = "getApplicationContext(...)"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.d.b(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.d.b(r6)
            boolean r6 = r5 instanceof com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync
            if (r6 == 0) goto L53
            com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync r5 = (com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync) r5
            kotlin.jvm.functions.Function1 r5 = r5.getGetActivity()
            r0.f15546s = r4
            java.lang.Object r6 = r5.invoke(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            android.app.Activity r6 = (android.app.Activity) r6
            android.content.Context r5 = r6.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            return r5
        L53:
            android.app.Activity r5 = r5.getRequiredActivity()
            android.content.Context r5 = r5.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.parameters.b.a(com.appodeal.consent.ConsentUpdateRequestParameters, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
