package aa;

import oa.s;
import oa.t;

/* JADX INFO: loaded from: classes12.dex */
public interface f {
    boolean a(s sVar);

    void b(t tVar);

    boolean isPackedAudioExtractor();

    boolean isReusable();

    void onTruncatedSegmentParsed();

    f recreate();
}
