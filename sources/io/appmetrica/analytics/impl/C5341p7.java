package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5341p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y8 f77964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E8 f77965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5157i0 f77966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O8 f77967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5415s7 f77968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final W5 f77969h;

    public C5341p7(Context context, Yk yk, int i10, Y8 y82, E8 e82, C5157i0 c5157i0, O8 o82, C5415s7 c5415s7) {
        this.f77962a = context;
        this.f77963b = i10;
        this.f77964c = y82;
        this.f77965d = e82;
        this.f77966e = c5157i0;
        this.f77967f = o82;
        this.f77968g = c5415s7;
        this.f77969h = e82.f75730a;
    }

    public static String b() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C5382qn c5382qnC = C5468ua.H.C();
        C5316o7 c5316o7 = new C5316o7(ref$ObjectRef);
        synchronized (c5382qnC) {
            c5382qnC.f78097b.a(c5316o7);
        }
        return (String) ref$ObjectRef.f93280b;
    }

    public final C5241l7 a() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        Jo jo;
        Integer numValueOf = Integer.valueOf(this.f77969h.f76618e);
        String name = this.f77969h.getName();
        String value = this.f77969h.getValue();
        Y8 y82 = this.f77964c;
        int i10 = this.f77963b;
        zo zoVar = y82.f76700a.f76740a;
        synchronized (zoVar) {
            jSONObjectOptJSONObject = zoVar.f78664a.a().optJSONObject("numbers_of_type");
        }
        long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong(String.valueOf(i10)) : 0L;
        y82.f76700a.a(i10, 1 + jOptLong);
        Long lValueOf = Long.valueOf(jOptLong);
        C5415s7 c5415s7 = this.f77968g;
        c5415s7.getClass();
        Rb rbM = C5468ua.H.m();
        Location userLocation = rbM.getUserLocation();
        if (userLocation != null) {
            int i11 = Jo.f76009b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo = new Jo(location, provider);
        } else {
            Location systemLocation = rbM.getSystemLocation();
            jo = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z10 = c5415s7.f78218a.f77983d;
        Double dValueOf = jo != null ? Double.valueOf(jo.getLatitude()) : null;
        Double dValueOf2 = jo != null ? Double.valueOf(jo.getLongitude()) : null;
        Long lValueOf2 = jo != null ? Long.valueOf(jo.getTime()) : null;
        Integer numValueOf2 = jo != null ? Integer.valueOf((int) jo.getAccuracy()) : null;
        Integer numValueOf3 = jo != null ? Integer.valueOf((int) jo.getBearing()) : null;
        Integer numValueOf4 = jo != null ? Integer.valueOf((int) jo.getSpeed()) : null;
        C5366q7 c5366q7 = new C5366q7(Boolean.valueOf(z10), dValueOf2, dValueOf, jo != null ? Integer.valueOf((int) jo.getAltitude()) : null, numValueOf3, numValueOf2, numValueOf4, lValueOf2, jo != null ? jo.getProvider() : null, jo != null ? jo.f76010a : null);
        String str = this.f77969h.f76616c;
        C5157i0 c5157i0 = this.f77966e;
        String str2 = c5157i0.f77362a;
        Long lValueOf3 = Long.valueOf(c5157i0.f77363b);
        Integer numValueOf5 = Integer.valueOf(this.f77969h.f76620g);
        Context context = this.f77962a;
        He he2 = Le.f76072a;
        Integer num = (Integer) Le.f76074c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
        num.intValue();
        String strB = b();
        N8 n82 = this.f77965d.f75731b;
        W5 w52 = this.f77969h;
        return new C5241l7(numValueOf, name, value, lValueOf, c5366q7, str, str2, lValueOf3, numValueOf5, num, strB, n82, w52.f76621h, w52.f76624k, w52.f76625l, w52.f76627n, w52.f76628o, this.f77967f.fromModel(w52.f76629p));
    }

    public /* synthetic */ C5341p7(Context context, Yk yk, int i10, Y8 y82, E8 e82, C5351ph c5351ph, C5157i0 c5157i0) {
        this(context, yk, i10, y82, e82, c5157i0, new O8(), new C5415s7(c5351ph));
    }
}
