package org.bidon.sdk.databinders.reg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.IabRequestBody;
import org.bidon.sdk.config.models.RegulationsRequestBody;
import org.bidon.sdk.regulation.Coppa;
import org.bidon.sdk.regulation.Gdpr;
import org.bidon.sdk.regulation.Iab;
import org.bidon.sdk.regulation.IabConsent;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/databinders/reg/RegulationDataSourceImpl;", "Lorg/bidon/sdk/databinders/reg/RegulationDataSource;", "publisherRegulations", "Lorg/bidon/sdk/regulation/Regulation;", "iabConsent", "Lorg/bidon/sdk/regulation/IabConsent;", "<init>", "(Lorg/bidon/sdk/regulation/Regulation;Lorg/bidon/sdk/regulation/IabConsent;)V", "regulationsRequestBody", "Lorg/bidon/sdk/config/models/RegulationsRequestBody;", "getRegulationsRequestBody", "()Lorg/bidon/sdk/config/models/RegulationsRequestBody;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegulationDataSourceImpl implements RegulationDataSource {

    @NotNull
    private final IabConsent iabConsent;

    @NotNull
    private final Regulation publisherRegulations;

    public RegulationDataSourceImpl(@NotNull Regulation publisherRegulations, @NotNull IabConsent iabConsent) {
        Intrinsics.checkNotNullParameter(publisherRegulations, "publisherRegulations");
        Intrinsics.checkNotNullParameter(iabConsent, "iabConsent");
        this.publisherRegulations = publisherRegulations;
        this.iabConsent = iabConsent;
    }

    @Override // org.bidon.sdk.databinders.reg.RegulationDataSource
    @NotNull
    public RegulationsRequestBody getRegulationsRequestBody() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.publisherRegulations.getCoppa() == Coppa.Yes ? bool : null;
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        if (this.publisherRegulations.getGdpr() != Gdpr.Applies) {
            bool = null;
        }
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        String gdprConsentString = this.publisherRegulations.getGdprConsentString();
        String usPrivacyString = this.publisherRegulations.getUsPrivacyString();
        Iab iab = this.iabConsent.getIab();
        return new RegulationsRequestBody(zBooleanValue, zBooleanValue2, usPrivacyString, gdprConsentString, new IabRequestBody(iab.getTcfV1(), iab.getTcfV2(), iab.getUsPrivacy()));
    }
}
