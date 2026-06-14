package com.yandex.div.core.view2.spannable;

import android.view.Choreographer;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.ranges.g;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "Landroid/view/Choreographer$FrameCallback;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "choreographer", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "lastFrameNs", "", "running", "", "spans", "Ljava/util/LinkedHashSet;", "Lcom/yandex/div/core/view2/spannable/MaskSpan;", "Lkotlin/collections/LinkedHashSet;", "doFrame", "", "frameTimeNanos", "resumeIfNeeded", AtomManager.ATOM_STOP_METHOD_NAME, "track", "span", "untrack", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ParticlesTicker implements Choreographer.FrameCallback {
    private long lastFrameNs;
    private boolean running;

    @NotNull
    private final TextView view;
    private final Choreographer choreographer = Choreographer.getInstance();

    @NotNull
    private final LinkedHashSet<MaskSpan> spans = new LinkedHashSet<>();

    public ParticlesTicker(@NotNull TextView textView) {
        this.view = textView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        boolean z10;
        if (this.running) {
            if (this.spans.isEmpty() || !this.view.isShown()) {
                stop();
                return;
            }
            float fM = this.lastFrameNs != 0 ? g.m((frameTimeNanos - r0) * 1.0E-9f, 0.0f, 0.05f) : 0.0f;
            this.lastFrameNs = frameTimeNanos;
            Iterator<MaskSpan> it = this.spans.iterator();
            loop0: while (true) {
                z10 = false;
                while (it.hasNext()) {
                    MaskSpan next = it.next();
                    if (!next.isAlive$div_release()) {
                        it.remove();
                    } else if (next.onFrame$div_release(fM) || z10) {
                        z10 = true;
                    }
                }
            }
            if (this.spans.isEmpty() || !z10) {
                stop();
            } else {
                this.view.postInvalidateOnAnimation();
                this.choreographer.postFrameCallback(this);
            }
        }
    }

    public final void resumeIfNeeded() {
        if (this.running || this.spans.isEmpty() || !this.view.isShown()) {
            return;
        }
        this.running = true;
        this.lastFrameNs = 0L;
        this.choreographer.postFrameCallback(this);
    }

    public final void stop() {
        if (this.running) {
            this.running = false;
            this.choreographer.removeFrameCallback(this);
        }
    }

    public final void track(@NotNull MaskSpan span) {
        this.spans.add(span);
        resumeIfNeeded();
    }

    public final void untrack(@NotNull MaskSpan span) {
        this.spans.remove(span);
        if (this.spans.isEmpty()) {
            stop();
        }
    }
}
