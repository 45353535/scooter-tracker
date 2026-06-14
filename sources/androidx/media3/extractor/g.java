package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {
    public static int a(TrackOutput trackOutput, DataReader dataReader, int i10, boolean z10) {
        return trackOutput.sampleData(dataReader, i10, z10, 0);
    }

    public static void b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i10) {
        trackOutput.sampleData(parsableByteArray, i10, 0);
    }
}
