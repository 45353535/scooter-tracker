package net.pubnative.lite.sdk.vpaid;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements CloseButtonListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoAdInternal f96068a;

    public /* synthetic */ i(BaseVideoAdInternal baseVideoAdInternal) {
        this.f96068a = baseVideoAdInternal;
    }

    @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
    public final void onCloseButtonVisible() {
        this.f96068a.onAdCloseButtonVisible();
    }
}
