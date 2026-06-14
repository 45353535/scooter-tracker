package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public interface D7 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<C4649z5> f40583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Exception f40586d;

        public a(ArrayList<C4649z5> arrayList) {
            this.f40584b = false;
            this.f40585c = -1;
            this.f40583a = arrayList;
        }

        public a a(Exception exc) {
            return new a(this.f40583a, this.f40585c, this.f40584b, exc);
        }

        public ArrayList<C4649z5> b() {
            return this.f40583a;
        }

        public boolean c() {
            return this.f40584b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f40584b + ", responseCode=" + this.f40585c + ", exception=" + this.f40586d + '}';
        }

        public a a(boolean z10) {
            return new a(this.f40583a, this.f40585c, z10, this.f40586d);
        }

        public a a(int i10) {
            return new a(this.f40583a, i10, this.f40584b, this.f40586d);
        }

        public String a() {
            if (this.f40584b) {
                return "";
            }
            return "rc=" + this.f40585c + ", ex=" + this.f40586d;
        }

        a(ArrayList<C4649z5> arrayList, int i10, boolean z10, Exception exc) {
            this.f40583a = arrayList;
            this.f40584b = z10;
            this.f40586d = exc;
            this.f40585c = i10;
        }
    }

    void a(a aVar);
}
