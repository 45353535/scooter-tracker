package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56863h;

    public static final class a extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56864i = new a();

        public a() {
            super("net::ERR_TOO_MANY_REDIRECTS", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1800342769;
        }

        public String toString() {
            return "ERR_TOO_MANY_REDIRECTS";
        }
    }

    public /* synthetic */ e(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56863h;
    }

    public e(String str) {
        super(-9, str, true, true, false, 16, null);
        this.f56863h = str;
    }
}
