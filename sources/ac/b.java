package ac;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import dc.s;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.NetworkAdapter;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends BidMachineAd implements o {
    public b(Context context) {
        super(context, AdsType.Native);
    }

    private boolean i() {
        if (getLoadedAdObject() != null) {
            return true;
        }
        log("not loaded, please load ads first");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g createAdObject(ContextProvider contextProvider, p pVar, NetworkAdapter networkAdapter, zb.b bVar, AdProcessCallback adProcessCallback) {
        od.l lVarCreateNativeAd = networkAdapter.createNativeAd();
        if (lVarCreateNativeAd == null) {
            return null;
        }
        return new g(contextProvider, adProcessCallback, pVar, bVar, lVarCreateNativeAd);
    }

    public o c() {
        return (o) getLoadedAdObject();
    }

    public String d() {
        if (i()) {
            return ((g) getLoadedAdObject()).B();
        }
        return null;
    }

    public String e() {
        if (i()) {
            return ((g) getLoadedAdObject()).D();
        }
        return null;
    }

    public View f(Context context) {
        if (i()) {
            return ((g) getLoadedAdObject()).E(context);
        }
        return null;
    }

    public float g() {
        if (i()) {
            return ((g) getLoadedAdObject()).F();
        }
        return -1.0f;
    }

    @Override // ac.o
    public ImageData getIcon() {
        if (i()) {
            return ((g) getLoadedAdObject()).getIcon();
        }
        return null;
    }

    @Override // ac.o
    public ImageData getMainImage() {
        if (i()) {
            return ((g) getLoadedAdObject()).getMainImage();
        }
        return null;
    }

    public String h() {
        if (i()) {
            return ((g) getLoadedAdObject()).H();
        }
        return null;
    }

    @Override // ac.o
    public boolean hasVideo() {
        return i() && ((g) getLoadedAdObject()).hasVideo();
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    public void j(ViewGroup viewGroup, View view, s sVar, Set set) {
        g gVar = (g) prepareShow();
        if (gVar == null) {
            return;
        }
        gVar.M(viewGroup, view, sVar, set, this.rendererConfiguration);
    }

    public void k() {
        if (i()) {
            ((g) getLoadedAdObject()).R();
        }
    }
}
