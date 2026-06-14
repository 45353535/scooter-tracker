package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k {

    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a f57754a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a companion) {
            super(null);
            Intrinsics.checkNotNullParameter(companion, "companion");
            this.f57754a = companion;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a a() {
            return this.f57754a;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a f57755a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a dec) {
            super(null);
            Intrinsics.checkNotNullParameter(dec, "dec");
            this.f57755a = dec;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a a() {
            return this.f57755a;
        }
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c f57756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c linear) {
            super(null);
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.f57756a = linear;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c a() {
            return this.f57756a;
        }
    }

    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f57757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q mraid) {
            super(null);
            Intrinsics.checkNotNullParameter(mraid, "mraid");
            this.f57757a = mraid;
        }

        public final q a() {
            return this.f57757a;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public k() {
    }
}
