package com.appodeal.ads;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.y.z.w.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Log.LogLevel f13242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f13243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f13244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f13245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f13246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f13247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f13248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f13249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f13250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f13251m;

    static {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("https://%s:443", Arrays.copyOf(new Object[]{"c.appbaqend.com"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        f13239a = str;
        f13242d = Log.LogLevel.none;
        f13244f = -1;
        f13245g = true;
        f13246h = -90;
        f13247i = 90;
        f13251m = true;
    }

    public static final String a() {
        String str = (String) com.appodeal.ads.utils.debug.m.f15003d.getValue();
        return str == null ? f13239a : str;
    }

    public static final void b(Log.LogLevel value) {
        Intrinsics.checkNotNullParameter(value, "value");
        f13242d = value;
        LogExtKt.logInternal$default("AppodealSettings", "setLogLevel: " + value, null, 4, null);
    }

    public static final void c(JSONObject jObject) {
        ArrayList arrayList;
        Integer num;
        Integer num2;
        Integer num3;
        List listSplit$default;
        String str;
        List listSplit$default2;
        Intrinsics.checkNotNullParameter(jObject, "jObject");
        try {
            if (jObject.has("randomize_offers")) {
                f13245g = jObject.getBoolean("randomize_offers");
            }
            Intrinsics.checkNotNullParameter(jObject, "jObject");
            if (jObject.optBoolean(s.z.f67719y)) {
                h2.p(Log.LogLevel.verbose);
                LogExtKt.setLogEnable(true);
            }
            if (jObject.has("last_sdk_version") && f13248j == null) {
                String string = jObject.getString("last_sdk_version");
                f13248j = string;
                if (string == null || (listSplit$default = StringsKt.split$default(string, new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null)) == null || (str = (String) CollectionsKt.firstOrNull(listSplit$default)) == null || (listSplit$default2 = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null)) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default2, 10));
                    Iterator it = listSplit$default2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt.toIntOrNull((String) it.next()));
                    }
                }
                int iCompare = -1;
                int iIntValue = (arrayList == null || (num3 = (Integer) CollectionsKt.getOrNull(arrayList, 0)) == null) ? -1 : num3.intValue();
                int iIntValue2 = (arrayList == null || (num2 = (Integer) CollectionsKt.getOrNull(arrayList, 1)) == null) ? -1 : num2.intValue();
                int iIntValue3 = (arrayList == null || (num = (Integer) CollectionsKt.getOrNull(arrayList, 2)) == null) ? -1 : num.intValue();
                String str2 = Constants.SDK_VERSION;
                com.appodeal.ads.utils.i other = new com.appodeal.ads.utils.i(str2);
                Intrinsics.checkNotNullParameter(other, "other");
                if (iIntValue != -1 && (iCompare = Intrinsics.compare(iIntValue, other.f15021b)) == 0 && (iCompare = Intrinsics.compare(iIntValue2, other.f15022c)) == 0 && (iCompare = Intrinsics.compare(iIntValue3, other.f15023d)) == 0) {
                    iCompare = 0;
                }
                if (iCompare > 0) {
                    kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
                    String str3 = String.format("your SDK version %s does not match latest SDK version %s!", Arrays.copyOf(new Object[]{str2, f13248j}, 2));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    Log.log(LogConstants.KEY_SDK, "Warning", str3);
                }
            }
            if (jObject.has("test")) {
                boolean z10 = h2.f13367a;
                h2.R(jObject.getBoolean("test"));
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public static final void d(boolean z10) {
        f13240b = z10;
    }

    public static final boolean e() {
        Boolean bool = (Boolean) com.appodeal.ads.utils.debug.m.f15001b.getValue();
        return bool != null ? bool.booleanValue() : f13240b;
    }

    public static final boolean f() {
        Boolean bool = f13249k;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zG = z6.g();
        f13249k = Boolean.valueOf(zG);
        return zG;
    }

    public static final void g() {
        h6.a().f13575o = null;
        af.a().f13575o = null;
        ee.a().f13575o = null;
        ve.a().f13575o = null;
        t1.a().f13575o = null;
    }
}
