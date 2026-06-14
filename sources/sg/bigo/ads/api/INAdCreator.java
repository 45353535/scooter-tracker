package sg.bigo.ads.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.d.e;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class INAdCreator implements k.a<s> {
    @Override // sg.bigo.ads.ad.interstitial.k.a
    public s getAdInstance(@NonNull f fVar) {
        return fVar.f102174a.x() == 20 ? new e(fVar) : new s(fVar);
    }
}
