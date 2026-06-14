package uf;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f105624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileWalkDirection f105625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f105626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f105627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f105628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f105629f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractIterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayDeque f105630b;

        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f105632b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f105633c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f105634d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f105635e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f105636f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f105636f = bVar;
            }

            @Override // uf.h.c
            public File b() {
                if (!this.f105635e && this.f105633c == null) {
                    Function1 function1 = h.this.f105626c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f105633c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = h.this.f105628e;
                        if (function2 != null) {
                            function2.invoke(a(), new uf.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f105635e = true;
                    }
                }
                File[] fileArr = this.f105633c;
                if (fileArr != null) {
                    int i10 = this.f105634d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f105633c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i11 = this.f105634d;
                        this.f105634d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f105632b) {
                    this.f105632b = true;
                    return a();
                }
                Function1 function12 = h.this.f105627d;
                if (function12 != null) {
                    function12.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: uf.h$b$b, reason: collision with other inner class name */
        private final class C1316b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f105637b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f105638c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1316b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f105638c = bVar;
            }

            @Override // uf.h.c
            public File b() {
                if (this.f105637b) {
                    return null;
                }
                this.f105637b = true;
                return a();
            }
        }

        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f105639b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f105640c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f105641d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f105642e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f105642e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // uf.h.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f105639b
                    r1 = 0
                    if (r0 != 0) goto L28
                    uf.h$b r0 = r9.f105642e
                    uf.h r0 = uf.h.this
                    kotlin.jvm.functions.Function1 r0 = uf.h.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f105639b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f105640c
                    if (r0 == 0) goto L47
                    int r2 = r9.f105641d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    uf.h$b r0 = r9.f105642e
                    uf.h r0 = uf.h.this
                    kotlin.jvm.functions.Function1 r0 = uf.h.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f105640c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f105640c = r0
                    if (r0 != 0) goto L76
                    uf.h$b r0 = r9.f105642e
                    uf.h r0 = uf.h.this
                    kotlin.jvm.functions.Function2 r0 = uf.h.f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    uf.a r3 = new uf.a
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f105640c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    uf.h$b r0 = r9.f105642e
                    uf.h r0 = uf.h.this
                    kotlin.jvm.functions.Function1 r0 = uf.h.g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f105640c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r9.f105641d
                    int r2 = r1 + 1
                    r9.f105641d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.h.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.f93275b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.f93276c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f105630b = arrayDeque;
            if (h.this.f105624a.isDirectory()) {
                arrayDeque.push(a(h.this.f105624a));
            } else if (h.this.f105624a.isFile()) {
                arrayDeque.push(new C1316b(this, h.this.f105624a));
            } else {
                done();
            }
        }

        private final a a(File file) {
            int i10 = d.$EnumSwitchMapping$0[h.this.f105625b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new lf.m();
        }

        private final File b() {
            File fileB;
            while (true) {
                c cVar = (c) this.f105630b.peek();
                if (cVar == null) {
                    return null;
                }
                fileB = cVar.b();
                if (fileB == null) {
                    this.f105630b.pop();
                } else {
                    if (Intrinsics.areEqual(fileB, cVar.a()) || !fileB.isDirectory() || this.f105630b.size() >= h.this.f105629f) {
                        break;
                    }
                    this.f105630b.push(a(fileB));
                }
            }
            return fileB;
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            File fileB = b();
            if (fileB != null) {
                setNext(fileB);
            } else {
                done();
            }
        }
    }

    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f105643a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f105643a = root;
        }

        public final File a() {
            return this.f105643a;
        }

        public abstract File b();
    }

    private h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i10) {
        this.f105624a = file;
        this.f105625b = fileWalkDirection;
        this.f105626c = function1;
        this.f105627d = function12;
        this.f105628e = function2;
        this.f105629f = i10;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.f93275b : fileWalkDirection, function1, function12, function2, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}
