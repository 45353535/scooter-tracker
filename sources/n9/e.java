package n9;

import com.google.common.collect.ImmutableList;
import java.util.List;
import n9.e0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e0.c f95244a = new e0.c();

    protected e() {
    }

    private int h() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void i(int i10) {
        k(-1, -9223372036854775807L, i10, false);
    }

    private void j(int i10) {
        k(getCurrentMediaItemIndex(), -9223372036854775807L, i10, true);
    }

    private void l(long j10, int i10) {
        k(getCurrentMediaItemIndex(), j10, i10, false);
    }

    private void m(int i10, int i11) {
        k(i10, -9223372036854775807L, i11, false);
    }

    private void n(int i10) {
        int iA = a();
        if (iA == -1) {
            i(i10);
        } else if (iA == getCurrentMediaItemIndex()) {
            j(i10);
        } else {
            m(iA, i10);
        }
    }

    private void o(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        l(Math.max(currentPosition, 0L), i10);
    }

    private void p(int i10) {
        int iG = g();
        if (iG == -1) {
            i(i10);
        } else if (iG == getCurrentMediaItemIndex()) {
            j(i10);
        } else {
            m(iG, i10);
        }
    }

    public final int a() {
        e0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.e(getCurrentMediaItemIndex(), h(), getShuffleModeEnabled());
    }

    @Override // n9.a0
    public final void f(r rVar) {
        q(ImmutableList.of(rVar));
    }

    public final int g() {
        e0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.l(getCurrentMediaItemIndex(), h(), getShuffleModeEnabled());
    }

    @Override // n9.a0
    public final long getContentDuration() {
        e0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -9223372036854775807L;
        }
        return currentTimeline.n(getCurrentMediaItemIndex(), this.f95244a).d();
    }

    @Override // n9.a0
    public final boolean hasNextMediaItem() {
        return a() != -1;
    }

    @Override // n9.a0
    public final boolean hasPreviousMediaItem() {
        return g() != -1;
    }

    @Override // n9.a0
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().b(i10);
    }

    @Override // n9.a0
    public final boolean isCurrentMediaItemDynamic() {
        e0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(getCurrentMediaItemIndex(), this.f95244a).f95279i;
    }

    @Override // n9.a0
    public final boolean isCurrentMediaItemLive() {
        e0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(getCurrentMediaItemIndex(), this.f95244a).f();
    }

    @Override // n9.a0
    public final boolean isCurrentMediaItemSeekable() {
        e0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(getCurrentMediaItemIndex(), this.f95244a).f95278h;
    }

    @Override // n9.a0
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    protected abstract void k(int i10, long j10, int i11, boolean z10);

    @Override // n9.a0
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // n9.a0
    public final void play() {
        setPlayWhenReady(true);
    }

    public final void q(List list) {
        setMediaItems(list, true);
    }

    @Override // n9.a0
    public final void seekBack() {
        o(-getSeekBackIncrement(), 11);
    }

    @Override // n9.a0
    public final void seekForward() {
        o(getSeekForwardIncrement(), 12);
    }

    @Override // n9.a0
    public final void seekTo(long j10) {
        l(j10, 5);
    }

    @Override // n9.a0
    public final void seekToDefaultPosition() {
        m(getCurrentMediaItemIndex(), 4);
    }

    @Override // n9.a0
    public final void seekToNext() {
        if (getCurrentTimeline().q() || isPlayingAd()) {
            i(9);
            return;
        }
        if (hasNextMediaItem()) {
            n(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            m(getCurrentMediaItemIndex(), 9);
        } else {
            i(9);
        }
    }

    @Override // n9.a0
    public final void seekToPrevious() {
        if (getCurrentTimeline().q() || isPlayingAd()) {
            i(7);
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                p(7);
                return;
            } else {
                i(7);
                return;
            }
        }
        if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            l(0L, 7);
        } else {
            p(7);
        }
    }

    @Override // n9.a0
    public final void seekTo(int i10, long j10) {
        k(i10, j10, 10, false);
    }
}
