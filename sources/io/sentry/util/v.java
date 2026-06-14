package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.l3;
import io.sentry.m3;
import io.sentry.t1;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements m3, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f84318b;

    public v(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f84318b = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private Object n() throws IOException {
        try {
            return o(null, null);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private Object o(ILogger iLogger, t1 t1Var) {
        Map.Entry entry = (Map.Entry) this.f84318b.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (t1Var != null && iLogger != null) {
            return t1Var.a(this, iLogger);
        }
        this.f84318b.removeLast();
        return value;
    }

    @Override // io.sentry.m3
    public Object B(ILogger iLogger, t1 t1Var) {
        return o(iLogger, t1Var);
    }

    @Override // io.sentry.m3
    public float E() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.m3
    public String G() {
        return (String) n();
    }

    @Override // io.sentry.m3
    public Float K() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Float.valueOf(((Number) objN).floatValue());
        }
        return null;
    }

    @Override // io.sentry.m3
    public List P(ILogger iLogger, t1 t1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            m();
            return null;
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(t1Var.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.a(g7.WARNING, "Failed to deserialize object in list.", e10);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            endArray();
            return arrayList;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.m3
    public TimeZone S(ILogger iLogger) {
        String strG = G();
        if (strG != null) {
            return DesugarTimeZone.getTimeZone(strG);
        }
        return null;
    }

    @Override // io.sentry.m3
    public Double X() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Double.valueOf(((Number) objN).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.m3
    public void beginArray() throws IOException {
        Map.Entry entry = (Map.Entry) this.f84318b.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f84318b.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f84318b.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.m3
    public void beginObject() throws IOException {
        Map.Entry entry = (Map.Entry) this.f84318b.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f84318b.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f84318b.addLast((Map.Entry) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f84318b.clear();
    }

    @Override // io.sentry.m3
    public Integer d0() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Integer.valueOf(((Number) objN).intValue());
        }
        return null;
    }

    @Override // io.sentry.m3
    public void endArray() {
        if (this.f84318b.size() > 1) {
            this.f84318b.removeLast();
        }
    }

    @Override // io.sentry.m3
    public void endObject() {
        if (this.f84318b.size() > 1) {
            this.f84318b.removeLast();
        }
    }

    @Override // io.sentry.m3
    public Long g0() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return Long.valueOf(((Number) objN).longValue());
        }
        return null;
    }

    @Override // io.sentry.m3
    public boolean hasNext() {
        return !this.f84318b.isEmpty();
    }

    @Override // io.sentry.m3
    public Map k0(ILogger iLogger, t1 t1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            m();
            return null;
        }
        try {
            beginObject();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(nextName(), t1Var.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.a(g7.WARNING, "Failed to deserialize object in map.", e10);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.m3
    public Date l(ILogger iLogger) {
        return l3.a(G(), iLogger);
    }

    @Override // io.sentry.m3
    public void l0(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, p0());
        } catch (Exception e10) {
            iLogger.b(g7.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    public void m() throws IOException {
        if (n() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.m3
    public double nextDouble() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.m3
    public int nextInt() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.m3
    public long nextLong() throws IOException {
        Object objN = n();
        if (objN instanceof Number) {
            return ((Number) objN).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.m3
    public String nextName() throws IOException {
        Map.Entry entry = (Map.Entry) this.f84318b.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.m3
    public String nextString() throws IOException {
        String str = (String) n();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.m3
    public Object p0() {
        return n();
    }

    @Override // io.sentry.m3
    public io.sentry.vendor.gson.stream.b peek() {
        if (this.f84318b.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) this.f84318b.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.m3
    public void setLenient(boolean z10) {
    }

    @Override // io.sentry.m3
    public void skipValue() {
    }

    @Override // io.sentry.m3
    public Boolean x() {
        return (Boolean) n();
    }
}
