package com.my.target;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class y7 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f61088c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f61089d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f61090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f61091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f61092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f61094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f61095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f61096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f61097l;

    public y7(String str) {
        this.f61087b = str;
    }

    public static y7 b(String str) {
        return new y7(str);
    }

    public void a(JSONObject jSONObject) {
        this.f61090e = jSONObject;
    }

    public List c() {
        return new ArrayList(this.f61088c);
    }

    public String d() {
        return this.f61094i;
    }

    public void e(String str) {
        this.f61093h = str;
    }

    public String f() {
        return this.f61093h;
    }

    public void g(String str) {
        this.f61095j = str;
    }

    public void h(String str) {
        this.f61092g = str;
    }

    public String i() {
        return this.f61087b;
    }

    public JSONObject j() {
        return this.f61090e;
    }

    public ArrayList k() {
        return this.f61089d;
    }

    public String l() {
        return this.f61092g;
    }

    public boolean m() {
        return this.f61091f;
    }

    public void a(boolean z10) {
        this.f61091f = z10;
    }

    public void c(String str) {
        this.f61094i = str;
    }

    public void d(String str) {
        this.f61096k = str;
    }

    public String e() {
        return this.f61096k;
    }

    public void f(String str) {
        this.f61097l = str;
    }

    public String g() {
        return this.f61097l;
    }

    public String h() {
        return this.f61095j;
    }

    public void a(s7 s7Var) {
        this.f61088c.add(s7Var);
    }

    @Override // com.my.target.t
    public int a() {
        return this.f61088c.size();
    }

    public String a(String str) {
        ArrayList arrayList = this.f61089d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            if (str.equals(pair.first)) {
                return (String) pair.second;
            }
        }
        return null;
    }
}
