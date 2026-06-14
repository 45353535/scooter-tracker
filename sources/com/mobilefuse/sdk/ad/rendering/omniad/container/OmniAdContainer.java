package com.mobilefuse.sdk.ad.rendering.omniad.container;

import android.graphics.Point;
import com.mobilefuse.sdk.ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH&J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0007H&J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH&J\b\u0010&\u001a\u00020\u001dH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "", "currentPosition", "Landroid/graphics/Point;", "getCurrentPosition", "()Landroid/graphics/Point;", "currentScale", "", "getCurrentScale", "()F", "currentSize", "getCurrentSize", "defaultPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "getDefaultPositionModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "defaultScaleModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "getDefaultScaleModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "getDefaultSizeModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "floatingContainer", "Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;", "getFloatingContainer", "()Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;", "changePosition", "", "x", "", "y", "changeScale", "scale", "changeSize", "width", "height", "destroy", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface OmniAdContainer {
    void changePosition(int x10, int y10);

    void changeScale(float scale);

    void changeSize(int width, int height);

    void destroy();

    @NotNull
    Point getCurrentPosition();

    float getCurrentScale();

    @NotNull
    Point getCurrentSize();

    @NotNull
    PositionModifier getDefaultPositionModifier();

    @NotNull
    ScaleModifier getDefaultScaleModifier();

    @NotNull
    SizeModifier getDefaultSizeModifier();

    @NotNull
    FloatingContainer getFloatingContainer();
}
