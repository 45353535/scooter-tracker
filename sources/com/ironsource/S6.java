package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final U9 f41730a;

    public S6(@NotNull U9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f41730a = globalDataWriter;
    }

    public final void a(@NotNull JSONObject metaDataJson) {
        Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.f44110i)) {
            try {
                Object objRemove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.f44110i);
                Intrinsics.checkNotNull(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.f41730a.e((String) obj);
            } catch (ClassCastException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            }
        }
    }
}
