package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface n3 {
    n3 a(String str);

    n3 b(long j10);

    n3 beginArray();

    n3 beginObject();

    n3 c(double d10);

    n3 d(boolean z10);

    n3 e(String str);

    n3 endArray();

    n3 endObject();

    String f();

    n3 g(String str);

    void h(String str);

    n3 i(Number number);

    n3 j(ILogger iLogger, Object obj);

    n3 k(Boolean bool);

    n3 l();

    void setLenient(boolean z10);
}
