package yads;

import com.monetization.ads.quality.base.result.AdQualityVerificationResult;

/* JADX INFO: loaded from: classes4.dex */
public final class j8 {
    public static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        throw new lf.m();
    }
}
