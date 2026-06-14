package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f {
    public static int a(TrackOutput trackOutput, DataReader dataReader, int i10, boolean z10) {
        return trackOutput.sampleData(dataReader, i10, z10, 0);
    }

    public static void b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i10) {
        trackOutput.sampleData(parsableByteArray, i10, 0);
    }
}
