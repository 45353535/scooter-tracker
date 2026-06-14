package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class G5 implements C0 {
    @NotNull
    public final Map<String, Object> a(@NotNull C4304f0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = adProperties.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adFormat.toString()");
        map.put(Ya.f42160f, string);
        map.put("adf", Integer.valueOf(C4456nf.c(adProperties.a())));
        String string2 = adProperties.b().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "adProperties.adId.toString()");
        map.put(Ya.f42163i, string2);
        map.put("mediationAdUnitId", adProperties.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
