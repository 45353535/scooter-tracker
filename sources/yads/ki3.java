package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ki3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f112717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii3 f112718b;

    public ki3(Context context) {
        this(bw2.a(new bw2(), context, "ViewSizeInfoStorage"), new ii3());
    }

    public static String a(li3 li3Var) {
        return li3Var.a() + TokenBuilder.TOKEN_DELIMITER + li3Var.b();
    }

    public final void a(li3 li3Var, hi3 hi3Var) throws JSONException {
        String strA = a(li3Var);
        this.f112718b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", hi3Var.f111599a.f111224a);
        jSONObject2.put("height", hi3Var.f111599a.f111225b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", hi3Var.f111600b.f113046a);
        jSONObject3.put("height", hi3Var.f111600b.f113047b);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", hi3Var.f111601c.f117816a.f118183a);
        String strName = hi3Var.f111601c.f117816a.f118184b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject4.put(C4240b4.a.f42515t, lowerCase);
        jSONObject5.put("value", hi3Var.f111601c.f117817b.f118183a);
        String lowerCase2 = hi3Var.f111601c.f117817b.f118184b.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        jSONObject5.put(C4240b4.a.f42515t, lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(hi3Var.f111602d);
        jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String string = jSONObject.toString();
        SharedPreferences.Editor editorEdit = this.f112717a.edit();
        editorEdit.putString(strA, string);
        editorEdit.apply();
    }

    public ki3(SharedPreferences sharedPreferences, ii3 ii3Var) {
        this.f112717a = sharedPreferences;
        this.f112718b = ii3Var;
    }
}
