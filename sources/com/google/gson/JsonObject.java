package com.google.gson;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonObject extends JsonElement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedTreeMap f33528b = new LinkedTreeMap(false);

    public void add(String str, JsonElement jsonElement) {
        LinkedTreeMap linkedTreeMap = this.f33528b;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? JsonNull.INSTANCE : new JsonPrimitive(str2));
    }

    public Map<String, JsonElement> asMap() {
        return this.f33528b;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.f33528b.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).f33528b.equals(this.f33528b);
        }
        return true;
    }

    public JsonElement get(String str) {
        return (JsonElement) this.f33528b.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.f33528b.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.f33528b.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.f33528b.get(str);
    }

    public boolean has(String str) {
        return this.f33528b.containsKey(str);
    }

    public int hashCode() {
        return this.f33528b.hashCode();
    }

    public boolean isEmpty() {
        return this.f33528b.isEmpty();
    }

    public Set<String> keySet() {
        return this.f33528b.keySet();
    }

    @CanIgnoreReturnValue
    public JsonElement remove(String str) {
        return (JsonElement) this.f33528b.remove(str);
    }

    public int size() {
        return this.f33528b.size();
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : this.f33528b.entrySet()) {
            jsonObject.add((String) entry.getKey(), ((JsonElement) entry.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch2) {
        add(str, ch2 == null ? JsonNull.INSTANCE : new JsonPrimitive(ch2));
    }
}
