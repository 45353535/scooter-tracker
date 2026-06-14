package com.mobilefuse.sdk;

import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.identity.DeviceIpService;
import com.mobilefuse.sdk.identity.EidDataUpdateListener;
import com.mobilefuse.sdk.identity.EidServiceKt;
import com.mobilefuse.sdk.identity.IdentifierUpdateSignal;
import com.mobilefuse.sdk.identity.api.ExtendedUidListener;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.service.ServiceInitState;
import com.mobilefuse.sdk.service.impl.AdvertisingIdService;
import com.mobilefuse.sdk.service.impl.ifv.AppSetIdService;
import com.mobilefuse.sdk.user.Gender;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseTargetingData;", "", "()V", com.taurusx.tax.f.y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFuseTargetingData {

    @NotNull
    public static final String LEGACY_VENDOR_FABRICK = "neustar.biz";

    @NotNull
    public static final String LEGACY_VENDOR_LIVERAMP = "liveramp.com";
    private static boolean allowLocation;
    private static final Lazy currentYear$delegate;
    private static final EidDataUpdateListener eidDataUpdateListener;

    @Nullable
    private static String email;

    @Nullable
    private static EidDataUpdateListener extendedUserIdUpdateListener;

    @NotNull
    private static Gender gender;

    @Nullable
    private static String phoneNumber;

    @Nullable
    private static ExtendedUidListener userIdListener;
    private static int yearOfBirth;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy requiredServices$delegate = lf.i.a(new Function0<Set<? extends MobileFuseService>>() { // from class: com.mobilefuse.sdk.MobileFuseTargetingData$Companion$requiredServices$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends MobileFuseService> invoke() {
            return SetsKt.setOf((Object[]) new MobileFuseService[]{AdvertisingIdService.INSTANCE, EidServiceKt.getEidService(), AppSetIdService.INSTANCE, DeviceIpService.INSTANCE});
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010H\u001a\u00020IH\u0007J\u0012\u0010J\u001a\u0004\u0018\u00010\u00042\u0006\u0010K\u001a\u00020\u0004H\u0007J\n\u0010L\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010M\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010N\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020OH\u0007J\u0010\u0010N\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0004H\u0007J\r\u0010P\u001a\u00020IH\u0001¢\u0006\u0002\bQJ\u001a\u0010R\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010S\u001a\u00020I2\u0006\u0010T\u001a\u00020\u0004H\u0007J\u0010\u0010U\u001a\u00020I2\u0006\u0010V\u001a\u00020\u0004H\u0007J\u0018\u0010W\u001a\u00020I2\u0006\u0010K\u001a\u00020O2\u0006\u0010X\u001a\u00020\u000eH\u0007J\u0018\u0010W\u001a\u00020I2\u0006\u0010K\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R<\u0010&\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`%2\u000e\u0010\u0006\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`%8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R,\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020,8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u00100\"\u0004\b1\u00102R0\u00103\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R!\u00107\u001a\b\u0012\u0004\u0012\u000209088@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0018\u001a\u0004\b:\u0010;R0\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u0006\u001a\u0004\u0018\u00010=8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR,\u0010D\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\r¨\u0006Y"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseTargetingData$Companion;", "", "()V", "LEGACY_VENDOR_FABRICK", "", "LEGACY_VENDOR_LIVERAMP", "value", "", "age", "getAge$annotations", "getAge", "()I", "setAge", "(I)V", "", "allowLocation", "getAllowLocation$annotations", "getAllowLocation", "()Z", "setAllowLocation", "(Z)V", "currentYear", "getCurrentYear", "currentYear$delegate", "Lkotlin/Lazy;", "eidDataUpdateListener", "Lcom/mobilefuse/sdk/identity/EidDataUpdateListener;", "email", "getEmail$annotations", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "extendedUserIdServiceEnabled", "getExtendedUserIdServiceEnabled$annotations", "getExtendedUserIdServiceEnabled", "setExtendedUserIdServiceEnabled", "Lcom/mobilefuse/sdk/ExtendedUserIdUpdateListener;", "extendedUserIdUpdateListener", "getExtendedUserIdUpdateListener$annotations", "getExtendedUserIdUpdateListener", "()Lcom/mobilefuse/sdk/identity/EidDataUpdateListener;", "setExtendedUserIdUpdateListener", "(Lcom/mobilefuse/sdk/identity/EidDataUpdateListener;)V", "Lcom/mobilefuse/sdk/user/Gender;", "gender", "getGender$annotations", "getGender", "()Lcom/mobilefuse/sdk/user/Gender;", "setGender", "(Lcom/mobilefuse/sdk/user/Gender;)V", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber$annotations", "getPhoneNumber", "setPhoneNumber", "requiredServices", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "getRequiredServices$mobilefuse_sdk_core_release", "()Ljava/util/Set;", "requiredServices$delegate", "Lcom/mobilefuse/sdk/identity/api/ExtendedUidListener;", "userIdListener", "getUserIdListener$annotations", "getUserIdListener", "()Lcom/mobilefuse/sdk/identity/api/ExtendedUidListener;", "setUserIdListener", "(Lcom/mobilefuse/sdk/identity/api/ExtendedUidListener;)V", "yearOfBirth", "getYearOfBirth$annotations", "getYearOfBirth", "setYearOfBirth", "clearAll", "", "getExtendedUserId", "partner", "getFabrickIdentifier", "getLiveRampEnvelope", "isVendorEnabled", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "requireMobileFuseServices", "requireMobileFuseServices$mobilefuse_sdk_core_release", "setExtendedUserId", "setFabrickIdentifier", "identifier", "setLiveRampEnvelope", "envelope", "setVendorEnabled", "enabled", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getAge$annotations() {
        }

        public static /* synthetic */ void getAllowLocation$annotations() {
        }

        private final int getCurrentYear() {
            return ((Number) MobileFuseTargetingData.currentYear$delegate.getValue()).intValue();
        }

        public static /* synthetic */ void getEmail$annotations() {
        }

        public static /* synthetic */ void getExtendedUserIdServiceEnabled$annotations() {
        }

        public static /* synthetic */ void getExtendedUserIdUpdateListener$annotations() {
        }

        public static /* synthetic */ void getGender$annotations() {
        }

        public static /* synthetic */ void getPhoneNumber$annotations() {
        }

        public static /* synthetic */ void getUserIdListener$annotations() {
        }

        public static /* synthetic */ void getYearOfBirth$annotations() {
        }

        public final void clearAll() {
            setPhoneNumber(null);
            setYearOfBirth(0);
            setGender(Gender.UNKNOWN);
            setExtendedUserIdUpdateListener(null);
            setExtendedUserIdUpdateListener(null);
        }

        public final int getAge() {
            Companion companion = MobileFuseTargetingData.INSTANCE;
            if (companion.getYearOfBirth() > 0) {
                return companion.getCurrentYear() - companion.getYearOfBirth();
            }
            return 0;
        }

        public final boolean getAllowLocation() {
            return MobileFuseTargetingData.allowLocation;
        }

        @Nullable
        public final String getEmail() {
            return MobileFuseTargetingData.email;
        }

        @Nullable
        public final String getExtendedUserId(@NotNull String partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            requireMobileFuseServices$mobilefuse_sdk_core_release();
            return EidServiceKt.getEidService().getEid(partner);
        }

        public final boolean getExtendedUserIdServiceEnabled() {
            return EidServiceKt.getEidService().getManagedModeEnabled();
        }

        @Nullable
        public final EidDataUpdateListener getExtendedUserIdUpdateListener() {
            return MobileFuseTargetingData.extendedUserIdUpdateListener;
        }

        @Nullable
        public final String getFabrickIdentifier() {
            return getExtendedUserId(MobileFuseTargetingData.LEGACY_VENDOR_FABRICK);
        }

        @NotNull
        public final Gender getGender() {
            return MobileFuseTargetingData.gender;
        }

        @Nullable
        public final String getLiveRampEnvelope() {
            return getExtendedUserId(MobileFuseTargetingData.LEGACY_VENDOR_LIVERAMP);
        }

        @Nullable
        public final String getPhoneNumber() {
            return MobileFuseTargetingData.phoneNumber;
        }

        @NotNull
        public final Set<MobileFuseService> getRequiredServices$mobilefuse_sdk_core_release() {
            return (Set) MobileFuseTargetingData.requiredServices$delegate.getValue();
        }

        @Nullable
        public final ExtendedUidListener getUserIdListener() {
            return MobileFuseTargetingData.userIdListener;
        }

        public final int getYearOfBirth() {
            return MobileFuseTargetingData.yearOfBirth;
        }

        public final boolean isVendorEnabled(@NotNull Partner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return isVendorEnabled(partner.getVendorName());
        }

        @VisibleForTesting
        public final void requireMobileFuseServices$mobilefuse_sdk_core_release() {
            MobileFuseServices.requireServices(getRequiredServices$mobilefuse_sdk_core_release(), new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseTargetingData$Companion$requireMobileFuseServices$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            });
        }

        public final void setAge(int i10) {
            Companion companion = MobileFuseTargetingData.INSTANCE;
            companion.setYearOfBirth(companion.getCurrentYear() - i10);
        }

        public final void setAllowLocation(boolean z10) {
            MobileFuseTargetingData.allowLocation = z10;
            LocationService.setEnabled(z10);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void setEmail(@org.jetbrains.annotations.Nullable java.lang.String r4) {
            /*
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L1c
                java.lang.String r4 = r4.toLowerCase()
                java.lang.String r1 = "this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                if (r4 == 0) goto L1c
                kotlin.text.Regex r1 = new kotlin.text.Regex
                java.lang.String r2 = "\\s"
                r1.<init>(r2)
                java.lang.String r2 = ""
                java.lang.String r4 = r1.replace(r4, r2)
                goto L1d
            L1c:
                r4 = r0
            L1d:
                if (r4 == 0) goto L27
                int r1 = r4.length()
                if (r1 != 0) goto L26
                goto L27
            L26:
                r0 = r4
            L27:
                com.mobilefuse.sdk.MobileFuseTargetingData.access$setEmail$cp(r0)
                com.mobilefuse.sdk.MobileFuseTargetingData$Companion r4 = com.mobilefuse.sdk.MobileFuseTargetingData.INSTANCE
                r4.requireMobileFuseServices$mobilefuse_sdk_core_release()
                com.mobilefuse.sdk.identity.EidService r4 = com.mobilefuse.sdk.identity.EidServiceKt.getEidService()
                com.mobilefuse.sdk.identity.IdentifierUpdateSignal r0 = com.mobilefuse.sdk.identity.IdentifierUpdateSignal.EMAIL_CHANGED
                r4.handleSdkStateChanged(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.MobileFuseTargetingData.Companion.setEmail(java.lang.String):void");
        }

        public final void setExtendedUserId(@NotNull String partner, @Nullable String value) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            requireMobileFuseServices$mobilefuse_sdk_core_release();
            EidServiceKt.getEidService().overrideEid(partner, value);
        }

        public final void setExtendedUserIdServiceEnabled(boolean z10) {
            EidServiceKt.getEidService().setManagedModeEnabled(z10);
        }

        public final void setExtendedUserIdUpdateListener(@Nullable EidDataUpdateListener eidDataUpdateListener) {
            EidDataUpdateListener eidDataUpdateListener2 = MobileFuseTargetingData.extendedUserIdUpdateListener;
            if (eidDataUpdateListener2 != null) {
                EidServiceKt.getEidService().removeEidDataUpdateListener(eidDataUpdateListener2);
            }
            MobileFuseTargetingData.extendedUserIdUpdateListener = eidDataUpdateListener;
            if (eidDataUpdateListener != null) {
                EidServiceKt.getEidService().addEidDataUpdateListener(eidDataUpdateListener);
            }
        }

        public final void setFabrickIdentifier(@NotNull String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            setExtendedUserId(MobileFuseTargetingData.LEGACY_VENDOR_FABRICK, identifier);
        }

        public final void setGender(@NotNull Gender value) {
            Intrinsics.checkNotNullParameter(value, "value");
            MobileFuseTargetingData.gender = value;
            MobileFuseTargetingData.INSTANCE.requireMobileFuseServices$mobilefuse_sdk_core_release();
            EidServiceKt.getEidService().handleSdkStateChanged(IdentifierUpdateSignal.GENDER_CHANGED);
        }

        public final void setLiveRampEnvelope(@NotNull String envelope) {
            Intrinsics.checkNotNullParameter(envelope, "envelope");
            setExtendedUserId(MobileFuseTargetingData.LEGACY_VENDOR_LIVERAMP, envelope);
        }

        public final void setPhoneNumber(@Nullable String str) {
            String str2 = null;
            String strReplace = str != null ? new Regex("[^0-9+]|(\\+1)").replace(str, "") : null;
            if (strReplace != null && strReplace.length() != 0) {
                str2 = strReplace;
            }
            MobileFuseTargetingData.phoneNumber = str2;
            MobileFuseTargetingData.INSTANCE.requireMobileFuseServices$mobilefuse_sdk_core_release();
            EidServiceKt.getEidService().handleSdkStateChanged(IdentifierUpdateSignal.PHONE_NUMBER_CHANGED);
        }

        public final void setUserIdListener(@Nullable ExtendedUidListener extendedUidListener) {
            MobileFuseTargetingData.userIdListener = extendedUidListener;
            if (extendedUidListener != null) {
                EidServiceKt.getEidService().addEidDataUpdateListener(MobileFuseTargetingData.eidDataUpdateListener);
            } else {
                EidServiceKt.getEidService().removeEidDataUpdateListener(MobileFuseTargetingData.eidDataUpdateListener);
            }
        }

        public final void setVendorEnabled(@NotNull Partner partner, boolean enabled) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            setVendorEnabled(partner.getVendorName(), enabled);
        }

        public final void setYearOfBirth(int i10) {
            MobileFuseTargetingData.yearOfBirth = i10;
            MobileFuseTargetingData.INSTANCE.requireMobileFuseServices$mobilefuse_sdk_core_release();
            EidServiceKt.getEidService().handleSdkStateChanged(IdentifierUpdateSignal.YEAR_OF_BIRTH_CHANGED);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isVendorEnabled(@NotNull String partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return PrivacyCenter.INSTANCE.isVendorEnabled(partner);
        }

        public final void setVendorEnabled(@NotNull String partner, boolean enabled) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                PrivacyCenter.INSTANCE.setVendorEnabled(partner, enabled);
                if (EidServiceKt.getEidService().getState() == ServiceInitState.INITIALIZED) {
                    EidServiceKt.getEidService().handleSdkStateChanged(IdentifierUpdateSignal.VENDOR_ENABLEMENT_CHANGED);
                }
            } catch (Throwable th2) {
                int i10 = MobileFuseTargetingData$Companion$setVendorEnabled$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i10 == 1) {
                    StabilityHelper.logException("[Automatically caught]", th2);
                } else if (i10 != 2) {
                    throw new lf.m();
                }
            }
        }
    }

    static {
        SdkInitializer.ensureSdkSetup(true);
        eidDataUpdateListener = new EidDataUpdateListener() { // from class: com.mobilefuse.sdk.MobileFuseTargetingData$Companion$eidDataUpdateListener$1
            /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
            @Override // com.mobilefuse.sdk.identity.EidDataUpdateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onEidUpdate(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, boolean r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "partner"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    int r0 = r3.hashCode()
                    r1 = 1826758421(0x6ce21f15, float:2.1869121E27)
                    if (r0 == r1) goto L1f
                    r1 = 2002543249(0x775c6291, float:4.4699393E33)
                    if (r0 == r1) goto L14
                    goto L2a
                L14:
                    java.lang.String r0 = "liveramp.com"
                    boolean r3 = r3.equals(r0)
                    if (r3 == 0) goto L2a
                    com.mobilefuse.sdk.identity.api.ExtendedUidProvider r3 = com.mobilefuse.sdk.identity.api.ExtendedUidProvider.LIVERAMP
                    goto L2b
                L1f:
                    java.lang.String r0 = "neustar.biz"
                    boolean r3 = r3.equals(r0)
                    if (r3 == 0) goto L2a
                    com.mobilefuse.sdk.identity.api.ExtendedUidProvider r3 = com.mobilefuse.sdk.identity.api.ExtendedUidProvider.FABRICK
                    goto L2b
                L2a:
                    r3 = 0
                L2b:
                    if (r3 != 0) goto L2e
                    goto L39
                L2e:
                    com.mobilefuse.sdk.MobileFuseTargetingData$Companion r0 = com.mobilefuse.sdk.MobileFuseTargetingData.INSTANCE
                    com.mobilefuse.sdk.identity.api.ExtendedUidListener r0 = r0.getUserIdListener()
                    if (r0 == 0) goto L39
                    r0.onChanged(r4, r3, r5)
                L39:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.MobileFuseTargetingData$Companion$eidDataUpdateListener$1.onEidUpdate(java.lang.String, java.lang.String, boolean):void");
            }
        };
        currentYear$delegate = lf.i.a(new Function0<Integer>() { // from class: com.mobilefuse.sdk.MobileFuseTargetingData$Companion$currentYear$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return Utils.getCurrentYear();
            }
        });
        gender = Gender.UNKNOWN;
        allowLocation = true;
    }

    private MobileFuseTargetingData() {
    }

    public static final void clearAll() {
        INSTANCE.clearAll();
    }

    public static final int getAge() {
        return INSTANCE.getAge();
    }

    public static final boolean getAllowLocation() {
        return allowLocation;
    }

    @Nullable
    public static final String getEmail() {
        return email;
    }

    @Nullable
    public static final String getExtendedUserId(@NotNull String str) {
        return INSTANCE.getExtendedUserId(str);
    }

    public static final boolean getExtendedUserIdServiceEnabled() {
        return INSTANCE.getExtendedUserIdServiceEnabled();
    }

    @Nullable
    public static final EidDataUpdateListener getExtendedUserIdUpdateListener() {
        return extendedUserIdUpdateListener;
    }

    @Nullable
    public static final String getFabrickIdentifier() {
        return INSTANCE.getFabrickIdentifier();
    }

    @NotNull
    public static final Gender getGender() {
        return gender;
    }

    @Nullable
    public static final String getLiveRampEnvelope() {
        return INSTANCE.getLiveRampEnvelope();
    }

    @Nullable
    public static final String getPhoneNumber() {
        return phoneNumber;
    }

    @Nullable
    public static final ExtendedUidListener getUserIdListener() {
        return userIdListener;
    }

    public static final int getYearOfBirth() {
        return yearOfBirth;
    }

    public static final boolean isVendorEnabled(@NotNull Partner partner) {
        return INSTANCE.isVendorEnabled(partner);
    }

    public static final void setAge(int i10) {
        INSTANCE.setAge(i10);
    }

    public static final void setAllowLocation(boolean z10) {
        INSTANCE.setAllowLocation(z10);
    }

    public static final void setEmail(@Nullable String str) {
        INSTANCE.setEmail(str);
    }

    public static final void setExtendedUserId(@NotNull String str, @Nullable String str2) {
        INSTANCE.setExtendedUserId(str, str2);
    }

    public static final void setExtendedUserIdServiceEnabled(boolean z10) {
        INSTANCE.setExtendedUserIdServiceEnabled(z10);
    }

    public static final void setExtendedUserIdUpdateListener(@Nullable EidDataUpdateListener eidDataUpdateListener2) {
        INSTANCE.setExtendedUserIdUpdateListener(eidDataUpdateListener2);
    }

    public static final void setFabrickIdentifier(@NotNull String str) {
        INSTANCE.setFabrickIdentifier(str);
    }

    public static final void setGender(@NotNull Gender gender2) {
        INSTANCE.setGender(gender2);
    }

    public static final void setLiveRampEnvelope(@NotNull String str) {
        INSTANCE.setLiveRampEnvelope(str);
    }

    public static final void setPhoneNumber(@Nullable String str) {
        INSTANCE.setPhoneNumber(str);
    }

    public static final void setUserIdListener(@Nullable ExtendedUidListener extendedUidListener) {
        INSTANCE.setUserIdListener(extendedUidListener);
    }

    public static final void setVendorEnabled(@NotNull Partner partner, boolean z10) {
        INSTANCE.setVendorEnabled(partner, z10);
    }

    public static final void setYearOfBirth(int i10) {
        INSTANCE.setYearOfBirth(i10);
    }

    public static final boolean isVendorEnabled(@NotNull String str) {
        return INSTANCE.isVendorEnabled(str);
    }

    public static final void setVendorEnabled(@NotNull String str, boolean z10) {
        INSTANCE.setVendorEnabled(str, z10);
    }
}
