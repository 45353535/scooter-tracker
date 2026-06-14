package ae;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    public static void a(j jVar) {
        try {
            jVar.onRun();
        } catch (Throwable th2) {
            try {
                jVar.c(th2);
            } catch (Throwable unused) {
            }
        }
    }
}
