package org.bidon.sdk.regulation.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bidon.sdk.regulation.Coppa;
import org.bidon.sdk.regulation.Gdpr;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lorg/bidon/sdk/regulation/impl/RegulationImpl;", "Lorg/bidon/sdk/regulation/Regulation;", "<init>", "()V", "coppa", "Lorg/bidon/sdk/regulation/Coppa;", "getCoppa", "()Lorg/bidon/sdk/regulation/Coppa;", "setCoppa", "(Lorg/bidon/sdk/regulation/Coppa;)V", "gdpr", "Lorg/bidon/sdk/regulation/Gdpr;", "getGdpr", "()Lorg/bidon/sdk/regulation/Gdpr;", "setGdpr", "(Lorg/bidon/sdk/regulation/Gdpr;)V", "gdprConsentString", "", "getGdprConsentString", "()Ljava/lang/String;", "setGdprConsentString", "(Ljava/lang/String;)V", "hasGdprConsent", "", "getHasGdprConsent", "()Z", "gdprApplies", "getGdprApplies", "usPrivacyString", "getUsPrivacyString", "setUsPrivacyString", "ccpaApplies", "getCcpaApplies", "hasCcpaConsent", "getHasCcpaConsent", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegulationImpl implements Regulation {

    @NotNull
    private Coppa coppa = Coppa.INSTANCE.getDefault();

    @NotNull
    private Gdpr gdpr = Gdpr.INSTANCE.getDefault();

    @Nullable
    private String gdprConsentString;

    @Nullable
    private String usPrivacyString;

    @Override // org.bidon.sdk.regulation.Regulation
    public boolean getCcpaApplies() {
        String usPrivacyString = getUsPrivacyString();
        if (usPrivacyString != null) {
            if (usPrivacyString.length() != 4) {
                usPrivacyString = null;
            }
            if (usPrivacyString != null && usPrivacyString.charAt(0) == '1') {
                String strA1 = StringsKt.A1(usPrivacyString, 1);
                for (int i10 = 0; i10 < strA1.length(); i10++) {
                    if (strA1.charAt(i10) != '-') {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    @NotNull
    public Coppa getCoppa() {
        return this.coppa;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public boolean getCoppaApplies() {
        return Regulation.DefaultImpls.getCoppaApplies(this);
    }

    @Override // org.bidon.sdk.regulation.Regulation
    @NotNull
    public Gdpr getGdpr() {
        return this.gdpr;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public boolean getGdprApplies() {
        return getGdpr() == Gdpr.Applies;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    @Nullable
    public String getGdprConsentString() {
        return this.gdprConsentString;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public boolean getHasCcpaConsent() {
        String usPrivacyString = getUsPrivacyString();
        if (usPrivacyString != null) {
            if (usPrivacyString.length() != 4) {
                usPrivacyString = null;
            }
            if (usPrivacyString != null && usPrivacyString.charAt(0) == '1' && Character.toUpperCase(usPrivacyString.charAt(2)) == 'N') {
                return true;
            }
        }
        return false;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public boolean getHasGdprConsent() {
        String gdprConsentString = getGdprConsentString();
        return !(gdprConsentString == null || StringsKt.y0(gdprConsentString));
    }

    @Override // org.bidon.sdk.regulation.Regulation
    @Nullable
    public String getUsPrivacyString() {
        return this.usPrivacyString;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public void setCoppa(@NotNull Coppa coppa) {
        Intrinsics.checkNotNullParameter(coppa, "<set-?>");
        this.coppa = coppa;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public void setGdpr(@NotNull Gdpr gdpr) {
        Intrinsics.checkNotNullParameter(gdpr, "<set-?>");
        this.gdpr = gdpr;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public void setGdprConsentString(@Nullable String str) {
        this.gdprConsentString = str;
    }

    @Override // org.bidon.sdk.regulation.Regulation
    public void setUsPrivacyString(@Nullable String str) {
        this.usPrivacyString = str;
    }
}
