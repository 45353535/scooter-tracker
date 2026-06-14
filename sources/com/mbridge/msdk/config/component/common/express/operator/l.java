package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46738b = Arrays.asList("nonNull", "ifSet");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46739a;

    public l(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46739a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(java.lang.String r5, java.lang.Object r6, java.util.List<java.lang.Object> r7, com.mbridge.msdk.config.dynamic.binddata.wrapper.a r8) {
        /*
            r4 = this;
            r0 = 0
            int r1 = r5.hashCode()     // Catch: java.lang.Exception -> L1b
            r2 = 100091397(0x5f74605, float:2.325349E-35)
            r3 = 1
            if (r1 == r2) goto L1d
            r2 = 2123019764(0x7e8ab5f4, float:9.218911E37)
            if (r1 == r2) goto L11
            goto L27
        L11:
            java.lang.String r1 = "nonNull"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L27
            r1 = 0
            goto L28
        L1b:
            r6 = move-exception
            goto L3b
        L1d:
            java.lang.String r1 = "ifSet"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = -1
        L28:
            if (r1 == 0) goto L36
            if (r1 == r3) goto L31
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r0)     // Catch: java.lang.Exception -> L1b
            return r5
        L31:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = r4.a(r6, r7, r8)     // Catch: java.lang.Exception -> L1b
            return r5
        L36:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = r4.a(r6, r7)     // Catch: java.lang.Exception -> L1b
            return r5
        L3b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Error handling object operation: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", "
            r7.append(r5)
            java.lang.String r5 = r6.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "OperatorObject"
            com.mbridge.msdk.foundation.tools.q0.b(r7, r5, r6)
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.l.a(java.lang.String, java.lang.Object, java.util.List, com.mbridge.msdk.config.dynamic.binddata.wrapper.a):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f46738b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return a(str, obj, list, aVar);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(1);
    }

    private synchronized com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strSubstring;
        if (list != null) {
            try {
                if (list.size() == 3) {
                    try {
                        boolean z10 = ((Integer) list.get(0)).intValue() == 1;
                        if (z10) {
                            strSubstring = (String) list.get(1);
                        } else {
                            strSubstring = (String) list.get(2);
                        }
                        if (strSubstring.startsWith("\"") && strSubstring.endsWith("\"") && strSubstring.replace("\\\"", "").split("\"").length == 2) {
                            strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                        }
                        if (!TextUtils.isEmpty(strSubstring)) {
                            new com.mbridge.msdk.config.component.common.express.d().a(strSubstring, aVar);
                        }
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
                    } catch (Exception e10) {
                        q0.a("OperatorObject", e10.getMessage());
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }
}
