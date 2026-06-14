package com.mobilefuse.sdk.nativeads;

import com.mobilefuse.sdk.NativeAssetId;
import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingAbility;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uf.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeAdParser;", "Lcom/mobilefuse/sdk/component/AdmParser;", "()V", "getParsingAbility", "Lcom/mobilefuse/sdk/component/ParsingAbility;", "adm", "", "hasValidAssetUrl", "", "jsonObject", "Lorg/json/JSONObject;", "inferNativeAssetId", "", "(Lorg/json/JSONObject;)Ljava/lang/Integer;", "loadAssetsFromUrl", "Lorg/json/JSONArray;", "url", "parse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/component/ParsingError;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "parseADM", "Lcom/mobilefuse/sdk/nativeads/NativeAdMarkup;", "admJson", "urlAssets", "", "Lcom/mobilefuse/sdk/nativeads/NativeAsset;", "parseAssetList", "assetArray", "parseNativeAsset", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class NativeAdParser implements AdmParser {
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasValidAssetUrl(JSONObject jsonObject) {
        String string;
        return (!jsonObject.has("assetsurl") || (string = jsonObject.getString("assetsurl")) == null || StringsKt.y0(string)) ? false : true;
    }

    private final Integer inferNativeAssetId(JSONObject jsonObject) throws JSONException {
        if (jsonObject.has("id")) {
            return Integer.valueOf(jsonObject.getInt("id"));
        }
        if (jsonObject.has("title")) {
            return Integer.valueOf(NativeAssetId.AD_TITLE.getId());
        }
        if (jsonObject.has("video")) {
            return Integer.valueOf(NativeAssetId.VIDEO.getId());
        }
        if (jsonObject.has(POBCoreNativeConstants.NATIVE_IMAGE)) {
            int i10 = jsonObject.getJSONObject(POBCoreNativeConstants.NATIVE_IMAGE).getInt("type");
            if (i10 == 1) {
                return Integer.valueOf(NativeAssetId.ICON_IMAGE.getId());
            }
            if (i10 != 3) {
                return null;
            }
            return Integer.valueOf(NativeAssetId.MAIN_IMAGE.getId());
        }
        if (!jsonObject.has("data")) {
            return null;
        }
        int i11 = jsonObject.getJSONObject("data").getInt("type");
        if (i11 == 1) {
            return Integer.valueOf(NativeAssetId.SPONSORED_TEXT.getId());
        }
        if (i11 == 2) {
            return Integer.valueOf(NativeAssetId.DESCRIPTION_TEXT.getId());
        }
        if (i11 == 11) {
            return Integer.valueOf(NativeAssetId.DISPLAY_URL.getId());
        }
        if (i11 != 12) {
            return null;
        }
        return Integer.valueOf(NativeAssetId.CTA_BUTTON_TEXT.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONArray loadAssetsFromUrl(String url) {
        try {
            URL url2 = new URL(url);
            return new JSONObject(new String(r.f(url2), Charsets.UTF_8)).getJSONArray(POBCoreNativeConstants.NATIVE_ASSETS);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NativeAdMarkup parseADM(String adm, JSONObject admJson, List<? extends NativeAsset> urlAssets) {
        NativeAdMarkup nativeAdMarkup;
        List<NativeAsset> listEmptyList;
        try {
            String string = "";
            String privacy = admJson.has("privacy") ? admJson.getString("privacy") : "";
            if (admJson.has(POBCoreNativeConstants.NATIVE_LINK) && admJson.getJSONObject(POBCoreNativeConstants.NATIVE_LINK).has("url")) {
                string = admJson.getJSONObject(POBCoreNativeConstants.NATIVE_LINK).getString("url");
            }
            String link = string;
            String string2 = hasValidAssetUrl(admJson) ? admJson.getString("assetsurl") : null;
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (admJson.has(POBCoreNativeConstants.NATIVE_IMPRESSION_TRACKER)) {
                JSONArray jSONArray = admJson.getJSONArray(POBCoreNativeConstants.NATIVE_IMPRESSION_TRACKER);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    nativeAdMarkup = null;
                    try {
                        arrayList.add(jSONArray.getString(i11));
                    } catch (JSONException unused) {
                        return nativeAdMarkup;
                    }
                }
            }
            nativeAdMarkup = null;
            ArrayList arrayList2 = new ArrayList();
            if (admJson.has(POBCoreNativeConstants.NATIVE_EVENT_TRACKERS)) {
                JSONArray jSONArray2 = admJson.getJSONArray(POBCoreNativeConstants.NATIVE_EVENT_TRACKERS);
                int length2 = jSONArray2.length();
                while (i10 < length2) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i10);
                    JSONArray jSONArray3 = jSONArray2;
                    int i12 = length2;
                    NativeEventTrackerType nativeEventTrackerTypeFromInt = NativeEventTrackerType.INSTANCE.fromInt(jSONObject.getInt("event"));
                    int i13 = jSONObject.getInt("method");
                    String string3 = jSONObject.getString("url");
                    Intrinsics.checkNotNullExpressionValue(string3, "eventItem.getString(\"url\")");
                    arrayList2.add(new NativeEventTracker(nativeEventTrackerTypeFromInt, i13, string3));
                    i10++;
                    jSONArray2 = jSONArray3;
                    length2 = i12;
                }
            }
            if (admJson.has(POBCoreNativeConstants.NATIVE_ASSETS)) {
                JSONArray jSONArray4 = admJson.getJSONArray(POBCoreNativeConstants.NATIVE_ASSETS);
                Intrinsics.checkNotNullExpressionValue(jSONArray4, "admJson.getJSONArray(\"assets\")");
                listEmptyList = parseAssetList(jSONArray4);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            List listPlus = CollectionsKt.plus((Collection) urlAssets, (Iterable) listEmptyList);
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listPlus) {
                if (hashSet.add(Integer.valueOf(((NativeAsset) obj).getId()))) {
                    arrayList3.add(obj);
                }
            }
            Intrinsics.checkNotNullExpressionValue(link, "link");
            Intrinsics.checkNotNullExpressionValue(privacy, "privacy");
            return new NativeAdMarkup(adm, string2, arrayList3, arrayList, link, privacy, arrayList2);
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<NativeAsset> parseAssetList(JSONArray assetArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = assetArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = assetArray.getJSONObject(i10);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "assetArray.getJSONObject(i)");
            NativeAsset nativeAsset = parseNativeAsset(jSONObject);
            if (nativeAsset != null) {
                arrayList.add(nativeAsset);
            }
        }
        return arrayList;
    }

    private final NativeAsset parseNativeAsset(JSONObject jsonObject) throws JSONException {
        Integer numInferNativeAssetId = inferNativeAssetId(jsonObject);
        if (numInferNativeAssetId == null) {
            return null;
        }
        int iIntValue = numInferNativeAssetId.intValue();
        if (jsonObject.has("title")) {
            String string = jsonObject.getJSONObject("title").getString("text");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getJSONObject…title\").getString(\"text\")");
            return new NativeTextAsset(iIntValue, string);
        }
        if (jsonObject.has("data")) {
            String string2 = jsonObject.getJSONObject("data").getString("value");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getJSONObject…data\").getString(\"value\")");
            return new NativeTextAsset(iIntValue, string2);
        }
        if (jsonObject.has(POBCoreNativeConstants.NATIVE_IMAGE)) {
            Integer numValueOf = Integer.valueOf(jsonObject.getJSONObject(POBCoreNativeConstants.NATIVE_IMAGE).getInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH));
            Integer numValueOf2 = Integer.valueOf(jsonObject.getJSONObject(POBCoreNativeConstants.NATIVE_IMAGE).getInt("h"));
            String string3 = jsonObject.getJSONObject(POBCoreNativeConstants.NATIVE_IMAGE).getString("url");
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getJSONObject(\"img\").getString(\"url\")");
            return new NativeImgAsset(iIntValue, numValueOf, numValueOf2, string3);
        }
        if (!jsonObject.has("video")) {
            return null;
        }
        String string4 = jsonObject.getJSONObject("video").getString("vasttag");
        Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getJSONObject…eo\").getString(\"vasttag\")");
        return new NativeVideoAsset(iIntValue, string4);
    }

    @Override // com.mobilefuse.sdk.component.AdmParser
    @NotNull
    public ParsingAbility getParsingAbility(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return ParsingAbility.MUST_PARSE;
    }

    @Override // com.mobilefuse.sdk.component.AdmParser
    @NotNull
    public Flow<Either<ParsingError, ParsedAdMarkup>> parse(@NotNull final String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser.parse.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FlowCollector<? super String> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                receiver.emitSuccess(adm);
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$runOn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super String> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$runOn$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow3;
                        SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$.inlined.runOn.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                flowCollector.emit(value);
                            }
                        });
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t10) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t10);
                    }
                });
            }
        });
        final Flow flow3 = FlowKt.flow(new Function1<FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>>, Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>> flow4) {
                Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$map$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Object successResult;
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow4.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow4;
                        try {
                            JSONObject jSONObject = new JSONObject(adm);
                            if (this.hasValidAssetUrl(jSONObject)) {
                                String assetsUrl = jSONObject.getString("assetsurl");
                                NativeAdParser nativeAdParser = this;
                                Intrinsics.checkNotNullExpressionValue(assetsUrl, "assetsUrl");
                                JSONArray jSONArrayLoadAssetsFromUrl = nativeAdParser.loadAssetsFromUrl(assetsUrl);
                                if (jSONArrayLoadAssetsFromUrl != null) {
                                    List assetList = this.parseAssetList(jSONArrayLoadAssetsFromUrl);
                                    NativeAdParser$parse$$inlined$map$1 nativeAdParser$parse$$inlined$map$1 = NativeAdParser$parse$$inlined$map$1.this;
                                    NativeAdMarkup adm2 = this.parseADM(adm, jSONObject, assetList);
                                    successResult = adm2 != null ? new SuccessResult(adm2) : new ErrorResult(ParsingError.INVALID_MARKUP);
                                } else {
                                    successResult = new ErrorResult(ParsingError.INVALID_MARKUP);
                                }
                            } else {
                                NativeAdParser$parse$$inlined$map$1 nativeAdParser$parse$$inlined$map$12 = NativeAdParser$parse$$inlined$map$1.this;
                                NativeAdMarkup adm3 = this.parseADM(adm, jSONObject, CollectionsKt.emptyList());
                                successResult = adm3 != null ? new SuccessResult(adm3) : new ErrorResult(ParsingError.INVALID_MARKUP);
                            }
                            flowCollector.emit(new SuccessResult(successResult));
                        } catch (Throwable th2) {
                            flowCollector.emit(new ErrorResult(th2));
                        }
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t10) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t10);
                    }
                });
            }
        });
        final Flow flow4 = FlowKt.flow(new Function1<FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>>, Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>> flow5) {
                Intrinsics.checkNotNullParameter(flow5, "$this$flow");
                flow3.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow5;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(new ErrorResult(ParsingError.INVALID_MARKUP)));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
                        }
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t10) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t10);
                    }
                });
            }
        });
        final Schedulers schedulers2 = Schedulers.MAIN;
        return FlowKt.flow(new Function1<FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>>, Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$runOn$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super Either<? extends ParsingError, ? extends NativeAdMarkup>> flow5) {
                Intrinsics.checkNotNullParameter(flow5, "$this$flow");
                flow4.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$$inlined$runOn$2.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow5;
                        SchedulersKt.runOnScheduler(schedulers2, new Function0<Unit>() { // from class: com.mobilefuse.sdk.nativeads.NativeAdParser$parse$.inlined.runOn.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                flowCollector.emit(value);
                            }
                        });
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t10) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t10);
                    }
                });
            }
        });
    }
}
