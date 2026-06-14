package f1;

import android.content.Context;
import f1.y1;
import java.io.File;
import java.io.FileFilter;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class y1 implements p8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f71602e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f71604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f71606d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            try {
                File cacheDir = y1.this.f71603a.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                File file = new File(cacheDir, y1.this.f71605c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                }
                return null;
            } catch (SecurityException e10) {
                eg.i("SecurityException accessing or creating cache directory", e10);
                return null;
            } catch (Exception e11) {
                eg.i("Error accessing or creating cache directory", e11);
                return null;
            }
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71608r;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        public static final boolean c(File file) {
            if (file.isFile()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.M(name, ".tmp", false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return y1.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f71608r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            File fileD = y1.this.d();
            if (fileD == null) {
                return kotlin.coroutines.jvm.internal.b.e(0L);
            }
            kotlin.jvm.internal.u0 u0Var = new kotlin.jvm.internal.u0();
            File[] fileArrListFiles = fileD.listFiles(new FileFilter() { // from class: f1.z1
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return y1.c.c(file);
                }
            });
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    eg.p("Cleaning up stray temp file during init: " + file.getName(), null, 2, null);
                    try {
                        file.delete();
                    } catch (Exception e10) {
                        eg.i("Failed to delete temp file " + file.getName() + " during init", e10);
                    }
                }
            }
            File[] fileArrListFiles2 = fileD.listFiles();
            if (fileArrListFiles2 != null) {
                y1 y1Var = y1.this;
                for (File file2 : fileArrListFiles2) {
                    try {
                        Intrinsics.checkNotNull(file2);
                        if (y1Var.j(file2)) {
                            if (y1Var.c(file2).exists()) {
                                u0Var.f93333b += file2.length();
                            } else {
                                eg.p("Metadata missing for " + file2.getName() + ", deleting data file.", null, 2, null);
                                file2.delete();
                            }
                        } else if (y1Var.k(file2) && !y1Var.e(file2).exists()) {
                            eg.p("Data file missing for " + file2.getName() + ", deleting metadata file.", null, 2, null);
                            file2.delete();
                        }
                    } catch (Exception e11) {
                        eg.i("Error processing file during init: " + file2.getAbsolutePath(), e11);
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.b.e(u0Var.f93333b);
        }
    }

    public y1(Context context, CoroutineDispatcher ioDispatcher, String cacheSubdir) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSubdir, "cacheSubdir");
        this.f71603a = context;
        this.f71604b = ioDispatcher;
        this.f71605c = cacheSubdir;
        this.f71606d = lf.i.a(new b());
    }

    public File c(File dataFile) {
        Intrinsics.checkNotNullParameter(dataFile, "dataFile");
        File parentFile = dataFile.getParentFile();
        String name = dataFile.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new File(parentFile, StringsKt.Q0(name, ".dat") + ".meta");
    }

    public final File d() {
        return (File) this.f71606d.getValue();
    }

    public final File e(File file) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new File(parentFile, StringsKt.Q0(name, ".meta") + ".dat");
    }

    public final boolean j(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.a0(name, "cache_", false, 2, null)) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.M(name2, ".dat", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.a0(name, "cache_", false, 2, null)) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.M(name2, ".meta", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f1.p8
    public Object a(Continuation continuation) {
        return eg.g.g(this.f71604b, new c(null), continuation);
    }

    public /* synthetic */ y1(Context context, CoroutineDispatcher coroutineDispatcher, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? eg.o0.b() : coroutineDispatcher, (i10 & 4) != 0 ? "managed_file_cache_v2" : str);
    }
}
