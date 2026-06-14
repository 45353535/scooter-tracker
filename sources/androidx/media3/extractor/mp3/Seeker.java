package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes5.dex */
interface Seeker extends SeekMap {

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return -2147483647;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getTimeUs(long j10);
}
