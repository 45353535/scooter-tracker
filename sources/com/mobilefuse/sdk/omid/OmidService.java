package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.mobilefuse.Omid;
import com.iab.omid.library.mobilefuse.adsession.AdSession;
import com.iab.omid.library.mobilefuse.adsession.AdSessionConfiguration;
import com.iab.omid.library.mobilefuse.adsession.AdSessionContext;
import com.iab.omid.library.mobilefuse.adsession.CreativeType;
import com.iab.omid.library.mobilefuse.adsession.ImpressionType;
import com.iab.omid.library.mobilefuse.adsession.Owner;
import com.iab.omid.library.mobilefuse.adsession.Partner;
import com.iab.omid.library.mobilefuse.adsession.VerificationScriptResource;
import com.mobilefuse.sdk.AdRendererType;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.storyboard.StoryboardOmidBridge;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0!H\u0010¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010\u0003R.\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010+R.\u0010.\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010-8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010\u0003\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010)¨\u00064"}, d2 = {"Lcom/mobilefuse/sdk/omid/OmidService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/Function1;", "", "", "completeAction", "loadOmidJs", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Lcom/mobilefuse/sdk/AdRendererType;", "adRendererType", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "createOmidBridge", "(Lcom/mobilefuse/sdk/AdRendererType;)Lcom/mobilefuse/sdk/omid/OmidBridge;", "Landroid/webkit/WebView;", "webView", "customReferenceData", "Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "getHtmlAdSession", "(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "Landroid/view/View;", "rootContainerView", "", "Lcom/iab/omid/library/mobilefuse/adsession/VerificationScriptResource;", "verificationScripts", "getNativeVideoAdSession", "(Landroid/content/Context;Landroid/view/View;Ljava/util/List;Ljava/lang/String;)Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "getNativeAdSession", "ensureOmidActivated", "(Landroid/content/Context;)V", "Lkotlin/Function2;", "", "initServiceImpl$mobilefuse_sdk_core_release", "(Lkotlin/jvm/functions/Function2;)V", "initServiceImpl", "resetImpl", "<set-?>", "omidJsContent", "Ljava/lang/String;", "getOmidJsContent", "()Ljava/lang/String;", "getOmidJsContent$annotations", "Lcom/iab/omid/library/mobilefuse/adsession/Partner;", "omidPartner", "Lcom/iab/omid/library/mobilefuse/adsession/Partner;", "getOmidPartner", "()Lcom/iab/omid/library/mobilefuse/adsession/Partner;", "getOmidPartner$annotations", "CERTIFIED_OM_SDK_VERSION", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class OmidService extends MobileFuseService {
    private static final String CERTIFIED_OM_SDK_VERSION = "1.8.0";

    @NotNull
    public static final OmidService INSTANCE = new OmidService();

    @Nullable
    private static String omidJsContent;

    @Nullable
    private static Partner omidPartner;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRendererType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdRendererType.MRAID.ordinal()] = 1;
            iArr[AdRendererType.VAST.ordinal()] = 2;
            iArr[AdRendererType.STORYBOARD.ordinal()] = 3;
        }
    }

    private OmidService() {
    }

    @NotNull
    public static final OmidBridge createOmidBridge(@NotNull AdRendererType adRendererType) {
        Intrinsics.checkNotNullParameter(adRendererType, "adRendererType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[adRendererType.ordinal()];
        if (i10 == 1) {
            return new MraidOmidBridgeImpl();
        }
        if (i10 == 2) {
            return new VastOmidBridgeImpl();
        }
        if (i10 == 3) {
            return new StoryboardOmidBridge();
        }
        throw new m();
    }

    private final void ensureOmidActivated(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context.getApplicationContext());
    }

    @Nullable
    public static final AdSession getHtmlAdSession(@NotNull Context context, @NotNull WebView webView, @Nullable String customReferenceData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Partner partner = omidPartner;
            if (partner == null) {
                return null;
            }
            INSTANCE.ensureOmidActivated(context);
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Intrinsics.checkNotNullExpressionValue(adSessionConfigurationCreateAdSessionConfiguration, "AdSessionConfiguration.c…onScripts*/\n            )");
            AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, webView, null, customReferenceData);
            Intrinsics.checkNotNullExpressionValue(adSessionContextCreateHtmlAdSessionContext, "AdSessionContext.createH…ReferenceData*/\n        )");
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
            Intrinsics.checkNotNullExpressionValue(adSessionCreateAdSession, "AdSession.createAdSessio…ration, adSessionContext)");
            adSessionCreateAdSession.registerAdView(webView);
            return adSessionCreateAdSession;
        } catch (Throwable th2) {
            if (OmidService$getHtmlAdSession$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return null;
        }
    }

    @Nullable
    public static final AdSession getNativeAdSession(@NotNull Context context, @NotNull View rootContainerView, @NotNull List<VerificationScriptResource> verificationScripts, @Nullable String customReferenceData) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootContainerView, "rootContainerView");
        Intrinsics.checkNotNullParameter(verificationScripts, "verificationScripts");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Partner partner = omidPartner;
            if (partner == null || (str = omidJsContent) == null) {
                return null;
            }
            INSTANCE.ensureOmidActivated(context);
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Intrinsics.checkNotNullExpressionValue(adSessionConfigurationCreateAdSessionConfiguration, "AdSessionConfiguration.c…onScripts*/\n            )");
            AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, verificationScripts, null, customReferenceData);
            Intrinsics.checkNotNullExpressionValue(adSessionContextCreateNativeAdSessionContext, "AdSessionContext.createN…ReferenceData*/\n        )");
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
            Intrinsics.checkNotNullExpressionValue(adSessionCreateAdSession, "AdSession.createAdSessio…ration, adSessionContext)");
            adSessionCreateAdSession.registerAdView(rootContainerView);
            return adSessionCreateAdSession;
        } catch (Throwable th2) {
            if (OmidService$getNativeAdSession$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return null;
        }
    }

    @Nullable
    public static final AdSession getNativeVideoAdSession(@NotNull Context context, @NotNull View rootContainerView, @NotNull List<VerificationScriptResource> verificationScripts, @Nullable String customReferenceData) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootContainerView, "rootContainerView");
        Intrinsics.checkNotNullParameter(verificationScripts, "verificationScripts");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Partner partner = omidPartner;
            if (partner == null || (str = omidJsContent) == null) {
                return null;
            }
            INSTANCE.ensureOmidActivated(context);
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
            Intrinsics.checkNotNullExpressionValue(adSessionConfigurationCreateAdSessionConfiguration, "AdSessionConfiguration.c…onScripts*/\n            )");
            AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, verificationScripts, null, customReferenceData);
            Intrinsics.checkNotNullExpressionValue(adSessionContextCreateNativeAdSessionContext, "AdSessionContext.createN…ReferenceData*/\n        )");
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
            Intrinsics.checkNotNullExpressionValue(adSessionCreateAdSession, "AdSession.createAdSessio…ration, adSessionContext)");
            adSessionCreateAdSession.registerAdView(rootContainerView);
            return adSessionCreateAdSession;
        } catch (Throwable th2) {
            if (OmidService$getNativeVideoAdSession$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return null;
        }
    }

    @Nullable
    public static final String getOmidJsContent() {
        return omidJsContent;
    }

    public static /* synthetic */ void getOmidJsContent$annotations() {
    }

    @Nullable
    public static final Partner getOmidPartner() {
        return omidPartner;
    }

    public static /* synthetic */ void getOmidPartner$annotations() {
    }

    private final void loadOmidJs(final Context context, final Function1<? super String, Unit> completeAction) {
        final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService.loadOmidJs.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) throws IOException {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FlowCollector<? super String> receiver) throws IOException {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                InputStream inputStreamOpenRawResource = resources.openRawResource(R.raw.mobilefuse_omsdk_v1);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "res.openRawResource(R.raw.mobilefuse_omsdk_v1)");
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                int i10 = inputStreamOpenRawResource.read(bArr);
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(\"UTF-8\")");
                receiver.emit(new SuccessResult(new String(bArr, 0, i10, charsetForName)));
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$emitOn$1
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
                SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$emitOn$1.1
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
                        flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$.inlined.emitOn.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow3.emit(value);
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
        });
        final Schedulers schedulers2 = Schedulers.MAIN;
        final Flow flow3 = FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$runOn$1
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
            public final void invoke2(@NotNull final FlowCollector<? super String> flow4) {
                Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$runOn$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow4;
                        SchedulersKt.runOnScheduler(schedulers2, new Function0<Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$.inlined.runOn.1.1.1
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
        FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super String> flow4) {
                Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                flow3.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow4;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(null));
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
        }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    completeAction.invoke(((SuccessResult) result).getValue());
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

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull final Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Either errorResult;
        Context globalContext;
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            globalContext = AppLifecycleHelper.getGlobalContext();
            Omid.activate(globalContext);
        } catch (Throwable th2) {
            if (OmidService$initServiceImpl$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (!Omid.isActive()) {
            MobileFuse.logDebug("Can't activate the Omid sdk");
            completeAction.invoke(INSTANCE, Boolean.FALSE);
            return;
        }
        INSTANCE.loadOmidJs(globalContext, new Function1<String, Unit>() { // from class: com.mobilefuse.sdk.omid.OmidService$initServiceImpl$$inlined$gracefullyHandleException$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable String str) {
                if (str == null) {
                    MobileFuse.logDebug("Can't find the \"omsdk_v1.js\"");
                    completeAction.invoke(OmidService.INSTANCE, Boolean.FALSE);
                } else {
                    OmidService.omidJsContent = str;
                    OmidService.omidPartner = Partner.createPartner(MobileFuseDefaults.OMID_PARTNER_NAME, "1.8.0");
                    completeAction.invoke(OmidService.INSTANCE, Boolean.TRUE);
                }
            }
        });
        errorResult = new SuccessResult(Unit.f93236a);
        if (errorResult instanceof ErrorResult) {
            completeAction.invoke(INSTANCE, Boolean.FALSE);
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
        omidPartner = null;
        omidJsContent = null;
    }
}
