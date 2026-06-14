package uf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class n extends m {
    public static final File A(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (j.b(relative)) {
            return relative;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!StringsKt.l0(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File B(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return A(file, new File(relative));
    }

    public static final File v(File file, File target, boolean z10, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new p(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new f(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new f(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new g(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                b.a(fileInputStream, fileOutputStream, i10);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File w(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return v(file, file2, z10, i10);
    }

    public static boolean x(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : m.t(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static String y(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.i1(name, '.', "");
    }

    public static String z(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.t1(name, ".", null, 2, null);
    }
}
