package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f36624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f36625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f36626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f36627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fe f36628e;

    public Be(ViewGroup parentView, ImageView imageView, MediaView mediaView, List friendlyViews, Fe nativeVisibilitySpec) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        Intrinsics.checkNotNullParameter(nativeVisibilitySpec, "nativeVisibilitySpec");
        this.f36624a = parentView;
        this.f36625b = imageView;
        this.f36626c = mediaView;
        this.f36627d = friendlyViews;
        this.f36628e = nativeVisibilitySpec;
    }
}
