package hb;

import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
interface g extends m0 {

    public static class a extends m0.b implements g {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // hb.g
        public int getAverageBitrate() {
            return -2147483647;
        }

        @Override // hb.g
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // hb.g
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getTimeUs(long j10);
}
