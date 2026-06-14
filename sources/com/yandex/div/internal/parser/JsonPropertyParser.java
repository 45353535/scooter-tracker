package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class JsonPropertyParser {
    @Nullable
    private static JSONObject nullable(@Nullable JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return jSONObject;
    }

    @Nullable
    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t10 = (T) jSONObject.opt(str);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObjectNullable != null) {
                try {
                    Object objDeserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, jSONObjectNullable);
                    if (objDeserialize != null) {
                        arrayList.add(objDeserialize);
                    }
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalList(parsingContext, jSONObject, str, function1, listValidator, JsonParsers.alwaysValid());
    }

    @Nullable
    public static String readOptionalString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            return (String) objOptSafe;
        } catch (ClassCastException unused) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }

    @NonNull
    public static String readString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            return (String) objOptSafe;
        } catch (ClassCastException unused) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
        } catch (Exception e10) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v10) {
        write(parsingContext, jSONObject, str, v10, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull Function1<V, R> function1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(function1.invoke(list.get(i10)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            parsingContext.getLogger().logError(e10);
        }
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) read(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1) {
        return (V) readOptional(parsingContext, jSONObject, str, function1, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return list;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object objOptSafe = optSafe(jSONArrayOptJSONArray, i10);
            if (objOptSafe != null) {
                try {
                    V vInvoke = function1.invoke(objOptSafe);
                    if (vInvoke != null) {
                        try {
                            if (valueValidator.isValid(vInvoke)) {
                                arrayList.add(vInvoke);
                            } else {
                                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, vInvoke));
                            }
                        } catch (ClassCastException unused2) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, vInvoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOptSafe, e10));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    public static <R, V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v10, @NonNull Function1<V, R> function1) {
        if (v10 != null) {
            try {
                jSONObject.put(str, function1.invoke(v10));
            } catch (JSONException e10) {
                parsingContext.getLogger().logError(e10);
            }
        }
    }

    @Nullable
    private static <T> T optSafe(JSONArray jSONArray, int i10) {
        T t10 = (T) jSONArray.opt(i10);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            try {
                V v10 = (V) function1.invoke(objOptSafe);
                if (v10 != null) {
                    try {
                        if (valueValidator.isValid(v10)) {
                            return v10;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, v10);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, v10);
                    }
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e10) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            V v10 = (V) function1.invoke(objOptSafe);
            if (v10 == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(v10)) {
                    return v10;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v10, @NonNull Lazy lazy) {
        if (v10 != null) {
            try {
                jSONObject.put(str, ((Serializer) lazy.getValue()).serialize(parsingContext, v10));
            } catch (JSONException e10) {
                parsingContext.getLogger().logError(e10);
            }
        }
    }

    public static <V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull Lazy lazy) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(((Serializer) lazy.getValue()).serialize(parsingContext, list.get(i10)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            parsingContext.getLogger().logError(e10);
        }
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull ListValidator<V> listValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<V> list = Collections.EMPTY_LIST;
                try {
                    if (!listValidator.isValid(list)) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                    }
                    return list;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                    return list;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
                if (jSONObjectNullable != null) {
                    try {
                        Object objDeserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, jSONObjectNullable);
                        if (objDeserialize != null) {
                            arrayList.add(objDeserialize);
                        }
                    } catch (Exception e10) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return (V) ((Deserializer) lazy.getValue()).deserialize(parsingContext, jSONObjectOptJSONObject);
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONObject, str, e10));
            return null;
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            try {
                V v10 = (V) ((Deserializer) lazy.getValue()).deserialize(parsingContext, jSONObjectOptJSONObject);
                if (v10 != null) {
                    return v10;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
            } catch (Exception e10) {
                throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObjectNullable != null) {
                try {
                    Object objDeserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, jSONObjectNullable);
                    if (objDeserialize != null) {
                        arrayList.add(objDeserialize);
                    }
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull Lazy lazy, @NonNull ListValidator<V> listValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return list;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObjectNullable != null) {
                try {
                    Object objDeserialize = ((Deserializer) lazy.getValue()).deserialize(parsingContext, jSONObjectNullable);
                    if (objDeserialize != null) {
                        arrayList.add(objDeserialize);
                    }
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }
}
