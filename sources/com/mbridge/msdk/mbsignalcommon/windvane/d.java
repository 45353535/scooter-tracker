package com.mbridge.msdk.mbsignalcommon.windvane;

import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes10.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", MimeTypes.IMAGE_PNG),
    WEBP("webp", MimeTypes.IMAGE_WEBP),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49825b;

    d(String str, String str2) {
        this.f49824a = str;
        this.f49825b = str2;
    }

    public String d() {
        return this.f49825b;
    }

    public String g() {
        return this.f49824a;
    }
}
