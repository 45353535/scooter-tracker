package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.TextFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
abstract class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f80063a = {BuildConfig.LIBRARY_PACKAGE_NAME, "com.explorestack"};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f80064a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            f80064a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f80064a[Descriptors.FieldDescriptor.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static void b(JSONArray jSONArray, Object obj) {
        jSONArray.put(obj);
    }

    private static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    private static String d(Object obj) {
        return obj instanceof ByteString ? TextFormat.escapeBytes((ByteString) obj) : TextFormat.escapeBytes((byte[]) obj);
    }

    static void e(final String str, final MessageOrBuilder messageOrBuilder) {
        if (messageOrBuilder != null) {
            io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.c5
                @Override // ce.b
                public final Object get() {
                    return String.format("[%s] %s", str, d5.j(messageOrBuilder));
                }
            });
        }
    }

    private static Object f(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        try {
            if (fieldDescriptor.isRepeated() && (obj instanceof List)) {
                return i(fieldDescriptor, (List) obj);
            }
            switch (a.f80064a[fieldDescriptor.getJavaType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return obj;
                case 7:
                    return d(obj);
                case 8:
                    return ((Descriptors.GenericDescriptor) obj).getName();
                case 9:
                    return j((MessageOrBuilder) obj);
                default:
                    return "Unsupported type";
            }
        } catch (Throwable unused) {
            return "Parsing error";
        }
    }

    private static JSONObject g(Any any) {
        String str = any.getTypeUrl().split("/")[r0.length - 1];
        for (String str2 : f80063a) {
            try {
                return j(any.unpack(Class.forName(str2 + str.substring(str.indexOf(".")))));
            } catch (Exception unused) {
            }
        }
        return new JSONObject();
    }

    private static JSONObject h(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
            c(jSONObject, fieldDescriptor.getName(), f(fieldDescriptor, entry.getValue()));
        }
        return jSONObject;
    }

    private static JSONArray i(Descriptors.FieldDescriptor fieldDescriptor, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(jSONArray, f(fieldDescriptor, it.next()));
        }
        return jSONArray;
    }

    private static JSONObject j(MessageOrBuilder messageOrBuilder) {
        return messageOrBuilder instanceof Any ? g((Any) messageOrBuilder) : h(messageOrBuilder.getAllFields());
    }
}
