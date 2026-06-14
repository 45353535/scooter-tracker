package yads;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si f109936a;

    public /* synthetic */ dj(Context context, dm2 dm2Var, ud1 ud1Var, int i10) {
        this(new si(context, dm2Var, (i10 & 4) != 0 ? new ud1(context, dm2Var) : ud1Var));
    }

    public final ArrayList a(JSONObject jSONObject, cn cnVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(POBCoreNativeConstants.NATIVE_ASSETS);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            boolean z10 = jSONObject2.getBoolean(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD);
            try {
                arrayList.add(this.f109936a.a(jSONObject2, cnVar));
            } catch (Throwable th2) {
                if (z10) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public dj(si siVar) {
        this.f109936a = siVar;
    }
}
