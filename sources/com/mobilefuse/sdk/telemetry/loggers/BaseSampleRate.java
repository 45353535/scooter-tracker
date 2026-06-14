package com.mobilefuse.sdk.telemetry.loggers;

import androidx.annotation.VisibleForTesting;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\b\u0010\u0018\u001a\u00020\u0016H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/BaseSampleRate;", "", "()V", "RANDOM_VALUE", "", "getRANDOM_VALUE", "()D", "RANDOM_VALUE$delegate", "Lkotlin/Lazy;", "sampleRate", "getSampleRate$mobilefuse_sdk_telemetry_release$annotations", "getSampleRate$mobilefuse_sdk_telemetry_release", "setSampleRate$mobilefuse_sdk_telemetry_release", "(D)V", "shouldTransmitToServer", "", "getShouldTransmitToServer", "()Z", "setShouldTransmitToServer", "(Z)V", "getRandomNumber", "updateSampleRate", "", "newValue", "updateShouldTransmitToServer", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public class BaseSampleRate {

    /* JADX INFO: renamed from: RANDOM_VALUE$delegate, reason: from kotlin metadata */
    private final Lazy RANDOM_VALUE = i.a(new Function0<Double>() { // from class: com.mobilefuse.sdk.telemetry.loggers.BaseSampleRate$RANDOM_VALUE$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Double invoke() {
            return Double.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final double invoke2() {
            return this.this$0.getRandomNumber();
        }
    });
    private double sampleRate;
    private boolean shouldTransmitToServer;

    private final double getRANDOM_VALUE() {
        return ((Number) this.RANDOM_VALUE.getValue()).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getRandomNumber() {
        return Math.random();
    }

    @VisibleForTesting
    public static /* synthetic */ void getSampleRate$mobilefuse_sdk_telemetry_release$annotations() {
    }

    /* JADX INFO: renamed from: getSampleRate$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final double getSampleRate() {
        return this.sampleRate;
    }

    protected final boolean getShouldTransmitToServer() {
        return this.shouldTransmitToServer;
    }

    public final void setSampleRate$mobilefuse_sdk_telemetry_release(double d10) {
        this.sampleRate = d10;
    }

    protected final void setShouldTransmitToServer(boolean z10) {
        this.shouldTransmitToServer = z10;
    }

    public final void updateSampleRate(double newValue) {
        this.sampleRate = newValue;
        updateShouldTransmitToServer();
    }

    protected final void updateShouldTransmitToServer() {
        boolean z10 = false;
        if (this.sampleRate > 0 && getRANDOM_VALUE() <= this.sampleRate) {
            z10 = true;
        }
        this.shouldTransmitToServer = z10;
    }
}
