package com.iab.omid.library.chartboost;

import com.iab.omid.library.chartboost.utils.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f34754a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f34755b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f34756c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f34757d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f34758e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f34759f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f34760g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] iArrA = a(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!b(str, sb2, f34755b, str2, iArrA) && !a(str, sb2, f34754a, str2, iArrA) && !b(str, sb2, f34757d, str2, iArrA) && !a(str, sb2, f34756c, str2, iArrA) && !b(str, sb2, f34759f, str2, iArrA) && !a(str, sb2, f34758e, str2, iArrA) && !a(str, sb2, f34760g, str2, iArrA)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    static String b(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str.indexOf("<!--", i10);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i10 = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i10 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }
}
