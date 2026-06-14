package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import yg.u0;
import zg.g1;
import zg.j1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SerialDescriptor f93709a = u0.a("kotlinx.serialization.json.JsonUnquotedLiteral", vg.a.E(a1.f93282a));

    public static final JsonPrimitive a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new w(bool, false, null, 4, null);
    }

    public static final JsonPrimitive b(Number number) {
        return number == null ? JsonNull.INSTANCE : new w(number, false, null, 4, null);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new w(str, true, null, 4, null);
    }

    private static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + v0.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean e(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return j1.d(jsonPrimitive.e());
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.e();
    }

    public static final double g(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.e());
    }

    public static final float h(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.e());
    }

    public static final JsonObject i(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(jsonElement, "JsonObject");
        throw new lf.g();
    }

    public static final JsonPrimitive j(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new lf.g();
    }

    public static final SerialDescriptor k() {
        return f93709a;
    }

    public static final long l(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return new g1(jsonPrimitive.e()).p();
    }
}
