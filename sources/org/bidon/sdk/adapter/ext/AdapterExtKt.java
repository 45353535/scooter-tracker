package org.bidon.sdk.adapter.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"applyRegulation", "", "Lorg/bidon/sdk/adapter/Adapter;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdapterExtKt {
    public static final void applyRegulation(@NotNull Adapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        if ((adapter instanceof SupportsRegulation ? (SupportsRegulation) adapter : null) != null) {
            Regulation regulation = BidonSdk.getRegulation();
            LogExtKt.logInfo(TagKt.getTAG(adapter), "Applying regulation to " + adapter.getDemandId().getDemandId() + " <- GDPR=" + regulation.getGdpr() + ", COPPA=" + regulation.getCoppa() + ", usPrivacyString=" + regulation.getUsPrivacyString() + ", gdprConsentString=" + regulation.getGdprConsentString());
            ((SupportsRegulation) adapter).updateRegulation(regulation);
        }
    }
}
