package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56861h;

    public static final class a extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56862i = new a();

        public a() {
            super("net::ERR_PROXY_CONNECTION_FAILED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 120626217;
        }

        public String toString() {
            return "ERR_PROXY_CONNECTION_FAILED";
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56861h;
    }

    public d(String str) {
        super(-5, str, false, true, false, 16, null);
        this.f56861h = str;
    }
}
