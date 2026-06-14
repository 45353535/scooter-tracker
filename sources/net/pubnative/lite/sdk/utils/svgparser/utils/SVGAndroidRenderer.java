package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;

/* JADX INFO: loaded from: classes3.dex */
public class SVGAndroidRenderer {
    private static final float BEZIER_ARC_FACTOR = 0.5522848f;
    private static final String DEFAULT_FONT_FAMILY = "serif";
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;
    private static final Pattern PATTERN_DOUBLE_SPACES;
    private static final Pattern PATTERN_END_SPACES;
    private static final Pattern PATTERN_LINE_BREAKS;
    private static final Pattern PATTERN_START_SPACES;
    private static final Pattern PATTERN_TABS;
    private static final Pattern PATTERN_TABS_OR_LINE_BREAKS;
    private static final boolean SUPPORTS_BLEND_MODE;
    private static final boolean SUPPORTS_FONT_HINTING;
    private static final boolean SUPPORTS_PAINT_FONT_FEATURE_SETTINGS;
    private static final boolean SUPPORTS_PAINT_FONT_VARIATION_SETTINGS;
    private static final boolean SUPPORTS_PAINT_LETTER_SPACING;
    private static final boolean SUPPORTS_PAINT_WORD_SPACING;
    private static final boolean SUPPORTS_PATH_OP;
    private static final boolean SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS;
    private static final boolean SUPPORTS_SAVE_LAYER_FLAGLESS;
    private static final boolean SUPPORTS_STROKED_UNDERLINES;
    private static final String TAG = "SVGAndroidRenderer";
    private static HashSet<String> supportedFeatures;
    private final Canvas canvas;
    private SVGBase document;
    private final float dpi;
    private SVGExternalFileResolver externalFileResolver;
    private Stack<Matrix> matrixStack;
    private Stack<SVGBase.SvgContainer> parentStack;
    private CSSParser.RuleMatchContext ruleMatchContext = null;
    private RendererState state;
    private Stack<RendererState> stateStack;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin;

