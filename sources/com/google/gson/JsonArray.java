package com.google.gson;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f33527b;

    public JsonArray() {
        this.f33527b = new ArrayList();
    }

    private JsonElement e() {
        int size = this.f33527b.size();
        if (size == 1) {
            return (JsonElement) this.f33527b.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public void add(Boolean bool) {
        this.f33527b.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addAll(JsonArray jsonArray) {
        this.f33527b.addAll(jsonArray.f33527b);
    }

    public List<JsonElement> asList() {
        return new NonNullElementWrapperList(this.f33527b);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.f33527b.contains(jsonElement);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).f33527b.equals(this.f33527b);
        }
        return true;
    }

    public JsonElement get(int i10) {
        return (JsonElement) this.f33527b.get(i10);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return e().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return e().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return e().getAsBoolean();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return e().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        return e().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return e().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return e().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return e().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return e().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        return e().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return e().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        return e().getAsString();
    }

    public int hashCode() {
        return this.f33527b.hashCode();
    }

    public boolean isEmpty() {
        return this.f33527b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.f33527b.iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(JsonElement jsonElement) {
        return this.f33527b.remove(jsonElement);
    }

    @CanIgnoreReturnValue
    public JsonElement set(int i10, JsonElement jsonElement) {
        ArrayList arrayList = this.f33527b;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        return (JsonElement) arrayList.set(i10, jsonElement);
    }

    public int size() {
        return this.f33527b.size();
    }

    public void add(Character ch2) {
        this.f33527b.add(ch2 == null ? JsonNull.INSTANCE : new JsonPrimitive(ch2));
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        if (this.f33527b.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(this.f33527b.size());
        Iterator it = this.f33527b.iterator();
        while (it.hasNext()) {
            jsonArray.add(((JsonElement) it.next()).deepCopy());
        }
        return jsonArray;
    }

    @CanIgnoreReturnValue
    public JsonElement remove(int i10) {
        return (JsonElement) this.f33527b.remove(i10);
    }

    public JsonArray(int i10) {
        this.f33527b = new ArrayList(i10);
    }

    public void add(Number number) {
        this.f33527b.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void add(String str) {
        this.f33527b.add(str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.f33527b.add(jsonElement);
    }
}
