package org.bidon.sdk.databinders;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.adapters.AdaptersBinder;
import org.bidon.sdk.databinders.app.AppBinder;
import org.bidon.sdk.databinders.device.DeviceBinder;
import org.bidon.sdk.databinders.placement.PlacementBinder;
import org.bidon.sdk.databinders.reg.RegulationsBinder;
import org.bidon.sdk.databinders.segment.SegmentBinder;
import org.bidon.sdk.databinders.session.SessionBinder;
import org.bidon.sdk.databinders.test.TestModeBinder;
import org.bidon.sdk.databinders.token.TokenBinder;
import org.bidon.sdk.databinders.user.UserBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0096@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lorg/bidon/sdk/databinders/DataProviderImpl;", "Lorg/bidon/sdk/databinders/DataProvider;", "deviceBinder", "Lorg/bidon/sdk/databinders/device/DeviceBinder;", "appBinder", "Lorg/bidon/sdk/databinders/app/AppBinder;", "sessionBinder", "Lorg/bidon/sdk/databinders/session/SessionBinder;", "userBinder", "Lorg/bidon/sdk/databinders/user/UserBinder;", "tokenBinder", "Lorg/bidon/sdk/databinders/token/TokenBinder;", "placementBinder", "Lorg/bidon/sdk/databinders/placement/PlacementBinder;", "adaptersBinder", "Lorg/bidon/sdk/databinders/adapters/AdaptersBinder;", "segmentBinder", "Lorg/bidon/sdk/databinders/segment/SegmentBinder;", "regulationsBinder", "Lorg/bidon/sdk/databinders/reg/RegulationsBinder;", "testModeBinder", "Lorg/bidon/sdk/databinders/test/TestModeBinder;", "<init>", "(Lorg/bidon/sdk/databinders/device/DeviceBinder;Lorg/bidon/sdk/databinders/app/AppBinder;Lorg/bidon/sdk/databinders/session/SessionBinder;Lorg/bidon/sdk/databinders/user/UserBinder;Lorg/bidon/sdk/databinders/token/TokenBinder;Lorg/bidon/sdk/databinders/placement/PlacementBinder;Lorg/bidon/sdk/databinders/adapters/AdaptersBinder;Lorg/bidon/sdk/databinders/segment/SegmentBinder;Lorg/bidon/sdk/databinders/reg/RegulationsBinder;Lorg/bidon/sdk/databinders/test/TestModeBinder;)V", "provide", "", "", "", "dataBinders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataProviderImpl implements DataProvider {

    @NotNull
    private final AdaptersBinder adaptersBinder;

    @NotNull
    private final AppBinder appBinder;

    @NotNull
    private final DeviceBinder deviceBinder;

    @NotNull
    private final PlacementBinder placementBinder;

    @NotNull
    private final RegulationsBinder regulationsBinder;

    @NotNull
    private final SegmentBinder segmentBinder;

    @NotNull
    private final SessionBinder sessionBinder;

    @NotNull
    private final TestModeBinder testModeBinder;

    @NotNull
    private final TokenBinder tokenBinder;

    @NotNull
    private final UserBinder userBinder;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataBinderType.values().length];
            try {
                iArr[DataBinderType.Device.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataBinderType.App.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataBinderType.Session.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataBinderType.User.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataBinderType.Token.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataBinderType.Placement.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataBinderType.AvailableAdapters.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataBinderType.Segment.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataBinderType.Reg.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataBinderType.Test.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.DataProviderImpl$provide$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.DataProviderImpl", f = "DataProviderImpl.kt", l = {44}, m = "provide")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataProviderImpl.this.provide(null, this);
        }
    }

    public DataProviderImpl(@NotNull DeviceBinder deviceBinder, @NotNull AppBinder appBinder, @NotNull SessionBinder sessionBinder, @NotNull UserBinder userBinder, @NotNull TokenBinder tokenBinder, @NotNull PlacementBinder placementBinder, @NotNull AdaptersBinder adaptersBinder, @NotNull SegmentBinder segmentBinder, @NotNull RegulationsBinder regulationsBinder, @NotNull TestModeBinder testModeBinder) {
        Intrinsics.checkNotNullParameter(deviceBinder, "deviceBinder");
        Intrinsics.checkNotNullParameter(appBinder, "appBinder");
        Intrinsics.checkNotNullParameter(sessionBinder, "sessionBinder");
        Intrinsics.checkNotNullParameter(userBinder, "userBinder");
        Intrinsics.checkNotNullParameter(tokenBinder, "tokenBinder");
        Intrinsics.checkNotNullParameter(placementBinder, "placementBinder");
        Intrinsics.checkNotNullParameter(adaptersBinder, "adaptersBinder");
        Intrinsics.checkNotNullParameter(segmentBinder, "segmentBinder");
        Intrinsics.checkNotNullParameter(regulationsBinder, "regulationsBinder");
        Intrinsics.checkNotNullParameter(testModeBinder, "testModeBinder");
        this.deviceBinder = deviceBinder;
        this.appBinder = appBinder;
        this.sessionBinder = sessionBinder;
        this.userBinder = userBinder;
        this.tokenBinder = tokenBinder;
        this.placementBinder = placementBinder;
        this.adaptersBinder = adaptersBinder;
        this.segmentBinder = segmentBinder;
        this.regulationsBinder = regulationsBinder;
        this.testModeBinder = testModeBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009b -> B:34:0x009e). Please report as a decompilation issue!!! */
    @Override // org.bidon.sdk.databinders.DataProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object provide(@org.jetbrains.annotations.NotNull java.util.List<? extends org.bidon.sdk.databinders.DataBinderType> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.DataProviderImpl.provide(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
