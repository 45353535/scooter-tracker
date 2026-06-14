package com.vungle.ads.fpd;

import com.taurusx.tax.f.y;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.c1;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002<;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Bo\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0002\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0083D¢\u0006\f\n\u0004\b\u0007\u0010 \u0012\u0004\b!\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\t\u0010\"\u0012\u0004\b#\u0010\u0003R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000b\u0010$\u0012\u0004\b%\u0010\u0003R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\r\u0010&\u0012\u0004\b'\u0010\u0003R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010(\u0012\u0004\b)\u0010\u0003R*\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010*\u0012\u0004\b+\u0010\u0003R\u0011\u0010.\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00104\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00107\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00108F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData;", "", "<init>", "()V", "", "seen1", "", "modelVersion", "Lcom/vungle/ads/fpd/SessionContext;", "_sessionContext", "Lcom/vungle/ads/fpd/Demographic;", "_demographic", "Lcom/vungle/ads/fpd/Location;", "_location", "Lcom/vungle/ads/fpd/Revenue;", "_revenue", "", "_customData", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/fpd/SessionContext;Lcom/vungle/ads/fpd/Demographic;Lcom/vungle/ads/fpd/Location;Lcom/vungle/ads/fpd/Revenue;Ljava/util/Map;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/fpd/FirstPartyData;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "debug", "()Ljava/lang/String;", "clearAll", "Ljava/lang/String;", "getModelVersion$annotations", "Lcom/vungle/ads/fpd/SessionContext;", "get_sessionContext$annotations", "Lcom/vungle/ads/fpd/Demographic;", "get_demographic$annotations", "Lcom/vungle/ads/fpd/Location;", "get_location$annotations", "Lcom/vungle/ads/fpd/Revenue;", "get_revenue$annotations", "Ljava/util/Map;", "get_customData$annotations", "getSessionContext", "()Lcom/vungle/ads/fpd/SessionContext;", "sessionContext", "getDemographic", "()Lcom/vungle/ads/fpd/Demographic;", "demographic", "getLocation", "()Lcom/vungle/ads/fpd/Location;", "location", "getRevenue", "()Lcom/vungle/ads/fpd/Revenue;", "revenue", "getCustomData", "()Ljava/util/Map;", "customData", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirstPartyData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final b JSON = v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.fpd.FirstPartyData$Companion$JSON$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
            invoke2(eVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull e Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.h(true);
            Json.e(false);
            Json.d(false);
        }
    }, 1, null);

    @NotNull
    private static final String MODEL_VERSION = "2.0";

    @Nullable
    private Map<String, String> _customData;

    @Nullable
    private volatile Demographic _demographic;

    @Nullable
    private volatile Location _location;

    @Nullable
    private volatile Revenue _revenue;

    @Nullable
    private volatile SessionContext _sessionContext;

    @NotNull
    private final String modelVersion;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/FirstPartyData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/b;", "JSON", "Lkotlinx/serialization/json/b;", "", "MODEL_VERSION", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FirstPartyData() {
        this.modelVersion = "2.0";
    }

    private static /* synthetic */ void getModelVersion$annotations() {
    }

    private static /* synthetic */ void get_customData$annotations() {
    }

    private static /* synthetic */ void get_demographic$annotations() {
    }

    private static /* synthetic */ void get_location$annotations() {
    }

    private static /* synthetic */ void get_revenue$annotations() {
    }

    private static /* synthetic */ void get_sessionContext$annotations() {
    }

    public static final void write$Self(@NotNull FirstPartyData self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.modelVersion, "2.0")) {
            output.q(serialDesc, 0, self.modelVersion);
        }
        if (output.r(serialDesc, 1) || self._sessionContext != null) {
            output.h(serialDesc, 1, SessionContext$$serializer.INSTANCE, self._sessionContext);
        }
        if (output.r(serialDesc, 2) || self._demographic != null) {
            output.h(serialDesc, 2, Demographic$$serializer.INSTANCE, self._demographic);
        }
        if (output.r(serialDesc, 3) || self._location != null) {
            output.h(serialDesc, 3, Location$$serializer.INSTANCE, self._location);
        }
        if (output.r(serialDesc, 4) || self._revenue != null) {
            output.h(serialDesc, 4, Revenue$$serializer.INSTANCE, self._revenue);
        }
        if (!output.r(serialDesc, 5) && self._customData == null) {
            return;
        }
        y2 y2Var = y2.f119104a;
        output.h(serialDesc, 5, new c1(y2Var, y2Var), self._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._revenue = null;
            this._location = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final String debug() {
        b bVar = JSON;
        KSerializer kSerializerB = ug.v.b(bVar.a(), v0.o(FirstPartyData.class));
        Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return bVar.b(kSerializerB, this);
    }

    @NotNull
    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    @NotNull
    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this._demographic;
        if (demographic == null) {
            demographic = new Demographic();
            this._demographic = demographic;
        }
        return demographic;
    }

    @NotNull
    public final synchronized Location getLocation() {
        Location location;
        location = this._location;
        if (location == null) {
            location = new Location();
            this._location = location;
        }
        return location;
    }

    @NotNull
    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this._revenue;
        if (revenue == null) {
            revenue = new Revenue();
            this._revenue = revenue;
        }
        return revenue;
    }

    @NotNull
    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this._sessionContext;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this._sessionContext = sessionContext;
        }
        return sessionContext;
    }

    public /* synthetic */ FirstPartyData(int i10, String str, SessionContext sessionContext, Demographic demographic, Location location, Revenue revenue, Map map, t2 t2Var) {
        this.modelVersion = (i10 & 1) == 0 ? "2.0" : str;
        if ((i10 & 2) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = sessionContext;
        }
        if ((i10 & 4) == 0) {
            this._demographic = null;
        } else {
            this._demographic = demographic;
        }
        if ((i10 & 8) == 0) {
            this._location = null;
        } else {
            this._location = location;
        }
        if ((i10 & 16) == 0) {
            this._revenue = null;
        } else {
            this._revenue = revenue;
        }
        if ((i10 & 32) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }
}
