package io.sentry;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.sentry.clientreport.c;
import io.sentry.d4;
import io.sentry.e;
import io.sentry.f7;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.i9;
import io.sentry.k7;
import io.sentry.k8;
import io.sentry.l5;
import io.sentry.p8;
import io.sentry.profilemeasurements.a;
import io.sentry.profilemeasurements.b;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a;
import io.sentry.protocol.a0;
import io.sentry.protocol.b;
import io.sentry.protocol.b0;
import io.sentry.protocol.c;
import io.sentry.protocol.c0;
import io.sentry.protocol.d;
import io.sentry.protocol.d0;
import io.sentry.protocol.e;
import io.sentry.protocol.e0;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.i0;
import io.sentry.protocol.j;
import io.sentry.protocol.j0;
import io.sentry.protocol.k;
import io.sentry.protocol.k0;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.rrweb.a;
import io.sentry.rrweb.c;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import io.sentry.u3;
import io.sentry.u8;
import io.sentry.v3;
import io.sentry.v5;
import io.sentry.v6;
import io.sentry.w6;
import io.sentry.w7;
import io.sentry.w8;
import io.sentry.y3;
import io.sentry.z3;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f83427c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f83429b;

    public e2(v7 v7Var) {
        this.f83428a = v7Var;
        HashMap map = new HashMap();
        this.f83429b = map;
        map.put(io.sentry.protocol.a.class, new a.C1011a());
        map.put(e.class, new e.a());
        map.put(io.sentry.protocol.b.class, new b.a());
        map.put(io.sentry.protocol.c.class, new c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(io.sentry.protocol.d.class, new d.a());
        map.put(io.sentry.protocol.e.class, new e.a());
        map.put(e.b.class, new e.b.a());
        map.put(io.sentry.protocol.h.class, new h.a());
        map.put(io.sentry.protocol.j.class, new j.a());
        map.put(io.sentry.protocol.k.class, new k.a());
        map.put(io.sentry.protocol.l.class, new l.a());
        map.put(io.sentry.protocol.m.class, new m.a());
        map.put(io.sentry.protocol.n.class, new n.a());
        map.put(u3.class, new u3.b());
        map.put(v3.class, new v3.a());
        map.put(y3.class, new y3.b());
        map.put(z3.class, new z3.a());
        map.put(io.sentry.profilemeasurements.a.class, new a.C1010a());
        map.put(io.sentry.profilemeasurements.b.class, new b.a());
        map.put(io.sentry.protocol.o.class, new o.a());
        map.put(d4.class, new d4.b());
        map.put(io.sentry.rrweb.a.class, new a.C1013a());
        map.put(io.sentry.rrweb.c.class, new c.a());
        map.put(io.sentry.rrweb.e.class, new e.a());
        map.put(io.sentry.rrweb.f.class, new f.a());
        map.put(io.sentry.rrweb.g.class, new g.a());
        map.put(io.sentry.rrweb.i.class, new i.a());
        map.put(io.sentry.rrweb.j.class, new j.a());
        map.put(io.sentry.protocol.q.class, new q.a());
        map.put(io.sentry.protocol.r.class, new r.a());
        map.put(v5.class, new v5.a());
        map.put(v6.class, new v6.a());
        map.put(w6.class, new w6.a());
        map.put(io.sentry.protocol.s.class, new s.a());
        map.put(f7.class, new f7.a());
        map.put(g7.class, new g7.a());
        map.put(h7.class, new h7.a());
        map.put(k7.class, new k7.a());
        map.put(io.sentry.protocol.y.class, new y.a());
        map.put(io.sentry.protocol.z.class, new z.a());
        map.put(w7.class, new w7.a());
        map.put(io.sentry.protocol.a0.class, new a0.a());
        map.put(io.sentry.protocol.b0.class, new b0.a());
        map.put(io.sentry.protocol.c0.class, new c0.a());
        map.put(l5.class, new l5.a());
        map.put(io.sentry.protocol.d0.class, new d0.a());
        map.put(io.sentry.protocol.e0.class, new e0.a());
        map.put(k8.class, new k8.a());
        map.put(p8.class, new p8.a());
        map.put(u8.class, new u8.a());
        map.put(w8.class, new w8.a());
        map.put(io.sentry.protocol.i0.class, new i0.a());
        map.put(io.sentry.protocol.i.class, new i.a());
        map.put(i9.class, new i9.a());
        map.put(io.sentry.clientreport.c.class, new c.a());
        map.put(io.sentry.protocol.k0.class, new k0.a());
        map.put(io.sentry.protocol.j0.class, new j0.a());
    }

    private boolean g(Class cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    private String h(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        b2 b2Var = new b2(stringWriter, this.f83428a.getMaxDepth());
        if (z10) {
            b2Var.h("\t");
        }
        b2Var.j(this.f83428a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.h1
    public void a(Object obj, Writer writer) throws IOException {
        io.sentry.util.w.c(obj, "The entity is required.");
        io.sentry.util.w.c(writer, "The Writer object is required.");
        ILogger logger = this.f83428a.getLogger();
        g7 g7Var = g7.DEBUG;
        if (logger.d(g7Var)) {
            this.f83428a.getLogger().c(g7Var, "Serializing object: %s", h(obj, this.f83428a.isEnablePrettySerializationOutput()));
        }
        new b2(writer, this.f83428a.getMaxDepth()).j(this.f83428a.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.h1
    public void b(u5 u5Var, OutputStream outputStream) throws IOException {
        io.sentry.util.w.c(u5Var, "The SentryEnvelope object is required.");
        io.sentry.util.w.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f83427c));
        try {
            u5Var.b().serialize(new b2(bufferedWriter, this.f83428a.getMaxDepth()), this.f83428a.getLogger());
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            for (u6 u6Var : u5Var.c()) {
                try {
                    byte[] bArrI = u6Var.I();
                    u6Var.J().serialize(new b2(bufferedWriter, this.f83428a.getMaxDepth()), this.f83428a.getLogger());
                    bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                    bufferedWriter.flush();
                    outputStream.write(bArrI);
                    bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                } catch (Exception e10) {
                    this.f83428a.getLogger().a(g7.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.h1
    public Object c(Reader reader, Class cls) {
        Object objP0;
        try {
            z1 z1Var = new z1(reader);
            try {
                t1 t1Var = (t1) this.f83429b.get(cls);
                if (t1Var != null) {
                    objP0 = cls.cast(t1Var.a(z1Var, this.f83428a.getLogger()));
                } else {
                    if (!g(cls)) {
                        z1Var.close();
                        return null;
                    }
                    objP0 = z1Var.p0();
                }
                z1Var.close();
                return objP0;
            } finally {
            }
        } catch (Exception e10) {
            this.f83428a.getLogger().a(g7.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.h1
    public Object d(Reader reader, Class cls, t1 t1Var) {
        try {
            z1 z1Var = new z1(reader);
            try {
                Object objP0 = (!Collection.class.isAssignableFrom(cls) || t1Var == null) ? z1Var.p0() : z1Var.P(this.f83428a.getLogger(), t1Var);
                z1Var.close();
                return objP0;
            } finally {
            }
        } catch (Throwable th2) {
            this.f83428a.getLogger().a(g7.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.h1
    public u5 e(InputStream inputStream) {
        io.sentry.util.w.c(inputStream, "The InputStream object is required.");
        try {
            return this.f83428a.getEnvelopeReader().a(inputStream);
        } catch (IOException e10) {
            this.f83428a.getLogger().a(g7.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.h1
    public String f(Map map) {
        return h(map, false);
    }
}
