package com.taurusx.tax.g.q0.t;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class z extends com.taurusx.tax.g.q0.z {
    public z(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // com.taurusx.tax.g.q0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taurusx.tax.g.q0.y z() {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "fetch: ..."
            java.lang.String r2 = "taurusx"
            com.taurusx.tax.log.LogUtil.d(r2, r1)
            r1 = 0
            java.lang.String r3 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L16
            java.lang.Object r4 = r3.newInstance()     // Catch: java.lang.Exception -> L14
            goto L21
        L14:
            r4 = move-exception
            goto L18
        L16:
            r4 = move-exception
            r3 = r1
        L18:
            java.lang.String r5 = "fetch: provider not found!"
            com.taurusx.tax.log.LogUtil.d(r2, r5)
            r4.printStackTrace()
            r4 = r1
        L21:
            if (r3 == 0) goto L53
            if (r4 == 0) goto L53
            java.lang.String r5 = "getOAID"
            r6 = 1
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L3b
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Exception -> L3b
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L53
            android.content.Context r5 = r8.f66311z     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r8.z(r5, r4, r3)     // Catch: java.lang.Exception -> L3b
            goto L54
        L3b:
            r3 = move-exception
            r3.printStackTrace()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fetch: get OAID with exception "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.taurusx.tax.log.LogUtil.d(r2, r3)
        L53:
            r3 = r1
        L54:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "fetch: get OAID success! OAID is "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.taurusx.tax.log.LogUtil.d(r2, r1)
            com.taurusx.tax.g.q0.y r1 = new com.taurusx.tax.g.q0.y
            r1.<init>(r3, r0)
            return r1
        L74:
            java.lang.String r0 = "fetch: get OAID failed"
            com.taurusx.tax.log.LogUtil.d(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.q0.t.z.z():com.taurusx.tax.g.q0.y");
    }

    private String z(Context context, Object obj, Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            return (String) method.invoke(obj, context);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
