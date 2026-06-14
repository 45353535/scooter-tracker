package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Qe {
    public a others;
    public a wifi;

    public static final class a {
        private int maxBatchSize;
        private int minBatchSize;
        private long retryInterval;

        public final void a(long j10) {
            this.retryInterval = j10;
        }

        public final int b() {
            return this.minBatchSize;
        }

        public final long c() {
            return this.retryInterval;
        }

        public final int a() {
            return this.maxBatchSize;
        }

        public final void b(int i10) {
            this.maxBatchSize = i10;
        }

        public final void c(int i10) {
            this.minBatchSize = i10;
        }

        public final boolean a(int i10) {
            int i11;
            int i12 = this.maxBatchSize;
            return i12 <= i10 && this.retryInterval > 0 && i12 > 0 && (i11 = this.minBatchSize) > 0 && i11 <= i12;
        }
    }
}
