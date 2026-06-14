package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.Telemetry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionReceiver;", "owner", "", "(Ljava/lang/Object;)V", "actions", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "getActions", "()Ljava/util/List;", "mutableActions", "", "ownerHashCode", "", "getOwnerHashCode", "()I", "ownerSenderName", "", "getOwnerSenderName", "()Ljava/lang/String;", "clearActions", "", "clearActions$mobilefuse_sdk_telemetry_release", "onAction", "action", "registerToTelemetry", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryAgent implements TelemetryActionReceiver {
    private final List<TelemetryAction> mutableActions;
    private final int ownerHashCode;

    @NotNull
    private final String ownerSenderName;

    public TelemetryAgent(@NotNull Object owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.ownerHashCode = owner.hashCode();
        this.ownerSenderName = TelemetryHelpersKt.getTelemetryActionSender(owner);
        this.mutableActions = new ArrayList();
        registerToTelemetry();
    }

    public final void clearActions$mobilefuse_sdk_telemetry_release() {
        this.mutableActions.clear();
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionReceiver
    @NotNull
    public List<TelemetryAction> getActions() {
        return CollectionsKt.toList(this.mutableActions);
    }

    public final int getOwnerHashCode() {
        return this.ownerHashCode;
    }

    @NotNull
    public final String getOwnerSenderName() {
        return this.ownerSenderName;
    }

    public final synchronized void onAction(@NotNull TelemetryAction action) {
        try {
            Intrinsics.checkNotNullParameter(action, "action");
            Telemetry.Companion companion = Telemetry.INSTANCE;
            if (companion.getStoreActionsEnabled()) {
                this.mutableActions.add(action);
            }
            companion.onAction(action);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void registerToTelemetry() {
        Telemetry.INSTANCE.registerAgent$mobilefuse_sdk_telemetry_release(this);
    }
}
