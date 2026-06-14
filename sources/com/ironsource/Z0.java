package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class Z0 implements Parcelable {
    public static final Parcelable.Creator<Z0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f42208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f42209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f42210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<String> f42211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f42212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f42213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f42214l;

    class a implements Parcelable.Creator<Z0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Z0 createFromParcel(Parcel parcel) {
            return new Z0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Z0[] newArray(int i10) {
            return new Z0[i10];
        }
    }

    private void i() {
        this.f42206d = false;
        this.f42207e = -1;
        this.f42208f = new ArrayList<>();
        this.f42209g = new ArrayList<>();
        this.f42210h = new ArrayList<>();
        this.f42211i = new ArrayList<>();
        this.f42213k = "";
        this.f42212j = "";
        this.f42214l = new HashMap();
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f42209g.remove(str);
        } else if (this.f42209g.indexOf(str) == -1) {
            this.f42209g.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f42209g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f42211i.indexOf(str) > -1;
    }

    public String d() {
        return this.f42212j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f42214l;
    }

    public String f() {
        return this.f42213k;
    }

    public void g(String str) {
        this.f42212j = str;
    }

    public void h(String str) {
        this.f42213k = str;
    }

    public boolean j() {
        return this.f42206d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f42206d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f42207e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f42208f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f42209g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f42212j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f42213k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f42214l);
            sb2.append(", ");
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f42206d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f42207e);
            parcel.writeString(this.f42203a);
            parcel.writeString(this.f42204b);
            parcel.writeString(this.f42205c);
            parcel.writeString(this.f42212j);
            parcel.writeString(this.f42213k);
            parcel.writeString(new JSONObject(this.f42214l).toString());
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
        }
    }

    public Z0() {
        i();
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f42208f.indexOf(str) > -1;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f42210h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f42205c = str;
    }

    public String g() {
        return this.f42203a;
    }

    public String h() {
        return this.f42204b;
    }

    public void j(String str) {
        this.f42204b = str;
    }

    public String b() {
        return this.f42205c;
    }

    public int c() {
        return this.f42207e;
    }

    private Z0(Parcel parcel) {
        i();
        try {
            this.f42206d = parcel.readByte() != 0;
            this.f42207e = parcel.readInt();
            this.f42203a = parcel.readString();
            this.f42204b = parcel.readString();
            this.f42205c = parcel.readString();
            this.f42212j = parcel.readString();
            this.f42213k = parcel.readString();
            this.f42214l = a(parcel.readString());
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            i();
        }
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f42211i.indexOf(str) == -1) {
                this.f42211i.add(str);
                return;
            }
            return;
        }
        this.f42211i.remove(str);
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f42208f.indexOf(str) == -1) {
                this.f42208f.add(str);
                return;
            }
            return;
        }
        this.f42208f.remove(str);
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f42210h.indexOf(str) == -1) {
                this.f42210h.add(str);
                return;
            }
            return;
        }
        this.f42210h.remove(str);
    }

    public void a(Map<String, String> map) {
        this.f42214l = map;
    }

    public void a(boolean z10) {
        this.f42206d = z10;
    }

    public void a(int i10) {
        this.f42207e = i10;
    }

    public void a() {
        this.f42207e = -1;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
        return map;
    }

    public void i(String str) {
        this.f42203a = str;
    }
}
