package com.appodeal.ads.segments;

import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCaseKt;

/* JADX INFO: loaded from: classes6.dex */
public enum j {
    /* JADX INFO: Fake field, exist only in values array */
    LESS("<", new k() { // from class: com.appodeal.ads.segments.b
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.c(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    LESS_EQUALS("<=", new k() { // from class: com.appodeal.ads.segments.c
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.d(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    EQUALS("==", new k() { // from class: com.appodeal.ads.segments.d
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.a(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_EQUALS("!=", new k() { // from class: com.appodeal.ads.segments.e
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return j.a(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    MORE_EQUALS(GetAdRequestUseCaseKt.DEFAULT_COMPARATOR, new k() { // from class: com.appodeal.ads.segments.f
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.g(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    MORE(">", new k() { // from class: com.appodeal.ads.segments.g
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.f(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    IN("IN", new k() { // from class: com.appodeal.ads.segments.h
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.b(rVar, obj);
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    Modulo("%=", new k() { // from class: com.appodeal.ads.segments.i
        @Override // com.appodeal.ads.segments.k
        public final boolean a(r rVar, Object obj) {
            return l.e(rVar, obj);
        }
    });


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14482c;

    j(String str, k kVar) {
        this.f14481b = str;
        this.f14482c = kVar;
    }

    public static /* synthetic */ boolean a(r rVar, Object obj) {
        return !l.a(rVar, obj);
    }
}
