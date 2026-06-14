package k9;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93054a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final List a(JSONArray jsonArray) {
        f fVarB;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && (fVarB = b(jSONObjectOptJSONObject)) != null) {
                arrayList.add(fVarB);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    public final f b(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            zd.a aVarA = zd.a.f119343e.a(jsonObject.getString(POBCoreNativeConstants.NATIVE_VERSION));
            if (aVarA != null) {
                return new f(aVarA, jsonObject.getInt("scn"), jsonObject.getLong("fst"), jsonObject.getLong("lst"), jsonObject.getLong("csd"), jsonObject.getLong("lsd"));
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final JSONArray c(List versionMilestoneList) {
        Intrinsics.checkNotNullParameter(versionMilestoneList, "versionMilestoneList");
        JSONArray jSONArray = new JSONArray();
        Iterator it = versionMilestoneList.iterator();
        while (it.hasNext()) {
            jSONArray.put(d((f) it.next()));
        }
        return jSONArray;
    }

    public final JSONObject d(f versionMilestone) throws JSONException {
        Intrinsics.checkNotNullParameter(versionMilestone, "versionMilestone");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, versionMilestone.h().toString());
        jSONObject.put("scn", versionMilestone.g());
        jSONObject.put("fst", versionMilestone.d());
        jSONObject.put("lst", versionMilestone.f());
        jSONObject.put("csd", versionMilestone.c());
        jSONObject.put("lsd", versionMilestone.e());
        return jSONObject;
    }
}
