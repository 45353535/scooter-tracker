package l2;

/* JADX INFO: loaded from: classes7.dex */
public enum j {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART("AddToCart"),
    ADDED_TO_WISHLIST("AddToWishlist"),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT("ViewContent"),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED("Purchase"),
    RATED("Rate"),
    SEARCHED("Search"),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f93965b;

    j(String str) {
        this.f93965b = str;
    }

    public final String g() {
        return this.f93965b;
    }
}
