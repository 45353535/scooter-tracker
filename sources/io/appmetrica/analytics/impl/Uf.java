package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f76560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f76561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f76562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f76563d;

    static {
        HashMap map = new HashMap();
        EnumC4971al enumC4971al = EnumC4971al.FOREGROUND;
        map.put(enumC4971al, 0);
        EnumC4971al enumC4971al2 = EnumC4971al.BACKGROUND;
        map.put(enumC4971al2, 1);
        f76560a = DesugarCollections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC4971al);
        sparseArray.put(1, enumC4971al2);
        f76561b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_INIT;
        map2.put(enumC5168ib, 1);
        EnumC5168ib enumC5168ib2 = EnumC5168ib.EVENT_TYPE_REGULAR;
        map2.put(enumC5168ib2, 4);
        EnumC5168ib enumC5168ib3 = EnumC5168ib.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC5168ib3, 5);
        EnumC5168ib enumC5168ib4 = EnumC5168ib.EVENT_TYPE_ALIVE;
        map2.put(enumC5168ib4, 7);
        EnumC5168ib enumC5168ib5 = EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC5168ib5, 26);
        EnumC5168ib enumC5168ib6 = EnumC5168ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC5168ib6, 26);
        EnumC5168ib enumC5168ib7 = EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC5168ib7, 26);
        EnumC5168ib enumC5168ib8 = EnumC5168ib.EVENT_TYPE_ANR;
        map2.put(enumC5168ib8, 25);
        EnumC5168ib enumC5168ib9 = EnumC5168ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC5168ib9, 26);
        EnumC5168ib enumC5168ib10 = EnumC5168ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC5168ib10, 26);
        EnumC5168ib enumC5168ib11 = EnumC5168ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC5168ib11, 27);
        EnumC5168ib enumC5168ib12 = EnumC5168ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC5168ib12, 27);
        EnumC5168ib enumC5168ib13 = EnumC5168ib.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC5168ib13, 13);
        EnumC5168ib enumC5168ib14 = EnumC5168ib.EVENT_TYPE_START;
        map2.put(enumC5168ib14, 2);
        EnumC5168ib enumC5168ib15 = EnumC5168ib.EVENT_TYPE_APP_OPEN;
        map2.put(enumC5168ib15, 16);
        EnumC5168ib enumC5168ib16 = EnumC5168ib.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC5168ib16, 17);
        EnumC5168ib enumC5168ib17 = EnumC5168ib.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC5168ib17, 18);
        EnumC5168ib enumC5168ib18 = EnumC5168ib.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC5168ib18, 19);
        EnumC5168ib enumC5168ib19 = EnumC5168ib.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC5168ib19, 20);
        EnumC5168ib enumC5168ib20 = EnumC5168ib.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC5168ib20, 21);
        EnumC5168ib enumC5168ib21 = EnumC5168ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC5168ib21, 40);
        EnumC5168ib enumC5168ib22 = EnumC5168ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC5168ib22, 35);
        map2.put(EnumC5168ib.EVENT_TYPE_CLEANUP, 29);
        EnumC5168ib enumC5168ib23 = EnumC5168ib.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC5168ib23, 38);
        EnumC5168ib enumC5168ib24 = EnumC5168ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC5168ib24, 42);
        f76562c = DesugarCollections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        B8 b82 = new B8();
        H8 h82 = new H8(new M8());
        C8 c82 = new C8();
        C5211k3 c5211k3 = new C5211k3(new M8());
        Rn rn = new Rn(new M8());
        Qf qf2 = new Qf();
        C4959a9 c4959a9A = C4985b9.a();
        c4959a9A.f76800b = qf2;
        c4959a9A.f76801c = qf2;
        C4985b9 c4985b9 = new C4985b9(c4959a9A);
        C4959a9 c4959a9A2 = C4985b9.a();
        c4959a9A2.f76800b = h82;
        C4985b9 c4985b92 = new C4985b9(c4959a9A2);
        C4959a9 c4959a9A3 = C4985b9.a();
        c4959a9A3.f76800b = c5211k3;
        C4985b9 c4985b93 = new C4985b9(c4959a9A3);
        C4959a9 c4959a9A4 = C4985b9.a();
        c4959a9A4.f76800b = rn;
        C4985b9 c4985b94 = new C4985b9(c4959a9A4);
        C4959a9 c4959a9A5 = C4985b9.a();
        c4959a9A5.f76799a = b82;
        C4985b9 c4985b95 = new C4985b9(c4959a9A5);
        C4959a9 c4959a9A6 = C4985b9.a();
        c4959a9A6.f76800b = new wo(new H8());
        C4985b9 c4985b96 = new C4985b9(c4959a9A6);
        map3.put(enumC5168ib2, c4985b92);
        C4959a9 c4959a9A7 = C4985b9.a();
        c4959a9A7.f76800b = new Sf();
        map3.put(enumC5168ib3, new C4985b9(c4959a9A7));
        C4959a9 c4959a9A8 = C4985b9.a();
        c4959a9A8.f76799a = b82;
        c4959a9A8.f76800b = c82;
        c4959a9A8.f76803e = new C5010c8();
        c4959a9A8.f76804f = new C5036d8();
        map3.put(enumC5168ib4, new C4985b9(c4959a9A8));
        map3.put(enumC5168ib9, c4985b9);
        map3.put(enumC5168ib10, c4985b9);
        map3.put(enumC5168ib11, c4985b93);
        map3.put(enumC5168ib12, c4985b93);
        map3.put(enumC5168ib5, c4985b93);
        map3.put(enumC5168ib6, c4985b93);
        map3.put(enumC5168ib7, c4985b93);
        map3.put(enumC5168ib8, c4985b93);
        C4959a9 c4959a9A9 = C4985b9.a();
        c4959a9A9.f76799a = new B8();
        c4959a9A9.f76800b = c5211k3;
        map3.put(enumC5168ib14, new C4985b9(c4959a9A9));
        EnumC5168ib enumC5168ib25 = EnumC5168ib.EVENT_TYPE_CUSTOM_EVENT;
        C4959a9 c4959a9A10 = C4985b9.a();
        c4959a9A10.f76802d = new Tf();
        map3.put(enumC5168ib25, new C4985b9(c4959a9A10));
        map3.put(enumC5168ib15, c4985b92);
        map3.put(enumC5168ib17, c4985b95);
        map3.put(enumC5168ib18, c4985b95);
        map3.put(enumC5168ib19, c4985b93);
        map3.put(enumC5168ib20, c4985b93);
        map3.put(enumC5168ib21, c4985b93);
        map3.put(enumC5168ib22, c4985b94);
        map3.put(enumC5168ib, c4985b96);
        map3.put(enumC5168ib16, c4985b96);
        map3.put(enumC5168ib13, c4985b92);
        map3.put(enumC5168ib23, c4985b92);
        map3.put(enumC5168ib24, c4985b93);
        f76563d = DesugarCollections.unmodifiableMap(map3);
    }

    public static C5343p9 a(Long l10, Long l11, Boolean bool) {
        C5343p9 c5343p9 = new C5343p9();
        if (l10 != null) {
            c5343p9.f77973a = l10.longValue();
            c5343p9.f77974b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l10.longValue() * 1000) / 1000;
        }
        if (l11 != null) {
            c5343p9.f77975c = l11.longValue();
        }
        if (bool != null) {
            c5343p9.f77976d = bool.booleanValue();
        }
        return c5343p9;
    }

    public static void a(C5293n9 c5293n9) {
        C5243l9[] c5243l9Arr = c5293n9.f77833c;
        if (c5243l9Arr != null) {
            for (C5243l9 c5243l9 : c5243l9Arr) {
            }
        }
    }
}
