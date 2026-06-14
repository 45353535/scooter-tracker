package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f7491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f7494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f7495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f7496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map f7497g = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f7498h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        boolean b(long j10) {
            return this.f7495e < j10;
        }

        boolean c(long j10) {
            return this.f7496f < j10;
        }
    }

    void a(String str, boolean z10);

    void b(String str, a aVar);

    a get(String str);

    void initialize();
}
