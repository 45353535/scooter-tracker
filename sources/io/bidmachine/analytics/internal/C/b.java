package io.bidmachine.analytics.internal.C;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static final a a(io.bidmachine.analytics.internal.g.b bVar) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        byte[] bytes2 = bVar.a().isEmpty() ? new byte[0] : io.bidmachine.analytics.internal.a.e.a(bVar.a()).toString().getBytes(Charsets.UTF_8);
        String strC = bVar.c();
        String strD = bVar.d();
        String strE = bVar.e();
        long jF = bVar.f();
        io.bidmachine.analytics.internal.g.e eVarB = bVar.b();
        if (eVarB == null || (jSONObjectA = e.a(eVarB)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(Charsets.UTF_8)) == null) {
            bytes = new byte[0];
        }
        return new a(strC, strD, strE, jF, bytes2, bytes);
    }

    public static final io.bidmachine.analytics.internal.g.b a(a aVar) {
        Map mapA;
        if (aVar.a().length == 0) {
            mapA = MapsKt.emptyMap();
        } else {
            mapA = io.bidmachine.analytics.internal.a.e.a(new JSONObject(new String(aVar.a(), Charsets.UTF_8)));
        }
        return new io.bidmachine.analytics.internal.g.b(aVar.c(), aVar.d(), aVar.e(), aVar.f(), mapA, aVar.b().length == 0 ? null : e.a(new JSONObject(new String(aVar.b(), Charsets.UTF_8))));
    }
}
