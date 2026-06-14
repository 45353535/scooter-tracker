package id;

import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum d0 implements pd.p {
    Track("track"),
    Open("open"),
    NotifyOpen("notify_open"),
    Skip("skip"),
    Close("close"),
    Mute("mute"),
    UnMute("unmute"),
    Repeat("repeat"),
    Show(C4424m2.f43623v),
    Hide(MenuActionType.HIDE),
    Progress("progress"),
    Schedule("schedule"),
    Start("start"),
    LockVisibility("lock_visibility"),
    UnlockVisibility("unlock_visibility"),
    SimulateClick("simulate_click"),
    OpenPrivacySheet("open_privacy_sheet"),
    ToggleStateGroups("toggle_state_groups"),
    Expand("expand"),
    Collapse("collapse");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74427c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74449b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    d0(String str) {
        this.f74449b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74449b;
    }
}
