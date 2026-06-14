package r;

import com.taurusx.tax.g.n0.y;
import eg.m1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import vh.c0;
import vh.j0;
import vh.l;
import vh.m;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f99137t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Regex f99138u = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f99139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f99140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f99141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f99142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f99143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f99144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f99145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LinkedHashMap f99146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CoroutineScope f99147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f99148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f99149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private vh.f f99150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f99151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f99152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f99153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f99154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f99155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f99156s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: r.b$b, reason: collision with other inner class name */
    public final class C1180b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f99157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f99158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean[] f99159c;

        public C1180b(c cVar) {
            this.f99157a = cVar;
            this.f99159c = new boolean[b.this.f99142e];
        }

        private final void d(boolean z10) {
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    if (this.f99158b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.areEqual(this.f99157a.b(), this)) {
                        bVar.R(this, z10);
                    }
                    this.f99158b = true;
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarW;
            b bVar = b.this;
            synchronized (bVar) {
                b();
                dVarW = bVar.W(this.f99157a.d());
            }
            return dVarW;
        }

        public final void e() {
            if (Intrinsics.areEqual(this.f99157a.b(), this)) {
                this.f99157a.m(true);
            }
        }

        public final c0 f(int i10) {
            c0 c0Var;
            b bVar = b.this;
            synchronized (bVar) {
                if (this.f99158b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f99159c[i10] = true;
                Object obj = this.f99157a.c().get(i10);
                c0.e.a(bVar.f99156s, (c0) obj);
                c0Var = (c0) obj;
            }
            return c0Var;
        }

        public final c g() {
            return this.f99157a;
        }

        public final boolean[] h() {
            return this.f99159c;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f99161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f99162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f99163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f99164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f99165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f99166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C1180b f99167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f99168h;

        public c(String str) {
            this.f99161a = str;
            this.f99162b = new long[b.this.f99142e];
            this.f99163c = new ArrayList(b.this.f99142e);
            this.f99164d = new ArrayList(b.this.f99142e);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = b.this.f99142e;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f99163c.add(b.this.f99139b.l(sb2.toString()));
                sb2.append(".tmp");
                this.f99164d.add(b.this.f99139b.l(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.f99163c;
        }

        public final C1180b b() {
            return this.f99167g;
        }

        public final ArrayList c() {
            return this.f99164d;
        }

        public final String d() {
            return this.f99161a;
        }

        public final long[] e() {
            return this.f99162b;
        }

        public final int f() {
            return this.f99168h;
        }

        public final boolean g() {
            return this.f99165e;
        }

        public final boolean h() {
            return this.f99166f;
        }

        public final void i(C1180b c1180b) {
            this.f99167g = c1180b;
        }

        public final void j(List list) throws IOException {
            if (list.size() != b.this.f99142e) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f99162b[i10] = Long.parseLong((String) list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f99168h = i10;
        }

        public final void l(boolean z10) {
            this.f99165e = z10;
        }

        public final void m(boolean z10) {
            this.f99166f = z10;
        }

        public final d n() {
            if (!this.f99165e || this.f99167g != null || this.f99166f) {
                return null;
            }
            ArrayList arrayList = this.f99163c;
            b bVar = b.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!bVar.f99156s.j((c0) arrayList.get(i10))) {
                    try {
                        bVar.u0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f99168h++;
            return b.this.new d(this);
        }

        public final void o(vh.f fVar) {
            for (long j10 : this.f99162b) {
                fVar.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    public final class d implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f99170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f99171c;

        public d(c cVar) {
            this.f99170b = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f99171c) {
                return;
            }
            this.f99171c = true;
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    this.f99170b.k(r1.f() - 1);
                    if (this.f99170b.f() == 0 && this.f99170b.h()) {
                        bVar.u0(this.f99170b);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final C1180b m() {
            C1180b c1180bV;
            b bVar = b.this;
            synchronized (bVar) {
                close();
                c1180bV = bVar.V(this.f99170b.d());
            }
            return c1180bV;
        }

        public final c0 n(int i10) {
            if (this.f99171c) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (c0) this.f99170b.a().get(i10);
        }
    }

    public static final class e extends m {
        e(l lVar) {
            super(lVar);
        }

        @Override // vh.m, vh.l
        public j0 r(c0 c0Var, boolean z10) {
            c0 c0VarJ = c0Var.j();
            if (c0VarJ != null) {
                d(c0VarJ);
            }
            return super.r(c0Var, z10);
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99173r;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f99173r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            b bVar = b.this;
            synchronized (bVar) {
                if (!bVar.f99152o || bVar.f99153p) {
                    return Unit.f93236a;
                }
                try {
                    bVar.y0();
                } catch (IOException unused) {
                    bVar.f99154q = true;
                }
                try {
                    if (bVar.e0()) {
                        bVar.A0();
                    }
                } catch (IOException unused2) {
                    bVar.f99155r = true;
                    bVar.f99150m = x.c(x.b());
                }
                return Unit.f93236a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class g extends Lambda implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IOException) obj);
            return Unit.f93236a;
        }

        public final void invoke(IOException iOException) {
            b.this.f99151n = true;
        }
    }

    public b(l lVar, c0 c0Var, CoroutineDispatcher coroutineDispatcher, long j10, int i10, int i11) {
        this.f99139b = c0Var;
        this.f99140c = j10;
        this.f99141d = i10;
        this.f99142e = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f99143f = c0Var.l(y.f66202v);
        this.f99144g = c0Var.l(y.f66199l);
        this.f99145h = c0Var.l(y.f66195e);
        this.f99146i = new LinkedHashMap(0, 0.75f, true);
        this.f99147j = i.a(m1.b(null, 1, null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.f99156s = new e(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void A0() {
        Unit unit;
        try {
            vh.f fVar = this.f99150m;
            if (fVar != null) {
                fVar.close();
            }
            vh.f fVarC = x.c(this.f99156s.r(this.f99144g, false));
            Throwable th2 = null;
            try {
                fVarC.writeUtf8(y.f66198k).writeByte(10);
                fVarC.writeUtf8("1").writeByte(10);
                fVarC.writeDecimalLong(this.f99141d).writeByte(10);
                fVarC.writeDecimalLong(this.f99142e).writeByte(10);
                fVarC.writeByte(10);
                for (c cVar : this.f99146i.values()) {
                    if (cVar.b() != null) {
                        fVarC.writeUtf8(y.f66197j);
                        fVarC.writeByte(32);
                        fVarC.writeUtf8(cVar.d());
                        fVarC.writeByte(10);
                    } else {
                        fVarC.writeUtf8(y.f66196h);
                        fVarC.writeByte(32);
                        fVarC.writeUtf8(cVar.d());
                        cVar.o(fVarC);
                        fVarC.writeByte(10);
                    }
                }
                unit = Unit.f93236a;
            } catch (Throwable th3) {
                unit = null;
                th2 = th3;
            }
            if (fVarC != null) {
                try {
                    fVarC.close();
                } catch (Throwable th4) {
                    if (th2 == null) {
                        th2 = th4;
                    } else {
                        lf.c.a(th2, th4);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.checkNotNull(unit);
            if (this.f99156s.j(this.f99143f)) {
                this.f99156s.c(this.f99143f, this.f99145h);
                this.f99156s.c(this.f99144g, this.f99143f);
                this.f99156s.h(this.f99145h);
            } else {
                this.f99156s.c(this.f99144g, this.f99143f);
            }
            this.f99150m = n0();
            this.f99149l = 0;
            this.f99151n = false;
            this.f99155r = false;
        } finally {
        }
    }

    private final void M() {
        if (this.f99153p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void R(C1180b c1180b, boolean z10) {
        c cVarG = c1180b.g();
        if (!Intrinsics.areEqual(cVarG.b(), c1180b)) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = 0;
        if (!z10 || cVarG.h()) {
            int i11 = this.f99142e;
            while (i10 < i11) {
                this.f99156s.h((c0) cVarG.c().get(i10));
                i10++;
            }
        } else {
            int i12 = this.f99142e;
            for (int i13 = 0; i13 < i12; i13++) {
                if (c1180b.h()[i13] && !this.f99156s.j((c0) cVarG.c().get(i13))) {
                    c1180b.a();
                    return;
                }
            }
            int i14 = this.f99142e;
            while (i10 < i14) {
                c0 c0Var = (c0) cVarG.c().get(i10);
                c0 c0Var2 = (c0) cVarG.a().get(i10);
                if (this.f99156s.j(c0Var)) {
                    this.f99156s.c(c0Var, c0Var2);
                } else {
                    c0.e.a(this.f99156s, (c0) cVarG.a().get(i10));
                }
                long j10 = cVarG.e()[i10];
                Long lD = this.f99156s.l(c0Var2).d();
                long jLongValue = lD != null ? lD.longValue() : 0L;
                cVarG.e()[i10] = jLongValue;
                this.f99148k = (this.f99148k - j10) + jLongValue;
                i10++;
            }
        }
        cVarG.i(null);
        if (cVarG.h()) {
            u0(cVarG);
            return;
        }
        this.f99149l++;
        vh.f fVar = this.f99150m;
        Intrinsics.checkNotNull(fVar);
        if (z10 || cVarG.g()) {
            cVarG.l(true);
            fVar.writeUtf8(y.f66196h);
            fVar.writeByte(32);
            fVar.writeUtf8(cVarG.d());
            cVarG.o(fVar);
            fVar.writeByte(10);
        } else {
            this.f99146i.remove(cVarG.d());
            fVar.writeUtf8(y.f66193b);
            fVar.writeByte(32);
            fVar.writeUtf8(cVarG.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.f99148k > this.f99140c || e0()) {
            i0();
        }
    }

    private final void U() throws IOException {
        close();
        c0.e.b(this.f99156s, this.f99139b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        return this.f99149l >= 2000;
    }

    private final void i0() {
        eg.i.d(this.f99147j, null, null, new f(null), 3, null);
    }

    private final vh.f n0() {
        return x.c(new r.c(this.f99156s.a(this.f99143f), new g()));
    }

    private final void r0() {
        Iterator it = this.f99146i.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f99142e;
                while (i10 < i11) {
                    j10 += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.i(null);
                int i12 = this.f99142e;
                while (i10 < i12) {
                    this.f99156s.h((c0) cVar.a().get(i10));
                    this.f99156s.h((c0) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f99148k = j10;
    }

    private final void s0() throws Throwable {
        Unit unit;
        vh.g gVarD = x.d(this.f99156s.s(this.f99143f));
        Throwable th2 = null;
        try {
            String utf8LineStrict = gVarD.readUtf8LineStrict();
            String utf8LineStrict2 = gVarD.readUtf8LineStrict();
            String utf8LineStrict3 = gVarD.readUtf8LineStrict();
            String utf8LineStrict4 = gVarD.readUtf8LineStrict();
            String utf8LineStrict5 = gVarD.readUtf8LineStrict();
            if (!Intrinsics.areEqual(y.f66198k, utf8LineStrict) || !Intrinsics.areEqual("1", utf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(this.f99141d), utf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(this.f99142e), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict3 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    t0(gVarD.readUtf8LineStrict());
                    i10++;
                } catch (EOFException unused) {
                    this.f99149l = i10 - this.f99146i.size();
                    if (gVarD.exhausted()) {
                        this.f99150m = n0();
                    } else {
                        A0();
                    }
                    unit = Unit.f93236a;
                }
            }
        } catch (Throwable th3) {
            th2 = th3;
            unit = null;
        }
        if (gVarD != null) {
            try {
                gVarD.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                } else {
                    lf.c.a(th2, th4);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(unit);
    }

    private final void t0(String str) throws IOException {
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
            if (iU0 == 6 && StringsKt.a0(str, y.f66193b, false, 2, null)) {
                this.f99146i.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iU02);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap linkedHashMap = this.f99146i;
        Object cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = (c) cVar;
        if (iU02 != -1 && iU0 == 5 && StringsKt.a0(str, y.f66196h, false, 2, null)) {
            String strSubstring2 = str.substring(iU02 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            List listX0 = StringsKt.X0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            cVar2.l(true);
            cVar2.i(null);
            cVar2.j(listX0);
            return;
        }
        if (iU02 == -1 && iU0 == 5 && StringsKt.a0(str, y.f66197j, false, 2, null)) {
            cVar2.i(new C1180b(cVar2));
            return;
        }
        if (iU02 == -1 && iU0 == 4 && StringsKt.a0(str, y.f66194d, false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u0(c cVar) {
        vh.f fVar;
        if (cVar.f() > 0 && (fVar = this.f99150m) != null) {
            fVar.writeUtf8(y.f66197j);
            fVar.writeByte(32);
            fVar.writeUtf8(cVar.d());
            fVar.writeByte(10);
            fVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i10 = this.f99142e;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f99156s.h((c0) cVar.a().get(i11));
            this.f99148k -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f99149l++;
        vh.f fVar2 = this.f99150m;
        if (fVar2 != null) {
            fVar2.writeUtf8(y.f66193b);
            fVar2.writeByte(32);
            fVar2.writeUtf8(cVar.d());
            fVar2.writeByte(10);
        }
        this.f99146i.remove(cVar.d());
        if (e0()) {
            i0();
        }
        return true;
    }

    private final boolean x0() {
        for (c cVar : this.f99146i.values()) {
            if (!cVar.h()) {
                u0(cVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        while (this.f99148k > this.f99140c) {
            if (!x0()) {
                return;
            }
        }
        this.f99154q = false;
    }

    private final void z0(String str) {
        if (f99138u.g(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized C1180b V(String str) {
        M();
        z0(str);
        b0();
        c cVar = (c) this.f99146i.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f99154q && !this.f99155r) {
            vh.f fVar = this.f99150m;
            Intrinsics.checkNotNull(fVar);
            fVar.writeUtf8(y.f66197j);
            fVar.writeByte(32);
            fVar.writeUtf8(str);
            fVar.writeByte(10);
            fVar.flush();
            if (this.f99151n) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f99146i.put(str, cVar);
            }
            C1180b c1180b = new C1180b(cVar);
            cVar.i(c1180b);
            return c1180b;
        }
        i0();
        return null;
    }

    public final synchronized d W(String str) {
        d dVarN;
        M();
        z0(str);
        b0();
        c cVar = (c) this.f99146i.get(str);
        if (cVar != null && (dVarN = cVar.n()) != null) {
            this.f99149l++;
            vh.f fVar = this.f99150m;
            Intrinsics.checkNotNull(fVar);
            fVar.writeUtf8(y.f66194d);
            fVar.writeByte(32);
            fVar.writeUtf8(str);
            fVar.writeByte(10);
            if (e0()) {
                i0();
            }
            return dVarN;
        }
        return null;
    }

    public final synchronized void b0() {
        try {
            if (this.f99152o) {
                return;
            }
            this.f99156s.h(this.f99144g);
            if (this.f99156s.j(this.f99145h)) {
                if (this.f99156s.j(this.f99143f)) {
                    this.f99156s.h(this.f99145h);
                } else {
                    this.f99156s.c(this.f99145h, this.f99143f);
                }
            }
            if (this.f99156s.j(this.f99143f)) {
                try {
                    s0();
                    r0();
                    this.f99152o = true;
                    return;
                } catch (IOException unused) {
                    try {
                        U();
                        this.f99153p = false;
                        A0();
                        this.f99152o = true;
                    } catch (Throwable th2) {
                        this.f99153p = false;
                        throw th2;
                    }
                }
            }
            A0();
            this.f99152o = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f99152o && !this.f99153p) {
                Object[] array = this.f99146i.values().toArray(new c[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (c cVar : (c[]) array) {
                    C1180b c1180bB = cVar.b();
                    if (c1180bB != null) {
                        c1180bB.e();
                    }
                }
                y0();
                i.f(this.f99147j, null, 1, null);
                vh.f fVar = this.f99150m;
                Intrinsics.checkNotNull(fVar);
                fVar.close();
                this.f99150m = null;
                this.f99153p = true;
                return;
            }
            this.f99153p = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f99152o) {
            M();
            y0();
            vh.f fVar = this.f99150m;
            Intrinsics.checkNotNull(fVar);
            fVar.flush();
        }
    }
}
