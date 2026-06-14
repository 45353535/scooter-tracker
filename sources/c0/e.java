package c0;

import java.io.FileNotFoundException;
import java.io.IOException;
import vh.c0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final void a(vh.l lVar, c0 c0Var) {
        if (lVar.j(c0Var)) {
            return;
        }
        i.d(lVar.q(c0Var));
    }

    public static final void b(vh.l lVar, c0 c0Var) throws IOException {
        try {
            IOException iOException = null;
            for (c0 c0Var2 : lVar.k(c0Var)) {
                try {
                    if (lVar.l(c0Var2).f()) {
                        b(lVar, c0Var2);
                    }
                    lVar.h(c0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
