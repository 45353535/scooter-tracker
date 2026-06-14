package io.bidmachine.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import b9.u;
import c9.g;
import c9.j;
import e9.m;
import e9.n;
import e9.w;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f80424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f80425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f80426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f80427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f80428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f80429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f80430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f80431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EnumMap f80432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e9.e f80433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f80434l = new ArrayList();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VastAd[] newArray(int i10) {
            return new VastAd[i10];
        }
    }

    VastAd(m mVar, n nVar) {
        this.f80424b = mVar;
        this.f80425c = nVar;
    }

    void a(j jVar) {
        g gVar = this.f80426d;
        if (gVar != null) {
            gVar.X(jVar);
        }
    }

    void b(e9.e eVar) {
        this.f80433k = eVar;
    }

    void c(ArrayList arrayList) {
        this.f80430h = arrayList;
    }

    void d(EnumMap enumMap) {
        this.f80432j = enumMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    void e(ArrayList arrayList) {
        this.f80427e = arrayList;
    }

    void f(ArrayList arrayList) {
        this.f80429g = arrayList;
    }

    void g(ArrayList arrayList) {
        this.f80428f = arrayList;
    }

    public List h() {
        return this.f80434l;
    }

    public e9.e i() {
        return this.f80433k;
    }

    public e9.g j(Context context) {
        ArrayList arrayList = this.f80427e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (e9.g gVar : this.f80427e) {
                int iE0 = gVar.e0();
                int iA0 = gVar.a0();
                if (iE0 > -1 && iA0 > -1 && ((u.w(context) && iE0 == 728 && iA0 == 90) || (!u.w(context) && iE0 == 320 && iA0 == 50))) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public String k() {
        w wVarF0 = this.f80424b.f0();
        if (wVarF0 != null) {
            return wVarF0.X();
        }
        return null;
    }

    public List l() {
        return this.f80430h;
    }

    public e9.g m(int i10, int i11) {
        ArrayList arrayList = this.f80427e;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            for (e9.g gVar : this.f80427e) {
                int iE0 = gVar.e0();
                int iA0 = gVar.a0();
                if (iE0 > -1 && iA0 > -1) {
                    float fMax = Math.max(iE0, iA0) / Math.min(iE0, iA0);
                    if (Math.min(iE0, iA0) >= 250 && fMax <= 2.5d && gVar.f0()) {
                        map.put(Float.valueOf(iE0 / iA0), gVar);
                    }
                }
            }
            if (!map.isEmpty()) {
                float f10 = i10 / i11;
                Set setKeySet = map.keySet();
                float fFloatValue = ((Float) setKeySet.iterator().next()).floatValue();
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    float fFloatValue2 = ((Float) it.next()).floatValue();
                    if (Math.abs(fFloatValue - f10) > Math.abs(fFloatValue2 - f10)) {
                        fFloatValue = fFloatValue2;
                    }
                }
                return (e9.g) map.get(Float.valueOf(fFloatValue));
            }
            a(j.f6612m);
        }
        return null;
    }

    public Float n() {
        return this.f80424b.c0();
    }

    public List o() {
        return this.f80429g;
    }

    public List p() {
        return this.f80428f;
    }

    public n q() {
        return this.f80425c;
    }

    public Map r() {
        return this.f80432j;
    }

    public ArrayList s() {
        return this.f80431i;
    }

    public void t(List list) {
        this.f80434l = list;
    }

    public void u(g gVar) {
        this.f80426d = gVar;
    }

    public void v(ArrayList arrayList) {
        this.f80431i = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f80424b);
        parcel.writeSerializable(this.f80425c);
        parcel.writeSerializable(this.f80427e);
        parcel.writeStringList(this.f80428f);
        parcel.writeStringList(this.f80429g);
        parcel.writeStringList(this.f80430h);
        parcel.writeStringList(this.f80431i);
        parcel.writeSerializable(this.f80432j);
        parcel.writeSerializable(this.f80433k);
        parcel.writeList(this.f80434l);
    }

    protected VastAd(Parcel parcel) {
        this.f80424b = (m) parcel.readSerializable();
        this.f80425c = (n) parcel.readSerializable();
        this.f80427e = (ArrayList) parcel.readSerializable();
        this.f80428f = parcel.createStringArrayList();
        this.f80429g = parcel.createStringArrayList();
        this.f80430h = parcel.createStringArrayList();
        this.f80431i = parcel.createStringArrayList();
        this.f80432j = (EnumMap) parcel.readSerializable();
        this.f80433k = (e9.e) parcel.readSerializable();
        parcel.readList(this.f80434l, e9.d.class.getClassLoader());
    }
}
