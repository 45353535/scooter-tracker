package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* JADX INFO: loaded from: classes3.dex */
public class CSSTextScanner extends TextScanner {
    static final Pattern PATTERN_BLOCK_COMMENTS = Pattern.compile("(?s)/\\*.*?\\*/");

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.CSSTextScanner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents;

        static {
            int[] iArr = new int[CSSParser.PseudoClassIdents.values().length];
            $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents = iArr;
            try {
                iArr[CSSParser.PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[CSSParser.PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    private static class AnPlusB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95983b;

        AnPlusB(int i10, int i11) {
            this.f95982a = i10;
            this.f95983b = i11;
        }
    }

    public CSSTextScanner(String str) {
        super(PATTERN_BLOCK_COMMENTS.matcher(str).replaceAll(""));
    }

    private int hexChar(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 < 97 || i10 > 102) {
            return -1;
        }
        return i10 - 87;
    }

    private AnPlusB nextAnPlusB() {
        IntegerParser integerParser;
        AnPlusB anPlusB;
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        int i11 = 1;
        if (consume("odd")) {
            anPlusB = new AnPlusB(2, 1);
        } else {
            if (consume("even")) {
                anPlusB = new AnPlusB(2, 0);
            } else {
                int i12 = (!consume('+') && consume('-')) ? -1 : 1;
                IntegerParser integerParser2 = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                if (integerParser2 != null) {
                    this.position = integerParser2.getEndPos();
                }
                if (consume('n') || consume('N')) {
                    if (integerParser2 == null) {
                        integerParser2 = new IntegerParser(1L, this.position);
                    }
                    skipWhitespace();
                    boolean zConsume = consume('+');
                    if (!zConsume && (zConsume = consume('-'))) {
                        i11 = -1;
                    }
                    if (zConsume) {
                        skipWhitespace();
                        integerParser = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                        if (integerParser == null) {
                            this.position = i10;
                            return null;
                        }
                        this.position = integerParser.getEndPos();
                        int i13 = i11;
                        i11 = i12;
                        i12 = i13;
                    } else {
                        int i14 = i11;
                        i11 = i12;
                        i12 = i14;
                        integerParser = null;
                    }
                } else {
                    integerParser = integerParser2;
                    integerParser2 = null;
                }
                anPlusB = new AnPlusB(integerParser2 == null ? 0 : i11 * integerParser2.value(), integerParser != null ? i12 * integerParser.value() : 0);
            }
        }
        skipWhitespace();
        if (consume(')')) {
            return anPlusB;
        }
        this.position = i10;
        return null;
    }

    private String nextAttribValue() {
        if (empty()) {
            return null;
        }
        String strNextQuotedString = nextQuotedString();
        return strNextQuotedString != null ? strNextQuotedString : nextIdentifier();
    }

    private List<String> nextIdentListParam() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        ArrayList arrayList = null;
        do {
            String strNextIdentifier = nextIdentifier();
            if (strNextIdentifier == null) {
                this.position = i10;
                return null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strNextIdentifier);
            skipWhitespace();
        } while (skipCommaWhitespace());
        if (consume(')')) {
            return arrayList;
        }
        this.position = i10;
        return null;
    }

    private List<CSSParser.Selector> nextPseudoNotParam() {
        List<CSSParser.SimpleSelector> list;
        List<CSSParser.PseudoClass> list2;
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        List<CSSParser.Selector> listNextSelectorGroup = nextSelectorGroup();
        if (listNextSelectorGroup == null) {
            this.position = i10;
            return null;
        }
        if (!consume(')')) {
            this.position = i10;
            return null;
        }
        Iterator<CSSParser.Selector> it = listNextSelectorGroup.iterator();
        while (it.hasNext() && (list = it.next().simpleSelectors) != null) {
            Iterator<CSSParser.SimpleSelector> it2 = list.iterator();
            while (it2.hasNext() && (list2 = it2.next().pseudos) != null) {
                Iterator<CSSParser.PseudoClass> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next() instanceof CSSParser.PseudoClassNot) {
                        return null;
                    }
                }
            }
        }
        return listNextSelectorGroup;
    }

    private void parsePseudoClass(CSSParser.Selector selector, CSSParser.SimpleSelector simpleSelector) throws CSSParseException {
        CSSParser.PseudoClass pseudoClassAnPlusB;
        CSSParser.PseudoClass pseudoClass;
        CSSParser.PseudoClass pseudoClass2;
        String strNextIdentifier = nextIdentifier();
        if (strNextIdentifier == null) {
            throw new CSSParseException("Invalid pseudo class");
        }
        CSSParser.PseudoClassIdents pseudoClassIdentsFromString = CSSParser.PseudoClassIdents.fromString(strNextIdentifier);
        switch (AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents[pseudoClassIdentsFromString.ordinal()]) {
            case 1:
                CSSParser.PseudoClass pseudoClassAnPlusB2 = new CSSParser.PseudoClassAnPlusB(0, 1, true, false, null);
                selector.addedAttributeOrPseudo();
                pseudoClass2 = pseudoClassAnPlusB2;
                pseudoClass = pseudoClass2;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 2:
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, false, false, null);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassAnPlusB;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 3:
                CSSParser.PseudoClass pseudoClassOnlyChild = new CSSParser.PseudoClassOnlyChild(false, null);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassOnlyChild;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 4:
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, true, true, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassAnPlusB;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 5:
                CSSParser.PseudoClass pseudoClassAnPlusB3 = new CSSParser.PseudoClassAnPlusB(0, 1, false, true, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassAnPlusB3;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 6:
                CSSParser.PseudoClass pseudoClassOnlyChild2 = new CSSParser.PseudoClassOnlyChild(true, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassOnlyChild2;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 7:
                CSSParser.PseudoClass pseudoClassRoot = new CSSParser.PseudoClassRoot();
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassRoot;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 8:
                CSSParser.PseudoClass pseudoClassEmpty = new CSSParser.PseudoClassEmpty();
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassEmpty;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 9:
            case 10:
            case 11:
            case 12:
                boolean z10 = pseudoClassIdentsFromString == CSSParser.PseudoClassIdents.nth_child || pseudoClassIdentsFromString == CSSParser.PseudoClassIdents.nth_of_type;
                boolean z11 = pseudoClassIdentsFromString == CSSParser.PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == CSSParser.PseudoClassIdents.nth_last_of_type;
                AnPlusB anPlusBNextAnPlusB = nextAnPlusB();
                if (anPlusBNextAnPlusB == null) {
                    throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strNextIdentifier);
                }
                pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(anPlusBNextAnPlusB.f95982a, anPlusBNextAnPlusB.f95983b, z10, z11, simpleSelector.tag);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassAnPlusB;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 13:
                List<CSSParser.Selector> listNextPseudoNotParam = nextPseudoNotParam();
                if (listNextPseudoNotParam == null) {
                    throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strNextIdentifier);
                }
                CSSParser.PseudoClassNot pseudoClassNot = new CSSParser.PseudoClassNot(listNextPseudoNotParam);
                selector.specificity = pseudoClassNot.getSpecificity();
                pseudoClass2 = pseudoClassNot;
                pseudoClass = pseudoClass2;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 14:
                CSSParser.PseudoClass pseudoClassTarget = new CSSParser.PseudoClassTarget();
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassTarget;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 15:
                nextIdentListParam();
                CSSParser.PseudoClass pseudoClassNotSupported = new CSSParser.PseudoClassNotSupported(strNextIdentifier);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassNotSupported;
                simpleSelector.addPseudo(pseudoClass);
                return;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                CSSParser.PseudoClass pseudoClassNotSupported2 = new CSSParser.PseudoClassNotSupported(strNextIdentifier);
                selector.addedAttributeOrPseudo();
                pseudoClass = pseudoClassNotSupported2;
                simpleSelector.addPseudo(pseudoClass);
                return;
            default:
                throw new CSSParseException("Unsupported pseudo class: " + strNextIdentifier);
        }
    }

    private int scanForIdentifier() {
        int i10;
        if (empty()) {
            return this.position;
        }
        int i11 = this.position;
        int iCharAt = this.input.charAt(i11);
        if (iCharAt == 45) {
            iCharAt = advanceChar();
        }
        if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 45 && iCharAt != 95 && iCharAt < 128)) {
            i10 = i11;
        } else {
            int iAdvanceChar = advanceChar();
            while (true) {
                if ((iAdvanceChar < 65 || iAdvanceChar > 90) && ((iAdvanceChar < 97 || iAdvanceChar > 122) && ((iAdvanceChar < 48 || iAdvanceChar > 57) && iAdvanceChar != 45 && iAdvanceChar != 95 && iAdvanceChar < 128))) {
                    break;
                }
                iAdvanceChar = advanceChar();
            }
            i10 = this.position;
        }
        this.position = i11;
        return i10;
    }

    public String nextCSSString() {
        int iHexChar;
        if (empty()) {
            return null;
        }
        char cCharAt = this.input.charAt(this.position);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.position++;
        int iIntValue = nextChar().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = nextChar().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = nextChar().intValue();
                    } else {
                        int iHexChar2 = hexChar(iIntValue);
                        if (iHexChar2 != -1) {
                            for (int i10 = 1; i10 <= 5 && (iHexChar = hexChar((iIntValue = nextChar().intValue()))) != -1; i10++) {
                                iHexChar2 = (iHexChar2 * 16) + iHexChar;
                            }
                            sb2.append((char) iHexChar2);
                        }
                    }
                }
            }
            sb2.append((char) iIntValue);
            iIntValue = nextChar().intValue();
        }
        return sb2.toString();
    }

    public String nextIdentifier() {
        int iScanForIdentifier = scanForIdentifier();
        int i10 = this.position;
        if (iScanForIdentifier == i10) {
            return null;
        }
        String strSubstring = this.input.substring(i10, iScanForIdentifier);
        this.position = iScanForIdentifier;
        return strSubstring;
    }

    String nextLegacyURL() {
        char cCharAt;
        int iHexChar;
        StringBuilder sb2 = new StringBuilder();
        while (!empty() && (cCharAt = this.input.charAt(this.position)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !isWhitespace(cCharAt) && !Character.isISOControl((int) cCharAt)) {
            this.position++;
            if (cCharAt == '\\') {
                if (!empty()) {
                    String str = this.input;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    cCharAt = str.charAt(i10);
                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                        int iHexChar2 = hexChar(cCharAt);
                        if (iHexChar2 != -1) {
                            for (int i11 = 1; i11 <= 5 && !empty() && (iHexChar = hexChar(this.input.charAt(this.position))) != -1; i11++) {
                                this.position++;
                                iHexChar2 = (iHexChar2 * 16) + iHexChar;
                            }
                            sb2.append((char) iHexChar2);
                        }
                    }
                }
            }
            sb2.append(cCharAt);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String nextPropertyValue() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        int iCharAt = this.input.charAt(i10);
        int i11 = i10;
        while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !isEOL(iCharAt)) {
            if (!isWhitespace(iCharAt)) {
                i11 = this.position + 1;
            }
            iCharAt = advanceChar();
        }
        if (this.position > i10) {
            return this.input.substring(i10, i11);
        }
        this.position = i10;
        return null;
    }

    public List<CSSParser.Selector> nextSelectorGroup() {
        if (empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        CSSParser.Selector selector = new CSSParser.Selector();
        while (!empty() && nextSimpleSelector(selector)) {
            if (skipCommaWhitespace()) {
                arrayList.add(selector);
                selector = new CSSParser.Selector();
            }
        }
        if (!selector.isEmpty()) {
            arrayList.add(selector);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean nextSimpleSelector(net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.Selector r11) throws net.pubnative.lite.sdk.utils.svgparser.utils.CSSParseException {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSTextScanner.nextSimpleSelector(net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser$Selector):boolean");
    }

    public String nextURL() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        if (!consume("url(")) {
            return null;
        }
        skipWhitespace();
        String strNextCSSString = nextCSSString();
        if (strNextCSSString == null) {
            strNextCSSString = nextLegacyURL();
        }
        if (strNextCSSString == null) {
            this.position = i10;
            return null;
        }
        skipWhitespace();
        if (empty() || consume(")")) {
            return strNextCSSString;
        }
        this.position = i10;
        return null;
    }
}
