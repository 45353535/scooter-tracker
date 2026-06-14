package io.bidmachine.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.common.collect.ImmutableMap;
import io.bidmachine.media3.ui.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f81597a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f81599b;

        private b(String str, Map map) {
            this.f81598a = str;
            this.f81599b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator f81600e = new Comparator() { // from class: io.bidmachine.media3.ui.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a0.c.a((a0.c) obj, (a0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator f81601f = new Comparator() { // from class: io.bidmachine.media3.ui.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a0.c.b((a0.c) obj, (a0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f81605d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f81603b, cVar.f81603b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f81604c.compareTo(cVar2.f81604c);
            return iCompareTo != 0 ? iCompareTo : cVar.f81605d.compareTo(cVar2.f81605d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f81602a, cVar.f81602a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f81604c.compareTo(cVar.f81604c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f81605d.compareTo(cVar.f81605d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f81602a = i10;
            this.f81603b = i11;
            this.f81604c = str;
            this.f81605d = str2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f81606a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f81607b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        int i10 = 0;
        if (charSequence == null) {
            return new b("", ImmutableMap.of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), ImmutableMap.of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(io.bidmachine.media3.ui.c.a("bg_" + iIntValue), o0.G("background-color:%s;", io.bidmachine.media3.ui.c.b(iIntValue)));
        }
        SparseArray sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = (d) sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f81607b, c.f81601f);
            Iterator it2 = dVar.f81607b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f81605d);
            }
            Collections.sort(dVar.f81606a, c.f81600e);
            Iterator it3 = dVar.f81606a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f81604c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f81597a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray c(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                q9.a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f81606a.add(cVar);
                f(sparseArray, spanEnd).f81607b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof p9.d) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof p9.h)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof p9.f) {
                return "<rt>" + b(((p9.f) obj).f98123a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return o0.G("<span style='color:%s;'>", io.bidmachine.media3.ui.c.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return o0.G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof p9.d) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return o0.G("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r4.getSize() : r4.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return o0.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return o0.G("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof p9.f)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof p9.h)) {
                return null;
            }
            p9.h hVar = (p9.h) obj;
            return o0.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(hVar.f98128a, hVar.f98129b), g(hVar.f98130c));
        }
        int i10 = ((p9.f) obj).f98124b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
