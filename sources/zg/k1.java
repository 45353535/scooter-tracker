package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 {
    public static final Object a(kotlinx.serialization.json.b json, JsonElement element, ug.c deserializer) {
        Decoder m0Var;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            m0Var = new s0(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            m0Var = new u0(json, (JsonArray) element);
        } else {
            if (!(element instanceof kotlinx.serialization.json.w) && !Intrinsics.areEqual(element, JsonNull.INSTANCE)) {
                throw new lf.m();
            }
            m0Var = new m0(json, (JsonPrimitive) element, null, 4, null);
        }
        return m0Var.k(deserializer);
    }

    public static final Object b(kotlinx.serialization.json.b bVar, String discriminator, JsonObject element, ug.c deserializer) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new s0(bVar, element, discriminator, deserializer.getDescriptor()).k(deserializer);
    }
}
