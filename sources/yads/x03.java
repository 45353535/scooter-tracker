package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class x03 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f117668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ze f117669c;

    public x03(TextView textView, ze zeVar) {
        this.f117668b = textView;
        this.f117669c = zeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f117669c.a(this.f117668b);
    }
}
