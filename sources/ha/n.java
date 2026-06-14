package ha;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f73059a = new a();

    class a implements n {
        a() {
        }

        @Override // ha.n
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // ha.n
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // ha.n
        public boolean next() {
            return false;
        }
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    boolean next();
}
