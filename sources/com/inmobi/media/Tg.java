package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.inmobi.media.Tg;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f37770a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f37771b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f37772c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f37773d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f37774e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f37775f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f37776g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f37777h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f37778i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f37779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f37780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f37781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f37782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Location f37783n;

    public static void a(final boolean z10) {
        f37771b = Boolean.valueOf(z10);
        final Context context = Ji.f37157a;
        if (context != null) {
            Runnable runnable = new Runnable() { // from class: w3.o4
                @Override // java.lang.Runnable
                public final void run() {
                    Tg.a(context, z10);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Ji.f37163g.submit(runnable);
        }
    }

    public static Location b() {
        Location location = f37783n;
        if (location != null) {
            return location;
        }
        Context context = Ji.f37157a;
        Location location2 = null;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "user_info_store");
        Intrinsics.checkNotNullParameter("user_location", C4240b4.i.W);
        String string = eaA.f36783a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(StringUtils.COMMA).j(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f37783n = location2;
        return location2;
    }

    public static final void a(Context context, boolean z10) {
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea.a(Da.a(context, "user_info_store"), "user_age_restricted", z10);
    }

    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        int i10 = f37770a;
        int i11 = Integer.MIN_VALUE;
        if (i10 == Integer.MIN_VALUE) {
            Context context = Ji.f37157a;
            if (context == null) {
                i10 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age", C4240b4.i.W);
                i10 = eaA.f36783a.getInt("user_age", Integer.MIN_VALUE);
            }
            f37770a = i10;
        }
        if (i10 > 0) {
            map.put("u-age", String.valueOf(i10));
        }
        int i12 = f37778i;
        if (i12 == Integer.MIN_VALUE) {
            Context context2 = Ji.f37157a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
                Ea eaA2 = Da.a(context2, "user_info_store");
                Intrinsics.checkNotNullParameter("user_yob", C4240b4.i.W);
                i11 = eaA2.f36783a.getInt("user_yob", Integer.MIN_VALUE);
            }
            f37778i = i11;
            i12 = i11;
        }
        if (i12 > 0) {
            map.put("u-yearofbirth", String.valueOf(i12));
        }
        String string = f37775f;
        String string2 = null;
        if (string == null) {
            Context context3 = Ji.f37157a;
            if (context3 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = Ea.f36782b;
                Ea eaA3 = Da.a(context3, "user_info_store");
                Intrinsics.checkNotNullParameter("user_city_code", C4240b4.i.W);
                string = eaA3.f36783a.getString("user_city_code", null);
            }
            f37775f = string;
        }
        String string3 = f37776g;
        if (string3 == null) {
            Context context4 = Ji.f37157a;
            if (context4 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = Ea.f36782b;
                Ea eaA4 = Da.a(context4, "user_info_store");
                Intrinsics.checkNotNullParameter("user_state_code", C4240b4.i.W);
                string3 = eaA4.f36783a.getString("user_state_code", null);
            }
            f37776g = string3;
        }
        String string4 = f37777h;
        if (string4 == null) {
            Context context5 = Ji.f37157a;
            if (context5 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = Ea.f36782b;
                Ea eaA5 = Da.a(context5, "user_info_store");
                Intrinsics.checkNotNullParameter("user_country_code", C4240b4.i.W);
                string4 = eaA5.f36783a.getString("user_country_code", null);
            }
            f37777h = string4;
        }
        String strA = a(string, string3, string4);
        int length = strA.length() - 1;
        boolean zBooleanValue = false;
        int i13 = 0;
        boolean z10 = false;
        while (i13 <= length) {
            boolean z11 = Intrinsics.compare((int) strA.charAt(!z10 ? i13 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i13++;
            } else {
                z10 = true;
            }
        }
        if (strA.subSequence(i13, length + 1).toString().length() > 0) {
            map.put("u-location", strA);
        }
        String string5 = f37772c;
        if (string5 == null) {
            Context context6 = Ji.f37157a;
            if (context6 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = Ea.f36782b;
                Ea eaA6 = Da.a(context6, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_group", C4240b4.i.W);
                string5 = eaA6.f36783a.getString("user_age_group", null);
            }
            f37772c = string5;
        }
        if (string5 != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = string5.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put("u-agegroup", lowerCase);
        }
        String string6 = f37773d;
        if (string6 == null) {
            Context context7 = Ji.f37157a;
            if (context7 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = Ea.f36782b;
                Ea eaA7 = Da.a(context7, "user_info_store");
                Intrinsics.checkNotNullParameter("user_area_code", C4240b4.i.W);
                string6 = eaA7.f36783a.getString("user_area_code", null);
            }
            f37773d = string6;
        }
        if (string6 != null) {
            map.put("u-areacode", string6);
        }
        String string7 = f37774e;
        if (string7 == null) {
            Context context8 = Ji.f37157a;
            if (context8 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = Ea.f36782b;
                Ea eaA8 = Da.a(context8, "user_info_store");
                Intrinsics.checkNotNullParameter("user_post_code", C4240b4.i.W);
                string7 = eaA8.f36783a.getString("user_post_code", null);
            }
            f37774e = string7;
        }
        if (string7 != null) {
            map.put("u-postalcode", string7);
        }
        String string8 = f37779j;
        if (string8 == null) {
            Context context9 = Ji.f37157a;
            if (context9 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = Ea.f36782b;
                Ea eaA9 = Da.a(context9, "user_info_store");
                Intrinsics.checkNotNullParameter("user_gender", C4240b4.i.W);
                string8 = eaA9.f36783a.getString("user_gender", null);
            }
            f37779j = string8;
        }
        if (string8 != null) {
            map.put("u-gender", string8);
        }
        String string9 = f37780k;
        if (string9 == null) {
            Context context10 = Ji.f37157a;
            if (context10 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = Ea.f36782b;
                Ea eaA10 = Da.a(context10, "user_info_store");
                Intrinsics.checkNotNullParameter("user_education", C4240b4.i.W);
                string9 = eaA10.f36783a.getString("user_education", null);
            }
            f37780k = string9;
        }
        if (string9 != null) {
            map.put("u-education", string9);
        }
        String string10 = f37781l;
        if (string10 == null) {
            Context context11 = Ji.f37157a;
            if (context11 == null) {
                string10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = Ea.f36782b;
                Ea eaA11 = Da.a(context11, "user_info_store");
                Intrinsics.checkNotNullParameter("user_language", C4240b4.i.W);
                string10 = eaA11.f36783a.getString("user_language", null);
            }
            f37781l = string10;
        }
        if (string10 != null) {
            map.put("u-language", string10);
        }
        String str2 = f37782m;
        if (str2 == null) {
            Context context12 = Ji.f37157a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = Ea.f36782b;
                Ea eaA12 = Da.a(context12, "user_info_store");
                Intrinsics.checkNotNullParameter("user_interest", C4240b4.i.W);
                string2 = eaA12.f36783a.getString("user_interest", null);
            }
            f37782m = string2;
            str2 = string2;
        }
        if (str2 != null) {
            map.put("u-interests", str2);
        }
        Boolean bool = f37771b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context13 = Ji.f37157a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = Ea.f36782b;
                Ea eaA13 = Da.a(context13, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", C4240b4.i.W);
                f37771b = Boolean.valueOf(eaA13.f36783a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = f37771b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (zBooleanValue) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("u-age-restricted", str);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Tg.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy()) + StringUtils.COMMA + location.getTime();
    }
}
