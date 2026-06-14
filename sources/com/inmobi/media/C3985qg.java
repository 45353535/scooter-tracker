package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Window;
import com.inmobi.media.C3985qg;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3985qg extends AbstractC4045t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f39390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f39391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3985qg(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f39390b = window;
        this.f39391c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.f39390b.getDecorView().getWidth();
        int height = this.f39390b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int layerType = this.f39390b.getDecorView().getLayerType();
        this.f39390b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f39390b, rect, bitmapCreateBitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: w3.ma
            public final void onPixelCopyFinished(int i10) {
                C3985qg.a(ref$BooleanRef, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f39391c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.f39390b.getDecorView().setLayerType(layerType, null);
        if (ref$BooleanRef.f93279b) {
            return a(bitmapCreateBitmap);
        }
        return null;
    }

    public static final void a(Ref$BooleanRef ref$BooleanRef, C3985qg c3985qg, int i10) {
        if (i10 == 0) {
            ref$BooleanRef.f93279b = true;
        }
        boolean z10 = ref$BooleanRef.f93279b;
        c3985qg.f39391c.set(true);
    }
}
