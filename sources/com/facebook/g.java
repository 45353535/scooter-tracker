package com.facebook;

/* JADX INFO: loaded from: classes7.dex */
public enum g {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19820b;

    g(boolean z10) {
        this.f19820b = z10;
    }

    public final boolean g() {
        return this.f19820b;
    }
}
