package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f10908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10909t;

    public static class a extends a.C0183a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f10910r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f10911s;

        public a(k kVar) {
            super(kVar);
            this.f10857h = ((Integer) kVar.a(x4.H2)).intValue();
            this.f10858i = ((Integer) kVar.a(x4.G2)).intValue();
            this.f10859j = ((Integer) kVar.a(x4.S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f10852c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f10859j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f10851b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f10850a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f10911s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f10865p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f10853d = map;
            return this;
        }

        public a e(String str) {
            this.f10910r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f10858i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f10863n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f10854e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f10857h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f10855f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f10856g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(u4.a aVar) {
            this.f10866q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0183a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    protected e(a aVar) {
        super(aVar);
        this.f10908s = aVar.f10910r;
        this.f10909t = aVar.f10911s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f10908s;
    }

    public boolean t() {
        return this.f10908s != null;
    }

    public boolean u() {
        return this.f10909t;
    }
}
