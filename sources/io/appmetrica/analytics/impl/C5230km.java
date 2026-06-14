package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5230km implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ee f77623a = new Ee();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5269ma f77624b = new C5269ma();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lm f77625c = new Lm();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5287n3 f77626d = new C5287n3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5485v2 f77627e = new C5485v2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D6 f77628f = new D6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Hm f77629g = new Hm();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5521wd f77630h = new C5521wd();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J9 f77631i = new J9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am fromModel(@NonNull C5306nm c5306nm) {
        Am am = new Am();
        am.f75551s = c5306nm.f77863u;
        am.f75552t = c5306nm.f77864v;
        String str = c5306nm.f77843a;
        if (str != null) {
            am.f75533a = str;
        }
        List list = c5306nm.f77848f;
        if (list != null) {
            am.f75538f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c5306nm.f77849g;
        if (list2 != null) {
            am.f75539g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c5306nm.f77844b;
        if (list3 != null) {
            am.f75535c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c5306nm.f77850h;
        if (list4 != null) {
            am.f75547o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c5306nm.f77851i;
        if (map != null) {
            am.f75540h = this.f77628f.fromModel(map);
        }
        De de2 = c5306nm.f77861s;
        if (de2 != null) {
            am.f75554v = this.f77623a.fromModel(de2);
        }
        String str2 = c5306nm.f77852j;
        if (str2 != null) {
            am.f75542j = str2;
        }
        String str3 = c5306nm.f77845c;
        if (str3 != null) {
            am.f75536d = str3;
        }
        String str4 = c5306nm.f77846d;
        if (str4 != null) {
            am.f75537e = str4;
        }
        String str5 = c5306nm.f77847e;
        if (str5 != null) {
            am.f75550r = str5;
        }
        am.f75541i = this.f77624b.fromModel(c5306nm.f77855m);
        String str6 = c5306nm.f77853k;
        if (str6 != null) {
            am.f75543k = str6;
        }
        String str7 = c5306nm.f77854l;
        if (str7 != null) {
            am.f75544l = str7;
        }
        am.f75545m = c5306nm.f77858p;
        am.f75534b = c5306nm.f77856n;
        am.f75549q = c5306nm.f77857o;
        RetryPolicyConfig retryPolicyConfig = c5306nm.f77862t;
        am.f75555w = retryPolicyConfig.maxIntervalSeconds;
        am.f75556x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c5306nm.f77859q;
        if (str8 != null) {
            am.f75546n = str8;
        }
        Km km = c5306nm.f77860r;
        if (km != null) {
            this.f77625c.getClass();
            C5605zm c5605zm = new C5605zm();
            c5605zm.f78662a = km.f76038a;
            am.f75548p = c5605zm;
        }
        am.f75553u = c5306nm.f77865w;
        C5237l3 c5237l3 = c5306nm.f77866x;
        if (c5237l3 != null) {
            this.f77626d.getClass();
            C5430sm c5430sm = new C5430sm();
            c5430sm.f78247a = c5237l3.f77641a;
            am.f75557y = c5430sm;
        }
        C5460u2 c5460u2 = c5306nm.f77867y;
        if (c5460u2 != null) {
            am.f75558z = this.f77627e.fromModel(c5460u2);
        }
        am.A = this.f77629g.fromModel(c5306nm.f77868z);
        am.B = this.f77630h.fromModel(c5306nm.A);
        am.C = this.f77631i.fromModel(c5306nm.B);
        return am;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5306nm toModel(@NonNull Am am) {
        C5281mm c5281mm = new C5281mm(this.f77624b.toModel(am.f75541i));
        c5281mm.f77770a = am.f75533a;
        c5281mm.f77779j = am.f75542j;
        c5281mm.f77772c = am.f75536d;
        c5281mm.f77771b = Arrays.asList(am.f75535c);
        c5281mm.f77776g = Arrays.asList(am.f75539g);
        c5281mm.f77775f = Arrays.asList(am.f75538f);
        c5281mm.f77773d = am.f75537e;
        c5281mm.f77774e = am.f75550r;
        c5281mm.f77777h = Arrays.asList(am.f75547o);
        c5281mm.f77780k = am.f75543k;
        c5281mm.f77781l = am.f75544l;
        c5281mm.f77786q = am.f75545m;
        c5281mm.f77784o = am.f75534b;
        c5281mm.f77785p = am.f75549q;
        c5281mm.f77789t = am.f75551s;
        c5281mm.f77790u = am.f75552t;
        c5281mm.f77787r = am.f75546n;
        c5281mm.f77791v = am.f75553u;
        c5281mm.f77792w = new RetryPolicyConfig(am.f75555w, am.f75556x);
        c5281mm.f77778i = this.f77628f.toModel(am.f75540h);
        C5555xm c5555xm = am.f75554v;
        if (c5555xm != null) {
            this.f77623a.getClass();
            c5281mm.f77783n = new De(c5555xm.f78564a, c5555xm.f78565b);
        }
        C5605zm c5605zm = am.f75548p;
        if (c5605zm != null) {
            this.f77625c.getClass();
            c5281mm.f77788s = new Km(c5605zm.f78662a);
        }
        C5430sm c5430sm = am.f75557y;
        if (c5430sm != null) {
            this.f77626d.getClass();
            c5281mm.f77793x = new C5237l3(c5430sm.f78247a);
        }
        C5405rm c5405rm = am.f75558z;
        if (c5405rm != null) {
            c5281mm.f77794y = this.f77627e.toModel(c5405rm);
        }
        C5580ym c5580ym = am.A;
        if (c5580ym != null) {
            this.f77629g.getClass();
            c5281mm.f77795z = new Gm(c5580ym.f78587a);
        }
        c5281mm.A = this.f77630h.toModel(am.B);
        C5480um c5480um = am.C;
        if (c5480um != null) {
            this.f77631i.getClass();
            c5281mm.B = new I9(c5480um.f78398a);
        }
        return new C5306nm(c5281mm);
    }
}
