package org.bidon.sdk.regulation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0012\u0010\u0017\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0012\u0010\u0019\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\u001b\u001a\u00020\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lorg/bidon/sdk/regulation/Regulation;", "", "gdpr", "Lorg/bidon/sdk/regulation/Gdpr;", "getGdpr", "()Lorg/bidon/sdk/regulation/Gdpr;", "setGdpr", "(Lorg/bidon/sdk/regulation/Gdpr;)V", "gdprConsentString", "", "getGdprConsentString", "()Ljava/lang/String;", "setGdprConsentString", "(Ljava/lang/String;)V", "gdprApplies", "", "getGdprApplies", "()Z", "hasGdprConsent", "getHasGdprConsent", "usPrivacyString", "getUsPrivacyString", "setUsPrivacyString", "ccpaApplies", "getCcpaApplies", "hasCcpaConsent", "getHasCcpaConsent", "coppa", "Lorg/bidon/sdk/regulation/Coppa;", "getCoppa", "()Lorg/bidon/sdk/regulation/Coppa;", "setCoppa", "(Lorg/bidon/sdk/regulation/Coppa;)V", "coppaApplies", "getCoppaApplies", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Regulation {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getCoppaApplies(@NotNull Regulation regulation) {
            return regulation.getCoppa() == Coppa.Yes;
        }
    }

    boolean getCcpaApplies();

    @NotNull
    Coppa getCoppa();

    boolean getCoppaApplies();

    @NotNull
    Gdpr getGdpr();

    boolean getGdprApplies();

    @Nullable
    String getGdprConsentString();

    boolean getHasCcpaConsent();

    boolean getHasGdprConsent();

    @Nullable
    String getUsPrivacyString();

    void setCoppa(@NotNull Coppa coppa);

    void setGdpr(@NotNull Gdpr gdpr);

    void setGdprConsentString(@Nullable String str);

    void setUsPrivacyString(@Nullable String str);
}
