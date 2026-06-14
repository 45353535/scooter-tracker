package hd;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b implements h {
    public d(List list) {
        super(list);
    }

    @Override // hd.h
    public void onMediaCompleted() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaCompleted();
        }
    }

    @Override // hd.h
    public void onMediaFirstQuartile() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaFirstQuartile();
        }
    }

    @Override // hd.h
    public void onMediaMidpoint() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaMidpoint();
        }
    }

    @Override // hd.h
    public void onMediaPaused() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaPaused();
        }
    }

    @Override // hd.h
    public void onMediaResumed() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaResumed();
        }
    }

    @Override // hd.h
    public void onMediaSkipped() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaSkipped();
        }
    }

    @Override // hd.h
    public void onMediaStarted(float f10, float f11) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaStarted(f10, f11);
        }
    }

    @Override // hd.h
    public void onMediaThirdQuartile() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaThirdQuartile();
        }
    }

    @Override // hd.h
    public void onMediaVolumeChanged(float f10) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onMediaVolumeChanged(f10);
        }
    }
}
