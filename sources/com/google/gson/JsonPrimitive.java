package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonPrimitive extends JsonElement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33529b;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f33529b = bool;
    }

    private static boolean a(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f33529b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f33529b == null) {
            return jsonPrimitive.f33529b == null;
        }
        if (a(this) && a(jsonPrimitive)) {
            return ((this.f33529b instanceof BigInteger) || (jsonPrimitive.f33529b instanceof BigInteger)) ? getAsBigInteger().equals(jsonPrimitive.getAsBigInteger()) : getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
        }
        Object obj2 = this.f33529b;
        if (obj2 instanceof Number) {
            Object obj3 = jsonPrimitive.f33529b;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return getAsBigDecimal().compareTo(jsonPrimitive.getAsBigDecimal()) == 0;
                }
                double asDouble = getAsDouble();
                double asDouble2 = jsonPrimitive.getAsDouble();
                return asDouble == asDouble2 || (Double.isNaN(asDouble) && Double.isNaN(asDouble2));
            }
        }
        return obj2.equals(jsonPrimitive.f33529b);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.f33529b;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.f33529b;
        return obj instanceof BigInteger ? (BigInteger) obj : a(this) ? BigInteger.valueOf(getAsNumber().longValue()) : NumberLimits.parseBigInteger(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return isBoolean() ? ((Boolean) this.f33529b).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (asString.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return asString.charAt(0);
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.f33529b;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object obj = this.f33529b;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((Boolean) this.f33529b).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f33529b.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f33529b == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = getAsNumber().longValue();
        } else {
            Object obj = this.f33529b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean isBoolean() {
        return this.f33529b instanceof Boolean;
    }

    public boolean isNumber() {
        return this.f33529b instanceof Number;
    }

    public boolean isString() {
        return this.f33529b instanceof String;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.f33529b = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.f33529b = str;
    }

    public JsonPrimitive(Character ch2) {
        Objects.requireNonNull(ch2);
        this.f33529b = ch2.toString();
    }
}
