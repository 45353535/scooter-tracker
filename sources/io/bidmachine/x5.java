package io.bidmachine;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
abstract class x5 implements AdProcessCallback {
    x5() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(Map map) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processStartVisibilityTracker() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public boolean processVisibilityTrackerShown() {
        return false;
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(io.bidmachine.core.k kVar) {
    }
}
