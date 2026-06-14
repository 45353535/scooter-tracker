package io.bidmachine.iab.mraid;

import id.z0;

/* JADX INFO: loaded from: classes12.dex */
public interface g {
    void onCalendarEvent(f fVar, String str, b9.f fVar2);

    void onClose(f fVar);

    void onExpired(f fVar, y8.b bVar);

    void onLoadFailed(f fVar, y8.b bVar);

    void onLoaded(f fVar);

    void onOpenPrivacySheet(f fVar, z0 z0Var);

    void onOpenUrl(f fVar, String str, b9.f fVar2);

    void onPlayVideo(f fVar, String str);

    void onShowFailed(f fVar, y8.b bVar);

    void onShown(f fVar);

    void onStorePicture(f fVar, String str, b9.f fVar2);
}
