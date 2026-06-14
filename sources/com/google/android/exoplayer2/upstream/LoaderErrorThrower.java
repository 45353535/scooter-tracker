package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public interface LoaderErrorThrower {

    public static final class Dummy implements LoaderErrorThrower {
        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i10) {
        }
    }

    void maybeThrowError() throws IOException;

    void maybeThrowError(int i10) throws IOException;
}
