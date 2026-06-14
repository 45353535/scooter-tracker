package yads;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f115814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud1 f115815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f115816c;

    public si(Context context, dm2 dm2Var, ud1 ud1Var) {
        this.f115814a = dm2Var;
        this.f115815b = ud1Var;
        this.f115816c = context.getApplicationContext();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final gi a(JSONObject jSONObject, cn cnVar) throws mz1 {
        ti w72Var;
        if (!p22.a(jSONObject, "name", "type", "clickable", POBCoreNativeConstants.NATIVE_REQUIRED_FIELD)) {
            throw new mz1("Native Ad json has not required attributes");
        }
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || Intrinsics.areEqual(strOptString, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("name");
        if (strOptString2 == null || strOptString2.length() == 0 || Intrinsics.areEqual(strOptString2, "null")) {
            throw new mz1("Native Ad json has not required attributes");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(POBCoreNativeConstants.NATIVE_LINK);
        td1 td1VarA = jSONObjectOptJSONObject == null ? null : this.f115815b.a(jSONObjectOptJSONObject, cnVar);
        Context context = this.f115816c;
        dm2 dm2Var = this.f115814a;
        if (Intrinsics.areEqual(strOptString2, "close_button")) {
            w72Var = new rv();
        } else {
            if (!Intrinsics.areEqual(strOptString2, "feedback")) {
                switch (strOptString.hashCode()) {
                    case -1034364087:
                        if (strOptString.equals("number")) {
                            w72Var = new w72(new go2());
                        }
                        break;
                    case -951532658:
                        if (strOptString.equals("qrcode")) {
                            w72Var = new uu(new f83());
                        }
                        break;
                    case -891985903:
                        if (strOptString.equals(TypedValues.Custom.S_STRING)) {
                            w72Var = new v13();
                        }
                        break;
                    case -410956671:
                        if (strOptString.equals("container")) {
                            w72Var = new uk0();
                        }
                        break;
                    case 100313435:
                        if (strOptString.equals("image")) {
                            w72Var = new g31();
                        }
                        break;
                    case 103772132:
                        if (strOptString.equals("media")) {
                            w72Var = new bm1(new zk1(j93.a(cnVar.f109462a)), new mf3(context, dm2Var, cnVar), new w21(), new j31());
                        }
                        break;
                }
                boolean z10 = lb1.f113032a;
                throw new mz1("Native Ad json has not required attributes");
            }
            w72Var = new dt0(new g31());
        }
        return new gi(strOptString2, strOptString, w72Var.a(jSONObject), td1VarA, jSONObject.getBoolean("clickable"), jSONObject.getBoolean(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD));
    }
}
