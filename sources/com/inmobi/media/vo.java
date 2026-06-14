package com.inmobi.media;

import kotlin.Lazy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39806d;

    public vo(int i10, int i11, int i12, int i13) {
        this.f39803a = i10;
        this.f39804b = i11;
        this.f39805c = i12;
        this.f39806d = i13;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", F3.a(this.f39803a));
            jSONObject.put("top", F3.a(this.f39804b));
            jSONObject.put("right", F3.a(this.f39805c));
            jSONObject.put("bottom", F3.a(this.f39806d));
            return jSONObject;
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.f39803a == voVar.f39803a && this.f39804b == voVar.f39804b && this.f39805c == voVar.f39805c && this.f39806d == voVar.f39806d;
    }

    public final int hashCode() {
        return this.f39806d + AbstractC3712fi.a(this.f39805c, AbstractC3712fi.a(this.f39804b, this.f39803a * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.f39803a + ", top=" + this.f39804b + ", right=" + this.f39805c + ", bottom=" + this.f39806d + ")";
    }
}
