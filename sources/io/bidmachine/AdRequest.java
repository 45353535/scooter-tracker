package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.ApiRequest;
import io.bidmachine.core.b;
import io.bidmachine.e5;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import od.d;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AdRequest<SelfType extends AdRequest, AdRequestParametersType extends AdRequestParameters, UnifiedAdRequestParamsType extends od.d> {

    @Nullable
    @VisibleForTesting
    List<AdRequestListener<SelfType>> adRequestListeners;

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @Nullable
    u adResponse;

    @NonNull
    private final s0 adResponseLoader;

    @NonNull
    @VisibleForTesting
    final Queue<String> auctionUrlQueue;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f79072id;

    @Nullable
    @VisibleForTesting
    List<e> internalAdRequestListeners;
    private final AtomicBoolean isApiRequestCanceled;
    private final AtomicBoolean isApiRequestCompleted;
    private final AtomicBoolean isDestroyed;
    private final AtomicBoolean isLoading;
    private final AtomicBoolean isRequestExpired;

    @Nullable
    private NetworkAdUnitManager networkAdUnitManager;
    private final ae.k tag = new ae.k("AdRequest");
    private final Runnable timeOutRunnable;

    @NonNull
    private final BidMachineTrackingObject trackingObject;

    @Nullable
    private UnifiedAdRequestParamsType unifiedAdRequestParams;

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class AdRequestBuilderImpl<SelfType extends zb.f, ReturnType extends AdRequest<ReturnType, AdRequestParametersType, ?>, AdRequestParametersType extends AdRequestParameters> implements zb.f {

        @NonNull
        protected AdPlacementConfig adPlacementConfig;

        @Nullable
        @VisibleForTesting
        ResponsePayload bidPayload;

        @Nullable
        @VisibleForTesting
        AdRequestListener<ReturnType> listener;

        @Nullable
        @VisibleForTesting
        List<NetworkConfig> networkConfigList;

        @Nullable
        @VisibleForTesting
        PriceFloorParams priceFloorParams;

        @Nullable
        @VisibleForTesting
        TargetingParams targetingParams;

        @Nullable
        @VisibleForTesting
        Integer timeOutMs;

        protected AdRequestBuilderImpl(@NonNull AdPlacementConfig adPlacementConfig) {
            this.adPlacementConfig = adPlacementConfig;
        }

        private void fillAdRequestParameters(@NonNull AdRequestParametersType adrequestparameterstype) {
            adrequestparameterstype.setAdPlacementConfig(this.adPlacementConfig);
            adrequestparameterstype.setPriceFloorParams(this.priceFloorParams);
            adrequestparameterstype.setTargetingParams(this.targetingParams);
            adrequestparameterstype.setNetworkConfigList(this.networkConfigList);
            adrequestparameterstype.setTimeOutMs(this.timeOutMs);
            adrequestparameterstype.setBidPayload(this.bidPayload);
        }

        @NonNull
        public ReturnType build() {
            ReturnType returntype = (ReturnType) u2.j(this.bidPayload);
            if (returntype == null) {
                returntype = (ReturnType) build(createAdRequestParameters());
            }
            fillAdRequestParameters(returntype.getAdRequestParameters());
            returntype.addListener(this.listener);
            return returntype;
        }

        @NonNull
        protected abstract ReturnType build(@NonNull AdRequestParametersType adrequestparameterstype);

        @NonNull
        protected abstract AdRequestParametersType createAdRequestParameters();

        @VisibleForTesting
        void fillNetworkConfigs(@Nullable List<NetworkConfig> list) {
            if (list == null) {
                this.networkConfigList = new ArrayList();
            } else {
                this.networkConfigList = list;
            }
        }

        @NonNull
        public SelfType setBidPayload(@Nullable String str) {
            if (str == null) {
                this.bidPayload = null;
                return this;
            }
            try {
                this.bidPayload = ResponsePayload.parseFrom(Base64.decode(str, 0));
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
            if (this.bidPayload == null) {
                this.bidPayload = ResponsePayload.getDefaultInstance();
            }
            return this;
        }

        @NonNull
        @Deprecated(since = "3.5.0")
        public SelfType setCustomParams(@Nullable CustomParams customParams) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder().withCustomParams(customParams).build();
            return this;
        }

        @NonNull
        public SelfType setListener(@Nullable AdRequestListener<ReturnType> adRequestListener) {
            this.listener = adRequestListener;
            return this;
        }

        @NonNull
        public SelfType setLoadingTimeOut(@Nullable Integer num) {
            this.timeOutMs = num;
            return this;
        }

        @NonNull
        public SelfType setNetworks(@Nullable List<NetworkConfig> list) {
            fillNetworkConfigs(list);
            return this;
        }

        @NonNull
        @Deprecated(since = "3.5.0")
        public SelfType setPlacementId(@Nullable String str) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder().withPlacementId(str).build();
            return this;
        }

        @Override // zb.f
        @NonNull
        public SelfType setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
            this.priceFloorParams = priceFloorParams;
            return this;
        }

        @NonNull
        public SelfType setTargetingParams(@Nullable TargetingParams targetingParams) {
            this.targetingParams = targetingParams;
            return this;
        }

        @NonNull
        public SelfType setNetworks(@Nullable String str) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    arrayList = new ArrayList();
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        NetworkConfig networkConfigH = v4.h(j2.e().g(), jSONArray.getJSONObject(i10));
                        if (networkConfigH != null) {
                            arrayList.add(networkConfigH);
                        }
                    }
                    arrayList2 = arrayList;
                } catch (Exception e11) {
                    e = e11;
                    arrayList2 = arrayList;
                    io.bidmachine.core.a.p(e);
                }
            }
            fillNetworkConfigs(arrayList2);
            return this;
        }

        @NonNull
        @Deprecated
        public SelfType setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
            return this;
        }
    }

    public interface AdRequestListener<AdRequestType extends AdRequest> {
        void onRequestExpired(@NonNull AdRequestType adrequesttype);

        void onRequestFailed(@NonNull AdRequestType adrequesttype, @NonNull ae.a aVar);

        void onRequestSuccess(@NonNull AdRequestType adrequesttype, @NonNull zb.c cVar);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVarK = w0.f().k(AdRequest.this.adRequestParameters);
            if (uVarK != null) {
                AdRequest.this.processApiRequestSuccess(uVarK);
            } else {
                AdRequest.this.processApiRequestFail(ae.a.f4236f, false);
                AdRequest.this.cancel();
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79074b;

        b(Context context) {
            this.f79074b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdRequest.this.cancel();
                AdRequest.this.unsubscribeTimeOut();
                AdRequest adRequest = AdRequest.this;
                u uVar = adRequest.adResponse;
                if (uVar != null) {
                    uVar.r(adRequest);
                    AdRequest.this.adResponse = null;
                }
                AdRequest.this.isApiRequestCanceled.set(false);
                AdRequest.this.isApiRequestCompleted.set(false);
                AdRequest.this.subscribeTimeOut();
                AdRequest.this.log(new ce.b() { // from class: io.bidmachine.k
                    @Override // ce.b
                    public final Object get() {
                        return LogConstants.EVENT_REQUEST_START;
                    }
                });
                AdRequest.this.trackingObject.eventStart(TrackEventType.AuctionRequest);
                ResponsePayload bidPayload = AdRequest.this.adRequestParameters.getBidPayload();
                if (bidPayload != null) {
                    AdRequest.this.processBidPayload(bidPayload);
                } else {
                    AdRequest.this.processRequestObject(this.f79074b);
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
                AdRequest.this.processRequestFail(ae.a.l("Exception loading ad request", th2));
            }
        }
    }

    class c implements e5.a {
        c() {
        }

        @Override // io.bidmachine.e5.a
        public void a(ae.a aVar) {
            AdRequest.this.processApiRequestFail(aVar);
        }

        @Override // io.bidmachine.e5.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(u uVar) {
            AdRequest.this.processApiRequestSuccess(uVar);
        }
    }

    class d implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f79077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ApiRequest.Builder f79078b;

        d(String str, ApiRequest.Builder builder) {
            this.f79077a = str;
            this.f79078b = builder;
        }

        @Override // io.bidmachine.s0.a
        public void a(ae.a aVar) {
            AdRequest.this.processApiRequestLoadedFail(this.f79078b, aVar);
        }

        @Override // io.bidmachine.s0.a
        public void b(u uVar) {
            AdRequest.this.setAuctionUrl(this.f79077a);
            AdRequest.this.processApiRequestSuccess(uVar);
        }

        @Override // io.bidmachine.s0.a
        public void onCancel() {
            AdRequest.this.processApiRequestCancel();
        }
    }

    interface e {
        void a(AdRequest adRequest);
    }

    protected AdRequest(@NonNull AdRequestParametersType adrequestparameterstype) {
        String string = UUID.randomUUID().toString();
        this.f79072id = string;
        this.isLoading = new AtomicBoolean(false);
        this.isApiRequestCanceled = new AtomicBoolean(false);
        this.isApiRequestCompleted = new AtomicBoolean(false);
        this.isRequestExpired = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.timeOutRunnable = new a();
        this.trackingObject = new BidMachineTrackingObject(string);
        this.adRequestParameters = adrequestparameterstype;
        this.adResponseLoader = new s0(string);
        this.auctionUrlQueue = new LinkedList();
    }

    public static /* synthetic */ String c() {
        return "Request expired";
    }

    private boolean canProcessApiRequestResult() {
        return (isCompleted() || isCanceled() || isDestroyed()) ? false : true;
    }

    private boolean canSendApiRequest() {
        return !isDestroyed();
    }

    public static /* synthetic */ String e() {
        return "notifyMediationWin";
    }

    public static /* synthetic */ String i() {
        return "destroy";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(@NonNull final ce.b bVar) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.d
            @Override // ce.b
            public final Object get() {
                return String.format("%s - %s", this.f80056a.adRequestParameters.getAdsType(), bVar.get());
            }
        });
    }

    private void logError(@NonNull final ce.b bVar) {
        io.bidmachine.core.a.f(this.tag, new ce.b() { // from class: io.bidmachine.h
            @Override // ce.b
            public final Object get() {
                return String.format("%s - %s", this.f80114a.adRequestParameters.getAdsType(), bVar.get());
            }
        });
    }

    @NonNull
    private NetworkAdUnitManager obtainNetworkAdUnitManager() {
        if (this.networkAdUnitManager == null) {
            this.networkAdUnitManager = new NetworkAdUnitManager();
        }
        return this.networkAdUnitManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processApiRequestCancel() {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCanceled.set(true);
            unsubscribeTimeOut();
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestCancel, getAdsType(), (nd.a) null, (ae.a) null);
            this.trackingObject.clearEvent(TrackEventType.AuctionRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRequestObject(@NonNull Context context) {
        prepareUrls();
        Object objBuild = build(context);
        if (objBuild instanceof Request) {
            processRequestBuilder(new ApiRequest.Builder().setRequestData((Request) objBuild).setDataBinder(getAdsType().getBinder()), pollUrl());
        } else {
            processRequestFail(objBuild instanceof ae.a ? (ae.a) objBuild : ae.a.i("Failed to create ad request"));
        }
    }

    private void setLoading(boolean z10) {
        this.isLoading.set(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeTimeOut() {
        int iObtainTimeOutMs = obtainTimeOutMs();
        if (iObtainTimeOutMs > 0) {
            io.bidmachine.core.h.T(this.timeOutRunnable, iObtainTimeOutMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unsubscribeTimeOut() {
        io.bidmachine.core.h.f(this.timeOutRunnable);
    }

    void addInternalListener(@Nullable e eVar) {
        if (eVar != null) {
            if (this.internalAdRequestListeners == null) {
                this.internalAdRequestListeners = new CopyOnWriteArrayList();
            }
            this.internalAdRequestListeners.add(eVar);
        }
    }

    public void addListener(@Nullable AdRequestListener<SelfType> adRequestListener) {
        if (adRequestListener != null) {
            if (this.adRequestListeners == null) {
                this.adRequestListeners = new CopyOnWriteArrayList();
            }
            this.adRequestListeners.add(adRequestListener);
        }
    }

    @Nullable
    @VisibleForTesting
    Object build(@NonNull Context context) {
        try {
            String strR = j2.e().r();
            if (TextUtils.isEmpty(strR)) {
                return ae.a.k("SellerId");
            }
            j2 j2VarE = j2.e();
            SessionManager sessionManager = SessionManager.get();
            AdvertisingDataManager.d(context);
            TargetingParams targetingParams = (TargetingParams) zb.g.resolveParams(this.adRequestParameters.getTargetingParams(), j2VarE.u());
            d6 d6VarW = j2VarE.w();
            PriceFloorParams priceFloorParams = this.adRequestParameters.getPriceFloorParams();
            Map<String, Double> priceFloors = (priceFloorParams == null || priceFloorParams.getPriceFloors().isEmpty()) ? j2VarE.n().getPriceFloors() : priceFloorParams.getPriceFloors();
            if (priceFloors.isEmpty()) {
                return ae.a.k("PriceFloors");
            }
            Request.Builder builderNewBuilder = Request.newBuilder();
            Request.Item.Builder builderNewBuilder2 = Request.Item.newBuilder();
            builderNewBuilder2.setId(UUID.randomUUID().toString());
            builderNewBuilder2.setQty(1);
            for (Map.Entry<String, Double> entry : priceFloors.entrySet()) {
                Request.Item.Deal.Builder builderNewBuilder3 = Request.Item.Deal.newBuilder();
                builderNewBuilder3.setId(entry.getKey());
                builderNewBuilder3.setFlr(entry.getValue().doubleValue());
                builderNewBuilder3.setFlrcur("USD");
                builderNewBuilder2.addDeal(builderNewBuilder3);
            }
            builderNewBuilder.setContext(Any.pack(RequestDataRetriever.collectContext(context, j2VarE, d6VarW, targetingParams, null, getAdsType())));
            builderNewBuilder.setTest(j2VarE.E());
            builderNewBuilder.addCur("USD");
            builderNewBuilder.setAt(2);
            builderNewBuilder.setTmax(10000);
            Placement.Builder builderNewBuilder4 = Placement.newBuilder();
            builderNewBuilder4.setSsai(0);
            builderNewBuilder4.setSdk(BidMachine.NAME);
            builderNewBuilder4.setSdkver("3.5.0");
            builderNewBuilder4.setSecure(!io.bidmachine.core.h.e());
            for (Message.Builder builder : collectPlacementFormats(context, null, this.adRequestParameters.getAdPlacementConfig())) {
                if (builder instanceof Placement.DisplayPlacement.Builder) {
                    Placement.DisplayPlacement.Builder builder2 = (Placement.DisplayPlacement.Builder) builder;
                    onBeforeSetDisplayPlacementBuilder(builder2);
                    builderNewBuilder4.setDisplay(builder2);
                } else {
                    if (!(builder instanceof Placement.VideoPlacement.Builder)) {
                        throw new IllegalArgumentException("Unsupported display type: " + builder);
                    }
                    Placement.VideoPlacement.Builder builder3 = (Placement.VideoPlacement.Builder) builder;
                    onBeforeSetVideoPlacementBuilder(builder3);
                    builderNewBuilder4.setVideo(builder3);
                }
            }
            Struct.Builder builderNewBuilder5 = Struct.newBuilder();
            m9.c.d(builderNewBuilder5);
            ListValue.Builder builderNewBuilder6 = ListValue.newBuilder();
            Iterator it = w0.f().j(this.adRequestParameters).iterator();
            while (it.hasNext()) {
                builderNewBuilder6.addValues(((u) it.next()).p());
            }
            if (builderNewBuilder6.getValuesCount() > 0) {
                builderNewBuilder5.putFields("bid_cache", Value.newBuilder().setListValue(builderNewBuilder6).build());
            }
            if (builderNewBuilder5.getFieldsCount() > 0) {
                builderNewBuilder4.setExt(builderNewBuilder5);
            }
            onBuildPlacement(builderNewBuilder4);
            builderNewBuilder2.setSpec(Any.pack(builderNewBuilder4.build()));
            builderNewBuilder.addItem(builderNewBuilder2.build());
            Struct.Builder builderNewBuilder7 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder7.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder7.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder7.build());
            }
            RequestExtension.Builder builderNewBuilder8 = RequestExtension.newBuilder();
            builderNewBuilder8.setSellerId(strR);
            String strJ = j2VarE.j();
            if (!TextUtils.isEmpty(strJ)) {
                builderNewBuilder8.setIfv(strJ);
            }
            builderNewBuilder8.setBmIfv(j2VarE.G(context));
            builderNewBuilder8.setSessionId(sessionManager.getSessionId());
            builderNewBuilder.addExtProto(Any.pack(builderNewBuilder8.build()));
            return builderNewBuilder.build();
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            return ae.a.l("Exception creating ad request", th2);
        }
    }

    void cancel() {
        this.adResponseLoader.a();
    }

    void clearNetworkAdUnits() {
        obtainNetworkAdUnitManager().notifyNetworkClearAuction();
    }

    @NonNull
    @VisibleForTesting
    List<NetworkConfig> collectNetworkConfig(@NonNull Context context, @NonNull AdsType adsType, @Nullable List<String> list) {
        HashMap map = new HashMap();
        List<NetworkConfig> networkConfigList = this.adRequestParameters.getNetworkConfigList();
        if (networkConfigList == null) {
            io.bidmachine.core.h.d0(map, NetworkRegistry.copyOrNullInitializedNetworkConfigs(adsType));
        } else {
            map.putAll(NetworkRegistry.createInitNetworkConfigMap());
            for (final NetworkConfig networkConfig : networkConfigList) {
                final String strCheckAndPutNetwork = NetworkRegistry.checkAndPutNetwork(context, adsType, networkConfig, map);
                if (strCheckAndPutNetwork != null) {
                    logError(new ce.b() { // from class: io.bidmachine.j
                        @Override // ce.b
                        public final Object get() {
                            return String.format("%s was removed from AdRequest: %s", networkConfig.getNetworkKey(), strCheckAndPutNetwork);
                        }
                    });
                }
            }
        }
        if (list != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!list.contains((String) ((Map.Entry) it.next()).getKey())) {
                    it.remove();
                }
            }
        }
        io.bidmachine.core.h.d0(map, NetworkRegistry.copyOrNullInitializedCoreNetworkConfigs(adsType));
        return new ArrayList(map.values());
    }

    @NonNull
    List<Message.Builder> collectPlacementFormats(@NonNull Context context, @Nullable List<String> list, @Nullable AdPlacementConfig adPlacementConfig) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        AdsType adsType = getAdsType();
        adsType.collectPlacements(new SimpleContextProvider(context), this, obtainUnifiedRequestParams(), collectNetworkConfig(context, adsType, list), arrayList, copyOnWriteArrayList, adPlacementConfig, j2.e().m());
        this.networkAdUnitManager = new NetworkAdUnitManager(copyOnWriteArrayList);
        return arrayList;
    }

    @NonNull
    protected abstract UnifiedAdRequestParamsType createUnifiedAdRequestParams(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull TargetingParams targetingParams, @NonNull zb.d dVar);

    public void destroy() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            log(new ce.b() { // from class: io.bidmachine.g
                @Override // ce.b
                public final Object get() {
                    return AdRequest.i();
                }
            });
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestDestroy, getAdsType(), this.adResponse, (ae.a) null);
            cancel();
            unsubscribeTimeOut();
            this.trackingObject.clear();
            BidMachineFetcher.release(this);
            notifyRequestDestroyed();
            this.unifiedAdRequestParams = null;
            u uVar = this.adResponse;
            if (uVar != null) {
                uVar.r(this);
                this.adResponse = null;
            }
        }
    }

    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Nullable
    u getAdResponse() {
        return this.adResponse;
    }

    @NonNull
    protected final AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    @Nullable
    public zb.c getAuctionResult() {
        u uVar = this.adResponse;
        if (uVar != null) {
            return uVar.D();
        }
        return null;
    }

    boolean isAdResponseExpired() {
        u uVar = this.adResponse;
        return uVar != null && uVar.L();
    }

    @VisibleForTesting
    boolean isBidPayloadValid(@NonNull ResponsePayload responsePayload) {
        Placement requestItemSpec = responsePayload.getRequestItemSpec();
        try {
            if (requestItemSpec != Placement.getDefaultInstance()) {
                return this.adRequestParameters.isPlacementObjectValid(requestItemSpec);
            }
            return true;
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            return false;
        }
    }

    boolean isCanceled() {
        return this.isApiRequestCanceled.get();
    }

    boolean isCompleted() {
        return this.isApiRequestCompleted.get();
    }

    public boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    public boolean isExpired() {
        return isAdResponseExpired() || this.isRequestExpired.get();
    }

    boolean isLoading() {
        return this.isLoading.get();
    }

    boolean isPlacementBuilderMatch(@NonNull w8.n nVar) {
        return true;
    }

    public void notifyMediationLoss() {
        notifyMediationLoss(null, null);
    }

    public void notifyMediationWin() {
        if (isCompleted()) {
            log(new ce.b() { // from class: io.bidmachine.b
                @Override // ce.b
                public final Object get() {
                    return AdRequest.e();
                }
            });
            this.trackingObject.eventFinish(TrackEventType.MediationWin, getAdsType(), this.adResponse, isDestroyed() ? ae.a.f4240j : isExpired() ? ae.a.f4239i : null);
        }
    }

    void notifyRequestDestroyed() {
        List<e> list = this.internalAdRequestListeners;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    @VisibleForTesting
    int obtainTimeOutMs() {
        Integer timeOutMs;
        int iP = j2.e().p();
        return (iP > 0 || (timeOutMs = this.adRequestParameters.getTimeOutMs()) == null || timeOutMs.intValue() <= 0) ? iP : timeOutMs.intValue();
    }

    @NonNull
    final UnifiedAdRequestParamsType obtainUnifiedRequestParams() {
        if (this.unifiedAdRequestParams == null) {
            j2 j2VarE = j2.e();
            this.unifiedAdRequestParams = (UnifiedAdRequestParamsType) createUnifiedAdRequestParams(this.adRequestParameters, (TargetingParams) zb.g.resolveParams(this.adRequestParameters.getTargetingParams(), j2VarE.u()), j2VarE.w());
        }
        return this.unifiedAdRequestParams;
    }

    protected void onBeforeSetDisplayPlacementBuilder(@NonNull Placement.DisplayPlacement.Builder builder) {
    }

    protected void onBeforeSetVideoPlacementBuilder(@NonNull Placement.VideoPlacement.Builder builder) {
    }

    protected void onBuildPlacement(@NonNull Placement.Builder builder) {
    }

    @VisibleForTesting
    String pollUrl() {
        if (this.auctionUrlQueue.isEmpty()) {
            this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
        }
        return this.auctionUrlQueue.poll();
    }

    @VisibleForTesting
    void prepareUrls() {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
    }

    @VisibleForTesting
    void processApiRequestFail(@Nullable ae.a aVar) {
        processApiRequestFail(aVar, true);
    }

    @VisibleForTesting
    void processApiRequestLoadedFail(@NonNull ApiRequest.Builder<Request, Response> builder, @Nullable ae.a aVar) {
        String strPoll;
        if (canProcessApiRequestResult()) {
            if (aVar == ae.a.f4249s || (strPoll = this.auctionUrlQueue.poll()) == null) {
                processApiRequestFail(aVar);
            } else {
                processRequestBuilder(builder, strPoll);
            }
        }
    }

    @VisibleForTesting
    void processApiRequestSuccess(@NonNull final u uVar) {
        if (!canProcessApiRequestResult()) {
            uVar.r(this);
            return;
        }
        setLoading(false);
        this.isApiRequestCompleted.set(true);
        unsubscribeTimeOut();
        log(new ce.b() { // from class: io.bidmachine.i
            @Override // ce.b
            public final Object get() {
                return String.format("Request success - %s", uVar);
            }
        });
        setAdResponse(uVar);
        uVar.j(this);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestSuccess(this, uVar.D());
            }
        }
        Iterator it2 = j2.e().f().iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestSuccess(this, uVar.D());
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), uVar, (ae.a) null);
    }

    protected void processBidPayload(@NonNull ResponsePayload responsePayload) {
        if (responsePayload == ResponsePayload.getDefaultInstance()) {
            processRequestFail(ae.a.h("BidPayload has invalid content"));
            return;
        }
        if (!isBidPayloadValid(responsePayload)) {
            processRequestFail(ae.a.h("BidPayload does not match with AdRequest"));
            return;
        }
        Openrtb responseCache = responsePayload.getResponseCache();
        if (responseCache != null && responseCache != Openrtb.getDefaultInstance()) {
            e5.a(this.adRequestParameters, obtainNetworkAdUnitManager(), responseCache.getResponse(), new c());
            return;
        }
        String responseCacheUrl = responsePayload.getResponseCacheUrl();
        if (TextUtils.isEmpty(responseCacheUrl) || !io.bidmachine.core.h.I(responseCacheUrl)) {
            processRequestFail(ae.a.h("BidPayload does not contain Response or URL"));
        } else {
            retrieveBody(responseCacheUrl);
        }
    }

    void processExpired() {
        log(new ce.b() { // from class: io.bidmachine.e
            @Override // ce.b
            public final Object get() {
                return AdRequest.c();
            }
        });
        this.isRequestExpired.set(true);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestExpired(this);
            }
        }
        Iterator it2 = j2.e().f().iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestExpired(this);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequestExpired, getAdsType(), this.adResponse, (ae.a) null);
    }

    @VisibleForTesting
    void processRequestBuilder(@NonNull ApiRequest.Builder<Request, Response> builder, @NonNull String str) {
        if (canSendApiRequest()) {
            builder.url(str);
            this.adResponseLoader.b(this.adRequestParameters, obtainNetworkAdUnitManager(), builder, new d(str, builder));
        }
    }

    @VisibleForTesting
    void processRequestFail(@NonNull ae.a aVar) {
        processRequestFail(aVar, true);
    }

    void removeInternalListener(@Nullable e eVar) {
        List<e> list = this.internalAdRequestListeners;
        if (list == null || eVar == null) {
            return;
        }
        list.remove(eVar);
    }

    public void removeListener(@Nullable AdRequestListener<SelfType> adRequestListener) {
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list == null || adRequestListener == null) {
            return;
        }
        list.remove(adRequestListener);
    }

    public void request(@NonNull Context context) {
        if (!j2.e().C()) {
            processRequestFail(ae.a.i("BidMachine not initialized"));
            return;
        }
        if (isDestroyed()) {
            processRequestFail(ae.a.f4240j);
            return;
        }
        ae.a aVarVerifyRequest = verifyRequest();
        if (aVarVerifyRequest != null) {
            processRequestFail(aVarVerifyRequest);
        } else {
            if (isLoading()) {
                return;
            }
            setLoading(true);
            l.a().execute(new b(context.getApplicationContext()));
        }
    }

    @VisibleForTesting
    void retrieveBody(@NonNull String str) {
        processRequestBuilder(new ApiRequest.Builder().setMethod(b.e.Get).setDataBinder(new ApiRequest.ApiResponseAuctionDataBinder()), str);
    }

    void setAdResponse(@Nullable u uVar) {
        this.adResponse = uVar;
        this.trackingObject.setAdResponse(uVar);
    }

    void setAuctionUrl(@NonNull String str) {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.add(str);
    }

    @NonNull
    public String toString() {
        return this.tag.toString();
    }

    protected ae.a verifyRequest() {
        return null;
    }

    public void notifyMediationLoss(@Nullable final String str, @Nullable final Double d10) {
        if (isCompleted()) {
            log(new ce.b() { // from class: io.bidmachine.c
                @Override // ce.b
                public final Object get() {
                    return String.format("notifyMediationLoss (winnerNetworkName - %s, winnerNetworkPrice - %s)", str, d10);
                }
            });
            this.trackingObject.eventFinish(TrackEventType.MediationLoss, getAdsType(), new nd.a().h(str).i(d10), isDestroyed() ? ae.a.f4240j : isExpired() ? ae.a.f4239i : null);
        }
    }

    @VisibleForTesting
    void processApiRequestFail(@Nullable ae.a aVar, boolean z10) {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCompleted.set(true);
            if (aVar == null) {
                aVar = ae.a.f4249s;
            }
            processRequestFail(aVar, z10);
        }
    }

    @VisibleForTesting
    void processRequestFail(@NonNull final ae.a aVar, boolean z10) {
        log(new ce.b() { // from class: io.bidmachine.f
            @Override // ce.b
            public final Object get() {
                return String.format("Request fail - %s", aVar);
            }
        });
        unsubscribeTimeOut();
        if (z10) {
            clearNetworkAdUnits();
        }
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestFailed(this, aVar);
            }
        }
        Iterator it2 = j2.e().f().iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestFailed(this, aVar);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), (nd.a) null, aVar);
    }
}
