package com.mbridge.msdk.config.component.common.express.operator;

import android.os.Build;
import android.text.TextUtils;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCaseKt;
import com.mbridge.msdk.foundation.tools.q0;
import j$.util.function.BiFunction$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46722b = Arrays.asList("==", "!=", GetAdRequestUseCaseKt.DEFAULT_COMPARATOR, "<=", ">", "<");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46723a;

    public e(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46723a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction;
        biFunction = null;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        str.getClass();
        switch (str) {
            case "<":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.w
                    public /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return e.f((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case ">":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.v
                    public /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return e.e((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case "!=":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.u
                    public /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return e.b((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case "<=":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.t
                    public /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return e.d((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case "==":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.s
                    public /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return e.a((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case ">=":
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.r
                    public /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return e.c((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
        }
        return biFunction == null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str, obj, obj2, biFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean e(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean f(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f46722b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.equals(comparable2));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2, BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction) {
        Object objValueOf;
        Object objValueOf2;
        if (obj != null && obj2 != null) {
            if (obj.getClass().equals(obj2.getClass())) {
                objValueOf = obj;
                objValueOf2 = obj2;
            } else {
                Object[] objArrA = a(obj, obj2);
                if (objArrA != null) {
                    objValueOf = objArrA[0];
                    objValueOf2 = objArrA[1];
                } else {
                    q0.b("ComparisonOperator", "Type conversion failed for comparison: " + obj.getClass().getSimpleName() + " vs " + obj2.getClass().getSimpleName());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
            if ((objValueOf instanceof Comparable) && (objValueOf2 instanceof Comparable)) {
                try {
                    objValueOf = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
                    objValueOf2 = Integer.valueOf(Integer.parseInt(String.valueOf(obj2)));
                } catch (Exception unused) {
                }
                try {
                    Comparable<Object> comparable = (Comparable) objValueOf;
                    Comparable<Object> comparable2 = (Comparable) objValueOf2;
                    if (Build.VERSION.SDK_INT >= 24) {
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(biFunction.apply(comparable, comparable2));
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(comparable, comparable2, str));
                } catch (Exception e10) {
                    q0.b("ComparisonOperator", e10.getMessage(), e10);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(obj, obj2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(!comparable.equals(comparable2));
    }

    private Number b(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                if (str.contains(".")) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private Boolean a(Object obj, Object obj2, String str) {
        str.getClass();
        if (str.equals("!=")) {
            return Boolean.valueOf(obj != obj2);
        }
        if (str.equals("==")) {
            return Boolean.valueOf(obj == obj2);
        }
        return null;
    }

    private Boolean a(Comparable<Object> comparable, Comparable<Object> comparable2, String str) {
        str.getClass();
        switch (str) {
            case "<":
                return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
            case ">":
                return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
            case "!=":
                return Boolean.valueOf(comparable.compareTo(comparable2) != 0);
            case "<=":
                return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
            case "==":
                return Boolean.valueOf(comparable.compareTo(comparable2) == 0);
            case ">=":
                return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
            default:
                return null;
        }
    }

    private Object[] a(Object obj, Object obj2) {
        try {
            if (a(obj) && a(obj2)) {
                return a((Number) obj, (Number) obj2);
            }
            if (a(obj) && (obj2 instanceof String)) {
                Number number = (Number) obj;
                Number numberB = b((String) obj2);
                if (numberB != null) {
                    return a(number, numberB);
                }
                return null;
            }
            if ((obj instanceof String) && a(obj2)) {
                Number numberB2 = b((String) obj);
                Number number2 = (Number) obj2;
                if (numberB2 != null) {
                    return a(numberB2, number2);
                }
                return null;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof String)) {
                Boolean bool = (Boolean) obj;
                Boolean boolA = a((String) obj2);
                if (boolA != null) {
                    return new Object[]{bool, boolA};
                }
                return null;
            }
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return null;
            }
            Boolean boolA2 = a((String) obj);
            Boolean bool2 = (Boolean) obj2;
            if (boolA2 != null) {
                return new Object[]{boolA2, bool2};
            }
            return null;
        } catch (Exception e10) {
            q0.b("ComparisonOperator", "Type conversion error: " + e10.getMessage(), e10);
            return null;
        }
    }

    private boolean a(Object obj) {
        return obj instanceof Number;
    }

    private Boolean a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.toLowerCase().trim();
        if (!"true".equals(strTrim) && !"1".equals(strTrim) && !"yes".equals(strTrim)) {
            if ("false".equals(strTrim) || "0".equals(strTrim) || SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(strTrim)) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    private Object[] a(Number number, Number number2) {
        if (a(number) && a(number2)) {
            return new Object[]{Long.valueOf(number.longValue()), Long.valueOf(number2.longValue())};
        }
        return new Object[]{Double.valueOf(number.doubleValue()), Double.valueOf(number2.doubleValue())};
    }

    private boolean a(Number number) {
        return (number instanceof Integer) || (number instanceof Long) || (number instanceof Short) || (number instanceof Byte);
    }
}
