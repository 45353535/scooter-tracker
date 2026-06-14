package jf;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends AutoCloseable {

    public static final class a {
        public static void a(e eVar) {
            eVar.dispose();
        }
    }

    void O(Object obj);

    void dispose();

    Object h0();
}
