package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f8401a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8402b;

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue f8403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f8404b;

        private void a() {
            b((c) this.f8403a.take());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f8403a = blockingQueue;
            this.f8404b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f3 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #14 {all -> 0x00ff, blocks: (B:56:0x00db, B:58:0x00f3, B:83:0x013a), top: B:114:0x00db }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(final com.applovin.impl.b4.c r20) {
            /*
                Method dump skipped, instruction units count: 430
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f8411f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f8406a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f8407b);
            httpURLConnection.setConnectTimeout(cVar.f8410e);
            httpURLConnection.setReadTimeout(cVar.f8410e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f8408c.isEmpty()) {
                for (Map.Entry entry : cVar.f8408c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f8405i = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f8408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f8409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f8410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Consumer f8411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f8412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f8413h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f8414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f8415b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map f8416c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f8417d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f8418e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Consumer f8419f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f8420g;

            public a a(String str) {
                this.f8414a = str;
                return this;
            }

            public a b(String str) {
                this.f8415b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f8416c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f8416c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f8417d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f8418e = i10;
                return this;
            }

            public a a(Consumer consumer) {
                this.f8419f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.f8420g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f8413h - cVar.f8413h;
        }

        private c(a aVar) {
            this.f8406a = aVar.f8414a;
            this.f8407b = aVar.f8415b;
            this.f8408c = aVar.f8416c != null ? aVar.f8416c : Collections.EMPTY_MAP;
            this.f8409d = aVar.f8417d;
            this.f8410e = aVar.f8418e;
            this.f8411f = aVar.f8419f;
            this.f8412g = aVar.f8420g;
            this.f8413h = f8405i.incrementAndGet();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f8422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f8423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f8424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f8425e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f8426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f8427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f8428c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f8429d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f8430e;

            public a a(int i10) {
                this.f8426a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f8428c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f8427b = bArr;
                return this;
            }

            public a a(Throwable th2) {
                this.f8430e = th2;
                return this;
            }

            public a a(long j10) {
                this.f8429d = j10;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f8421a;
        }

        public int c() throws Throwable {
            Throwable th2 = this.f8425e;
            if (th2 == null) {
                return this.f8421a;
            }
            throw th2;
        }

        public byte[] d() throws Throwable {
            Throwable th2 = this.f8425e;
            if (th2 == null) {
                return this.f8422b;
            }
            throw th2;
        }

        public long e() {
            return this.f8424d;
        }

        public byte[] f() {
            return this.f8423c;
        }

        private d(a aVar) {
            this.f8421a = aVar.f8426a;
            this.f8422b = aVar.f8427b;
            this.f8423c = aVar.f8428c;
            this.f8424d = aVar.f8429d;
            this.f8425e = aVar.f8430e;
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f8402b = kVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f8402b.a(x4.R)).intValue(); i10++) {
            new b(this.f8401a, i10, this.f8402b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f8401a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
