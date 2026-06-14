package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends OutputStream implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f19821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19822c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GraphRequest f19823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j0 f19824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19825f;

    public g0(Handler handler) {
        this.f19821b = handler;
    }

    @Override // com.facebook.i0
    public void c(GraphRequest graphRequest) {
        this.f19823d = graphRequest;
        this.f19824e = graphRequest != null ? (j0) this.f19822c.get(graphRequest) : null;
    }

    public final void f(long j10) {
        GraphRequest graphRequest = this.f19823d;
        if (graphRequest == null) {
            return;
        }
        if (this.f19824e == null) {
            j0 j0Var = new j0(this.f19821b, graphRequest);
            this.f19824e = j0Var;
            this.f19822c.put(graphRequest, j0Var);
        }
        j0 j0Var2 = this.f19824e;
        if (j0Var2 != null) {
            j0Var2.b(j10);
        }
        this.f19825f += (int) j10;
    }

    public final int m() {
        return this.f19825f;
    }

    public final Map n() {
        return this.f19822c;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        f(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        f(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        f(1L);
    }
}
