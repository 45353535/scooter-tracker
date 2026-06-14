package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58234a = new a();

        public a() {
            super(null);
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58235a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f58236a = new c();

        public c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$d, reason: collision with other inner class name */
    public static final class C0769d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l f58237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0769d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f58237a = error;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l a() {
            return this.f58237a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0769d) && this.f58237a == ((C0769d) obj).f58237a;
        }

        public int hashCode() {
            return this.f58237a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f58237a + ')';
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f58238a = new e();

        public e() {
            super(null);
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public d() {
    }
}
