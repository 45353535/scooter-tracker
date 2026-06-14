package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4455ne;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.e;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000  2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/yandex/varioqub/appmetricaadapter/AppMetricaAdapter;", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;", "callback", "", "requestDeviceId", "(Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;)V", "requestUserId", "", C4455ne.f44465d, "setExperiments", "(Ljava/lang/String;)V", "", "", "triggeredTestIds", "setTriggeredTestIds", "(Ljava/util/Set;)V", "Lcom/yandex/varioqub/analyticadapter/data/ConfigData;", "configData", "reportConfigChanged", "(Lcom/yandex/varioqub/analyticadapter/data/ConfigData;)V", DTBMetricsConfiguration.APSMETRICS_APIKEY, "a", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", "getAdapterName", "()Ljava/lang/String;", "adapterName", InneractiveMediationDefs.GENDER_FEMALE, y.f66058y, "appmetrica-adapter_release"}, k = 1, mv = {1, 6, 0})
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f68301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f68302b = e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f68303c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f68304d = SetsKt.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String adapterName = "AppMetricaAdapter";

    public AppMetricaAdapter(Context context) {
        this.f68301a = context;
    }

    public final void a(String apiKey) {
        this.f68302b.a(this.f68301a, apiKey);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public String getAdapterName() {
        return this.adapterName;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void reportConfigChanged(ConfigData configData) {
        d dVar = this.f68302b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        dVar.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestDeviceId(AdapterIdentifiersCallback callback) {
        this.f68302b.c(this.f68301a, callback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestUserId(AdapterIdentifiersCallback callback) {
        this.f68302b.a(this.f68301a, callback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setExperiments(String experiments) {
        this.f68303c = experiments;
        Objects.toString(this.f68304d);
        d dVar = this.f68302b;
        k kVar = new k();
        kVar.f68311a = this.f68303c;
        kVar.f68312b = CollectionsKt.toLongArray(this.f68304d);
        dVar.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setTriggeredTestIds(Set triggeredTestIds) {
        Objects.toString(triggeredTestIds);
        Set set = CollectionsKt.toSet(triggeredTestIds);
        this.f68304d = set;
        Objects.toString(set);
        d dVar = this.f68302b;
        k kVar = new k();
        kVar.f68311a = this.f68303c;
        kVar.f68312b = CollectionsKt.toLongArray(this.f68304d);
        dVar.a(MessageNano.toByteArray(kVar));
    }
}
