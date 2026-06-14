package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfiw;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbp {
    @NonNull
    public static List zza(@Nullable JSONArray jSONArray, @Nullable List list) throws JSONException {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                list.add(jSONArray.getString(i10));
            }
        }
        return list;
    }

    public static List zzb(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map zzc(JsonReader jsonReader) throws IllegalStateException, IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            HashMap map2 = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                map2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            map.put(strNextName, map2);
        }
        jsonReader.endObject();
        return map;
    }

    public static JSONObject zzd(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, zze(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, zzd(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray zze(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(zze(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(zzd(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void zzf(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzf(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    zzg(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static void zzg(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzf(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    zzg(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static JSONObject zzh(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    @Nullable
    public static JSONObject zzi(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzo = zzo(jSONObject, strArr);
        if (jSONObjectZzo == null) {
            return null;
        }
        return jSONObjectZzo.optJSONObject(strArr[1]);
    }

    public static boolean zzj(boolean z10, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzo = zzo(jSONObject, strArr);
        if (jSONObjectZzo == null) {
            return false;
        }
        return jSONObjectZzo.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String zzk(String str, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzo = zzo(jSONObject, strArr);
        return jSONObjectZzo == null ? "" : jSONObjectZzo.optString(strArr[0], "");
    }

    @Nullable
    public static Bundle zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        Object objOpt2 = null;
                        for (int i10 = 0; objOpt2 == null && i10 < length; i10++) {
                            objOpt2 = !jSONArray.isNull(i10) ? jSONArray.opt(i10) : null;
                        }
                        if (objOpt2 == null) {
                            String strValueOf = String.valueOf(next);
                            int i11 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Expected JSONArray with at least 1 non-null element for key:".concat(strValueOf));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                bundleArr[i12] = !jSONArray.isNull(i12) ? zzl(jSONArray.optJSONObject(i12)) : null;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            for (int i13 = 0; i13 < length; i13++) {
                                dArr[i13] = jSONArray.optDouble(i13);
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            for (int i14 = 0; i14 < length; i14++) {
                                strArr[i14] = !jSONArray.isNull(i14) ? jSONArray.optString(i14) : null;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            for (int i15 = 0; i15 < length; i15++) {
                                zArr[i15] = jSONArray.optBoolean(i15);
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String str = String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next);
                            int i16 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(str);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, zzl((JSONObject) objOpt));
                } else {
                    String strValueOf2 = String.valueOf(next);
                    int i17 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unsupported type for key:".concat(strValueOf2));
                }
            }
        }
        return bundle;
    }

    public static String zzm(@Nullable zzfiw zzfiwVar) {
        if (zzfiwVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            zzn(jsonWriter, zzfiwVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error when writing JSON.", e10);
            return null;
        }
    }

    private static void zzn(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfiw) {
            zzf(jsonWriter, ((zzfiw) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzn(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                zzn(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    @Nullable
    private static JSONObject zzo(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }
}
