package androidx.media3.common.util;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface TimestampIterator {
    TimestampIterator copyOf();

    long getLastTimestampUs();

    boolean hasNext();

    long next();
}
