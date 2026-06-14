package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public interface m3 extends Closeable {
    Object B(ILogger iLogger, t1 t1Var);

    float E();

    String G();

    Float K();

    List P(ILogger iLogger, t1 t1Var);

    TimeZone S(ILogger iLogger);

    Double X();

    void beginArray();

    void beginObject();

    Integer d0();

    void endArray();

    void endObject();

    Long g0();

    boolean hasNext();

    Map k0(ILogger iLogger, t1 t1Var);

    Date l(ILogger iLogger);

    void l0(ILogger iLogger, Map map, String str);

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    Object p0();

    io.sentry.vendor.gson.stream.b peek();

    void setLenient(boolean z10);

    void skipValue();

    Boolean x();
}
