package com.mbridge.msdk.config.component.common.express.operator;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46740b = Arrays.asList("sqlNew", "select", TypedValues.TransitionType.S_FROM, "where", "sqlAnd", "sqlOr", "orderBy", "groupBy", "delete", "update", "insert", "limit");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46741a;

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46741a = cVar;
    }

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" and (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" group by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v12 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object d(java.lang.String r5, java.lang.Object r6, java.util.List<java.lang.Object> r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.d(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" limit");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" or (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" order by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(java.lang.String r3, java.lang.Object r4, java.util.List<java.lang.Object> r5) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.h(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder("select");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object k(java.lang.String r4, java.lang.Object r5, java.util.List<java.lang.Object> r6) {
        /*
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L85
            if (r6 != 0) goto L7
            goto L85
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            int r5 = r6.size()
            r1 = 2
            java.lang.String r2 = ""
            if (r5 != r1) goto L30
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            if (r5 == 0) goto L24
            java.lang.String r2 = java.lang.String.valueOf(r5)
        L24:
            r5 = 1
            java.lang.Object r5 = r6.get(r5)
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L30
            java.util.Map r5 = (java.util.Map) r5
            goto L31
        L30:
            r5 = r4
        L31:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L80
            if (r5 != 0) goto L3a
            goto L80
        L3a:
            java.lang.String r4 = "update "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = " set"
            r0.append(r4)
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r6 = r5.get(r6)
            r0.append(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4f
            java.lang.String r6 = ","
            r0.append(r6)
            goto L4f
        L7b:
            java.lang.String r4 = r0.toString()
            return r4
        L80:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        L85:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.k(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" where");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        Iterator<String> it = f46740b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return h(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" from");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}
