package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ConversionsKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ap\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0000¨\u0006\u000b"}, d2 = {"getEidSource", "", "Lcom/mobilefuse/sdk/identity/EidService;", "currentEidsMapFactory", "Lkotlin/Function0;", "", "lmtFactory", "", "advertisingIdFactory", "emailFactory", "phoneNumberFactory", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class GetEidSourceKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.mobilefuse.sdk.identity.GetEidSourceKt$getEidSource$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 3})
    public static final /* synthetic */ class AnonymousClass1 extends y implements Function0<Map<String, ? extends String>> {
        AnonymousClass1(EidService eidService) {
            super(0, eidService, EidService.class, "getEidsAsHttpQueryParams", "getEidsAsHttpQueryParams()Ljava/util/Map;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends String> invoke() {
            return ((EidService) this.receiver).getEidsAsHttpQueryParams();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.mobilefuse.sdk.identity.GetEidSourceKt$getEidSource$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    public static final /* synthetic */ class AnonymousClass3 extends y implements Function0<String> {
        AnonymousClass3(MobileFuseSettings mobileFuseSettings) {
            super(0, mobileFuseSettings, MobileFuseSettings.class, "getAdvertisingId", "getAdvertisingId()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return MobileFuseSettings.getAdvertisingId();
        }
    }

    @Nullable
    public static final String getEidSource(@NotNull EidService getEidSource, @NotNull Function0<? extends Map<String, String>> currentEidsMapFactory, @NotNull Function0<Boolean> lmtFactory, @NotNull Function0<String> advertisingIdFactory, @NotNull Function0<String> emailFactory, @NotNull Function0<String> phoneNumberFactory) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(getEidSource, "$this$getEidSource");
        Intrinsics.checkNotNullParameter(currentEidsMapFactory, "currentEidsMapFactory");
        Intrinsics.checkNotNullParameter(lmtFactory, "lmtFactory");
        Intrinsics.checkNotNullParameter(advertisingIdFactory, "advertisingIdFactory");
        Intrinsics.checkNotNullParameter(emailFactory, "emailFactory");
        Intrinsics.checkNotNullParameter(phoneNumberFactory, "phoneNumberFactory");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (currentEidsMapFactory.invoke().isEmpty()) {
                DebuggingKt.logDebug$default(getEidSource, "No valid extended user id, return null as an eidSource.", null, 2, null);
                return null;
            }
            boolean z10 = (lmtFactory.invoke().booleanValue() || (strInvoke = advertisingIdFactory.invoke()) == null || strInvoke.length() == 0) ? false : true;
            boolean z11 = emailFactory.invoke() != null;
            boolean z12 = phoneNumberFactory.invoke() != null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ConversionsKt.toInt(z10));
            sb2.append(ConversionsKt.toInt(z11));
            sb2.append(ConversionsKt.toInt(z12));
            return sb2.toString();
        } catch (Throwable th2) {
            if (GetEidSourceKt$getEidSource$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return null;
        }
    }

    public static /* synthetic */ String getEidSource$default(EidService eidService, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new AnonymousClass1(eidService);
        }
        if ((i10 & 2) != 0) {
            function02 = new Function0<Boolean>() { // from class: com.mobilefuse.sdk.identity.GetEidSourceKt.getEidSource.2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.valueOf(invoke2());
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2() {
                    return PrivacyCenter.isSdkLimitedToSendUserData$default(null, 1, null);
                }
            };
        }
        if ((i10 & 4) != 0) {
            function03 = new AnonymousClass3(MobileFuseSettings.INSTANCE);
        }
        if ((i10 & 8) != 0) {
            function04 = new e0(MobileFuseTargetingData.INSTANCE) { // from class: com.mobilefuse.sdk.identity.GetEidSourceKt.getEidSource.4
                @Override // kotlin.jvm.internal.e0, kotlin.reflect.KProperty0
                @Nullable
                public Object get() {
                    return ((MobileFuseTargetingData.Companion) this.receiver).getEmail();
                }

                @Override // kotlin.jvm.internal.e0, kotlin.reflect.KMutableProperty0
                public void set(@Nullable Object obj2) {
                    ((MobileFuseTargetingData.Companion) this.receiver).setEmail((String) obj2);
                }
            };
        }
        if ((i10 & 16) != 0) {
            function05 = new e0(MobileFuseTargetingData.INSTANCE) { // from class: com.mobilefuse.sdk.identity.GetEidSourceKt.getEidSource.5
                @Override // kotlin.jvm.internal.e0, kotlin.reflect.KProperty0
                @Nullable
                public Object get() {
                    return ((MobileFuseTargetingData.Companion) this.receiver).getPhoneNumber();
                }

                @Override // kotlin.jvm.internal.e0, kotlin.reflect.KMutableProperty0
                public void set(@Nullable Object obj2) {
                    ((MobileFuseTargetingData.Companion) this.receiver).setPhoneNumber((String) obj2);
                }
            };
        }
        Function0 function06 = function05;
        Function0 function07 = function03;
        return getEidSource(eidService, function0, function02, function07, function04, function06);
    }
}
