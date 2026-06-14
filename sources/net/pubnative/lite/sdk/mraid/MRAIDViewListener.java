package net.pubnative.lite.sdk.mraid;

/* JADX INFO: loaded from: classes3.dex */
public interface MRAIDViewListener {
    void mraidHideCloseButton();

    void mraidHideSkipButton();

    void mraidShowCloseButton();

    void mraidShowSkipButton();

    void mraidViewClose(MRAIDView mRAIDView);

    void mraidViewError(MRAIDView mRAIDView);

    void mraidViewExpand(MRAIDView mRAIDView);

    void mraidViewLoaded(MRAIDView mRAIDView);

    boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13);

    void onCustomCTAClick();

    void onCustomCTALoadFail();

    void onCustomCTAShow();

    void onCustomEndCardClicked();

    void onCustomEndCardClosed();

    void onCustomEndCardLoadFail();

    void onCustomEndCardLoadSuccess();

    void onCustomEndCardShow(String str);

    void onExpandedAdClosed();

    void onReplayClicked();
}
