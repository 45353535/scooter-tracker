package io.bidmachine.iab.mraid;

import id.z0;

/* JADX INFO: loaded from: classes12.dex */
public interface t {
    void onCalendarEvent(s sVar, String str, b9.f fVar);

    void onClose(s sVar);

    void onExpand(s sVar);

    void onExpired(s sVar, y8.b bVar);

    void onLoadFailed(s sVar, y8.b bVar);

    void onLoaded(s sVar);

    void onOpenPrivacySheet(s sVar, z0 z0Var);

    void onOpenUrl(s sVar, String str, b9.f fVar);

    void onPlayVideo(s sVar, String str);

    void onShowFailed(s sVar, y8.b bVar);

    void onShown(s sVar);

    void onStorePicture(s sVar, String str, b9.f fVar);
}
