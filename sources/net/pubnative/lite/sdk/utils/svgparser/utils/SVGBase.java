package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.utils.AtomManager;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.RenderOptions;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* JADX INFO: loaded from: classes3.dex */
public class SVGBase {
    private static final int DEFAULT_PICTURE_HEIGHT = 512;
    private static final int DEFAULT_PICTURE_WIDTH = 512;
    private static final double SQRT2 = 1.414213562373095d;
    private static boolean enableInternalEntitiesSingleton = true;
    private static SVGExternalFileResolver externalFileResolverSingleton;
    private final boolean enableInternalEntities;
    private final SVGExternalFileResolver externalFileResolver;
    private Svg rootElement = null;
    private String title = "";
    private String desc = "";
    private float renderDPI = 96.0f;
    private final CSSParser.Ruleset cssRules = new CSSParser.Ruleset();
    private final Map<String, SvgElementBase> idToElementMap = new HashMap();

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit;

        static {
            int[] iArr = new int[Unit.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit = iArr;
            try {
                iArr[Unit.em.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.ex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.in.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.cm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.mm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.pt.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.pc.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.percent.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[Unit.px.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class A extends Group {
        String href;

        A() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "a";
        }
    }

    public static class CSSClipRect {
        final Length bottom;
        final Length left;
        final Length right;
        final Length top;

        CSSClipRect(Length length, Length length2, Length length3, Length length4) {
            this.top = length;
            this.right = length2;
            this.bottom = length3;
            this.left = length4;
        }
    }

    static class Circle extends GraphicsElement {
        Length cx;
        Length cy;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Length f95993r;

        Circle() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "circle";
        }
    }

    static class ClipPath extends Group implements NotDirectlyRendered {
        static final String NODE_NAME = "clipPath";
        Boolean clipPathUnitsAreUser;

        ClipPath() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return NODE_NAME;
        }
    }

    public static class Colour extends SvgPaint {
        static final Colour BLACK = new Colour(ViewCompat.MEASURED_STATE_MASK);
        static final Colour TRANSPARENT = new Colour(0);
        final int colour;

        Colour(int i10) {
            this.colour = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.colour));
        }
    }

    static class CurrentColor extends SvgPaint {
        private static final CurrentColor instance = new CurrentColor();

        private CurrentColor() {
        }

        static CurrentColor getInstance() {
            return instance;
        }
    }

