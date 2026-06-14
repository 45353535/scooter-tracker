package gatewayprotocol.v1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "block", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "-initializeandroid", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "android", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "-initializeios", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "ios", "AndroidKt", "Dsl", "IosKt", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DynamicDeviceInfoKt {

    @NotNull
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {

        @NotNull
        public static final AndroidKt INSTANCE = new AndroidKt();

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001mB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010H\u001a\u00020IH\u0001J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u0006\u0010M\u001a\u00020KJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u0006\u0010Q\u001a\u00020KJ\u0006\u0010R\u001a\u00020KJ\u0006\u0010S\u001a\u00020KJ\u0006\u0010T\u001a\u00020KJ\u0006\u0010U\u001a\u00020KJ\u0006\u0010V\u001a\u00020KJ\u0006\u0010W\u001a\u00020KJ\u0006\u0010X\u001a\u00020KJ\u0006\u0010Y\u001a\u00020KJ\u0006\u0010Z\u001a\u00020KJ\u0006\u0010[\u001a\u00020KJ\u0006\u0010\\\u001a\u00020\u0006J\u0006\u0010]\u001a\u00020\u0006J\u0006\u0010^\u001a\u00020\u0006J\u0006\u0010_\u001a\u00020\u0006J\u0006\u0010`\u001a\u00020\u0006J\u0006\u0010a\u001a\u00020\u0006J\u0006\u0010b\u001a\u00020\u0006J\u0006\u0010c\u001a\u00020\u0006J\u0006\u0010d\u001a\u00020\u0006J\u0006\u0010e\u001a\u00020\u0006J\u0006\u0010f\u001a\u00020\u0006J\u0006\u0010g\u001a\u00020\u0006J\u0006\u0010h\u001a\u00020\u0006J\u0006\u0010i\u001a\u00020\u0006J\u0006\u0010j\u001a\u00020\u0006J\u0006\u0010k\u001a\u00020\u0006J\u0006\u0010l\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00103\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R$\u00106\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R$\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR$\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR$\u0010?\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R$\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010\u000bR$\u0010E\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&¨\u0006n"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;)V", "value", "", "adbEnabled", "getAdbEnabled", "()Z", "setAdbEnabled", "(Z)V", C4240b4.j.f42691m0, "getAirplaneMode", "setAirplaneMode", "", C4240b4.j.f42689l0, "getChargingType", "()I", "setChargingType", "(I)V", "", "deviceElapsedRealtime", "getDeviceElapsedRealtime", "()J", "setDeviceElapsedRealtime", "(J)V", "deviceUpTime", "getDeviceUpTime", "setDeviceUpTime", "freeDiskSpaceInternal", "getFreeDiskSpaceInternal", "setFreeDiskSpaceInternal", "", "maxVolume", "getMaxVolume", "()D", "setMaxVolume", "(D)V", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "networkCapabilityTransports", "getNetworkCapabilityTransports", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "setNetworkCapabilityTransports", "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;)V", "networkConnected", "getNetworkConnected", "setNetworkConnected", "networkMetered", "getNetworkMetered", "setNetworkMetered", "networkType", "getNetworkType", "setNetworkType", C4240b4.j.f42699q0, "getScreenBrightness", "setScreenBrightness", "sdCardPresent", "getSdCardPresent", "setSdCardPresent", "stayOnWhilePluggedIn", "getStayOnWhilePluggedIn", "setStayOnWhilePluggedIn", "telephonyManagerNetworkType", "getTelephonyManagerNetworkType", "setTelephonyManagerNetworkType", "usbConnected", "getUsbConnected", "setUsbConnected", "volume", "getVolume", "setVolume", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "clearAdbEnabled", "", "clearAirplaneMode", "clearChargingType", "clearDeviceElapsedRealtime", "clearDeviceUpTime", "clearFreeDiskSpaceInternal", "clearMaxVolume", "clearNetworkCapabilityTransports", "clearNetworkConnected", "clearNetworkMetered", "clearNetworkType", "clearScreenBrightness", "clearSdCardPresent", "clearStayOnWhilePluggedIn", "clearTelephonyManagerNetworkType", "clearUsbConnected", "clearVolume", "hasAdbEnabled", "hasAirplaneMode", "hasChargingType", "hasDeviceElapsedRealtime", "hasDeviceUpTime", "hasFreeDiskSpaceInternal", "hasMaxVolume", "hasNetworkCapabilityTransports", "hasNetworkConnected", "hasNetworkMetered", "hasNetworkType", "hasScreenBrightness", "hasSdCardPresent", "hasStayOnWhilePluggedIn", "hasTelephonyManagerNetworkType", "hasUsbConnected", "hasVolume", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android androidBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final void clearFreeDiskSpaceInternal() {
                this._builder.clearFreeDiskSpaceInternal();
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final long getFreeDiskSpaceInternal() {
                return this._builder.getFreeDiskSpaceInternal();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            @NotNull
            public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this._builder.getNetworkCapabilityTransports();
                Intrinsics.checkNotNullExpressionValue(networkCapabilityTransports, "_builder.getNetworkCapabilityTransports()");
                return networkCapabilityTransports;
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final boolean hasFreeDiskSpaceInternal() {
                return this._builder.hasFreeDiskSpaceInternal();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final void setAdbEnabled(boolean z10) {
                this._builder.setAdbEnabled(z10);
            }

            public final void setAirplaneMode(boolean z10) {
                this._builder.setAirplaneMode(z10);
            }

            public final void setChargingType(int i10) {
                this._builder.setChargingType(i10);
            }

            public final void setDeviceElapsedRealtime(long j10) {
                this._builder.setDeviceElapsedRealtime(j10);
            }

            public final void setDeviceUpTime(long j10) {
                this._builder.setDeviceUpTime(j10);
            }

            public final void setFreeDiskSpaceInternal(long j10) {
                this._builder.setFreeDiskSpaceInternal(j10);
            }

            public final void setMaxVolume(double d10) {
                this._builder.setMaxVolume(d10);
            }

            public final void setNetworkCapabilityTransports(@NotNull NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNetworkCapabilityTransports(value);
            }

            public final void setNetworkConnected(boolean z10) {
                this._builder.setNetworkConnected(z10);
            }

            public final void setNetworkMetered(boolean z10) {
                this._builder.setNetworkMetered(z10);
            }

            public final void setNetworkType(int i10) {
                this._builder.setNetworkType(i10);
            }

            public final void setScreenBrightness(double d10) {
                this._builder.setScreenBrightness(d10);
            }

            public final void setSdCardPresent(boolean z10) {
                this._builder.setSdCardPresent(z10);
            }

            public final void setStayOnWhilePluggedIn(boolean z10) {
                this._builder.setStayOnWhilePluggedIn(z10);
            }

            public final void setTelephonyManagerNetworkType(int i10) {
                this._builder.setTelephonyManagerNetworkType(i10);
            }

            public final void setUsbConnected(boolean z10) {
                this._builder.setUsbConnected(z10);
            }

            public final void setVolume(double d10) {
                this._builder.setVolume(d10);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0007\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008d\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010a\u001a\u00020bH\u0001J\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020dJ\u0006\u0010f\u001a\u00020dJ\u0006\u0010g\u001a\u00020dJ\u0006\u0010h\u001a\u00020dJ\u0006\u0010i\u001a\u00020dJ\u0006\u0010j\u001a\u00020dJ\u0006\u0010k\u001a\u00020dJ\u0006\u0010l\u001a\u00020dJ\u0006\u0010m\u001a\u00020dJ\u0006\u0010n\u001a\u00020dJ\u0006\u0010o\u001a\u00020dJ\u0006\u0010p\u001a\u00020dJ\u0006\u0010q\u001a\u00020dJ\u0006\u0010r\u001a\u00020dJ\u0006\u0010s\u001a\u00020dJ\u0006\u0010t\u001a\u00020dJ\u0006\u0010u\u001a\u00020dJ\u0006\u0010v\u001a\u00020dJ\u0006\u0010w\u001a\u00020dJ\u0006\u0010x\u001a\u00020dJ\u0006\u0010y\u001a\u00020\fJ\u0006\u0010z\u001a\u00020\fJ\u0006\u0010{\u001a\u00020\fJ\u0006\u0010|\u001a\u00020\fJ\u0006\u0010}\u001a\u00020\fJ\u0006\u0010~\u001a\u00020\fJ\u0006\u0010\u007f\u001a\u00020\fJ\u0007\u0010\u0080\u0001\u001a\u00020\fJ\u0007\u0010\u0081\u0001\u001a\u00020\fJ\u0007\u0010\u0082\u0001\u001a\u00020\fJ\u0007\u0010\u0083\u0001\u001a\u00020\fJ\u0007\u0010\u0084\u0001\u001a\u00020\fJ\u0007\u0010\u0085\u0001\u001a\u00020\fJ\u0007\u0010\u0086\u0001\u001a\u00020\fJ\u0007\u0010\u0087\u0001\u001a\u00020\fJ\u0007\u0010\u0088\u0001\u001a\u00020\fJ\u0007\u0010\u0089\u0001\u001a\u00020\fJ\u0007\u0010\u008a\u0001\u001a\u00020\fJ\u0007\u0010\u008b\u0001\u001a\u00020\fJ\u0007\u0010\u008c\u0001\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R$\u0010?\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R$\u0010B\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R$\u0010E\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R$\u0010H\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R\u0011\u0010K\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bM\u0010NR$\u0010O\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR$\u0010R\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u0010\u001dR$\u0010U\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u00109\"\u0004\bW\u0010;R$\u0010X\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010*\"\u0004\bZ\u0010,R$\u0010[\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u00109\"\u0004\b]\u0010;R$\u0010^\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011¨\u0006\u008e\u0001"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;)V", "value", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "android", "getAndroid", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;)V", "", "appActive", "getAppActive", "()Z", "setAppActive", "(Z)V", "", C4240b4.j.Y, "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", "", "batteryStatus", "getBatteryStatus", "()I", "setBatteryStatus", "(I)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "connectionType", "getConnectionType", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "setConnectionType", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;)V", "connectionTypeValue", "getConnectionTypeValue", "setConnectionTypeValue", "", "freeDiskSpace", "getFreeDiskSpace", "()J", "setFreeDiskSpace", "(J)V", "freeRamMemory", "getFreeRamMemory", "setFreeRamMemory", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "ios", "getIos", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;)V", "", "language", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "limitedOpenAdTracking", "getLimitedOpenAdTracking", "setLimitedOpenAdTracking", "limitedTracking", "getLimitedTracking", "setLimitedTracking", "lowPowerMode", "getLowPowerMode", "setLowPowerMode", "networkOperator", "getNetworkOperator", "setNetworkOperator", "networkOperatorName", "getNetworkOperatorName", "setNetworkOperatorName", "platformSpecificCase", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "screenHeight", "getScreenHeight", "setScreenHeight", "screenWidth", "getScreenWidth", "setScreenWidth", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "getTimeZone", "setTimeZone", "timeZoneOffset", "getTimeZoneOffset", "setTimeZoneOffset", "userId", "getUserId", "setUserId", "wiredHeadset", "getWiredHeadset", "setWiredHeadset", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "clearAndroid", "", "clearAppActive", "clearBatteryLevel", "clearBatteryStatus", "clearConnectionType", "clearFreeDiskSpace", "clearFreeRamMemory", "clearIos", "clearLanguage", "clearLimitedOpenAdTracking", "clearLimitedTracking", "clearLowPowerMode", "clearNetworkOperator", "clearNetworkOperatorName", "clearPlatformSpecific", "clearScreenHeight", "clearScreenWidth", "clearTimeZone", "clearTimeZoneOffset", "clearUserId", "clearWiredHeadset", "hasAndroid", "hasAppActive", "hasBatteryLevel", "hasBatteryStatus", "hasConnectionType", "hasFreeDiskSpace", "hasFreeRamMemory", "hasIos", "hasLanguage", "hasLimitedOpenAdTracking", "hasLimitedTracking", "hasLowPowerMode", "hasNetworkOperator", "hasNetworkOperatorName", "hasScreenHeight", "hasScreenWidth", "hasTimeZone", "hasTimeZoneOffset", "hasUserId", "hasWiredHeadset", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfoBuild, "_builder.build()");
            return dynamicDeviceInfoBuild;
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = this._builder.getAndroid();
            Intrinsics.checkNotNullExpressionValue(android2, "_builder.getAndroid()");
            return android2;
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            Intrinsics.checkNotNullExpressionValue(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final int getConnectionTypeValue() {
            return this._builder.getConnectionTypeValue();
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            Intrinsics.checkNotNullExpressionValue(ios, "_builder.getIos()");
            return ios;
        }

        @NotNull
        public final String getLanguage() {
            String language = this._builder.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "_builder.getLanguage()");
            return language;
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        @NotNull
        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            Intrinsics.checkNotNullExpressionValue(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        @NotNull
        public final String getNetworkOperatorName() {
            String networkOperatorName = this._builder.getNetworkOperatorName();
            Intrinsics.checkNotNullExpressionValue(networkOperatorName, "_builder.getNetworkOperatorName()");
            return networkOperatorName;
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            Intrinsics.checkNotNullExpressionValue(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        @NotNull
        public final String getTimeZone() {
            String timeZone = this._builder.getTimeZone();
            Intrinsics.checkNotNullExpressionValue(timeZone, "_builder.getTimeZone()");
            return timeZone;
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        @NotNull
        public final String getUserId() {
            String userId = this._builder.getUserId();
            Intrinsics.checkNotNullExpressionValue(userId, "_builder.getUserId()");
            return userId;
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final void setAndroid(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAndroid(value);
        }

        public final void setAppActive(boolean z10) {
            this._builder.setAppActive(z10);
        }

        public final void setBatteryLevel(double d10) {
            this._builder.setBatteryLevel(d10);
        }

        public final void setBatteryStatus(int i10) {
            this._builder.setBatteryStatus(i10);
        }

        public final void setConnectionType(@NotNull DynamicDeviceInfoOuterClass.ConnectionType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConnectionType(value);
        }

        public final void setConnectionTypeValue(int i10) {
            this._builder.setConnectionTypeValue(i10);
        }

        public final void setFreeDiskSpace(long j10) {
            this._builder.setFreeDiskSpace(j10);
        }

        public final void setFreeRamMemory(long j10) {
            this._builder.setFreeRamMemory(j10);
        }

        public final void setIos(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIos(value);
        }

        public final void setLanguage(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLanguage(value);
        }

        public final void setLimitedOpenAdTracking(boolean z10) {
            this._builder.setLimitedOpenAdTracking(z10);
        }

        public final void setLimitedTracking(boolean z10) {
            this._builder.setLimitedTracking(z10);
        }

        public final void setLowPowerMode(boolean z10) {
            this._builder.setLowPowerMode(z10);
        }

        public final void setNetworkOperator(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void setNetworkOperatorName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkOperatorName(value);
        }

        public final void setScreenHeight(int i10) {
            this._builder.setScreenHeight(i10);
        }

        public final void setScreenWidth(int i10) {
            this._builder.setScreenWidth(i10);
        }

        public final void setTimeZone(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimeZone(value);
        }

        public final void setTimeZoneOffset(long j10) {
            this._builder.setTimeZoneOffset(j10);
        }

        public final void setUserId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUserId(value);
        }

        public final void setWiredHeadset(boolean z10) {
            this._builder.setWiredHeadset(z10);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {

        @NotNull
        public static final IosKt INSTANCE = new IosKt();

        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 _2\u00020\u0001:\u0003_`aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00105\u001a\u000206H\u0001J\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000208J\u0006\u0010:\u001a\u000208J\u0006\u0010;\u001a\u000208J\u0006\u0010<\u001a\u000208J\u0006\u0010=\u001a\u000208J\u0006\u0010>\u001a\u000208J\u0006\u0010?\u001a\u000208J\u0006\u0010@\u001a\u000208J\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020BJ\u0006\u0010D\u001a\u00020BJ\u0006\u0010E\u001a\u00020BJ\u0006\u0010F\u001a\u00020BJ\u0006\u0010G\u001a\u00020BJ\u0006\u0010H\u001a\u00020BJ\u0006\u0010I\u001a\u00020BJ\u0006\u0010J\u001a\u00020BJ%\u0010K\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bLJ%\u0010K\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bMJ+\u0010N\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060PH\u0007¢\u0006\u0002\bQJ+\u0010N\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060PH\u0007¢\u0006\u0002\bRJ\u001d\u0010S\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u0007¢\u0006\u0002\bTJ\u001d\u0010S\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001fH\u0007¢\u0006\u0002\bUJ&\u0010V\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bWJ,\u0010V\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060PH\u0087\n¢\u0006\u0002\bXJ&\u0010V\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0002\bYJ,\u0010V\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060PH\u0087\n¢\u0006\u0002\bZJ.\u0010[\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b]J.\u0010[\u001a\u000208*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b^R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010#\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R$\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R$\u00102\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.¨\u0006b"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;)V", "value", "", "currentRadioAccessTechnology", "getCurrentRadioAccessTechnology", "()Ljava/lang/String;", "setCurrentRadioAccessTechnology", "(Ljava/lang/String;)V", "", "currentUiTheme", "getCurrentUiTheme", "()I", "setCurrentUiTheme", "(I)V", "deviceName", "getDeviceName", "setDeviceName", "", "deviceUpTimeWithSleep", "getDeviceUpTimeWithSleep", "()J", "setDeviceUpTimeWithSleep", "(J)V", "deviceUpTimeWithoutSleep", "getDeviceUpTimeWithoutSleep", "setDeviceUpTimeWithoutSleep", "localeList", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "getLocaleList", "()Lcom/google/protobuf/kotlin/DslList;", "networkReachabilityFlags", "getNetworkReachabilityFlags", "setNetworkReachabilityFlags", "nwPathInterfaces", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "getNwPathInterfaces", "", C4240b4.j.f42699q0, "getScreenBrightness", "()D", "setScreenBrightness", "(D)V", "trackingAuthStatus", "getTrackingAuthStatus", "setTrackingAuthStatus", "volume", "getVolume", "setVolume", "_build", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "clearCurrentRadioAccessTechnology", "", "clearCurrentUiTheme", "clearDeviceName", "clearDeviceUpTimeWithSleep", "clearDeviceUpTimeWithoutSleep", "clearNetworkReachabilityFlags", "clearScreenBrightness", "clearTrackingAuthStatus", "clearVolume", "hasCurrentRadioAccessTechnology", "", "hasCurrentUiTheme", "hasDeviceName", "hasDeviceUpTimeWithSleep", "hasDeviceUpTimeWithoutSleep", "hasNetworkReachabilityFlags", "hasScreenBrightness", "hasTrackingAuthStatus", "hasVolume", "add", "addLocaleList", "addNwPathInterfaces", "addAll", "values", "", "addAllLocaleList", "addAllNwPathInterfaces", "clear", "clearLocaleList", "clearNwPathInterfaces", "plusAssign", "plusAssignLocaleList", "plusAssignAllLocaleList", "plusAssignNwPathInterfaces", "plusAssignAllNwPathInterfaces", "set", FirebaseAnalytics.Param.INDEX, "setLocaleList", "setNwPathInterfaces", y.f66058y, "LocaleListProxy", "NwPathInterfacesProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios iosBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final /* synthetic */ void addAllLocaleList(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllLocaleList(values);
            }

            public final /* synthetic */ void addAllNwPathInterfaces(DslList dslList, Iterable values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllNwPathInterfaces(values);
            }

            public final /* synthetic */ void addLocaleList(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addLocaleList(value);
            }

            public final /* synthetic */ void addNwPathInterfaces(DslList dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addNwPathInterfaces(value);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            @NotNull
            public final String getCurrentRadioAccessTechnology() {
                String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                Intrinsics.checkNotNullExpressionValue(currentRadioAccessTechnology, "_builder.getCurrentRadioAccessTechnology()");
                return currentRadioAccessTechnology;
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            @NotNull
            public final String getDeviceName() {
                String deviceName = this._builder.getDeviceName();
                Intrinsics.checkNotNullExpressionValue(deviceName, "_builder.getDeviceName()");
                return deviceName;
            }

            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            @NotNull
            public final DslList<String, LocaleListProxy> getLocaleList() {
                List<String> localeListList = this._builder.getLocaleListList();
                Intrinsics.checkNotNullExpressionValue(localeListList, "_builder.getLocaleListList()");
                return new DslList<>(localeListList);
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            @NotNull
            public final DslList<String, NwPathInterfacesProxy> getNwPathInterfaces() {
                List<String> nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                Intrinsics.checkNotNullExpressionValue(nwPathInterfacesList, "_builder.getNwPathInterfacesList()");
                return new DslList<>(nwPathInterfacesList);
            }

            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final /* synthetic */ void plusAssignAllLocaleList(DslList<String, LocaleListProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllLocaleList(dslList, values);
            }

            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllNwPathInterfaces(dslList, values);
            }

            public final /* synthetic */ void plusAssignLocaleList(DslList<String, LocaleListProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addLocaleList(dslList, value);
            }

            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addNwPathInterfaces(dslList, value);
            }

            public final void setCurrentRadioAccessTechnology(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCurrentRadioAccessTechnology(value);
            }

            public final void setCurrentUiTheme(int i10) {
                this._builder.setCurrentUiTheme(i10);
            }

            public final void setDeviceName(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDeviceName(value);
            }

            public final void setDeviceUpTimeWithSleep(long j10) {
                this._builder.setDeviceUpTimeWithSleep(j10);
            }

            public final void setDeviceUpTimeWithoutSleep(long j10) {
                this._builder.setDeviceUpTimeWithoutSleep(j10);
            }

            public final /* synthetic */ void setLocaleList(DslList dslList, int i10, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLocaleList(i10, value);
            }

            public final void setNetworkReachabilityFlags(int i10) {
                this._builder.setNetworkReachabilityFlags(i10);
            }

            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i10, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNwPathInterfaces(i10, value);
            }

            public final void setScreenBrightness(double d10) {
                this._builder.setScreenBrightness(d10);
            }

            public final void setTrackingAuthStatus(int i10) {
                this._builder.setTrackingAuthStatus(i10);
            }

            public final void setVolume(double d10) {
                this._builder.setVolume(d10);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private DynamicDeviceInfoKt() {
    }

    @NotNull
    /* JADX INFO: renamed from: -initializeandroid, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m7703initializeandroid(@NotNull Function1<? super AndroidKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    /* JADX INFO: renamed from: -initializeios, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m7704initializeios(@NotNull Function1<? super IosKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
