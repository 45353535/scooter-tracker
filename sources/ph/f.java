package ph;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import ph.h;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Closeable, AutoCloseable {
    public static final b D = new b(null);
    private static final m E;
    private final ph.j A;
    private final d B;
    private final Set C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f98407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f98408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f98409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f98411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f98412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lh.e f98414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lh.d f98415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final lh.d f98416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final lh.d f98417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ph.l f98418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f98419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f98420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f98421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f98422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f98423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f98424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m f98425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m f98426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f98427v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f98428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f98429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f98430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Socket f98431z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f98432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final lh.e f98433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f98434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f98435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public vh.g f98436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public vh.f f98437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f98438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ph.l f98439h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f98440i;

        public a(boolean z10, lh.e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f98432a = z10;
            this.f98433b = taskRunner;
            this.f98438g = c.f98442b;
            this.f98439h = ph.l.f98544b;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f98432a;
        }

        public final String c() {
            String str = this.f98435d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final c d() {
            return this.f98438g;
        }

        public final int e() {
            return this.f98440i;
        }

        public final ph.l f() {
            return this.f98439h;
        }

        public final vh.f g() {
            vh.f fVar = this.f98437f;
            if (fVar != null) {
                return fVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f98434c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final vh.g i() {
            vh.g gVar = this.f98436e;
            if (gVar != null) {
                return gVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final lh.e j() {
            return this.f98433b;
        }

        public final a k(c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f98438g = listener;
            return this;
        }

        public final a l(int i10) {
            this.f98440i = i10;
            return this;
        }

        public final void m(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f98435d = str;
        }

        public final void n(vh.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.f98437f = fVar;
        }

        public final void o(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f98434c = socket;
        }

        public final void p(vh.g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            this.f98436e = gVar;
        }

        public final a q(Socket socket, String peerName, vh.g source, vh.f sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            o(socket);
            if (this.f98432a) {
                str = ih.d.f74844i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return f.E;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f98441a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f98442b = new a();

        public static final class a extends c {
            a() {
            }

            @Override // ph.f.c
            public void b(ph.i stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.d(ph.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void a(f connection, m settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void b(ph.i iVar);
    }

    public final class d implements h.c, Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ph.h f98443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f98444c;

        public static final class a extends lh.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f98445e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f98446f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, f fVar, Ref$ObjectRef ref$ObjectRef) {
                super(str, z10);
                this.f98445e = fVar;
                this.f98446f = ref$ObjectRef;
            }

            @Override // lh.a
            public long f() {
                this.f98445e.t0().a(this.f98445e, (m) this.f98446f.f93280b);
                return -1L;
            }
        }

        public static final class b extends lh.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f98447e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ph.i f98448f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, f fVar, ph.i iVar) {
                super(str, z10);
                this.f98447e = fVar;
                this.f98448f = iVar;
            }

            @Override // lh.a
            public long f() {
                try {
                    this.f98447e.t0().b(this.f98448f);
                    return -1L;
                } catch (IOException e10) {
                    rh.h.f99497a.g().k("Http2Connection.Listener failure for " + this.f98447e.r0(), 4, e10);
                    try {
                        this.f98448f.d(ph.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends lh.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f98449e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f98450f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f98451g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, f fVar, int i10, int i11) {
                super(str, z10);
                this.f98449e = fVar;
                this.f98450f = i10;
                this.f98451g = i11;
            }

            @Override // lh.a
            public long f() {
                this.f98449e.V0(true, this.f98450f, this.f98451g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: ph.f$d$d, reason: collision with other inner class name */
        public static final class C1163d extends lh.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f98452e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f98453f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f98454g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1163d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f98452e = dVar;
                this.f98453f = z11;
                this.f98454g = mVar;
            }

            @Override // lh.a
            public long f() {
                this.f98452e.e(this.f98453f, this.f98454g);
                return -1L;
            }
        }

        public d(f fVar, ph.h reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f98444c = fVar;
            this.f98443b = reader;
        }

        @Override // ph.h.c
        public void a(boolean z10, int i10, vh.g source, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f98444c.K0(i10)) {
                this.f98444c.G0(i10, source, i11, z10);
                return;
            }
            ph.i iVarZ0 = this.f98444c.z0(i10);
            if (iVarZ0 == null) {
                this.f98444c.X0(i10, ph.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f98444c.S0(j10);
                source.skip(j10);
                return;
            }
            iVarZ0.w(source, i11);
            if (z10) {
                iVarZ0.x(ih.d.f74837b, true);
            }
        }

        @Override // ph.h.c
        public void ackSettings() {
        }

        @Override // ph.h.c
        public void b(int i10, ph.b errorCode, vh.h debugData) {
            int i11;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.K();
            f fVar = this.f98444c;
            synchronized (fVar) {
                array = fVar.A0().values().toArray(new ph.i[0]);
                fVar.f98413h = true;
                Unit unit = Unit.f93236a;
            }
            for (ph.i iVar : (ph.i[]) array) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(ph.b.REFUSED_STREAM);
                    this.f98444c.L0(iVar.j());
                }
            }
        }

        @Override // ph.h.c
        public void c(boolean z10, m settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f98444c.f98415j.i(new C1163d(this.f98444c.r0() + " applyAndAckSettings", true, this, z10, settings), 0L);
        }

        @Override // ph.h.c
        public void d(int i10, ph.b errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f98444c.K0(i10)) {
                this.f98444c.J0(i10, errorCode);
                return;
            }
            ph.i iVarL0 = this.f98444c.L0(i10);
            if (iVarL0 != null) {
                iVarL0.y(errorCode);
            }
        }

        public final void e(boolean z10, m settings) {
            long jC;
            int i10;
            ph.i[] iVarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ph.j jVarC0 = this.f98444c.C0();
            f fVar = this.f98444c;
            synchronized (jVarC0) {
                synchronized (fVar) {
                    try {
                        m mVarY0 = fVar.y0();
                        if (!z10) {
                            m mVar = new m();
                            mVar.g(mVarY0);
                            mVar.g(settings);
                            settings = mVar;
                        }
                        ref$ObjectRef.f93280b = settings;
                        jC = ((long) settings.c()) - ((long) mVarY0.c());
                        iVarArr = (jC == 0 || fVar.A0().isEmpty()) ? null : (ph.i[]) fVar.A0().values().toArray(new ph.i[0]);
                        fVar.O0((m) ref$ObjectRef.f93280b);
                        fVar.f98417l.i(new a(fVar.r0() + " onSettings", true, fVar, ref$ObjectRef), 0L);
                        Unit unit = Unit.f93236a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    fVar.C0().c((m) ref$ObjectRef.f93280b);
                } catch (IOException e10) {
                    fVar.i0(e10);
                }
                Unit unit2 = Unit.f93236a;
            }
            if (iVarArr != null) {
                for (ph.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jC);
                        Unit unit3 = Unit.f93236a;
                    }
                }
            }
        }

        public void f() throws Throwable {
            ph.b bVar = ph.b.INTERNAL_ERROR;
            try {
                try {
                    this.f98443b.o(this);
                    while (this.f98443b.n(false, this)) {
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    this.f98444c.e0(bVar, bVar, null);
                    ih.d.m(this.f98443b);
                    throw th;
                }
                try {
                    this.f98444c.e0(ph.b.NO_ERROR, ph.b.CANCEL, null);
                    ih.d.m(this.f98443b);
                } catch (IOException e11) {
                    e = e11;
                    ph.b bVar2 = ph.b.PROTOCOL_ERROR;
                    this.f98444c.e0(bVar2, bVar2, e);
                    ih.d.m(this.f98443b);
                }
            } catch (Throwable th3) {
                th = th3;
                this.f98444c.e0(bVar, bVar, null);
                ih.d.m(this.f98443b);
                throw th;
            }
        }

        @Override // ph.h.c
        public void headers(boolean z10, int i10, int i11, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f98444c.K0(i10)) {
                this.f98444c.H0(i10, headerBlock, z10);
                return;
            }
            f fVar = this.f98444c;
            synchronized (fVar) {
                ph.i iVarZ0 = fVar.z0(i10);
                if (iVarZ0 != null) {
                    Unit unit = Unit.f93236a;
                    iVarZ0.x(ih.d.Q(headerBlock), z10);
                    return;
                }
                if (fVar.f98413h) {
                    return;
                }
                if (i10 <= fVar.s0()) {
                    return;
                }
                if (i10 % 2 == fVar.u0() % 2) {
                    return;
                }
                ph.i iVar = new ph.i(i10, fVar, false, z10, ih.d.Q(headerBlock));
                fVar.N0(i10);
                fVar.A0().put(Integer.valueOf(i10), iVar);
                fVar.f98414i.i().i(new b(fVar.r0() + '[' + i10 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            f();
            return Unit.f93236a;
        }

        @Override // ph.h.c
        public void ping(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f98444c.f98415j.i(new c(this.f98444c.r0() + " ping", true, this.f98444c, i10, i11), 0L);
                return;
            }
            f fVar = this.f98444c;
            synchronized (fVar) {
                try {
                    if (i10 == 1) {
                        fVar.f98420o++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f98423r++;
                            Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        Unit unit = Unit.f93236a;
                    } else {
                        fVar.f98422q++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ph.h.c
        public void priority(int i10, int i11, int i12, boolean z10) {
        }

        @Override // ph.h.c
        public void pushPromise(int i10, int i11, List requestHeaders) throws Throwable {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f98444c.I0(i11, requestHeaders);
        }

        @Override // ph.h.c
        public void windowUpdate(int i10, long j10) {
            if (i10 == 0) {
                f fVar = this.f98444c;
                synchronized (fVar) {
                    fVar.f98430y = fVar.B0() + j10;
                    Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    Unit unit = Unit.f93236a;
                }
                return;
            }
            ph.i iVarZ0 = this.f98444c.z0(i10);
            if (iVarZ0 != null) {
                synchronized (iVarZ0) {
                    iVarZ0.a(j10);
                    Unit unit2 = Unit.f93236a;
                }
            }
        }
    }

    public static final class e extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f98456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ vh.e f98457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f98458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f98459i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, f fVar, int i10, vh.e eVar, int i11, boolean z11) {
            super(str, z10);
            this.f98455e = fVar;
            this.f98456f = i10;
            this.f98457g = eVar;
            this.f98458h = i11;
            this.f98459i = z11;
        }

        @Override // lh.a
        public long f() {
            try {
                boolean zA = this.f98455e.f98418m.a(this.f98456f, this.f98457g, this.f98458h, this.f98459i);
                if (zA) {
                    this.f98455e.C0().M(this.f98456f, ph.b.CANCEL);
                }
                if (!zA && !this.f98459i) {
                    return -1L;
                }
                synchronized (this.f98455e) {
                    this.f98455e.C.remove(Integer.valueOf(this.f98456f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: ph.f$f, reason: collision with other inner class name */
    public static final class C1164f extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f98461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f98462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f98463h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1164f(String str, boolean z10, f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f98460e = fVar;
            this.f98461f = i10;
            this.f98462g = list;
            this.f98463h = z11;
        }

        @Override // lh.a
        public long f() {
            boolean zOnHeaders = this.f98460e.f98418m.onHeaders(this.f98461f, this.f98462g, this.f98463h);
            if (zOnHeaders) {
                try {
                    this.f98460e.C0().M(this.f98461f, ph.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zOnHeaders && !this.f98463h) {
                return -1L;
            }
            synchronized (this.f98460e) {
                this.f98460e.C.remove(Integer.valueOf(this.f98461f));
            }
            return -1L;
        }
    }

    public static final class g extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f98465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f98466g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, f fVar, int i10, List list) {
            super(str, z10);
            this.f98464e = fVar;
            this.f98465f = i10;
            this.f98466g = list;
        }

        @Override // lh.a
        public long f() {
            if (!this.f98464e.f98418m.onRequest(this.f98465f, this.f98466g)) {
                return -1L;
            }
            try {
                this.f98464e.C0().M(this.f98465f, ph.b.CANCEL);
                synchronized (this.f98464e) {
                    this.f98464e.C.remove(Integer.valueOf(this.f98465f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class h extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f98468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ph.b f98469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, f fVar, int i10, ph.b bVar) {
            super(str, z10);
            this.f98467e = fVar;
            this.f98468f = i10;
            this.f98469g = bVar;
        }

        @Override // lh.a
        public long f() {
            this.f98467e.f98418m.b(this.f98468f, this.f98469g);
            synchronized (this.f98467e) {
                this.f98467e.C.remove(Integer.valueOf(this.f98468f));
                Unit unit = Unit.f93236a;
            }
            return -1L;
        }
    }

    public static final class i extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98470e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, f fVar) {
            super(str, z10);
            this.f98470e = fVar;
        }

        @Override // lh.a
        public long f() {
            this.f98470e.V0(false, 2, 0);
            return -1L;
        }
    }

    public static final class j extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f98472f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j10) {
            super(str, false, 2, null);
            this.f98471e = fVar;
            this.f98472f = j10;
        }

        @Override // lh.a
        public long f() {
            boolean z10;
            synchronized (this.f98471e) {
                if (this.f98471e.f98420o < this.f98471e.f98419n) {
                    z10 = true;
                } else {
                    this.f98471e.f98419n++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f98471e.i0(null);
                return -1L;
            }
            this.f98471e.V0(false, 1, 0);
            return this.f98472f;
        }
    }

    public static final class k extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f98474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ph.b f98475g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, f fVar, int i10, ph.b bVar) {
            super(str, z10);
            this.f98473e = fVar;
            this.f98474f = i10;
            this.f98475g = bVar;
        }

        @Override // lh.a
        public long f() {
            try {
                this.f98473e.W0(this.f98474f, this.f98475g);
                return -1L;
            } catch (IOException e10) {
                this.f98473e.i0(e10);
                return -1L;
            }
        }
    }

    public static final class l extends lh.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f98476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f98477f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f98478g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, f fVar, int i10, long j10) {
            super(str, z10);
            this.f98476e = fVar;
            this.f98477f = i10;
            this.f98478g = j10;
        }

        @Override // lh.a
        public long f() {
            try {
                this.f98476e.C0().U(this.f98477f, this.f98478g);
                return -1L;
            } catch (IOException e10) {
                this.f98476e.i0(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        E = mVar;
    }

    public f(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zB = builder.b();
        this.f98407b = zB;
        this.f98408c = builder.d();
        this.f98409d = new LinkedHashMap();
        String strC = builder.c();
        this.f98410e = strC;
        this.f98412g = builder.b() ? 3 : 2;
        lh.e eVarJ = builder.j();
        this.f98414i = eVarJ;
        lh.d dVarI = eVarJ.i();
        this.f98415j = dVarI;
        this.f98416k = eVarJ.i();
        this.f98417l = eVarJ.i();
        this.f98418m = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.h(7, 16777216);
        }
        this.f98425t = mVar;
        this.f98426u = E;
        this.f98430y = r2.c();
        this.f98431z = builder.h();
        this.A = new ph.j(builder.g(), zB);
        this.B = new d(this, new ph.h(builder.i(), zB));
        this.C = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            dVarI.i(new j(strC + " ping", this, nanos), nanos);
        }
    }

    private final ph.i E0(int i10, List list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = true;
        boolean z12 = !z10;
        synchronized (this.A) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f98412g > 1073741823) {
                                try {
                                    P0(ph.b.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.f98413h) {
                                    throw new ph.a();
                                }
                                int i11 = this.f98412g;
                                this.f98412g = i11 + 2;
                                ph.i iVar = new ph.i(i11, this, z12, false, null);
                                if (z10 && this.f98429x < this.f98430y && iVar.r() < iVar.q()) {
                                    z11 = false;
                                }
                                if (iVar.u()) {
                                    this.f98409d.put(Integer.valueOf(i11), iVar);
                                }
                                Unit unit = Unit.f93236a;
                                if (i10 == 0) {
                                    this.A.s(z12, i11, list);
                                } else {
                                    if (this.f98407b) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.A.z(i10, i11, list);
                                }
                                if (z11) {
                                    this.A.flush();
                                }
                                return iVar;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public static /* synthetic */ void R0(f fVar, boolean z10, lh.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = lh.e.f94307i;
        }
        fVar.Q0(z10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(IOException iOException) {
        ph.b bVar = ph.b.PROTOCOL_ERROR;
        e0(bVar, bVar, iOException);
    }

    public final Map A0() {
        return this.f98409d;
    }

    public final long B0() {
        return this.f98430y;
    }

    public final ph.j C0() {
        return this.A;
    }

    public final synchronized boolean D0(long j10) {
        if (this.f98413h) {
            return false;
        }
        if (this.f98422q < this.f98421p) {
            if (j10 >= this.f98424s) {
                return false;
            }
        }
        return true;
    }

    public final ph.i F0(List requestHeaders, boolean z10) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return E0(0, requestHeaders, z10);
    }

    public final void G0(int i10, vh.g source, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        vh.e eVar = new vh.e();
        long j10 = i11;
        source.require(j10);
        source.read(eVar, j10);
        this.f98416k.i(new e(this.f98410e + '[' + i10 + "] onData", true, this, i10, eVar, i11, z10), 0L);
    }

    public final void H0(int i10, List requestHeaders, boolean z10) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f98416k.i(new C1164f(this.f98410e + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    public final void I0(int i10, List requestHeaders) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.C.contains(Integer.valueOf(i10))) {
                    this.C.add(Integer.valueOf(i10));
                    this.f98416k.i(new g(this.f98410e + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
                    return;
                }
                try {
                    X0(i10, ph.b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
            throw th2;
        }
    }

    public final void J0(int i10, ph.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f98416k.i(new h(this.f98410e + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    public final boolean K0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized ph.i L0(int i10) {
        ph.i iVar;
        iVar = (ph.i) this.f98409d.remove(Integer.valueOf(i10));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVar;
    }

    public final void M0() {
        synchronized (this) {
            long j10 = this.f98422q;
            long j11 = this.f98421p;
            if (j10 < j11) {
                return;
            }
            this.f98421p = j11 + 1;
            this.f98424s = System.nanoTime() + ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            Unit unit = Unit.f93236a;
            this.f98415j.i(new i(this.f98410e + " ping", true, this), 0L);
        }
    }

    public final void N0(int i10) {
        this.f98411f = i10;
    }

    public final void O0(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f98426u = mVar;
    }

    public final void P0(ph.b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.A) {
            t0 t0Var = new t0();
            synchronized (this) {
                if (this.f98413h) {
                    return;
                }
                this.f98413h = true;
                int i10 = this.f98411f;
                t0Var.f93331b = i10;
                Unit unit = Unit.f93236a;
                this.A.q(i10, statusCode, ih.d.f74836a);
            }
        }
    }

    public final void Q0(boolean z10, lh.e taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z10) {
            this.A.m();
            this.A.R(this.f98425t);
            if (this.f98425t.c() != 65535) {
                this.A.U(0, r5 - 65535);
            }
        }
        taskRunner.i().i(new lh.c(this.f98410e, true, this.B), 0L);
    }

    public final synchronized void S0(long j10) {
        long j11 = this.f98427v + j10;
        this.f98427v = j11;
        long j12 = j11 - this.f98428w;
        if (j12 >= this.f98425t.c() / 2) {
            Y0(0, j12);
            this.f98428w += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.A.w());
        r6 = r2;
        r8.f98429x += r6;
        r4 = kotlin.Unit.f93236a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0(int r9, boolean r10, vh.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            ph.j r12 = r8.A
            r12.n(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f98429x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f98430y     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f98409d     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            ph.j r4 = r8.A     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.w()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f98429x     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f98429x = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            ph.j r4 = r8.A
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.n(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.f.T0(int, boolean, vh.e, long):void");
    }

    public final void U0(int i10, boolean z10, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.A.s(z10, i10, alternating);
    }

    public final void V0(boolean z10, int i10, int i11) {
        try {
            this.A.y(z10, i10, i11);
        } catch (IOException e10) {
            i0(e10);
        }
    }

    public final void W0(int i10, ph.b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.A.M(i10, statusCode);
    }

    public final void X0(int i10, ph.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f98415j.i(new k(this.f98410e + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    public final void Y0(int i10, long j10) {
        this.f98415j.i(new l(this.f98410e + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0(ph.b.NO_ERROR, ph.b.CANCEL, null);
    }

    public final void e0(ph.b connectionCode, ph.b streamCode, IOException iOException) {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (ih.d.f74843h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            P0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f98409d.isEmpty()) {
                    array = null;
                } else {
                    array = this.f98409d.values().toArray(new ph.i[0]);
                    this.f98409d.clear();
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ph.i[] iVarArr = (ph.i[]) array;
        if (iVarArr != null) {
            for (ph.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f98431z.close();
        } catch (IOException unused4) {
        }
        this.f98415j.n();
        this.f98416k.n();
        this.f98417l.n();
    }

    public final void flush() {
        this.A.flush();
    }

    public final boolean n0() {
        return this.f98407b;
    }

    public final String r0() {
        return this.f98410e;
    }

    public final int s0() {
        return this.f98411f;
    }

    public final c t0() {
        return this.f98408c;
    }

    public final int u0() {
        return this.f98412g;
    }

    public final m x0() {
        return this.f98425t;
    }

    public final m y0() {
        return this.f98426u;
    }

    public final synchronized ph.i z0(int i10) {
        return (ph.i) this.f98409d.get(Integer.valueOf(i10));
    }
}
