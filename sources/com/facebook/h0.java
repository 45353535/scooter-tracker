package com.facebook;

import com.facebook.z;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends FilterOutputStream implements i0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f19827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j0 f19833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(OutputStream out, z requests, Map progressMap, long j10) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.f19827b = requests;
        this.f19828c = progressMap;
        this.f19829d = j10;
        this.f19830e = s.y();
    }

    private final void f(long j10) {
        j0 j0Var = this.f19833h;
        if (j0Var != null) {
            j0Var.a(j10);
        }
        long j11 = this.f19831f + j10;
        this.f19831f = j11;
        if (j11 >= this.f19832g + this.f19830e || j11 >= this.f19829d) {
            m();
        }
    }

    private final void m() {
        if (this.f19831f > this.f19832g) {
            for (z.a aVar : this.f19827b.o()) {
            }
            this.f19832g = this.f19831f;
        }
    }

    @Override // com.facebook.i0
    public void c(GraphRequest graphRequest) {
        this.f19833h = graphRequest != null ? (j0) this.f19828c.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator it = this.f19828c.values().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).c();
        }
        m();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        f(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        f(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        f(1L);
    }
}
