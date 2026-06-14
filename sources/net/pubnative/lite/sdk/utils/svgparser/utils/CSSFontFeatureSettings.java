package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.Style;

/* JADX INFO: loaded from: classes3.dex */
public class CSSFontFeatureSettings {
    static CSSFontFeatureSettings CAPS_ALL_OFF = null;
    static CSSFontFeatureSettings EAST_ASIAN_ALL_OFF = null;
    public static final String FEATURE_AFRC = "afrc";
    private static final String FEATURE_C2PC = "c2pc";
    private static final String FEATURE_C2SC = "c2sc";
    public static final String FEATURE_CALT = "calt";
    public static final String FEATURE_CLIG = "clig";
    public static final String FEATURE_DLIG = "dlig";
    public static final String FEATURE_FRAC = "frac";
    public static final String FEATURE_FWID = "fwid";
    public static final String FEATURE_HLIG = "hlig";
    public static final String FEATURE_JP04 = "jp04";
    public static final String FEATURE_JP78 = "jp78";
    public static final String FEATURE_JP83 = "jp83";
    public static final String FEATURE_JP90 = "jp90";
    public static final String FEATURE_KERN = "kern";
    public static final String FEATURE_LIGA = "liga";
    public static final String FEATURE_LNUM = "lnum";
    private static final String FEATURE_OFF = "off";
    private static final String FEATURE_ON = "on";
    public static final String FEATURE_ONUM = "onum";
    public static final String FEATURE_ORDN = "ordn";
    private static final String FEATURE_PCAP = "pcap";
    public static final String FEATURE_PNUM = "pnum";
    public static final String FEATURE_PWID = "pwid";
    public static final String FEATURE_RUBY = "ruby";
    private static final String FEATURE_SMCP = "smcp";
    public static final String FEATURE_SMPL = "smpl";
    private static final String FEATURE_SUBS = "subs";
    private static final String FEATURE_SUPS = "sups";
    private static final String FEATURE_TITL = "titl";
    public static final String FEATURE_TNUM = "tnum";
    public static final String FEATURE_TRAD = "trad";
    private static final String FEATURE_UNIC = "unic";
    public static final String FEATURE_ZERO = "zero";
    private static final String FONT_VARIANT_ALL_PETITE_CAPS = "all-petite-caps";
    private static final String FONT_VARIANT_ALL_SMALL_CAPS = "all-small-caps";
    private static final String FONT_VARIANT_AUTO = "auto";
    private static final String FONT_VARIANT_COMMON_LIGATURES = "common-ligatures";
    private static final String FONT_VARIANT_CONTEXTUAL_LIGATURES = "contextual";
    private static final String FONT_VARIANT_DIAGONAL_FRACTIONS = "diagonal-fractions";
    private static final String FONT_VARIANT_DISCRETIONARY_LIGATURES = "discretionary-ligatures";
    private static final String FONT_VARIANT_FULL_WIDTH = "full-width";
    private static final String FONT_VARIANT_HISTORICAL_LIGATURES = "historical-ligatures";
    private static final String FONT_VARIANT_JIS04 = "jis04";
    private static final String FONT_VARIANT_JIS78 = "jis78";
    private static final String FONT_VARIANT_JIS83 = "jis83";
    private static final String FONT_VARIANT_JIS90 = "jis90";
    private static final String FONT_VARIANT_LINING_NUMS = "lining-nums";
    private static final String FONT_VARIANT_NONE = "none";
    static final String FONT_VARIANT_NORMAL = "normal";
    private static final String FONT_VARIANT_NO_COMMON_LIGATURES = "no-common-ligatures";
    private static final String FONT_VARIANT_NO_CONTEXTUAL_LIGATURES = "no-contextual";
    private static final String FONT_VARIANT_NO_DISCRETIONARY_LIGATURES = "no-discretionary-ligatures";
    private static final String FONT_VARIANT_NO_HISTORICAL_LIGATURES = "no-historical-ligatures";
    private static final String FONT_VARIANT_OLDSTYLE_NUMS = "oldstyle-nums";
    private static final String FONT_VARIANT_ORDINAL = "ordinal";
    private static final String FONT_VARIANT_PETITE_CAPS = "petite-caps";
    private static final String FONT_VARIANT_PROPORTIONAL_NUMS = "proportional-nums";
    private static final String FONT_VARIANT_PROPORTIONAL_WIDTH = "proportional-width";
    private static final String FONT_VARIANT_RUBY = "ruby";
    private static final String FONT_VARIANT_SIMPLIFIED = "simplified";
    private static final String FONT_VARIANT_SLASHED_ZERO = "slashed-zero";
    static final String FONT_VARIANT_SMALL_CAPS = "small-caps";
    private static final String FONT_VARIANT_STACKED_FRACTIONS = "stacked-fractions";
    private static final String FONT_VARIANT_SUB = "sub";
    private static final String FONT_VARIANT_SUPER = "super";
    private static final String FONT_VARIANT_TABULAR_NUMS = "tabular-nums";
    private static final String FONT_VARIANT_TITLING_CAPS = "titling-caps";
    private static final String FONT_VARIANT_TRADITIONAL = "traditional";
    private static final String FONT_VARIANT_UNICASE = "unicase";
    static CSSFontFeatureSettings LIGATURES_NORMAL = null;
    static CSSFontFeatureSettings NUMERIC_ALL_OFF = null;
    static CSSFontFeatureSettings POSITION_ALL_OFF = null;
    private static final String TOKEN_ERROR = "ERR";
    private static final int VALUE_OFF = 0;
    private static final int VALUE_ON = 1;
    private final HashMap<String, Integer> settings;
    public static final CSSFontFeatureSettings FONT_FEATURE_SETTINGS_NORMAL = makeDefaultSettings();
    public static final CSSFontFeatureSettings ERROR = new CSSFontFeatureSettings((HashMap<String, Integer>) null);
    private static CSSFontFeatureSettings LIGATURES_ALL_OFF = null;
    private static CSSFontFeatureSettings CAPS_SMALL_CAPS = null;

