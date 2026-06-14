package vh;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106805c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f106806d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f106807b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c0 d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ c0 e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ c0 f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final c0 a(File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return b(string, z10);
        }

        public final c0 b(String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return wh.d.k(str, z10);
        }

        public final c0 c(Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f106806d = separator;
    }

    public c0(h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f106807b = bytes;
    }

    public static /* synthetic */ c0 n(c0 c0Var, c0 c0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c0Var.m(c0Var2, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c().compareTo(other.c());
    }

    public final h c() {
        return this.f106807b;
    }

    public final c0 d() {
        int iO = wh.d.o(this);
        if (iO == -1) {
            return null;
        }
        return new c0(c().N(0, iO));
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        int iO = wh.d.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < c().K() && c().l(iO) == 92) {
            iO++;
        }
        int iK = c().K();
        int i10 = iO;
        while (iO < iK) {
            if (c().l(iO) == 47 || c().l(iO) == 92) {
                arrayList.add(c().N(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < c().K()) {
            arrayList.add(c().N(i10, c().K()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c0) && Intrinsics.areEqual(((c0) obj).c(), c());
    }

    public final boolean f() {
        return wh.d.o(this) != -1;
    }

    public final String g() {
        return h().S();
    }

    public final h h() {
        int iL = wh.d.l(this);
        return iL != -1 ? h.O(c(), iL + 1, 0, 2, null) : (q() == null || c().K() != 2) ? c() : h.f106841f;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public final c0 i() {
        return f106805c.b(toString(), true);
    }

    public final c0 j() {
        if (Intrinsics.areEqual(c(), wh.d.f108017d) || Intrinsics.areEqual(c(), wh.d.f108014a) || Intrinsics.areEqual(c(), wh.d.f108015b) || wh.d.n(this)) {
            return null;
        }
        int iL = wh.d.l(this);
        if (iL == 2 && q() != null) {
            if (c().K() == 3) {
                return null;
            }
            return new c0(h.O(c(), 0, 3, 1, null));
        }
        if (iL == 1 && c().L(wh.d.f108015b)) {
            return null;
        }
        if (iL != -1 || q() == null) {
            return iL == -1 ? new c0(wh.d.f108017d) : iL == 0 ? new c0(h.O(c(), 0, 1, 1, null)) : new c0(h.O(c(), 0, iL, 1, null));
        }
        if (c().K() == 2) {
            return null;
        }
        return new c0(h.O(c(), 0, 2, 1, null));
    }

    public final c0 k(c0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(d(), other.d())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listE = e();
        List listE2 = other.e();
        int iMin = Math.min(listE.size(), listE2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(listE.get(i10), listE2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && c().K() == other.c().K()) {
            return a.e(f106805c, ".", false, 1, null);
        }
        if (listE2.subList(i10, listE2.size()).indexOf(wh.d.f108018e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        e eVar = new e();
        h hVarM = wh.d.m(other);
        if (hVarM == null && (hVarM = wh.d.m(this)) == null) {
            hVarM = wh.d.s(f106806d);
        }
        int size = listE2.size();
        for (int i11 = i10; i11 < size; i11++) {
            eVar.r(wh.d.f108018e);
            eVar.r(hVarM);
        }
        int size2 = listE.size();
        while (i10 < size2) {
            eVar.r((h) listE.get(i10));
            eVar.r(hVarM);
            i10++;
        }
        return wh.d.q(eVar, false);
    }

    public final c0 l(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return wh.d.j(this, wh.d.q(new e().writeUtf8(child), false), false);
    }

    public final c0 m(c0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(child, "child");
        return wh.d.j(this, child, z10);
    }

    public final File o() {
        return new File(toString());
    }

    public final Path p() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character q() {
        if (h.u(c(), wh.d.f108014a, 0, 2, null) != -1 || c().K() < 2 || c().l(1) != 58) {
            return null;
        }
        char cL = (char) c().l(0);
        if (('a' > cL || cL >= '{') && ('A' > cL || cL >= '[')) {
            return null;
        }
        return Character.valueOf(cL);
    }

    public String toString() {
        return c().S();
    }
}
