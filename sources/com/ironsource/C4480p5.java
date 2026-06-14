package com.ironsource;

import com.ironsource.A7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4480p5 implements A7, A7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private JSONObject f44642a = new JSONObject();

    private final JSONObject i() {
        JSONObject jSONObjectOptJSONObject = this.f44642a.optJSONObject(C4497q5.f44682a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.A7.a
    public void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f44642a;
        }
        this.f44642a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC4513r5
    public long b() {
        String strOptString = i().optString(C4530s5.f44900c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lX = StringsKt.x(strOptString);
        if (lX != null) {
            return lX.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4513r5
    public boolean c() {
        return i().optBoolean(C4530s5.f44903f, true);
    }

    @Override // com.ironsource.A7
    @NotNull
    public JSONObject config() {
        return this.f44642a;
    }

    @Override // com.ironsource.InterfaceC4513r5
    public long d() {
        String strOptString = i().optString(C4530s5.f44901d);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lX = StringsKt.x(strOptString);
        if (lX != null) {
            return lX.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC4513r5
    public boolean e() {
        return i().optBoolean(C4530s5.f44904g, false);
    }

    @Override // com.ironsource.InterfaceC4513r5
    public boolean f() {
        String strOptString = i().optString(C4530s5.f44898a);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC4513r5
    public int g() {
        String strOptString = i().optString(C4530s5.f44899b);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC4513r5
    public boolean h() {
        return i().optBoolean(C4530s5.f44905h, false);
    }

    @Override // com.ironsource.InterfaceC4513r5
    public boolean a() {
        return i().optBoolean(C4530s5.f44902e, true);
    }
}
