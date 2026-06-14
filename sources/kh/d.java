package kh;

import com.taurusx.tax.g.n0.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lf.g;
import rh.h;
import vh.j0;
import vh.l0;
import vh.o;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qh.a f93181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f93182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f93183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f93184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f93185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f93186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f93187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f93188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f93189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private vh.f f93190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final LinkedHashMap f93191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f93192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f93193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f93194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f93195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f93196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f93197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f93198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f93199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final lh.d f93200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final e f93201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f93177w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f93178x = y.f66202v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f93179y = y.f66199l;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f93180z = y.f66195e;
    public static final String A = y.f66198k;
    public static final String B = "1";
    public static final long C = -1;
    public static final Regex D = new Regex("[a-z0-9_-]{1,120}");
    public static final String E = y.f66196h;
    public static final String F = y.f66197j;
    public static final String G = y.f66193b;
    public static final String H = y.f66194d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f93202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f93203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f93204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f93205d;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f93206f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f93207g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b bVar) {
                super(1);
                this.f93206f = dVar;
                this.f93207g = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IOException) obj);
                return Unit.f93236a;
            }

            public final void invoke(IOException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                d dVar = this.f93206f;
                b bVar = this.f93207g;
                synchronized (dVar) {
                    bVar.c();
                    Unit unit = Unit.f93236a;
                }
            }
        }

        public b(d dVar, c entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f93205d = dVar;
            this.f93202a = entry;
            this.f93203b = entry.g() ? null : new boolean[dVar.V()];
        }

        public final void a() {
            d dVar = this.f93205d;
            synchronized (dVar) {
                try {
                    if (this.f93204c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(this.f93202a.b(), this)) {
                        dVar.q(this, false);
                    }
                    this.f93204c = true;
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            d dVar = this.f93205d;
            synchronized (dVar) {
                try {
                    if (this.f93204c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(this.f93202a.b(), this)) {
                        dVar.q(this, true);
                    }
                    this.f93204c = true;
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            if (Intrinsics.areEqual(this.f93202a.b(), this)) {
                if (this.f93205d.f93194o) {
                    this.f93205d.q(this, false);
                } else {
                    this.f93202a.q(true);
                }
            }
        }

        public final c d() {
            return this.f93202a;
        }

        public final boolean[] e() {
            return this.f93203b;
        }

        public final j0 f(int i10) {
            d dVar = this.f93205d;
            synchronized (dVar) {
                if (this.f93204c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(this.f93202a.b(), this)) {
                    return x.b();
                }
                if (!this.f93202a.g()) {
                    boolean[] zArr = this.f93203b;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new kh.e(dVar.U().sink((File) this.f93202a.c().get(i10)), new a(dVar, this));
                } catch (FileNotFoundException unused) {
                    return x.b();
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f93208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f93209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f93210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f93211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f93212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f93213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f93214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f93215h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f93216i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f93217j;

        public static final class a extends o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f93218b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f93219c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f93220d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, d dVar, c cVar) {
                super(l0Var);
                this.f93219c = dVar;
                this.f93220d = cVar;
            }

            @Override // vh.o, vh.l0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.f93218b) {
                    return;
                }
                this.f93218b = true;
                d dVar = this.f93219c;
                c cVar = this.f93220d;
                synchronized (dVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            dVar.u0(cVar);
                        }
                        Unit unit = Unit.f93236a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(d dVar, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f93217j = dVar;
            this.f93208a = key;
            this.f93209b = new long[dVar.V()];
            this.f93210c = new ArrayList();
            this.f93211d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int iV = dVar.V();
            for (int i10 = 0; i10 < iV; i10++) {
                sb2.append(i10);
                this.f93210c.add(new File(this.f93217j.R(), sb2.toString()));
                sb2.append(".tmp");
                this.f93211d.add(new File(this.f93217j.R(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final l0 k(int i10) {
            l0 l0VarSource = this.f93217j.U().source((File) this.f93210c.get(i10));
            if (this.f93217j.f93194o) {
                return l0VarSource;
            }
            this.f93215h++;
            return new a(l0VarSource, this.f93217j, this);
        }

        public final List a() {
            return this.f93210c;
        }

        public final b b() {
            return this.f93214g;
        }

        public final List c() {
            return this.f93211d;
        }

        public final String d() {
            return this.f93208a;
        }

        public final long[] e() {
            return this.f93209b;
        }

        public final int f() {
            return this.f93215h;
        }

        public final boolean g() {
            return this.f93212e;
        }

        public final long h() {
            return this.f93216i;
        }

        public final boolean i() {
            return this.f93213f;
        }

        public final void l(b bVar) {
            this.f93214g = bVar;
        }

        public final void m(List strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f93217j.V()) {
                j(strings);
                throw new g();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f93209b[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new g();
            }
        }

        public final void n(int i10) {
            this.f93215h = i10;
        }

        public final void o(boolean z10) {
            this.f93212e = z10;
        }

        public final void p(long j10) {
            this.f93216i = j10;
        }

        public final void q(boolean z10) {
            this.f93213f = z10;
        }

        public final C1064d r() {
            d dVar = this.f93217j;
            if (ih.d.f74843h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            if (!this.f93212e) {
                return null;
            }
            if (!this.f93217j.f93194o && (this.f93214g != null || this.f93213f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f93209b.clone();
            try {
                int iV = this.f93217j.V();
                for (int i10 = 0; i10 < iV; i10++) {
                    arrayList.add(k(i10));
                }
                return new C1064d(this.f93217j, this.f93208a, this.f93216i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ih.d.m((l0) it.next());
                }
                try {
                    this.f93217j.u0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(vh.f writer) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j10 : this.f93209b) {
                writer.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* JADX INFO: renamed from: kh.d$d, reason: collision with other inner class name */
    public final class C1064d implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f93221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f93222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f93223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long[] f93224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f93225f;

        public C1064d(d dVar, String key, long j10, List sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f93225f = dVar;
            this.f93221b = key;
            this.f93222c = j10;
            this.f93223d = sources;
            this.f93224e = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f93223d.iterator();
            while (it.hasNext()) {
                ih.d.m((l0) it.next());
            }
        }

        public final b m() {
            return this.f93225f.w(this.f93221b, this.f93222c);
        }

        public final l0 n(int i10) {
            return (l0) this.f93223d.get(i10);
        }
    }

    public static final class e extends lh.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // lh.a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                if (!dVar.f93195p || dVar.M()) {
                    return -1L;
                }
                try {
                    dVar.y0();
                } catch (IOException unused) {
                    dVar.f93197r = true;
                }
                try {
                    if (dVar.b0()) {
                        dVar.s0();
                        dVar.f93192m = 0;
                    }
                } catch (IOException unused2) {
                    dVar.f93198s = true;
                    dVar.f93190k = x.c(x.b());
                }
                return -1L;
            }
        }
    }

    static final class f extends Lambda implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IOException) obj);
            return Unit.f93236a;
        }

        public final void invoke(IOException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            d dVar = d.this;
            if (!ih.d.f74843h || Thread.holdsLock(dVar)) {
                d.this.f93193n = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
        }
    }

    public d(qh.a fileSystem, File directory, int i10, int i11, long j10, lh.e taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f93181b = fileSystem;
        this.f93182c = directory;
        this.f93183d = i10;
        this.f93184e = i11;
        this.f93185f = j10;
        this.f93191l = new LinkedHashMap(0, 0.75f, true);
        this.f93200u = taskRunner.i();
        this.f93201v = new e(ih.d.f74844i + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f93186g = new File(directory, f93178x);
        this.f93187h = new File(directory, f93179y);
        this.f93188i = new File(directory, f93180z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b0() {
        int i10 = this.f93192m;
        return i10 >= 2000 && i10 >= this.f93191l.size();
    }

    private final vh.f e0() {
        return x.c(new kh.e(this.f93181b.appendingSink(this.f93186g), new f()));
    }

    private final void i0() {
        this.f93181b.delete(this.f93187h);
        Iterator it = this.f93191l.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f93184e;
                while (i10 < i11) {
                    this.f93189j += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f93184e;
                while (i10 < i12) {
                    this.f93181b.delete((File) cVar.a().get(i10));
                    this.f93181b.delete((File) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void n0() throws IOException {
        vh.g gVarD = x.d(this.f93181b.source(this.f93186g));
        try {
            String utf8LineStrict = gVarD.readUtf8LineStrict();
            String utf8LineStrict2 = gVarD.readUtf8LineStrict();
            String utf8LineStrict3 = gVarD.readUtf8LineStrict();
            String utf8LineStrict4 = gVarD.readUtf8LineStrict();
            String utf8LineStrict5 = gVarD.readUtf8LineStrict();
            if (!Intrinsics.areEqual(A, utf8LineStrict) || !Intrinsics.areEqual(B, utf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(this.f93183d), utf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(this.f93184e), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    r0(gVarD.readUtf8LineStrict());
                    i10++;
                } catch (EOFException unused) {
                    this.f93192m = i10 - this.f93191l.size();
                    if (gVarD.exhausted()) {
                        this.f93190k = e0();
                    } else {
                        s0();
                    }
                    Unit unit = Unit.f93236a;
                    uf.c.a(gVarD, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final synchronized void p() {
        if (this.f93196q) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void r0(String str) throws IOException {
        String strSubstring;
        int iU0 = StringsKt.u0(str, ' ', 0, false, 6, null);
        if (iU0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iU0 + 1;
        int iU02 = StringsKt.u0(str, ' ', i10, false, 4, null);
        if (iU02 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = G;
            if (iU0 == str2.length() && StringsKt.a0(str, str2, false, 2, null)) {
                this.f93191l.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iU02);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = (c) this.f93191l.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f93191l.put(strSubstring, cVar);
        }
        if (iU02 != -1) {
            String str3 = E;
            if (iU0 == str3.length() && StringsKt.a0(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iU02 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listX0 = StringsKt.X0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listX0);
                return;
            }
        }
        if (iU02 == -1) {
            String str4 = F;
            if (iU0 == str4.length() && StringsKt.a0(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iU02 == -1) {
            String str5 = H;
            if (iU0 == str5.length() && StringsKt.a0(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean x0() {
        for (c toEvict : this.f93191l.values()) {
            if (!toEvict.i()) {
                Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                u0(toEvict);
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ b y(d dVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = C;
        }
        return dVar.w(str, j10);
    }

    private final void z0(String str) {
        if (D.g(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final boolean M() {
        return this.f93196q;
    }

    public final File R() {
        return this.f93182c;
    }

    public final qh.a U() {
        return this.f93181b;
    }

    public final int V() {
        return this.f93184e;
    }

    public final synchronized void W() {
        try {
            if (ih.d.f74843h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f93195p) {
                return;
            }
            if (this.f93181b.exists(this.f93188i)) {
                if (this.f93181b.exists(this.f93186g)) {
                    this.f93181b.delete(this.f93188i);
                } else {
                    this.f93181b.rename(this.f93188i, this.f93186g);
                }
            }
            this.f93194o = ih.d.F(this.f93181b, this.f93188i);
            if (this.f93181b.exists(this.f93186g)) {
                try {
                    n0();
                    i0();
                    this.f93195p = true;
                    return;
                } catch (IOException e10) {
                    h.f99497a.g().k("DiskLruCache " + this.f93182c + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        s();
                        this.f93196q = false;
                        s0();
                        this.f93195p = true;
                    } catch (Throwable th2) {
                        this.f93196q = false;
                        throw th2;
                    }
                }
            }
            s0();
            this.f93195p = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f93195p && !this.f93196q) {
                Collection collectionValues = this.f93191l.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                y0();
                vh.f fVar = this.f93190k;
                Intrinsics.checkNotNull(fVar);
                fVar.close();
                this.f93190k = null;
                this.f93196q = true;
                return;
            }
            this.f93196q = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f93195p) {
            p();
            y0();
            vh.f fVar = this.f93190k;
            Intrinsics.checkNotNull(fVar);
            fVar.flush();
        }
    }

    public final synchronized void q(b editor, boolean z10) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        c cVarD = editor.d();
        if (!Intrinsics.areEqual(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVarD.g()) {
            int i10 = this.f93184e;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrE = editor.e();
                Intrinsics.checkNotNull(zArrE);
                if (!zArrE[i11]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f93181b.exists((File) cVarD.c().get(i11))) {
                    editor.a();
                    return;
                }
            }
        }
        int i12 = this.f93184e;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = (File) cVarD.c().get(i13);
            if (!z10 || cVarD.i()) {
                this.f93181b.delete(file);
            } else if (this.f93181b.exists(file)) {
                File file2 = (File) cVarD.a().get(i13);
                this.f93181b.rename(file, file2);
                long j10 = cVarD.e()[i13];
                long size = this.f93181b.size(file2);
                cVarD.e()[i13] = size;
                this.f93189j = (this.f93189j - j10) + size;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            u0(cVarD);
            return;
        }
        this.f93192m++;
        vh.f fVar = this.f93190k;
        Intrinsics.checkNotNull(fVar);
        if (cVarD.g() || z10) {
            cVarD.o(true);
            fVar.writeUtf8(E).writeByte(32);
            fVar.writeUtf8(cVarD.d());
            cVarD.s(fVar);
            fVar.writeByte(10);
            if (z10) {
                long j11 = this.f93199t;
                this.f93199t = 1 + j11;
                cVarD.p(j11);
            }
        } else {
            this.f93191l.remove(cVarD.d());
            fVar.writeUtf8(G).writeByte(32);
            fVar.writeUtf8(cVarD.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.f93189j > this.f93185f || b0()) {
            lh.d.j(this.f93200u, this.f93201v, 0L, 2, null);
        }
    }

    public final void s() {
        close();
        this.f93181b.deleteContents(this.f93182c);
    }

    public final synchronized void s0() {
        try {
            vh.f fVar = this.f93190k;
            if (fVar != null) {
                fVar.close();
            }
            vh.f fVarC = x.c(this.f93181b.sink(this.f93187h));
            try {
                fVarC.writeUtf8(A).writeByte(10);
                fVarC.writeUtf8(B).writeByte(10);
                fVarC.writeDecimalLong(this.f93183d).writeByte(10);
                fVarC.writeDecimalLong(this.f93184e).writeByte(10);
                fVarC.writeByte(10);
                for (c cVar : this.f93191l.values()) {
                    if (cVar.b() != null) {
                        fVarC.writeUtf8(F).writeByte(32);
                        fVarC.writeUtf8(cVar.d());
                        fVarC.writeByte(10);
                    } else {
                        fVarC.writeUtf8(E).writeByte(32);
                        fVarC.writeUtf8(cVar.d());
                        cVar.s(fVarC);
                        fVarC.writeByte(10);
                    }
                }
                Unit unit = Unit.f93236a;
                uf.c.a(fVarC, null);
                if (this.f93181b.exists(this.f93186g)) {
                    this.f93181b.rename(this.f93186g, this.f93188i);
                }
                this.f93181b.rename(this.f93187h, this.f93186g);
                this.f93181b.delete(this.f93188i);
                this.f93190k = e0();
                this.f93193n = false;
                this.f93198s = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean t0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        W();
        p();
        z0(key);
        c cVar = (c) this.f93191l.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zU0 = u0(cVar);
        if (zU0 && this.f93189j <= this.f93185f) {
            this.f93197r = false;
        }
        return zU0;
    }

    public final boolean u0(c entry) {
        vh.f fVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f93194o) {
            if (entry.f() > 0 && (fVar = this.f93190k) != null) {
                fVar.writeUtf8(F);
                fVar.writeByte(32);
                fVar.writeUtf8(entry.d());
                fVar.writeByte(10);
                fVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i10 = this.f93184e;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f93181b.delete((File) entry.a().get(i11));
            this.f93189j -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f93192m++;
        vh.f fVar2 = this.f93190k;
        if (fVar2 != null) {
            fVar2.writeUtf8(G);
            fVar2.writeByte(32);
            fVar2.writeUtf8(entry.d());
            fVar2.writeByte(10);
        }
        this.f93191l.remove(entry.d());
        if (b0()) {
            lh.d.j(this.f93200u, this.f93201v, 0L, 2, null);
        }
        return true;
    }

    public final synchronized b w(String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        W();
        p();
        z0(key);
        c cVar = (c) this.f93191l.get(key);
        if (j10 != C && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f93197r && !this.f93198s) {
            vh.f fVar = this.f93190k;
            Intrinsics.checkNotNull(fVar);
            fVar.writeUtf8(F).writeByte(32).writeUtf8(key).writeByte(10);
            fVar.flush();
            if (this.f93193n) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f93191l.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        lh.d.j(this.f93200u, this.f93201v, 0L, 2, null);
        return null;
    }

    public final void y0() {
        while (this.f93189j > this.f93185f) {
            if (!x0()) {
                return;
            }
        }
        this.f93197r = false;
    }

    public final synchronized C1064d z(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        W();
        p();
        z0(key);
        c cVar = (c) this.f93191l.get(key);
        if (cVar == null) {
            return null;
        }
        C1064d c1064dR = cVar.r();
        if (c1064dR == null) {
            return null;
        }
        this.f93192m++;
        vh.f fVar = this.f93190k;
        Intrinsics.checkNotNull(fVar);
        fVar.writeUtf8(H).writeByte(32).writeUtf8(key).writeByte(10);
        if (b0()) {
            lh.d.j(this.f93200u, this.f93201v, 0L, 2, null);
        }
        return c1064dR;
    }
}
