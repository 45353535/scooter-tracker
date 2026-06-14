package wh;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import vh.c0;
import vh.j0;
import vh.k;
import vh.l;
import vh.l0;
import vh.x;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f108025h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c0 f108026i = c0.a.e(c0.f106805c, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f108027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f108028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f108029g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(c0 c0Var) {
            return !StringsKt.L(c0Var.g(), ".class", true);
        }

        public final c0 b() {
            return h.f108026i;
        }

        public final c0 d(c0 c0Var, c0 base) {
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return b().l(StringsKt.V(StringsKt.P0(c0Var.toString(), base.toString()), IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            h hVar = h.this;
            return hVar.z(hVar.f108027e);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f108031f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(h.f108025h.c(entry.a()));
        }
    }

    public /* synthetic */ h(ClassLoader classLoader, boolean z10, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? l.f106875b : lVar);
    }

    private final Pair A(URL url) {
        if (Intrinsics.areEqual(url.getProtocol(), C4240b4.i.f42616b)) {
            return TuplesKt.to(this.f108028f, c0.a.d(c0.f106805c, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair B(URL url) {
        int iC0;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!StringsKt.a0(string, "jar:file:", false, 2, null) || (iC0 = StringsKt.C0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        c0.a aVar = c0.f106805c;
        String strSubstring = string.substring(4, iC0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return TuplesKt.to(j.d(c0.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), this.f108028f, c.f108031f), f108026i);
    }

    private final String C(c0 c0Var) {
        return x(c0Var).k(f108026i).toString();
    }

    private final c0 x(c0 c0Var) {
        return f108026i.m(c0Var, true);
    }

    private final List y() {
        return (List) this.f108029g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List z(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            Intrinsics.checkNotNull(url);
            Pair pairA = A(url);
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.checkNotNull(url2);
            Pair pairB = B(url2);
            if (pairB != null) {
                arrayList2.add(pairB);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    @Override // vh.l
    public j0 b(c0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.l
    public void c(c0 source, c0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.l
    public void g(c0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.l
    public void i(c0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.l
    public List k(c0 dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strC = C(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : y()) {
            l lVar = (l) pair.component1();
            c0 c0Var = (c0) pair.component2();
            try {
                List listK = lVar.k(c0Var.l(strC));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listK) {
                    if (f108025h.c((c0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f108025h.d((c0) it.next(), c0Var));
                }
                CollectionsKt.addAll(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // vh.l
    public k m(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!f108025h.c(path)) {
            return null;
        }
        String strC = C(path);
        for (Pair pair : y()) {
            k kVarM = ((l) pair.component1()).m(((c0) pair.component2()).l(strC));
            if (kVarM != null) {
                return kVarM;
            }
        }
        return null;
    }

    @Override // vh.l
    public vh.j n(c0 file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!f108025h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strC = C(file);
        for (Pair pair : y()) {
            try {
                return ((l) pair.component1()).n(((c0) pair.component2()).l(strC));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // vh.l
    public vh.j p(c0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // vh.l
    public j0 r(c0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.l
    public l0 s(c0 file) throws FileNotFoundException {
        l0 l0VarK;
        Intrinsics.checkNotNullParameter(file, "file");
        if (!f108025h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        c0 c0Var = f108026i;
        InputStream resourceAsStream = this.f108027e.getResourceAsStream(c0.n(c0Var, file, false, 2, null).k(c0Var).toString());
        if (resourceAsStream != null && (l0VarK = x.k(resourceAsStream)) != null) {
            return l0VarK;
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    public h(ClassLoader classLoader, boolean z10, l systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f108027e = classLoader;
        this.f108028f = systemFileSystem;
        this.f108029g = lf.i.a(new b());
        if (z10) {
            y().size();
        }
    }
}
