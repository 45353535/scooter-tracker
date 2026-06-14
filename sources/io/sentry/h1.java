package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface h1 {
    void a(Object obj, Writer writer);

    void b(u5 u5Var, OutputStream outputStream);

    Object c(Reader reader, Class cls);

    Object d(Reader reader, Class cls, t1 t1Var);

    u5 e(InputStream inputStream);

    String f(Map map);
}
