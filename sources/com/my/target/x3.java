package com.my.target;

import android.content.Context;
import com.ironsource.C4424m2;
import com.my.target.instreamads.InstreamAd;
import com.my.target.instreamads.InstreamAdVideoMotionPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class x3 implements InstreamAdVideoMotionPlayer.VideoMotionPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f61025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InstreamAdVideoMotionPlayer f61026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f61027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tb f61028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f61029e;

    public interface a {
        void a(tb tbVar);

        void b(tb tbVar);
    }

    public x3(e1 e1Var) {
        this.f61025a = e1Var;
    }

    public static x3 a(e1 e1Var) {
        return new x3(e1Var);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onBannerComplete(Context context) {
        a aVar;
        tb tbVar = this.f61028d;
        if (tbVar == null || (aVar = this.f61027c) == null) {
            return;
        }
        bb.b(tbVar.x(), "playbackCompleted", 1, context);
        aVar.a(tbVar);
        this.f61028d = null;
        this.f61029e = null;
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onBannerShow(Context context) {
        a aVar;
        tb tbVar = this.f61028d;
        if (tbVar == null || (aVar = this.f61027c) == null) {
            return;
        }
        za zaVarX = tbVar.x();
        bb.b(zaVarX, "playbackStarted", 1, context);
        String strD = kb.d(context);
        if (strD != null) {
            bb.a(zaVarX, strD, 1, context);
        }
        aVar.b(tbVar);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onCloseByUser(Context context) {
        a aVar;
        tb tbVar = this.f61028d;
        if (tbVar == null || (aVar = this.f61027c) == null) {
            return;
        }
        bb.b(tbVar.x(), "closedByUser", 1, context);
        aVar.a(tbVar);
        this.f61028d = null;
        this.f61029e = null;
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onError(String str, Context context) {
        tb tbVar = this.f61028d;
        if (tbVar == null) {
            return;
        }
        bb.b(tbVar.x(), "playbackError", 1, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onHeaderClick(Context context) {
        c4 c4VarK0;
        tb tbVar = this.f61028d;
        if (tbVar == null || (c4VarK0 = tbVar.k0()) == null) {
            return;
        }
        a4 a4Var = c4VarK0.f59367a;
        bb.b(a4Var.f59108f, "click", 2, context);
        this.f61025a.a(tbVar, a4Var.f59110h, a4Var.f59111i, a4Var.f59109g, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onItemClick(String str, Context context) {
        c4 c4VarK0;
        d4 d4Var;
        tb tbVar = this.f61028d;
        if (tbVar == null || (c4VarK0 = tbVar.k0()) == null) {
            return;
        }
        Iterator it = c4VarK0.f59368b.iterator();
        while (true) {
            if (!it.hasNext()) {
                d4Var = null;
                break;
            } else {
                d4Var = (d4) it.next();
                if (d4Var.f59483a.equals(str)) {
                    break;
                }
            }
        }
        if (d4Var == null) {
            return;
        }
        bb.b(d4Var.f59488f, "click", 2, context);
        d4 d4Var2 = d4Var;
        this.f61025a.a(tbVar, d4Var2.f59492j, d4Var2.f59493k, d4Var2.f59491i, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onItemShow(String str, Context context) {
        tb tbVar;
        c4 c4VarK0;
        d4 d4Var;
        Set set = this.f61029e;
        if (set == null || set.contains(str) || (tbVar = this.f61028d) == null || (c4VarK0 = tbVar.k0()) == null) {
            return;
        }
        Iterator it = c4VarK0.f59368b.iterator();
        while (true) {
            if (!it.hasNext()) {
                d4Var = null;
                break;
            } else {
                d4Var = (d4) it.next();
                if (d4Var.f59483a.equals(str)) {
                    break;
                }
            }
        }
        if (d4Var == null) {
            return;
        }
        this.f61029e.add(str);
        bb.b(d4Var.f59488f, C4424m2.f43623v, 1, context);
    }

    public void a(tb tbVar, InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner) {
        this.f61028d = tbVar;
        this.f61029e = new HashSet();
        InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer = this.f61026b;
        if (instreamAdVideoMotionPlayer != null) {
            instreamAdVideoMotionPlayer.playVideoMotionBanner(instreamAdVideoMotionBanner);
            return;
        }
        gb.a("InstreamVideoMotionController: can't start videoMotionBanner. VideoMotionPlayer is null");
        a aVar = this.f61027c;
        if (aVar == null) {
            return;
        }
        aVar.a(tbVar);
    }

    public void a(a aVar) {
        this.f61027c = aVar;
    }

    public void a(InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        this.f61026b = instreamAdVideoMotionPlayer;
        instreamAdVideoMotionPlayer.setVideoMotionPlayerListener(this);
    }
}
