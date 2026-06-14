package net.pubnative.lite.sdk.utils.svgparser;

import android.graphics.Picture;
import java.io.InputStream;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;

/* JADX INFO: loaded from: classes3.dex */
public class SVG {
    private static final String VERSION = "1.5";
    private SVGBase base;

    SVG(SVGBase sVGBase) {
        this.base = sVGBase;
    }

    public static SVG getFromInputStream(InputStream inputStream) {
        return new SVG(SVGBase.getFromInputStream(inputStream));
    }

    public static SVG getFromString(String str) {
        return new SVG(SVGBase.getFromString(str));
    }

    public Picture renderToPicture() {
        return this.base.renderToPicture(null);
    }

    public Picture renderToPicture(int i10, int i11) {
        return renderToPicture(i10, i11, null);
    }

    public Picture renderToPicture(int i10, int i11, RenderOptions renderOptions) {
        return this.base.renderToPicture(i10, i11, renderOptions);
    }
}
