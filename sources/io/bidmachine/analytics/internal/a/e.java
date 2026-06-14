package io.bidmachine.analytics.internal.a;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.ironsource.C4240b4;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import kotlin.sequences.k;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {
    public static final Object a(Closeable closeable) {
        try {
            Result.Companion companion = Result.f93230c;
            closeable.close();
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public static final byte[] b(byte[] bArr, String str) {
        return a(bArr, str.getBytes(Charsets.UTF_8));
    }

    public static final String c(String str) {
        return Base64.encodeToString(str.getBytes(Charsets.UTF_8), 2);
    }

    public static final String d(String str) {
        if (str.length() == 0) {
            return str;
        }
        int iV0 = StringsKt.v0(str, C4240b4.j.f42668b, 0, false, 6, null);
        if (iV0 == -1) {
            return StringsKt.H1(str).toString();
        }
        return StringsKt.H1(str.substring(0, iV0)).toString() + str.substring(iV0);
    }

    public static final String b(String str) {
        return a(d(str));
    }

    public static final Object a(Flushable flushable) {
        try {
            Result.Companion companion = Result.f93230c;
            flushable.flush();
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public static final JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(a((List) obj));
            } else if (obj instanceof Map) {
                jSONArray.put(a((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                Result.Companion companion = Result.f93230c;
                String strValueOf = String.valueOf(key);
                if (strValueOf.length() != 0 && value != null) {
                    if (value instanceof List) {
                        value = a((List) value);
                    } else if (value instanceof Map) {
                        value = a((Map) value);
                    }
                    jSONObject.put(strValueOf, value);
                }
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
        return jSONObject;
    }

    public static final Map a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : k.h(jSONObject.keys())) {
            Object objA = a(jSONObject.get(str));
            if (objA != null) {
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final List a(JSONArray jSONArray) {
        IntRange intRangeV = g.v(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            Object objA = a(jSONArray.get(((IntIterator) it).nextInt()));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static final Object a(Object obj) {
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj instanceof JSONObject ? a((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static final Map a(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object string = bundle.get(str);
            if (!(string instanceof Boolean)) {
                if (string instanceof Byte) {
                    string = Integer.valueOf(((Number) string).byteValue());
                } else if (!(string instanceof Character) && !(string instanceof Double) && !(string instanceof Float) && !(string instanceof Integer) && !(string instanceof Long)) {
                    if (string instanceof Short) {
                        string = Integer.valueOf(((Number) string).shortValue());
                    } else if (!(string instanceof String)) {
                        if (string instanceof Bundle) {
                            string = a((Bundle) string);
                        } else {
                            string = (!(string instanceof CharSequence) && string == null) ? null : string.toString();
                        }
                    }
                }
            }
            if (string != null) {
                linkedHashMap.put(str, string);
            }
        }
        return linkedHashMap;
    }

    public static final boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes(Charsets.UTF_8));
    }

    private static final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }

    public static final String a(String str) {
        return new String(Base64.decode(str, 2), Charsets.UTF_8);
    }

    public static final String a(Throwable th2) {
        String message = th2.getMessage();
        if (message != null) {
            String str = th2.getClass().getName() + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return th2.getClass().getName();
    }
}
