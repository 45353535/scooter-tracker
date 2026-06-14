package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f37938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f37939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3980qb f37940c;

    public W9(JSONObject vitals, JSONArray logs, C3980qb data) {
        Intrinsics.checkNotNullParameter(vitals, "vitals");
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f37938a = vitals;
        this.f37939b = logs;
        this.f37940c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w92 = (W9) obj;
        return Intrinsics.areEqual(this.f37938a, w92.f37938a) && Intrinsics.areEqual(this.f37939b, w92.f37939b) && Intrinsics.areEqual(this.f37940c, w92.f37940c);
    }

    public final int hashCode() {
        return this.f37940c.hashCode() + ((this.f37939b.hashCode() + (this.f37938a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f37938a + ", logs=" + this.f37939b + ", data=" + this.f37940c + ")";
    }
}
