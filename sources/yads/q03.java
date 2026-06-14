package yads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class q03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f114841a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f114842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f114843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f114844d;

    static {
        int i10 = w83.f117341a;
        Locale locale = Locale.US;
        f114842b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f114843c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f114844d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f114842b.matcher(str);
        Matcher matcher2 = f114843c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                uf1.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f10 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f10, Float.parseFloat(strGroup2.trim()));
    }
}