        static {
            int[] iArr = new int[Style.LineJoin.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin = iArr;
            try {
                iArr[Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin[Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin[Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Style.LineCap.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap = iArr2;
            try {
                iArr2[Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap[Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap[Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[Style.CSSBlendMode.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode = iArr4;
            try {
                iArr4[Style.CSSBlendMode.multiply.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.screen.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.darken.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.lighten.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.color_dodge.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.color_burn.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.hard_light.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.soft_light.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.difference.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.exclusion.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.hue.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.saturation.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.color.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.luminosity.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[Style.CSSBlendMode.normal.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private class MarkerPositionCalculator implements SVGBase.PathInterface {
        private boolean closepathReAdjustPending;
        private MarkerVector lastPos;
        private final List<MarkerVector> markers;
        private boolean normalCubic;
        private boolean startArc;
        private float startX;
        private float startY;
        private int subpathStartIndex;

        MarkerPositionCalculator(SVGBase.PathDefinition pathDefinition) {
            ArrayList arrayList = new ArrayList();
            this.markers = arrayList;
            this.lastPos = null;
            this.startArc = false;
            this.normalCubic = true;
            this.subpathStartIndex = -1;
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
            if (this.closepathReAdjustPending) {
                this.lastPos.add((MarkerVector) arrayList.get(this.subpathStartIndex));
                arrayList.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                arrayList.add(markerVector);
            }
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.startArc = true;
            this.normalCubic = false;
            MarkerVector markerVector = this.lastPos;
            SVGAndroidRenderer.arcTo(markerVector.f95984x, markerVector.f95985y, f10, f11, f12, z10, z11, f13, f14, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f10, f11);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = new MarkerVector(f14, f15, f14 - f12, f15 - f13);
            this.closepathReAdjustPending = false;
        }

        List<MarkerVector> getMarkers() {
            return this.markers;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f10, float f11) {
            this.lastPos.add(f10, f11);
            this.markers.add(this.lastPos);
            MarkerVector markerVector = this.lastPos;
            this.lastPos = new MarkerVector(f10, f11, f10 - markerVector.f95984x, f11 - markerVector.f95985y);
            this.closepathReAdjustPending = false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f10, float f11) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
            this.startX = f10;
            this.startY = f11;
            this.lastPos = new MarkerVector(f10, f11, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f10, float f11, float f12, float f13) {
            this.lastPos.add(f10, f11);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(f12, f13, f12 - f10, f13 - f11);
            this.closepathReAdjustPending = false;
        }
    }

    protected static class PathConverter implements SVGBase.PathInterface {
        float lastX;
        float lastY;
        final Path path = new Path();

        PathConverter(SVGBase.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f10, f11, f12, z10, z11, f13, f14, this);
            this.lastX = f13;
            this.lastY = f14;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            this.path.close();
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.path.cubicTo(f10, f11, f12, f13, f14, f15);
            this.lastX = f14;
            this.lastY = f15;
        }

        Path getPath() {
            return this.path;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f10, float f11) {
            this.path.lineTo(f10, f11);
            this.lastX = f10;
            this.lastY = f11;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f10, float f11) {
            this.path.moveTo(f10, f11);
            this.lastX = f10;
            this.lastY = f11;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f10, float f11, float f12, float f13) {
            this.path.quadTo(f10, f11, f12, f13);
            this.lastX = f12;
            this.lastY = f13;
        }
    }

    private class PathTextDrawer extends PlainTextDrawer {
        private final Path path;

        PathTextDrawer(Path path, float f10, float f11) {
            super(f10, f11);
            this.path = path;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.PlainTextDrawer, net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            float fFloatValue;
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.SUPPORTS_PAINT_LETTER_SPACING) {
                    SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
                    fFloatValue = sVGAndroidRenderer.state.style.letterSpacing.floatValue(sVGAndroidRenderer) / 2.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                SVGAndroidRenderer sVGAndroidRenderer2 = SVGAndroidRenderer.this;
                RendererState rendererState = sVGAndroidRenderer2.state;
                if (rendererState.hasFill) {
                    sVGAndroidRenderer2.canvas.drawTextOnPath(str, this.path, this.f95986x - fFloatValue, this.f95987y, rendererState.fillPaint);
                }
                SVGAndroidRenderer sVGAndroidRenderer3 = SVGAndroidRenderer.this;
                RendererState rendererState2 = sVGAndroidRenderer3.state;
                if (rendererState2.hasStroke) {
                    sVGAndroidRenderer3.canvas.drawTextOnPath(str, this.path, this.f95986x - fFloatValue, this.f95987y, rendererState2.strokePaint);
                }
            }
            float f10 = this.f95986x;
            SVGAndroidRenderer sVGAndroidRenderer4 = SVGAndroidRenderer.this;
            this.f95986x = f10 + sVGAndroidRenderer4.measureText(str, sVGAndroidRenderer4.state.fillPaint);
        }
    }

    private class PlainTextDrawer extends TextProcessor {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        float f95986x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        float f95987y;

        PlainTextDrawer(float f10, float f11) {
            super();
            this.f95986x = f10;
            this.f95987y = f11;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            float fFloatValue;
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.SUPPORTS_PAINT_LETTER_SPACING) {
                    SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
                    fFloatValue = sVGAndroidRenderer.state.style.letterSpacing.floatValue(sVGAndroidRenderer) / 2.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                SVGAndroidRenderer sVGAndroidRenderer2 = SVGAndroidRenderer.this;
                RendererState rendererState = sVGAndroidRenderer2.state;
                if (rendererState.hasFill) {
                    sVGAndroidRenderer2.canvas.drawText(str, this.f95986x - fFloatValue, this.f95987y, rendererState.fillPaint);
                }
                SVGAndroidRenderer sVGAndroidRenderer3 = SVGAndroidRenderer.this;
                RendererState rendererState2 = sVGAndroidRenderer3.state;
                if (rendererState2.hasStroke) {
                    sVGAndroidRenderer3.canvas.drawText(str, this.f95986x - fFloatValue, this.f95987y, rendererState2.strokePaint);
                }
            }
            float f10 = this.f95986x;
            SVGAndroidRenderer sVGAndroidRenderer4 = SVGAndroidRenderer.this;
            this.f95986x = f10 + sVGAndroidRenderer4.measureText(str, sVGAndroidRenderer4.state.fillPaint);
        }
    }

    private class PlainTextToPath extends TextProcessor {
        final Path textAsPath;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        float f95988x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        float f95989y;

        PlainTextToPath(float f10, float f11, Path path) {
            super();
            this.f95988x = f10;
            this.f95989y = f11;
            this.textAsPath = path;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVGBase.TextContainer textContainer) {
            if (!(textContainer instanceof SVGBase.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            String str2;
            if (SVGAndroidRenderer.this.visible()) {
                Path path = new Path();
                str2 = str;
                SVGAndroidRenderer.this.state.fillPaint.getTextPath(str2, 0, str.length(), this.f95988x, this.f95989y, path);
                this.textAsPath.addPath(path);
            } else {
                str2 = str;
            }
            float f10 = this.f95988x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.f95988x = f10 + sVGAndroidRenderer.measureText(str2, sVGAndroidRenderer.state.fillPaint);
        }
    }

    private class TextBoundsCalculator extends TextProcessor {
        final RectF bbox;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        float f95990x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        float f95991y;

        TextBoundsCalculator(float f10, float f11) {
            super();
            this.bbox = new RectF();
            this.f95990x = f10;
            this.f95991y = f11;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVGBase.TextContainer textContainer) {
            if (!(textContainer instanceof SVGBase.TextPath)) {
                return true;
            }
            SVGBase.TextPath textPath = (SVGBase.TextPath) textContainer;
            SVGBase.SvgObject svgObjectResolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (svgObjectResolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVGBase.Path path = (SVGBase.Path) svgObjectResolveIRI;
            Path path2 = new PathConverter(path.f96002d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f95990x, this.f95991y);
                this.bbox.union(rectF);
            }
            float f10 = this.f95990x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.f95990x = f10 + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }
    }

    private static abstract class TextProcessor {
        public boolean doTextContainer(SVGBase.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);

        private TextProcessor() {
        }
    }

    private class TextWidthCalculator extends TextProcessor {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        float f95992x;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            float f10 = this.f95992x;
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            this.f95992x = f10 + sVGAndroidRenderer.measureText(str, sVGAndroidRenderer.state.fillPaint);
        }

        private TextWidthCalculator() {
            super();
            this.f95992x = 0.0f;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        SUPPORTS_FONT_HINTING = true;
        SUPPORTS_STROKED_UNDERLINES = true;
        SUPPORTS_PATH_OP = true;
        SUPPORTS_PAINT_FONT_FEATURE_SETTINGS = true;
        SUPPORTS_PAINT_LETTER_SPACING = true;
        SUPPORTS_PAINT_FONT_VARIATION_SETTINGS = i10 >= 26;
        SUPPORTS_BLEND_MODE = i10 >= 29;
        SUPPORTS_PAINT_WORD_SPACING = i10 >= 29;
        SUPPORTS_SAVE_LAYER_FLAGLESS = true;
        SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS = i10 >= 31;
        PATTERN_TABS_OR_LINE_BREAKS = Pattern.compile("[\\n\\t]");
        PATTERN_TABS = Pattern.compile("\\t");
        PATTERN_LINE_BREAKS = Pattern.compile("\\n");
        PATTERN_START_SPACES = Pattern.compile("^\\s+");
        PATTERN_END_SPACES = Pattern.compile("\\s+$");
        PATTERN_DOUBLE_SPACES = Pattern.compile("\\s{2,}");
        supportedFeatures = null;
    }

    SVGAndroidRenderer(Canvas canvas, float f10, SVGExternalFileResolver sVGExternalFileResolver) {
        this.canvas = canvas;
        this.dpi = f10;
        this.externalFileResolver = sVGExternalFileResolver;
    }

    private void addObjectToClip(SVGBase.SvgObject svgObject, boolean z10, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (svgObject instanceof SVGBase.Use) {
                if (z10) {
                    addObjectToClip((SVGBase.Use) svgObject, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVGBase.Path) {
                addObjectToClip((SVGBase.Path) svgObject, path, matrix);
            } else if (svgObject instanceof SVGBase.Text) {
                addObjectToClip((SVGBase.Text) svgObject, path, matrix);
            } else if (svgObject instanceof SVGBase.GraphicsElement) {
                addObjectToClip((SVGBase.GraphicsElement) svgObject, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", svgObject.toString());
            }
            clipStatePop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void arcTo(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, SVGBase.PathInterface pathInterface) {
        float f17 = f15;
        if (f10 == f17 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f) {
            f17 = f15;
        } else if (f13 != 0.0f) {
            float fAbs = Math.abs(f12);
            float fAbs2 = Math.abs(f13);
            double radians = Math.toRadians(((double) f14) % 360.0d);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d10 = ((double) (f10 - f17)) / 2.0d;
            double d11 = ((double) (f11 - f16)) / 2.0d;
            double d12 = (dCos * d10) + (dSin * d11);
            double d13 = ((-dSin) * d10) + (d11 * dCos);
            double d14 = fAbs * fAbs;
            double d15 = fAbs2 * fAbs2;
            double d16 = d12 * d12;
            double d17 = d13 * d13;
            double d18 = (d16 / d14) + (d17 / d15);
            if (d18 > 0.99999d) {
                double dSqrt = Math.sqrt(d18) * 1.00001d;
                fAbs = (float) (((double) fAbs) * dSqrt);
                fAbs2 = (float) (dSqrt * ((double) fAbs2));
                d14 = fAbs * fAbs;
                d15 = fAbs2 * fAbs2;
            }
            double d19 = z10 == z11 ? -1.0d : 1.0d;
            double d20 = d14 * d15;
            double d21 = d14 * d17;
            double d22 = d15 * d16;
            double d23 = ((d20 - d21) - d22) / (d21 + d22);
            if (d23 < 0.0d) {
                d23 = 0.0d;
            }
            double dSqrt2 = d19 * Math.sqrt(d23);
            double d24 = fAbs;
            double d25 = fAbs2;
            double d26 = ((d24 * d13) / d25) * dSqrt2;
            double d27 = dSqrt2 * (-((d25 * d12) / d24));
            double d28 = (((double) (f10 + f17)) / 2.0d) + ((dCos * d26) - (dSin * d27));
            double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
            double d30 = (d12 - d26) / d24;
            double d31 = (d13 - d27) / d25;
            double d32 = ((-d12) - d26) / d24;
            double d33 = ((-d13) - d27) / d25;
            double d34 = (d30 * d30) + (d31 * d31);
            double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
            double dCheckedArcCos = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * checkedArcCos(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
            if (dCheckedArcCos == 0.0d) {
                pathInterface.lineTo(f17, f16);
                return;
            }
            if (!z11 && dCheckedArcCos > 0.0d) {
                dCheckedArcCos -= 6.283185307179586d;
            } else if (z11 && dCheckedArcCos < 0.0d) {
                dCheckedArcCos += 6.283185307179586d;
            }
            float[] fArrArcToBeziers = arcToBeziers(dAcos % 6.283185307179586d, dCheckedArcCos % 6.283185307179586d);
            Matrix matrix = new Matrix();
            matrix.postScale(fAbs, fAbs2);
            matrix.postRotate(f14);
            matrix.postTranslate((float) d28, (float) d29);
            matrix.mapPoints(fArrArcToBeziers);
            fArrArcToBeziers[fArrArcToBeziers.length - 2] = f15;
            fArrArcToBeziers[fArrArcToBeziers.length - 1] = f16;
            for (int i10 = 0; i10 < fArrArcToBeziers.length; i10 += 6) {
                pathInterface.cubicTo(fArrArcToBeziers[i10], fArrArcToBeziers[i10 + 1], fArrArcToBeziers[i10 + 2], fArrArcToBeziers[i10 + 3], fArrArcToBeziers[i10 + 4], fArrArcToBeziers[i10 + 5]);
            }
            return;
        }
        pathInterface.lineTo(f17, f16);
    }

    private static float[] arcToBeziers(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    @TargetApi(19)
    private Path calculateClipPath(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        Path pathObjectToPath;
        SVGBase.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (svgObjectResolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return null;
        }
        if (svgObjectResolveIRI.getNodeName() != "clipPath") {
            return null;
        }
        SVGBase.ClipPath clipPath = (SVGBase.ClipPath) svgObjectResolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVGBase.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVGBase.SvgElement) && (pathObjectToPath = objectToPath((SVGBase.SvgElement) svgObject, true)) != null) {
                path.op(pathObjectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path pathCalculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (pathCalculateClipPath != null) {
                path.op(pathCalculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = this.stateStack.pop();
        return path;
    }

    private List<MarkerVector> calculateMarkerPositions(SVGBase.Line line) {
        SVGBase.Length length = line.f95996x1;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVGBase.Length length2 = line.f95998y1;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVGBase.Length length3 = line.f95997x2;
        float fFloatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
        SVGBase.Length length4 = line.f95999y2;
        float fFloatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f10 = fFloatValueX2 - fFloatValueX;
        float f11 = fFloatValueY2 - fFloatValueY;
        arrayList.add(new MarkerVector(fFloatValueX, fFloatValueY, f10, f11));
        arrayList.add(new MarkerVector(fFloatValueX2, fFloatValueY2, f10, f11));
        return arrayList;
    }

    private SVGBase.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVGBase.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private float calculateTextWidth(SVGBase.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator();
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.f95992x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Matrix calculateViewBoxTransform(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Box r10, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Box r11, net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio$Alignment r1 = r12.getAlignment()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.width
            float r2 = r11.width
            float r1 = r1 / r2
            float r2 = r10.height
            float r3 = r11.height
            float r2 = r2 / r3
            float r3 = r11.minX
            float r3 = -r3
            float r4 = r11.minY
            float r4 = -r4
            net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio r5 = net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio.STRETCH
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.minX
            float r10 = r10.minY
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio$Scale r5 = r12.getScale()
            net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio$Scale r6 = net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.width
            float r2 = r2 / r1
            float r5 = r10.height
            float r5 = r5 / r1
            int[] r6 = net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$PreserveAspectRatio$Alignment
            net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio$Alignment r7 = r12.getAlignment()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.width
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.width
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio$Alignment r12 = r12.getAlignment()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.height
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.height
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.minX
            float r10 = r10.minY
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.calculateViewBoxTransform(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Box, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Box, net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio):android.graphics.Matrix");
    }

    private void canvasSaveLayer(Canvas canvas, RectF rectF, Paint paint) {
        if (SUPPORTS_SAVE_LAYER_FLAGLESS) {
            canvas.saveLayer(rectF, paint);
        } else {
            CanvasLegacy.saveLayer(canvas, rectF, paint, CanvasLegacy.ALL_SAVE_FLAG);
        }
    }

    private void checkForClipPath(SVGBase.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    private void checkForClipPath_OldStyle(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        SVGBase.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (svgObjectResolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return;
        }
        if (svgObjectResolveIRI.getNodeName() != "clipPath") {
            return;
        }
        SVGBase.ClipPath clipPath = (SVGBase.ClipPath) svgObjectResolveIRI;
        if (clipPath.children.isEmpty()) {
            this.canvas.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z10 = bool == null || bool.booleanValue();
        if ((svgElement instanceof SVGBase.Group) && !z10) {
            warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", svgElement.getNodeName());
            return;
        }
        clipStatePush();
        if (!z10) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
            this.canvas.concat(matrix);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            this.canvas.concat(matrix2);
        }
        this.state = findInheritFromAncestorState(clipPath);
        checkForClipPath(clipPath);
        Path path = new Path();
        Iterator<SVGBase.SvgObject> it = clipPath.children.iterator();
        while (it.hasNext()) {
            addObjectToClip(it.next(), true, path, new Matrix());
        }
        this.canvas.clipPath(path);
        clipStatePop();
    }

    private void checkForGradientsAndPatterns(SVGBase.SvgElement svgElement) {
        SVGBase.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVGBase.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVGBase.PaintReference) svgPaint);
        }
        SVGBase.SvgPaint svgPaint2 = this.state.style.stroke;
        if (svgPaint2 instanceof SVGBase.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVGBase.PaintReference) svgPaint2);
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e(TAG, "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private Typeface checkGenericFont(String str, Float f10, Style.FontStyle fontStyle) {
        int i10;
        boolean z10 = fontStyle == Style.FontStyle.italic;
        i10 = f10.floatValue() >= 700.0f ? z10 ? 3 : 1 : z10 ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
            case "fantasy":
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            default:
                return null;
        }
    }

    private void checkXMLSpaceAttribute(SVGBase.SvgObject svgObject) {
        Boolean bool;
        if ((svgObject instanceof SVGBase.SvgElementBase) && (bool = ((SVGBase.SvgElementBase) svgObject).spacePreserve) != null) {
            this.state.spacePreserve = bool.booleanValue();
        }
    }

    private static double checkedArcCos(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private static int clamp255(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    private void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void clipStatePush() {
        CanvasLegacy.save(this.canvas, CanvasLegacy.MATRIX_SAVE_FLAG);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private static int colourWithOpacity(int i10, float f10) {
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | ((iRound < 0 ? 0 : Math.min(iRound, 255)) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void debug(String str, Object... objArr) {
    }

    private void decodePaintReference(boolean z10, SVGBase.Box box, SVGBase.PaintReference paintReference) {
        SVGBase.SvgObject svgObjectResolveIRI = this.document.resolveIRI(paintReference.href);
        if (svgObjectResolveIRI == null) {
            error("%s reference '%s' not found", z10 ? "Fill" : "Stroke", paintReference.href);
            SVGBase.SvgPaint svgPaint = paintReference.fallback;
            if (svgPaint != null) {
                setPaintColour(this.state, z10, svgPaint);
                return;
            } else if (z10) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        if (svgObjectResolveIRI instanceof SVGBase.SvgLinearGradient) {
            makeLinearGradient(z10, box, (SVGBase.SvgLinearGradient) svgObjectResolveIRI);
        } else if (svgObjectResolveIRI instanceof SVGBase.SvgRadialGradient) {
            makeRadialGradient(z10, box, (SVGBase.SvgRadialGradient) svgObjectResolveIRI);
        } else if (svgObjectResolveIRI instanceof SVGBase.SolidColor) {
            setSolidColor(z10, (SVGBase.SolidColor) svgObjectResolveIRI);
        }
    }

    private boolean display() {
        Boolean bool = this.state.style.display;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void doFilledPath(SVGBase.SvgElement svgElement, Path path) {
        SVGBase.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVGBase.PaintReference) {
            SVGBase.SvgObject svgObjectResolveIRI = this.document.resolveIRI(((SVGBase.PaintReference) svgPaint).href);
            if (svgObjectResolveIRI instanceof SVGBase.Pattern) {
                fillWithPattern(svgElement, path, (SVGBase.Pattern) svgObjectResolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    private void doStroke(Path path) {
        RendererState rendererState = this.state;
        if (rendererState.style.vectorEffect != Style.VectorEffect.NonScalingStroke) {
            this.canvas.drawPath(path, rendererState.strokePaint);
            return;
        }
        Matrix matrix = this.canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.canvas.setMatrix(new Matrix());
        Shader shader = this.state.strokePaint.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.canvas.drawPath(path2, this.state.strokePaint);
        this.canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private float dotProduct(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void enumerateTextSpans(SVGBase.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator<SVGBase.SvgObject> it = textContainer.children.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                SVGBase.SvgObject next = it.next();
                if (next instanceof SVGBase.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVGBase.TextSequence) next).text, z10, !it.hasNext()));
                } else {
                    processTextChild(next, textProcessor);
                }
                z10 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void error(String str, Object... objArr) {
        Log.e(TAG, String.format(str, objArr));
    }

    private void extractRawText(SVGBase.TextContainer textContainer, StringBuilder sb2) {
        Iterator<SVGBase.SvgObject> it = textContainer.children.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            SVGBase.SvgObject next = it.next();
            if (next instanceof SVGBase.TextContainer) {
                extractRawText((SVGBase.TextContainer) next, sb2);
            } else if (next instanceof SVGBase.TextSequence) {
                sb2.append(textXMLSpaceTransform(((SVGBase.TextSequence) next).text, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void fillInChainedGradientFields(SVGBase.GradientElement gradientElement, String str) {
        SVGBase.SvgObject svgObjectResolveIRI = gradientElement.document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVGBase.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVGBase.GradientElement gradientElement2 = (SVGBase.GradientElement) svgObjectResolveIRI;
        if (gradientElement.gradientUnitsAreUser == null) {
            gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
        }
        if (gradientElement.gradientTransform == null) {
            gradientElement.gradientTransform = gradientElement2.gradientTransform;
        }
        if (gradientElement.spreadMethod == null) {
            gradientElement.spreadMethod = gradientElement2.spreadMethod;
        }
        if (gradientElement.children.isEmpty()) {
            gradientElement.children = gradientElement2.children;
        }
        try {
            if (gradientElement instanceof SVGBase.SvgLinearGradient) {
                fillInChainedGradientFields((SVGBase.SvgLinearGradient) gradientElement, (SVGBase.SvgLinearGradient) svgObjectResolveIRI);
            } else {
                fillInChainedGradientFields((SVGBase.SvgRadialGradient) gradientElement, (SVGBase.SvgRadialGradient) svgObjectResolveIRI);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = gradientElement2.href;
        if (str2 != null) {
            fillInChainedGradientFields(gradientElement, str2);
        }
    }

    private void fillInChainedPatternFields(SVGBase.Pattern pattern, String str) {
        SVGBase.SvgObject svgObjectResolveIRI = pattern.document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVGBase.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVGBase.Pattern pattern2 = (SVGBase.Pattern) svgObjectResolveIRI;
        if (pattern.patternUnitsAreUser == null) {
            pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
        }
        if (pattern.patternContentUnitsAreUser == null) {
            pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
        }
        if (pattern.patternTransform == null) {
            pattern.patternTransform = pattern2.patternTransform;
        }
        if (pattern.f96003x == null) {
            pattern.f96003x = pattern2.f96003x;
        }
        if (pattern.f96004y == null) {
            pattern.f96004y = pattern2.f96004y;
        }
        if (pattern.width == null) {
            pattern.width = pattern2.width;
        }
        if (pattern.height == null) {
            pattern.height = pattern2.height;
        }
        if (pattern.children.isEmpty()) {
            pattern.children = pattern2.children;
        }
        if (pattern.viewBox == null) {
            pattern.viewBox = pattern2.viewBox;
        }
        if (pattern.preserveAspectRatio == null) {
            pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
        }
        String str2 = pattern2.href;
        if (str2 != null) {
            fillInChainedPatternFields(pattern, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void fillWithPattern(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgElement r24, android.graphics.Path r25, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Pattern r26) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.fillWithPattern(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$SvgElement, android.graphics.Path, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Pattern):void");
    }

    private RendererState findInheritFromAncestorState(SVGBase.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, Style.getDefaultStyle());
        return findInheritFromAncestorState(svgObject, rendererState);
    }

    private Style.TextAnchor getAnchorPosition() {
        Style.TextAnchor textAnchor;
        Style style = this.state.style;
        if (style.direction == Style.TextDirection.LTR || (textAnchor = style.textAnchor) == Style.TextAnchor.Middle) {
            return style.textAnchor;
        }
        Style.TextAnchor textAnchor2 = Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? Style.TextAnchor.End : textAnchor2;
    }

    private Path.FillType getClipRuleFromState() {
        Style.FillRule fillRule = this.state.style.clipRule;
        return (fillRule == null || fillRule != Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType getFillTypeFromState() {
        Style.FillRule fillRule = this.state.style.fillRule;
        return (fillRule == null || fillRule != Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static synchronized void initialiseSupportedFeaturesMap() {
        HashSet<String> hashSet = new HashSet<>();
        supportedFeatures = hashSet;
        hashSet.add("Structure");
        supportedFeatures.add("BasicStructure");
        supportedFeatures.add("ConditionalProcessing");
        supportedFeatures.add("Image");
        supportedFeatures.add("Style");
        supportedFeatures.add("ViewportAttribute");
        supportedFeatures.add("Shape");
        supportedFeatures.add("BasicText");
        supportedFeatures.add("PaintAttribute");
        supportedFeatures.add("BasicPaintAttribute");
        supportedFeatures.add("OpacityAttribute");
        supportedFeatures.add("BasicGraphicsAttribute");
        supportedFeatures.add("Marker");
        supportedFeatures.add("Gradient");
        supportedFeatures.add("Pattern");
        supportedFeatures.add("Clip");
        supportedFeatures.add("BasicClip");
        supportedFeatures.add("Mask");
        supportedFeatures.add("View");
    }

    private boolean isSpecified(Style style, long j10) {
        return (j10 & style.specifiedFlags) != 0;
    }

    private void makeLinearGradient(boolean z10, SVGBase.Box box, SVGBase.SvgLinearGradient svgLinearGradient) {
        float fFloatValue;
        float fFloatValueY;
        float fFloatValueX;
        float f10;
        float fFloatValueY2;
        float f11;
        float f12;
        int i10;
        String str = svgLinearGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgLinearGradient, str);
        }
        Boolean bool = svgLinearGradient.gradientUnitsAreUser;
        int i11 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        Paint paint = z10 ? this.state.fillPaint : this.state.strokePaint;
        if (z11) {
            SVGBase.Length length = svgLinearGradient.f96010x1;
            fFloatValue = length != null ? length.floatValueX(this) : 0.0f;
            SVGBase.Length length2 = svgLinearGradient.f96012y1;
            fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVGBase.Length length3 = svgLinearGradient.f96011x2;
            if (length3 == null) {
                length3 = SVGBase.Length.PERCENT_100;
            }
            fFloatValueX = length3.floatValueX(this);
            SVGBase.Length length4 = svgLinearGradient.f96013y2;
            if (length4 != null) {
                f10 = fFloatValue;
                f11 = fFloatValueY;
                f12 = fFloatValueX;
                fFloatValueY2 = length4.floatValueY(this);
            } else {
                f10 = fFloatValue;
                f11 = fFloatValueY;
                f12 = fFloatValueX;
                fFloatValueY2 = 0.0f;
            }
        } else {
            SVGBase.Length length5 = svgLinearGradient.f96010x1;
            fFloatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length6 = svgLinearGradient.f96012y1;
            float fFloatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVGBase.Length length7 = svgLinearGradient.f96011x2;
            float fFloatValue3 = length7 != null ? length7.floatValue(this, 1.0f) : 1.0f;
            SVGBase.Length length8 = svgLinearGradient.f96013y2;
            if (length8 != null) {
                float fFloatValue4 = length8.floatValue(this, 1.0f);
                f10 = fFloatValue;
                fFloatValueY2 = fFloatValue4;
                f11 = fFloatValue2;
                f12 = fFloatValue3;
            } else {
                fFloatValueY = fFloatValue2;
                fFloatValueX = fFloatValue3;
                f10 = fFloatValue;
                f11 = fFloatValueY;
                f12 = fFloatValueX;
                fFloatValueY2 = 0.0f;
            }
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgLinearGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgLinearGradient.children.size();
        if (size == 0) {
            statePop();
            if (z10) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVGBase.SvgObject> it = svgLinearGradient.children.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            SVGBase.Stop stop = (SVGBase.Stop) it.next();
            Float f14 = stop.offset;
            float fFloatValue5 = f14 != null ? f14.floatValue() : 0.0f;
            if (i11 == 0 || fFloatValue5 >= f13) {
                fArr[i11] = fFloatValue5;
                f13 = fFloatValue5;
            } else {
                fArr[i11] = f13;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            Style style = this.state.style;
            SVGBase.Colour colour = (SVGBase.Colour) style.stopColor;
            if (colour == null) {
                colour = SVGBase.Colour.BLACK;
            }
            iArr[i11] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            i11++;
            statePop();
        }
        if (f10 == f12 && f11 == fFloatValueY2) {
            i10 = 1;
        } else {
            i10 = 1;
            if (size != 1) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                SVGBase.GradientSpread gradientSpread = svgLinearGradient.spreadMethod;
                if (gradientSpread != null) {
                    if (gradientSpread == SVGBase.GradientSpread.reflect) {
                        tileMode = Shader.TileMode.MIRROR;
                    } else if (gradientSpread == SVGBase.GradientSpread.repeat) {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                }
                Shader.TileMode tileMode2 = tileMode;
                statePop();
                LinearGradient linearGradient = new LinearGradient(f10, f11, f12, fFloatValueY2, iArr, fArr, tileMode2);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
                return;
            }
        }
        statePop();
        paint.setColor(iArr[size - i10]);
    }

    private Path makePathAndBoundingBox(SVGBase.Line line) {
        SVGBase.Length length = line.f95996x1;
        float fFloatValueX = length == null ? 0.0f : length.floatValueX(this);
        SVGBase.Length length2 = line.f95998y1;
        float fFloatValueY = length2 == null ? 0.0f : length2.floatValueY(this);
        SVGBase.Length length3 = line.f95997x2;
        float fFloatValueX2 = length3 == null ? 0.0f : length3.floatValueX(this);
        SVGBase.Length length4 = line.f95999y2;
        float fFloatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        if (line.boundingBox == null) {
            line.boundingBox = new SVGBase.Box(Math.min(fFloatValueX, fFloatValueX2), Math.min(fFloatValueY, fFloatValueY2), Math.abs(fFloatValueX2 - fFloatValueX), Math.abs(fFloatValueY2 - fFloatValueY));
        }
        Path path = new Path();
        path.moveTo(fFloatValueX, fFloatValueY);
        path.lineTo(fFloatValueX2, fFloatValueY2);
        return path;
    }

    private void makeRadialGradient(boolean z10, SVGBase.Box box, SVGBase.SvgRadialGradient svgRadialGradient) {
        float f10;
        float f11;
        float f12;
        float fFloatValue;
        float fFloatValueX;
        float fFloatValue2;
        float fFloatValueY;
        float fFloatValueY2;
        float fFloatValueX2;
        float fFloatValue3;
        long[] jArr;
        RadialGradient radialGradient;
        String str = svgRadialGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgRadialGradient, str);
        }
        Boolean bool = svgRadialGradient.gradientUnitsAreUser;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        Paint paint = z10 ? this.state.fillPaint : this.state.strokePaint;
        if (z11) {
            SVGBase.Length length = new SVGBase.Length(50.0f, SVGBase.Unit.percent);
            SVGBase.Length length2 = svgRadialGradient.cx;
            fFloatValueX = length2 != null ? length2.floatValueX(this) : length.floatValueX(this);
            SVGBase.Length length3 = svgRadialGradient.cy;
            fFloatValueY2 = length3 != null ? length3.floatValueY(this) : length.floatValueY(this);
            SVGBase.Length length4 = svgRadialGradient.f96014r;
            fFloatValue2 = length4 != null ? length4.floatValue(this) : length.floatValue(this);
            if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                SVGBase.Length length5 = svgRadialGradient.fx;
                fFloatValueX2 = length5 != null ? length5.floatValueX(this) : fFloatValueX;
                SVGBase.Length length6 = svgRadialGradient.fy;
                fFloatValueY = length6 != null ? length6.floatValueY(this) : fFloatValueY2;
                SVGBase.Length length7 = svgRadialGradient.fr;
                if (length7 != null) {
                    f12 = fFloatValue2;
                    f10 = fFloatValueX;
                    f11 = fFloatValueY2;
                    fFloatValue3 = length7.floatValue(this);
                    fFloatValue = fFloatValueX2;
                } else {
                    f12 = fFloatValue2;
                    f10 = fFloatValueX;
                    f11 = fFloatValueY2;
                    fFloatValue = fFloatValueX2;
                    fFloatValue3 = 0.0f;
                }
            } else {
                f12 = fFloatValue2;
                f10 = fFloatValueX;
                f11 = fFloatValueY2;
                fFloatValue3 = 0.0f;
                fFloatValueY = 0.0f;
                fFloatValue = 0.0f;
            }
        } else {
            SVGBase.Length length8 = svgRadialGradient.cx;
            float fFloatValue4 = length8 != null ? length8.floatValue(this, 1.0f) : 0.5f;
            SVGBase.Length length9 = svgRadialGradient.cy;
            float fFloatValue5 = length9 != null ? length9.floatValue(this, 1.0f) : 0.5f;
            SVGBase.Length length10 = svgRadialGradient.f96014r;
            float fFloatValue6 = length10 != null ? length10.floatValue(this, 1.0f) : 0.5f;
            if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                SVGBase.Length length11 = svgRadialGradient.fx;
                fFloatValue = length11 != null ? length11.floatValue(this, 1.0f) : 0.5f;
                SVGBase.Length length12 = svgRadialGradient.fy;
                float fFloatValue7 = length12 != null ? length12.floatValue(this, 1.0f) : 0.5f;
                SVGBase.Length length13 = svgRadialGradient.fr;
                if (length13 != null) {
                    fFloatValue3 = length13.floatValue(this, 1.0f);
                    f10 = fFloatValue4;
                    f11 = fFloatValue5;
                    f12 = fFloatValue6;
                    fFloatValueY = fFloatValue7;
                } else {
                    float f13 = fFloatValue7;
                    fFloatValueX = fFloatValue4;
                    fFloatValue2 = fFloatValue6;
                    fFloatValueY = f13;
                    fFloatValueY2 = fFloatValue5;
                    fFloatValueX2 = fFloatValue;
                    f12 = fFloatValue2;
                    f10 = fFloatValueX;
                    f11 = fFloatValueY2;
                    fFloatValue = fFloatValueX2;
                    fFloatValue3 = 0.0f;
                }
            } else {
                f10 = fFloatValue4;
                f11 = fFloatValue5;
                f12 = fFloatValue6;
                fFloatValue3 = 0.0f;
                fFloatValueY = 0.0f;
                fFloatValue = 0.0f;
            }
        }
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgRadialGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgRadialGradient.children.size();
        if (size == 0) {
            statePop();
            if (z10) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = null;
        if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
            jArr = new long[size];
        } else {
            jArr = null;
            iArr = new int[size];
        }
        float[] fArr = new float[size];
        Iterator<SVGBase.SvgObject> it = svgRadialGradient.children.iterator();
        float f14 = -1.0f;
        while (it.hasNext()) {
            SVGBase.Stop stop = (SVGBase.Stop) it.next();
            Float f15 = stop.offset;
            float fFloatValue8 = f15 != null ? f15.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue8 >= f14) {
                fArr[i10] = fFloatValue8;
                f14 = fFloatValue8;
            } else {
                fArr[i10] = f14;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            Style style = this.state.style;
            SVGBase.Colour colour = (SVGBase.Colour) style.stopColor;
            if (colour == null) {
                colour = SVGBase.Colour.BLACK;
            }
            if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
                jArr[i10] = Color.pack(colourWithOpacity(colour.colour, style.stopOpacity.floatValue()));
            } else {
                iArr[i10] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            }
            i10++;
            statePop();
        }
        if (f12 == 0.0f || size == 1) {
            int[] iArr2 = iArr;
            statePop();
            paint.setColor(iArr2[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVGBase.GradientSpread gradientSpread = svgRadialGradient.spreadMethod;
        if (gradientSpread != null) {
            if (gradientSpread == SVGBase.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVGBase.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        statePop();
        if (SUPPORTS_RADIAL_GRADIENT_WITH_FOCUS) {
            radialGradient = b.a(fFloatValue, fFloatValueY, fFloatValue3, f10, f11, f12, jArr, fArr, tileMode2);
        } else {
            radialGradient = new RadialGradient(f10, f11, f12, iArr, fArr, tileMode2);
        }
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    private SVGBase.Box makeViewPort(SVGBase.Length length, SVGBase.Length length2, SVGBase.Length length3, SVGBase.Length length4) {
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVGBase.Box effectiveViewPortInUserUnits = getEffectiveViewPortInUserUnits();
        return new SVGBase.Box(fFloatValueX, fFloatValueY, length3 != null ? length3.floatValueX(this) : effectiveViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : effectiveViewPortInUserUnits.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float measureText(String str, Paint paint) {
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10];
        }
        return f10;
    }

    @TargetApi(19)
    private Path objectToPath(SVGBase.SvgElement svgElement, boolean z10) {
        Path pathMakePathAndBoundingBox;
        Path pathCalculateClipPath;
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        updateStyleForElement(rendererState, svgElement);
        if (!display() || !visible()) {
            this.state = this.stateStack.pop();
            return null;
        }
        if (svgElement instanceof SVGBase.Use) {
            if (!z10) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVGBase.Use use = (SVGBase.Use) svgElement;
            SVGBase.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(use.href);
            if (svgObjectResolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.state = this.stateStack.pop();
                return null;
            }
            if (!(svgObjectResolveIRI instanceof SVGBase.SvgElement)) {
                this.state = this.stateStack.pop();
                return null;
            }
            pathMakePathAndBoundingBox = objectToPath((SVGBase.SvgElement) svgObjectResolveIRI, false);
            if (pathMakePathAndBoundingBox == null) {
                return null;
            }
            if (use.boundingBox == null) {
                use.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
            }
            Matrix matrix = use.transform;
            if (matrix != null) {
                pathMakePathAndBoundingBox.transform(matrix);
            }
        } else if (svgElement instanceof SVGBase.GraphicsElement) {
            SVGBase.GraphicsElement graphicsElement = (SVGBase.GraphicsElement) svgElement;
            if (svgElement instanceof SVGBase.Path) {
                pathMakePathAndBoundingBox = new PathConverter(((SVGBase.Path) svgElement).f96002d).getPath();
                if (svgElement.boundingBox == null) {
                    svgElement.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
                }
            } else {
                pathMakePathAndBoundingBox = svgElement instanceof SVGBase.Rect ? makePathAndBoundingBox((SVGBase.Rect) svgElement) : svgElement instanceof SVGBase.Circle ? makePathAndBoundingBox((SVGBase.Circle) svgElement) : svgElement instanceof SVGBase.Ellipse ? makePathAndBoundingBox((SVGBase.Ellipse) svgElement) : svgElement instanceof SVGBase.PolyLine ? makePathAndBoundingBox((SVGBase.PolyLine) svgElement) : null;
            }
            if (pathMakePathAndBoundingBox == null) {
                return null;
            }
            if (graphicsElement.boundingBox == null) {
                graphicsElement.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
            }
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                pathMakePathAndBoundingBox.transform(matrix2);
            }
            pathMakePathAndBoundingBox.setFillType(getClipRuleFromState());
        } else {
            if (!(svgElement instanceof SVGBase.Text)) {
                error("Invalid %s element found in clipPath definition", svgElement.getNodeName());
                return null;
            }
            SVGBase.Text text = (SVGBase.Text) svgElement;
            pathMakePathAndBoundingBox = makePathAndBoundingBox(text);
            Matrix matrix3 = text.transform;
            if (matrix3 != null) {
                pathMakePathAndBoundingBox.transform(matrix3);
            }
            pathMakePathAndBoundingBox.setFillType(getClipRuleFromState());
        }
        if (this.state.style.clipPath != null && (pathCalculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) != null) {
            pathMakePathAndBoundingBox.op(pathCalculateClipPath, Path.Op.INTERSECT);
        }
        this.state = this.stateStack.pop();
        return pathMakePathAndBoundingBox;
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    private void parentPush(SVGBase.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void popLayer(SVGBase.SvgElement svgElement) {
        popLayer(svgElement, svgElement.boundingBox);
    }

    private void processTextChild(SVGBase.SvgObject svgObject, TextProcessor textProcessor) {
        float f10;
        float fFloatValueY;
        float fFloatValueX;
        Style.TextAnchor anchorPosition;
        if (textProcessor.doTextContainer((SVGBase.TextContainer) svgObject)) {
            if (svgObject instanceof SVGBase.TextPath) {
                statePush();
                renderTextPath((SVGBase.TextPath) svgObject);
                statePop();
                return;
            }
            if (!(svgObject instanceof SVGBase.TSpan)) {
                if (svgObject instanceof SVGBase.TRef) {
                    statePush();
                    SVGBase.TRef tRef = (SVGBase.TRef) svgObject;
                    updateStyleForElement(this.state, tRef);
                    if (display()) {
                        checkForGradientsAndPatterns((SVGBase.SvgElement) tRef.getTextRoot());
                        SVGBase.SvgObject svgObjectResolveIRI = svgObject.document.resolveIRI(tRef.href);
                        if (svgObjectResolveIRI instanceof SVGBase.TextContainer) {
                            StringBuilder sb2 = new StringBuilder();
                            extractRawText((SVGBase.TextContainer) svgObjectResolveIRI, sb2);
                            if (sb2.length() > 0) {
                                textProcessor.processText(sb2.toString());
                            }
                        } else {
                            error("Tref reference '%s' not found", tRef.href);
                        }
                    }
                    statePop();
                    return;
                }
                return;
            }
            debug("TSpan render", new Object[0]);
            statePush();
            SVGBase.TSpan tSpan = (SVGBase.TSpan) svgObject;
            updateStyleForElement(this.state, tSpan);
            if (display()) {
                selectTypefaceAndFontStyling();
                List<SVGBase.Length> list = tSpan.f96015x;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = textProcessor instanceof PlainTextDrawer;
                float fFloatValueY2 = 0.0f;
                if (z11) {
                    float fFloatValueX2 = !z10 ? ((PlainTextDrawer) textProcessor).f95986x : tSpan.f96015x.get(0).floatValueX(this);
                    List<SVGBase.Length> list2 = tSpan.f96016y;
                    fFloatValueY = (list2 == null || list2.size() == 0) ? ((PlainTextDrawer) textProcessor).f95987y : tSpan.f96016y.get(0).floatValueY(this);
                    List<SVGBase.Length> list3 = tSpan.dx;
                    fFloatValueX = (list3 == null || list3.size() == 0) ? 0.0f : tSpan.dx.get(0).floatValueX(this);
                    List<SVGBase.Length> list4 = tSpan.dy;
                    if (list4 != null && list4.size() != 0) {
                        fFloatValueY2 = tSpan.dy.get(0).floatValueY(this);
                    }
                    f10 = fFloatValueY2;
                    fFloatValueY2 = fFloatValueX2;
                } else {
                    f10 = 0.0f;
                    fFloatValueY = 0.0f;
                    fFloatValueX = 0.0f;
                }
                if (z10 && (anchorPosition = getAnchorPosition()) != Style.TextAnchor.Start) {
                    float fCalculateTextWidth = calculateTextWidth(tSpan);
                    if (anchorPosition == Style.TextAnchor.Middle) {
                        fCalculateTextWidth /= 2.0f;
                    }
                    fFloatValueY2 -= fCalculateTextWidth;
                }
                checkForGradientsAndPatterns((SVGBase.SvgElement) tSpan.getTextRoot());
                if (z11) {
                    PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                    plainTextDrawer.f95986x = fFloatValueY2 + fFloatValueX;
                    plainTextDrawer.f95987y = fFloatValueY + f10;
                }
                boolean zPushLayer = pushLayer();
                enumerateTextSpans(tSpan, textProcessor);
                if (zPushLayer) {
                    popLayer(tSpan);
                }
            }
            statePop();
        }
    }

    private boolean pushLayer() {
        return pushLayer(1.0f);
    }

    private MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float fDotProduct = dotProduct(markerVector2.dx, markerVector2.dy, markerVector2.f95984x - markerVector.f95984x, markerVector2.f95985y - markerVector.f95985y);
        if (fDotProduct == 0.0f) {
            fDotProduct = dotProduct(markerVector2.dx, markerVector2.dy, markerVector3.f95984x - markerVector2.f95984x, markerVector3.f95985y - markerVector2.f95985y);
        }
        if (fDotProduct > 0.0f || (fDotProduct == 0.0f && (markerVector2.dx > 0.0f || markerVector2.dy >= 0.0f))) {
            return markerVector2;
        }
        markerVector2.dx = -markerVector2.dx;
        markerVector2.dy = -markerVector2.dy;
        return markerVector2;
    }

    private void render(SVGBase.SvgObject svgObject) {
        if (svgObject instanceof SVGBase.NotDirectlyRendered) {
            return;
        }
        statePush();
        checkXMLSpaceAttribute(svgObject);
        if (svgObject instanceof SVGBase.Svg) {
            render((SVGBase.Svg) svgObject);
        } else if (svgObject instanceof SVGBase.Use) {
            render((SVGBase.Use) svgObject);
        } else if (svgObject instanceof SVGBase.Switch) {
            render((SVGBase.Switch) svgObject);
        } else if (svgObject instanceof SVGBase.Group) {
            render((SVGBase.Group) svgObject);
        } else if (svgObject instanceof SVGBase.Image) {
            render((SVGBase.Image) svgObject);
        } else if (svgObject instanceof SVGBase.Path) {
            render((SVGBase.Path) svgObject);
        } else if (svgObject instanceof SVGBase.Rect) {
            render((SVGBase.Rect) svgObject);
        } else if (svgObject instanceof SVGBase.Circle) {
            render((SVGBase.Circle) svgObject);
        } else if (svgObject instanceof SVGBase.Ellipse) {
            render((SVGBase.Ellipse) svgObject);
        } else if (svgObject instanceof SVGBase.Line) {
            render((SVGBase.Line) svgObject);
        } else if (svgObject instanceof SVGBase.Polygon) {
            render((SVGBase.Polygon) svgObject);
        } else if (svgObject instanceof SVGBase.PolyLine) {
            render((SVGBase.PolyLine) svgObject);
        } else if (svgObject instanceof SVGBase.Text) {
            render((SVGBase.Text) svgObject);
        }
        statePop();
    }

    private void renderChildren(SVGBase.SvgContainer svgContainer, boolean z10) {
        if (z10) {
            parentPush(svgContainer);
        }
        Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            render(it.next());
        }
        if (z10) {
            parentPop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void renderMarker(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Marker r12, net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.MarkerVector r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.renderMarker(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Marker, net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer$MarkerVector):void");
    }

    private void renderMarkers(SVGBase.GraphicsElement graphicsElement) {
        SVGBase.Marker marker;
        SVGBase.Marker marker2;
        SVGBase.Marker marker3;
        int size;
        Style style = this.state.style;
        String str = style.markerStart;
        if (str == null && style.markerMid == null && style.markerEnd == null) {
            return;
        }
        if (str == null) {
            marker = null;
        } else {
            SVGBase.SvgObject svgObjectResolveIRI = graphicsElement.document.resolveIRI(str);
            if (svgObjectResolveIRI != null) {
                marker = (SVGBase.Marker) svgObjectResolveIRI;
            } else {
                error("Marker reference '%s' not found", this.state.style.markerStart);
                marker = null;
            }
        }
        String str2 = this.state.style.markerMid;
        if (str2 == null) {
            marker2 = null;
        } else {
            SVGBase.SvgObject svgObjectResolveIRI2 = graphicsElement.document.resolveIRI(str2);
            if (svgObjectResolveIRI2 != null) {
                marker2 = (SVGBase.Marker) svgObjectResolveIRI2;
            } else {
                error("Marker reference '%s' not found", this.state.style.markerMid);
                marker2 = null;
            }
        }
        String str3 = this.state.style.markerEnd;
        if (str3 == null) {
            marker3 = null;
        } else {
            SVGBase.SvgObject svgObjectResolveIRI3 = graphicsElement.document.resolveIRI(str3);
            if (svgObjectResolveIRI3 != null) {
                marker3 = (SVGBase.Marker) svgObjectResolveIRI3;
            } else {
                error("Marker reference '%s' not found", this.state.style.markerEnd);
                marker3 = null;
            }
        }
        List<MarkerVector> markers = graphicsElement instanceof SVGBase.Path ? new MarkerPositionCalculator(((SVGBase.Path) graphicsElement).f96002d).getMarkers() : graphicsElement instanceof SVGBase.Line ? calculateMarkerPositions((SVGBase.Line) graphicsElement) : calculateMarkerPositions((SVGBase.PolyLine) graphicsElement);
        if (markers == null || (size = markers.size()) == 0) {
            return;
        }
        Style style2 = this.state.style;
        style2.markerEnd = null;
        style2.markerMid = null;
        style2.markerStart = null;
        if (marker != null) {
            renderMarker(marker, markers.get(0));
        }
        if (marker2 != null && markers.size() > 2) {
            MarkerVector markerVectorRealignMarkerMid = markers.get(0);
            MarkerVector markerVector = markers.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                MarkerVector markerVector2 = markers.get(i10);
                markerVectorRealignMarkerMid = markerVector.isAmbiguous ? realignMarkerMid(markerVectorRealignMarkerMid, markerVector, markerVector2) : markerVector;
                renderMarker(marker2, markerVectorRealignMarkerMid);
                markerVector = markerVector2;
            }
        }
        if (marker3 != null) {
            renderMarker(marker3, markers.get(size - 1));
        }
    }

    private void renderMask(SVGBase.Mask mask, SVGBase.SvgElement svgElement, SVGBase.Box box) {
        float fFloatValueX;
        float fFloatValueY;
        debug("Mask render", new Object[0]);
        Boolean bool = mask.maskUnitsAreUser;
        if (bool == null || !bool.booleanValue()) {
            SVGBase.Length length = mask.width;
            float fFloatValue = length != null ? length.floatValue(this, 1.0f) : 1.2f;
            SVGBase.Length length2 = mask.height;
            float fFloatValue2 = length2 != null ? length2.floatValue(this, 1.0f) : 1.2f;
            fFloatValueX = fFloatValue * box.width;
            fFloatValueY = fFloatValue2 * box.height;
        } else {
            SVGBase.Length length3 = mask.width;
            fFloatValueX = length3 != null ? length3.floatValueX(this) : box.width;
            SVGBase.Length length4 = mask.height;
            fFloatValueY = length4 != null ? length4.floatValueY(this) : box.height;
        }
        if (fFloatValueX == 0.0f || fFloatValueY == 0.0f) {
            return;
        }
        statePush();
        RendererState rendererStateFindInheritFromAncestorState = findInheritFromAncestorState(mask);
        this.state = rendererStateFindInheritFromAncestorState;
        rendererStateFindInheritFromAncestorState.style.opacity = Float.valueOf(1.0f);
        boolean zPushLayer = pushLayer();
        this.canvas.save();
        Boolean bool2 = mask.maskContentUnitsAreUser;
        if (bool2 != null && !bool2.booleanValue()) {
            this.canvas.translate(box.minX, box.minY);
            this.canvas.scale(box.width, box.height);
        }
        renderChildren(mask, false);
        this.canvas.restore();
        if (zPushLayer) {
            popLayer(svgElement, box);
        }
        statePop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void renderSwitchChild(SVGBase.Switch r92) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        for (SVGBase.SvgObject svgObject : r92.getChildren()) {
            if (svgObject instanceof SVGBase.SvgConditional) {
                SVGBase.SvgConditional svgConditional = (SVGBase.SvgConditional) svgObject;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (requiredFeatures.isEmpty() || !supportedFeatures.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && this.externalFileResolver != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (it.hasNext()) {
                                if (!this.externalFileResolver.isFormatSupported(it.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = svgConditional.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && this.externalFileResolver != null) {
                            Iterator<String> it2 = requiredFonts.iterator();
                            while (it2.hasNext()) {
                                if (this.externalFileResolver.resolveFont(it2.next(), this.state.style.fontWeight.floatValue(), String.valueOf(this.state.style.fontStyle), this.state.style.fontStretch.floatValue()) == null) {
                                    break;
                                }
                            }
                        }
                    }
                    render(svgObject);
                    return;
                }
            }
        }
    }

    private void renderTextPath(SVGBase.TextPath textPath) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            selectTypefaceAndFontStyling();
            SVGBase.SvgObject svgObjectResolveIRI = textPath.document.resolveIRI(textPath.href);
            if (svgObjectResolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVGBase.Path path = (SVGBase.Path) svgObjectResolveIRI;
            Path path2 = new PathConverter(path.f96002d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(path2, false);
            SVGBase.Length length = textPath.startOffset;
            float fFloatValue = length != null ? length.floatValue(this, pathMeasure.getLength()) : 0.0f;
            Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(textPath);
                if (anchorPosition == Style.TextAnchor.Middle) {
                    fCalculateTextWidth /= 2.0f;
                }
                fFloatValue -= fCalculateTextWidth;
            }
            checkForGradientsAndPatterns((SVGBase.SvgElement) textPath.getTextRoot());
            boolean zPushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(path2, fFloatValue, 0.0f));
            if (zPushLayer) {
                popLayer(textPath);
            }
        }
    }

    private boolean requiresCompositing() {
        if (this.state.style.opacity.floatValue() < 1.0f) {
            return true;
        }
        Style style = this.state.style;
        if (style.mask != null || style.isolation == Style.Isolation.isolate) {
            return true;
        }
        return SUPPORTS_BLEND_MODE && style.mixBlendMode != Style.CSSBlendMode.normal;
    }

    private void resetState() {
        this.state = new RendererState();
        this.stateStack = new Stack<>();
        updateStyle(this.state, Style.getDefaultStyle());
        RendererState rendererState = this.state;
        rendererState.viewPort = null;
        rendererState.spacePreserve = false;
        this.stateStack.push(new RendererState(rendererState));
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    private void selectTypefaceAndFontStyling() {
        SVGExternalFileResolver sVGExternalFileResolver;
        List<String> list = this.state.style.fontFamily;
        Typeface typefaceCheckGenericFont = null;
        if (list != null && this.document != null) {
            for (String str : list) {
                Style style = this.state.style;
                Typeface typefaceCheckGenericFont2 = checkGenericFont(str, style.fontWeight, style.fontStyle);
                typefaceCheckGenericFont = (typefaceCheckGenericFont2 != null || (sVGExternalFileResolver = this.externalFileResolver) == null) ? typefaceCheckGenericFont2 : sVGExternalFileResolver.resolveFont(str, this.state.style.fontWeight.floatValue(), String.valueOf(this.state.style.fontStyle), this.state.style.fontStretch.floatValue());
                if (typefaceCheckGenericFont != null) {
                    break;
                }
            }
        }
        if (typefaceCheckGenericFont == null) {
            Style style2 = this.state.style;
            typefaceCheckGenericFont = checkGenericFont("serif", style2.fontWeight, style2.fontStyle);
        }
        this.state.fillPaint.setTypeface(typefaceCheckGenericFont);
        this.state.strokePaint.setTypeface(typefaceCheckGenericFont);
        if (SUPPORTS_PAINT_FONT_VARIATION_SETTINGS) {
            RendererState rendererState = this.state;
            rendererState.fontVariationSet.addSetting("wght", rendererState.style.fontWeight.floatValue());
            RendererState rendererState2 = this.state;
            Style.FontStyle fontStyle = rendererState2.style.fontStyle;
            if (fontStyle == Style.FontStyle.italic) {
                rendererState2.fontVariationSet.addSetting("ital", CSSFontVariationSettings.VARIATION_ITALIC_VALUE_ON.floatValue());
                this.state.fontVariationSet.addSetting("slnt", CSSFontVariationSettings.VARIATION_OBLIQUE_VALUE_ON.floatValue());
            } else if (fontStyle == Style.FontStyle.oblique) {
                rendererState2.fontVariationSet.addSetting("slnt", CSSFontVariationSettings.VARIATION_OBLIQUE_VALUE_ON.floatValue());
            }
            RendererState rendererState3 = this.state;
            rendererState3.fontVariationSet.addSetting("wdth", rendererState3.style.fontStretch.floatValue());
            String string = this.state.fontVariationSet.toString();
            debug("fontVariationSettings = " + string, new Object[0]);
            this.state.fillPaint.setFontVariationSettings(string);
            this.state.strokePaint.setFontVariationSettings(string);
        }
        if (SUPPORTS_PAINT_FONT_FEATURE_SETTINGS) {
            String string2 = this.state.fontFeatureSet.toString();
            debug("fontFeatureSettings = " + string2, new Object[0]);
            this.state.fillPaint.setFontFeatureSettings(string2);
            this.state.strokePaint.setFontFeatureSettings(string2);
        }
    }

    @TargetApi(29)
    private void setBlendMode(Paint paint) {
        debug("Setting blend mode to " + this.state.style.mixBlendMode, new Object[0]);
        switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$CSSBlendMode[this.state.style.mixBlendMode.ordinal()]) {
            case 1:
                paint.setBlendMode(BlendMode.MULTIPLY);
                break;
            case 2:
                paint.setBlendMode(BlendMode.SCREEN);
                break;
            case 3:
                paint.setBlendMode(BlendMode.OVERLAY);
                break;
            case 4:
                paint.setBlendMode(BlendMode.DARKEN);
                break;
            case 5:
                paint.setBlendMode(BlendMode.LIGHTEN);
                break;
            case 6:
                paint.setBlendMode(BlendMode.COLOR_DODGE);
                break;
            case 7:
                paint.setBlendMode(BlendMode.COLOR_BURN);
                break;
            case 8:
                paint.setBlendMode(BlendMode.HARD_LIGHT);
                break;
            case 9:
                paint.setBlendMode(BlendMode.SOFT_LIGHT);
                break;
            case 10:
                paint.setBlendMode(BlendMode.DIFFERENCE);
                break;
            case 11:
                paint.setBlendMode(BlendMode.EXCLUSION);
                break;
            case 12:
                paint.setBlendMode(BlendMode.HUE);
                break;
            case 13:
                paint.setBlendMode(BlendMode.SATURATION);
                break;
            case 14:
                paint.setBlendMode(BlendMode.COLOR);
                break;
            case 15:
                paint.setBlendMode(BlendMode.LUMINOSITY);
                break;
            default:
                paint.setBlendMode(null);
                break;
        }
    }

    private void setClipRect(float f10, float f11, float f12, float f13) {
        float fFloatValueX = f12 + f10;
        float fFloatValueY = f13 + f11;
        SVGBase.CSSClipRect cSSClipRect = this.state.style.clip;
        if (cSSClipRect != null) {
            f10 += cSSClipRect.left.floatValueX(this);
            f11 += this.state.style.clip.top.floatValueY(this);
            fFloatValueX -= this.state.style.clip.right.floatValueX(this);
            fFloatValueY -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f10, f11, fFloatValueX, fFloatValueY);
    }

    private void setPaintColour(RendererState rendererState, boolean z10, SVGBase.SvgPaint svgPaint) {
        int i10;
        float fFloatValue = (z10 ? rendererState.style.fillOpacity : rendererState.style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVGBase.Colour) {
            i10 = ((SVGBase.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVGBase.CurrentColor)) {
            return;
        } else {
            i10 = rendererState.style.color.colour;
        }
        int iColourWithOpacity = colourWithOpacity(i10, fFloatValue);
        if (z10) {
            rendererState.fillPaint.setColor(iColourWithOpacity);
        } else {
            rendererState.strokePaint.setColor(iColourWithOpacity);
        }
    }

    private void setSolidColor(boolean z10, SVGBase.SolidColor solidColor) {
        if (z10) {
            if (isSpecified(solidColor.baseStyle, 2147483648L)) {
                RendererState rendererState = this.state;
                Style style = rendererState.style;
                SVGBase.SvgPaint svgPaint = solidColor.baseStyle.solidColor;
                style.fill = svgPaint;
                rendererState.hasFill = svgPaint != null;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                RendererState rendererState2 = this.state;
                setPaintColour(rendererState2, z10, rendererState2.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(solidColor.baseStyle, 2147483648L)) {
            RendererState rendererState3 = this.state;
            Style style2 = rendererState3.style;
            SVGBase.SvgPaint svgPaint2 = solidColor.baseStyle.solidColor;
            style2.stroke = svgPaint2;
            rendererState3.hasStroke = svgPaint2 != null;
        }
        if (isSpecified(solidColor.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
        }
        if (isSpecified(solidColor.baseStyle, 6442450944L)) {
            RendererState rendererState4 = this.state;
            setPaintColour(rendererState4, z10, rendererState4.style.stroke);
        }
    }

    private void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void statePush() {
        statePush(false);
    }

    private String textXMLSpaceTransform(String str, boolean z10, boolean z11) {
        if (this.state.spacePreserve) {
            return PATTERN_TABS_OR_LINE_BREAKS.matcher(str).replaceAll(" ");
        }
        String strReplaceAll = PATTERN_LINE_BREAKS.matcher(PATTERN_TABS.matcher(str).replaceAll("")).replaceAll(" ");
        if (z10) {
            strReplaceAll = PATTERN_START_SPACES.matcher(strReplaceAll).replaceAll("");
        }
        if (z11) {
            strReplaceAll = PATTERN_END_SPACES.matcher(strReplaceAll).replaceAll("");
        }
        return PATTERN_DOUBLE_SPACES.matcher(strReplaceAll).replaceAll(" ");
    }

    private void updateParentBoundingBox(SVGBase.SvgElement svgElement) {
        if (svgElement.parent == null || svgElement.boundingBox == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.matrixStack.peek().invert(matrix)) {
            SVGBase.Box box = svgElement.boundingBox;
            float f10 = box.minX;
            float f11 = box.minY;
            float fMaxX = box.maxX();
            SVGBase.Box box2 = svgElement.boundingBox;
            float f12 = box2.minY;
            float fMaxX2 = box2.maxX();
            float fMaxY = svgElement.boundingBox.maxY();
            SVGBase.Box box3 = svgElement.boundingBox;
            float[] fArr = {f10, f11, fMaxX, f12, fMaxX2, fMaxY, box3.minX, box3.maxY()};
            matrix.preConcat(this.canvas.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            SVGBase.SvgElement svgElement2 = (SVGBase.SvgElement) this.parentStack.peek();
            SVGBase.Box box4 = svgElement2.boundingBox;
            if (box4 == null) {
                svgElement2.boundingBox = SVGBase.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                box4.union(SVGBase.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private void updateStyle(RendererState rendererState, Style style) {
        if (isSpecified(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            rendererState.style.opacity = style.opacity;
        }
        if (isSpecified(style, 1L)) {
            rendererState.style.fill = style.fill;
            SVGBase.SvgPaint svgPaint = style.fill;
            rendererState.hasFill = (svgPaint == null || svgPaint == SVGBase.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4L)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149L)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2L)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8L)) {
            rendererState.style.stroke = style.stroke;
            SVGBase.SvgPaint svgPaint2 = style.stroke;
            rendererState.hasStroke = (svgPaint2 == null || svgPaint2 == SVGBase.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16L)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168L)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32L)) {
            Style style2 = rendererState.style;
            SVGBase.Length length = style.strokeWidth;
            style2.strokeWidth = length;
            rendererState.strokePaint.setStrokeWidth(length.floatValue(this));
        }
        if (isSpecified(style, 64L)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            int i10 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineCap[style.strokeLineCap.ordinal()];
            if (i10 == 1) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128L)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            int i11 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$Style$LineJoin[style.strokeLineJoin.ordinal()];
            if (i11 == 1) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256L)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512L)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024L)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        if (isSpecified(style, 1536L)) {
            SVGBase.Length[] lengthArr = rendererState.style.strokeDashArray;
            if (lengthArr == null) {
                rendererState.strokePaint.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i12 = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fFloatValue = rendererState.style.strokeDashArray[i13 % length2].floatValue(this);
                    fArr[i13] = fFloatValue;
                    f10 += fFloatValue;
                }
                if (f10 == 0.0f) {
                    rendererState.strokePaint.setPathEffect(null);
                } else {
                    float fFloatValue2 = rendererState.style.strokeDashOffset.floatValue(this);
                    if (fFloatValue2 < 0.0f) {
                        fFloatValue2 = (fFloatValue2 % f10) + f10;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, fFloatValue2));
                }
            }
        }
        if (isSpecified(style, 16384L)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.fontWeight.floatValue() == Float.MIN_VALUE) {
                float fFloatValue3 = rendererState.style.fontWeight.floatValue();
                if (fFloatValue3 >= 100.0f && fFloatValue3 < 550.0f) {
                    rendererState.style.fontWeight = Float.valueOf(100.0f);
                } else if (fFloatValue3 >= 550.0f && fFloatValue3 < 750.0f) {
                    rendererState.style.fontWeight = Float.valueOf(400.0f);
                } else if (fFloatValue3 >= 750.0f) {
                    rendererState.style.fontWeight = Float.valueOf(700.0f);
                }
            } else if (style.fontWeight.floatValue() == Float.MAX_VALUE) {
                float fFloatValue4 = rendererState.style.fontWeight.floatValue();
                if (fFloatValue4 < 350.0f) {
                    rendererState.style.fontWeight = Float.valueOf(400.0f);
                } else if (fFloatValue4 >= 350.0f && fFloatValue4 < 550.0f) {
                    rendererState.style.fontWeight = Float.valueOf(700.0f);
                } else if (fFloatValue4 >= 550.0f && fFloatValue4 < 900.0f) {
                    rendererState.style.fontWeight = Float.valueOf(900.0f);
                }
            } else {
                rendererState.style.fontWeight = style.fontWeight;
            }
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 2251799813685248L)) {
            rendererState.style.fontStretch = style.fontStretch;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            rendererState.style.textDecoration = style.textDecoration;
            Paint paint = rendererState.fillPaint;
            Style.TextDecoration textDecoration = style.textDecoration;
            Style.TextDecoration textDecoration2 = Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = rendererState.fillPaint;
            Style.TextDecoration textDecoration3 = style.textDecoration;
            Style.TextDecoration textDecoration4 = Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            if (SUPPORTS_STROKED_UNDERLINES) {
                rendererState.strokePaint.setStrikeThruText(style.textDecoration == textDecoration2);
                rendererState.strokePaint.setUnderlineText(style.textDecoration == textDecoration4);
            }
        }
        if (isSpecified(style, 68719476736L)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, 2097152L)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608L)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216L)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432L)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456L)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912L)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824L)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864L)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728L)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
        if (isSpecified(style, 274877906944L)) {
            rendererState.style.isolation = style.isolation;
        }
        if (isSpecified(style, 549755813888L)) {
            rendererState.style.mixBlendMode = style.mixBlendMode;
        }
        if (isSpecified(style, 562949953421312L)) {
            rendererState.style.fontKerning = style.fontKerning;
            rendererState.fontFeatureSet.applyKerning(style.fontKerning);
        }
        if (isSpecified(style, 35184372088832L)) {
            rendererState.style.fontFeatureSettings = style.fontFeatureSettings;
            rendererState.fontFeatureSet.applySettings(style.fontFeatureSettings);
        }
        if (isSpecified(style, 1099511627776L)) {
            rendererState.style.fontVariantLigatures = style.fontVariantLigatures;
            rendererState.fontFeatureSet.applySettings(style.fontVariantLigatures);
        }
        if (isSpecified(style, 2199023255552L)) {
            rendererState.style.fontVariantPosition = style.fontVariantPosition;
            rendererState.fontFeatureSet.applySettings(style.fontVariantPosition);
        }
        if (isSpecified(style, 4398046511104L)) {
            rendererState.style.fontVariantCaps = style.fontVariantCaps;
            rendererState.fontFeatureSet.applySettings(style.fontVariantCaps);
        }
        if (isSpecified(style, 8796093022208L)) {
            rendererState.style.fontVariantNumeric = style.fontVariantNumeric;
            rendererState.fontFeatureSet.applySettings(style.fontVariantNumeric);
        }
        if (isSpecified(style, 17592186044416L)) {
            rendererState.style.fontVariantEastAsian = style.fontVariantEastAsian;
            rendererState.fontFeatureSet.applySettings(style.fontVariantEastAsian);
        }
        if (SUPPORTS_PAINT_FONT_VARIATION_SETTINGS && isSpecified(style, 1125899906842624L)) {
            rendererState.style.fontVariationSettings = style.fontVariationSettings;
            rendererState.fontVariationSet.applySettings(style.fontVariationSettings);
        }
        if (isSpecified(style, 70368744177664L)) {
            rendererState.style.writingMode = style.writingMode;
        }
        if (isSpecified(style, 140737488355328L)) {
            rendererState.style.glyphOrientationVertical = style.glyphOrientationVertical;
        }
        if (isSpecified(style, 281474976710656L)) {
            rendererState.style.textOrientation = style.textOrientation;
        }
        if (isSpecified(style, 4503599627370496L)) {
            rendererState.style.letterSpacing = style.letterSpacing;
            if (SUPPORTS_PAINT_LETTER_SPACING) {
                rendererState.fillPaint.setLetterSpacing(style.letterSpacing.floatValue(this) / getCurrentFontSize());
                rendererState.strokePaint.setLetterSpacing(style.letterSpacing.floatValue(this) / getCurrentFontSize());
            }
        }
        if (isSpecified(style, 9007199254740992L)) {
            rendererState.style.wordSpacing = style.wordSpacing;
            if (SUPPORTS_PAINT_WORD_SPACING) {
                rendererState.fillPaint.setWordSpacing(style.wordSpacing.floatValue(this));
                rendererState.strokePaint.setWordSpacing(style.wordSpacing.floatValue(this));
            }
        }
    }

    private void updateStyleForElement(RendererState rendererState, SVGBase.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        Style style = svgElementBase.baseStyle;
        if (style != null) {
            updateStyle(rendererState, style);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule rule : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, rule.selector, svgElementBase)) {
                    updateStyle(rendererState, rule.style);
                }
            }
        }
        Style style2 = svgElementBase.style;
        if (style2 != null) {
            updateStyle(rendererState, style2);
        }
    }

    private void viewportFill() {
        int iColourWithOpacity;
        Style style = this.state.style;
        SVGBase.SvgPaint svgPaint = style.viewportFill;
        if (svgPaint instanceof SVGBase.Colour) {
            iColourWithOpacity = ((SVGBase.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVGBase.CurrentColor)) {
            return;
        } else {
            iColourWithOpacity = style.color.colour;
        }
        Float f10 = style.viewportFillOpacity;
        if (f10 != null) {
            iColourWithOpacity = colourWithOpacity(iColourWithOpacity, f10.floatValue());
        }
        this.canvas.drawColor(iColourWithOpacity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean visible() {
        Boolean bool = this.state.style.visibility;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void warn(String str, Object... objArr) {
        Log.w(TAG, String.format(str, objArr));
    }

    float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    float getDPI() {
        return this.dpi;
    }

    SVGBase.Box getEffectiveViewPortInUserUnits() {
        RendererState rendererState = this.state;
        SVGBase.Box box = rendererState.viewBox;
        return box != null ? box : rendererState.viewPort;
    }

    void renderDocument(SVGBase sVGBase, RenderOptionsBase renderOptionsBase) {
        SVGBase.Box box;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptionsBase == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.document = sVGBase;
        SVGBase.Svg rootElement = sVGBase.getRootElement();
        if (rootElement == null) {
            warn("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (renderOptionsBase.hasView()) {
            SVGBase.SvgElementBase elementById = this.document.getElementById(renderOptionsBase.viewId);
            if (!(elementById instanceof SVGBase.View)) {
                Log.w(TAG, String.format("View element with id \"%s\" not found.", renderOptionsBase.viewId));
                return;
            }
            SVGBase.View view = (SVGBase.View) elementById;
            box = view.viewBox;
            if (box == null) {
                Log.w(TAG, String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptionsBase.viewId));
                return;
            }
            preserveAspectRatio = view.preserveAspectRatio;
        } else {
            box = renderOptionsBase.hasViewBox() ? renderOptionsBase.viewBox : rootElement.viewBox;
            preserveAspectRatio = renderOptionsBase.hasPreserveAspectRatio() ? renderOptionsBase.preserveAspectRatio : rootElement.preserveAspectRatio;
        }
        if (renderOptionsBase.hasCss()) {
            if (renderOptionsBase.css != null) {
                sVGBase.addCSSRules(new CSSParser(CSSParser.Source.RenderOptions, this.externalFileResolver).parse(renderOptionsBase.css));
            } else {
                CSSParser.Ruleset ruleset = renderOptionsBase.cssRuleset;
                if (ruleset != null) {
                    sVGBase.addCSSRules(ruleset);
                }
            }
        }
        if (renderOptionsBase.hasTarget()) {
            CSSParser.RuleMatchContext ruleMatchContext = new CSSParser.RuleMatchContext();
            this.ruleMatchContext = ruleMatchContext;
            ruleMatchContext.targetElement = sVGBase.getElementById(renderOptionsBase.targetId);
        }
        resetState();
        checkXMLSpaceAttribute(rootElement);
        statePush(true);
        SVGBase.Box box2 = new SVGBase.Box(renderOptionsBase.viewPort);
        SVGBase.Length length = rootElement.width;
        if (length != null) {
            box2.width = length.floatValue(this, box2.width);
        }
        SVGBase.Length length2 = rootElement.height;
        if (length2 != null) {
            box2.height = length2.floatValue(this, box2.height);
        }
        render(rootElement, box2, box, preserveAspectRatio);
        statePop();
        if (renderOptionsBase.hasCss()) {
            sVGBase.clearRenderCSSRules();
        }
    }

    private void checkForClipPath(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        if (this.state.style.clipPath == null) {
            return;
        }
        if (!SUPPORTS_PATH_OP) {
            checkForClipPath_OldStyle(svgElement, box);
            return;
        }
        Path pathCalculateClipPath = calculateClipPath(svgElement, box);
        if (pathCalculateClipPath != null) {
            this.canvas.clipPath(pathCalculateClipPath);
        }
    }

    private void popLayer(SVGBase.SvgElement svgElement, SVGBase.Box box) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvasSaveLayer(this.canvas, null, paint);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvasSaveLayer(this.canvas, null, paint2);
            SVGBase.Mask mask = (SVGBase.Mask) this.document.resolveIRI(this.state.style.mask);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvasSaveLayer(this.canvas, null, paint3);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    private boolean pushLayer(float f10) {
        if (!requiresCompositing() && f10 == 1.0f) {
            return false;
        }
        Paint paint = new Paint();
        paint.setAlpha(clamp255(this.state.style.opacity.floatValue() * f10));
        if (SUPPORTS_BLEND_MODE && this.state.style.mixBlendMode != Style.CSSBlendMode.normal) {
            setBlendMode(paint);
        }
        canvasSaveLayer(this.canvas, null, paint);
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        String str = rendererState.style.mask;
        if (str != null && !(this.document.resolveIRI(str) instanceof SVGBase.Mask)) {
            error("Mask reference '%s' not found", this.state.style.mask);
            this.state.style.mask = null;
        }
        return true;
    }

    private void statePush(boolean z10) {
        if (z10) {
            canvasSaveLayer(this.canvas, null, null);
        } else {
            this.canvas.save();
        }
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private RendererState findInheritFromAncestorState(SVGBase.SvgObject svgObject, RendererState rendererState) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i10 = 0;
            if (svgObject instanceof SVGBase.SvgElementBase) {
                arrayList.add(0, (SVGBase.SvgElementBase) svgObject);
            }
            Object obj = svgObject.parent;
            if (obj == null) {
                break;
            }
            svgObject = (SVGBase.SvgObject) obj;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            updateStyleForElement(rendererState, (SVGBase.SvgElementBase) obj2);
        }
        RendererState rendererState2 = this.state;
        rendererState.viewBox = rendererState2.viewBox;
        rendererState.viewPort = rendererState2.viewPort;
        return rendererState;
    }

    private List<MarkerVector> calculateMarkerPositions(SVGBase.PolyLine polyLine) {
        float[] fArr = polyLine.points;
        int length = fArr != null ? fArr.length : 0;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr2 = polyLine.points;
        float f10 = 0.0f;
        MarkerVector markerVector = new MarkerVector(fArr2[0], fArr2[1], 0.0f, 0.0f);
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr3 = polyLine.points;
            f10 = fArr3[i10];
            f11 = fArr3[i10 + 1];
            markerVector.add(f10, f11);
            arrayList.add(markerVector);
            i10 += 2;
            markerVector = new MarkerVector(f10, f11, f10 - markerVector.f95984x, f11 - markerVector.f95985y);
        }
        if (polyLine instanceof SVGBase.Polygon) {
            float[] fArr4 = polyLine.points;
            float f12 = fArr4[0];
            if (f10 != f12) {
                float f13 = fArr4[1];
                if (f11 != f13) {
                    markerVector.add(f12, f13);
                    arrayList.add(markerVector);
                    MarkerVector markerVector2 = new MarkerVector(f12, f13, f12 - markerVector.f95984x, f13 - markerVector.f95985y);
                    markerVector2.add((MarkerVector) arrayList.get(0));
                    arrayList.add(markerVector2);
                    arrayList.set(0, markerVector2);
                }
            }
            return arrayList;
        }
        arrayList.add(markerVector);
        return arrayList;
    }

    private static class MarkerVector {
        float dx;
        float dy;
        boolean isAmbiguous = false;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final float f95984x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final float f95985y;

        MarkerVector(float f10, float f11, float f12, float f13) {
            this.dx = 0.0f;
            this.dy = 0.0f;
            this.f95984x = f10;
            this.f95985y = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.dx = (float) (((double) f12) / dSqrt);
                this.dy = (float) (((double) f13) / dSqrt);
            }
        }

        void add(float f10, float f11) {
            float f12 = f10 - this.f95984x;
            float f13 = f11 - this.f95985y;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.dx;
            if (f12 != (-f14) || f13 != (-this.dy)) {
                this.dx = f14 + f12;
                this.dy += f13;
            } else {
                this.isAmbiguous = true;
                this.dx = -f13;
                this.dy = f12;
            }
        }

        public String toString() {
            return "(" + this.f95984x + StringUtils.COMMA + this.f95985y + " " + this.dx + StringUtils.COMMA + this.dy + ")";
        }

        void add(MarkerVector markerVector) {
            float f10 = markerVector.dx;
            float f11 = this.dx;
            if (f10 == (-f11)) {
                float f12 = markerVector.dy;
                if (f12 == (-this.dy)) {
                    this.isAmbiguous = true;
                    this.dx = -f12;
                    this.dy = markerVector.dx;
                    return;
                }
            }
            this.dx = f11 + f10;
            this.dy += markerVector.dy;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path makePathAndBoundingBox(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Rect r21) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.SVGAndroidRenderer.makePathAndBoundingBox(net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$Rect):android.graphics.Path");
    }

    private void addObjectToClip(SVGBase.Path path, Path path2, Matrix matrix) {
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            Matrix matrix2 = path.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path path3 = new PathConverter(path.f96002d).getPath();
            if (path.boundingBox == null) {
                path.boundingBox = calculatePathBounds(path3);
            }
            checkForClipPath(path);
            path2.setFillType(getClipRuleFromState());
            path2.addPath(path3, matrix);
        }
    }

    public static class RendererState {
        final Paint fillPaint;
        final CSSFontFeatureSettings fontFeatureSet;
        final CSSFontVariationSettings fontVariationSet;
        boolean hasFill;
        boolean hasStroke;
        boolean spacePreserve;
        final Paint strokePaint;
        Style style;
        SVGBase.Box viewBox;
        SVGBase.Box viewPort;

        @TargetApi(21)
        RendererState() {
            Paint paint = new Paint();
            this.fillPaint = paint;
            paint.setFlags(193);
            boolean z10 = SVGAndroidRenderer.SUPPORTS_FONT_HINTING;
            if (z10) {
                paint.setHinting(0);
            }
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.strokePaint = paint2;
            paint2.setFlags(193);
            if (z10) {
                paint2.setHinting(0);
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.fontFeatureSet = new CSSFontFeatureSettings();
            this.fontVariationSet = new CSSFontVariationSettings();
            this.style = Style.getDefaultStyle();
        }

        RendererState(RendererState rendererState) {
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            SVGBase.Box box = rendererState.viewPort;
            if (box != null) {
                this.viewPort = new SVGBase.Box(box);
            }
            SVGBase.Box box2 = rendererState.viewBox;
            if (box2 != null) {
                this.viewBox = new SVGBase.Box(box2);
            }
            this.spacePreserve = rendererState.spacePreserve;
            this.fontFeatureSet = new CSSFontFeatureSettings(rendererState.fontFeatureSet);
            this.fontVariationSet = new CSSFontVariationSettings(rendererState.fontVariationSet);
            try {
                this.style = (Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e(SVGAndroidRenderer.TAG, "Unexpected clone error", e10);
                this.style = Style.getDefaultStyle();
            }
        }
    }

    private void fillInChainedGradientFields(SVGBase.SvgLinearGradient svgLinearGradient, SVGBase.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.f96010x1 == null) {
            svgLinearGradient.f96010x1 = svgLinearGradient2.f96010x1;
        }
        if (svgLinearGradient.f96012y1 == null) {
            svgLinearGradient.f96012y1 = svgLinearGradient2.f96012y1;
        }
        if (svgLinearGradient.f96011x2 == null) {
            svgLinearGradient.f96011x2 = svgLinearGradient2.f96011x2;
        }
        if (svgLinearGradient.f96013y2 == null) {
            svgLinearGradient.f96013y2 = svgLinearGradient2.f96013y2;
        }
    }

    private void addObjectToClip(SVGBase.GraphicsElement graphicsElement, Path path, Matrix matrix) {
        Path pathMakePathAndBoundingBox;
        updateStyleForElement(this.state, graphicsElement);
        if (display() && visible()) {
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (graphicsElement instanceof SVGBase.Rect) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVGBase.Rect) graphicsElement);
            } else if (graphicsElement instanceof SVGBase.Circle) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVGBase.Circle) graphicsElement);
            } else if (graphicsElement instanceof SVGBase.Ellipse) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVGBase.Ellipse) graphicsElement);
            } else if (!(graphicsElement instanceof SVGBase.PolyLine)) {
                return;
            } else {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVGBase.PolyLine) graphicsElement);
            }
            if (pathMakePathAndBoundingBox == null) {
                return;
            }
            checkForClipPath(graphicsElement);
            path.setFillType(getClipRuleFromState());
            path.addPath(pathMakePathAndBoundingBox, matrix);
        }
    }

    private void fillInChainedGradientFields(SVGBase.SvgRadialGradient svgRadialGradient, SVGBase.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.cx == null) {
            svgRadialGradient.cx = svgRadialGradient2.cx;
        }
        if (svgRadialGradient.cy == null) {
            svgRadialGradient.cy = svgRadialGradient2.cy;
        }
        if (svgRadialGradient.f96014r == null) {
            svgRadialGradient.f96014r = svgRadialGradient2.f96014r;
        }
        if (svgRadialGradient.fx == null) {
            svgRadialGradient.fx = svgRadialGradient2.fx;
        }
        if (svgRadialGradient.fy == null) {
            svgRadialGradient.fy = svgRadialGradient2.fy;
        }
        if (svgRadialGradient.fr == null) {
            svgRadialGradient.fr = svgRadialGradient2.fr;
        }
    }

    private void render(SVGBase.Svg svg) {
        render(svg, makeViewPort(svg.f96007x, svg.f96008y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVGBase.Svg svg, SVGBase.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVGBase.Svg svg, SVGBase.Box box, SVGBase.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.preserveAspectRatio) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, svg);
        if (display()) {
            RendererState rendererState = this.state;
            rendererState.viewPort = box;
            if (!rendererState.style.overflow.booleanValue()) {
                SVGBase.Box box3 = this.state.viewPort;
                setClipRect(box3.minX, box3.minY, box3.width, box3.height);
            }
            checkForClipPath(svg, this.state.viewPort);
            if (box2 != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                this.state.viewBox = svg.viewBox;
            } else {
                Canvas canvas = this.canvas;
                SVGBase.Box box4 = this.state.viewPort;
                canvas.translate(box4.minX, box4.minY);
                this.state.viewBox = null;
            }
            boolean zPushLayer = pushLayer();
            viewportFill();
            renderChildren(svg, true);
            if (zPushLayer) {
                popLayer(svg);
            }
            updateParentBoundingBox(svg);
        }
    }

    private Path makePathAndBoundingBox(SVGBase.Circle circle) {
        SVGBase.Length length = circle.cx;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVGBase.Length length2 = circle.cy;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float fFloatValue = circle.f95993r.floatValue(this);
        float f10 = fFloatValueX - fFloatValue;
        float f11 = fFloatValueY - fFloatValue;
        float f12 = fFloatValueX + fFloatValue;
        float f13 = fFloatValueY + fFloatValue;
        if (circle.boundingBox == null) {
            float f14 = 2.0f * fFloatValue;
            circle.boundingBox = new SVGBase.Box(f10, f11, f14, f14);
        }
        float f15 = fFloatValue * BEZIER_ARC_FACTOR;
        Path path = new Path();
        path.moveTo(fFloatValueX, f11);
        float f16 = fFloatValueX + f15;
        float f17 = fFloatValueY - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fFloatValueY);
        float f18 = fFloatValueY + f15;
        path.cubicTo(f12, f18, f16, f13, fFloatValueX, f13);
        float f19 = fFloatValueX - f15;
        path.cubicTo(f19, f13, f10, f18, f10, fFloatValueY);
        path.cubicTo(f10, f17, f19, f11, fFloatValueX, f11);
        path.close();
        return path;
    }

    private void addObjectToClip(SVGBase.Use use, Path path, Matrix matrix) {
        updateStyleForElement(this.state, use);
        if (display() && visible()) {
            Matrix matrix2 = use.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            SVGBase.SvgObject svgObjectResolveIRI = use.document.resolveIRI(use.href);
            if (svgObjectResolveIRI == null) {
                error("Use reference '%s' not found", use.href);
            } else {
                checkForClipPath(use);
                addObjectToClip(svgObjectResolveIRI, false, path, matrix);
            }
        }
    }

    private void addObjectToClip(SVGBase.Text text, Path path, Matrix matrix) {
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix2 = text.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List<SVGBase.Length> list = text.f96015x;
            float fFloatValueY = 0.0f;
            float fFloatValueX = (list == null || list.size() == 0) ? 0.0f : text.f96015x.get(0).floatValueX(this);
            List<SVGBase.Length> list2 = text.f96016y;
            float fFloatValueY2 = (list2 == null || list2.size() == 0) ? 0.0f : text.f96016y.get(0).floatValueY(this);
            List<SVGBase.Length> list3 = text.dx;
            float fFloatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.dx.get(0).floatValueX(this);
            List<SVGBase.Length> list4 = text.dy;
            if (list4 != null && list4.size() != 0) {
                fFloatValueY = text.dy.get(0).floatValueY(this);
            }
            if (this.state.style.textAnchor != Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(text);
                if (this.state.style.textAnchor == Style.TextAnchor.Middle) {
                    fCalculateTextWidth /= 2.0f;
                }
                fFloatValueX -= fCalculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fFloatValueX, fFloatValueY2);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVGBase.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            checkForClipPath(text);
            Path path2 = new Path();
            enumerateTextSpans(text, new PlainTextToPath(fFloatValueX + fFloatValueX2, fFloatValueY2 + fFloatValueY, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private Path makePathAndBoundingBox(SVGBase.Ellipse ellipse) {
        SVGBase.Length length = ellipse.cx;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVGBase.Length length2 = ellipse.cy;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float fFloatValueX2 = ellipse.rx.floatValueX(this);
        float fFloatValueY2 = ellipse.ry.floatValueY(this);
        float f10 = fFloatValueX - fFloatValueX2;
        float f11 = fFloatValueY - fFloatValueY2;
        float f12 = fFloatValueX + fFloatValueX2;
        float f13 = fFloatValueY + fFloatValueY2;
        if (ellipse.boundingBox == null) {
            ellipse.boundingBox = new SVGBase.Box(f10, f11, fFloatValueX2 * 2.0f, 2.0f * fFloatValueY2);
        }
        float f14 = fFloatValueX2 * BEZIER_ARC_FACTOR;
        float f15 = fFloatValueY2 * BEZIER_ARC_FACTOR;
        Path path = new Path();
        path.moveTo(fFloatValueX, f11);
        float f16 = fFloatValueX + f14;
        float f17 = fFloatValueY - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fFloatValueY);
        float f18 = fFloatValueY + f15;
        path.cubicTo(f12, f18, f16, f13, fFloatValueX, f13);
        float f19 = fFloatValueX - f14;
        path.cubicTo(f19, f13, f10, f18, f10, fFloatValueY);
        path.cubicTo(f10, f17, f19, f11, fFloatValueX, f11);
        path.close();
        return path;
    }

    private void render(SVGBase.Group group) {
        debug(group.getNodeName() + " render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            Matrix matrix = group.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(group);
            boolean zPushLayer = pushLayer();
            renderChildren(group, true);
            if (zPushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    private void render(SVGBase.Switch r32) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, r32);
        if (display()) {
            Matrix matrix = r32.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(r32);
            boolean zPushLayer = pushLayer();
            renderSwitchChild(r32);
            if (zPushLayer) {
                popLayer(r32);
            }
            updateParentBoundingBox(r32);
        }
    }

    private Path makePathAndBoundingBox(SVGBase.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.points;
        int i10 = 0;
        int length = fArr != null ? fArr.length : 0;
        if (length % 2 != 0) {
            return null;
        }
        if (length > 0) {
            while (length >= 2) {
                if (i10 == 0) {
                    float[] fArr2 = polyLine.points;
                    path.moveTo(fArr2[i10], fArr2[i10 + 1]);
                } else {
                    float[] fArr3 = polyLine.points;
                    path.lineTo(fArr3[i10], fArr3[i10 + 1]);
                }
                i10 += 2;
                length -= 2;
            }
            if (polyLine instanceof SVGBase.Polygon) {
                path.close();
            }
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    private void render(SVGBase.Use use) {
        debug("Use render", new Object[0]);
        SVGBase.Length length = use.width;
        if (length == null || !length.isZero()) {
            SVGBase.Length length2 = use.height;
            if (length2 == null || !length2.isZero()) {
                updateStyleForElement(this.state, use);
                if (display()) {
                    SVGBase.SvgObject svgObjectResolveIRI = use.document.resolveIRI(use.href);
                    if (svgObjectResolveIRI == null) {
                        error("Use reference '%s' not found", use.href);
                        return;
                    }
                    Matrix matrix = use.transform;
                    if (matrix != null) {
                        this.canvas.concat(matrix);
                    }
                    SVGBase.Length length3 = use.f96018x;
                    float fFloatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
                    SVGBase.Length length4 = use.f96019y;
                    this.canvas.translate(fFloatValueX, length4 != null ? length4.floatValueY(this) : 0.0f);
                    checkForClipPath(use);
                    boolean zPushLayer = pushLayer();
                    parentPush(use);
                    if (svgObjectResolveIRI instanceof SVGBase.Svg) {
                        SVGBase.Box boxMakeViewPort = makeViewPort(null, null, use.width, use.height);
                        statePush();
                        render((SVGBase.Svg) svgObjectResolveIRI, boxMakeViewPort);
                        statePop();
                    } else if (svgObjectResolveIRI instanceof SVGBase.Symbol) {
                        SVGBase.Length length5 = use.width;
                        if (length5 == null) {
                            length5 = new SVGBase.Length(100.0f, SVGBase.Unit.percent);
                        }
                        SVGBase.Length length6 = use.height;
                        if (length6 == null) {
                            length6 = new SVGBase.Length(100.0f, SVGBase.Unit.percent);
                        }
                        SVGBase.Box boxMakeViewPort2 = makeViewPort(null, null, length5, length6);
                        statePush();
                        render((SVGBase.Symbol) svgObjectResolveIRI, boxMakeViewPort2);
                        statePop();
                    } else {
                        render(svgObjectResolveIRI);
                    }
                    parentPop();
                    if (zPushLayer) {
                        popLayer(use);
                    }
                    updateParentBoundingBox(use);
                }
            }
        }
    }

    private Path makePathAndBoundingBox(SVGBase.Text text) {
        List<SVGBase.Length> list = text.f96015x;
        float fFloatValueY = 0.0f;
        float fFloatValueX = (list == null || list.size() == 0) ? 0.0f : text.f96015x.get(0).floatValueX(this);
        List<SVGBase.Length> list2 = text.f96016y;
        float fFloatValueY2 = (list2 == null || list2.size() == 0) ? 0.0f : text.f96016y.get(0).floatValueY(this);
        List<SVGBase.Length> list3 = text.dx;
        float fFloatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.dx.get(0).floatValueX(this);
        List<SVGBase.Length> list4 = text.dy;
        if (list4 != null && list4.size() != 0) {
            fFloatValueY = text.dy.get(0).floatValueY(this);
        }
        if (this.state.style.textAnchor != Style.TextAnchor.Start) {
            float fCalculateTextWidth = calculateTextWidth(text);
            if (this.state.style.textAnchor == Style.TextAnchor.Middle) {
                fCalculateTextWidth /= 2.0f;
            }
            fFloatValueX -= fCalculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fFloatValueX, fFloatValueY2);
            enumerateTextSpans(text, textBoundsCalculator);
            RectF rectF = textBoundsCalculator.bbox;
            text.boundingBox = new SVGBase.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(fFloatValueX + fFloatValueX2, fFloatValueY2 + fFloatValueY, path));
        return path;
    }

    private void render(SVGBase.Path path) {
        debug("Path render", new Object[0]);
        if (path.f96002d == null) {
            return;
        }
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = path.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path path2 = new PathConverter(path.f96002d).getPath();
                if (path.boundingBox == null) {
                    path.boundingBox = calculatePathBounds(path2);
                }
                updateParentBoundingBox(path);
                checkForGradientsAndPatterns(path);
                checkForClipPath(path);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    path2.setFillType(getFillTypeFromState());
                    doFilledPath(path, path2);
                }
                if (this.state.hasStroke) {
                    doStroke(path2);
                }
                renderMarkers(path);
                if (zPushLayer) {
                    popLayer(path);
                }
            }
        }
    }

    private void render(SVGBase.Rect rect) {
        debug("Rect render", new Object[0]);
        SVGBase.Length length = rect.width;
        if (length == null || rect.height == null || length.isZero() || rect.height.isZero()) {
            return;
        }
        updateStyleForElement(this.state, rect);
        if (display() && visible()) {
            Matrix matrix = rect.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(rect);
            updateParentBoundingBox(rect);
            checkForGradientsAndPatterns(rect);
            checkForClipPath(rect);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(rect, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(rect);
            }
        }
    }

    private void render(SVGBase.Circle circle) {
        debug("Circle render", new Object[0]);
        SVGBase.Length length = circle.f95993r;
        if (length == null || length.isZero()) {
            return;
        }
        updateStyleForElement(this.state, circle);
        if (display() && visible()) {
            Matrix matrix = circle.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(circle);
            updateParentBoundingBox(circle);
            checkForGradientsAndPatterns(circle);
            checkForClipPath(circle);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(circle, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(circle);
            }
        }
    }

    private void render(SVGBase.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        SVGBase.Length length = ellipse.rx;
        if (length == null || ellipse.ry == null || length.isZero() || ellipse.ry.isZero()) {
            return;
        }
        updateStyleForElement(this.state, ellipse);
        if (display() && visible()) {
            Matrix matrix = ellipse.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(ellipse);
            updateParentBoundingBox(ellipse);
            checkForGradientsAndPatterns(ellipse);
            checkForClipPath(ellipse);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(ellipse, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(ellipse);
            }
        }
    }

    private void render(SVGBase.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            Matrix matrix = line.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean zPushLayer = pushLayer();
            doStroke(pathMakePathAndBoundingBox);
            renderMarkers(line);
            if (zPushLayer) {
                popLayer(line);
            }
        }
    }

    private void render(SVGBase.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polyLine.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                float[] fArr = polyLine.points;
                int length = fArr != null ? fArr.length : 0;
                if (length < 2 || length % 2 == 1) {
                    return;
                }
                Path pathMakePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                updateParentBoundingBox(polyLine);
                pathMakePathAndBoundingBox.setFillType(getFillTypeFromState());
                checkForGradientsAndPatterns(polyLine);
                checkForClipPath(polyLine);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polyLine, pathMakePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(pathMakePathAndBoundingBox);
                }
                renderMarkers(polyLine);
                if (zPushLayer) {
                    popLayer(polyLine);
                }
            }
        }
    }

    private void render(SVGBase.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polygon.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                float[] fArr = polygon.points;
                if ((fArr != null ? fArr.length : 0) < 2) {
                    return;
                }
                Path pathMakePathAndBoundingBox = makePathAndBoundingBox(polygon);
                updateParentBoundingBox(polygon);
                checkForGradientsAndPatterns(polygon);
                checkForClipPath(polygon);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polygon, pathMakePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(pathMakePathAndBoundingBox);
                }
                renderMarkers(polygon);
                if (zPushLayer) {
                    popLayer(polygon);
                }
            }
        }
    }

    private void render(SVGBase.Text text) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            selectTypefaceAndFontStyling();
            Matrix matrix = text.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            List<SVGBase.Length> list = text.f96015x;
            float fFloatValueY = 0.0f;
            float fFloatValueX = (list == null || list.size() == 0) ? 0.0f : text.f96015x.get(0).floatValueX(this);
            List<SVGBase.Length> list2 = text.f96016y;
            float fFloatValueY2 = (list2 == null || list2.size() == 0) ? 0.0f : text.f96016y.get(0).floatValueY(this);
            List<SVGBase.Length> list3 = text.dx;
            float fFloatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.dx.get(0).floatValueX(this);
            List<SVGBase.Length> list4 = text.dy;
            if (list4 != null && list4.size() != 0) {
                fFloatValueY = text.dy.get(0).floatValueY(this);
            }
            Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(text);
                if (anchorPosition == Style.TextAnchor.Middle) {
                    fCalculateTextWidth /= 2.0f;
                }
                fFloatValueX -= fCalculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(fFloatValueX, fFloatValueY2);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVGBase.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean zPushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(fFloatValueX + fFloatValueX2, fFloatValueY2 + fFloatValueY));
            if (zPushLayer) {
                popLayer(text);
            }
        }
    }

    private void render(SVGBase.Symbol symbol, SVGBase.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, symbol);
        RendererState rendererState = this.state;
        rendererState.viewPort = box;
        if (!rendererState.style.overflow.booleanValue()) {
            SVGBase.Box box2 = this.state.viewPort;
            setClipRect(box2.minX, box2.minY, box2.width, box2.height);
        }
        SVGBase.Box box3 = symbol.viewBox;
        if (box3 != null) {
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box3, preserveAspectRatio));
            this.state.viewBox = symbol.viewBox;
        } else {
            Canvas canvas = this.canvas;
            SVGBase.Box box4 = this.state.viewPort;
            canvas.translate(box4.minX, box4.minY);
            this.state.viewBox = null;
        }
        boolean zPushLayer = pushLayer();
        renderChildren(symbol, true);
        if (zPushLayer) {
            popLayer(symbol);
        }
        updateParentBoundingBox(symbol);
    }

    private void render(SVGBase.Image image) {
        SVGBase.Length length;
        String str;
        debug("Image render", new Object[0]);
        SVGBase.Length length2 = image.width;
        if (length2 == null || length2.isZero() || (length = image.height) == null || length.isZero() || (str = image.href) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        Bitmap bitmapCheckForImageDataURL = checkForImageDataURL(str);
        if (bitmapCheckForImageDataURL == null) {
            SVGExternalFileResolver sVGExternalFileResolver = this.externalFileResolver;
            if (sVGExternalFileResolver == null) {
                return;
            } else {
                bitmapCheckForImageDataURL = sVGExternalFileResolver.resolveImage(image.href);
            }
        }
        if (bitmapCheckForImageDataURL == null) {
            error("Could not locate image '%s'", image.href);
            return;
        }
        SVGBase.Box box = new SVGBase.Box(0.0f, 0.0f, bitmapCheckForImageDataURL.getWidth(), bitmapCheckForImageDataURL.getHeight());
        updateStyleForElement(this.state, image);
        if (display() && visible()) {
            Matrix matrix = image.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            SVGBase.Length length3 = image.f95994x;
            float fFloatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVGBase.Length length4 = image.f95995y;
            this.state.viewPort = new SVGBase.Box(fFloatValueX, length4 != null ? length4.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
            if (!this.state.style.overflow.booleanValue()) {
                SVGBase.Box box2 = this.state.viewPort;
                setClipRect(box2.minX, box2.minY, box2.width, box2.height);
            }
            image.boundingBox = this.state.viewPort;
            updateParentBoundingBox(image);
            checkForClipPath(image);
            boolean zPushLayer = pushLayer();
            viewportFill();
            this.canvas.save();
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
            this.canvas.drawBitmap(bitmapCheckForImageDataURL, 0.0f, 0.0f, new Paint(this.state.style.imageRendering != Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.canvas.restore();
            if (zPushLayer) {
                popLayer(image);
            }
        }
    }
}
