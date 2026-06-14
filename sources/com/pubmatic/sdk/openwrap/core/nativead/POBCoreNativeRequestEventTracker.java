package com.pubmatic.sdk.openwrap.core.nativead;

import com.pubmatic.sdk.common.log.POBLog;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestEventTracker;", "", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;", "eventType", "", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventTrackingMethod;", POBCoreNativeConstants.NATIVE_METHODS, "<init>", "(Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;Ljava/util/List;)V", "getType", "()Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;", "getMethods", "()Ljava/util/List;", "a", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;", "b", "Ljava/util/List;", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public class POBCoreNativeRequestEventTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final POBNativeEventType eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List methods;

    public POBCoreNativeRequestEventTracker(@NotNull POBNativeEventType eventType, @NotNull List<? extends POBNativeEventTrackingMethod> methods) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.eventType = eventType;
        this.methods = methods;
    }

    @NotNull
    public final List<POBNativeEventTrackingMethod> getMethods() {
        return this.methods;
    }

    @NotNull
    public final JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", this.eventType.getEventTypeValue());
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.methods.iterator();
            while (it.hasNext()) {
                jSONArray.put(((POBNativeEventTrackingMethod) it.next()).getNativeEventTrackingMethodValue());
            }
            jSONObject.put(POBCoreNativeConstants.NATIVE_METHODS, jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder();
            a1 a1Var = a1.f93282a;
            String str = String.format("JSON exception encountered while creating the JSONObject of %s class.", Arrays.copyOf(new Object[]{"POBCNativeReqEventTrackr"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb2.append(str);
            sb2.append(e10.getMessage());
            POBLog.error("POBCNativeReqEventTrackr", sb2.toString(), new Object[0]);
            return jSONObject;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final POBNativeEventType getEventType() {
        return this.eventType;
    }
}
