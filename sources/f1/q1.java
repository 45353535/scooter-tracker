package f1;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public interface q1 {

    public static final class a {
        public static /* synthetic */ void a(q1 q1Var, String str, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            q1Var.a(str, i10, z10);
        }
    }

    int a(c9 c9Var);

    void a(Context context);

    void a(String str, int i10, boolean z10);

    boolean a(String str);

    c9 b(String str);

    void d(String str, String str2, boolean z10, e9 e9Var);
}
