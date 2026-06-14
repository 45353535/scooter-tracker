package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f30 {
    public static void a(c30 c30Var) {
        if (c30Var != null) {
            try {
                c30Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
