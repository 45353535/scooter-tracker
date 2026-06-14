package yads;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy2 f109162a = new zy2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wl f109163b = new wl();

    public final az2 a(JSONObject jSONObject) {
        sy2 sy2Var;
        vl vlVarA;
        ArrayList arrayList;
        bz2 bz2Var = this;
        Object objOpt = jSONObject.opt("ColorWizButton");
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt("ColorWizBack");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = objOpt4 instanceof String ? (String) objOpt4 : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("smart-centers");
        if (jSONObjectOptJSONObject2 != null) {
            bz2Var.f109162a.getClass();
            sy2Var = new sy2(jSONObjectOptJSONObject2.getInt("x"), jSONObjectOptJSONObject2.getInt("y"), jSONObjectOptJSONObject2.getInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH), jSONObjectOptJSONObject2.getInt("h"));
        } else {
            sy2Var = null;
        }
        if (jSONObjectOptJSONObject != null) {
            bz2Var.f109163b.getClass();
            vlVarA = wl.a(jSONObjectOptJSONObject);
        } else {
            vlVarA = null;
        }
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeV = kotlin.ranges.g.v(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
            Iterator it = intRangeV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                zy2 zy2Var = bz2Var.f109162a;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                zy2Var.getClass();
                arrayList2.add(new sy2(jSONObjectOptJSONObject3.getInt("x"), jSONObjectOptJSONObject3.getInt("y"), jSONObjectOptJSONObject3.getInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH), jSONObjectOptJSONObject3.getInt("h")));
                bz2Var = this;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                vlVarA = vlVarA;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new az2(str, str2, str3, str4, vlVarA, sy2Var, arrayList);
    }
}
