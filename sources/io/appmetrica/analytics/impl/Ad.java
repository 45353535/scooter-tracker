package io.appmetrica.analytics.impl;

import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75522b;

    public Ad(List list, long j10) {
        this.f75521a = list;
        this.f75522b = j10;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C5170id> list = this.f75521a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (C5170id c5170id : list) {
                c5170id.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c5170id.f77430a);
                    jSONObject.put(C4240b4.i.f42648r, c5170id.f77431b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f75522b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad2 = (Ad) obj;
        return Intrinsics.areEqual(this.f75521a, ad2.f75521a) && this.f75522b == ad2.f75522b;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f75522b) + (this.f75521a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f75521a + ", lastSendTime=" + this.f75522b + ')';
    }
}
