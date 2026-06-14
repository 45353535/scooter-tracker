package yads;

import com.ironsource.N6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uo1 implements yn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t62 f116728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up1 f116729b;

    public /* synthetic */ uo1() {
        this(new u62(), new up1());
    }

    @Override // yads.yn2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final to1 a(rn2 rn2Var) {
        String strA = ((u62) this.f116728a).a(rn2Var);
        if (strA != null && strA.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                try {
                    kotlinx.serialization.json.b bVar = rc1.f115402a;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        mapCreateMapBuilder.put(next, jSONObject2.getString(next));
                    }
                    Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                    if (!mapBuild.isEmpty()) {
                        JSONArray jSONArray = jSONObject.getJSONArray(N6.E1);
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            cp1 cp1VarA = this.f116729b.a(jSONArray.getJSONObject(i10));
                            if (cp1VarA != null) {
                                arrayList.add(cp1VarA);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new to1(arrayList, mapBuild);
                        }
                    }
                } catch (JSONException e10) {
                    boolean z10 = lb1.f113032a;
                    throw new JSONException(e10.getMessage());
                }
            } catch (JSONException unused) {
                boolean z11 = lb1.f113032a;
            }
        }
        return null;
    }

    public uo1(t62 t62Var, up1 up1Var) {
        this.f116728a = t62Var;
        this.f116729b = up1Var;
    }
}
