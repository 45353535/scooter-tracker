package f1;

/* JADX INFO: loaded from: classes6.dex */
public interface lg {

    public static final class a {
        public static /* synthetic */ void a(lg lgVar, long j10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProgressUpdate");
            }
            if ((i10 & 1) != 0) {
                j10 = 500;
            }
            lgVar.a(j10);
        }
    }

    public interface b {
        long a();
    }

    void a();

    void a(long j10);
}
