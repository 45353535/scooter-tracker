package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h20 implements sj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBox f111441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f111442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f111443c;

    public h20(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f111441a = checkBox;
        this.f111442b = progressBar;
        this.f111443c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return Intrinsics.areEqual(this.f111441a, h20Var.f111441a) && Intrinsics.areEqual(this.f111442b, h20Var.f111442b) && Intrinsics.areEqual(this.f111443c, h20Var.f111443c);
    }

    @Override // yads.sj1
    public final TextView getCountDownProgress() {
        return this.f111443c;
    }

    @Override // yads.sj1
    public final CheckBox getMuteControl() {
        return this.f111441a;
    }

    @Override // yads.sj1
    public final ProgressBar getVideoProgress() {
        return this.f111442b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f111441a;
        int iHashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f111442b;
        int iHashCode2 = (iHashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f111443c;
        return iHashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f111441a + ", videoProgress=" + this.f111442b + ", countDownProgress=" + this.f111443c + ")";
    }
}
