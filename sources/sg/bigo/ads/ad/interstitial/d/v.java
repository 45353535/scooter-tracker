package sg.bigo.ads.ad.interstitial.d;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends t {
    public v(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.t
    protected final boolean B() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.t
    protected final int[] z() {
        int i10;
        int i11;
        if (x() == 1) {
            i10 = ViewCompat.MEASURED_SIZE_MASK;
            i11 = -1;
        } else {
            i10 = 2105636;
            i11 = ViewCompat.MEASURED_STATE_MASK;
        }
        return new int[]{i10, i11};
    }
}
