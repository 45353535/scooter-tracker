package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private G7 f40865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f40867f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f40868a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private G7 f40871d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40869b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f40870c = "POST";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f40872e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f40873f = new ArrayList<>();

        public a(String str) {
            this.f40868a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f40868a = str;
        }

        public a a(G7 g72) {
            this.f40871d = g72;
            return this;
        }

        public a b(boolean z10) {
            this.f40869b = z10;
            return this;
        }

        public a c() {
            this.f40870c = "POST";
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f40873f.add(pair);
            return this;
        }

        public a b() {
            this.f40870c = "GET";
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f40873f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f40872e = z10;
            return this;
        }

        public F5 a() {
            return new F5(this);
        }
    }

    F5(a aVar) {
        this.f40866e = false;
        this.f40862a = aVar.f40868a;
        this.f40863b = aVar.f40869b;
        this.f40864c = aVar.f40870c;
        this.f40865d = aVar.f40871d;
        this.f40866e = aVar.f40872e;
        if (aVar.f40873f != null) {
            this.f40867f = new ArrayList<>(aVar.f40873f);
        }
    }

    public boolean a() {
        return this.f40863b;
    }

    public String b() {
        return this.f40862a;
    }

    public G7 c() {
        return this.f40865d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f40867f);
    }

    public String e() {
        return this.f40864c;
    }

    public boolean f() {
        return this.f40866e;
    }
}
