package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import f2.g;
import h2.m;
import h2.n;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f2.e f18285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f18286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f18287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f18288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f18289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f18290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f18291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f18292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EnumMap f18293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h2.e f18294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f18295l = new ArrayList();

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

    protected VastAd(Parcel parcel) {
        this.f18286c = (m) parcel.readSerializable();
        this.f18287d = (n) parcel.readSerializable();
        this.f18288e = (ArrayList) parcel.readSerializable();
        this.f18289f = parcel.createStringArrayList();
        this.f18290g = parcel.createStringArrayList();
        this.f18291h = parcel.createStringArrayList();
        this.f18292i = parcel.createStringArrayList();
        this.f18293j = (EnumMap) parcel.readSerializable();
        this.f18294k = (h2.e) parcel.readSerializable();
        parcel.readList(this.f18295l, h2.d.class.getClassLoader());
    }

    void a(g gVar) {
        f2.e eVar = this.f18285b;
        if (eVar != null) {
            eVar.X(gVar);
        }
    }

    void b(h2.e eVar) {
        this.f18294k = eVar;
    }

    void c(ArrayList arrayList) {
        this.f18291h = arrayList;
    }

    void d(EnumMap enumMap) {
        this.f18293j = enumMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    void e(ArrayList arrayList) {
        this.f18288e = arrayList;
    }

    void f(ArrayList arrayList) {
        this.f18290g = arrayList;
    }

    void g(ArrayList arrayList) {
        this.f18289f = arrayList;
    }

    public h2.e h() {
        return this.f18294k;
    }

    public h2.g i(Context context) {
        ArrayList arrayList = this.f18288e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (h2.g gVar : this.f18288e) {
                int iF0 = gVar.f0();
                int iB0 = gVar.b0();
                if (iF0 > -1 && iB0 > -1 && ((e2.g.u(context) && iF0 == 728 && iB0 == 90) || (!e2.g.u(context) && iF0 == 320 && iB0 == 50))) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public String j() {
        if (this.f18286c.g0() != null) {
            return this.f18286c.g0().Y();
        }
        return null;
    }

    public List k() {
        return this.f18291h;
    }

    public h2.g l(int i10, int i11) {
        ArrayList arrayList = this.f18288e;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            for (h2.g gVar : this.f18288e) {
                int iF0 = gVar.f0();
                int iB0 = gVar.b0();
                if (iF0 > -1 && iB0 > -1) {
                    float fMax = Math.max(iF0, iB0) / Math.min(iF0, iB0);
                    if (Math.min(iF0, iB0) >= 250 && fMax <= 2.5d && gVar.g0()) {
                        map.put(Float.valueOf(iF0 / iB0), gVar);
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
                return (h2.g) map.get(Float.valueOf(fFloatValue));
            }
        }
        a(g.f71916m);
        return null;
    }

    public Float m() {
        return this.f18286c.d0();
    }

    public List n() {
        return this.f18290g;
    }

    public List o() {
        return this.f18289f;
    }

    public n p() {
        return this.f18287d;
    }

    public Map q() {
        return this.f18293j;
    }

    public ArrayList r() {
        return this.f18292i;
    }

    public void s(List list) {
        this.f18295l = list;
    }

    public void t(f2.e eVar) {
        this.f18285b = eVar;
    }

    public void u(ArrayList arrayList) {
        this.f18292i = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f18286c);
        parcel.writeSerializable(this.f18287d);
        parcel.writeSerializable(this.f18288e);
        parcel.writeStringList(this.f18289f);
        parcel.writeStringList(this.f18290g);
        parcel.writeStringList(this.f18291h);
        parcel.writeStringList(this.f18292i);
        parcel.writeSerializable(this.f18293j);
        parcel.writeSerializable(this.f18294k);
        parcel.writeList(this.f18295l);
    }

    VastAd(m mVar, n nVar) {
        this.f18286c = mVar;
        this.f18287d = nVar;
    }
}
