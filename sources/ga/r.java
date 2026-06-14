package ga;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MimeTypes;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import ga.f;
import ga.f0;
import ga.h1;
import ga.r;
import ga.v;
import ga.x0;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import io.bidmachine.media3.exoplayer.hls.HlsMediaSource;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lb.t;
import n9.r;
import oa.m0;
import s9.g;
import s9.l;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f72429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g.a f72430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t.a f72431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0.a f72432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ka.m f72433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f72434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f72435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f72436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f72437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f72438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f72439k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final oa.x f72440a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g.a f72443d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f72445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f72446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private z9.z f72447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ka.m f72448i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f72441b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f72442c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f72444e = true;

        public a(oa.x xVar, t.a aVar) {
            this.f72440a = xVar;
            this.f72445f = aVar;
        }

        public static /* synthetic */ f0.a e(a aVar, g.a aVar2) {
            return new x0.b(aVar2, aVar.f72440a);
        }

        private Supplier g(int i10) {
            Supplier supplier;
            Supplier supplier2;
            Supplier supplier3 = (Supplier) this.f72441b.get(Integer.valueOf(i10));
            if (supplier3 != null) {
                return supplier3;
            }
            final g.a aVar = (g.a) q9.a.e(this.f72443d);
            if (i10 == 0) {
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(f0.a.class);
                supplier = new Supplier() { // from class: ga.m
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return r.n(clsAsSubclass, aVar);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("io.bidmachine.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.a.class);
                supplier = new Supplier() { // from class: ga.n
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return r.n(clsAsSubclass2, aVar);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("io.bidmachine.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.a.class);
                        supplier2 = new Supplier() { // from class: ga.p
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return r.m(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        supplier2 = new Supplier() { // from class: ga.q
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return r.a.e(this.f72409b, aVar);
                            }
                        };
                    }
                    this.f72441b.put(Integer.valueOf(i10), supplier2);
                    return supplier2;
                }
                final Class clsAsSubclass4 = HlsMediaSource.Factory.class.asSubclass(f0.a.class);
                supplier = new Supplier() { // from class: ga.o
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return r.n(clsAsSubclass4, aVar);
                    }
                };
            }
            supplier2 = supplier;
            this.f72441b.put(Integer.valueOf(i10), supplier2);
            return supplier2;
        }

        public f0.a f(int i10) {
            f0.a aVar = (f0.a) this.f72442c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            f0.a aVar2 = (f0.a) g(i10).get();
            z9.z zVar = this.f72447h;
            if (zVar != null) {
                aVar2.d(zVar);
            }
            ka.m mVar = this.f72448i;
            if (mVar != null) {
                aVar2.c(mVar);
            }
            aVar2.a(this.f72445f);
            aVar2.experimentalParseSubtitlesDuringExtraction(this.f72444e);
            aVar2.b(this.f72446g);
            this.f72442c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void h(int i10) {
            this.f72446g = i10;
            this.f72440a.b(i10);
        }

        public void i(g.a aVar) {
            if (aVar != this.f72443d) {
                this.f72443d = aVar;
                this.f72441b.clear();
                this.f72442c.clear();
            }
        }

        public void j(z9.z zVar) {
            this.f72447h = zVar;
            Iterator it = this.f72442c.values().iterator();
            while (it.hasNext()) {
                ((f0.a) it.next()).d(zVar);
            }
        }

        public void k(int i10) {
            oa.x xVar = this.f72440a;
            if (xVar instanceof oa.m) {
                ((oa.m) xVar).j(i10);
            }
        }

        public void l(ka.m mVar) {
            this.f72448i = mVar;
            Iterator it = this.f72442c.values().iterator();
            while (it.hasNext()) {
                ((f0.a) it.next()).c(mVar);
            }
        }

        public void m(boolean z10) {
            this.f72444e = z10;
            this.f72440a.experimentalSetTextTrackTranscodingEnabled(z10);
            Iterator it = this.f72442c.values().iterator();
            while (it.hasNext()) {
                ((f0.a) it.next()).experimentalParseSubtitlesDuringExtraction(z10);
            }
        }

        public void n(t.a aVar) {
            this.f72445f = aVar;
            this.f72440a.a(aVar);
            Iterator it = this.f72442c.values().iterator();
            while (it.hasNext()) {
                ((f0.a) it.next()).a(aVar);
            }
        }
    }

    public r(Context context, oa.x xVar) {
        this(new l.a(context), xVar);
    }

    public static /* synthetic */ oa.r[] f(r rVar, io.bidmachine.media3.common.a aVar) {
        return new oa.r[]{rVar.f72431c.a(aVar) ? new lb.o(rVar.f72431c.c(aVar), null) : new b(aVar)};
    }

    private static f0 k(n9.r rVar, f0 f0Var) {
        r.d dVar = rVar.f95459f;
        return (dVar.f95484b == 0 && dVar.f95486d == Long.MIN_VALUE && !dVar.f95488f) ? f0Var : new f.b(f0Var).m(rVar.f95459f.f95484b).k(rVar.f95459f.f95486d).j(!rVar.f95459f.f95489g).i(rVar.f95459f.f95487e).l(rVar.f95459f.f95488f).h();
    }

    private f0 l(n9.r rVar, f0 f0Var) {
        q9.a.e(rVar.f95455b);
        rVar.f95455b.getClass();
        return f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f0.a m(Class cls) {
        try {
            return (f0.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f0.a n(Class cls, g.a aVar) {
        try {
            return (f0.a) cls.getConstructor(g.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ga.f0.a
    public f0 e(n9.r rVar) {
        q9.a.e(rVar.f95455b);
        String scheme = rVar.f95455b.f95547a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((f0.a) q9.a.e(this.f72432d)).e(rVar);
        }
        if (Objects.equals(rVar.f95455b.f95548b, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            long jP0 = q9.o0.P0(rVar.f95455b.f95555i);
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.e(null));
            return new v.b(jP0, null).e(rVar);
        }
        r.h hVar = rVar.f95455b;
        int iA0 = q9.o0.A0(hVar.f95547a, hVar.f95548b);
        if (rVar.f95455b.f95555i != -9223372036854775807L) {
            this.f72429a.k(1);
        }
        try {
            f0.a aVarF = this.f72429a.f(iA0);
            r.g.a aVarA = rVar.f95457d.a();
            if (rVar.f95457d.f95529a == -9223372036854775807L) {
                aVarA.k(this.f72434f);
            }
            if (rVar.f95457d.f95532d == -3.4028235E38f) {
                aVarA.j(this.f72437i);
            }
            if (rVar.f95457d.f95533e == -3.4028235E38f) {
                aVarA.h(this.f72438j);
            }
            if (rVar.f95457d.f95530b == -9223372036854775807L) {
                aVarA.i(this.f72435g);
            }
            if (rVar.f95457d.f95531c == -9223372036854775807L) {
                aVarA.g(this.f72436h);
            }
            r.g gVarF = aVarA.f();
            if (!gVarF.equals(rVar.f95457d)) {
                rVar = rVar.a().b(gVarF).a();
            }
            f0 f0VarE = aVarF.e(rVar);
            ImmutableList immutableList = ((r.h) q9.o0.i(rVar.f95455b)).f95552f;
            if (!immutableList.isEmpty()) {
                f0[] f0VarArr = new f0[immutableList.size() + 1];
                f0VarArr[0] = f0VarE;
                for (int i10 = 0; i10 < immutableList.size(); i10++) {
                    if (this.f72439k) {
                        final io.bidmachine.media3.common.a aVarN = new a.b().u0(((r.k) immutableList.get(i10)).f95574b).j0(((r.k) immutableList.get(i10)).f95575c).w0(((r.k) immutableList.get(i10)).f95576d).s0(((r.k) immutableList.get(i10)).f95577e).h0(((r.k) immutableList.get(i10)).f95578f).f0(((r.k) immutableList.get(i10)).f95579g).N();
                        x0.b bVar = new x0.b(this.f72430b, new oa.x() { // from class: ga.l
                            @Override // oa.x
                            public /* synthetic */ oa.x a(t.a aVar) {
                                return oa.w.d(this, aVar);
                            }

                            @Override // oa.x
                            public /* synthetic */ oa.x b(int i11) {
                                return oa.w.b(this, i11);
                            }

                            @Override // oa.x
                            public final oa.r[] createExtractors() {
                                return r.f(this.f72369b, aVarN);
                            }

                            @Override // oa.x
                            public /* synthetic */ oa.x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
                                return oa.w.c(this, z10);
                            }

                            @Override // oa.x
                            public /* synthetic */ oa.r[] createExtractors(Uri uri, Map map) {
                                return oa.w.a(this, uri, map);
                            }
                        });
                        if (this.f72431c.a(aVarN)) {
                            aVarN = aVarN.b().u0(MimeTypes.APPLICATION_MEDIA3_CUES).S(aVarN.f80561o).W(this.f72431c.b(aVarN)).N();
                        }
                        x0.b bVarH = bVar.h(0, aVarN);
                        ka.m mVar = this.f72433e;
                        if (mVar != null) {
                            bVarH.c(mVar);
                        }
                        f0VarArr[i10 + 1] = bVarH.e(n9.r.b(((r.k) immutableList.get(i10)).f95573a.toString()));
                    } else {
                        h1.b bVar2 = new h1.b(this.f72430b);
                        ka.m mVar2 = this.f72433e;
                        if (mVar2 != null) {
                            bVar2.b(mVar2);
                        }
                        f0VarArr[i10 + 1] = bVar2.a((r.k) immutableList.get(i10), -9223372036854775807L);
                    }
                }
                f0VarE = new q0(f0VarArr);
            }
            return l(rVar, k(rVar, f0VarE));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ga.f0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public r experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.f72439k = z10;
        this.f72429a.m(z10);
        return this;
    }

    @Override // ga.f0.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public r b(int i10) {
        this.f72429a.h(i10);
        return this;
    }

    @Override // ga.f0.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public r d(z9.z zVar) {
        this.f72429a.j((z9.z) q9.a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // ga.f0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public r c(ka.m mVar) {
        this.f72433e = (ka.m) q9.a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f72429a.l(mVar);
        return this;
    }

    @Override // ga.f0.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public r a(t.a aVar) {
        this.f72431c = (t.a) q9.a.e(aVar);
        this.f72429a.n(aVar);
        return this;
    }

    public r(g.a aVar, oa.x xVar) {
        this.f72430b = aVar;
        lb.h hVar = new lb.h();
        this.f72431c = hVar;
        a aVar2 = new a(xVar, hVar);
        this.f72429a = aVar2;
        aVar2.i(aVar);
        this.f72434f = -9223372036854775807L;
        this.f72435g = -9223372036854775807L;
        this.f72436h = -9223372036854775807L;
        this.f72437i = -3.4028235E38f;
        this.f72438j = -3.4028235E38f;
        this.f72439k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements oa.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.media3.common.a f72449a;

        public b(io.bidmachine.media3.common.a aVar) {
            this.f72449a = aVar;
        }

        @Override // oa.r
        public int a(oa.s sVar, oa.l0 l0Var) {
            return sVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // oa.r
        public void b(oa.t tVar) {
            oa.s0 s0VarTrack = tVar.track(0, 3);
            tVar.e(new m0.b(-9223372036854775807L));
            tVar.endTracks();
            s0VarTrack.f(this.f72449a.b().u0("text/x-unknown").S(this.f72449a.f80561o).N());
        }

        @Override // oa.r
        public boolean c(oa.s sVar) {
            return true;
        }

        @Override // oa.r
        public /* synthetic */ List getSniffFailureDetails() {
            return oa.q.a(this);
        }

        @Override // oa.r
        public /* synthetic */ oa.r getUnderlyingImplementation() {
            return oa.q.b(this);
        }

        @Override // oa.r
        public void release() {
        }

        @Override // oa.r
        public void seek(long j10, long j11) {
        }
    }
}