    private static class FontFeatureEntry {
        String name;
        int val;

        public FontFeatureEntry(String str, int i10) {
            this.name = str;
            this.val = i10;
        }
    }

    static {
        LIGATURES_NORMAL = null;
        POSITION_ALL_OFF = null;
        CAPS_ALL_OFF = null;
        NUMERIC_ALL_OFF = null;
        EAST_ASIAN_ALL_OFF = null;
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        LIGATURES_NORMAL = cSSFontFeatureSettings;
        cSSFontFeatureSettings.settings.put(FEATURE_LIGA, 1);
        LIGATURES_NORMAL.settings.put(FEATURE_CLIG, 1);
        LIGATURES_NORMAL.settings.put(FEATURE_DLIG, 0);
        LIGATURES_NORMAL.settings.put(FEATURE_HLIG, 0);
        LIGATURES_NORMAL.settings.put(FEATURE_CALT, 1);
        CSSFontFeatureSettings cSSFontFeatureSettings2 = new CSSFontFeatureSettings();
        POSITION_ALL_OFF = cSSFontFeatureSettings2;
        cSSFontFeatureSettings2.settings.put("subs", 0);
        POSITION_ALL_OFF.settings.put(FEATURE_SUPS, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings3 = new CSSFontFeatureSettings();
        CAPS_ALL_OFF = cSSFontFeatureSettings3;
        cSSFontFeatureSettings3.settings.put(FEATURE_SMCP, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_C2SC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_PCAP, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_C2PC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_UNIC, 0);
        CAPS_ALL_OFF.settings.put(FEATURE_TITL, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings4 = new CSSFontFeatureSettings();
        NUMERIC_ALL_OFF = cSSFontFeatureSettings4;
        cSSFontFeatureSettings4.settings.put(FEATURE_LNUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_ONUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_PNUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_TNUM, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_FRAC, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_AFRC, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_ORDN, 0);
        NUMERIC_ALL_OFF.settings.put(FEATURE_ZERO, 0);
        CSSFontFeatureSettings cSSFontFeatureSettings5 = new CSSFontFeatureSettings();
        EAST_ASIAN_ALL_OFF = cSSFontFeatureSettings5;
        cSSFontFeatureSettings5.settings.put(FEATURE_JP78, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_JP83, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_JP90, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_JP04, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_SMPL, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_TRAD, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_FWID, 0);
        EAST_ASIAN_ALL_OFF.settings.put(FEATURE_PWID, 0);
        EAST_ASIAN_ALL_OFF.settings.put("ruby", 0);
    }

    public CSSFontFeatureSettings() {
        this.settings = new HashMap<>();
    }

    private void addSettings(String str, String str2, int i10) {
        this.settings.put(str, Integer.valueOf(i10));
        this.settings.put(str2, Integer.valueOf(i10));
    }

    private static int containsOnce(List<String> list, String str) {
        if (list.remove(str)) {
            return list.contains(str) ? 2 : 1;
        }
        return 0;
    }

    private static String containsOneOf(List<String> list, String... strArr) {
        String str = null;
        for (String str2 : strArr) {
            if (str == null && list.remove(str2)) {
                str = str2;
            }
            if (list.contains(str2)) {
                return TOKEN_ERROR;
            }
        }
        return str;
    }

    private static int containsWhich(List<String> list, String str, String str2) {
        if (list.remove(str)) {
            return (list.contains(str) || list.contains(str2)) ? 3 : 1;
        }
        if (list.remove(str2)) {
            return list.contains(str2) ? 3 : 2;
        }
        return 0;
    }

    private static void ensureLigaturesNone() {
        if (LIGATURES_ALL_OFF != null) {
            return;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.settings.put(FEATURE_LIGA, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_CLIG, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_DLIG, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_HLIG, 0);
        cSSFontFeatureSettings.settings.put(FEATURE_CALT, 0);
        LIGATURES_ALL_OFF = cSSFontFeatureSettings;
    }

    private void ensurePositionNormal() {
        if (POSITION_ALL_OFF == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            cSSFontFeatureSettings.settings.put("subs", 0);
            cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 0);
            POSITION_ALL_OFF = cSSFontFeatureSettings;
        }
    }

    private static List<String> extractTokensAsList(String str) {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (!textScanner.empty()) {
            arrayList.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return arrayList;
    }

    private static final CSSFontFeatureSettings makeDefaultSettings() {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        cSSFontFeatureSettings.settings.put("rlig", 1);
        cSSFontFeatureSettings.settings.put(FEATURE_LIGA, 1);
        cSSFontFeatureSettings.settings.put(FEATURE_CLIG, 1);
        cSSFontFeatureSettings.settings.put(FEATURE_CALT, 1);
        cSSFontFeatureSettings.settings.put("locl", 1);
        cSSFontFeatureSettings.settings.put("ccmp", 1);
        cSSFontFeatureSettings.settings.put("mark", 1);
        cSSFontFeatureSettings.settings.put("mkmk", 1);
        return cSSFontFeatureSettings;
    }

    static CSSFontFeatureSettings makeSmallCaps() {
        if (CAPS_SMALL_CAPS == null) {
            CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
            CAPS_SMALL_CAPS = cSSFontFeatureSettings;
            cSSFontFeatureSettings.settings.put(FEATURE_SMCP, 1);
            CAPS_SMALL_CAPS.settings.put(FEATURE_C2SC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_PCAP, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_C2PC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_UNIC, 0);
            CAPS_SMALL_CAPS.settings.put(FEATURE_TITL, 0);
        }
        return CAPS_SMALL_CAPS;
    }

    private static FontFeatureEntry nextFeatureEntry(TextScanner textScanner) {
        int iIntValue;
        textScanner.skipWhitespace();
        String strNextQuotedString = textScanner.nextQuotedString();
        if (strNextQuotedString == null || strNextQuotedString.length() != 4) {
            return null;
        }
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            iIntValue = 1;
        } else {
            iIntValue = 0;
            Integer numNextInteger = textScanner.nextInteger(false);
            if (numNextInteger == null) {
                if (!textScanner.consume(FEATURE_OFF)) {
                    textScanner.consume(FEATURE_ON);
                    iIntValue = 1;
                }
            } else {
                if (numNextInteger.intValue() > 99) {
                    return null;
                }
                iIntValue = numNextInteger.intValue();
            }
        }
        return new FontFeatureEntry(strNextQuotedString, iIntValue);
    }

    static CSSFontFeatureSettings parseEastAsian(String str) {
        CSSFontFeatureSettings variantEastAsianSpecial;
        if (str.equals("normal")) {
            return EAST_ASIAN_ALL_OFF;
        }
        List<String> listExtractTokensAsList = extractTokensAsList(str);
        if (listExtractTokensAsList == null || (variantEastAsianSpecial = parseVariantEastAsianSpecial(listExtractTokensAsList)) == null || variantEastAsianSpecial == ERROR || listExtractTokensAsList.size() > 0) {
            return null;
        }
        return variantEastAsianSpecial;
    }

    static CSSFontFeatureSettings parseFontFeatureSettings(String str) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            FontFeatureEntry fontFeatureEntryNextFeatureEntry = nextFeatureEntry(textScanner);
            if (fontFeatureEntryNextFeatureEntry == null) {
                return null;
            }
            cSSFontFeatureSettings.settings.put(fontFeatureEntryNextFeatureEntry.name, Integer.valueOf(fontFeatureEntryNextFeatureEntry.val));
            textScanner.skipCommaWhitespace();
        }
        return cSSFontFeatureSettings;
    }

