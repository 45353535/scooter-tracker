package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: loaded from: classes10.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52321b;

    a(int i10, String str) {
        this.f52320a = i10;
        this.f52321b = str;
    }

    public int d() {
        return this.f52320a;
    }

    public String g() {
        return this.f52321b;
    }
}
