package io.sentry;

import com.ironsource.D5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class u6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f84283d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v6 f84284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f84285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f84286c;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f84287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable f84288b;

        public a(Callable callable) {
            this.f84288b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable callable;
            if (this.f84287a == null && (callable = this.f84288b) != null) {
                this.f84287a = (byte[]) callable.call();
            }
            return b(this.f84287a);
        }
    }

    u6(v6 v6Var, byte[] bArr) {
        this.f84284a = (v6) io.sentry.util.w.c(v6Var, "SentryEnvelopeItemHeader is required.");
        this.f84286c = bArr;
        this.f84285b = null;
    }

    public static u6 A(final h1 h1Var, final io.sentry.clientreport.c cVar) {
        io.sentry.util.w.c(h1Var, "ISerializer is required.");
        io.sentry.util.w.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.c6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.d(h1Var, cVar);
            }
        });
        return new u6(new v6(f7.resolve(cVar), new Callable() { // from class: io.sentry.d6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, D5.L, null), new Callable() { // from class: io.sentry.e6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static u6 B(final h1 h1Var, final n5 n5Var) {
        io.sentry.util.w.c(h1Var, "ISerializer is required.");
        io.sentry.util.w.c(n5Var, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.z5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.n(h1Var, n5Var);
            }
        });
        return new u6(new v6(f7.resolve(n5Var), new Callable() { // from class: io.sentry.a6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, D5.L, null), new Callable() { // from class: io.sentry.b6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static u6 C(final h1 h1Var, final k7 k7Var) {
        io.sentry.util.w.c(h1Var, "ISerializer is required.");
        io.sentry.util.w.c(k7Var, "SentryLogEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.f6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.s(h1Var, k7Var);
            }
        });
        return new u6(new v6(f7.Log, new Callable() { // from class: io.sentry.g6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(k7Var.a().size())), new Callable() { // from class: io.sentry.i6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static u6 D(final u3 u3Var, final h1 h1Var, final x0 x0Var) {
        final File fileQ = u3Var.q();
        final a aVar = new a(new Callable() { // from class: io.sentry.q6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.u(fileQ, u3Var, x0Var, h1Var);
            }
        });
        return new u6(new v6(f7.ProfileChunk, new Callable() { // from class: io.sentry.r6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileQ.getName(), (String) null, u3Var.p(), (Integer) null), new Callable() { // from class: io.sentry.s6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static u6 E(final y3 y3Var, final long j10, final h1 h1Var) {
        final File fileC = y3Var.C();
        final a aVar = new a(new Callable() { // from class: io.sentry.t6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.o(fileC, j10, y3Var, h1Var);
            }
        });
        return new u6(new v6(f7.Profile, new Callable() { // from class: io.sentry.x5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileC.getName()), new Callable() { // from class: io.sentry.y5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static u6 F(final h1 h1Var, final ILogger iLogger, final w7 w7Var, final d4 d4Var, final boolean z10) {
        final File fileJ0 = w7Var.j0();
        final a aVar = new a(new Callable() { // from class: io.sentry.j6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.c(h1Var, w7Var, d4Var, fileJ0, iLogger, z10);
            }
        });
        return new u6(new v6(f7.ReplayVideo, new Callable() { // from class: io.sentry.k6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null), new Callable() { // from class: io.sentry.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static u6 G(final h1 h1Var, final k8 k8Var) {
        io.sentry.util.w.c(h1Var, "ISerializer is required.");
        io.sentry.util.w.c(k8Var, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.w5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.t(h1Var, k8Var);
            }
        });
        return new u6(new v6(f7.Session, new Callable() { // from class: io.sentry.h6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, D5.L, null), new Callable() { // from class: io.sentry.m6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    private static byte[] M(Map map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry entry : map.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f84283d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] c(h1 h1Var, w7 w7Var, d4 d4Var, File file, ILogger iLogger, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    h1Var.a(w7Var, bufferedWriter);
                    linkedHashMap.put(f7.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (d4Var != null) {
                        h1Var.a(d4Var, bufferedWriter);
                        linkedHashMap.put(f7.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = io.sentry.util.h.b(file.getPath(), 10485760L);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(f7.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrM = M(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z10) {
                            return bArrM;
                        }
                    }
                    return bArrM;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                iLogger.a(g7.ERROR, "Could not serialize replay recording", th2);
                if (file == null) {
                    return null;
                }
                if (z10) {
                    io.sentry.util.h.a(file.getParentFile());
                    return null;
                }
                file.delete();
                return null;
            } finally {
                if (file != null) {
                    if (z10) {
                        io.sentry.util.h.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(h1 h1Var, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
            try {
                h1Var.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] n(h1 h1Var, n5 n5Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
            try {
                h1Var.a(n5Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] o(File file, long j10, y3 y3Var, h1 h1Var) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strC = io.sentry.vendor.a.c(io.sentry.util.h.b(file.getPath(), j10), 3);
        if (strC.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        y3Var.F(strC);
        y3Var.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
                    try {
                        h1Var.a(y3Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new io.sentry.exception.b(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    public static /* synthetic */ byte[] s(h1 h1Var, k7 k7Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
            try {
                h1Var.a(k7Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] t(h1 h1Var, k8 k8Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
            try {
                h1Var.a(k8Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] u(File file, u3 u3Var, x0 x0Var, h1 h1Var) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        if (!"java".equals(u3Var.p())) {
            String strC = io.sentry.vendor.a.c(io.sentry.util.h.b(file.getPath(), 52428800L), 3);
            if (strC.isEmpty()) {
                throw new io.sentry.exception.b("Profiling trace file is empty");
            }
            u3Var.s(strC);
        } else {
            if (q2.b().equals(x0Var)) {
                throw new io.sentry.exception.b("No ProfileConverter available, dropping chunk.");
            }
            try {
                u3Var.t(x0Var.a(file.getAbsolutePath()));
            } catch (Exception e10) {
                throw new io.sentry.exception.b("Profile conversion failed", e10);
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84283d));
                    try {
                        h1Var.a(u3Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                throw new io.sentry.exception.b(String.format("Failed to serialize profile chunk\n%s", e11.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    public static /* synthetic */ byte[] x(b bVar, long j10, h1 h1Var, ILogger iLogger) throws io.sentry.exception.b {
        byte[] bArr;
        if (bVar.f() != null) {
            byte[] bArrF = bVar.f();
            y(bArrF.length, j10, bVar.h());
            return bArrF;
        }
        if (bVar.j() != null) {
            byte[] bArrB = io.sentry.util.p.b(h1Var, iLogger, bVar.j());
            if (bArrB != null) {
                y(bArrB.length, j10, bVar.h());
                return bArrB;
            }
        } else {
            if (bVar.i() != null) {
                return io.sentry.util.h.b(bVar.i(), j10);
            }
            if (bVar.e() != null && (bArr = (byte[]) bVar.e().call()) != null) {
                y(bArr.length, j10, bVar.h());
                return bArr;
            }
        }
        throw new io.sentry.exception.b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", bVar.h()));
    }

    private static void y(long j10, long j11, String str) throws io.sentry.exception.b {
        if (j10 > j11) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static u6 z(final h1 h1Var, final ILogger iLogger, final b bVar, final long j10) {
        final a aVar = new a(new Callable() { // from class: io.sentry.n6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u6.x(bVar, j10, h1Var, iLogger);
            }
        });
        return new u6(new v6(f7.Attachment, new Callable() { // from class: io.sentry.o6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, bVar.g(), bVar.h(), bVar.d()), new Callable() { // from class: io.sentry.p6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public io.sentry.clientreport.c H(h1 h1Var) throws IOException {
        v6 v6Var = this.f84284a;
        if (v6Var == null || v6Var.b() != f7.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f84283d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) h1Var.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public byte[] I() {
        Callable callable;
        if (this.f84286c == null && (callable = this.f84285b) != null) {
            this.f84286c = (byte[]) callable.call();
        }
        return this.f84286c;
    }

    public v6 J() {
        return this.f84284a;
    }

    public k7 K(h1 h1Var) throws IOException {
        v6 v6Var = this.f84284a;
        if (v6Var == null || v6Var.b() != f7.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f84283d));
        try {
            k7 k7Var = (k7) h1Var.c(bufferedReader, k7.class);
            bufferedReader.close();
            return k7Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.protocol.e0 L(h1 h1Var) throws IOException {
        v6 v6Var = this.f84284a;
        if (v6Var == null || v6Var.b() != f7.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f84283d));
        try {
            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) h1Var.c(bufferedReader, io.sentry.protocol.e0.class);
            bufferedReader.close();
            return e0Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    u6(v6 v6Var, Callable callable) {
        this.f84284a = (v6) io.sentry.util.w.c(v6Var, "SentryEnvelopeItemHeader is required.");
        this.f84285b = (Callable) io.sentry.util.w.c(callable, "DataFactory is required.");
        this.f84286c = null;
    }
}
