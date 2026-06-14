package net.pubnative.lite.sdk.mraid.utils;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MraidCloseAdRepo {
    private static MraidCloseAdRepo instance;
    private boolean isAdSticky = false;
    private final List<ICloseAdObserver> observerList = new ArrayList();

    public interface ICloseAdObserver {
        void onCloseExpandedAd();
    }

    private MraidCloseAdRepo() {
    }

    public static MraidCloseAdRepo getInstance() {
        if (instance == null) {
            instance = new MraidCloseAdRepo();
        }
        return instance;
    }

    public boolean isStickyAd() {
        return this.isAdSticky;
    }

    public void notifyObservers() {
        if (this.isAdSticky) {
            for (ICloseAdObserver iCloseAdObserver : this.observerList) {
                if (iCloseAdObserver != null) {
                    iCloseAdObserver.onCloseExpandedAd();
                }
            }
            if (this.observerList.isEmpty()) {
                return;
            }
            this.observerList.clear();
            this.isAdSticky = false;
        }
    }

    public void notifyTabChanged() {
        notifyObservers();
    }

    public void registerExpandedAdCloseObserver(ICloseAdObserver iCloseAdObserver) {
        if (!this.isAdSticky || this.observerList.contains(iCloseAdObserver)) {
            return;
        }
        this.observerList.add(iCloseAdObserver);
    }

    public void setIsAdSticky(boolean z10) {
        this.isAdSticky = z10;
    }

    public void unregisterExpandedAdCloseObserver(ICloseAdObserver iCloseAdObserver) {
        if (this.isAdSticky) {
            this.observerList.remove(iCloseAdObserver);
        }
    }
}
