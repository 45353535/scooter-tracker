package sg.bigo.ads.core.mraid;

import androidx.annotation.NonNull;
import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: loaded from: classes4.dex */
public enum g {
    CLOSE("close"),
    UNLOAD("unload"),
    EXPAND { // from class: sg.bigo.ads.core.mraid.g.1
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return nVar == n.INLINE;
        }
    },
    USE_CUSTOM_CLOSE("usecustomclose"),
    OPEN { // from class: sg.bigo.ads.core.mraid.g.2
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    RESIZE { // from class: sg.bigo.ads.core.mraid.g.3
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    PLAY_VIDEO { // from class: sg.bigo.ads.core.mraid.g.4
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return nVar == n.INLINE;
        }
    },
    STORE_PICTURE { // from class: sg.bigo.ads.core.mraid.g.5
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    CREATE_CALENDAR_EVENT { // from class: sg.bigo.ads.core.mraid.g.6
        @Override // sg.bigo.ads.core.mraid.g
        final boolean a(@NonNull n nVar) {
            return true;
        }
    },
    UNSPECIFIED("");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final String f104478l;

    g(String str) {
        this.f104478l = str;
    }

    static g a(@NonNull String str) {
        for (g gVar : values()) {
            if (gVar.f104478l.equals(str)) {
                return gVar;
            }
        }
        return UNSPECIFIED;
    }

    /* synthetic */ g(String str, byte b10) {
        this(str);
    }

    boolean a(@NonNull n nVar) {
        return false;
    }
}
