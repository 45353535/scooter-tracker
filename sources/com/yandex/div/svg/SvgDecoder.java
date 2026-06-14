package com.yandex.div.svg;

import a1.g;
import a1.j;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/svg/SvgDecoder;", "", "useViewBoundsAsIntrinsicSize", "", "(Z)V", "decode", "Landroid/graphics/drawable/PictureDrawable;", "source", "Ljava/io/InputStream;", "div-svg_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder(boolean z10) {
        this.useViewBoundsAsIntrinsicSize = z10;
    }

    @Nullable
    public final PictureDrawable decode(@NotNull InputStream source) {
        float fH;
        float f10;
        try {
            g gVarL = g.l(source);
            RectF rectFG = gVarL.g();
            if (!this.useViewBoundsAsIntrinsicSize || rectFG == null) {
                fH = gVarL.h();
                f10 = gVarL.f();
            } else {
                fH = rectFG.width();
                f10 = rectFG.height();
            }
            if (rectFG == null && fH > 0.0f && f10 > 0.0f) {
                gVarL.t(0.0f, 0.0f, fH, f10);
            }
            return new PictureDrawable(gVarL.o());
        } catch (j unused) {
            return null;
        }
    }

    public /* synthetic */ SvgDecoder(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
