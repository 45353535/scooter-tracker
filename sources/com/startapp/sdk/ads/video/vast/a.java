package com.startapp.sdk.ads.video.vast;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.startapp.sdk.internal.bj;
import com.startapp.sdk.internal.cj;
import com.startapp.sdk.internal.dj;
import com.startapp.sdk.internal.tf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.wi;
import com.startapp.sdk.internal.xi;
import com.startapp.sdk.internal.yi;
import com.startapp.sdk.internal.zi;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.taurusx.tax.f.c;
import com.taurusx.tax.f.s;
import com.taurusx.tax.f.y;
import com.taurusx.tax.f.z;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import com.taurusx.tax.vast.VastIconXmlManager;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f63915i = Arrays.asList("video/mp4", "video/3gpp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f63917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cj f63918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VASTErrorCodes f63919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63921f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f63922g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63923h;

    public a(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        f10 = f10 <= 0.0f ? 1.0f : f10;
        float f11 = i10;
        this.f63917b = f11 / i11;
        this.f63916a = (int) (f11 / f10);
        this.f63923h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec A[LOOP:5: B:146:0x02e6->B:148:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.startapp.sdk.internal.xi a(java.lang.String r25, java.util.ArrayList r26, com.startapp.sdk.internal.yi r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.vast.a.a(java.lang.String, java.util.ArrayList, com.startapp.sdk.internal.yi):com.startapp.sdk.internal.xi");
    }

    public final xi a(String str, yi yiVar) throws Throwable {
        VASTErrorCodes vASTErrorCodes;
        this.f63922g.clear();
        xi xiVarA = a(str, new ArrayList(), yiVar);
        if (xiVarA != null) {
            int i10 = (int) (this.f63916a / this.f63917b);
            wi wiVar = null;
            for (wi wiVar2 : this.f63922g) {
                if (wiVar == null || wiVar2.a(this.f63916a, i10) > wiVar.a(this.f63916a, i10)) {
                    wiVar = wiVar2;
                }
            }
            xiVarA.f65571o = wiVar;
            ArrayList arrayList = new ArrayList(xiVarA.f65557a);
            VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
            a(arrayList, vASTErrorCodes2);
            if (yiVar != null) {
                yiVar.a(vASTErrorCodes2);
                return xiVarA;
            }
        } else if (yiVar != null && (vASTErrorCodes = this.f63919d) != null) {
            yiVar.a(vASTErrorCodes);
        }
        return xiVarA;
    }

    public final String a(String str) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnectionA;
        BufferedInputStream bufferedInputStream;
        int i10 = this.f63920e;
        BufferedInputStream bufferedInputStream2 = null;
        if (i10 >= this.f63921f) {
            return null;
        }
        this.f63920e = i10 + 1;
        try {
            httpURLConnectionA = tf.a(str, this.f63923h);
            try {
                bufferedInputStream = new BufferedInputStream(httpURLConnectionA.getInputStream());
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnectionA = null;
        }
        try {
            String next = new Scanner(bufferedInputStream).useDelimiter("\\A").next();
            vi.a(bufferedInputStream);
            httpURLConnectionA.disconnect();
            return next;
        } catch (Throwable th5) {
            th2 = th5;
            bufferedInputStream2 = bufferedInputStream;
            vi.a(bufferedInputStream2);
            if (httpURLConnectionA != null) {
                httpURLConnectionA.disconnect();
                throw th2;
            }
            throw th2;
        }
    }

    public static void a(bj bjVar, xi xiVar) {
        int i10;
        bj bjVarA;
        Integer numA;
        bjVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = bjVar.d("start").iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            String strB = ((bj) it.next()).b();
            if (!TextUtils.isEmpty(strB)) {
                arrayList.add(new dj(strB, 0));
            }
        }
        for (bj bjVar2 : bjVar.d("progress")) {
            String strA = bjVar2.a("offset");
            if (!TextUtils.isEmpty(strA)) {
                String strTrim = strA.trim();
                if (dj.f64436c.matcher(strTrim).matches()) {
                    String strB2 = bjVar2.b();
                    Integer numA2 = dj.a(strTrim);
                    if (numA2 != null && numA2.intValue() >= 0 && !TextUtils.isEmpty(strB2)) {
                        arrayList.add(new dj(strB2, numA2));
                    }
                }
            }
        }
        Iterator it2 = bjVar.d("creativeView").iterator();
        while (it2.hasNext()) {
            String strB3 = ((bj) it2.next()).b();
            if (!TextUtils.isEmpty(strB3)) {
                arrayList.add(new dj(strB3, 0));
            }
        }
        xiVar.f65559c.addAll(arrayList);
        Collections.sort(xiVar.f65559c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = bjVar.d("firstQuartile").iterator();
        while (it3.hasNext()) {
            String strB4 = ((bj) it3.next()).b();
            if (!TextUtils.isEmpty(strB4)) {
                arrayList2.add(new dj(strB4, Float.valueOf(0.25f)));
            }
        }
        Iterator it4 = bjVar.d("midpoint").iterator();
        while (it4.hasNext()) {
            String strB5 = ((bj) it4.next()).b();
            if (!TextUtils.isEmpty(strB5)) {
                arrayList2.add(new dj(strB5, Float.valueOf(0.5f)));
            }
        }
        Iterator it5 = bjVar.d("thirdQuartile").iterator();
        while (it5.hasNext()) {
            String strB6 = ((bj) it5.next()).b();
            if (!TextUtils.isEmpty(strB6)) {
                arrayList2.add(new dj(strB6, Float.valueOf(0.75f)));
            }
        }
        for (bj bjVar3 : bjVar.d("progress")) {
            String strA2 = bjVar3.a("offset");
            if (!TextUtils.isEmpty(strA2)) {
                String strTrim2 = strA2.trim();
                if (dj.f64437d.matcher(strTrim2).matches()) {
                    String strB7 = bjVar3.b();
                    try {
                        float f10 = Float.parseFloat(strTrim2.replace("%", "")) / 100.0f;
                        if (f10 >= 0.0f && !TextUtils.isEmpty(strB7)) {
                            arrayList2.add(new dj(strB7, Float.valueOf(f10)));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        xiVar.f65560d.addAll(arrayList2);
        Collections.sort(xiVar.f65560d);
        xiVar.f65561e.addAll(bjVar.e("pause"));
        xiVar.f65562f.addAll(bjVar.e("resume"));
        xiVar.f65563g.addAll(bjVar.e("complete"));
        ArrayList arrayListE = bjVar.e("close");
        arrayListE.addAll(bjVar.e("closeLinear"));
        xiVar.f65564h.addAll(arrayListE);
        xiVar.f65567k.addAll(bjVar.e("skip"));
        ArrayList arrayList3 = new ArrayList();
        zi ziVar = null;
        Iterator it6 = bjVar.a(s.f66026s, s.f66032y, null, null).iterator();
        while (it6.hasNext()) {
            String strB8 = ((bj) it6.next()).b();
            if (!TextUtils.isEmpty(strB8)) {
                arrayList3.add(strB8);
            }
        }
        xiVar.f65568l.addAll(arrayList3);
        xiVar.f65565i.addAll(bjVar.e("mute"));
        xiVar.f65566j.addAll(bjVar.e("unmute"));
        if (xiVar.f65569m == null) {
            String strA3 = bjVar.a(s.f66023p);
            if (strA3 == null || TextUtils.isEmpty(strA3.trim()) || !dj.f64436c.matcher(strA3).matches() || (numA = dj.a(strA3)) == null || numA.intValue() < 0) {
                numA = null;
            }
            xiVar.f65569m = numA;
        }
        if (xiVar.f65570n == null) {
            ArrayList<bj> arrayListA = bjVar.a(s.f66014g, s.f66027t, null, null);
            VASTResource$Type[] vASTResource$TypeArrValues = VASTResource$Type.values();
            int length = vASTResource$TypeArrValues.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                VASTResource$Type vASTResource$Type = vASTResource$TypeArrValues[i10];
                if (vASTResource$Type != VASTResource$Type.IFRAME_RESOURCE && vASTResource$Type != VASTResource$Type.HTML_RESOURCE) {
                    for (bj bjVar4 : arrayListA) {
                        Integer numB = bjVar4.b("assetWidth");
                        if (numB == null) {
                            numB = bjVar4.b("width");
                        }
                        Integer numB2 = bjVar4.b("assetHeight");
                        if (numB2 == null) {
                            numB2 = bjVar4.b("height");
                        }
                        if (numB != null && numB.intValue() > 0 && numB.intValue() <= 300 && numB2 != null && numB2.intValue() > 0 && numB2.intValue() <= 300 && b.a(bjVar4, vASTResource$Type, numB.intValue(), numB2.intValue()) != null) {
                            String strA4 = bjVar4.a("offset");
                            if (strA4 != null && dj.f64436c.matcher(strA4).matches()) {
                                dj.a(strA4);
                            }
                            String strA5 = bjVar4.a("duration");
                            if (strA5 != null && dj.f64436c.matcher(strA5).matches()) {
                                dj.a(strA5);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it7 = bjVar4.a(VastIconXmlManager.ICON_CLICK_TRACKING, VastIconXmlManager.ICON_CLICKS, null, null).iterator();
                            while (it7.hasNext()) {
                                String strB9 = ((bj) it7.next()).b();
                                if (!TextUtils.isEmpty(strB9)) {
                                    arrayList4.add(strB9);
                                }
                            }
                            bj bjVarA2 = bjVar4.a(VastIconXmlManager.ICON_CLICKS, null);
                            if (bjVarA2 != null && (bjVarA = bjVarA2.a(VastIconXmlManager.ICON_CLICK_THROUGH, null)) != null) {
                                bjVarA.b();
                            }
                            bjVar4.c(VastIconXmlManager.ICON_VIEW_TRACKING);
                            ziVar = new zi();
                        }
                    }
                }
                i10++;
            }
            xiVar.f65570n = ziVar;
        }
    }

    public final void a(ArrayList arrayList, VASTErrorCodes vASTErrorCodes) {
        this.f63919d = vASTErrorCodes;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        cj cjVar = this.f63918c;
        if (cjVar != null) {
            cjVar.a(arrayList2, vASTErrorCodes);
        }
    }

    public final HashSet a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (VASTResource$Type vASTResource$Type : VASTResource$Type.values()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bj bjVar = (bj) it.next();
                Integer numB = bjVar.b("assetWidth");
                if (numB == null) {
                    numB = bjVar.b("width");
                }
                Integer numB2 = bjVar.b("assetHeight");
                if (numB2 == null) {
                    numB2 = bjVar.b("height");
                }
                if (numB != null && numB.intValue() >= 300 && numB2 != null && numB2.intValue() >= 250) {
                    int iIntValue = numB.intValue();
                    int iIntValue2 = numB2.intValue();
                    Point point = new Point(iIntValue, iIntValue2);
                    int i10 = this.f63916a;
                    float f10 = i10;
                    int i11 = (int) (f10 / this.f63917b);
                    if (iIntValue > i10 || iIntValue2 > i11) {
                        if (vASTResource$Type == VASTResource$Type.HTML_RESOURCE) {
                            point.x = Math.min(i10, iIntValue);
                            point.y = Math.min(i11, iIntValue2);
                        } else {
                            float f11 = iIntValue;
                            float f12 = f11 / f10;
                            float f13 = iIntValue2;
                            float f14 = f13 / i11;
                            if (f12 > f14) {
                                point.x = i10;
                                point.y = (int) (f13 / f12);
                            } else {
                                point.x = (int) (f11 / f14);
                                point.y = i11;
                            }
                        }
                    }
                    b bVarA = b.a(bjVar, vASTResource$Type, point.x, point.y);
                    if (bVarA != null) {
                        int i12 = point.x;
                        int i13 = point.y;
                        String strF = bjVar.f(c.f66001o);
                        ArrayList arrayListC = bjVar.c(c.f66002s);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = bjVar.d("creativeView").iterator();
                        while (it2.hasNext()) {
                            String strB = ((bj) it2.next()).b();
                            if (!TextUtils.isEmpty(strB)) {
                                arrayList2.add(strB);
                            }
                        }
                        hashSet.add(new wi(i12, i13, bVarA, strF, arrayListC, arrayList2));
                    }
                }
            }
        }
        return hashSet;
    }

    public static ArrayList a(bj bjVar) {
        String strF;
        String strF2;
        ArrayList<bj> arrayListA = bjVar.a(z.f66070y, z.f66069w, null, null);
        Iterator it = bjVar.a(VastExtensionParentXmlManager.f66980w, y.f66056t, "type", Collections.singletonList(z.f66069w)).iterator();
        while (it.hasNext()) {
            arrayListA.addAll(((bj) it.next()).a(z.f66070y, z.f66069w, null, null));
        }
        ArrayList arrayList = new ArrayList();
        for (bj bjVar2 : arrayListA) {
            String strA = bjVar2.a(z.f66061c);
            if (strA != null && (strF = bjVar2.f(z.f66066o)) != null && (strF2 = bjVar2.f(z.f66065n)) != null) {
                bj bjVarA = bjVar2.a(z.f66066o, "apiFramework");
                String strA2 = bjVarA == null ? null : bjVarA.a("apiFramework");
                if (strA2 != null && strA2.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(strA, strF, strF2));
                }
            }
        }
        return arrayList;
    }
}