    static Style.FontKerning parseFontKerning(String str) {
        str.getClass();
        switch (str) {
            case "normal":
                return Style.FontKerning.normal;
            case "auto":
                return Style.FontKerning.auto;
            case "none":
                return Style.FontKerning.none;
            default:
                return null;
        }
    }

    static void parseFontVariant(Style style, String str) {
        CSSFontFeatureSettings variantLigaturesSpecial;
        CSSFontFeatureSettings cSSFontFeatureSettings;
        CSSFontFeatureSettings variantPositionSpecial;
        CSSFontFeatureSettings variantCapsSpecial;
        CSSFontFeatureSettings variantNumericSpecial;
        if (str.equals("normal")) {
            style.fontVariantLigatures = LIGATURES_NORMAL;
            style.fontVariantPosition = POSITION_ALL_OFF;
            style.fontVariantCaps = CAPS_ALL_OFF;
            style.fontVariantNumeric = NUMERIC_ALL_OFF;
            style.fontVariantEastAsian = EAST_ASIAN_ALL_OFF;
            style.specifiedFlags = 34084860461056L | style.specifiedFlags;
            return;
        }
        if (str.equals("none")) {
            ensureLigaturesNone();
            style.fontVariantLigatures = LIGATURES_ALL_OFF;
            style.fontVariantPosition = POSITION_ALL_OFF;
            style.fontVariantCaps = CAPS_ALL_OFF;
            style.fontVariantNumeric = NUMERIC_ALL_OFF;
            style.fontVariantEastAsian = EAST_ASIAN_ALL_OFF;
            style.specifiedFlags = 34084860461056L | style.specifiedFlags;
            return;
        }
        List<String> listExtractTokensAsList = extractTokensAsList(str);
        if (listExtractTokensAsList == null || (variantLigaturesSpecial = parseVariantLigaturesSpecial(listExtractTokensAsList)) == (cSSFontFeatureSettings = ERROR)) {
            return;
        }
        CSSFontFeatureSettings variantEastAsianSpecial = null;
        if (listExtractTokensAsList.size() > 0) {
            variantPositionSpecial = parseVariantPositionSpecial(listExtractTokensAsList);
            if (variantPositionSpecial == cSSFontFeatureSettings) {
                return;
            }
        } else {
            variantPositionSpecial = null;
        }
        if (listExtractTokensAsList.size() > 0) {
            variantCapsSpecial = parseVariantCapsSpecial(listExtractTokensAsList);
            if (variantCapsSpecial == cSSFontFeatureSettings) {
                return;
            }
        } else {
            variantCapsSpecial = null;
        }
        if (listExtractTokensAsList.size() > 0) {
            variantNumericSpecial = parseVariantNumericSpecial(listExtractTokensAsList);
            if (variantNumericSpecial == cSSFontFeatureSettings) {
                return;
            }
        } else {
            variantNumericSpecial = null;
        }
        if (listExtractTokensAsList.size() <= 0 || (variantEastAsianSpecial = parseVariantEastAsianSpecial(listExtractTokensAsList)) != cSSFontFeatureSettings) {
            if (variantLigaturesSpecial != null) {
                style.fontVariantLigatures = variantLigaturesSpecial;
                style.specifiedFlags |= 1099511627776L;
            }
            if (variantPositionSpecial != null) {
                style.fontVariantPosition = variantPositionSpecial;
                style.specifiedFlags |= 2199023255552L;
            }
            if (variantCapsSpecial != null) {
                style.fontVariantCaps = variantCapsSpecial;
                style.specifiedFlags |= 4398046511104L;
            }
            if (variantNumericSpecial != null) {
                style.fontVariantNumeric = variantNumericSpecial;
                style.specifiedFlags |= 8796093022208L;
            }
            if (variantEastAsianSpecial != null) {
                style.fontVariantEastAsian = variantEastAsianSpecial;
                style.specifiedFlags |= 17592186044416L;
            }
        }
    }

