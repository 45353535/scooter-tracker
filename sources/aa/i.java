package aa;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends IOException {
    public i(String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }
}
