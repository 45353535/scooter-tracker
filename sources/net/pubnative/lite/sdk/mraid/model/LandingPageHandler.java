package net.pubnative.lite.sdk.mraid.model;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.mraid.internal.MRAIDLog;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class LandingPageHandler {
    private static final int LANDING_PAGE_CLOSE_DELAY = 30000;
    private static final String LANDING_PAGE_HANDLER_TAG = "LandingPageHandler";
    private LandingPageCallback callback;
    private String customisationString;
    private final Boolean isLandingPageEnabled;
    private String landingBehaviourString;
    private Integer landingPageDelay = 30000;
    private boolean isFinalPage = false;
    private final Integer SKIP_OFFSET_ADJUSTMENT = 1000;
    private boolean isTimerFinished = false;

    public interface LandingPageCallback {
        void cancelLandingPageBehaviour();

        void hideCountDownTimer();

        void setLandingPageSkipTimer();

        void setLandingPageUseCustomClose(boolean z10);

        void showCountDownTimer();
    }

    public LandingPageHandler(@NonNull Ad ad2) {
        this.isLandingPageEnabled = ad2.isLandingPage();
    }

    private void handleLandingPageBehavior() {
        String str = this.landingBehaviourString;
        if (str == null) {
            LandingPageCallback landingPageCallback = this.callback;
            if (landingPageCallback != null) {
                landingPageCallback.showCountDownTimer();
                return;
            }
            return;
        }
        switch (str) {
            case "c":
                LandingPageCallback landingPageCallback2 = this.callback;
                if (landingPageCallback2 != null && !this.isTimerFinished) {
                    landingPageCallback2.showCountDownTimer();
                    break;
                }
                break;
            case "ic":
                LandingPageCallback landingPageCallback3 = this.callback;
                if (landingPageCallback3 != null) {
                    landingPageCallback3.cancelLandingPageBehaviour();
                    break;
                }
                break;
            case "nc":
                LandingPageCallback landingPageCallback4 = this.callback;
                if (landingPageCallback4 != null) {
                    landingPageCallback4.hideCountDownTimer();
                    break;
                }
                break;
        }
    }

    private void validateDelay() {
        if (this.landingPageDelay.intValue() < 0 || this.landingPageDelay.intValue() > 30000) {
            this.landingPageDelay = 30000;
        }
    }

    public String getCustomisationString() {
        return this.customisationString;
    }

    public String getLandingBehaviourString() {
        return this.landingBehaviourString;
    }

    public Integer getLandingPageDelay() {
        return this.landingPageDelay;
    }

    public int getUpdatedDelay() {
        if (this.landingPageDelay.intValue() >= this.SKIP_OFFSET_ADJUSTMENT.intValue()) {
            this.landingPageDelay = Integer.valueOf(this.landingPageDelay.intValue() - this.SKIP_OFFSET_ADJUSTMENT.intValue());
        }
        return this.landingPageDelay.intValue();
    }

    public boolean isFinalPage() {
        return this.isFinalPage;
    }

    public Boolean isLandingPageEnabled() {
        Boolean bool = this.isLandingPageEnabled;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public boolean isTimerFinished() {
        return this.isTimerFinished;
    }

    public void parseAdExperienceUrl(String str) {
        LandingPageCallback landingPageCallback;
        MRAIDLog.d(LANDING_PAGE_HANDLER_TAG, "parseAdExperienceUrl " + str);
        try {
            if (str.matches("verveadexperience://setcustomisation\\?text=(.+)")) {
                String str2 = new String(Base64.decode(str.replaceFirst("verveadexperience://setcustomisation\\?text=(.+)", "$1"), 0));
                this.customisationString = str2;
                if (TextUtils.isEmpty(str2) || (landingPageCallback = this.callback) == null) {
                    return;
                }
                landingPageCallback.setLandingPageUseCustomClose(false);
                this.callback.setLandingPageSkipTimer();
                return;
            }
            if (str.matches("verveadexperience://landingbehaviour\\?text=(.+)")) {
                this.landingBehaviourString = new String(Base64.decode(str.replaceFirst("verveadexperience://landingbehaviour\\?text=(.+)", "$1"), 0));
                return;
            }
            if (!str.matches("verveadexperience://closedelay\\?text=(.+)")) {
                if (str.matches("verveadexperience://setfinalpage")) {
                    this.isFinalPage = true;
                    handleLandingPageBehavior();
                    return;
                }
                return;
            }
            try {
                this.landingPageDelay = Integer.valueOf(Integer.parseInt(new String(Base64.decode(str.replaceFirst("verveadexperience://closedelay\\?text=(.+)", "$1"), 0))));
            } catch (NumberFormatException e10) {
                Logger.d(LANDING_PAGE_HANDLER_TAG, "Error parsing Landing Page Delay: " + e10);
            }
            validateDelay();
        } catch (RuntimeException e11) {
            Logger.d(LANDING_PAGE_HANDLER_TAG, "Error parsing Ad Experience: " + e11);
        }
    }

    public void setCallback(LandingPageCallback landingPageCallback) {
        this.callback = landingPageCallback;
    }

    public void setCustomisationString(String str) {
        this.customisationString = str;
    }

    public void setIsTimerFinished(boolean z10) {
        this.isTimerFinished = z10;
    }

    public void setLandingBehaviourString(String str) {
        this.landingBehaviourString = str;
    }

    public void setLandingPageDelay(Integer num) {
        this.landingPageDelay = num;
    }
}
