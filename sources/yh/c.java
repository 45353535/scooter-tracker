package yh;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {
    public static boolean a(d dVar, zh.b bVar) {
        int iG = bVar.g();
        if (iG == 0) {
            return dVar.l();
        }
        if (iG == 10) {
            return dVar.k();
        }
        if (iG == 20) {
            return dVar.d();
        }
        if (iG == 30) {
            return dVar.j();
        }
        if (iG == 40) {
            return dVar.g();
        }
        throw new IllegalArgumentException("Level [" + bVar + "] not recognized.");
    }
}
