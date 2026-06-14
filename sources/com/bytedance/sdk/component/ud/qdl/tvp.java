package com.bytedance.sdk.component.ud.qdl;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class tvp {
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16709ud;

    private tvp(String str) {
        this.qdl = str;
    }

    public static tvp qdl(String str) {
        return new tvp(str);
    }

    public String qdl() {
        return this.qdl;
    }

    public Charset qdl(Charset charset) {
        try {
            String str = this.f16709ud;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
