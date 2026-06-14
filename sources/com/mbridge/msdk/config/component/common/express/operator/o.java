package com.mbridge.msdk.config.component.common.express.operator;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.function.Function$CC;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46743b = Arrays.asList("lower", "upper", "concat", "contains", "startWith", "endWith", "base64EncodedString", "base64DecodedString", "mtgBase64EncodedString", "mtgBase64DecodedString", "AESEncode", POBCoreNativeConstants.NATIVE_LENGTH, "jsonStrToObj", "md5String", "firstIndex", "lastIndex", "subString", "split", "replaceOccurrences", "URLEncodedString", "uuidString", "appendQueryMap");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46744a;

    public o(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46744a = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        String str3;
        byte b10;
        byte b11;
        ?? str4 = list;
        byte b12 = -1;
        String strValueOf = "";
        if (obj == null) {
            str.getClass();
            switch (str.hashCode()) {
                case -2129205176:
                    b11 = !str.equals("startWith") ? (byte) -1 : (byte) 0;
                    break;
                case -1607153599:
                    b11 = !str.equals("endWith") ? (byte) -1 : (byte) 1;
                    break;
                case -1427539794:
                    b11 = !str.equals("appendQueryMap") ? (byte) -1 : (byte) 2;
                    break;
                case -1354795244:
                    b11 = !str.equals("concat") ? (byte) -1 : (byte) 3;
                    break;
                case -567445985:
                    b11 = !str.equals("contains") ? (byte) -1 : (byte) 4;
                    break;
                case -181300222:
                    b11 = !str.equals("firstIndex") ? (byte) -1 : (byte) 5;
                    break;
                case -130478672:
                    b11 = !str.equals("URLEncodedString") ? (byte) -1 : (byte) 6;
                    break;
                case 107029:
                    b11 = !str.equals(POBCoreNativeConstants.NATIVE_LENGTH) ? (byte) -1 : (byte) 7;
                    break;
                case 109648666:
                    b11 = !str.equals("split") ? (byte) -1 : (byte) 8;
                    break;
                case 557498835:
                    b11 = !str.equals("jsonStrToObj") ? (byte) -1 : (byte) 9;
                    break;
                case 1023236911:
                    b11 = !str.equals("md5String") ? (byte) -1 : (byte) 10;
                    break;
                case 1113343916:
                    b11 = !str.equals("uuidString") ? (byte) -1 : Ascii.VT;
                    break;
                case 1632914798:
                    b11 = !str.equals("replaceOccurrences") ? (byte) -1 : Ascii.FF;
                    break;
                case 1992807388:
                    b11 = !str.equals("lastIndex") ? (byte) -1 : (byte) 13;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            switch (b11) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    obj = "";
                    break;
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
        }
        String string = obj.toString();
        if (str4 == 0 || str4.isEmpty()) {
            str2 = "StringOperator";
        } else {
            str2 = "StringOperator";
            strValueOf = String.valueOf(str4.get(0));
        }
        String str5 = strValueOf;
        try {
            switch (str.hashCode()) {
                case -2129205176:
                    if (str.equals("startWith")) {
                        b10 = 4;
                        b12 = b10;
                    }
                    break;
                case -2091173456:
                    if (str.equals("base64EncodedString")) {
                        b10 = 6;
                        b12 = b10;
                    }
                    break;
                case -1607153599:
                    if (str.equals("endWith")) {
                        b10 = 5;
                        b12 = b10;
                    }
                    break;
                case -1427539794:
                    if (str.equals("appendQueryMap")) {
                        b10 = Ascii.NAK;
                        b12 = b10;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b10 = 2;
                        b12 = b10;
                    }
                    break;
                case -928375016:
                    if (str.equals("mtgBase64DecodedString")) {
                        b10 = 9;
                        b12 = b10;
                    }
                    break;
                case -567445985:
                    if (str.equals("contains")) {
                        b10 = 3;
                        b12 = b10;
                    }
                    break;
                case -385590671:
                    if (str.equals("subString")) {
                        b10 = Ascii.DLE;
                        b12 = b10;
                    }
                    break;
                case -181300222:
                    if (str.equals("firstIndex")) {
                        b10 = Ascii.SO;
                        b12 = b10;
                    }
                    break;
                case -130478672:
                    if (str.equals("URLEncodedString")) {
                        b10 = 19;
                        b12 = b10;
                    }
                    break;
                case -60033552:
                    if (str.equals("mtgBase64EncodedString")) {
                        b10 = 8;
                        b12 = b10;
                    }
                    break;
                case 107029:
                    if (str.equals(POBCoreNativeConstants.NATIVE_LENGTH)) {
                        b10 = Ascii.VT;
                        b12 = b10;
                    }
                    break;
                case 103164673:
                    if (str.equals("lower")) {
                        b10 = 0;
                        b12 = b10;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b10 = 17;
                        b12 = b10;
                    }
                    break;
                case 111499426:
                    if (str.equals("upper")) {
                        b10 = 1;
                        b12 = b10;
                    }
                    break;
                case 557498835:
                    if (str.equals("jsonStrToObj")) {
                        b10 = Ascii.FF;
                        b12 = b10;
                    }
                    break;
                case 1023236911:
                    if (str.equals("md5String")) {
                        b10 = 13;
                        b12 = b10;
                    }
                    break;
                case 1113343916:
                    if (str.equals("uuidString")) {
                        b10 = Ascii.DC4;
                        b12 = b10;
                    }
                    break;
                case 1202825125:
                    if (str.equals("AESEncode")) {
                        b10 = 10;
                        b12 = b10;
                    }
                    break;
                case 1335452376:
                    if (str.equals("base64DecodedString")) {
                        b10 = 7;
                        b12 = b10;
                    }
                    break;
                case 1632914798:
                    if (str.equals("replaceOccurrences")) {
                        b10 = Ascii.DC2;
                        b12 = b10;
                    }
                    break;
                case 1992807388:
                    if (str.equals("lastIndex")) {
                        b10 = Ascii.SI;
                        b12 = b10;
                    }
                    break;
            }
            try {
                switch (b12) {
                    case 0:
                        return a(obj, (Function<String, String>) new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.y
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo7820andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((String) obj2).toLowerCase();
                            }

                            public /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    case 1:
                        return a(obj, (Function<String, String>) new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.x
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo7820andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((String) obj2).toUpperCase();
                            }

                            public /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    case 2:
                        return a(obj, str5);
                    case 3:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.contains(str5)));
                    case 4:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.startsWith(str5)));
                    case 5:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.endsWith(str5)));
                    case 6:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(string.getBytes(), 0));
                    case 7:
                        try {
                            str4 = new String(Base64.decode(string, 0), "UTF-8");
                            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str4);
                        } catch (Exception e10) {
                            q0.b(str2, "Base64解码失败: " + e10.getMessage());
                            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                        }
                    case 8:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.b(string));
                    case 9:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.a(string));
                    case 10:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.a(string, str5));
                    case 11:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(string.length()));
                    case 12:
                        return a(string);
                    case 13:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(SameMD5.getMD5(string));
                    case 14:
                        return a(string, str5);
                    case 15:
                        return b(string, str5);
                    case 16:
                        return b(string, (List<Object>) str4);
                    case 17:
                        return d(string, str5);
                    case 18:
                        return a(string, (List<Object>) str4);
                    case 19:
                        return d(string, (List<Object>) str4);
                    case 20:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.d());
                    case 21:
                        return c(string, (List<Object>) str4);
                    default:
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
                }
            } catch (Exception e11) {
                e = e11;
                str3 = str4;
            }
            e = e11;
            str3 = str4;
        } catch (Exception e12) {
            e = e12;
            str3 = str2;
        }
        q0.b(str3, e.getMessage());
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private String c(String str, String str2) {
        str2.getClass();
        if (str2.equals("lower")) {
            return str.toLowerCase();
        }
        if (str2.equals("upper")) {
            return str.toUpperCase();
        }
        return null;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, String str2) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String[0]) : TextUtils.isEmpty(str2) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String[]{str}) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.split(str2));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f46743b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(String str, List<Object> list) {
        Map map;
        if (list != null) {
            boolean z10 = true;
            if (list.size() == 1) {
                if (str == null) {
                    str = "";
                }
                Object obj = list.get(0);
                boolean z11 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
                if (!z11 && !(obj instanceof Map)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
                }
                if (z11) {
                    map = new HashMap();
                    for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    map = (Map) obj;
                }
                try {
                    StringBuilder sb2 = new StringBuilder(str);
                    if (!str.contains("?")) {
                        sb2.append("?");
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (!z10) {
                            sb2.append(C4240b4.j.f42670c);
                        }
                        sb2.append((String) entry2.getKey());
                        sb2.append(C4240b4.j.f42668b);
                        sb2.append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                        z10 = false;
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
                } catch (Throwable th2) {
                    q0.b("StringOperator", "Error encoding URL parameters: " + th2.getMessage(), th2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            if (!TextUtils.isEmpty(strEncode)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(strEncode);
            }
        } catch (Throwable th2) {
            q0.b("StringOperator", th2.getMessage(), th2);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, Function<String, String> function) {
        if (obj != null) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(function.apply(String.valueOf(obj)));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(String.valueOf(obj), ""));
            } catch (Exception e10) {
                q0.b("StringOperator", e10.getMessage(), e10);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(obj);
        }
        if (str != null) {
            sb2.append(str);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("StringOperator", "JSON字符串为空");
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a((Object) new JSONObject(str)));
        } catch (JSONException e10) {
            q0.b("StringOperator", "JSON字符串转Map对象失败: " + e10.getMessage() + ", JSON字符串: " + str);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e11) {
            q0.b("StringOperator", "JSON字符串转Map对象异常: " + e11.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(next)) {
                q0.d("StringOperator", "跳过空键: " + next);
            } else {
                map.put(next, a(jSONObject.get(next)));
            }
        }
        return map;
    }

    private List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.lastIndexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private Object a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            try {
                int i10 = Integer.parseInt(String.valueOf(list.get(0)));
                int i11 = Integer.parseInt(String.valueOf(list.get(1)));
                if (i10 >= 0 && i11 < str.length() && i10 <= i11) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.substring(i10, i11 + 1));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (NumberFormatException e10) {
                q0.b("StringOperator", "subString操作参数格式错误: " + e10.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (StringIndexOutOfBoundsException e11) {
                q0.b("StringOperator", "subString操作索引越界: " + e11.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.indexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (TextUtils.isEmpty(strValueOf)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.replace(strValueOf, strValueOf2));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }
}
