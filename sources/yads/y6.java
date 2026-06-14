package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f118099a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile do0 f118100b;

    public static final void a(do0 do0Var) {
        f118100b = do0Var;
        for (oc2 oc2Var : f118099a) {
            if (f118100b != null) {
                do0 do0Var2 = f118100b;
                if (do0Var2 != null) {
                    ((vm0) do0Var2.f109990a).a(oc2Var);
                }
            } else {
                f118099a.add(oc2Var);
            }
        }
    }
}
