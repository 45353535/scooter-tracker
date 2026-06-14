package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.AbstractC0672a f54984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54986c;

    public static final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f54987d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.AbstractC0672a.C0673a originAsset) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.f54987d = originAsset.c();
        }

        public final String b() {
            return this.f54987d;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$b, reason: collision with other inner class name */
    public static final class C0674b extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f54988d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0674b(a.AbstractC0672a.b originAsset, Uri precachedAssetUri) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            Intrinsics.checkNotNullParameter(precachedAssetUri, "precachedAssetUri");
            this.f54988d = precachedAssetUri;
        }

        public final Uri b() {
            return this.f54988d;
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f54989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a.AbstractC0672a.c originAsset) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.f54989d = originAsset.c();
        }

        public final String b() {
            return this.f54989d;
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f54990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.AbstractC0672a.d originAsset, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a vastAd) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            Intrinsics.checkNotNullParameter(vastAd, "vastAd");
            this.f54990d = vastAd;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a b() {
            return this.f54990d;
        }
    }

    public /* synthetic */ b(a.AbstractC0672a abstractC0672a, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0672a);
    }

    public final a.AbstractC0672a a() {
        return this.f54984a;
    }

    public b(a.AbstractC0672a abstractC0672a) {
        this.f54984a = abstractC0672a;
        this.f54985b = abstractC0672a.a();
        this.f54986c = abstractC0672a.b();
    }
}
