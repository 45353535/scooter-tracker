package org.bidon.sdk.utils.serializer;

import com.ironsource.C4424m2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.json.JsonArrayBuilder;
import org.bidon.sdk.utils.json.JsonObjectBuilder;
import org.bidon.sdk.utils.json.JsonObjectBuilderKt;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001J\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007*\u00020\u0001H\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J%\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/utils/serializer/BidonSerializer;", "", "<init>", "()V", "serializeToArray", "Lorg/json/JSONArray;", "data", "", "serialize", "Lorg/json/JSONObject;", "getSerialParams", "Lorg/bidon/sdk/utils/serializer/BidonSerializer$SerialParams;", "logFailure", "", "field", "readInstanceProperty", "R", C4424m2.f43617p, "propertyName", "", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "SerialParams", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidonSerializer {

    @NotNull
    public static final BidonSerializer INSTANCE = new BidonSerializer();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/utils/serializer/BidonSerializer$SerialParams;", "", "fieldName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SerialParams {

        @NotNull
        private final String fieldName;

        @Nullable
        private final Object value;

        public SerialParams(@NotNull String fieldName, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            this.fieldName = fieldName;
            this.value = obj;
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }

        @Nullable
        public final Object getValue() {
            return this.value;
        }
    }

    private BidonSerializer() {
    }

    private final List<SerialParams> getSerialParams(Object obj) {
        Collection<KProperty1> declaredMemberProperties = KClasses.getDeclaredMemberProperties(v0.b(obj.getClass()));
        ArrayList arrayList = new ArrayList();
        for (KProperty1 kProperty1 : declaredMemberProperties) {
            Field javaField = ReflectJvmMapping.getJavaField(kProperty1);
            SerialParams serialParams = null;
            if (javaField != null && javaField.isAnnotationPresent(JsonName.class)) {
                Field javaField2 = ReflectJvmMapping.getJavaField(kProperty1);
                JsonName jsonName = javaField2 != null ? (JsonName) javaField2.getAnnotation(JsonName.class) : null;
                if (jsonName != null) {
                    serialParams = new SerialParams(jsonName.key(), INSTANCE.readInstanceProperty(obj, kProperty1.getName()));
                } else {
                    LogExtKt.logError("BidonSerializer", "No annotation @SerialName set to field: " + kProperty1.getName(), Serializable.Error.NotAnnotatedField.INSTANCE);
                }
            }
            if (serialParams != null) {
                arrayList.add(serialParams);
            }
        }
        return arrayList;
    }

    private final void logFailure(Object data, SerialParams field) {
        LogExtKt.logError("BidonSerializer", "Error while serializing: " + data + ". Field: " + field, Serializable.Error.UnknownClass.INSTANCE);
    }

    private final <R> R readInstanceProperty(Object instance, String propertyName) {
        for (Object obj : v0.b(instance.getClass()).getMembers()) {
            if (Intrinsics.areEqual(((KCallable) obj).getName(), propertyName)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, *>");
                R r10 = (R) ((KProperty1) obj).get(instance);
                if (r10 == null) {
                    return null;
                }
                return r10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serialize$lambda$8(final Object obj, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (final SerialParams serialParams : INSTANCE.getSerialParams(obj)) {
            String fieldName = serialParams.getFieldName();
            Object value = serialParams.getValue();
            Object objJsonObject = null;
            if (value != null) {
                if (value instanceof Serializable) {
                    objJsonObject = INSTANCE.serialize(serialParams.getValue());
                } else {
                    boolean z10 = value instanceof String;
                    if (z10) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof Double) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof Integer) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof Long) {
                        objJsonObject = serialParams.getValue();
                    } else if (z10) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof Float) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof Boolean) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof Character) {
                        objJsonObject = serialParams.getValue();
                    } else if (value instanceof List) {
                        objJsonObject = JsonObjectBuilderKt.jsonArray(new Function1() { // from class: org.bidon.sdk.utils.serializer.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return BidonSerializer.serialize$lambda$8$lambda$7$lambda$3(serialParams, obj, (JsonArrayBuilder) obj2);
                            }
                        });
                    } else if (value instanceof Map) {
                        objJsonObject = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: org.bidon.sdk.utils.serializer.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return BidonSerializer.serialize$lambda$8$lambda$7$lambda$6(serialParams, obj, (JsonObjectBuilder) obj2);
                            }
                        });
                    } else {
                        INSTANCE.logFailure(obj, serialParams);
                    }
                }
            }
            jsonObject.hasValue(fieldName, objJsonObject);
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serialize$lambda$8$lambda$7$lambda$3(SerialParams serialParams, Object obj, JsonArrayBuilder jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        Iterable iterable = (Iterable) serialParams.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object objSerialize : iterable) {
            if (objSerialize == null) {
                objSerialize = null;
            } else if (objSerialize instanceof Serializable) {
                objSerialize = INSTANCE.serialize(objSerialize);
            } else {
                boolean z10 = objSerialize instanceof String;
                if (!z10 && !(objSerialize instanceof Double) && !(objSerialize instanceof Integer) && !(objSerialize instanceof Long) && !z10 && !(objSerialize instanceof Float) && !(objSerialize instanceof Boolean) && !(objSerialize instanceof Character)) {
                    INSTANCE.logFailure(obj, serialParams);
                    objSerialize = null;
                }
            }
            if (objSerialize != null) {
                arrayList.add(objSerialize);
            }
        }
        jsonArray.putValues(arrayList);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serialize$lambda$8$lambda$7$lambda$6(SerialParams serialParams, Object obj, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : ((Map) serialParams.getValue()).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null) {
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(("key is not String type: key=(" + key + ") is " + key.getClass() + ")").toString());
                }
                String str = (String) key;
                if (value != null) {
                    if (value instanceof Serializable) {
                        value = INSTANCE.serialize(value);
                    } else {
                        boolean z10 = value instanceof String;
                        if (!z10 && !(value instanceof Double) && !(value instanceof Integer) && !(value instanceof Long) && !z10 && !(value instanceof Float) && !(value instanceof Boolean) && !(value instanceof Character)) {
                            INSTANCE.logFailure(obj, serialParams);
                            value = null;
                        }
                    }
                    jsonObject.hasValue(str, value);
                } else {
                    value = null;
                    jsonObject.hasValue(str, value);
                }
            }
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serializeToArray$lambda$1(List list, JsonArrayBuilder jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.serialize(it.next()));
        }
        jsonArray.putValues(arrayList);
        return Unit.f93236a;
    }

    @NotNull
    public final JSONObject serialize(@NotNull final Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: org.bidon.sdk.utils.serializer.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BidonSerializer.serialize$lambda$8(data, (JsonObjectBuilder) obj);
            }
        });
    }

    @NotNull
    public final JSONArray serializeToArray(@NotNull final List<? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return JsonObjectBuilderKt.jsonArray(new Function1() { // from class: org.bidon.sdk.utils.serializer.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BidonSerializer.serializeToArray$lambda$1(data, (JsonArrayBuilder) obj);
            }
        });
    }
}
