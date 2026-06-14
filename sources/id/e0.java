package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum e0 implements pd.p {
    OnImpression("on_impression"),
    OnClick("on_click"),
    OnMute("on_mute"),
    OnUnMute("on_unmute"),
    OnPause("on_pause"),
    OnResume("on_resume"),
    OnSkip("on_skip"),
    OnClose("on_close"),
    OnStart("on_start"),
    OnFirstQuartile("on_first_quartile"),
    OnMidpoint("on_midpoint"),
    OnThirdQuartile("on_third_quartile"),
    OnComplete("on_complete"),
    OnProgress("on_progress"),
    OnUseCustomClose("on_use_custom_close"),
    OnScheduled("on_scheduled"),
    OnNavigate("on_navigate"),
    OnExpand("on_expand"),
    OnCollapse("on_collapse");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74457c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74478b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    e0(String str) {
        this.f74478b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74478b;
    }
}
