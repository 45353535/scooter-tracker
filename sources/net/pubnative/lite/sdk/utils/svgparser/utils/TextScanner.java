package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.Locale;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;

/* JADX INFO: loaded from: classes3.dex */
public class TextScanner {
    final String input;
    int inputLength;
    int position = 0;
    private final NumberParser numberParser = new NumberParser();

    public TextScanner(String str) {
        String strTrim = str.trim();
        this.input = strTrim;
        this.inputLength = strTrim.length();
    }

    int advanceChar() {
        int i10 = this.position;
        int i11 = this.inputLength;
        if (i10 == i11) {
            return -1;
        }
        int i12 = i10 + 1;
        this.position = i12;
        if (i12 < i11) {
            return this.input.charAt(i12);
        }
        return -1;
    }

    String ahead() {
        int i10 = this.position;
        while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
            this.position++;
        }
        String strSubstring = this.input.substring(i10, this.position);
        this.position = i10;
        return strSubstring;
    }

    Boolean checkedNextFlag(Object obj) {
        if (obj == null) {
            return null;
        }
        skipCommaWhitespace();
        return nextFlag();
    }

    float checkedNextFloat(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        skipCommaWhitespace();
        return nextFloat();
    }

    public boolean consume(char c10) {
        int i10 = this.position;
        boolean z10 = i10 < this.inputLength && this.input.charAt(i10) == c10;
        if (z10) {
            this.position++;
        }
        return z10;
    }

    public boolean empty() {
        return this.position == this.inputLength;
    }

    boolean hasLetter() {
        int i10 = this.position;
        if (i10 == this.inputLength) {
            return false;
        }
        char cCharAt = this.input.charAt(i10);
        if (cCharAt < 'a' || cCharAt > 'z') {
            return cCharAt >= 'A' && cCharAt <= 'Z';
        }
        return true;
    }

    boolean isEOL(int i10) {
        return i10 == 10 || i10 == 13;
    }

    boolean isWhitespace(int i10) {
        return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
    }

    Integer nextChar() {
        int i10 = this.position;
        if (i10 == this.inputLength) {
            return null;
        }
        String str = this.input;
        this.position = i10 + 1;
        return Integer.valueOf(str.charAt(i10));
    }

    Boolean nextFlag() {
        int i10 = this.position;
        if (i10 == this.inputLength) {
            return null;
        }
        char cCharAt = this.input.charAt(i10);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.position++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float nextFloat() {
        float number = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
        if (!Float.isNaN(number)) {
            this.position = this.numberParser.getEndPos();
        }
        return number;
    }

    String nextFunction() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        int iCharAt = this.input.charAt(i10);
        while (true) {
            if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                break;
            }
            iCharAt = advanceChar();
        }
        int i11 = this.position;
        while (isWhitespace(iCharAt)) {
            iCharAt = advanceChar();
        }
        if (iCharAt == 40) {
            this.position++;
            return this.input.substring(i10, i11);
        }
        this.position = i10;
        return null;
    }

    Integer nextInteger(boolean z10) {
        IntegerParser integerParser = IntegerParser.parseInt(this.input, this.position, this.inputLength, z10);
        if (integerParser == null) {
            return null;
        }
        this.position = integerParser.getEndPos();
        return Integer.valueOf(integerParser.value());
    }

    SVGBase.Length nextLength() {
        float fNextFloat = nextFloat();
        if (Float.isNaN(fNextFloat)) {
            return null;
        }
        SVGBase.Unit unitNextUnit = nextUnit();
        return unitNextUnit == null ? new SVGBase.Length(fNextFloat, SVGBase.Unit.px) : new SVGBase.Length(fNextFloat, unitNextUnit);
    }

    public String nextQuotedString() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        char cCharAt = this.input.charAt(i10);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iAdvanceChar = advanceChar();
        while (iAdvanceChar != -1 && iAdvanceChar != cCharAt) {
            iAdvanceChar = advanceChar();
        }
        if (iAdvanceChar == -1) {
            this.position = i10;
            return null;
        }
        int i11 = this.position;
        this.position = i11 + 1;
        return this.input.substring(i10 + 1, i11);
    }

    public String nextToken() {
        return nextToken(' ', false);
    }

    String nextTokenWithWhitespace(char c10) {
        return nextToken(c10, true);
    }

    SVGBase.Unit nextUnit() {
        if (empty()) {
            return null;
        }
        if (this.input.charAt(this.position) == '%') {
            this.position++;
            return SVGBase.Unit.percent;
        }
        int i10 = this.position;
        if (i10 > this.inputLength - 2) {
            return null;
        }
        try {
            SVGBase.Unit unitValueOf = SVGBase.Unit.valueOf(this.input.substring(i10, i10 + 2).toLowerCase(Locale.US));
            this.position += 2;
            return unitValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String nextWord() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        char cCharAt = this.input.charAt(i10);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            this.position = i10;
            return null;
        }
        int iAdvanceChar = advanceChar();
        while (true) {
            if ((iAdvanceChar < 65 || iAdvanceChar > 90) && (iAdvanceChar < 97 || iAdvanceChar > 122)) {
                break;
            }
            iAdvanceChar = advanceChar();
        }
        return this.input.substring(i10, this.position);
    }

    float possibleNextFloat() {
        skipCommaWhitespace();
        float number = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
        if (!Float.isNaN(number)) {
            this.position = this.numberParser.getEndPos();
        }
        return number;
    }

    String restOfText() {
        if (empty()) {
            return null;
        }
        int i10 = this.position;
        this.position = this.inputLength;
        return this.input.substring(i10);
    }

    public boolean skipCommaWhitespace() {
        skipWhitespace();
        int i10 = this.position;
        if (i10 == this.inputLength || this.input.charAt(i10) != ',') {
            return false;
        }
        this.position++;
        skipWhitespace();
        return true;
    }

    public void skipWhitespace() {
        while (true) {
            int i10 = this.position;
            if (i10 >= this.inputLength || !isWhitespace(this.input.charAt(i10))) {
                return;
            } else {
                this.position++;
            }
        }
    }

    public String nextToken(char c10) {
        return nextToken(c10, false);
    }

    public boolean consume(String str) {
        int length = str.length();
        int i10 = this.position;
        boolean z10 = i10 <= this.inputLength - length && this.input.substring(i10, i10 + length).equals(str);
        if (z10) {
            this.position += length;
        }
        return z10;
    }

    String nextToken(char c10, boolean z10) {
        if (empty()) {
            return null;
        }
        char cCharAt = this.input.charAt(this.position);
        if ((!z10 && isWhitespace(cCharAt)) || cCharAt == c10) {
            return null;
        }
        int i10 = this.position;
        int iAdvanceChar = advanceChar();
        while (iAdvanceChar != -1 && iAdvanceChar != c10 && (z10 || !isWhitespace(iAdvanceChar))) {
            iAdvanceChar = advanceChar();
        }
        return this.input.substring(i10, this.position);
    }

    float checkedNextFloat(Boolean bool) {
        if (bool == null) {
            return Float.NaN;
        }
        skipCommaWhitespace();
        return nextFloat();
    }
}
