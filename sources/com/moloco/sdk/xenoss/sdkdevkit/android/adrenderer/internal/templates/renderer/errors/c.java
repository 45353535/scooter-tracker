package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56857h;

    public static final class a extends c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56858i = new a();

        public a() {
            super("net::ERR_ADDRESS_UNREACHABLE", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -557181147;
        }

        public String toString() {
            return "ERR_ADDRESS_UNREACHABLE";
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f56859i = new b();

        public b() {
            super("net::ERR_INTERNET_DISCONNECTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 909214677;
        }

        public String toString() {
            return "ERR_INTERNET_DISCONNECTED";
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c$c, reason: collision with other inner class name */
    public static final class C0727c extends c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0727c f56860i = new C0727c();

        public C0727c() {
            super("net::ERR_NAME_NOT_RESOLVED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0727c);
        }

        public int hashCode() {
            return -1297026924;
        }

        public String toString() {
            return "ERR_NAME_NOT_RESOLVED";
        }
    }

    public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56857h;
    }

    public c(String str) {
        super(-2, str, true, false, false, 16, null);
        this.f56857h = str;
    }
}
