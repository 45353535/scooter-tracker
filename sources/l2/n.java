package l2;

/* JADX INFO: loaded from: classes7.dex */
public enum n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94017b;

    n(String str) {
        this.f94017b = str;
    }

    public final String g() {
        return this.f94017b;
    }
}