    static class Defs extends Group implements NotDirectlyRendered {
        Defs() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "defs";
        }
    }

    static class Ellipse extends GraphicsElement {
        Length cx;
        Length cy;
        Length rx;
        Length ry;

        Ellipse() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "ellipse";
        }
    }

    static abstract class GradientElement extends SvgElementBase implements SvgContainer {
        List<SvgObject> children = new ArrayList();
        Matrix gradientTransform;
        Boolean gradientUnitsAreUser;
        String href;
        GradientSpread spreadMethod;

        GradientElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof Stop) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.children;
        }
    }

    enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {
        Matrix transform;

        GraphicsElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    static class Group extends SvgConditionalContainer implements HasTransform {
        Matrix transform;

        Group() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "group";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface HasTransform {
        void setTransform(Matrix matrix);
    }

    static class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        Length height;
        String href;
        Matrix transform;
        Length width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Length f95994x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Length f95995y;

        Image() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "image";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public static class Length implements Cloneable {
        final Unit unit;
        final float value;
        static final Length ZERO = new Length(0.0f);
        static final Length PERCENT_100 = new Length(100.0f, Unit.percent);

        public Length(float f10, Unit unit) {
            this.value = f10;
            this.unit = unit;
        }

        float floatValue() {
            return this.value;
        }

        float floatValueX(SVGAndroidRenderer sVGAndroidRenderer) {
            switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[this.unit.ordinal()]) {
                case 8:
                    Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
                    if (effectiveViewPortInUserUnits != null) {
                    }
                    break;
            }
            return this.value;
        }

        float floatValueY(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
            return effectiveViewPortInUserUnits == null ? this.value : (this.value * effectiveViewPortInUserUnits.height) / 100.0f;
        }

        boolean isNegative() {
            return this.value < 0.0f;
        }

        boolean isZero() {
            return this.value == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.value) + this.unit;
        }

        float floatValue(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
            if (effectiveViewPortInUserUnits == null) {
                return this.value;
            }
            float f10 = effectiveViewPortInUserUnits.width;
            if (f10 == effectiveViewPortInUserUnits.height) {
                return (this.value * f10) / 100.0f;
            }
            return (this.value * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / SVGBase.SQRT2))) / 100.0f;
        }

        public Length(float f10) {
            this.value = f10;
            this.unit = Unit.px;
        }

        float floatValue(SVGAndroidRenderer sVGAndroidRenderer, float f10) {
            if (this.unit == Unit.percent) {
                return (this.value * f10) / 100.0f;
            }
            return floatValueX(sVGAndroidRenderer);
        }

        float floatValue(float f10) {
            int i10 = AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit[this.unit.ordinal()];
            if (i10 == 3) {
                return this.value * f10;
            }
            if (i10 == 4) {
                return (this.value * f10) / 2.54f;
            }
            if (i10 == 5) {
                return (this.value * f10) / 25.4f;
            }
            if (i10 == 6) {
                return (this.value * f10) / 72.0f;
            }
            if (i10 != 7) {
                return this.value;
            }
            return (this.value * f10) / 6.0f;
        }
    }

    static class Line extends GraphicsElement {

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        Length f95996x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        Length f95997x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        Length f95998y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        Length f95999y2;

        Line() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "line";
        }
    }

    static class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length markerHeight;
        boolean markerUnitsAreUser;
        Length markerWidth;
        Float orient;
        Length refX;
        Length refY;

        Marker() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "marker";
        }
    }

    static class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        Length height;
        Boolean maskContentUnitsAreUser;
        Boolean maskUnitsAreUser;
        Length width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Length f96000x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Length f96001y;

        Mask() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "mask";
        }
    }

    interface NotDirectlyRendered {
    }

    static class PaintReference extends SvgPaint {
        final SvgPaint fallback;
        final String href;

        PaintReference(String str, SvgPaint svgPaint) {
            this.href = str;
            this.fallback = svgPaint;
        }

        public String toString() {
            return this.href + " " + this.fallback;
        }
    }

    static class Path extends GraphicsElement {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PathDefinition f96002d;
        Float pathLength;

        Path() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "path";
        }
    }

    static class PathDefinition implements PathInterface {
        private static final byte ARCTO = 4;
        private static final byte CLOSE = 8;
        private static final byte CUBICTO = 2;
        private static final byte LINETO = 1;
        private static final byte MOVETO = 0;
        private static final byte QUADTO = 3;
        private int commandsLength = 0;
        private int coordsLength = 0;
        private byte[] commands = new byte[8];
        private float[] coords = new float[16];

        PathDefinition() {
        }

        private void addCommand(byte b10) {
            int i10 = this.commandsLength;
            byte[] bArr = this.commands;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.commands = bArr2;
            }
            byte[] bArr3 = this.commands;
            int i11 = this.commandsLength;
            this.commandsLength = i11 + 1;
            bArr3[i11] = b10;
        }

        private void coordsEnsure(int i10) {
            float[] fArr = this.coords;
            if (fArr.length < this.coordsLength + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.coords = fArr2;
            }
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            addCommand((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            coordsEnsure(5);
            float[] fArr = this.coords;
            int i10 = this.coordsLength;
            int i11 = i10 + 1;
            this.coordsLength = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.coordsLength = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.coordsLength = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.coordsLength = i14;
            fArr[i13] = f13;
            this.coordsLength = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            addCommand((byte) 8);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            addCommand((byte) 2);
            coordsEnsure(6);
            float[] fArr = this.coords;
            int i10 = this.coordsLength;
            int i11 = i10 + 1;
            this.coordsLength = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.coordsLength = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.coordsLength = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.coordsLength = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.coordsLength = i15;
            fArr[i14] = f14;
            this.coordsLength = i10 + 6;
            fArr[i15] = f15;
        }

        void enumeratePath(PathInterface pathInterface) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.commandsLength; i11++) {
                byte b10 = this.commands[i11];
                if (b10 == 8) {
                    pathInterface.close();
                } else if (b10 == 0) {
                    float[] fArr = this.coords;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    pathInterface.moveTo(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.coords;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    pathInterface.lineTo(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.coords;
                    pathInterface.cubicTo(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 != 3) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr4 = this.coords;
                    pathInterface.arcTo(fArr4[i10], fArr4[i10 + 1], fArr4[i10 + 2], z10, z11, fArr4[i10 + 3], fArr4[i10 + 4]);
                    i10 += 5;
                } else {
                    float[] fArr5 = this.coords;
                    float f12 = fArr5[i10];
                    float f13 = fArr5[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr5[i10 + 2];
                    i10 += 4;
                    pathInterface.quadTo(f12, f13, f14, fArr5[i14]);
                }
            }
        }

        boolean isEmpty() {
            return this.commandsLength == 0;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f10, float f11) {
            addCommand((byte) 1);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i10 = this.coordsLength;
            int i11 = i10 + 1;
            this.coordsLength = i11;
            fArr[i10] = f10;
            this.coordsLength = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f10, float f11) {
            addCommand((byte) 0);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i10 = this.coordsLength;
            int i11 = i10 + 1;
            this.coordsLength = i11;
            fArr[i10] = f10;
            this.coordsLength = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f10, float f11, float f12, float f13) {
            addCommand((byte) 3);
            coordsEnsure(4);
            float[] fArr = this.coords;
            int i10 = this.coordsLength;
            int i11 = i10 + 1;
            this.coordsLength = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.coordsLength = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.coordsLength = i13;
            fArr[i12] = f12;
            this.coordsLength = i10 + 4;
            fArr[i13] = f13;
        }
    }

    interface PathInterface {
        void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void close();

        void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

        void lineTo(float f10, float f11);

        void moveTo(float f10, float f11);

        void quadTo(float f10, float f11, float f12, float f13);
    }

    static class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length height;
        String href;
        Boolean patternContentUnitsAreUser;
        Matrix patternTransform;
        Boolean patternUnitsAreUser;
        Length width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Length f96003x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Length f96004y;

        Pattern() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "pattern";
        }
    }

    static class PolyLine extends GraphicsElement {
        float[] points;

        PolyLine() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "polyline";
        }
    }

    static class Polygon extends PolyLine {
        Polygon() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PolyLine, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "polygon";
        }
    }

    static class Rect extends GraphicsElement {
        Length height;
        Length rx;
        Length ry;
        Length width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Length f96005x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Length f96006y;

        Rect() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "rect";
        }
    }

    static class SolidColor extends SvgElementBase implements SvgContainer {
        SolidColor() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "solidColor";
        }
    }

    static class Stop extends SvgElementBase implements SvgContainer {
        Float offset;

        Stop() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return AtomManager.ATOM_STOP_METHOD_NAME;
        }
    }

    public static class Svg extends SvgViewBoxContainer {
        Length height;
        public String version;
        Length width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Length f96007x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Length f96008y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "svg";
        }
    }

    interface SvgConditional {
        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set<String> set);

        void setRequiredFonts(Set<String> set);

        void setRequiredFormats(Set<String> set);

        void setSystemLanguage(Set<String> set);
    }

    public static abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {
        List<SvgObject> children = new ArrayList();
        Set<String> requiredFeatures = null;
        String requiredExtensions = null;
        Set<String> systemLanguage = null;
        Set<String> requiredFormats = null;
        Set<String> requiredFonts = null;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
            this.children.add(svgObject);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.children;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getSystemLanguage() {
            return null;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgElementBase
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {
        Set<String> requiredFeatures = null;
        String requiredExtensions = null;
        Set<String> systemLanguage = null;
        Set<String> requiredFormats = null;
        Set<String> requiredFonts = null;

        SvgConditionalElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    public interface SvgContainer {
        void addChild(SvgObject svgObject);

        List<SvgObject> getChildren();
    }

    static abstract class SvgElement extends SvgElementBase {
        Box boundingBox = null;

        SvgElement() {
        }
    }

    static abstract class SvgElementBase extends SvgObject {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        String f96009id = null;
        Boolean spacePreserve = null;
        Style baseStyle = null;
        Style style = null;
        List<String> classNames = null;

        SvgElementBase() {
        }

        public String toString() {
            return getNodeName();
        }
    }

    static class SvgLinearGradient extends GradientElement {

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        Length f96010x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        Length f96011x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        Length f96012y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        Length f96013y2;

        SvgLinearGradient() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "linearGradient";
        }
    }

    public static class SvgObject {
        SVGBase document;
        SvgContainer parent;

        String getNodeName() {
            return "";
        }
    }

    public static abstract class SvgPaint implements Cloneable {
    }

    static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        PreserveAspectRatio preserveAspectRatio = null;

        SvgPreserveAspectRatioContainer() {
        }
    }

    static class SvgRadialGradient extends GradientElement {
        Length cx;
        Length cy;
        Length fr;
        Length fx;
        Length fy;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Length f96014r;

        SvgRadialGradient() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "radialGradient";
        }
    }

    static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        Box viewBox;

        SvgViewBoxContainer() {
        }
    }

    static class Switch extends Group {
        Switch() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "switch";
        }
    }

    static class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        Symbol() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "symbol";
        }
    }

    static class TRef extends TextContainer implements TextChild {
        String href;
        private TextRoot textRoot;

        TRef() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "tref";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static class TSpan extends TextPositionedContainer implements TextChild {
        private TextRoot textRoot;

        TSpan() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "tspan";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static class Text extends TextPositionedContainer implements TextRoot, HasTransform {
        Matrix transform;

        Text() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "text";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface TextChild {
        TextRoot getTextRoot();

        void setTextRoot(TextRoot textRoot);
    }

    public static abstract class TextContainer extends SvgConditionalContainer {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditionalContainer, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof TextChild) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    static class TextPath extends TextContainer implements TextChild {
        String href;
        Length startOffset;
        private TextRoot textRoot;

        TextPath() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "textPath";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static abstract class TextPositionedContainer extends TextContainer {
        List<Length> dx;
        List<Length> dy;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        List<Length> f96015x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        List<Length> f96016y;

        TextPositionedContainer() {
        }
    }

    interface TextRoot {
    }

    public static class TextSequence extends SvgObject implements TextChild {
        String text;
        private TextRoot textRoot;

        public TextSequence(String str) {
            this.text = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }

        public String toString() {
            return "TextChild: '" + this.text + "'";
        }
    }

    enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static class Use extends Group {
        Length height;
        String href;
        Length width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Length f96018x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Length f96019y;

        Use() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "use";
        }
    }

    static class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        static final String NODE_NAME = "view";

        View() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "view";
        }
    }

    SVGBase(boolean z10, SVGExternalFileResolver sVGExternalFileResolver) {
        this.enableInternalEntities = z10;
        this.externalFileResolver = sVGExternalFileResolver;
    }

    protected static SVGParser createParser() {
        return new SVGParserImpl().setInternalEntitiesEnabled(enableInternalEntitiesSingleton).setExternalFileResolver(externalFileResolverSingleton);
    }

    private String cssQuotedString(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
    }

    private Box getDocumentDimensions(float f10) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float fFloatValue;
        Unit unit5;
        Svg svg = this.rootElement;
        Length length = svg.width;
        Length length2 = svg.height;
        if (length == null || length.isZero() || (unit = length.unit) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fFloatValue2 = length.floatValue(f10);
        if (length2 == null) {
            Box box = this.rootElement.viewBox;
            fFloatValue = box != null ? (box.height * fFloatValue2) / box.width : fFloatValue2;
        } else {
            if (length2.isZero() || (unit5 = length2.unit) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fFloatValue = length2.floatValue(f10);
        }
        return new Box(0.0f, 0.0f, fFloatValue2, fFloatValue);
    }

    public static SVGBase getFromInputStream(InputStream inputStream) {
        return createParser().parseStream(inputStream);
    }

    public static SVGBase getFromString(String str) {
        return createParser().parseStream(new ByteArrayInputStream(str.getBytes()));
    }

    void addCSSRules(CSSParser.Ruleset ruleset) {
        this.cssRules.addAll(ruleset);
    }

    void clearRenderCSSRules() {
        this.cssRules.removeFromSource(CSSParser.Source.RenderOptions);
    }

    List<CSSParser.Rule> getCSSRules() {
        return this.cssRules.getRules();
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        PreserveAspectRatio preserveAspectRatio = svg.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            return null;
        }
        return preserveAspectRatio;
    }

    SvgElementBase getElementById(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.rootElement.f96009id)) {
            return this.rootElement;
        }
        if (this.idToElementMap.containsKey(str)) {
            return this.idToElementMap.get(str);
        }
        SvgElementBase elementById = getElementById(this.rootElement, str);
        this.idToElementMap.put(str, elementById);
        return elementById;
    }

    List<SvgObject> getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        getElementsByTagName(arrayList, this.rootElement, str);
        return arrayList;
    }

    public Svg getRootElement() {
        return this.rootElement;
    }

    boolean hasCSSRules() {
        return !this.cssRules.isEmpty();
    }

    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI, this.externalFileResolver).renderDocument(this, renderOptions);
    }

    public Picture renderToPicture(RenderOptionsBase renderOptionsBase) {
        Length length;
        Box box = (renderOptionsBase == null || !renderOptionsBase.hasViewBox()) ? this.rootElement.viewBox : renderOptionsBase.viewBox;
        if (renderOptionsBase != null && renderOptionsBase.hasViewPort()) {
            return renderToPicture((int) Math.ceil(renderOptionsBase.viewPort.maxX()), (int) Math.ceil(renderOptionsBase.viewPort.maxY()), renderOptionsBase);
        }
        Svg svg = this.rootElement;
        Length length2 = svg.width;
        if (length2 != null) {
            Unit unit = length2.unit;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (length = svg.height) != null && length.unit != unit2) {
                return renderToPicture((int) Math.ceil(length2.floatValue(this.renderDPI)), (int) Math.ceil(this.rootElement.height.floatValue(this.renderDPI)), renderOptionsBase);
            }
        }
        if (length2 != null && box != null) {
            return renderToPicture((int) Math.ceil(length2.floatValue(this.renderDPI)), (int) Math.ceil((box.height * r1) / box.width), renderOptionsBase);
        }
        Length length3 = svg.height;
        if (length3 == null || box == null) {
            return renderToPicture(512, 512, renderOptionsBase);
        }
        return renderToPicture((int) Math.ceil((box.width * r1) / box.height), (int) Math.ceil(length3.floatValue(this.renderDPI)), renderOptionsBase);
    }

    SvgObject resolveIRI(String str) {
        if (str == null) {
            return null;
        }
        String strCssQuotedString = cssQuotedString(str);
        if (strCssQuotedString.length() <= 1 || !strCssQuotedString.startsWith("#")) {
            return null;
        }
        return getElementById(strCssQuotedString.substring(1));
    }

    void setDesc(String str) {
        this.desc = str;
    }

    void setRootElement(Svg svg) {
        this.rootElement = svg;
    }

    void setTitle(String str) {
        this.title = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getElementsByTagName(List<SvgObject> list, SvgObject svgObject, String str) {
        if (svgObject.getNodeName().equals(str)) {
            list.add(svgObject);
        }
        if (svgObject instanceof SvgContainer) {
            Iterator<SvgObject> it = ((SvgContainer) svgObject).getChildren().iterator();
            while (it.hasNext()) {
                getElementsByTagName(list, it.next(), str);
            }
        }
    }

    static class Box {
        float height;
        float minX;
        float minY;
        float width;

        Box(float f10, float f11, float f12, float f13) {
            this.minX = f10;
            this.minY = f11;
            this.width = f12;
            this.height = f13;
        }

        static Box fromLimits(float f10, float f11, float f12, float f13) {
            return new Box(f10, f11, f12 - f10, f13 - f11);
        }

        float maxX() {
            return this.minX + this.width;
        }

        float maxY() {
            return this.minY + this.height;
        }

        RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        public String toString() {
            return C4240b4.j.f42672d + this.minX + " " + this.minY + " " + this.width + " " + this.height + C4240b4.j.f42674e;
        }

        void union(Box box) {
            float f10 = box.minX;
            if (f10 < this.minX) {
                this.minX = f10;
            }
            float f11 = box.minY;
            if (f11 < this.minY) {
                this.minY = f11;
            }
            if (box.maxX() > maxX()) {
                this.width = box.maxX() - this.minX;
            }
            if (box.maxY() > maxY()) {
                this.height = box.maxY() - this.minY;
            }
        }

        Box(Box box) {
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SvgElementBase getElementById(SvgContainer svgContainer, String str) {
        SvgElementBase elementById;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.f96009id)) {
            return svgElementBase;
        }
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) obj;
                if (str.equals(svgElementBase2.f96009id)) {
                    return svgElementBase2;
                }
                if ((obj instanceof SvgContainer) && (elementById = getElementById((SvgContainer) obj, str)) != null) {
                    return elementById;
                }
            }
        }
        return null;
    }

    public Picture renderToPicture(int i10, int i11, RenderOptionsBase renderOptionsBase) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (renderOptionsBase == null || renderOptionsBase.viewPort == null) {
            renderOptionsBase = renderOptionsBase == null ? new RenderOptionsBase() : new RenderOptionsBase(renderOptionsBase);
            renderOptionsBase.viewPort(0.0f, 0.0f, i10, i11);
        }
        new SVGAndroidRenderer(canvasBeginRecording, this.renderDPI, this.externalFileResolver).renderDocument(this, renderOptionsBase);
        picture.endRecording();
        return picture;
    }
}
