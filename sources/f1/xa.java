package f1;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xa {
    public static final g8 b(c9 c9Var, s6 s6Var, m mVar) {
        File fileB;
        RandomAccessFile randomAccessFileB;
        if (mVar != null) {
            try {
                fileB = mVar.b(mVar.i(), c9Var.e());
            } catch (Exception e10) {
                eg.j(e10.toString(), null, 2, null);
            }
        } else {
            fileB = null;
        }
        if (fileB == null || !fileB.exists()) {
            File fileA = s6Var.a(c9Var.c(), c9Var.e());
            randomAccessFileB = fileA != null ? s6Var.b(fileA) : null;
        } else {
            randomAccessFileB = s6Var.b(fileB);
        }
        if (randomAccessFileB != null) {
            return new g8(randomAccessFileB);
        }
        return null;
    }
}
