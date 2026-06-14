package yads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eo implements ml1 {

    @Nullable
    private Looper looper;

    @Nullable
    private wc2 playerId;

    @Nullable
    private f43 timeline;
    private final ArrayList<ll1> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<ll1> enabledMediaSourceCallers = new HashSet<>(1);
    private final ol1 eventDispatcher = new ol1();
    private final jj0 drmEventDispatcher = new jj0();

    @Override // yads.ml1
    public final void addDrmEventListener(Handler handler, kj0 kj0Var) {
        handler.getClass();
        kj0Var.getClass();
        this.drmEventDispatcher.a(handler, kj0Var);
    }

    @Override // yads.ml1
    public final void addEventListener(Handler handler, pl1 pl1Var) {
        handler.getClass();
        pl1Var.getClass();
        this.eventDispatcher.a(handler, pl1Var);
    }

    protected final jj0 createDrmEventDispatcher(int i10, @Nullable kl1 kl1Var) {
        return new jj0(this.drmEventDispatcher.f112364c, i10, kl1Var);
    }

    protected final ol1 createEventDispatcher(int i10, @Nullable kl1 kl1Var, long j10) {
        return new ol1(this.eventDispatcher.f114367c, i10, kl1Var, j10);
    }

    @Override // yads.ml1
    public final void disable(ll1 ll1Var) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(ll1Var);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    protected void disableInternal() {
    }

    @Override // yads.ml1
    public final void enable(ll1 ll1Var) {
        this.looper.getClass();
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(ll1Var);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    protected void enableInternal() {
    }

    @Override // yads.ml1
    public /* synthetic */ f43 getInitialTimeline() {
        return np.a(this);
    }

    protected final wc2 getPlayerId() {
        wc2 wc2Var = this.playerId;
        if (wc2Var != null) {
            return wc2Var;
        }
        throw new IllegalStateException();
    }

    protected final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    @Override // yads.ml1
    public /* synthetic */ boolean isSingleWindow() {
        return np.b(this);
    }

    @Override // yads.ml1
    public final void prepareSource(ll1 ll1Var, @Nullable e63 e63Var, wc2 wc2Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        if (looper != null && looper != looperMyLooper) {
            throw new IllegalArgumentException();
        }
        this.playerId = wc2Var;
        f43 f43Var = this.timeline;
        this.mediaSourceCallers.add(ll1Var);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(ll1Var);
            prepareSourceInternal(e63Var);
        } else if (f43Var != null) {
            enable(ll1Var);
            ll1Var.a(this, f43Var);
        }
    }

    protected abstract void prepareSourceInternal(e63 e63Var);

    protected final void refreshSourceInfo(f43 f43Var) {
        this.timeline = f43Var;
        Iterator<ll1> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().a(this, f43Var);
        }
    }

    @Override // yads.ml1
    public final void releaseSource(ll1 ll1Var) {
        this.mediaSourceCallers.remove(ll1Var);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(ll1Var);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    protected abstract void releaseSourceInternal();

    @Override // yads.ml1
    public final void removeDrmEventListener(kj0 kj0Var) {
        jj0 jj0Var = this.drmEventDispatcher;
        for (ij0 ij0Var : jj0Var.f112364c) {
            if (ij0Var.f112010b == kj0Var) {
                jj0Var.f112364c.remove(ij0Var);
            }
        }
    }

    @Override // yads.ml1
    public final void removeEventListener(pl1 pl1Var) {
        ol1 ol1Var = this.eventDispatcher;
        for (nl1 nl1Var : ol1Var.f114367c) {
            if (nl1Var.f113956b == pl1Var) {
                ol1Var.f114367c.remove(nl1Var);
            }
        }
    }

    protected final jj0 createDrmEventDispatcher(@Nullable kl1 kl1Var) {
        return new jj0(this.drmEventDispatcher.f112364c, 0, kl1Var);
    }

    protected final ol1 createEventDispatcher(@Nullable kl1 kl1Var) {
        return new ol1(this.eventDispatcher.f114367c, 0, kl1Var, 0L);
    }

    protected final ol1 createEventDispatcher(kl1 kl1Var, long j10) {
        kl1Var.getClass();
        return new ol1(this.eventDispatcher.f114367c, 0, kl1Var, j10);
    }
}
