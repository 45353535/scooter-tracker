package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f56883i;

    public static final class a extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f56884j = new a();

        public a() {
            super("net::ERR_BLOCKED_BY_ORTB", false, 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2086682310;
        }

        public String toString() {
            return "ERR_BLOCKED_BY_ORTB";
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f56885j = new b();

        public b() {
            super("net::ERR_CLEARTEXT_NOT_PERMITTED", false, 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1499225977;
        }

        public String toString() {
            return "ERR_CLEARTEXT_NOT_PERMITTED";
        }
    }

    public static final class c extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f56886j = new c();

        public c() {
            super("net::ERR_FAILED", true, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1678282877;
        }

        public String toString() {
            return "ERR_FAILED";
        }
    }

    public static final class d extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f56887j = new d();

        public d() {
            super("net::ERR_HTTP2_PING_FAILED", false, 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 505018197;
        }

        public String toString() {
            return "ERR_HTTP2_PING_FAILED";
        }
    }

    public static final class e extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f56888j = new e();

        public e() {
            super("net::ERR_HTTP2_PROTOCOL_ERROR", false, 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1437709814;
        }

        public String toString() {
            return "ERR_HTTP2_PROTOCOL_ERROR";
        }
    }

    public static final class f extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final f f56889j = new f();

        public f() {
            super("net::ERR_NETWORK_CHANGED", false, 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1485714141;
        }

        public String toString() {
            return "ERR_NETWORK_CHANGED";
        }
    }

    public static final class g extends l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g f56890j = new g();

        public g() {
            super("net::ERR_QUIC_PROTOCOL_ERROR", false, 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1472226974;
        }

        public String toString() {
            return "ERR_QUIC_PROTOCOL_ERROR";
        }
    }

    public /* synthetic */ l(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56882h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public boolean d() {
        return this.f56883i;
    }

    public l(String str, boolean z10) {
        super(-1, str, true, false, z10, null);
        this.f56882h = str;
        this.f56883i = z10;
    }

    public /* synthetic */ l(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10, null);
    }
}
