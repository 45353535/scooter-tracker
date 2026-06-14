package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56877h;

    public static final class a extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f56878i = new a();

        public a() {
            super("net::ERR_CONNECTION_TIMED_OUT", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -56384004;
        }

        public String toString() {
            return "ERR_CONNECTION_TIMED_OUT";
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f56879i = new b();

        public b() {
            super("net::ERR_TIMED_OUT", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 389383759;
        }

        public String toString() {
            return "ERR_TIMED_OUT";
        }
    }

    public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public String c() {
        return this.f56877h;
    }

    public j(String str) {
        super(-8, str, true, false, false, 16, null);
        this.f56877h = str;
    }
}
