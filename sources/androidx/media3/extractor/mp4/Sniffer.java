package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.media3.extractor.SniffFailure sniffInternal(androidx.media3.extractor.ExtractorInput r25, boolean r26, boolean r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Sniffer.sniffInternal(androidx.media3.extractor.ExtractorInput, boolean, boolean):androidx.media3.extractor.SniffFailure");
    }

    @Nullable
    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z10) throws IOException {
        return sniffInternal(extractorInput, false, z10);
    }
}
