package io.sentry;

import io.sentry.n5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w7 extends n5 implements d2 {
    private Map A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private File f84426q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f84430u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Date f84432w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private io.sentry.protocol.x f84429t = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f84427r = "replay_event";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f84428s = b.SESSION;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f84434y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f84435z = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f84433x = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Date f84431v = l.d();

    public static final class a implements t1 {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.w7 a(io.sentry.m3 r18, io.sentry.ILogger r19) {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.w7.a.a(io.sentry.m3, io.sentry.ILogger):io.sentry.w7");
        }
    }

    public enum b implements d2 {
        SESSION,
        BUFFER;

        public static final class a implements t1 {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(m3 m3Var, ILogger iLogger) {
                return b.valueOf(m3Var.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.d2
        public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
            n3Var.a(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w7.class == obj.getClass()) {
            w7 w7Var = (w7) obj;
            if (this.f84430u == w7Var.f84430u && io.sentry.util.w.a(this.f84427r, w7Var.f84427r) && this.f84428s == w7Var.f84428s && io.sentry.util.w.a(this.f84429t, w7Var.f84429t) && io.sentry.util.w.a(this.f84433x, w7Var.f84433x) && io.sentry.util.w.a(this.f84434y, w7Var.f84434y) && io.sentry.util.w.a(this.f84435z, w7Var.f84435z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f84427r, this.f84428s, this.f84429t, Integer.valueOf(this.f84430u), this.f84433x, this.f84434y, this.f84435z);
    }

    public Date i0() {
        return this.f84431v;
    }

    public File j0() {
        return this.f84426q;
    }

    public void k0(List list) {
        this.f84434y = list;
    }

    public void l0(io.sentry.protocol.x xVar) {
        this.f84429t = xVar;
    }

    public void m0(Date date) {
        this.f84432w = date;
    }

    public void n0(b bVar) {
        this.f84428s = bVar;
    }

    public void o0(int i10) {
        this.f84430u = i10;
    }

    public void p0(Date date) {
        this.f84431v = date;
    }

    public void q0(List list) {
        this.f84435z = list;
    }

    public void r0(String str) {
        this.f84427r = str;
    }

    public void s0(Map map) {
        this.A = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("type").a(this.f84427r);
        n3Var.e("replay_type").j(iLogger, this.f84428s);
        n3Var.e("segment_id").b(this.f84430u);
        n3Var.e("timestamp").j(iLogger, this.f84431v);
        if (this.f84429t != null) {
            n3Var.e("replay_id").j(iLogger, this.f84429t);
        }
        if (this.f84432w != null) {
            n3Var.e("replay_start_timestamp").j(iLogger, this.f84432w);
        }
        if (this.f84433x != null) {
            n3Var.e("urls").j(iLogger, this.f84433x);
        }
        if (this.f84434y != null) {
            n3Var.e("error_ids").j(iLogger, this.f84434y);
        }
        if (this.f84435z != null) {
            n3Var.e("trace_ids").j(iLogger, this.f84435z);
        }
        new n5.b().a(this, n3Var, iLogger);
        Map map = this.A;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.A.get(str));
            }
        }
        n3Var.endObject();
    }

    public void t0(List list) {
        this.f84433x = list;
    }

    public void u0(File file) {
        this.f84426q = file;
    }
}
