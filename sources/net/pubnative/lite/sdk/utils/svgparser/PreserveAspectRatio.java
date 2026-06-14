package net.pubnative.lite.sdk.utils.svgparser;

import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.TextScanner;

/* JADX INFO: loaded from: classes3.dex */
public class PreserveAspectRatio {
    public static final PreserveAspectRatio BOTTOM;
    public static final PreserveAspectRatio END;
    public static final PreserveAspectRatio FULLSCREEN;
    public static final PreserveAspectRatio FULLSCREEN_START;
    public static final PreserveAspectRatio LETTERBOX;
    public static final PreserveAspectRatio START;
    public static final PreserveAspectRatio STRETCH;
    public static final PreserveAspectRatio TOP;
    public static final PreserveAspectRatio UNSCALED;
    private static final Map<String, Alignment> aspectRatioKeywords;
    private final Alignment alignment;
    private final Scale scale;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    static {
        HashMap map = new HashMap(10);
        aspectRatioKeywords = map;
        UNSCALED = new PreserveAspectRatio(null, null);
        Alignment alignment = Alignment.none;
        STRETCH = new PreserveAspectRatio(alignment, null);
        Alignment alignment2 = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        LETTERBOX = new PreserveAspectRatio(alignment2, scale);
        Alignment alignment3 = Alignment.xMinYMin;
        START = new PreserveAspectRatio(alignment3, scale);
        Alignment alignment4 = Alignment.xMaxYMax;
        END = new PreserveAspectRatio(alignment4, scale);
        Alignment alignment5 = Alignment.xMidYMin;
        TOP = new PreserveAspectRatio(alignment5, scale);
        Alignment alignment6 = Alignment.xMidYMax;
        BOTTOM = new PreserveAspectRatio(alignment6, scale);
        Scale scale2 = Scale.slice;
        FULLSCREEN = new PreserveAspectRatio(alignment2, scale2);
        FULLSCREEN_START = new PreserveAspectRatio(alignment3, scale2);
        map.put("none", alignment);
        map.put("xMinYMin", alignment3);
        map.put("xMidYMin", alignment5);
        map.put("xMaxYMin", Alignment.xMaxYMin);
        map.put("xMinYMid", Alignment.xMinYMid);
        map.put("xMidYMid", alignment2);
        map.put("xMaxYMid", Alignment.xMaxYMid);
        map.put("xMinYMax", Alignment.xMinYMax);
        map.put("xMidYMax", alignment6);
        map.put("xMaxYMax", alignment4);
    }

    PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.alignment = alignment;
        this.scale = scale;
    }

    public static PreserveAspectRatio of(String str) {
        try {
            return parsePreserveAspectRatio(str);
        } catch (SVGParseException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    private static PreserveAspectRatio parsePreserveAspectRatio(String str) throws SVGParseException {
        Scale scale;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        String strNextToken = textScanner.nextToken();
        if ("defer".equals(strNextToken)) {
            textScanner.skipWhitespace();
            strNextToken = textScanner.nextToken();
        }
        Alignment alignment = aspectRatioKeywords.get(strNextToken);
        if (alignment == null) {
            throw new SVGParseException("Invalid preserveAspectRatio alignment value: " + str);
        }
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            scale = null;
        } else {
            String strNextToken2 = textScanner.nextToken();
            strNextToken2.getClass();
            if (strNextToken2.equals("meet")) {
                scale = Scale.meet;
            } else {
                if (!strNextToken2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignment, scale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.alignment == preserveAspectRatio.alignment && this.scale == preserveAspectRatio.scale;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public Scale getScale() {
        return this.scale;
    }

    public String toString() {
        return this.alignment + " " + this.scale;
    }
}
