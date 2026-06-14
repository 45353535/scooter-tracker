package td;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.ironsource.C4274d4;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uf.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final File a(File file, String childPathname) {
        Intrinsics.checkNotNullParameter(childPathname, "childPathname");
        return new File(file, childPathname);
    }

    public static final File b(File file, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strB = a.b(url);
        if (strB != null) {
            return a(file, strB);
        }
        return null;
    }

    public static final File c(File file, String tempFilePrefix) {
        Intrinsics.checkNotNullParameter(tempFilePrefix, "tempFilePrefix");
        return a(file, tempFilePrefix + System.nanoTime());
    }

    public static /* synthetic */ File d(File file, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = C4274d4.D;
        }
        return c(file, str);
    }

    public static final void e(File file, Function1 canDelete) {
        Intrinsics.checkNotNullParameter(canDelete, "canDelete");
        if (file == null || !g(file)) {
            return;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && ((Boolean) canDelete.invoke(file2)).booleanValue()) {
                        f(file2);
                    }
                }
                Unit unit = Unit.f93236a;
            }
        } catch (Throwable unused) {
        }
    }

    public static final boolean f(File file) {
        Boolean boolValueOf;
        File[] fileArrListFiles;
        if (file == null || !g(file)) {
            return true;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
                for (File file2 : fileArrListFiles) {
                    a.a(file2);
                }
            }
            boolValueOf = Boolean.valueOf(file.delete());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final boolean g(File file) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            boolValueOf = Boolean.valueOf(file.exists());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public static final File h(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(externalStorageDirectory, "Environment.getExternalS…irectory() ?: return null");
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean i(File file) {
        return file != null && g(file) && file.length() > 0;
    }

    public static final String j(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            return i.m(file, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Uri k(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(this)");
        return uriFromFile;
    }

    public static final Uri l(File file) {
        if (file == null) {
            return null;
        }
        try {
            return k(file);
        } catch (Throwable unused) {
            return null;
        }
    }
}
