package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56851h;

    public static final class a extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56852i = new a();

        public a() {
            super("net::ERR_CONNECTION_ABORTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -262105110;
        }

        public String toString() {
            return "ERR_CONNECTION_ABORTED";
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b$b, reason: collision with other inner class name */
    public static final class C0726b extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0726b f56853i = new C0726b();

        public C0726b() {
            super("net::ERR_CONNECTION_CLOSED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0726b);
        }

        public int hashCode() {
            return -219055663;
        }

        public String toString() {
            return "ERR_CONNECTION_CLOSED";
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f56854i = new c();

        public c() {
            super("net::ERR_CONNECTION_REFUSED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2018219755;
        }

        public String toString() {
            return "ERR_CONNECTION_REFUSED";
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f56855i = new d();

        public d() {
            super("net::ERR_CONNECTION_RESET", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 976412714;
        }

        public String toString() {
            return "ERR_CONNECTION_RESET";
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e f56856i = new e();

        public e() {
            super("net::ERR_SOCKET_NOT_CONNECTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1961158189;
        }

        public String toString() {
            return "ERR_SOCKET_NOT_CONNECTED";
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56851h;
    }

    public b(String str) {
        super(-6, str, true, false, false, 16, null);
        this.f56851h = str;
    }
}
