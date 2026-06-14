package s9;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {
    public static void a(g gVar) {
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
