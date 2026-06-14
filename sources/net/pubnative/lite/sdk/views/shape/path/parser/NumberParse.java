package net.pubnative.lite.sdk.views.shape.path.parser;

import java.util.ArrayList;
import net.pubnative.lite.sdk.HyBid;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
class NumberParse {
    private final int nextCmd;
    final ArrayList<Float> numbers;

    private NumberParse(ArrayList<Float> arrayList, int i10) {
        this.numbers = arrayList;
        this.nextCmd = i10;
    }

    static final NumberParse getNumberParseAttr(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return parseNumbers(xmlPullParser.getAttributeValue(i10));
            }
        }
        return null;
    }

    static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int length2 = 0;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                char cCharAt = str.charAt(i10);
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                        String strSubstring = str.substring(length2, i10);
                        if (strSubstring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(strSubstring)));
                            if (cCharAt == '-') {
                                length2 = i10;
                            } else {
                                length2 = i10 + 1;
                                z10 = true;
                            }
                        } else {
                            length2++;
                        }
                        break;
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String strSubstring2 = str.substring(length2, i10);
                        if (strSubstring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(strSubstring2)));
                        }
                        return new NumberParse(arrayList, i10);
                }
            }
        }
        String strSubstring3 = str.substring(length2);
        if (strSubstring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(strSubstring3)));
            } catch (NumberFormatException e10) {
                HyBid.reportException((Exception) e10);
            }
            length2 = str.length();
        }
        return new NumberParse(arrayList, length2);
    }

    public int getNextCmd() {
        return this.nextCmd;
    }

    public float getNumber(int i10) {
        return this.numbers.get(i10).floatValue();
    }
}