    static CSSFontFeatureSettings parseVariantCaps(String str) {
        if (str.equals("normal")) {
            return CAPS_ALL_OFF;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(CAPS_ALL_OFF);
        if (setCapsFeature(cSSFontFeatureSettings, str)) {
            return cSSFontFeatureSettings;
        }
        return null;
    }

    private static CSSFontFeatureSettings parseVariantCapsSpecial(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(CAPS_ALL_OFF);
        String strContainsOneOf = containsOneOf(list, FONT_VARIANT_SMALL_CAPS, FONT_VARIANT_ALL_SMALL_CAPS, FONT_VARIANT_PETITE_CAPS, FONT_VARIANT_ALL_PETITE_CAPS, FONT_VARIANT_UNICASE, FONT_VARIANT_TITLING_CAPS);
        if (strContainsOneOf == TOKEN_ERROR) {
            return ERROR;
        }
        if (strContainsOneOf == null) {
            return null;
        }
        setCapsFeature(cSSFontFeatureSettings, strContainsOneOf);
        return cSSFontFeatureSettings;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb A[ADDED_TO_REGION, REMOVE, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings parseVariantEastAsianSpecial(java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.parseVariantEastAsianSpecial(java.util.List):net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings");
    }

    static CSSFontFeatureSettings parseVariantLigatures(String str) {
        if (str.equals("normal")) {
            return LIGATURES_NORMAL;
        }
        if (str.equals("none")) {
            ensureLigaturesNone();
            return LIGATURES_ALL_OFF;
        }
        List<String> listExtractTokensAsList = extractTokensAsList(str);
        if (listExtractTokensAsList == null) {
            return null;
        }
        ensureLigaturesNone();
        CSSFontFeatureSettings variantLigaturesSpecial = parseVariantLigaturesSpecial(listExtractTokensAsList);
        if (variantLigaturesSpecial == null || variantLigaturesSpecial == ERROR || listExtractTokensAsList.size() > 0) {
            return null;
        }
        return variantLigaturesSpecial;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings parseVariantLigaturesSpecial(java.util.List<java.lang.String> r10) {
        /*
            ensureLigaturesNone()
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r0 = new net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r1 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.LIGATURES_ALL_OFF
            r0.<init>(r1)
            java.lang.String r1 = "common-ligatures"
            java.lang.String r2 = "no-common-ligatures"
            int r1 = containsWhich(r10, r1, r2)
            java.lang.String r2 = "liga"
            java.lang.String r3 = "clig"
            r4 = 3
            r5 = 2
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            if (r1 == r8) goto L31
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L29
            goto L35
        L29:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r10 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r10
        L2c:
            r0.addSettings(r3, r2, r6)
        L2f:
            r6 = r8
            goto L35
        L31:
            r0.addSettings(r3, r2, r8)
            goto L2f
        L35:
            java.lang.String r1 = "discretionary-ligatures"
            java.lang.String r2 = "no-discretionary-ligatures"
            int r1 = containsWhich(r10, r1, r2)
            java.lang.String r2 = "dlig"
            if (r1 == r8) goto L50
            if (r1 == r5) goto L49
            if (r1 == r4) goto L46
            goto L56
        L46:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r10 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r10
        L49:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            r1.put(r2, r7)
        L4e:
            r6 = r8
            goto L56
        L50:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            r1.put(r2, r9)
            goto L4e
        L56:
            java.lang.String r1 = "historical-ligatures"
            java.lang.String r2 = "no-historical-ligatures"
            int r1 = containsWhich(r10, r1, r2)
            java.lang.String r2 = "hlig"
            if (r1 == r8) goto L71
            if (r1 == r5) goto L6a
            if (r1 == r4) goto L67
            goto L77
        L67:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r10 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r10
        L6a:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            r1.put(r2, r7)
        L6f:
            r6 = r8
            goto L77
        L71:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            r1.put(r2, r9)
            goto L6f
        L77:
            java.lang.String r1 = "contextual"
            java.lang.String r2 = "no-contextual"
            int r10 = containsWhich(r10, r1, r2)
            java.lang.String r1 = "calt"
            if (r10 == r8) goto L92
            if (r10 == r5) goto L8c
            if (r10 == r4) goto L89
            r8 = r6
            goto L97
        L89:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r10 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r10
        L8c:
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r0.settings
            r10.put(r1, r7)
            goto L97
        L92:
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r0.settings
            r10.put(r1, r9)
        L97:
            if (r8 == 0) goto L9a
            return r0
        L9a:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.parseVariantLigaturesSpecial(java.util.List):net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings");
    }

    static CSSFontFeatureSettings parseVariantNumeric(String str) {
        CSSFontFeatureSettings variantNumericSpecial;
        if (str.equals("normal")) {
            return NUMERIC_ALL_OFF;
        }
        List<String> listExtractTokensAsList = extractTokensAsList(str);
        if (listExtractTokensAsList == null || (variantNumericSpecial = parseVariantNumericSpecial(listExtractTokensAsList)) == null || variantNumericSpecial == ERROR || listExtractTokensAsList.size() > 0) {
            return null;
        }
        return variantNumericSpecial;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings parseVariantNumericSpecial(java.util.List<java.lang.String> r8) {
        /*
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r0 = new net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r1 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.NUMERIC_ALL_OFF
            r0.<init>(r1)
            java.lang.String r1 = "lining-nums"
            java.lang.String r2 = "oldstyle-nums"
            int r1 = containsWhich(r8, r1, r2)
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L21
            if (r1 == r2) goto L1e
            r1 = 0
            goto L32
        L1e:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L21:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r6 = "onum"
            r1.put(r6, r5)
        L28:
            r1 = r4
            goto L32
        L2a:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r6 = "lnum"
            r1.put(r6, r5)
            goto L28
        L32:
            java.lang.String r6 = "proportional-nums"
            java.lang.String r7 = "tabular-nums"
            int r6 = containsWhich(r8, r6, r7)
            if (r6 == r4) goto L4d
            if (r6 == r3) goto L44
            if (r6 == r2) goto L41
            goto L55
        L41:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L44:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r6 = "tnum"
            r1.put(r6, r5)
        L4b:
            r1 = r4
            goto L55
        L4d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r6 = "pnum"
            r1.put(r6, r5)
            goto L4b
        L55:
            java.lang.String r6 = "diagonal-fractions"
            java.lang.String r7 = "stacked-fractions"
            int r6 = containsWhich(r8, r6, r7)
            if (r6 == r4) goto L70
            if (r6 == r3) goto L67
            if (r6 == r2) goto L64
            goto L78
        L64:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L67:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r2 = "afrc"
            r1.put(r2, r5)
        L6e:
            r1 = r4
            goto L78
        L70:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r2 = "frac"
            r1.put(r2, r5)
            goto L6e
        L78:
            java.lang.String r2 = "ordinal"
            int r2 = containsOnce(r8, r2)
            if (r2 == r4) goto L86
            if (r2 == r3) goto L83
            goto L8e
        L83:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L86:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.settings
            java.lang.String r2 = "ordn"
            r1.put(r2, r5)
            r1 = r4
        L8e:
            java.lang.String r2 = "slashed-zero"
            int r8 = containsOnce(r8, r2)
            if (r8 == r4) goto L9d
            if (r8 == r3) goto L9a
            r4 = r1
            goto La4
        L9a:
            net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings r8 = net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.ERROR
            return r8
        L9d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r0.settings
            java.lang.String r1 = "zero"
            r8.put(r1, r5)
        La4:
            if (r4 == 0) goto La7
            return r0
        La7:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings.parseVariantNumericSpecial(java.util.List):net.pubnative.lite.sdk.utils.svgparser.utils.CSSFontFeatureSettings");
    }

    static CSSFontFeatureSettings parseVariantPosition(String str) {
        if (str.equals("normal")) {
            return POSITION_ALL_OFF;
        }
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(POSITION_ALL_OFF);
        if (str.equals(FONT_VARIANT_SUB)) {
            cSSFontFeatureSettings.settings.put("subs", 1);
            return cSSFontFeatureSettings;
        }
        if (!str.equals(FONT_VARIANT_SUPER)) {
            return null;
        }
        cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 1);
        return cSSFontFeatureSettings;
    }

    private static CSSFontFeatureSettings parseVariantPositionSpecial(List<String> list) {
        CSSFontFeatureSettings cSSFontFeatureSettings = new CSSFontFeatureSettings(POSITION_ALL_OFF);
        int iContainsWhich = containsWhich(list, FONT_VARIANT_SUB, FONT_VARIANT_SUPER);
        if (iContainsWhich == 1) {
            cSSFontFeatureSettings.settings.put("subs", 1);
            return cSSFontFeatureSettings;
        }
        if (iContainsWhich == 2) {
            cSSFontFeatureSettings.settings.put(FEATURE_SUPS, 1);
            return cSSFontFeatureSettings;
        }
        if (iContainsWhich != 3) {
            return null;
        }
        return ERROR;
    }

    private static boolean setCapsFeature(CSSFontFeatureSettings cSSFontFeatureSettings, String str) {
        str.getClass();
        switch (str) {
            case "titling-caps":
                cSSFontFeatureSettings.settings.put(FEATURE_TITL, 1);
                return true;
            case "all-small-caps":
                cSSFontFeatureSettings.addSettings(FEATURE_SMCP, FEATURE_C2SC, 1);
                return true;
            case "unicase":
                cSSFontFeatureSettings.settings.put(FEATURE_UNIC, 1);
                return true;
            case "petite-caps":
                cSSFontFeatureSettings.settings.put(FEATURE_PCAP, 1);
                return true;
            case "all-petite-caps":
                cSSFontFeatureSettings.addSettings(FEATURE_PCAP, FEATURE_C2PC, 1);
                return true;
            case "small-caps":
                cSSFontFeatureSettings.settings.put(FEATURE_SMCP, 1);
                return true;
            default:
                return false;
        }
    }

    public void applyKerning(Style.FontKerning fontKerning) {
        if (fontKerning == Style.FontKerning.none) {
            this.settings.put(FEATURE_KERN, 0);
        } else {
            this.settings.put(FEATURE_KERN, 1);
        }
    }

    public void applySettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        if (cSSFontFeatureSettings == null) {
            return;
        }
        this.settings.putAll(cSSFontFeatureSettings.settings);
    }

    public boolean hasSettings() {
        return this.settings.size() > 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.settings.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append("'");
            sb2.append(entry.getKey());
            sb2.append("' ");
            sb2.append(entry.getValue());
        }
        return sb2.toString();
    }

    private CSSFontFeatureSettings(HashMap<String, Integer> map) {
        this.settings = map;
    }

    public CSSFontFeatureSettings(CSSFontFeatureSettings cSSFontFeatureSettings) {
        this.settings = new HashMap<>(cSSFontFeatureSettings.settings);
    }
}
