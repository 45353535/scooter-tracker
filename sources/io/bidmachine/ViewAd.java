package io.bidmachine;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import od.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ViewAd<AdType extends ViewAd<AdType, AdRequestType, AdObjectType, UnifiedAdRequestParamsType, AdListenerType>, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ViewAdObject<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends od.d, AdListenerType extends AdListener<AdType>> extends BidMachineAd<AdType, AdRequestType, AdObjectType, zb.b, UnifiedAdRequestParamsType, AdListenerType> {
    protected ViewAd(@NonNull Context context, @NonNull AdsType adsType) {
        super(context, adsType);
    }

    void hide() {
        AdObjectType loadedAdObject = getLoadedAdObject();
        if (loadedAdObject == null) {
            return;
        }
        loadedAdObject.hide();
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    void show(ViewGroup viewGroup) {
        AdObjectType adobjecttypePrepareShow = prepareShow();
        if (adobjecttypePrepareShow == null) {
            return;
        }
        try {
            adobjecttypePrepareShow.show(viewGroup, this.rendererConfiguration);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            processShowFail(ae.a.l("Exception showing view ad object", th2));
        }
    }
}
