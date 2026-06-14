package yads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.N6;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f117512a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f117513b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f117514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f117515d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f117514c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f117515d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.text.SpannableStringBuilder r18, yads.tl3 r19, java.lang.String r20, java.util.List r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wl3.a(android.text.SpannableStringBuilder, yads.tl3, java.lang.String, java.util.List, java.util.List):void");
    }

    public static void b(String str, vl3 vl3Var) {
        String strSubstring;
        int i10 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    uf1.d("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            vl3Var.f117087g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (!str.endsWith("%")) {
            vl3Var.f117085e = Integer.parseInt(str);
            vl3Var.f117086f = 1;
            return;
        }
        int i11 = yl3.f118290a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        vl3Var.f117085e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        vl3Var.f117086f = 0;
    }

    public static rl3 a(String str, Matcher matcher, w92 w92Var, ArrayList arrayList) {
        vl3 vl3Var = new vl3();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            vl3Var.f117081a = yl3.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            vl3Var.f117082b = yl3.a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            a(strGroup3, vl3Var);
            StringBuilder sb2 = new StringBuilder();
            String strC = w92Var.c();
            while (!TextUtils.isEmpty(strC)) {
                if (sb2.length() > 0) {
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb2.append(strC.trim());
                strC = w92Var.c();
            }
            vl3Var.f117083c = a(str, sb2.toString(), arrayList);
            return new rl3(vl3Var.a().a(), vl3Var.f117081a, vl3Var.f117082b);
        } catch (NumberFormatException unused) {
            uf1.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannedString a(String str, String str2, List list) {
        int i10;
        char c10;
        String strSubstring;
        int i11 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            String strTrim = "";
            if (i12 < str2.length()) {
                char cCharAt = str2.charAt(i12);
                if (cCharAt == '&') {
                    i12++;
                    int iIndexOf = str2.indexOf(59, i12);
                    int iIndexOf2 = str2.indexOf(32, i12);
                    if (iIndexOf == -1) {
                        iIndexOf = iIndexOf2;
                    } else if (iIndexOf2 != -1) {
                        iIndexOf = Math.min(iIndexOf, iIndexOf2);
                    }
                    if (iIndexOf != -1) {
                        strSubstring = str2.substring(i12, iIndexOf);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "gt":
                                spannableStringBuilder.append('>');
                                break;
                            case "lt":
                                spannableStringBuilder.append('<');
                                break;
                            case "amp":
                                spannableStringBuilder.append('&');
                                break;
                            case "nbsp":
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                uf1.d("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                                break;
                        }
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i12 = iIndexOf + 1;
                    } else {
                        spannableStringBuilder.append(cCharAt);
                    }
                    i11 = 2;
                } else if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i12++;
                } else {
                    int length = i12 + 1;
                    if (length < str2.length()) {
                        boolean z10 = str2.charAt(length) == '/';
                        int iIndexOf3 = str2.indexOf(62, length);
                        length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                        int i13 = length - 2;
                        boolean z11 = str2.charAt(i13) == '/';
                        int i14 = i12 + (z10 ? i11 : 1);
                        if (!z11) {
                            i13 = length - 1;
                        }
                        String strSubstring2 = str2.substring(i14, i13);
                        if (!strSubstring2.trim().isEmpty()) {
                            String strTrim2 = strSubstring2.trim();
                            if (!strTrim2.isEmpty()) {
                                int i15 = w83.f117341a;
                                String str3 = strTrim2.split("[ \\.]", i11)[0];
                                str3.getClass();
                                switch (str3.hashCode()) {
                                    case 98:
                                        i10 = str3.equals("b") ? 0 : -1;
                                        break;
                                    case 99:
                                        i10 = str3.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM) ? 1 : -1;
                                        break;
                                    case 105:
                                        i10 = str3.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT) ? i11 : -1;
                                        break;
                                    case 117:
                                        i10 = str3.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL) ? 3 : -1;
                                        break;
                                    case 118:
                                        i10 = str3.equals("v") ? 4 : -1;
                                        break;
                                    case 3650:
                                        i10 = str3.equals("rt") ? 5 : -1;
                                        break;
                                    case 3314158:
                                        i10 = str3.equals(N6.f41413q) ? 6 : -1;
                                        break;
                                    case 3511770:
                                        i10 = str3.equals("ruby") ? 7 : -1;
                                        break;
                                    default:
                                        i10 = -1;
                                        break;
                                }
                                switch (i10) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (!z10) {
                                            if (!z11) {
                                                int length2 = spannableStringBuilder.length();
                                                String strTrim3 = strSubstring2.trim();
                                                if (!strTrim3.isEmpty()) {
                                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                                    if (iIndexOf4 == -1) {
                                                        c10 = 0;
                                                    } else {
                                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                                        c10 = 0;
                                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                                    }
                                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                                    String str4 = strArrSplit[c10];
                                                    HashSet hashSet = new HashSet();
                                                    for (int i16 = 1; i16 < strArrSplit.length; i16++) {
                                                        hashSet.add(strArrSplit[i16]);
                                                    }
                                                    arrayDeque.push(new tl3(str4, length2, strTrim, hashSet));
                                                } else {
                                                    throw new IllegalArgumentException();
                                                }
                                            }
                                            break;
                                        } else {
                                            while (!arrayDeque.isEmpty()) {
                                                tl3 tl3Var = (tl3) arrayDeque.pop();
                                                a(spannableStringBuilder, tl3Var, str, arrayList, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new sl3(tl3Var, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (tl3Var.f116292a.equals(str3)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    default:
                                        i12 = length;
                                        break;
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    i12 = length;
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(spannableStringBuilder, (tl3) arrayDeque.pop(), str, arrayList, list);
                }
                a(spannableStringBuilder, new tl3("", 0, "", Collections.EMPTY_SET), str, Collections.EMPTY_LIST, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r19, yads.vl3 r20) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wl3.a(java.lang.String, yads.vl3):void");
    }
}
