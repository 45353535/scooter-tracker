package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f57764a = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$b, reason: collision with other inner class name */
    public static final class C0752b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0752b f57765a = new C0752b();

        public C0752b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f57766a = new c();

        public c() {
            super(null);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f57767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f57767a = error;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c a() {
            return this.f57767a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f57767a, ((d) obj).f57767a);
        }

        public int hashCode() {
            return this.f57767a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f57767a + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public b() {
    }
}
