package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f52046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f52047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f52048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f52049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f52050j;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f52054d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f52058h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f52059i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f52060j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52051a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52052b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52053c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52055e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52056f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52057g = 604800000;

        public b a(int i10, p pVar) {
            this.f52053c = i10;
            this.f52054d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f52051a = 50;
                return this;
            }
            this.f52051a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f52052b = 15000;
                return this;
            }
            this.f52052b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f52056f = 50;
                return this;
            }
            this.f52056f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f52055e = 2;
                return this;
            }
            this.f52055e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f52057g = 604800000;
                return this;
            }
            this.f52057g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f52058h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f52059i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f52060j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f52058h) && com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f52059i) && com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f52054d) || y.b(this.f52054d.b())) && com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f52041a = bVar.f52051a;
        this.f52042b = bVar.f52052b;
        this.f52043c = bVar.f52053c;
        this.f52044d = bVar.f52055e;
        this.f52045e = bVar.f52056f;
        this.f52046f = bVar.f52057g;
        this.f52047g = bVar.f52054d;
        this.f52048h = bVar.f52058h;
        this.f52049i = bVar.f52059i;
        this.f52050j = bVar.f52060j;
    }
}
