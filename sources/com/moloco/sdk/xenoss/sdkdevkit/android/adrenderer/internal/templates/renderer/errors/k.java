package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56880h;

    public static final class a extends k {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56881i = new a();

        public a() {
            super("net::ERR_UNKNOWN_URL_SCHEME", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 284504500;
        }

        public String toString() {
            return "ERR_UNKNOWN_URL_SCHEME";
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56880h;
    }

    public k(String str) {
        super(-10, str, false, true, false, 16, null);
        this.f56880h = str;
    }
}
