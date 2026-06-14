package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
public final class LazilyParsedNumber extends Number {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33560b;

    public LazilyParsedNumber(String str) {
        this.f33560b = str;
    }

    private BigDecimal d() {
        return NumberLimits.parseBigDecimal(this.f33560b);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return d();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f33560b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazilyParsedNumber) {
            return this.f33560b.equals(((LazilyParsedNumber) obj).f33560b);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f33560b);
    }

    public int hashCode() {
        return this.f33560b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f33560b);
            } catch (NumberFormatException unused) {
                return d().intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f33560b);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f33560b);
        } catch (NumberFormatException unused) {
            return d().longValue();
        }
    }

    public String toString() {
        return this.f33560b;
    }
}
