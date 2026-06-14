package com.appodeal.ads;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/MrecCallbacks;", "", "onMrecLoaded", "", "isPrecache", "", "onMrecFailedToLoad", "onMrecShown", "onMrecShowFailed", "onMrecClicked", "onMrecExpired", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MrecCallbacks {
    void onMrecClicked();

    void onMrecExpired();

    void onMrecFailedToLoad();

    void onMrecLoaded(boolean isPrecache);

    void onMrecShowFailed();

    void onMrecShown();
}
