package io.sentry;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements m3, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.a f84502b;

    public z1(Reader reader) {
        this.f84502b = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.m3
    public Object B(ILogger iLogger, t1 t1Var) throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return t1Var.a(this, iLogger);
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public float E() {
        return (float) this.f84502b.nextDouble();
    }

    @Override // io.sentry.m3
    public String G() throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return this.f84502b.nextString();
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public Float K() throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(E());
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public List P(ILogger iLogger, t1 t1Var) throws IOException {
        if (this.f84502b.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f84502b.z();
            return null;
        }
        this.f84502b.beginArray();
        ArrayList arrayList = new ArrayList();
        if (this.f84502b.hasNext()) {
            do {
                try {
                    arrayList.add(t1Var.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.a(g7.WARNING, "Failed to deserialize object in list.", e10);
                }
            } while (this.f84502b.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        this.f84502b.endArray();
        return arrayList;
    }

    @Override // io.sentry.m3
    public TimeZone S(ILogger iLogger) throws IOException {
        if (this.f84502b.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f84502b.z();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(this.f84502b.nextString());
        } catch (Exception e10) {
            iLogger.a(g7.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    @Override // io.sentry.m3
    public Double X() throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(this.f84502b.nextDouble());
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public void beginArray() {
        this.f84502b.beginArray();
    }

    @Override // io.sentry.m3
    public void beginObject() {
        this.f84502b.beginObject();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84502b.close();
    }

    @Override // io.sentry.m3
    public Integer d0() throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(this.f84502b.nextInt());
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public void endArray() {
        this.f84502b.endArray();
    }

    @Override // io.sentry.m3
    public void endObject() {
        this.f84502b.endObject();
    }

    @Override // io.sentry.m3
    public Long g0() throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(this.f84502b.nextLong());
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public boolean hasNext() {
        return this.f84502b.hasNext();
    }

    @Override // io.sentry.m3
    public Map k0(ILogger iLogger, t1 t1Var) throws IOException {
        if (this.f84502b.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f84502b.z();
            return null;
        }
        this.f84502b.beginObject();
        HashMap map = new HashMap();
        if (this.f84502b.hasNext()) {
            while (true) {
                try {
                    map.put(this.f84502b.nextName(), t1Var.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.a(g7.WARNING, "Failed to deserialize object in map.", e10);
                }
                if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        this.f84502b.endObject();
        return map;
    }

    @Override // io.sentry.m3
    public Date l(ILogger iLogger) throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return l3.a(this.f84502b.nextString(), iLogger);
        }
        this.f84502b.z();
        return null;
    }

    @Override // io.sentry.m3
    public void l0(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, p0());
        } catch (Exception e10) {
            iLogger.b(g7.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    public boolean m() {
        return this.f84502b.w();
    }

    public void n() {
        this.f84502b.z();
    }

    @Override // io.sentry.m3
    public double nextDouble() {
        return this.f84502b.nextDouble();
    }

    @Override // io.sentry.m3
    public int nextInt() {
        return this.f84502b.nextInt();
    }

    @Override // io.sentry.m3
    public long nextLong() {
        return this.f84502b.nextLong();
    }

    @Override // io.sentry.m3
    public String nextName() {
        return this.f84502b.nextName();
    }

    @Override // io.sentry.m3
    public String nextString() {
        return this.f84502b.nextString();
    }

    @Override // io.sentry.m3
    public Object p0() {
        return new y1().e(this);
    }

    @Override // io.sentry.m3
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f84502b.peek();
    }

    @Override // io.sentry.m3
    public void setLenient(boolean z10) {
        this.f84502b.setLenient(z10);
    }

    @Override // io.sentry.m3
    public void skipValue() throws IOException {
        this.f84502b.skipValue();
    }

    @Override // io.sentry.m3
    public Boolean x() throws IOException {
        if (this.f84502b.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(this.f84502b.w());
        }
        this.f84502b.z();
        return null;
    }
}
