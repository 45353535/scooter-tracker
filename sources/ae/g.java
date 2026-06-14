package ae;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final String a(Struct struct, String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Value valueB = b(struct, key);
        if (valueB != null) {
            return valueB.getStringValue();
        }
        return null;
    }

    public static final Value b(Struct struct, String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return struct.getFieldsMap().get(key);
    }

    public static final ListValue c(List list, Function1 transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Value value = (Value) transform.invoke(it.next());
            if (value != null) {
                builderNewBuilder.addValues(value);
            }
        }
        ListValue listValueBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(listValueBuild, "listValueBuilder.build()");
        return listValueBuild;
    }

    public static final Struct.Builder d(Struct.Builder builder, String key, ListValue value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, h(value));
        return builder;
    }

    public static final Struct.Builder e(Struct.Builder builder, String key, Struct value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, j(value));
        return builder;
    }

    public static final Struct.Builder f(Struct.Builder builder, String key, Number value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, k(value));
        return builder;
    }

    public static final Struct.Builder g(Struct.Builder builder, String key, String value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, l(value));
        return builder;
    }

    public static final Value h(ListValue listValue) {
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        Value valueBuild = Value.newBuilder().setListValue(listValue).build();
        Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Value i(Struct.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Struct structBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(structBuild, "build()");
        return j(structBuild);
    }

    public static final Value j(Struct struct) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Value valueBuild = Value.newBuilder().setStructValue(struct).build();
        Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Value k(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        Value.Builder builderNewBuilder = Value.newBuilder();
        Double dK = g0.K(number, null, 1, null);
        Value valueBuild = builderNewBuilder.setNumberValue(dK != null ? dK.doubleValue() : number.doubleValue()).build();
        Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ouble())\n        .build()");
        return valueBuild;
    }

    public static final Value l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }
}
