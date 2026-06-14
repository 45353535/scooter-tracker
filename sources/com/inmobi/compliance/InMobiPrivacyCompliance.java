package com.inmobi.compliance;

import com.amazon.device.ads.DtbConstants;
import com.inmobi.media.X3;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/inmobi/compliance/InMobiPrivacyCompliance;", "", "", "doNotSell", "", "setDoNotSell", "(Z)V", "", "privacyString", "setUSPrivacyString", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiPrivacyCompliance {

    @NotNull
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean doNotSell) {
        X3.f37984a.put("do_not_sell", doNotSell ? "1" : "0");
    }

    public static final void setUSPrivacyString(@NotNull String privacyString) {
        Intrinsics.checkNotNullParameter(privacyString, "privacyString");
        HashMap map = X3.f37984a;
        Intrinsics.checkNotNullParameter(privacyString, "privacyString");
        X3.f37984a.put(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, privacyString);
    }
}
