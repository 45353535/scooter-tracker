package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46724b = Arrays.asList("+=", "-=", "*=", "/=", "%=");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46725a;

    public f(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46725a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        String str2 = strA;
        if (TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
            return a(aVar2, str2, str, aVar2.b(str2), objA);
        }
        if (objB instanceof Map) {
            Map map = (Map) objB;
            return a(map, str2, str, map.get(str2), objA);
        }
        if (objB instanceof List) {
            try {
                int i10 = Integer.parseInt(str2);
                if (i10 >= 0 && i10 < ((List) objB).size()) {
                    return a((List) objB, i10, str, ((List) objB).get(i10), objA);
                }
                q0.b("CompoundAssignOp", "List index out of bounds: " + str2 + ", list size: " + ((List) objB).size());
            } catch (NumberFormatException unused) {
                q0.b("CompoundAssignOp", "Invalid list index: " + str2);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        Iterator<String> it = f46724b.iterator();
        while (it.hasNext()) {
            if (strTrim.equals(it.next())) {
                return b(strTrim, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str2);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (aVar != null) {
                        aVar.a(str, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e10) {
                q0.b("CompoundAssignOp", e10.getMessage(), e10);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Map map, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str2);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (map != null) {
                        map.put(str, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e10) {
                q0.b("CompoundAssignOp", e10.getMessage(), e10);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List list, int i10, String str, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (list != null) {
                        list.set(i10, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e10) {
                q0.b("CompoundAssignOp", e10.getMessage(), e10);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Double a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(java.lang.Double r7, java.lang.Double r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.f.a(java.lang.Double, java.lang.Double, java.lang.String):java.lang.Object");
    }

    private boolean a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.floor(d10)) ? false : true;
    }
}
