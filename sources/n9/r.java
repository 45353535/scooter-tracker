package n9;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f95447i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f95448j = o0.C0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f95449k = o0.C0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f95450l = o0.C0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f95451m = o0.C0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f95452n = o0.C0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f95453o = o0.C0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f95455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f95456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f95457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f95458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f95459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f95460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f95461h;

    public static final class b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f95462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f95463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f95464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f95465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f95466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f95467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f95468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ImmutableList f95469h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f95470i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f95471j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private t f95472k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f95473l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f95474m;

        public r a() {
            h hVar;
            q9.a.g(this.f95466e.f95516b == null || this.f95466e.f95515a != null);
            Uri uri = this.f95463b;
            if (uri != null) {
                hVar = new h(uri, this.f95464c, this.f95466e.f95515a != null ? this.f95466e.i() : null, null, this.f95467f, this.f95468g, this.f95469h, this.f95470i, this.f95471j);
            } else {
                hVar = null;
            }
            String str = this.f95462a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f95465d.g();
            g gVarF = this.f95473l.f();
            t tVar = this.f95472k;
            if (tVar == null) {
                tVar = t.I;
            }
            return new r(str2, eVarG, hVar, gVarF, tVar, this.f95474m);
        }

        public c b(g gVar) {
            this.f95473l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f95462a = (String) q9.a.e(str);
            return this;
        }

        public c d(List list) {
            this.f95469h = ImmutableList.copyOf((Collection) list);
            return this;
        }

        public c e(Object obj) {
            this.f95470i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f95463b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f95465d = new d.a();
            this.f95466e = new f.a();
            this.f95467f = Collections.EMPTY_LIST;
            this.f95469h = ImmutableList.of();
            this.f95473l = new g.a();
            this.f95474m = i.f95556d;
            this.f95471j = -9223372036854775807L;
        }

        private c(r rVar) {
            f.a aVar;
            this();
            this.f95465d = rVar.f95459f.a();
            this.f95462a = rVar.f95454a;
            this.f95472k = rVar.f95458e;
            this.f95473l = rVar.f95457d.a();
            this.f95474m = rVar.f95461h;
            h hVar = rVar.f95455b;
            if (hVar != null) {
                this.f95468g = hVar.f95551e;
                this.f95464c = hVar.f95548b;
                this.f95463b = hVar.f95547a;
                this.f95467f = hVar.f95550d;
                this.f95469h = hVar.f95552f;
                this.f95470i = hVar.f95554h;
                f fVar = hVar.f95549c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f95466e = aVar;
                this.f95471j = hVar.f95555i;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f95475h = new a().f();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f95476i = o0.C0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f95477j = o0.C0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f95478k = o0.C0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95479l = o0.C0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f95480m = o0.C0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f95481n = o0.C0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f95482o = o0.C0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f95483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f95484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f95485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f95486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f95487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f95488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f95489g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f95490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f95491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f95492c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f95493d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f95494e;

            public d f() {
                return new d(this);
            }

            public e g() {
                return new e(this);
            }

            public a() {
                this.f95491b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f95490a = dVar.f95484b;
                this.f95491b = dVar.f95486d;
                this.f95492c = dVar.f95487e;
                this.f95493d = dVar.f95488f;
                this.f95494e = dVar.f95489g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f95484b == dVar.f95484b && this.f95486d == dVar.f95486d && this.f95487e == dVar.f95487e && this.f95488f == dVar.f95488f && this.f95489g == dVar.f95489g;
        }

        public int hashCode() {
            long j10 = this.f95484b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f95486d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f95487e ? 1 : 0)) * 31) + (this.f95488f ? 1 : 0)) * 31) + (this.f95489g ? 1 : 0);
        }

        private d(a aVar) {
            this.f95483a = o0.q1(aVar.f95490a);
            this.f95485c = o0.q1(aVar.f95491b);
            this.f95484b = aVar.f95490a;
            this.f95486d = aVar.f95491b;
            this.f95487e = aVar.f95492c;
            this.f95488f = aVar.f95493d;
            this.f95489g = aVar.f95494e;
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final e f95495p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95496l = o0.C0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f95497m = o0.C0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f95498n = o0.C0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f95499o = o0.C0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f95500p = o0.C0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f95501q = o0.C0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f95502r = o0.C0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f95503s = o0.C0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f95504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f95505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f95506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImmutableMap f95507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImmutableMap f95508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f95509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f95510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f95511h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImmutableList f95512i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImmutableList f95513j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f95514k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f95514k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f95504a.equals(fVar.f95504a) && Objects.equals(this.f95506c, fVar.f95506c) && Objects.equals(this.f95508e, fVar.f95508e) && this.f95509f == fVar.f95509f && this.f95511h == fVar.f95511h && this.f95510g == fVar.f95510g && this.f95513j.equals(fVar.f95513j) && Arrays.equals(this.f95514k, fVar.f95514k);
        }

        public int hashCode() {
            int iHashCode = this.f95504a.hashCode() * 31;
            Uri uri = this.f95506c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f95508e.hashCode()) * 31) + (this.f95509f ? 1 : 0)) * 31) + (this.f95511h ? 1 : 0)) * 31) + (this.f95510g ? 1 : 0)) * 31) + this.f95513j.hashCode()) * 31) + Arrays.hashCode(this.f95514k);
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f95515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f95516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ImmutableMap f95517c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f95518d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f95519e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f95520f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private ImmutableList f95521g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f95522h;

            public f i() {
                return new f(this);
            }

            private a() {
                this.f95517c = ImmutableMap.of();
                this.f95519e = true;
                this.f95521g = ImmutableList.of();
            }

            private a(f fVar) {
                this.f95515a = fVar.f95504a;
                this.f95516b = fVar.f95506c;
                this.f95517c = fVar.f95508e;
                this.f95518d = fVar.f95509f;
                this.f95519e = fVar.f95510g;
                this.f95520f = fVar.f95511h;
                this.f95521g = fVar.f95513j;
                this.f95522h = fVar.f95514k;
            }
        }

        private f(a aVar) {
            q9.a.g((aVar.f95520f && aVar.f95516b == null) ? false : true);
            UUID uuid = (UUID) q9.a.e(aVar.f95515a);
            this.f95504a = uuid;
            this.f95505b = uuid;
            this.f95506c = aVar.f95516b;
            this.f95507d = aVar.f95517c;
            this.f95508e = aVar.f95517c;
            this.f95509f = aVar.f95518d;
            this.f95511h = aVar.f95520f;
            this.f95510g = aVar.f95519e;
            this.f95512i = aVar.f95521g;
            this.f95513j = aVar.f95521g;
            this.f95514k = aVar.f95522h != null ? Arrays.copyOf(aVar.f95522h, aVar.f95522h.length) : null;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f95523f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f95524g = o0.C0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f95525h = o0.C0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f95526i = o0.C0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f95527j = o0.C0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f95528k = o0.C0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f95529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f95530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f95531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f95532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f95533e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f95534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f95535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f95536c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f95537d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f95538e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f95536c = j10;
                return this;
            }

            public a h(float f10) {
                this.f95538e = f10;
                return this;
            }

            public a i(long j10) {
                this.f95535b = j10;
                return this;
            }

            public a j(float f10) {
                this.f95537d = f10;
                return this;
            }

            public a k(long j10) {
                this.f95534a = j10;
                return this;
            }

            public a() {
                this.f95534a = -9223372036854775807L;
                this.f95535b = -9223372036854775807L;
                this.f95536c = -9223372036854775807L;
                this.f95537d = -3.4028235E38f;
                this.f95538e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f95534a = gVar.f95529a;
                this.f95535b = gVar.f95530b;
                this.f95536c = gVar.f95531c;
                this.f95537d = gVar.f95532d;
                this.f95538e = gVar.f95533e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f95529a == gVar.f95529a && this.f95530b == gVar.f95530b && this.f95531c == gVar.f95531c && this.f95532d == gVar.f95532d && this.f95533e == gVar.f95533e;
        }

        public int hashCode() {
            long j10 = this.f95529a;
            long j11 = this.f95530b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f95531c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f95532d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f95533e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f95534a, aVar.f95535b, aVar.f95536c, aVar.f95537d, aVar.f95538e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f95529a = j10;
            this.f95530b = j11;
            this.f95531c = j12;
            this.f95532d = f10;
            this.f95533e = f11;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f95539j = o0.C0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f95540k = o0.C0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95541l = o0.C0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f95542m = o0.C0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f95543n = o0.C0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f95544o = o0.C0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f95545p = o0.C0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f95546q = o0.C0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f95547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f95549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f95550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f95551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImmutableList f95552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f95553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f95554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f95555i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f95547a.equals(hVar.f95547a) && Objects.equals(this.f95548b, hVar.f95548b) && Objects.equals(this.f95549c, hVar.f95549c) && this.f95550d.equals(hVar.f95550d) && Objects.equals(this.f95551e, hVar.f95551e) && this.f95552f.equals(hVar.f95552f) && Objects.equals(this.f95554h, hVar.f95554h) && this.f95555i == hVar.f95555i;
        }

        public int hashCode() {
            int iHashCode = this.f95547a.hashCode() * 31;
            String str = this.f95548b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f95549c;
            int iHashCode3 = (((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f95550d.hashCode()) * 31;
            String str2 = this.f95551e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f95552f.hashCode()) * 31;
            Object obj = this.f95554h;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f95555i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, ImmutableList immutableList, Object obj, long j10) {
            this.f95547a = uri;
            this.f95548b = w.u(str);
            this.f95549c = fVar;
            this.f95550d = list;
            this.f95551e = str2;
            this.f95552f = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                builder.add(((k) immutableList.get(i10)).a().i());
            }
            this.f95553g = builder.build();
            this.f95554h = obj;
            this.f95555i = j10;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f95556d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f95557e = o0.C0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f95558f = o0.C0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f95559g = o0.C0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f95560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f95562c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f95563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f95564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f95565c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f95560a, iVar.f95560a) && Objects.equals(this.f95561b, iVar.f95561b)) {
                if ((this.f95562c == null) == (iVar.f95562c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f95560a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f95561b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f95562c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f95560a = aVar.f95563a;
            this.f95561b = aVar.f95564b;
            this.f95562c = aVar.f95565c;
        }
    }

    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f95566h = o0.C0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f95567i = o0.C0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f95568j = o0.C0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f95569k = o0.C0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95570l = o0.C0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f95571m = o0.C0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f95572n = o0.C0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f95573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f95575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f95576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f95577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f95578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f95579g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f95580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f95581b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f95582c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f95583d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f95584e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f95585f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f95586g;

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f95580a = kVar.f95573a;
                this.f95581b = kVar.f95574b;
                this.f95582c = kVar.f95575c;
                this.f95583d = kVar.f95576d;
                this.f95584e = kVar.f95577e;
                this.f95585f = kVar.f95578f;
                this.f95586g = kVar.f95579g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f95573a.equals(kVar.f95573a) && Objects.equals(this.f95574b, kVar.f95574b) && Objects.equals(this.f95575c, kVar.f95575c) && this.f95576d == kVar.f95576d && this.f95577e == kVar.f95577e && Objects.equals(this.f95578f, kVar.f95578f) && Objects.equals(this.f95579g, kVar.f95579g);
        }

        public int hashCode() {
            int iHashCode = this.f95573a.hashCode() * 31;
            String str = this.f95574b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f95575c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f95576d) * 31) + this.f95577e) * 31;
            String str3 = this.f95578f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f95579g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f95573a = aVar.f95580a;
            this.f95574b = aVar.f95581b;
            this.f95575c = aVar.f95582c;
            this.f95576d = aVar.f95583d;
            this.f95577e = aVar.f95584e;
            this.f95578f = aVar.f95585f;
            this.f95579g = aVar.f95586g;
        }
    }

    public static r b(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f95454a, rVar.f95454a) && this.f95459f.equals(rVar.f95459f) && Objects.equals(this.f95455b, rVar.f95455b) && Objects.equals(this.f95457d, rVar.f95457d) && Objects.equals(this.f95458e, rVar.f95458e) && Objects.equals(this.f95461h, rVar.f95461h);
    }

    public int hashCode() {
        int iHashCode = this.f95454a.hashCode() * 31;
        h hVar = this.f95455b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f95457d.hashCode()) * 31) + this.f95459f.hashCode()) * 31) + this.f95458e.hashCode()) * 31) + this.f95461h.hashCode();
    }

    private r(String str, e eVar, h hVar, g gVar, t tVar, i iVar) {
        this.f95454a = str;
        this.f95455b = hVar;
        this.f95456c = hVar;
        this.f95457d = gVar;
        this.f95458e = tVar;
        this.f95459f = eVar;
        this.f95460g = eVar;
        this.f95461h = iVar;
    }
}
