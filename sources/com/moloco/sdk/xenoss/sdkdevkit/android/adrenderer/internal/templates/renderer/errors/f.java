package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56865h;

    public static final class a extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56866i = new a();

        public a() {
            super("net::ERR_SSL_BAD_RECORD_MAC_ALERT", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1157822157;
        }

        public String toString() {
            return "ERR_SSL_BAD_RECORD_MAC_ALERT";
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f56867i = new b();

        public b() {
            super("net::ERR_SSL_PROTOCOL_ERROR", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -715617482;
        }

        public String toString() {
            return "ERR_SSL_PROTOCOL_ERROR";
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f56868i = new c();

        public c() {
            super("net::ERR_SSL_VERSION_OR_CIPHER_MISMATCH", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 516103234;
        }

        public String toString() {
            return "ERR_SSL_VERSION_OR_CIPHER_MISMATCH";
        }
    }

    public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56865h;
    }

    public f(String str) {
        super(-11, str, false, true, false, 16, null);
        this.f56865h = str;
    }
}
