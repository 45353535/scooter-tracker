package yads;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public final class pm3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z10) {
        Boolean boolU1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null && (boolU1 = StringsKt.u1(lowerCase)) != null) {
                return boolU1.booleanValue();
            }
        }
        return z10;
    }
}
