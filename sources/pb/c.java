package pb;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.Ints;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f98170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f98171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f98172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f98173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f98174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f98175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f98176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f98177j;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f98179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f98180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f98181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f98182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f98183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f98184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f98185h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f98186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f98187j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f98188k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f98178a = i10;
            this.f98179b = i11;
            this.f98180c = i12;
            this.f98181d = i13;
            this.f98182e = i14;
            this.f98183f = i15;
            this.f98184g = i16;
            this.f98185h = i17;
            this.f98186i = i18;
            this.f98187j = i19;
            this.f98188k = i20;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static pb.c.a a(java.lang.String r18) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pb.c.a.a(java.lang.String):pb.c$a");
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f98189c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f98190d = Pattern.compile(o0.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f98191e = Pattern.compile(o0.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f98192f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f98194b;

        private b(int i10, PointF pointF) {
            this.f98193a = i10;
            this.f98194b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f98192f.matcher(str);
            if (matcher.find()) {
                return c.e((String) q9.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f98189c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) q9.a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f98190d.matcher(str);
            Matcher matcher2 = f98191e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    u.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) q9.a.e(strGroup)).trim()), Float.parseFloat(((String) q9.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f98189c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f98168a = str;
        this.f98169b = i10;
        this.f98170c = num;
        this.f98171d = num2;
        this.f98172e = f10;
        this.f98173f = z10;
        this.f98174g = z11;
        this.f98175h = z12;
        this.f98176i = z13;
        this.f98177j = i11;
    }

    public static c b(String str, a aVar) {
        q9.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i10 = aVar.f98188k;
        if (length != i10) {
            u.h("SsaStyle", o0.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f98178a].trim();
            int i11 = aVar.f98179b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f98180c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f98181d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f98182e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f98183f;
            boolean z10 = i15 != -1 && f(strArrSplit[i15].trim());
            int i16 = aVar.f98184g;
            boolean z11 = i16 != -1 && f(strArrSplit[i16].trim());
            int i17 = aVar.f98185h;
            boolean z12 = i17 != -1 && f(strArrSplit[i17].trim());
            int i18 = aVar.f98186i;
            boolean z13 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f98187j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z12, z13, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            u.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        u.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            u.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        u.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            q9.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j10 >> 24) & 255) ^ 255), Ints.checkedCast(j10 & 255), Ints.checkedCast((j10 >> 8) & 255), Ints.checkedCast((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            u.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            u.i("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
