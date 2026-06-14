package t9;

/* JADX INFO: loaded from: classes12.dex */
public interface d {
    Object dequeueInputBuffer();

    Object dequeueOutputBuffer();

    void flush();

    void queueInputBuffer(Object obj);

    void release();

    void setOutputStartTimeUs(long j10);
}
