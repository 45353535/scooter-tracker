package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f48242i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f48243j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f48244k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f48245l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f48246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48248c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48249d = f48243j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f48250e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f48251f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f48252g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f48253h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f48246a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f48253h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f48246a;
    }

    public String d() {
        List<String> list = this.f48252g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f48247b;
    }

    public String f() {
        List<String> list = this.f48251f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f48249d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f48250e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f48251f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f48252g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f48247b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f48250e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f48249d = i10;
    }
}
