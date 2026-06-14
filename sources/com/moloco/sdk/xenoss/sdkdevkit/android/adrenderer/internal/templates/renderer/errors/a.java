package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56849h;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a$a, reason: collision with other inner class name */
    public static final class C0725a extends a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0725a f56850i = new C0725a();

        public C0725a() {
            super("net::ERR_CERT_AUTHORITY_INVALID", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0725a);
        }

        public int hashCode() {
            return -932810174;
        }

        public String toString() {
            return "ERR_CERT_AUTHORITY_INVALID";
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56849h;
    }

    public a(String str) {
        super(0, str, false, true, false, 16, null);
        this.f56849h = str;
    }
}
