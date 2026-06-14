package ih;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.google.common.net.HttpHeaders;
import hh.a0;
import hh.b0;
import hh.c0;
import hh.r;
import hh.t;
import hh.u;
import hh.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.i;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import vh.a0;
import vh.e;
import vh.f;
import vh.g;
import vh.h;
import vh.j0;
import vh.l0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f74836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f74837b = t.f73746c.h(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f74838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f74839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final vh.a0 f74840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f74841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Regex f74842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f74843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f74844i;

    static {
        byte[] bArr = new byte[0];
        f74836a = bArr;
        f74838c = c0.b.i(c0.Companion, bArr, null, 1, null);
        f74839d = a0.a.o(a0.Companion, bArr, null, 0, 0, 7, null);
        a0.a aVar = vh.a0.f106785d;
        h.a aVar2 = h.f106840e;
        f74840e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f74841f = timeZone;
        f74842g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f74843h = false;
        String name = x.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f74844i = StringsKt.Q0(StringsKt.P0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(qh.a aVar, File file) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        j0 j0VarSink = aVar.sink(file);
        try {
            try {
                aVar.delete(file);
                uf.c.a(j0VarSink, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            Unit unit = Unit.f93236a;
            uf.c.a(j0VarSink, null);
            aVar.delete(file);
            return false;
        }
    }

    public static final boolean G(Socket socket, g source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.N(name, "Authorization", true) || StringsKt.N(name, HttpHeaders.COOKIE, true) || StringsKt.N(name, HttpHeaders.PROXY_AUTHORIZATION, true) || StringsKt.N(name, HttpHeaders.SET_COOKIE, true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(g gVar, Charset charset) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iW0 = gVar.w0(f74840e);
        if (iW0 == -1) {
            return charset;
        }
        if (iW0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iW0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iW0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iW0 == 3) {
            return Charsets.f93464a.a();
        }
        if (iW0 == 4) {
            return Charsets.f93464a.b();
        }
        throw new AssertionError();
    }

    public static final int K(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int L(e eVar, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i10 = 0;
        while (!eVar.exhausted() && eVar.z(0L) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final boolean M(l0 l0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = l0Var.timeout().e() ? l0Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        l0Var.timeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            e eVar = new e();
            while (l0Var.read(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                eVar.n();
            }
            if (jC == Long.MAX_VALUE) {
                l0Var.timeout().a();
                return true;
            }
            l0Var.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                l0Var.timeout().a();
                return false;
            }
            l0Var.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                l0Var.timeout().a();
            } else {
                l0Var.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final ThreadFactory N(final String name, final boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: ih.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.O(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread O(String name, boolean z10, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List P(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        IntRange intRangeV = kotlin.ranges.g.v(0, tVar.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new ph.c(tVar.e(iNextInt), tVar.i(iNextInt)));
        }
        return arrayList;
    }

    public static final t Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ph.c cVar = (ph.c) it.next();
            aVar.c(cVar.a().S(), cVar.b().S());
        }
        return aVar.e();
    }

    public static final String R(u uVar, boolean z10) {
        String strH;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (StringsKt.g0(uVar.h(), StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z10 && uVar.l() == u.f73749k.c(uVar.p())) {
            return strH;
        }
        return strH + ':' + uVar.l();
    }

    public static /* synthetic */ String S(u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return R(uVar, z10);
    }

    public static final List T(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map U(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long V(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int W(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String X(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String Y(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return X(str, i10, i11);
    }

    public static final Throwable Z(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            lf.c.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void a0(f fVar, int i10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
    }

    public static final void c(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return j10 & ((long) i10);
    }

    public static final r.c g(final r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return new r.c() { // from class: ih.b
            @Override // hh.r.c
            public final r a(hh.e eVar) {
                return d.h(rVar, eVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r h(r this_asFactory, hh.e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f74842g.g(str);
    }

    public static final boolean j(u uVar, u other) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(uVar.h(), other.h()) && uVar.l() == other.l() && Intrinsics.areEqual(uVar.p(), other.p());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.f0(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(l0 l0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return M(l0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        a1 a1Var = a1.f93282a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = i.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        String strA = b0Var.R().a("Content-Length");
        if (strA != null) {
            return V(strA, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
